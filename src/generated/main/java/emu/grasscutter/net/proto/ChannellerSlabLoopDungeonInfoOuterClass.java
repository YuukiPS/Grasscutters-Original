// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannellerSlabLoopDungeonInfo.proto

package emu.grasscutter.net.proto;

public final class ChannellerSlabLoopDungeonInfoOuterClass {
  private ChannellerSlabLoopDungeonInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannellerSlabLoopDungeonInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannellerSlabLoopDungeonInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 dungeon_index = 2;</code>
     * @return The dungeonIndex.
     */
    int getDungeonIndex();

    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>repeated uint32 last_condition_id_list = 9;</code>
     * @return A list containing the lastConditionIdList.
     */
    java.util.List<java.lang.Integer> getLastConditionIdListList();
    /**
     * <code>repeated uint32 last_condition_id_list = 9;</code>
     * @return The count of lastConditionIdList.
     */
    int getLastConditionIdListCount();
    /**
     * <code>repeated uint32 last_condition_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The lastConditionIdList at the given index.
     */
    int getLastConditionIdList(int index);

    /**
     * <code>uint32 open_time = 13;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_first_pass_reward_taken = 15;</code>
     * @return The isFirstPassRewardTaken.
     */
    boolean getIsFirstPassRewardTaken();
  }
  /**
   * <pre>
   * Obf: OOAOCDJBACD
   * </pre>
   *
   * Protobuf type {@code ChannellerSlabLoopDungeonInfo}
   */
  public static final class ChannellerSlabLoopDungeonInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannellerSlabLoopDungeonInfo)
      ChannellerSlabLoopDungeonInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannellerSlabLoopDungeonInfo.newBuilder() to construct.
    private ChannellerSlabLoopDungeonInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannellerSlabLoopDungeonInfo() {
      lastConditionIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannellerSlabLoopDungeonInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannellerSlabLoopDungeonInfo(
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
            case 16: {

              dungeonIndex_ = input.readUInt32();
              break;
            }
            case 40: {

              score_ = input.readUInt32();
              break;
            }
            case 64: {

              isOpen_ = input.readBool();
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                lastConditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              lastConditionIdList_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                lastConditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                lastConditionIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {

              openTime_ = input.readUInt32();
              break;
            }
            case 120: {

              isFirstPassRewardTaken_ = input.readBool();
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
          lastConditionIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.internal_static_ChannellerSlabLoopDungeonInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.internal_static_ChannellerSlabLoopDungeonInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo.class, emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 8;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int DUNGEON_INDEX_FIELD_NUMBER = 2;
    private int dungeonIndex_;
    /**
     * <code>uint32 dungeon_index = 2;</code>
     * @return The dungeonIndex.
     */
    @java.lang.Override
    public int getDungeonIndex() {
      return dungeonIndex_;
    }

    public static final int SCORE_FIELD_NUMBER = 5;
    private int score_;
    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int LAST_CONDITION_ID_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList lastConditionIdList_;
    /**
     * <code>repeated uint32 last_condition_id_list = 9;</code>
     * @return A list containing the lastConditionIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLastConditionIdListList() {
      return lastConditionIdList_;
    }
    /**
     * <code>repeated uint32 last_condition_id_list = 9;</code>
     * @return The count of lastConditionIdList.
     */
    public int getLastConditionIdListCount() {
      return lastConditionIdList_.size();
    }
    /**
     * <code>repeated uint32 last_condition_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The lastConditionIdList at the given index.
     */
    public int getLastConditionIdList(int index) {
      return lastConditionIdList_.getInt(index);
    }
    private int lastConditionIdListMemoizedSerializedSize = -1;

    public static final int OPEN_TIME_FIELD_NUMBER = 13;
    private int openTime_;
    /**
     * <code>uint32 open_time = 13;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_FIRST_PASS_REWARD_TAKEN_FIELD_NUMBER = 15;
    private boolean isFirstPassRewardTaken_;
    /**
     * <code>bool is_first_pass_reward_taken = 15;</code>
     * @return The isFirstPassRewardTaken.
     */
    @java.lang.Override
    public boolean getIsFirstPassRewardTaken() {
      return isFirstPassRewardTaken_;
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
      getSerializedSize();
      if (dungeonIndex_ != 0) {
        output.writeUInt32(2, dungeonIndex_);
      }
      if (score_ != 0) {
        output.writeUInt32(5, score_);
      }
      if (isOpen_ != false) {
        output.writeBool(8, isOpen_);
      }
      if (getLastConditionIdListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(lastConditionIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < lastConditionIdList_.size(); i++) {
        output.writeUInt32NoTag(lastConditionIdList_.getInt(i));
      }
      if (openTime_ != 0) {
        output.writeUInt32(13, openTime_);
      }
      if (isFirstPassRewardTaken_ != false) {
        output.writeBool(15, isFirstPassRewardTaken_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dungeonIndex_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, score_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isOpen_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < lastConditionIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(lastConditionIdList_.getInt(i));
        }
        size += dataSize;
        if (!getLastConditionIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        lastConditionIdListMemoizedSerializedSize = dataSize;
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, openTime_);
      }
      if (isFirstPassRewardTaken_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isFirstPassRewardTaken_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo other = (emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getDungeonIndex()
          != other.getDungeonIndex()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (!getLastConditionIdListList()
          .equals(other.getLastConditionIdListList())) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsFirstPassRewardTaken()
          != other.getIsFirstPassRewardTaken()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + DUNGEON_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonIndex();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      if (getLastConditionIdListCount() > 0) {
        hash = (37 * hash) + LAST_CONDITION_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLastConditionIdListList().hashCode();
      }
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_FIRST_PASS_REWARD_TAKEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFirstPassRewardTaken());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo prototype) {
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
     * Obf: OOAOCDJBACD
     * </pre>
     *
     * Protobuf type {@code ChannellerSlabLoopDungeonInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannellerSlabLoopDungeonInfo)
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.internal_static_ChannellerSlabLoopDungeonInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.internal_static_ChannellerSlabLoopDungeonInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo.class, emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo.newBuilder()
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
        isOpen_ = false;

        dungeonIndex_ = 0;

        score_ = 0;

        lastConditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        openTime_ = 0;

        isFirstPassRewardTaken_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.internal_static_ChannellerSlabLoopDungeonInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo build() {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo buildPartial() {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo result = new emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo(this);
        int from_bitField0_ = bitField0_;
        result.isOpen_ = isOpen_;
        result.dungeonIndex_ = dungeonIndex_;
        result.score_ = score_;
        if (((bitField0_ & 0x00000001) != 0)) {
          lastConditionIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lastConditionIdList_ = lastConditionIdList_;
        result.openTime_ = openTime_;
        result.isFirstPassRewardTaken_ = isFirstPassRewardTaken_;
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
        if (other instanceof emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo other) {
        if (other == emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getDungeonIndex() != 0) {
          setDungeonIndex(other.getDungeonIndex());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (!other.lastConditionIdList_.isEmpty()) {
          if (lastConditionIdList_.isEmpty()) {
            lastConditionIdList_ = other.lastConditionIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLastConditionIdListIsMutable();
            lastConditionIdList_.addAll(other.lastConditionIdList_);
          }
          onChanged();
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsFirstPassRewardTaken() != false) {
          setIsFirstPassRewardTaken(other.getIsFirstPassRewardTaken());
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
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 8;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int dungeonIndex_ ;
      /**
       * <code>uint32 dungeon_index = 2;</code>
       * @return The dungeonIndex.
       */
      @java.lang.Override
      public int getDungeonIndex() {
        return dungeonIndex_;
      }
      /**
       * <code>uint32 dungeon_index = 2;</code>
       * @param value The dungeonIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonIndex(int value) {
        
        dungeonIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_index = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonIndex() {
        
        dungeonIndex_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 5;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList lastConditionIdList_ = emptyIntList();
      private void ensureLastConditionIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          lastConditionIdList_ = mutableCopy(lastConditionIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 last_condition_id_list = 9;</code>
       * @return A list containing the lastConditionIdList.
       */
      public java.util.List<java.lang.Integer>
          getLastConditionIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(lastConditionIdList_) : lastConditionIdList_;
      }
      /**
       * <code>repeated uint32 last_condition_id_list = 9;</code>
       * @return The count of lastConditionIdList.
       */
      public int getLastConditionIdListCount() {
        return lastConditionIdList_.size();
      }
      /**
       * <code>repeated uint32 last_condition_id_list = 9;</code>
       * @param index The index of the element to return.
       * @return The lastConditionIdList at the given index.
       */
      public int getLastConditionIdList(int index) {
        return lastConditionIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 last_condition_id_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The lastConditionIdList to set.
       * @return This builder for chaining.
       */
      public Builder setLastConditionIdList(
          int index, int value) {
        ensureLastConditionIdListIsMutable();
        lastConditionIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 last_condition_id_list = 9;</code>
       * @param value The lastConditionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addLastConditionIdList(int value) {
        ensureLastConditionIdListIsMutable();
        lastConditionIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 last_condition_id_list = 9;</code>
       * @param values The lastConditionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllLastConditionIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLastConditionIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lastConditionIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 last_condition_id_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastConditionIdList() {
        lastConditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 13;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 13;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isFirstPassRewardTaken_ ;
      /**
       * <code>bool is_first_pass_reward_taken = 15;</code>
       * @return The isFirstPassRewardTaken.
       */
      @java.lang.Override
      public boolean getIsFirstPassRewardTaken() {
        return isFirstPassRewardTaken_;
      }
      /**
       * <code>bool is_first_pass_reward_taken = 15;</code>
       * @param value The isFirstPassRewardTaken to set.
       * @return This builder for chaining.
       */
      public Builder setIsFirstPassRewardTaken(boolean value) {
        
        isFirstPassRewardTaken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_first_pass_reward_taken = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFirstPassRewardTaken() {
        
        isFirstPassRewardTaken_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChannellerSlabLoopDungeonInfo)
    }

    // @@protoc_insertion_point(class_scope:ChannellerSlabLoopDungeonInfo)
    private static final emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo();
    }

    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannellerSlabLoopDungeonInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChannellerSlabLoopDungeonInfo>() {
      @java.lang.Override
      public ChannellerSlabLoopDungeonInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannellerSlabLoopDungeonInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannellerSlabLoopDungeonInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannellerSlabLoopDungeonInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonInfoOuterClass.ChannellerSlabLoopDungeonInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannellerSlabLoopDungeonInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannellerSlabLoopDungeonInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#ChannellerSlabLoopDungeonInfo.proto\"\255\001" +
      "\n\035ChannellerSlabLoopDungeonInfo\022\017\n\007is_op" +
      "en\030\010 \001(\010\022\025\n\rdungeon_index\030\002 \001(\r\022\r\n\005score" +
      "\030\005 \001(\r\022\036\n\026last_condition_id_list\030\t \003(\r\022\021" +
      "\n\topen_time\030\r \001(\r\022\"\n\032is_first_pass_rewar" +
      "d_taken\030\017 \001(\010B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannellerSlabLoopDungeonInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannellerSlabLoopDungeonInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannellerSlabLoopDungeonInfo_descriptor,
        new java.lang.String[] { "IsOpen", "DungeonIndex", "Score", "LastConditionIdList", "OpenTime", "IsFirstPassRewardTaken", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
