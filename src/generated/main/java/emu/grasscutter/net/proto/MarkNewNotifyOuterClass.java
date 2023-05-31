// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MarkNewNotify.proto

package emu.grasscutter.net.proto;

public final class MarkNewNotifyOuterClass {
  private MarkNewNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MarkNewNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MarkNewNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 id_list = 11;</code>
     * @return A list containing the idList.
     */
    java.util.List<java.lang.Integer> getIdListList();
    /**
     * <code>repeated uint32 id_list = 11;</code>
     * @return The count of idList.
     */
    int getIdListCount();
    /**
     * <code>repeated uint32 id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The idList at the given index.
     */
    int getIdList(int index);

    /**
     * <code>uint32 mark_new_type = 14;</code>
     * @return The markNewType.
     */
    int getMarkNewType();
  }
  /**
   * <pre>
   * CmdId: 1264
   * Obf: HKDODIFHHNI
   * </pre>
   *
   * Protobuf type {@code MarkNewNotify}
   */
  public static final class MarkNewNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MarkNewNotify)
      MarkNewNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MarkNewNotify.newBuilder() to construct.
    private MarkNewNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MarkNewNotify() {
      idList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MarkNewNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MarkNewNotify(
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
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                idList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              idList_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                idList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                idList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {

              markNewType_ = input.readUInt32();
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
          idList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.class, emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.Builder.class);
    }

    public static final int ID_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList idList_;
    /**
     * <code>repeated uint32 id_list = 11;</code>
     * @return A list containing the idList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getIdListList() {
      return idList_;
    }
    /**
     * <code>repeated uint32 id_list = 11;</code>
     * @return The count of idList.
     */
    public int getIdListCount() {
      return idList_.size();
    }
    /**
     * <code>repeated uint32 id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The idList at the given index.
     */
    public int getIdList(int index) {
      return idList_.getInt(index);
    }
    private int idListMemoizedSerializedSize = -1;

    public static final int MARK_NEW_TYPE_FIELD_NUMBER = 14;
    private int markNewType_;
    /**
     * <code>uint32 mark_new_type = 14;</code>
     * @return The markNewType.
     */
    @java.lang.Override
    public int getMarkNewType() {
      return markNewType_;
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
      if (getIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(idListMemoizedSerializedSize);
      }
      for (int i = 0; i < idList_.size(); i++) {
        output.writeUInt32NoTag(idList_.getInt(i));
      }
      if (markNewType_ != 0) {
        output.writeUInt32(14, markNewType_);
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
        for (int i = 0; i < idList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(idList_.getInt(i));
        }
        size += dataSize;
        if (!getIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        idListMemoizedSerializedSize = dataSize;
      }
      if (markNewType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, markNewType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify other = (emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify) obj;

      if (!getIdListList()
          .equals(other.getIdListList())) return false;
      if (getMarkNewType()
          != other.getMarkNewType()) return false;
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
      if (getIdListCount() > 0) {
        hash = (37 * hash) + ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getIdListList().hashCode();
      }
      hash = (37 * hash) + MARK_NEW_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMarkNewType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify prototype) {
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
     * CmdId: 1264
     * Obf: HKDODIFHHNI
     * </pre>
     *
     * Protobuf type {@code MarkNewNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MarkNewNotify)
        emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.class, emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.newBuilder()
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
        idList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        markNewType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify build() {
        emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify buildPartial() {
        emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify result = new emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          idList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.idList_ = idList_;
        result.markNewType_ = markNewType_;
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
        if (other instanceof emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify other) {
        if (other == emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.getDefaultInstance()) return this;
        if (!other.idList_.isEmpty()) {
          if (idList_.isEmpty()) {
            idList_ = other.idList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIdListIsMutable();
            idList_.addAll(other.idList_);
          }
          onChanged();
        }
        if (other.getMarkNewType() != 0) {
          setMarkNewType(other.getMarkNewType());
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
        emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList idList_ = emptyIntList();
      private void ensureIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          idList_ = mutableCopy(idList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 id_list = 11;</code>
       * @return A list containing the idList.
       */
      public java.util.List<java.lang.Integer>
          getIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(idList_) : idList_;
      }
      /**
       * <code>repeated uint32 id_list = 11;</code>
       * @return The count of idList.
       */
      public int getIdListCount() {
        return idList_.size();
      }
      /**
       * <code>repeated uint32 id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The idList at the given index.
       */
      public int getIdList(int index) {
        return idList_.getInt(index);
      }
      /**
       * <code>repeated uint32 id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The idList to set.
       * @return This builder for chaining.
       */
      public Builder setIdList(
          int index, int value) {
        ensureIdListIsMutable();
        idList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 id_list = 11;</code>
       * @param value The idList to add.
       * @return This builder for chaining.
       */
      public Builder addIdList(int value) {
        ensureIdListIsMutable();
        idList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 id_list = 11;</code>
       * @param values The idList to add.
       * @return This builder for chaining.
       */
      public Builder addAllIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, idList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIdList() {
        idList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int markNewType_ ;
      /**
       * <code>uint32 mark_new_type = 14;</code>
       * @return The markNewType.
       */
      @java.lang.Override
      public int getMarkNewType() {
        return markNewType_;
      }
      /**
       * <code>uint32 mark_new_type = 14;</code>
       * @param value The markNewType to set.
       * @return This builder for chaining.
       */
      public Builder setMarkNewType(int value) {
        
        markNewType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mark_new_type = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMarkNewType() {
        
        markNewType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MarkNewNotify)
    }

    // @@protoc_insertion_point(class_scope:MarkNewNotify)
    private static final emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify();
    }

    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MarkNewNotify>
        PARSER = new com.google.protobuf.AbstractParser<MarkNewNotify>() {
      @java.lang.Override
      public MarkNewNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MarkNewNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MarkNewNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MarkNewNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MarkNewNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MarkNewNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MarkNewNotify.proto\"7\n\rMarkNewNotify\022\017" +
      "\n\007id_list\030\013 \003(\r\022\025\n\rmark_new_type\030\016 \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MarkNewNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MarkNewNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MarkNewNotify_descriptor,
        new java.lang.String[] { "IdList", "MarkNewType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
