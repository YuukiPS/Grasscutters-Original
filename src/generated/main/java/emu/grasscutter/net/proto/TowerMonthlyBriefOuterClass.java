// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerMonthlyBrief.proto

package emu.grasscutter.net.proto;

public final class TowerMonthlyBriefOuterClass {
  private TowerMonthlyBriefOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerMonthlyBriefOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerMonthlyBrief)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 LJGBNNKAJOF = 5;</code>
     * @return The lJGBNNKAJOF.
     */
    int getLJGBNNKAJOF();

    /**
     * <code>uint32 FGDCNEJCNJO = 14;</code>
     * @return The fGDCNEJCNJO.
     */
    int getFGDCNEJCNJO();

    /**
     * <code>uint32 tower_schedule_id = 6;</code>
     * @return The towerScheduleId.
     */
    int getTowerScheduleId();

    /**
     * <code>uint32 LINAGDMNNGF = 3;</code>
     * @return The lINAGDMNNGF.
     */
    int getLINAGDMNNGF();
  }
  /**
   * <pre>
   * Obf: PLCFJBMLEGG
   * </pre>
   *
   * Protobuf type {@code TowerMonthlyBrief}
   */
  public static final class TowerMonthlyBrief extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerMonthlyBrief)
      TowerMonthlyBriefOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerMonthlyBrief.newBuilder() to construct.
    private TowerMonthlyBrief(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerMonthlyBrief() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerMonthlyBrief();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerMonthlyBrief(
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
            case 24: {

              lINAGDMNNGF_ = input.readUInt32();
              break;
            }
            case 40: {

              lJGBNNKAJOF_ = input.readUInt32();
              break;
            }
            case 48: {

              towerScheduleId_ = input.readUInt32();
              break;
            }
            case 112: {

              fGDCNEJCNJO_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.class, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder.class);
    }

    public static final int LJGBNNKAJOF_FIELD_NUMBER = 5;
    private int lJGBNNKAJOF_;
    /**
     * <code>uint32 LJGBNNKAJOF = 5;</code>
     * @return The lJGBNNKAJOF.
     */
    @java.lang.Override
    public int getLJGBNNKAJOF() {
      return lJGBNNKAJOF_;
    }

    public static final int FGDCNEJCNJO_FIELD_NUMBER = 14;
    private int fGDCNEJCNJO_;
    /**
     * <code>uint32 FGDCNEJCNJO = 14;</code>
     * @return The fGDCNEJCNJO.
     */
    @java.lang.Override
    public int getFGDCNEJCNJO() {
      return fGDCNEJCNJO_;
    }

    public static final int TOWER_SCHEDULE_ID_FIELD_NUMBER = 6;
    private int towerScheduleId_;
    /**
     * <code>uint32 tower_schedule_id = 6;</code>
     * @return The towerScheduleId.
     */
    @java.lang.Override
    public int getTowerScheduleId() {
      return towerScheduleId_;
    }

    public static final int LINAGDMNNGF_FIELD_NUMBER = 3;
    private int lINAGDMNNGF_;
    /**
     * <code>uint32 LINAGDMNNGF = 3;</code>
     * @return The lINAGDMNNGF.
     */
    @java.lang.Override
    public int getLINAGDMNNGF() {
      return lINAGDMNNGF_;
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
      if (lINAGDMNNGF_ != 0) {
        output.writeUInt32(3, lINAGDMNNGF_);
      }
      if (lJGBNNKAJOF_ != 0) {
        output.writeUInt32(5, lJGBNNKAJOF_);
      }
      if (towerScheduleId_ != 0) {
        output.writeUInt32(6, towerScheduleId_);
      }
      if (fGDCNEJCNJO_ != 0) {
        output.writeUInt32(14, fGDCNEJCNJO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lINAGDMNNGF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, lINAGDMNNGF_);
      }
      if (lJGBNNKAJOF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, lJGBNNKAJOF_);
      }
      if (towerScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, towerScheduleId_);
      }
      if (fGDCNEJCNJO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, fGDCNEJCNJO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief other = (emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief) obj;

      if (getLJGBNNKAJOF()
          != other.getLJGBNNKAJOF()) return false;
      if (getFGDCNEJCNJO()
          != other.getFGDCNEJCNJO()) return false;
      if (getTowerScheduleId()
          != other.getTowerScheduleId()) return false;
      if (getLINAGDMNNGF()
          != other.getLINAGDMNNGF()) return false;
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
      hash = (37 * hash) + LJGBNNKAJOF_FIELD_NUMBER;
      hash = (53 * hash) + getLJGBNNKAJOF();
      hash = (37 * hash) + FGDCNEJCNJO_FIELD_NUMBER;
      hash = (53 * hash) + getFGDCNEJCNJO();
      hash = (37 * hash) + TOWER_SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTowerScheduleId();
      hash = (37 * hash) + LINAGDMNNGF_FIELD_NUMBER;
      hash = (53 * hash) + getLINAGDMNNGF();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief prototype) {
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
     * Obf: PLCFJBMLEGG
     * </pre>
     *
     * Protobuf type {@code TowerMonthlyBrief}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerMonthlyBrief)
        emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.class, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.newBuilder()
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
        lJGBNNKAJOF_ = 0;

        fGDCNEJCNJO_ = 0;

        towerScheduleId_ = 0;

        lINAGDMNNGF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief build() {
        emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief buildPartial() {
        emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief result = new emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief(this);
        result.lJGBNNKAJOF_ = lJGBNNKAJOF_;
        result.fGDCNEJCNJO_ = fGDCNEJCNJO_;
        result.towerScheduleId_ = towerScheduleId_;
        result.lINAGDMNNGF_ = lINAGDMNNGF_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief) {
          return mergeFrom((emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief other) {
        if (other == emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance()) return this;
        if (other.getLJGBNNKAJOF() != 0) {
          setLJGBNNKAJOF(other.getLJGBNNKAJOF());
        }
        if (other.getFGDCNEJCNJO() != 0) {
          setFGDCNEJCNJO(other.getFGDCNEJCNJO());
        }
        if (other.getTowerScheduleId() != 0) {
          setTowerScheduleId(other.getTowerScheduleId());
        }
        if (other.getLINAGDMNNGF() != 0) {
          setLINAGDMNNGF(other.getLINAGDMNNGF());
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
        emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int lJGBNNKAJOF_ ;
      /**
       * <code>uint32 LJGBNNKAJOF = 5;</code>
       * @return The lJGBNNKAJOF.
       */
      @java.lang.Override
      public int getLJGBNNKAJOF() {
        return lJGBNNKAJOF_;
      }
      /**
       * <code>uint32 LJGBNNKAJOF = 5;</code>
       * @param value The lJGBNNKAJOF to set.
       * @return This builder for chaining.
       */
      public Builder setLJGBNNKAJOF(int value) {
        
        lJGBNNKAJOF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LJGBNNKAJOF = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLJGBNNKAJOF() {
        
        lJGBNNKAJOF_ = 0;
        onChanged();
        return this;
      }

      private int fGDCNEJCNJO_ ;
      /**
       * <code>uint32 FGDCNEJCNJO = 14;</code>
       * @return The fGDCNEJCNJO.
       */
      @java.lang.Override
      public int getFGDCNEJCNJO() {
        return fGDCNEJCNJO_;
      }
      /**
       * <code>uint32 FGDCNEJCNJO = 14;</code>
       * @param value The fGDCNEJCNJO to set.
       * @return This builder for chaining.
       */
      public Builder setFGDCNEJCNJO(int value) {
        
        fGDCNEJCNJO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FGDCNEJCNJO = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFGDCNEJCNJO() {
        
        fGDCNEJCNJO_ = 0;
        onChanged();
        return this;
      }

      private int towerScheduleId_ ;
      /**
       * <code>uint32 tower_schedule_id = 6;</code>
       * @return The towerScheduleId.
       */
      @java.lang.Override
      public int getTowerScheduleId() {
        return towerScheduleId_;
      }
      /**
       * <code>uint32 tower_schedule_id = 6;</code>
       * @param value The towerScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setTowerScheduleId(int value) {
        
        towerScheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 tower_schedule_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTowerScheduleId() {
        
        towerScheduleId_ = 0;
        onChanged();
        return this;
      }

      private int lINAGDMNNGF_ ;
      /**
       * <code>uint32 LINAGDMNNGF = 3;</code>
       * @return The lINAGDMNNGF.
       */
      @java.lang.Override
      public int getLINAGDMNNGF() {
        return lINAGDMNNGF_;
      }
      /**
       * <code>uint32 LINAGDMNNGF = 3;</code>
       * @param value The lINAGDMNNGF to set.
       * @return This builder for chaining.
       */
      public Builder setLINAGDMNNGF(int value) {
        
        lINAGDMNNGF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LINAGDMNNGF = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLINAGDMNNGF() {
        
        lINAGDMNNGF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerMonthlyBrief)
    }

    // @@protoc_insertion_point(class_scope:TowerMonthlyBrief)
    private static final emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief();
    }

    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerMonthlyBrief>
        PARSER = new com.google.protobuf.AbstractParser<TowerMonthlyBrief>() {
      @java.lang.Override
      public TowerMonthlyBrief parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerMonthlyBrief(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerMonthlyBrief> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerMonthlyBrief> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerMonthlyBrief_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerMonthlyBrief_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027TowerMonthlyBrief.proto\"m\n\021TowerMonthl" +
      "yBrief\022\023\n\013LJGBNNKAJOF\030\005 \001(\r\022\023\n\013FGDCNEJCN" +
      "JO\030\016 \001(\r\022\031\n\021tower_schedule_id\030\006 \001(\r\022\023\n\013L" +
      "INAGDMNNGF\030\003 \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerMonthlyBrief_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerMonthlyBrief_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerMonthlyBrief_descriptor,
        new java.lang.String[] { "LJGBNNKAJOF", "FGDCNEJCNJO", "TowerScheduleId", "LINAGDMNNGF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
