// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMetaReInitOverrideMap.proto

package emu.grasscutter.net.proto;

public final class AbilityMetaReInitOverrideMapOuterClass {
  private AbilityMetaReInitOverrideMapOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMetaReInitOverrideMapOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMetaReInitOverrideMap)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> 
        getOverrideMapList();
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getOverrideMap(int index);
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    int getOverrideMapCount();
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> 
        getOverrideMapOrBuilderList();
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getOverrideMapOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: DKNHIBDBJDH
   * </pre>
   *
   * Protobuf type {@code AbilityMetaReInitOverrideMap}
   */
  public static final class AbilityMetaReInitOverrideMap extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMetaReInitOverrideMap)
      AbilityMetaReInitOverrideMapOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMetaReInitOverrideMap.newBuilder() to construct.
    private AbilityMetaReInitOverrideMap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMetaReInitOverrideMap() {
      overrideMap_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMetaReInitOverrideMap();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityMetaReInitOverrideMap(
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
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                overrideMap_ = new java.util.ArrayList<emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>();
                mutable_bitField0_ |= 0x00000001;
              }
              overrideMap_.add(
                  input.readMessage(emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.parser(), extensionRegistry));
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
          overrideMap_ = java.util.Collections.unmodifiableList(overrideMap_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.class, emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.Builder.class);
    }

    public static final int OVERRIDE_MAP_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> overrideMap_;
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getOverrideMapList() {
      return overrideMap_;
    }
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> 
        getOverrideMapOrBuilderList() {
      return overrideMap_;
    }
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    @java.lang.Override
    public int getOverrideMapCount() {
      return overrideMap_.size();
    }
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getOverrideMap(int index) {
      return overrideMap_.get(index);
    }
    /**
     * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getOverrideMapOrBuilder(
        int index) {
      return overrideMap_.get(index);
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
      for (int i = 0; i < overrideMap_.size(); i++) {
        output.writeMessage(10, overrideMap_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < overrideMap_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, overrideMap_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap other = (emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap) obj;

      if (!getOverrideMapList()
          .equals(other.getOverrideMapList())) return false;
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
      if (getOverrideMapCount() > 0) {
        hash = (37 * hash) + OVERRIDE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + getOverrideMapList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap prototype) {
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
     * Obf: DKNHIBDBJDH
     * </pre>
     *
     * Protobuf type {@code AbilityMetaReInitOverrideMap}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMetaReInitOverrideMap)
        emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMapOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.class, emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.newBuilder()
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
          getOverrideMapFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (overrideMapBuilder_ == null) {
          overrideMap_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          overrideMapBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.internal_static_AbilityMetaReInitOverrideMap_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap build() {
        emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap buildPartial() {
        emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap result = new emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap(this);
        int from_bitField0_ = bitField0_;
        if (overrideMapBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            overrideMap_ = java.util.Collections.unmodifiableList(overrideMap_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.overrideMap_ = overrideMap_;
        } else {
          result.overrideMap_ = overrideMapBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap other) {
        if (other == emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap.getDefaultInstance()) return this;
        if (overrideMapBuilder_ == null) {
          if (!other.overrideMap_.isEmpty()) {
            if (overrideMap_.isEmpty()) {
              overrideMap_ = other.overrideMap_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOverrideMapIsMutable();
              overrideMap_.addAll(other.overrideMap_);
            }
            onChanged();
          }
        } else {
          if (!other.overrideMap_.isEmpty()) {
            if (overrideMapBuilder_.isEmpty()) {
              overrideMapBuilder_.dispose();
              overrideMapBuilder_ = null;
              overrideMap_ = other.overrideMap_;
              bitField0_ = (bitField0_ & ~0x00000001);
              overrideMapBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOverrideMapFieldBuilder() : null;
            } else {
              overrideMapBuilder_.addAllMessages(other.overrideMap_);
            }
          }
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
        emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> overrideMap_ =
        java.util.Collections.emptyList();
      private void ensureOverrideMapIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          overrideMap_ = new java.util.ArrayList<emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry>(overrideMap_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> overrideMapBuilder_;

      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> getOverrideMapList() {
        if (overrideMapBuilder_ == null) {
          return java.util.Collections.unmodifiableList(overrideMap_);
        } else {
          return overrideMapBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public int getOverrideMapCount() {
        if (overrideMapBuilder_ == null) {
          return overrideMap_.size();
        } else {
          return overrideMapBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry getOverrideMap(int index) {
        if (overrideMapBuilder_ == null) {
          return overrideMap_.get(index);
        } else {
          return overrideMapBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder setOverrideMap(
          int index, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
        if (overrideMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOverrideMapIsMutable();
          overrideMap_.set(index, value);
          onChanged();
        } else {
          overrideMapBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder setOverrideMap(
          int index, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
        if (overrideMapBuilder_ == null) {
          ensureOverrideMapIsMutable();
          overrideMap_.set(index, builderForValue.build());
          onChanged();
        } else {
          overrideMapBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder addOverrideMap(emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
        if (overrideMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOverrideMapIsMutable();
          overrideMap_.add(value);
          onChanged();
        } else {
          overrideMapBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder addOverrideMap(
          int index, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry value) {
        if (overrideMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOverrideMapIsMutable();
          overrideMap_.add(index, value);
          onChanged();
        } else {
          overrideMapBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder addOverrideMap(
          emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
        if (overrideMapBuilder_ == null) {
          ensureOverrideMapIsMutable();
          overrideMap_.add(builderForValue.build());
          onChanged();
        } else {
          overrideMapBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder addOverrideMap(
          int index, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder builderForValue) {
        if (overrideMapBuilder_ == null) {
          ensureOverrideMapIsMutable();
          overrideMap_.add(index, builderForValue.build());
          onChanged();
        } else {
          overrideMapBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder addAllOverrideMap(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry> values) {
        if (overrideMapBuilder_ == null) {
          ensureOverrideMapIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, overrideMap_);
          onChanged();
        } else {
          overrideMapBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder clearOverrideMap() {
        if (overrideMapBuilder_ == null) {
          overrideMap_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          overrideMapBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public Builder removeOverrideMap(int index) {
        if (overrideMapBuilder_ == null) {
          ensureOverrideMapIsMutable();
          overrideMap_.remove(index);
          onChanged();
        } else {
          overrideMapBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder getOverrideMapBuilder(
          int index) {
        return getOverrideMapFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder getOverrideMapOrBuilder(
          int index) {
        if (overrideMapBuilder_ == null) {
          return overrideMap_.get(index);  } else {
          return overrideMapBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> 
           getOverrideMapOrBuilderList() {
        if (overrideMapBuilder_ != null) {
          return overrideMapBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(overrideMap_);
        }
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder addOverrideMapBuilder() {
        return getOverrideMapFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder addOverrideMapBuilder(
          int index) {
        return getOverrideMapFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .AbilityScalarValueEntry override_map = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder> 
           getOverrideMapBuilderList() {
        return getOverrideMapFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder> 
          getOverrideMapFieldBuilder() {
        if (overrideMapBuilder_ == null) {
          overrideMapBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntry.Builder, emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.AbilityScalarValueEntryOrBuilder>(
                  overrideMap_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          overrideMap_ = null;
        }
        return overrideMapBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AbilityMetaReInitOverrideMap)
    }

    // @@protoc_insertion_point(class_scope:AbilityMetaReInitOverrideMap)
    private static final emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap();
    }

    public static emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMetaReInitOverrideMap>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMetaReInitOverrideMap>() {
      @java.lang.Override
      public AbilityMetaReInitOverrideMap parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityMetaReInitOverrideMap(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityMetaReInitOverrideMap> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMetaReInitOverrideMap> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityMetaReInitOverrideMapOuterClass.AbilityMetaReInitOverrideMap getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMetaReInitOverrideMap_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMetaReInitOverrideMap_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"AbilityMetaReInitOverrideMap.proto\032\035Ab" +
      "ilityScalarValueEntry.proto\"N\n\034AbilityMe" +
      "taReInitOverrideMap\022.\n\014override_map\030\n \003(" +
      "\0132\030.AbilityScalarValueEntryB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.getDescriptor(),
        });
    internal_static_AbilityMetaReInitOverrideMap_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMetaReInitOverrideMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMetaReInitOverrideMap_descriptor,
        new java.lang.String[] { "OverrideMap", });
    emu.grasscutter.net.proto.AbilityScalarValueEntryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
