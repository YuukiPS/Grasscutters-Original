// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairV2MusicGameInfo.proto

package emu.grasscutter.net.proto;

public final class FleurFairV2MusicGameInfoOuterClass {
  private FleurFairV2MusicGameInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairV2MusicGameInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairV2MusicGameInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */
    int getMusicGameRecordMapCount();
    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */
    boolean containsMusicGameRecordMap(
        int key);
    /**
     * Use {@link #getMusicGameRecordMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>
    getMusicGameRecordMap();
    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>
    getMusicGameRecordMapMap();
    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */

    emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrDefault(
        int key,
        emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord defaultValue);
    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */

    emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * Obf: CBKMKJIHFIO
   * </pre>
   *
   * Protobuf type {@code FleurFairV2MusicGameInfo}
   */
  public static final class FleurFairV2MusicGameInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairV2MusicGameInfo)
      FleurFairV2MusicGameInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairV2MusicGameInfo.newBuilder() to construct.
    private FleurFairV2MusicGameInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairV2MusicGameInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairV2MusicGameInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairV2MusicGameInfo(
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
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                musicGameRecordMap_ = com.google.protobuf.MapField.newMapField(
                    MusicGameRecordMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>
              musicGameRecordMap__ = input.readMessage(
                  MusicGameRecordMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              musicGameRecordMap_.getMutableMap().put(
                  musicGameRecordMap__.getKey(), musicGameRecordMap__.getValue());
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
      return emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.internal_static_FleurFairV2MusicGameInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 9:
          return internalGetMusicGameRecordMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.internal_static_FleurFairV2MusicGameInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo.class, emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo.Builder.class);
    }

    public static final int MUSIC_GAME_RECORD_MAP_FIELD_NUMBER = 9;
    private static final class MusicGameRecordMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>newDefaultInstance(
                  emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.internal_static_FleurFairV2MusicGameInfo_MusicGameRecordMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> musicGameRecordMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>
    internalGetMusicGameRecordMap() {
      if (musicGameRecordMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MusicGameRecordMapDefaultEntryHolder.defaultEntry);
      }
      return musicGameRecordMap_;
    }

    public int getMusicGameRecordMapCount() {
      return internalGetMusicGameRecordMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */

    @java.lang.Override
    public boolean containsMusicGameRecordMap(
        int key) {
      
      return internalGetMusicGameRecordMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMusicGameRecordMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMap() {
      return getMusicGameRecordMapMap();
    }
    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMapMap() {
      return internalGetMusicGameRecordMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrDefault(
        int key,
        emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> map =
          internalGetMusicGameRecordMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> map =
          internalGetMusicGameRecordMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetMusicGameRecordMap(),
          MusicGameRecordMapDefaultEntryHolder.defaultEntry,
          9);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> entry
           : internalGetMusicGameRecordMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>
        musicGameRecordMap__ = MusicGameRecordMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(9, musicGameRecordMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo other = (emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo) obj;

      if (!internalGetMusicGameRecordMap().equals(
          other.internalGetMusicGameRecordMap())) return false;
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
      if (!internalGetMusicGameRecordMap().getMap().isEmpty()) {
        hash = (37 * hash) + MUSIC_GAME_RECORD_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetMusicGameRecordMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo prototype) {
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
     * Obf: CBKMKJIHFIO
     * </pre>
     *
     * Protobuf type {@code FleurFairV2MusicGameInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairV2MusicGameInfo)
        emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.internal_static_FleurFairV2MusicGameInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 9:
            return internalGetMusicGameRecordMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 9:
            return internalGetMutableMusicGameRecordMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.internal_static_FleurFairV2MusicGameInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo.class, emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo.newBuilder()
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
        internalGetMutableMusicGameRecordMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.internal_static_FleurFairV2MusicGameInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo build() {
        emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo buildPartial() {
        emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo result = new emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo(this);
        int from_bitField0_ = bitField0_;
        result.musicGameRecordMap_ = internalGetMusicGameRecordMap();
        result.musicGameRecordMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo other) {
        if (other == emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo.getDefaultInstance()) return this;
        internalGetMutableMusicGameRecordMap().mergeFrom(
            other.internalGetMusicGameRecordMap());
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
        emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> musicGameRecordMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>
      internalGetMusicGameRecordMap() {
        if (musicGameRecordMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              MusicGameRecordMapDefaultEntryHolder.defaultEntry);
        }
        return musicGameRecordMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>
      internalGetMutableMusicGameRecordMap() {
        onChanged();;
        if (musicGameRecordMap_ == null) {
          musicGameRecordMap_ = com.google.protobuf.MapField.newMapField(
              MusicGameRecordMapDefaultEntryHolder.defaultEntry);
        }
        if (!musicGameRecordMap_.isMutable()) {
          musicGameRecordMap_ = musicGameRecordMap_.copy();
        }
        return musicGameRecordMap_;
      }

      public int getMusicGameRecordMapCount() {
        return internalGetMusicGameRecordMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
       */

      @java.lang.Override
      public boolean containsMusicGameRecordMap(
          int key) {
        
        return internalGetMusicGameRecordMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getMusicGameRecordMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMap() {
        return getMusicGameRecordMapMap();
      }
      /**
       * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMapMap() {
        return internalGetMusicGameRecordMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrDefault(
          int key,
          emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> map =
            internalGetMusicGameRecordMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> map =
            internalGetMusicGameRecordMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearMusicGameRecordMap() {
        internalGetMutableMusicGameRecordMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
       */

      public Builder removeMusicGameRecordMap(
          int key) {
        
        internalGetMutableMusicGameRecordMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord>
      getMutableMusicGameRecordMap() {
        return internalGetMutableMusicGameRecordMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
       */
      public Builder putMusicGameRecordMap(
          int key,
          emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableMusicGameRecordMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .MusicGameRecord&gt; music_game_record_map = 9;</code>
       */

      public Builder putAllMusicGameRecordMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.MusicGameRecordOuterClass.MusicGameRecord> values) {
        internalGetMutableMusicGameRecordMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:FleurFairV2MusicGameInfo)
    }

    // @@protoc_insertion_point(class_scope:FleurFairV2MusicGameInfo)
    private static final emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo();
    }

    public static emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairV2MusicGameInfo>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairV2MusicGameInfo>() {
      @java.lang.Override
      public FleurFairV2MusicGameInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairV2MusicGameInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairV2MusicGameInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairV2MusicGameInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FleurFairV2MusicGameInfoOuterClass.FleurFairV2MusicGameInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairV2MusicGameInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairV2MusicGameInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairV2MusicGameInfo_MusicGameRecordMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairV2MusicGameInfo_MusicGameRecordMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036FleurFairV2MusicGameInfo.proto\032\025MusicG" +
      "ameRecord.proto\"\271\001\n\030FleurFairV2MusicGame" +
      "Info\022P\n\025music_game_record_map\030\t \003(\01321.Fl" +
      "eurFairV2MusicGameInfo.MusicGameRecordMa" +
      "pEntry\032K\n\027MusicGameRecordMapEntry\022\013\n\003key" +
      "\030\001 \001(\r\022\037\n\005value\030\002 \001(\0132\020.MusicGameRecord:" +
      "\0028\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MusicGameRecordOuterClass.getDescriptor(),
        });
    internal_static_FleurFairV2MusicGameInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairV2MusicGameInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairV2MusicGameInfo_descriptor,
        new java.lang.String[] { "MusicGameRecordMap", });
    internal_static_FleurFairV2MusicGameInfo_MusicGameRecordMapEntry_descriptor =
      internal_static_FleurFairV2MusicGameInfo_descriptor.getNestedTypes().get(0);
    internal_static_FleurFairV2MusicGameInfo_MusicGameRecordMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairV2MusicGameInfo_MusicGameRecordMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.MusicGameRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
