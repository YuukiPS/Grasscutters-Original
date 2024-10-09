// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaWishRsp.proto

package emu.grasscutter.net.proto;

public final class GachaWishRspOuterClass {
  private GachaWishRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GachaWishRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GachaWishRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gacha_sort_id = 2;</code>
     * @return The gachaSortId.
     */
    int getGachaSortId();

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 gacha_type = 6;</code>
     * @return The gachaType.
     */
    int getGachaType();

    /**
     * <code>uint32 gacha_schedule_id = 7;</code>
     * @return The gachaScheduleId.
     */
    int getGachaScheduleId();

    /**
     * <code>uint32 wish_item_id = 12;</code>
     * @return The wishItemId.
     */
    int getWishItemId();

    /**
     * <code>uint32 ten_cost_item_id = 13;</code>
     * @return The tenCostItemId.
     */
    int getTenCostItemId();
  }
  /**
   * Protobuf type {@code GachaWishRsp}
   */
  public static final class GachaWishRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GachaWishRsp)
      GachaWishRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GachaWishRsp.newBuilder() to construct.
    private GachaWishRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GachaWishRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GachaWishRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GachaWishRsp(
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

              gachaSortId_ = input.readUInt32();
              break;
            }
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              gachaType_ = input.readUInt32();
              break;
            }
            case 56: {

              gachaScheduleId_ = input.readUInt32();
              break;
            }
            case 96: {

              wishItemId_ = input.readUInt32();
              break;
            }
            case 104: {

              tenCostItemId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.class, emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.Builder.class);
    }

    public static final int GACHA_SORT_ID_FIELD_NUMBER = 2;
    private int gachaSortId_;
    /**
     * <code>uint32 gacha_sort_id = 2;</code>
     * @return The gachaSortId.
     */
    @java.lang.Override
    public int getGachaSortId() {
      return gachaSortId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GACHA_TYPE_FIELD_NUMBER = 6;
    private int gachaType_;
    /**
     * <code>uint32 gacha_type = 6;</code>
     * @return The gachaType.
     */
    @java.lang.Override
    public int getGachaType() {
      return gachaType_;
    }

    public static final int GACHA_SCHEDULE_ID_FIELD_NUMBER = 7;
    private int gachaScheduleId_;
    /**
     * <code>uint32 gacha_schedule_id = 7;</code>
     * @return The gachaScheduleId.
     */
    @java.lang.Override
    public int getGachaScheduleId() {
      return gachaScheduleId_;
    }

    public static final int WISH_ITEM_ID_FIELD_NUMBER = 12;
    private int wishItemId_;
    /**
     * <code>uint32 wish_item_id = 12;</code>
     * @return The wishItemId.
     */
    @java.lang.Override
    public int getWishItemId() {
      return wishItemId_;
    }

    public static final int TEN_COST_ITEM_ID_FIELD_NUMBER = 13;
    private int tenCostItemId_;
    /**
     * <code>uint32 ten_cost_item_id = 13;</code>
     * @return The tenCostItemId.
     */
    @java.lang.Override
    public int getTenCostItemId() {
      return tenCostItemId_;
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
      if (gachaSortId_ != 0) {
        output.writeUInt32(2, gachaSortId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (gachaType_ != 0) {
        output.writeUInt32(6, gachaType_);
      }
      if (gachaScheduleId_ != 0) {
        output.writeUInt32(7, gachaScheduleId_);
      }
      if (wishItemId_ != 0) {
        output.writeUInt32(12, wishItemId_);
      }
      if (tenCostItemId_ != 0) {
        output.writeUInt32(13, tenCostItemId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gachaSortId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, gachaSortId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (gachaType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, gachaType_);
      }
      if (gachaScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gachaScheduleId_);
      }
      if (wishItemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, wishItemId_);
      }
      if (tenCostItemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, tenCostItemId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp other = (emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp) obj;

      if (getGachaSortId()
          != other.getGachaSortId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGachaType()
          != other.getGachaType()) return false;
      if (getGachaScheduleId()
          != other.getGachaScheduleId()) return false;
      if (getWishItemId()
          != other.getWishItemId()) return false;
      if (getTenCostItemId()
          != other.getTenCostItemId()) return false;
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
      hash = (37 * hash) + GACHA_SORT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGachaSortId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GACHA_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getGachaType();
      hash = (37 * hash) + GACHA_SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGachaScheduleId();
      hash = (37 * hash) + WISH_ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWishItemId();
      hash = (37 * hash) + TEN_COST_ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTenCostItemId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp prototype) {
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
     * Protobuf type {@code GachaWishRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GachaWishRsp)
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.class, emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.newBuilder()
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
        gachaSortId_ = 0;

        retcode_ = 0;

        gachaType_ = 0;

        gachaScheduleId_ = 0;

        wishItemId_ = 0;

        tenCostItemId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp build() {
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp buildPartial() {
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp result = new emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp(this);
        result.gachaSortId_ = gachaSortId_;
        result.retcode_ = retcode_;
        result.gachaType_ = gachaType_;
        result.gachaScheduleId_ = gachaScheduleId_;
        result.wishItemId_ = wishItemId_;
        result.tenCostItemId_ = tenCostItemId_;
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
        if (other instanceof emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp other) {
        if (other == emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.getDefaultInstance()) return this;
        if (other.getGachaSortId() != 0) {
          setGachaSortId(other.getGachaSortId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGachaType() != 0) {
          setGachaType(other.getGachaType());
        }
        if (other.getGachaScheduleId() != 0) {
          setGachaScheduleId(other.getGachaScheduleId());
        }
        if (other.getWishItemId() != 0) {
          setWishItemId(other.getWishItemId());
        }
        if (other.getTenCostItemId() != 0) {
          setTenCostItemId(other.getTenCostItemId());
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
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gachaSortId_ ;
      /**
       * <code>uint32 gacha_sort_id = 2;</code>
       * @return The gachaSortId.
       */
      @java.lang.Override
      public int getGachaSortId() {
        return gachaSortId_;
      }
      /**
       * <code>uint32 gacha_sort_id = 2;</code>
       * @param value The gachaSortId to set.
       * @return This builder for chaining.
       */
      public Builder setGachaSortId(int value) {
        
        gachaSortId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gacha_sort_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaSortId() {
        
        gachaSortId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int gachaType_ ;
      /**
       * <code>uint32 gacha_type = 6;</code>
       * @return The gachaType.
       */
      @java.lang.Override
      public int getGachaType() {
        return gachaType_;
      }
      /**
       * <code>uint32 gacha_type = 6;</code>
       * @param value The gachaType to set.
       * @return This builder for chaining.
       */
      public Builder setGachaType(int value) {
        
        gachaType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gacha_type = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaType() {
        
        gachaType_ = 0;
        onChanged();
        return this;
      }

      private int gachaScheduleId_ ;
      /**
       * <code>uint32 gacha_schedule_id = 7;</code>
       * @return The gachaScheduleId.
       */
      @java.lang.Override
      public int getGachaScheduleId() {
        return gachaScheduleId_;
      }
      /**
       * <code>uint32 gacha_schedule_id = 7;</code>
       * @param value The gachaScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setGachaScheduleId(int value) {
        
        gachaScheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gacha_schedule_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaScheduleId() {
        
        gachaScheduleId_ = 0;
        onChanged();
        return this;
      }

      private int wishItemId_ ;
      /**
       * <code>uint32 wish_item_id = 12;</code>
       * @return The wishItemId.
       */
      @java.lang.Override
      public int getWishItemId() {
        return wishItemId_;
      }
      /**
       * <code>uint32 wish_item_id = 12;</code>
       * @param value The wishItemId to set.
       * @return This builder for chaining.
       */
      public Builder setWishItemId(int value) {
        
        wishItemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wish_item_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearWishItemId() {
        
        wishItemId_ = 0;
        onChanged();
        return this;
      }

      private int tenCostItemId_ ;
      /**
       * <code>uint32 ten_cost_item_id = 13;</code>
       * @return The tenCostItemId.
       */
      @java.lang.Override
      public int getTenCostItemId() {
        return tenCostItemId_;
      }
      /**
       * <code>uint32 ten_cost_item_id = 13;</code>
       * @param value The tenCostItemId to set.
       * @return This builder for chaining.
       */
      public Builder setTenCostItemId(int value) {
        
        tenCostItemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ten_cost_item_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTenCostItemId() {
        
        tenCostItemId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GachaWishRsp)
    }

    // @@protoc_insertion_point(class_scope:GachaWishRsp)
    private static final emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp();
    }

    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GachaWishRsp>
        PARSER = new com.google.protobuf.AbstractParser<GachaWishRsp>() {
      @java.lang.Override
      public GachaWishRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GachaWishRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GachaWishRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GachaWishRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaWishRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaWishRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022GachaWishRsp.proto\"\225\001\n\014GachaWishRsp\022\025\n" +
      "\rgacha_sort_id\030\002 \001(\r\022\017\n\007retcode\030\005 \001(\005\022\022\n" +
      "\ngacha_type\030\006 \001(\r\022\031\n\021gacha_schedule_id\030\007" +
      " \001(\r\022\024\n\014wish_item_id\030\014 \001(\r\022\030\n\020ten_cost_i" +
      "tem_id\030\r \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GachaWishRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GachaWishRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaWishRsp_descriptor,
        new java.lang.String[] { "GachaSortId", "Retcode", "GachaType", "GachaScheduleId", "WishItemId", "TenCostItemId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
