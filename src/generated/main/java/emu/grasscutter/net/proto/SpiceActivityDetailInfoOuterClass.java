// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SpiceActivityDetailInfo.proto

package emu.grasscutter.net.proto;

public final class SpiceActivityDetailInfoOuterClass {
  private SpiceActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SpiceActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SpiceActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 KIFHDNINMHD = 7;</code>
     * @return The kIFHDNINMHD.
     */
    int getKIFHDNINMHD();

    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    java.util.List<emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData> 
        getSpiceStageDataListList();
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData getSpiceStageDataList(int index);
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    int getSpiceStageDataListCount();
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder> 
        getSpiceStageDataListOrBuilderList();
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder getSpiceStageDataListOrBuilder(
        int index);

    /**
     * <code>uint32 BDGNIOMACMP = 5;</code>
     * @return The bDGNIOMACMP.
     */
    int getBDGNIOMACMP();
  }
  /**
   * <pre>
   * Obf: KMDDHMJGLKE
   * </pre>
   *
   * Protobuf type {@code SpiceActivityDetailInfo}
   */
  public static final class SpiceActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SpiceActivityDetailInfo)
      SpiceActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SpiceActivityDetailInfo.newBuilder() to construct.
    private SpiceActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SpiceActivityDetailInfo() {
      spiceStageDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SpiceActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SpiceActivityDetailInfo(
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
            case 40: {

              bDGNIOMACMP_ = input.readUInt32();
              break;
            }
            case 56: {

              kIFHDNINMHD_ = input.readUInt32();
              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                spiceStageDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData>();
                mutable_bitField0_ |= 0x00000001;
              }
              spiceStageDataList_.add(
                  input.readMessage(emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.parser(), extensionRegistry));
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
          spiceStageDataList_ = java.util.Collections.unmodifiableList(spiceStageDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.internal_static_SpiceActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.internal_static_SpiceActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo.class, emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo.Builder.class);
    }

    public static final int KIFHDNINMHD_FIELD_NUMBER = 7;
    private int kIFHDNINMHD_;
    /**
     * <code>uint32 KIFHDNINMHD = 7;</code>
     * @return The kIFHDNINMHD.
     */
    @java.lang.Override
    public int getKIFHDNINMHD() {
      return kIFHDNINMHD_;
    }

    public static final int SPICE_STAGE_DATA_LIST_FIELD_NUMBER = 8;
    private java.util.List<emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData> spiceStageDataList_;
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData> getSpiceStageDataListList() {
      return spiceStageDataList_;
    }
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder> 
        getSpiceStageDataListOrBuilderList() {
      return spiceStageDataList_;
    }
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    @java.lang.Override
    public int getSpiceStageDataListCount() {
      return spiceStageDataList_.size();
    }
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData getSpiceStageDataList(int index) {
      return spiceStageDataList_.get(index);
    }
    /**
     * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder getSpiceStageDataListOrBuilder(
        int index) {
      return spiceStageDataList_.get(index);
    }

    public static final int BDGNIOMACMP_FIELD_NUMBER = 5;
    private int bDGNIOMACMP_;
    /**
     * <code>uint32 BDGNIOMACMP = 5;</code>
     * @return The bDGNIOMACMP.
     */
    @java.lang.Override
    public int getBDGNIOMACMP() {
      return bDGNIOMACMP_;
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
      if (bDGNIOMACMP_ != 0) {
        output.writeUInt32(5, bDGNIOMACMP_);
      }
      if (kIFHDNINMHD_ != 0) {
        output.writeUInt32(7, kIFHDNINMHD_);
      }
      for (int i = 0; i < spiceStageDataList_.size(); i++) {
        output.writeMessage(8, spiceStageDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bDGNIOMACMP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, bDGNIOMACMP_);
      }
      if (kIFHDNINMHD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, kIFHDNINMHD_);
      }
      for (int i = 0; i < spiceStageDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, spiceStageDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo other = (emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo) obj;

      if (getKIFHDNINMHD()
          != other.getKIFHDNINMHD()) return false;
      if (!getSpiceStageDataListList()
          .equals(other.getSpiceStageDataListList())) return false;
      if (getBDGNIOMACMP()
          != other.getBDGNIOMACMP()) return false;
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
      hash = (37 * hash) + KIFHDNINMHD_FIELD_NUMBER;
      hash = (53 * hash) + getKIFHDNINMHD();
      if (getSpiceStageDataListCount() > 0) {
        hash = (37 * hash) + SPICE_STAGE_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSpiceStageDataListList().hashCode();
      }
      hash = (37 * hash) + BDGNIOMACMP_FIELD_NUMBER;
      hash = (53 * hash) + getBDGNIOMACMP();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo prototype) {
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
     * Obf: KMDDHMJGLKE
     * </pre>
     *
     * Protobuf type {@code SpiceActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SpiceActivityDetailInfo)
        emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.internal_static_SpiceActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.internal_static_SpiceActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo.class, emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo.newBuilder()
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
          getSpiceStageDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        kIFHDNINMHD_ = 0;

        if (spiceStageDataListBuilder_ == null) {
          spiceStageDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          spiceStageDataListBuilder_.clear();
        }
        bDGNIOMACMP_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.internal_static_SpiceActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo build() {
        emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo buildPartial() {
        emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo result = new emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.kIFHDNINMHD_ = kIFHDNINMHD_;
        if (spiceStageDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            spiceStageDataList_ = java.util.Collections.unmodifiableList(spiceStageDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.spiceStageDataList_ = spiceStageDataList_;
        } else {
          result.spiceStageDataList_ = spiceStageDataListBuilder_.build();
        }
        result.bDGNIOMACMP_ = bDGNIOMACMP_;
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
        if (other instanceof emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo other) {
        if (other == emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo.getDefaultInstance()) return this;
        if (other.getKIFHDNINMHD() != 0) {
          setKIFHDNINMHD(other.getKIFHDNINMHD());
        }
        if (spiceStageDataListBuilder_ == null) {
          if (!other.spiceStageDataList_.isEmpty()) {
            if (spiceStageDataList_.isEmpty()) {
              spiceStageDataList_ = other.spiceStageDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSpiceStageDataListIsMutable();
              spiceStageDataList_.addAll(other.spiceStageDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.spiceStageDataList_.isEmpty()) {
            if (spiceStageDataListBuilder_.isEmpty()) {
              spiceStageDataListBuilder_.dispose();
              spiceStageDataListBuilder_ = null;
              spiceStageDataList_ = other.spiceStageDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              spiceStageDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSpiceStageDataListFieldBuilder() : null;
            } else {
              spiceStageDataListBuilder_.addAllMessages(other.spiceStageDataList_);
            }
          }
        }
        if (other.getBDGNIOMACMP() != 0) {
          setBDGNIOMACMP(other.getBDGNIOMACMP());
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
        emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int kIFHDNINMHD_ ;
      /**
       * <code>uint32 KIFHDNINMHD = 7;</code>
       * @return The kIFHDNINMHD.
       */
      @java.lang.Override
      public int getKIFHDNINMHD() {
        return kIFHDNINMHD_;
      }
      /**
       * <code>uint32 KIFHDNINMHD = 7;</code>
       * @param value The kIFHDNINMHD to set.
       * @return This builder for chaining.
       */
      public Builder setKIFHDNINMHD(int value) {
        
        kIFHDNINMHD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KIFHDNINMHD = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearKIFHDNINMHD() {
        
        kIFHDNINMHD_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData> spiceStageDataList_ =
        java.util.Collections.emptyList();
      private void ensureSpiceStageDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          spiceStageDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData>(spiceStageDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder> spiceStageDataListBuilder_;

      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData> getSpiceStageDataListList() {
        if (spiceStageDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(spiceStageDataList_);
        } else {
          return spiceStageDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public int getSpiceStageDataListCount() {
        if (spiceStageDataListBuilder_ == null) {
          return spiceStageDataList_.size();
        } else {
          return spiceStageDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData getSpiceStageDataList(int index) {
        if (spiceStageDataListBuilder_ == null) {
          return spiceStageDataList_.get(index);
        } else {
          return spiceStageDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder setSpiceStageDataList(
          int index, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData value) {
        if (spiceStageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSpiceStageDataListIsMutable();
          spiceStageDataList_.set(index, value);
          onChanged();
        } else {
          spiceStageDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder setSpiceStageDataList(
          int index, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder builderForValue) {
        if (spiceStageDataListBuilder_ == null) {
          ensureSpiceStageDataListIsMutable();
          spiceStageDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          spiceStageDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder addSpiceStageDataList(emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData value) {
        if (spiceStageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSpiceStageDataListIsMutable();
          spiceStageDataList_.add(value);
          onChanged();
        } else {
          spiceStageDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder addSpiceStageDataList(
          int index, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData value) {
        if (spiceStageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSpiceStageDataListIsMutable();
          spiceStageDataList_.add(index, value);
          onChanged();
        } else {
          spiceStageDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder addSpiceStageDataList(
          emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder builderForValue) {
        if (spiceStageDataListBuilder_ == null) {
          ensureSpiceStageDataListIsMutable();
          spiceStageDataList_.add(builderForValue.build());
          onChanged();
        } else {
          spiceStageDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder addSpiceStageDataList(
          int index, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder builderForValue) {
        if (spiceStageDataListBuilder_ == null) {
          ensureSpiceStageDataListIsMutable();
          spiceStageDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          spiceStageDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder addAllSpiceStageDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData> values) {
        if (spiceStageDataListBuilder_ == null) {
          ensureSpiceStageDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, spiceStageDataList_);
          onChanged();
        } else {
          spiceStageDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder clearSpiceStageDataList() {
        if (spiceStageDataListBuilder_ == null) {
          spiceStageDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          spiceStageDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public Builder removeSpiceStageDataList(int index) {
        if (spiceStageDataListBuilder_ == null) {
          ensureSpiceStageDataListIsMutable();
          spiceStageDataList_.remove(index);
          onChanged();
        } else {
          spiceStageDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder getSpiceStageDataListBuilder(
          int index) {
        return getSpiceStageDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder getSpiceStageDataListOrBuilder(
          int index) {
        if (spiceStageDataListBuilder_ == null) {
          return spiceStageDataList_.get(index);  } else {
          return spiceStageDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder> 
           getSpiceStageDataListOrBuilderList() {
        if (spiceStageDataListBuilder_ != null) {
          return spiceStageDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(spiceStageDataList_);
        }
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder addSpiceStageDataListBuilder() {
        return getSpiceStageDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder addSpiceStageDataListBuilder(
          int index) {
        return getSpiceStageDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .SpiceStageData spice_stage_data_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder> 
           getSpiceStageDataListBuilderList() {
        return getSpiceStageDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder> 
          getSpiceStageDataListFieldBuilder() {
        if (spiceStageDataListBuilder_ == null) {
          spiceStageDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageData.Builder, emu.grasscutter.net.proto.SpiceStageDataOuterClass.SpiceStageDataOrBuilder>(
                  spiceStageDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          spiceStageDataList_ = null;
        }
        return spiceStageDataListBuilder_;
      }

      private int bDGNIOMACMP_ ;
      /**
       * <code>uint32 BDGNIOMACMP = 5;</code>
       * @return The bDGNIOMACMP.
       */
      @java.lang.Override
      public int getBDGNIOMACMP() {
        return bDGNIOMACMP_;
      }
      /**
       * <code>uint32 BDGNIOMACMP = 5;</code>
       * @param value The bDGNIOMACMP to set.
       * @return This builder for chaining.
       */
      public Builder setBDGNIOMACMP(int value) {
        
        bDGNIOMACMP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BDGNIOMACMP = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBDGNIOMACMP() {
        
        bDGNIOMACMP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SpiceActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:SpiceActivityDetailInfo)
    private static final emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SpiceActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<SpiceActivityDetailInfo>() {
      @java.lang.Override
      public SpiceActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SpiceActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SpiceActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SpiceActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SpiceActivityDetailInfoOuterClass.SpiceActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SpiceActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SpiceActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SpiceActivityDetailInfo.proto\032\024SpiceSt" +
      "ageData.proto\"s\n\027SpiceActivityDetailInfo" +
      "\022\023\n\013KIFHDNINMHD\030\007 \001(\r\022.\n\025spice_stage_dat" +
      "a_list\030\010 \003(\0132\017.SpiceStageData\022\023\n\013BDGNIOM" +
      "ACMP\030\005 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SpiceStageDataOuterClass.getDescriptor(),
        });
    internal_static_SpiceActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SpiceActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SpiceActivityDetailInfo_descriptor,
        new java.lang.String[] { "KIFHDNINMHD", "SpiceStageDataList", "BDGNIOMACMP", });
    emu.grasscutter.net.proto.SpiceStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
