// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterV2SettleInfo.proto

package emu.grasscutter.net.proto;

public final class FungusFighterV2SettleInfoOuterClass {
  private FungusFighterV2SettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterV2SettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterV2SettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 EEJCKKKEBOK = 5;</code>
     * @return The eEJCKKKEBOK.
     */
    int getEEJCKKKEBOK();

    /**
     * <code>uint32 cost_time = 2;</code>
     * @return The costTime.
     */
    int getCostTime();

    /**
     * <code>bool is_new_record = 11;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 KDCKPCGPNNG = 8;</code>
     * @return The kDCKPCGPNNG.
     */
    int getKDCKPCGPNNG();

    /**
     * <code>uint32 BKEAHJGOMEB = 13;</code>
     * @return The bKEAHJGOMEB.
     */
    int getBKEAHJGOMEB();
  }
  /**
   * <pre>
   * Obf: PFFEBPCHBHP
   * </pre>
   *
   * Protobuf type {@code FungusFighterV2SettleInfo}
   */
  public static final class FungusFighterV2SettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterV2SettleInfo)
      FungusFighterV2SettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterV2SettleInfo.newBuilder() to construct.
    private FungusFighterV2SettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterV2SettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterV2SettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusFighterV2SettleInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              costTime_ = input.readUInt32();
              break;
            }
            case 40: {

              eEJCKKKEBOK_ = input.readUInt32();
              break;
            }
            case 48: {

              levelId_ = input.readUInt32();
              break;
            }
            case 64: {

              kDCKPCGPNNG_ = input.readUInt32();
              break;
            }
            case 88: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 104: {

              bKEAHJGOMEB_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.internal_static_FungusFighterV2SettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.internal_static_FungusFighterV2SettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo.class, emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 6;
    private int levelId_;
    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int EEJCKKKEBOK_FIELD_NUMBER = 5;
    private int eEJCKKKEBOK_;
    /**
     * <code>uint32 EEJCKKKEBOK = 5;</code>
     * @return The eEJCKKKEBOK.
     */
    @java.lang.Override
    public int getEEJCKKKEBOK() {
      return eEJCKKKEBOK_;
    }

    public static final int COST_TIME_FIELD_NUMBER = 2;
    private int costTime_;
    /**
     * <code>uint32 cost_time = 2;</code>
     * @return The costTime.
     */
    @java.lang.Override
    public int getCostTime() {
      return costTime_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 11;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 11;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int KDCKPCGPNNG_FIELD_NUMBER = 8;
    private int kDCKPCGPNNG_;
    /**
     * <code>uint32 KDCKPCGPNNG = 8;</code>
     * @return The kDCKPCGPNNG.
     */
    @java.lang.Override
    public int getKDCKPCGPNNG() {
      return kDCKPCGPNNG_;
    }

    public static final int BKEAHJGOMEB_FIELD_NUMBER = 13;
    private int bKEAHJGOMEB_;
    /**
     * <code>uint32 BKEAHJGOMEB = 13;</code>
     * @return The bKEAHJGOMEB.
     */
    @java.lang.Override
    public int getBKEAHJGOMEB() {
      return bKEAHJGOMEB_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (costTime_ != 0) {
        output.writeUInt32(2, costTime_);
      }
      if (eEJCKKKEBOK_ != 0) {
        output.writeUInt32(5, eEJCKKKEBOK_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(6, levelId_);
      }
      if (kDCKPCGPNNG_ != 0) {
        output.writeUInt32(8, kDCKPCGPNNG_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(11, isNewRecord_);
      }
      if (bKEAHJGOMEB_ != 0) {
        output.writeUInt32(13, bKEAHJGOMEB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, costTime_);
      }
      if (eEJCKKKEBOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, eEJCKKKEBOK_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, levelId_);
      }
      if (kDCKPCGPNNG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, kDCKPCGPNNG_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isNewRecord_);
      }
      if (bKEAHJGOMEB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, bKEAHJGOMEB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo other = (emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getEEJCKKKEBOK()
          != other.getEEJCKKKEBOK()) return false;
      if (getCostTime()
          != other.getCostTime()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getKDCKPCGPNNG()
          != other.getKDCKPCGPNNG()) return false;
      if (getBKEAHJGOMEB()
          != other.getBKEAHJGOMEB()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + EEJCKKKEBOK_FIELD_NUMBER;
      hash = (53 * hash) + getEEJCKKKEBOK();
      hash = (37 * hash) + COST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCostTime();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + KDCKPCGPNNG_FIELD_NUMBER;
      hash = (53 * hash) + getKDCKPCGPNNG();
      hash = (37 * hash) + BKEAHJGOMEB_FIELD_NUMBER;
      hash = (53 * hash) + getBKEAHJGOMEB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Obf: PFFEBPCHBHP
     * </pre>
     *
     * Protobuf type {@code FungusFighterV2SettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterV2SettleInfo)
        emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.internal_static_FungusFighterV2SettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.internal_static_FungusFighterV2SettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo.class, emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelId_ = 0;

        eEJCKKKEBOK_ = 0;

        costTime_ = 0;

        isNewRecord_ = false;

        kDCKPCGPNNG_ = 0;

        bKEAHJGOMEB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.internal_static_FungusFighterV2SettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo build() {
        emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo buildPartial() {
        emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo result = new emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo(this);
        result.levelId_ = levelId_;
        result.eEJCKKKEBOK_ = eEJCKKKEBOK_;
        result.costTime_ = costTime_;
        result.isNewRecord_ = isNewRecord_;
        result.kDCKPCGPNNG_ = kDCKPCGPNNG_;
        result.bKEAHJGOMEB_ = bKEAHJGOMEB_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo other) {
        if (other == emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getEEJCKKKEBOK() != 0) {
          setEEJCKKKEBOK(other.getEEJCKKKEBOK());
        }
        if (other.getCostTime() != 0) {
          setCostTime(other.getCostTime());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getKDCKPCGPNNG() != 0) {
          setKDCKPCGPNNG(other.getKDCKPCGPNNG());
        }
        if (other.getBKEAHJGOMEB() != 0) {
          setBKEAHJGOMEB(other.getBKEAHJGOMEB());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 6;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int eEJCKKKEBOK_ ;
      /**
       * <code>uint32 EEJCKKKEBOK = 5;</code>
       * @return The eEJCKKKEBOK.
       */
      @java.lang.Override
      public int getEEJCKKKEBOK() {
        return eEJCKKKEBOK_;
      }
      /**
       * <code>uint32 EEJCKKKEBOK = 5;</code>
       * @param value The eEJCKKKEBOK to set.
       * @return This builder for chaining.
       */
      public Builder setEEJCKKKEBOK(int value) {
        
        eEJCKKKEBOK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EEJCKKKEBOK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEEJCKKKEBOK() {
        
        eEJCKKKEBOK_ = 0;
        onChanged();
        return this;
      }

      private int costTime_ ;
      /**
       * <code>uint32 cost_time = 2;</code>
       * @return The costTime.
       */
      @java.lang.Override
      public int getCostTime() {
        return costTime_;
      }
      /**
       * <code>uint32 cost_time = 2;</code>
       * @param value The costTime to set.
       * @return This builder for chaining.
       */
      public Builder setCostTime(int value) {
        
        costTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostTime() {
        
        costTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 11;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 11;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int kDCKPCGPNNG_ ;
      /**
       * <code>uint32 KDCKPCGPNNG = 8;</code>
       * @return The kDCKPCGPNNG.
       */
      @java.lang.Override
      public int getKDCKPCGPNNG() {
        return kDCKPCGPNNG_;
      }
      /**
       * <code>uint32 KDCKPCGPNNG = 8;</code>
       * @param value The kDCKPCGPNNG to set.
       * @return This builder for chaining.
       */
      public Builder setKDCKPCGPNNG(int value) {
        
        kDCKPCGPNNG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KDCKPCGPNNG = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearKDCKPCGPNNG() {
        
        kDCKPCGPNNG_ = 0;
        onChanged();
        return this;
      }

      private int bKEAHJGOMEB_ ;
      /**
       * <code>uint32 BKEAHJGOMEB = 13;</code>
       * @return The bKEAHJGOMEB.
       */
      @java.lang.Override
      public int getBKEAHJGOMEB() {
        return bKEAHJGOMEB_;
      }
      /**
       * <code>uint32 BKEAHJGOMEB = 13;</code>
       * @param value The bKEAHJGOMEB to set.
       * @return This builder for chaining.
       */
      public Builder setBKEAHJGOMEB(int value) {
        
        bKEAHJGOMEB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BKEAHJGOMEB = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBKEAHJGOMEB() {
        
        bKEAHJGOMEB_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FungusFighterV2SettleInfo)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterV2SettleInfo)
    private static final emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo();
    }

    public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterV2SettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterV2SettleInfo>() {
      @java.lang.Override
      public FungusFighterV2SettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusFighterV2SettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusFighterV2SettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterV2SettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterV2SettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterV2SettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037FungusFighterV2SettleInfo.proto\"\226\001\n\031Fu" +
      "ngusFighterV2SettleInfo\022\020\n\010level_id\030\006 \001(" +
      "\r\022\023\n\013EEJCKKKEBOK\030\005 \001(\r\022\021\n\tcost_time\030\002 \001(" +
      "\r\022\025\n\ris_new_record\030\013 \001(\010\022\023\n\013KDCKPCGPNNG\030" +
      "\010 \001(\r\022\023\n\013BKEAHJGOMEB\030\r \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterV2SettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterV2SettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterV2SettleInfo_descriptor,
        new java.lang.String[] { "LevelId", "EEJCKKKEBOK", "CostTime", "IsNewRecord", "KDCKPCGPNNG", "BKEAHJGOMEB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
