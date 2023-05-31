// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriMasterLevelDetailInfo.proto

package emu.grasscutter.net.proto;

public final class IrodoriMasterLevelDetailInfoOuterClass {
  private IrodoriMasterLevelDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriMasterLevelDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriMasterLevelDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 min_finish_time = 9;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();

    /**
     * <code>bool is_finish = 14;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>bool is_have_try = 1;</code>
     * @return The isHaveTry.
     */
    boolean getIsHaveTry();

    /**
     * <code>uint32 BNMHJGCJAPB = 10;</code>
     * @return The bNMHJGCJAPB.
     */
    int getBNMHJGCJAPB();
  }
  /**
   * <pre>
   * Obf: ECNEMFHPDMN
   * </pre>
   *
   * Protobuf type {@code IrodoriMasterLevelDetailInfo}
   */
  public static final class IrodoriMasterLevelDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriMasterLevelDetailInfo)
      IrodoriMasterLevelDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriMasterLevelDetailInfo.newBuilder() to construct.
    private IrodoriMasterLevelDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriMasterLevelDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriMasterLevelDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriMasterLevelDetailInfo(
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
            case 8: {

              isHaveTry_ = input.readBool();
              break;
            }
            case 72: {

              minFinishTime_ = input.readUInt32();
              break;
            }
            case 80: {

              bNMHJGCJAPB_ = input.readUInt32();
              break;
            }
            case 112: {

              isFinish_ = input.readBool();
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
      return emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.class, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder.class);
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 9;
    private int minFinishTime_;
    /**
     * <code>uint32 min_finish_time = 9;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 14;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 14;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int IS_HAVE_TRY_FIELD_NUMBER = 1;
    private boolean isHaveTry_;
    /**
     * <code>bool is_have_try = 1;</code>
     * @return The isHaveTry.
     */
    @java.lang.Override
    public boolean getIsHaveTry() {
      return isHaveTry_;
    }

    public static final int BNMHJGCJAPB_FIELD_NUMBER = 10;
    private int bNMHJGCJAPB_;
    /**
     * <code>uint32 BNMHJGCJAPB = 10;</code>
     * @return The bNMHJGCJAPB.
     */
    @java.lang.Override
    public int getBNMHJGCJAPB() {
      return bNMHJGCJAPB_;
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
      if (isHaveTry_ != false) {
        output.writeBool(1, isHaveTry_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(9, minFinishTime_);
      }
      if (bNMHJGCJAPB_ != 0) {
        output.writeUInt32(10, bNMHJGCJAPB_);
      }
      if (isFinish_ != false) {
        output.writeBool(14, isFinish_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHaveTry_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isHaveTry_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, minFinishTime_);
      }
      if (bNMHJGCJAPB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, bNMHJGCJAPB_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isFinish_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo other = (emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo) obj;

      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getIsHaveTry()
          != other.getIsHaveTry()) return false;
      if (getBNMHJGCJAPB()
          != other.getBNMHJGCJAPB()) return false;
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
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + IS_HAVE_TRY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHaveTry());
      hash = (37 * hash) + BNMHJGCJAPB_FIELD_NUMBER;
      hash = (53 * hash) + getBNMHJGCJAPB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo prototype) {
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
     * Obf: ECNEMFHPDMN
     * </pre>
     *
     * Protobuf type {@code IrodoriMasterLevelDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriMasterLevelDetailInfo)
        emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.class, emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.newBuilder()
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
        minFinishTime_ = 0;

        isFinish_ = false;

        isHaveTry_ = false;

        bNMHJGCJAPB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo build() {
        emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo buildPartial() {
        emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo result = new emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo(this);
        result.minFinishTime_ = minFinishTime_;
        result.isFinish_ = isFinish_;
        result.isHaveTry_ = isHaveTry_;
        result.bNMHJGCJAPB_ = bNMHJGCJAPB_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo other) {
        if (other == emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.getDefaultInstance()) return this;
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getIsHaveTry() != false) {
          setIsHaveTry(other.getIsHaveTry());
        }
        if (other.getBNMHJGCJAPB() != 0) {
          setBNMHJGCJAPB(other.getBNMHJGCJAPB());
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
        emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 9;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 9;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {
        
        minFinishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 14;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 14;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private boolean isHaveTry_ ;
      /**
       * <code>bool is_have_try = 1;</code>
       * @return The isHaveTry.
       */
      @java.lang.Override
      public boolean getIsHaveTry() {
        return isHaveTry_;
      }
      /**
       * <code>bool is_have_try = 1;</code>
       * @param value The isHaveTry to set.
       * @return This builder for chaining.
       */
      public Builder setIsHaveTry(boolean value) {
        
        isHaveTry_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_have_try = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHaveTry() {
        
        isHaveTry_ = false;
        onChanged();
        return this;
      }

      private int bNMHJGCJAPB_ ;
      /**
       * <code>uint32 BNMHJGCJAPB = 10;</code>
       * @return The bNMHJGCJAPB.
       */
      @java.lang.Override
      public int getBNMHJGCJAPB() {
        return bNMHJGCJAPB_;
      }
      /**
       * <code>uint32 BNMHJGCJAPB = 10;</code>
       * @param value The bNMHJGCJAPB to set.
       * @return This builder for chaining.
       */
      public Builder setBNMHJGCJAPB(int value) {
        
        bNMHJGCJAPB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BNMHJGCJAPB = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBNMHJGCJAPB() {
        
        bNMHJGCJAPB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriMasterLevelDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:IrodoriMasterLevelDetailInfo)
    private static final emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo();
    }

    public static emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriMasterLevelDetailInfo>() {
      @java.lang.Override
      public IrodoriMasterLevelDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriMasterLevelDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriMasterLevelDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"IrodoriMasterLevelDetailInfo.proto\"t\n\034" +
      "IrodoriMasterLevelDetailInfo\022\027\n\017min_fini" +
      "sh_time\030\t \001(\r\022\021\n\tis_finish\030\016 \001(\010\022\023\n\013is_h" +
      "ave_try\030\001 \001(\010\022\023\n\013BNMHJGCJAPB\030\n \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriMasterLevelDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriMasterLevelDetailInfo_descriptor,
        new java.lang.String[] { "MinFinishTime", "IsFinish", "IsHaveTry", "BNMHJGCJAPB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
