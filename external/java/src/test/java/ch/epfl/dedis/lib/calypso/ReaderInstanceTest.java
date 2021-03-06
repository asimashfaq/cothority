package ch.epfl.dedis.lib.calypso;

import ch.epfl.dedis.integration.TestServerController;
import ch.epfl.dedis.integration.TestServerInit;
import ch.epfl.dedis.lib.exception.CothorityCommunicationException;
import ch.epfl.dedis.lib.omniledger.OmniledgerRPC;
import ch.epfl.dedis.lib.omniledger.darc.Darc;
import ch.epfl.dedis.lib.omniledger.darc.Rules;
import ch.epfl.dedis.lib.omniledger.darc.Signer;
import ch.epfl.dedis.lib.omniledger.darc.SignerEd25519;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;

import static java.time.temporal.ChronoUnit.MILLIS;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReaderInstanceTest {
    private OmniledgerRPC ol;
    private WriterInstance w;
    private ReaderInstance r;
    private Signer admin;
    private Darc genesisDarc;

    private final static Logger logger = LoggerFactory.getLogger(WriterInstanceTest.class);
    private TestServerController testInstanceController;

    @BeforeEach
    void initAll() throws Exception {
        testInstanceController = TestServerInit.getInstance();
        admin = new SignerEd25519();
        Rules rules = Darc.initRules(Arrays.asList(admin.getIdentity()),
                Arrays.asList(admin.getIdentity()));
        rules.addRule("spawn:calypsoWrite", admin.getIdentity().toString().getBytes());
        rules.addRule("spawn:calypsoRead", admin.getIdentity().toString().getBytes());
        genesisDarc = new Darc(rules, "genesis".getBytes());

        ol = new OmniledgerRPC(testInstanceController.getRoster(), genesisDarc, Duration.of(500, MILLIS));
        if (!ol.checkLiveness()) {
            throw new CothorityCommunicationException("liveness check failed");
        }

        CreateLTSReply ltsReply = CalypsoRPC.createLTS(ol.getRoster(), ol.getGenesis().getId());
        String secret = "this is a secret";
        WriteRequest wr = new WriteRequest(secret, 16, genesisDarc.getId());
        w = new WriterInstance(ol, Arrays.asList(admin), genesisDarc.getId(), ltsReply, wr);
        assertTrue(ol.getProof(w.getInstance().getId()).matches());

        ReadRequest rr = new ReadRequest(w.getInstance().getId(), admin.getPublic());
        r = new ReaderInstance(ol, Arrays.asList(admin), genesisDarc.getId(), rr);
        assertTrue(ol.getProof(r.getInstance().getId()).matches());
    }

    @Test
    void testCopyReader() throws Exception {
        ReaderInstance r2 = new ReaderInstance(ol, r.getInstance().getId());
        assertTrue(ol.getProof(r2.getInstance().getId()).matches());
    }

}