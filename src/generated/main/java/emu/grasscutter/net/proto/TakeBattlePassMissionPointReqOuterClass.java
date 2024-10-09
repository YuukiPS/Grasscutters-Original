// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeBattlePassMissionPointReq.proto

package emu.grasscutter.net.proto;

public final class TakeBattlePassMissionPointReqOuterClass {
  private TakeBattlePassMissionPointReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeBattlePassMissionPointReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeBattlePassMissionPointReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 mission_id_list = 10;</code>
     * @return A list containing the missionIdList.
     */
    java.util.List<java.lang.Integer> getMissionIdListList();
    /**
     * <code>repeated uint32 mission_id_list = 10;</code>
     * @return The count of missionIdList.
     */
    int getMissionIdListCount();
    /**
     * <code>repeated uint32 mission_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The missionIdList at the given index.
     */
    int getMissionIdList(int index);
  }
  /**
   * Protobuf type {@code TakeBattlePassMissionPointReq}
   */
  public static final class TakeBattlePassMissionPointReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeBattlePassMissionPointReq)
      TakeBattlePassMissionPointReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeBattlePassMissionPointReq.newBuilder() to construct.
    private TakeBattlePassMissionPointReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeBattlePassMissionPointReq() {
      missionIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeBattlePassMissionPointReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeBattlePassMissionPointReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                missionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              missionIdList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                missionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                missionIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          missionIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq.class, emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq.Builder.class);
    }

    public static final int MISSION_ID_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList missionIdList_;
    /**
     * <code>repeated uint32 mission_id_list = 10;</code>
     * @return A list containing the missionIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMissionIdListList() {
      return missionIdList_;
    }
    /**
     * <code>repeated uint32 mission_id_list = 10;</code>
     * @return The count of missionIdList.
     */
    public int getMissionIdListCount() {
      return missionIdList_.size();
    }
    /**
     * <code>repeated uint32 mission_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The missionIdList at the given index.
     */
    public int getMissionIdList(int index) {
      return missionIdList_.getInt(index);
    }
    private int missionIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getMissionIdListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(missionIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < missionIdList_.size(); i++) {
        output.writeUInt32NoTag(missionIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < missionIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(missionIdList_.getInt(i));
        }
        size += dataSize;
        if (!getMissionIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        missionIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq other = (emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq) obj;

      if (!getMissionIdListList()
          .equals(other.getMissionIdListList())) return false;
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
      if (getMissionIdListCount() > 0) {
        hash = (37 * hash) + MISSION_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMissionIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq prototype) {
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
     * Protobuf type {@code TakeBattlePassMissionPointReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeBattlePassMissionPointReq)
        emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq.class, emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq.newBuilder()
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
        missionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq build() {
        emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq buildPartial() {
        emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq result = new emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          missionIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.missionIdList_ = missionIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq other) {
        if (other == emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq.getDefaultInstance()) return this;
        if (!other.missionIdList_.isEmpty()) {
          if (missionIdList_.isEmpty()) {
            missionIdList_ = other.missionIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMissionIdListIsMutable();
            missionIdList_.addAll(other.missionIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList missionIdList_ = emptyIntList();
      private void ensureMissionIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          missionIdList_ = mutableCopy(missionIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 mission_id_list = 10;</code>
       * @return A list containing the missionIdList.
       */
      public java.util.List<java.lang.Integer>
          getMissionIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(missionIdList_) : missionIdList_;
      }
      /**
       * <code>repeated uint32 mission_id_list = 10;</code>
       * @return The count of missionIdList.
       */
      public int getMissionIdListCount() {
        return missionIdList_.size();
      }
      /**
       * <code>repeated uint32 mission_id_list = 10;</code>
       * @param index The index of the element to return.
       * @return The missionIdList at the given index.
       */
      public int getMissionIdList(int index) {
        return missionIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 mission_id_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The missionIdList to set.
       * @return This builder for chaining.
       */
      public Builder setMissionIdList(
          int index, int value) {
        ensureMissionIdListIsMutable();
        missionIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mission_id_list = 10;</code>
       * @param value The missionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addMissionIdList(int value) {
        ensureMissionIdListIsMutable();
        missionIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mission_id_list = 10;</code>
       * @param values The missionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMissionIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMissionIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, missionIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mission_id_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMissionIdList() {
        missionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:TakeBattlePassMissionPointReq)
    }

    // @@protoc_insertion_point(class_scope:TakeBattlePassMissionPointReq)
    private static final emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq();
    }

    public static emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeBattlePassMissionPointReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeBattlePassMissionPointReq>() {
      @java.lang.Override
      public TakeBattlePassMissionPointReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeBattlePassMissionPointReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeBattlePassMissionPointReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeBattlePassMissionPointReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeBattlePassMissionPointReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeBattlePassMissionPointReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#TakeBattlePassMissionPointReq.proto\"8\n" +
      "\035TakeBattlePassMissionPointReq\022\027\n\017missio" +
      "n_id_list\030\n \003(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeBattlePassMissionPointReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeBattlePassMissionPointReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeBattlePassMissionPointReq_descriptor,
        new java.lang.String[] { "MissionIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
