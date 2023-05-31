// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JigsawPictureData.proto

package emu.grasscutter.net.proto;

public final class JigsawPictureDataOuterClass {
  private JigsawPictureDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JigsawPictureDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JigsawPictureData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 HKLBAPAMEOK = 14;</code>
     * @return The hKLBAPAMEOK.
     */
    int getHKLBAPAMEOK();

    /**
     * <code>uint32 APNDNCIJLKB = 15;</code>
     * @return The aPNDNCIJLKB.
     */
    int getAPNDNCIJLKB();

    /**
     * <code>bool is_finished = 1;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();
  }
  /**
   * <pre>
   * Obf: MPBCMDGDHHA
   * </pre>
   *
   * Protobuf type {@code JigsawPictureData}
   */
  public static final class JigsawPictureData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JigsawPictureData)
      JigsawPictureDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JigsawPictureData.newBuilder() to construct.
    private JigsawPictureData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JigsawPictureData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JigsawPictureData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JigsawPictureData(
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

              isFinished_ = input.readBool();
              break;
            }
            case 64: {

              isOpen_ = input.readBool();
              break;
            }
            case 112: {

              hKLBAPAMEOK_ = input.readUInt32();
              break;
            }
            case 120: {

              aPNDNCIJLKB_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.class, emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.Builder.class);
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

    public static final int HKLBAPAMEOK_FIELD_NUMBER = 14;
    private int hKLBAPAMEOK_;
    /**
     * <code>uint32 HKLBAPAMEOK = 14;</code>
     * @return The hKLBAPAMEOK.
     */
    @java.lang.Override
    public int getHKLBAPAMEOK() {
      return hKLBAPAMEOK_;
    }

    public static final int APNDNCIJLKB_FIELD_NUMBER = 15;
    private int aPNDNCIJLKB_;
    /**
     * <code>uint32 APNDNCIJLKB = 15;</code>
     * @return The aPNDNCIJLKB.
     */
    @java.lang.Override
    public int getAPNDNCIJLKB() {
      return aPNDNCIJLKB_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 1;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 1;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
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
      if (isFinished_ != false) {
        output.writeBool(1, isFinished_);
      }
      if (isOpen_ != false) {
        output.writeBool(8, isOpen_);
      }
      if (hKLBAPAMEOK_ != 0) {
        output.writeUInt32(14, hKLBAPAMEOK_);
      }
      if (aPNDNCIJLKB_ != 0) {
        output.writeUInt32(15, aPNDNCIJLKB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isFinished_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isOpen_);
      }
      if (hKLBAPAMEOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, hKLBAPAMEOK_);
      }
      if (aPNDNCIJLKB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, aPNDNCIJLKB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData other = (emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getHKLBAPAMEOK()
          != other.getHKLBAPAMEOK()) return false;
      if (getAPNDNCIJLKB()
          != other.getAPNDNCIJLKB()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
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
      hash = (37 * hash) + HKLBAPAMEOK_FIELD_NUMBER;
      hash = (53 * hash) + getHKLBAPAMEOK();
      hash = (37 * hash) + APNDNCIJLKB_FIELD_NUMBER;
      hash = (53 * hash) + getAPNDNCIJLKB();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData prototype) {
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
     * Obf: MPBCMDGDHHA
     * </pre>
     *
     * Protobuf type {@code JigsawPictureData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JigsawPictureData)
        emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.class, emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.newBuilder()
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

        hKLBAPAMEOK_ = 0;

        aPNDNCIJLKB_ = 0;

        isFinished_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData build() {
        emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData buildPartial() {
        emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData result = new emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData(this);
        result.isOpen_ = isOpen_;
        result.hKLBAPAMEOK_ = hKLBAPAMEOK_;
        result.aPNDNCIJLKB_ = aPNDNCIJLKB_;
        result.isFinished_ = isFinished_;
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
        if (other instanceof emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData) {
          return mergeFrom((emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData other) {
        if (other == emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getHKLBAPAMEOK() != 0) {
          setHKLBAPAMEOK(other.getHKLBAPAMEOK());
        }
        if (other.getAPNDNCIJLKB() != 0) {
          setAPNDNCIJLKB(other.getAPNDNCIJLKB());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
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
        emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private int hKLBAPAMEOK_ ;
      /**
       * <code>uint32 HKLBAPAMEOK = 14;</code>
       * @return The hKLBAPAMEOK.
       */
      @java.lang.Override
      public int getHKLBAPAMEOK() {
        return hKLBAPAMEOK_;
      }
      /**
       * <code>uint32 HKLBAPAMEOK = 14;</code>
       * @param value The hKLBAPAMEOK to set.
       * @return This builder for chaining.
       */
      public Builder setHKLBAPAMEOK(int value) {
        
        hKLBAPAMEOK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HKLBAPAMEOK = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHKLBAPAMEOK() {
        
        hKLBAPAMEOK_ = 0;
        onChanged();
        return this;
      }

      private int aPNDNCIJLKB_ ;
      /**
       * <code>uint32 APNDNCIJLKB = 15;</code>
       * @return The aPNDNCIJLKB.
       */
      @java.lang.Override
      public int getAPNDNCIJLKB() {
        return aPNDNCIJLKB_;
      }
      /**
       * <code>uint32 APNDNCIJLKB = 15;</code>
       * @param value The aPNDNCIJLKB to set.
       * @return This builder for chaining.
       */
      public Builder setAPNDNCIJLKB(int value) {
        
        aPNDNCIJLKB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 APNDNCIJLKB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAPNDNCIJLKB() {
        
        aPNDNCIJLKB_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 1;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 1;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
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


      // @@protoc_insertion_point(builder_scope:JigsawPictureData)
    }

    // @@protoc_insertion_point(class_scope:JigsawPictureData)
    private static final emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData();
    }

    public static emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JigsawPictureData>
        PARSER = new com.google.protobuf.AbstractParser<JigsawPictureData>() {
      @java.lang.Override
      public JigsawPictureData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JigsawPictureData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JigsawPictureData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JigsawPictureData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JigsawPictureData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JigsawPictureData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027JigsawPictureData.proto\"c\n\021JigsawPictu" +
      "reData\022\017\n\007is_open\030\010 \001(\010\022\023\n\013HKLBAPAMEOK\030\016" +
      " \001(\r\022\023\n\013APNDNCIJLKB\030\017 \001(\r\022\023\n\013is_finished" +
      "\030\001 \001(\010B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JigsawPictureData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JigsawPictureData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JigsawPictureData_descriptor,
        new java.lang.String[] { "IsOpen", "HKLBAPAMEOK", "APNDNCIJLKB", "IsFinished", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
