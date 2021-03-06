// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omnicontracts.proto

package ch.epfl.dedis.proto;

public final class OmniLedgerContracts {
  private OmniLedgerContracts() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinInstanceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:omnicontracts.CoinInstance)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Type denotes what coin this is. Every coin can have a type, and only
     * compatible coins can be directly transferred. For incompatible coins,
     * you need an exchange (not yet implemented).
     * </pre>
     *
     * <code>required bytes type = 1;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * Type denotes what coin this is. Every coin can have a type, and only
     * compatible coins can be directly transferred. For incompatible coins,
     * you need an exchange (not yet implemented).
     * </pre>
     *
     * <code>required bytes type = 1;</code>
     */
    com.google.protobuf.ByteString getType();

    /**
     * <pre>
     * Balance holds how many coins are stored in this account. It can only
     * be positive.
     * </pre>
     *
     * <code>required uint64 balance = 2;</code>
     */
    boolean hasBalance();
    /**
     * <pre>
     * Balance holds how many coins are stored in this account. It can only
     * be positive.
     * </pre>
     *
     * <code>required uint64 balance = 2;</code>
     */
    long getBalance();
  }
  /**
   * <pre>
   * CoinInstance represents the data stored for a coin-account. It holds the
   * type of the coin and the actual balance, which is always positive.
   * </pre>
   *
   * Protobuf type {@code omnicontracts.CoinInstance}
   */
  public  static final class CoinInstance extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:omnicontracts.CoinInstance)
      CoinInstanceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinInstance.newBuilder() to construct.
    private CoinInstance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinInstance() {
      type_ = com.google.protobuf.ByteString.EMPTY;
      balance_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoinInstance(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              type_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              balance_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ch.epfl.dedis.proto.OmniLedgerContracts.internal_static_omnicontracts_CoinInstance_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ch.epfl.dedis.proto.OmniLedgerContracts.internal_static_omnicontracts_CoinInstance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance.class, ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString type_;
    /**
     * <pre>
     * Type denotes what coin this is. Every coin can have a type, and only
     * compatible coins can be directly transferred. For incompatible coins,
     * you need an exchange (not yet implemented).
     * </pre>
     *
     * <code>required bytes type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Type denotes what coin this is. Every coin can have a type, and only
     * compatible coins can be directly transferred. For incompatible coins,
     * you need an exchange (not yet implemented).
     * </pre>
     *
     * <code>required bytes type = 1;</code>
     */
    public com.google.protobuf.ByteString getType() {
      return type_;
    }

    public static final int BALANCE_FIELD_NUMBER = 2;
    private long balance_;
    /**
     * <pre>
     * Balance holds how many coins are stored in this account. It can only
     * be positive.
     * </pre>
     *
     * <code>required uint64 balance = 2;</code>
     */
    public boolean hasBalance() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * Balance holds how many coins are stored in this account. It can only
     * be positive.
     * </pre>
     *
     * <code>required uint64 balance = 2;</code>
     */
    public long getBalance() {
      return balance_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBalance()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, balance_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, balance_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance)) {
        return super.equals(obj);
      }
      ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance other = (ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType()
            .equals(other.getType());
      }
      result = result && (hasBalance() == other.hasBalance());
      if (hasBalance()) {
        result = result && (getBalance()
            == other.getBalance());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasBalance()) {
        hash = (37 * hash) + BALANCE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getBalance());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CoinInstance represents the data stored for a coin-account. It holds the
     * type of the coin and the actual balance, which is always positive.
     * </pre>
     *
     * Protobuf type {@code omnicontracts.CoinInstance}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:omnicontracts.CoinInstance)
        ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstanceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ch.epfl.dedis.proto.OmniLedgerContracts.internal_static_omnicontracts_CoinInstance_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ch.epfl.dedis.proto.OmniLedgerContracts.internal_static_omnicontracts_CoinInstance_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance.class, ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance.Builder.class);
      }

      // Construct using ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        type_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        balance_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ch.epfl.dedis.proto.OmniLedgerContracts.internal_static_omnicontracts_CoinInstance_descriptor;
      }

      public ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance getDefaultInstanceForType() {
        return ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance.getDefaultInstance();
      }

      public ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance build() {
        ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance buildPartial() {
        ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance result = new ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.balance_ = balance_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance) {
          return mergeFrom((ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance other) {
        if (other == ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasBalance()) {
          setBalance(other.getBalance());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        if (!hasBalance()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString type_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Type denotes what coin this is. Every coin can have a type, and only
       * compatible coins can be directly transferred. For incompatible coins,
       * you need an exchange (not yet implemented).
       * </pre>
       *
       * <code>required bytes type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       * Type denotes what coin this is. Every coin can have a type, and only
       * compatible coins can be directly transferred. For incompatible coins,
       * you need an exchange (not yet implemented).
       * </pre>
       *
       * <code>required bytes type = 1;</code>
       */
      public com.google.protobuf.ByteString getType() {
        return type_;
      }
      /**
       * <pre>
       * Type denotes what coin this is. Every coin can have a type, and only
       * compatible coins can be directly transferred. For incompatible coins,
       * you need an exchange (not yet implemented).
       * </pre>
       *
       * <code>required bytes type = 1;</code>
       */
      public Builder setType(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type denotes what coin this is. Every coin can have a type, and only
       * compatible coins can be directly transferred. For incompatible coins,
       * you need an exchange (not yet implemented).
       * </pre>
       *
       * <code>required bytes type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }

      private long balance_ ;
      /**
       * <pre>
       * Balance holds how many coins are stored in this account. It can only
       * be positive.
       * </pre>
       *
       * <code>required uint64 balance = 2;</code>
       */
      public boolean hasBalance() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <pre>
       * Balance holds how many coins are stored in this account. It can only
       * be positive.
       * </pre>
       *
       * <code>required uint64 balance = 2;</code>
       */
      public long getBalance() {
        return balance_;
      }
      /**
       * <pre>
       * Balance holds how many coins are stored in this account. It can only
       * be positive.
       * </pre>
       *
       * <code>required uint64 balance = 2;</code>
       */
      public Builder setBalance(long value) {
        bitField0_ |= 0x00000002;
        balance_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Balance holds how many coins are stored in this account. It can only
       * be positive.
       * </pre>
       *
       * <code>required uint64 balance = 2;</code>
       */
      public Builder clearBalance() {
        bitField0_ = (bitField0_ & ~0x00000002);
        balance_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:omnicontracts.CoinInstance)
    }

    // @@protoc_insertion_point(class_scope:omnicontracts.CoinInstance)
    private static final ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance();
    }

    public static ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CoinInstance>
        PARSER = new com.google.protobuf.AbstractParser<CoinInstance>() {
      public CoinInstance parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CoinInstance(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoinInstance> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinInstance> getParserForType() {
      return PARSER;
    }

    public ch.epfl.dedis.proto.OmniLedgerContracts.CoinInstance getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_omnicontracts_CoinInstance_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_omnicontracts_CoinInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023omnicontracts.proto\022\romnicontracts\"-\n\014" +
      "CoinInstance\022\014\n\004type\030\001 \002(\014\022\017\n\007balance\030\002 " +
      "\002(\004B*\n\023ch.epfl.dedis.protoB\023OmniLedgerCo" +
      "ntracts"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_omnicontracts_CoinInstance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_omnicontracts_CoinInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_omnicontracts_CoinInstance_descriptor,
        new java.lang.String[] { "Type", "Balance", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
