// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerLevelStarCondData.proto

package emu.grasscutter.net.proto;

public final class TowerLevelStarCondDataOuterClass {
  private TowerLevelStarCondDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerLevelStarCondDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerLevelStarCondData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * bool NEIEIKILOOK = 4;
     * uint32 ONDFEAODDNF = 9;
     * bool KINEADBIKJB = 12;
     * uint32 CHCGFDLNJOB = 14;
     * </pre>
     *
     * <code>bool is_fail = 4;</code>
     * @return The isFail.
     */
    boolean getIsFail();

    /**
     * <pre>
     * sus
     * </pre>
     *
     * <code>uint32 cond_value = 9;</code>
     * @return The condValue.
     */
    int getCondValue();

    /**
     * <pre>
     * sus
     * </pre>
     *
     * <code>bool is_pause = 12;</code>
     * @return The isPause.
     */
    boolean getIsPause();

    /**
     * <pre>
     * sus
     * </pre>
     *
     * <code>uint32 star_cond_index = 14;</code>
     * @return The starCondIndex.
     */
    int getStarCondIndex();
  }
  /**
   * Protobuf type {@code TowerLevelStarCondData}
   */
  public static final class TowerLevelStarCondData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerLevelStarCondData)
      TowerLevelStarCondDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerLevelStarCondData.newBuilder() to construct.
    private TowerLevelStarCondData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerLevelStarCondData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerLevelStarCondData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerLevelStarCondData(
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
            case 32: {

              isFail_ = input.readBool();
              break;
            }
            case 72: {

              condValue_ = input.readUInt32();
              break;
            }
            case 96: {

              isPause_ = input.readBool();
              break;
            }
            case 112: {

              starCondIndex_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.class, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder.class);
    }

    public static final int IS_FAIL_FIELD_NUMBER = 4;
    private boolean isFail_;
    /**
     * <pre>
     * bool NEIEIKILOOK = 4;
     * uint32 ONDFEAODDNF = 9;
     * bool KINEADBIKJB = 12;
     * uint32 CHCGFDLNJOB = 14;
     * </pre>
     *
     * <code>bool is_fail = 4;</code>
     * @return The isFail.
     */
    @java.lang.Override
    public boolean getIsFail() {
      return isFail_;
    }

    public static final int COND_VALUE_FIELD_NUMBER = 9;
    private int condValue_;
    /**
     * <pre>
     * sus
     * </pre>
     *
     * <code>uint32 cond_value = 9;</code>
     * @return The condValue.
     */
    @java.lang.Override
    public int getCondValue() {
      return condValue_;
    }

    public static final int IS_PAUSE_FIELD_NUMBER = 12;
    private boolean isPause_;
    /**
     * <pre>
     * sus
     * </pre>
     *
     * <code>bool is_pause = 12;</code>
     * @return The isPause.
     */
    @java.lang.Override
    public boolean getIsPause() {
      return isPause_;
    }

    public static final int STAR_COND_INDEX_FIELD_NUMBER = 14;
    private int starCondIndex_;
    /**
     * <pre>
     * sus
     * </pre>
     *
     * <code>uint32 star_cond_index = 14;</code>
     * @return The starCondIndex.
     */
    @java.lang.Override
    public int getStarCondIndex() {
      return starCondIndex_;
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
      if (isFail_ != false) {
        output.writeBool(4, isFail_);
      }
      if (condValue_ != 0) {
        output.writeUInt32(9, condValue_);
      }
      if (isPause_ != false) {
        output.writeBool(12, isPause_);
      }
      if (starCondIndex_ != 0) {
        output.writeUInt32(14, starCondIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFail_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isFail_);
      }
      if (condValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, condValue_);
      }
      if (isPause_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isPause_);
      }
      if (starCondIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, starCondIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData other = (emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) obj;

      if (getIsFail()
          != other.getIsFail()) return false;
      if (getCondValue()
          != other.getCondValue()) return false;
      if (getIsPause()
          != other.getIsPause()) return false;
      if (getStarCondIndex()
          != other.getStarCondIndex()) return false;
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
      hash = (37 * hash) + IS_FAIL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFail());
      hash = (37 * hash) + COND_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getCondValue();
      hash = (37 * hash) + IS_PAUSE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPause());
      hash = (37 * hash) + STAR_COND_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getStarCondIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData prototype) {
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
     * Protobuf type {@code TowerLevelStarCondData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerLevelStarCondData)
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.class, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.newBuilder()
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
        isFail_ = false;

        condValue_ = 0;

        isPause_ = false;

        starCondIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData build() {
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData buildPartial() {
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result = new emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData(this);
        result.isFail_ = isFail_;
        result.condValue_ = condValue_;
        result.isPause_ = isPause_;
        result.starCondIndex_ = starCondIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) {
          return mergeFrom((emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData other) {
        if (other == emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance()) return this;
        if (other.getIsFail() != false) {
          setIsFail(other.getIsFail());
        }
        if (other.getCondValue() != 0) {
          setCondValue(other.getCondValue());
        }
        if (other.getIsPause() != false) {
          setIsPause(other.getIsPause());
        }
        if (other.getStarCondIndex() != 0) {
          setStarCondIndex(other.getStarCondIndex());
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
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isFail_ ;
      /**
       * <pre>
       * bool NEIEIKILOOK = 4;
       * uint32 ONDFEAODDNF = 9;
       * bool KINEADBIKJB = 12;
       * uint32 CHCGFDLNJOB = 14;
       * </pre>
       *
       * <code>bool is_fail = 4;</code>
       * @return The isFail.
       */
      @java.lang.Override
      public boolean getIsFail() {
        return isFail_;
      }
      /**
       * <pre>
       * bool NEIEIKILOOK = 4;
       * uint32 ONDFEAODDNF = 9;
       * bool KINEADBIKJB = 12;
       * uint32 CHCGFDLNJOB = 14;
       * </pre>
       *
       * <code>bool is_fail = 4;</code>
       * @param value The isFail to set.
       * @return This builder for chaining.
       */
      public Builder setIsFail(boolean value) {
        
        isFail_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * bool NEIEIKILOOK = 4;
       * uint32 ONDFEAODDNF = 9;
       * bool KINEADBIKJB = 12;
       * uint32 CHCGFDLNJOB = 14;
       * </pre>
       *
       * <code>bool is_fail = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFail() {
        
        isFail_ = false;
        onChanged();
        return this;
      }

      private int condValue_ ;
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>uint32 cond_value = 9;</code>
       * @return The condValue.
       */
      @java.lang.Override
      public int getCondValue() {
        return condValue_;
      }
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>uint32 cond_value = 9;</code>
       * @param value The condValue to set.
       * @return This builder for chaining.
       */
      public Builder setCondValue(int value) {
        
        condValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>uint32 cond_value = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCondValue() {
        
        condValue_ = 0;
        onChanged();
        return this;
      }

      private boolean isPause_ ;
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>bool is_pause = 12;</code>
       * @return The isPause.
       */
      @java.lang.Override
      public boolean getIsPause() {
        return isPause_;
      }
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>bool is_pause = 12;</code>
       * @param value The isPause to set.
       * @return This builder for chaining.
       */
      public Builder setIsPause(boolean value) {
        
        isPause_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>bool is_pause = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPause() {
        
        isPause_ = false;
        onChanged();
        return this;
      }

      private int starCondIndex_ ;
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>uint32 star_cond_index = 14;</code>
       * @return The starCondIndex.
       */
      @java.lang.Override
      public int getStarCondIndex() {
        return starCondIndex_;
      }
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>uint32 star_cond_index = 14;</code>
       * @param value The starCondIndex to set.
       * @return This builder for chaining.
       */
      public Builder setStarCondIndex(int value) {
        
        starCondIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * sus
       * </pre>
       *
       * <code>uint32 star_cond_index = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearStarCondIndex() {
        
        starCondIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerLevelStarCondData)
    }

    // @@protoc_insertion_point(class_scope:TowerLevelStarCondData)
    private static final emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData();
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerLevelStarCondData>
        PARSER = new com.google.protobuf.AbstractParser<TowerLevelStarCondData>() {
      @java.lang.Override
      public TowerLevelStarCondData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerLevelStarCondData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerLevelStarCondData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerLevelStarCondData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerLevelStarCondData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerLevelStarCondData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034TowerLevelStarCondData.proto\"h\n\026TowerL" +
      "evelStarCondData\022\017\n\007is_fail\030\004 \001(\010\022\022\n\ncon" +
      "d_value\030\t \001(\r\022\020\n\010is_pause\030\014 \001(\010\022\027\n\017star_" +
      "cond_index\030\016 \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerLevelStarCondData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerLevelStarCondData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerLevelStarCondData_descriptor,
        new java.lang.String[] { "IsFail", "CondValue", "IsPause", "StarCondIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
