// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityInvokeEntryHead.proto

package emu.grasscutter.net.proto;

public final class AbilityInvokeEntryHeadOuterClass {
  private AbilityInvokeEntryHeadOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityInvokeEntryHeadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityInvokeEntryHead)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 local_id = 1;</code>
     * @return The localId.
     */
    int getLocalId();

    /**
     * <code>uint32 server_buff_uid = 5;</code>
     * @return The serverBuffUid.
     */
    int getServerBuffUid();

    /**
     * <code>int32 modifier_config_local_id = 6;</code>
     * @return The modifierConfigLocalId.
     */
    int getModifierConfigLocalId();

    /**
     * <code>bool is_serverbuff_modifier = 7;</code>
     * @return The isServerbuffModifier.
     */
    boolean getIsServerbuffModifier();

    /**
     * <code>uint32 instanced_ability_id = 9;</code>
     * @return The instancedAbilityId.
     */
    int getInstancedAbilityId();

    /**
     * <code>uint32 target_id = 13;</code>
     * @return The targetId.
     */
    int getTargetId();

    /**
     * <code>uint32 instanced_modifier_id = 14;</code>
     * @return The instancedModifierId.
     */
    int getInstancedModifierId();
  }
  /**
   * Protobuf type {@code AbilityInvokeEntryHead}
   */
  public static final class AbilityInvokeEntryHead extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityInvokeEntryHead)
      AbilityInvokeEntryHeadOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityInvokeEntryHead.newBuilder() to construct.
    private AbilityInvokeEntryHead(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityInvokeEntryHead() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityInvokeEntryHead();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityInvokeEntryHead(
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

              localId_ = input.readInt32();
              break;
            }
            case 40: {

              serverBuffUid_ = input.readUInt32();
              break;
            }
            case 48: {

              modifierConfigLocalId_ = input.readInt32();
              break;
            }
            case 56: {

              isServerbuffModifier_ = input.readBool();
              break;
            }
            case 72: {

              instancedAbilityId_ = input.readUInt32();
              break;
            }
            case 104: {

              targetId_ = input.readUInt32();
              break;
            }
            case 112: {

              instancedModifierId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.class, emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder.class);
    }

    public static final int LOCAL_ID_FIELD_NUMBER = 1;
    private int localId_;
    /**
     * <code>int32 local_id = 1;</code>
     * @return The localId.
     */
    @java.lang.Override
    public int getLocalId() {
      return localId_;
    }

    public static final int SERVER_BUFF_UID_FIELD_NUMBER = 5;
    private int serverBuffUid_;
    /**
     * <code>uint32 server_buff_uid = 5;</code>
     * @return The serverBuffUid.
     */
    @java.lang.Override
    public int getServerBuffUid() {
      return serverBuffUid_;
    }

    public static final int MODIFIER_CONFIG_LOCAL_ID_FIELD_NUMBER = 6;
    private int modifierConfigLocalId_;
    /**
     * <code>int32 modifier_config_local_id = 6;</code>
     * @return The modifierConfigLocalId.
     */
    @java.lang.Override
    public int getModifierConfigLocalId() {
      return modifierConfigLocalId_;
    }

    public static final int IS_SERVERBUFF_MODIFIER_FIELD_NUMBER = 7;
    private boolean isServerbuffModifier_;
    /**
     * <code>bool is_serverbuff_modifier = 7;</code>
     * @return The isServerbuffModifier.
     */
    @java.lang.Override
    public boolean getIsServerbuffModifier() {
      return isServerbuffModifier_;
    }

    public static final int INSTANCED_ABILITY_ID_FIELD_NUMBER = 9;
    private int instancedAbilityId_;
    /**
     * <code>uint32 instanced_ability_id = 9;</code>
     * @return The instancedAbilityId.
     */
    @java.lang.Override
    public int getInstancedAbilityId() {
      return instancedAbilityId_;
    }

    public static final int TARGET_ID_FIELD_NUMBER = 13;
    private int targetId_;
    /**
     * <code>uint32 target_id = 13;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
    }

    public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 14;
    private int instancedModifierId_;
    /**
     * <code>uint32 instanced_modifier_id = 14;</code>
     * @return The instancedModifierId.
     */
    @java.lang.Override
    public int getInstancedModifierId() {
      return instancedModifierId_;
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
      if (localId_ != 0) {
        output.writeInt32(1, localId_);
      }
      if (serverBuffUid_ != 0) {
        output.writeUInt32(5, serverBuffUid_);
      }
      if (modifierConfigLocalId_ != 0) {
        output.writeInt32(6, modifierConfigLocalId_);
      }
      if (isServerbuffModifier_ != false) {
        output.writeBool(7, isServerbuffModifier_);
      }
      if (instancedAbilityId_ != 0) {
        output.writeUInt32(9, instancedAbilityId_);
      }
      if (targetId_ != 0) {
        output.writeUInt32(13, targetId_);
      }
      if (instancedModifierId_ != 0) {
        output.writeUInt32(14, instancedModifierId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (localId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, localId_);
      }
      if (serverBuffUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, serverBuffUid_);
      }
      if (modifierConfigLocalId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, modifierConfigLocalId_);
      }
      if (isServerbuffModifier_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isServerbuffModifier_);
      }
      if (instancedAbilityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, instancedAbilityId_);
      }
      if (targetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, targetId_);
      }
      if (instancedModifierId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, instancedModifierId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead other = (emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead) obj;

      if (getLocalId()
          != other.getLocalId()) return false;
      if (getServerBuffUid()
          != other.getServerBuffUid()) return false;
      if (getModifierConfigLocalId()
          != other.getModifierConfigLocalId()) return false;
      if (getIsServerbuffModifier()
          != other.getIsServerbuffModifier()) return false;
      if (getInstancedAbilityId()
          != other.getInstancedAbilityId()) return false;
      if (getTargetId()
          != other.getTargetId()) return false;
      if (getInstancedModifierId()
          != other.getInstancedModifierId()) return false;
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
      hash = (37 * hash) + LOCAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLocalId();
      hash = (37 * hash) + SERVER_BUFF_UID_FIELD_NUMBER;
      hash = (53 * hash) + getServerBuffUid();
      hash = (37 * hash) + MODIFIER_CONFIG_LOCAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModifierConfigLocalId();
      hash = (37 * hash) + IS_SERVERBUFF_MODIFIER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsServerbuffModifier());
      hash = (37 * hash) + INSTANCED_ABILITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedAbilityId();
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId();
      hash = (37 * hash) + INSTANCED_MODIFIER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedModifierId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead prototype) {
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
     * Protobuf type {@code AbilityInvokeEntryHead}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityInvokeEntryHead)
        emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHeadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.class, emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.newBuilder()
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
        localId_ = 0;

        serverBuffUid_ = 0;

        modifierConfigLocalId_ = 0;

        isServerbuffModifier_ = false;

        instancedAbilityId_ = 0;

        targetId_ = 0;

        instancedModifierId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.internal_static_AbilityInvokeEntryHead_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead build() {
        emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead buildPartial() {
        emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead result = new emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead(this);
        result.localId_ = localId_;
        result.serverBuffUid_ = serverBuffUid_;
        result.modifierConfigLocalId_ = modifierConfigLocalId_;
        result.isServerbuffModifier_ = isServerbuffModifier_;
        result.instancedAbilityId_ = instancedAbilityId_;
        result.targetId_ = targetId_;
        result.instancedModifierId_ = instancedModifierId_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead other) {
        if (other == emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead.getDefaultInstance()) return this;
        if (other.getLocalId() != 0) {
          setLocalId(other.getLocalId());
        }
        if (other.getServerBuffUid() != 0) {
          setServerBuffUid(other.getServerBuffUid());
        }
        if (other.getModifierConfigLocalId() != 0) {
          setModifierConfigLocalId(other.getModifierConfigLocalId());
        }
        if (other.getIsServerbuffModifier() != false) {
          setIsServerbuffModifier(other.getIsServerbuffModifier());
        }
        if (other.getInstancedAbilityId() != 0) {
          setInstancedAbilityId(other.getInstancedAbilityId());
        }
        if (other.getTargetId() != 0) {
          setTargetId(other.getTargetId());
        }
        if (other.getInstancedModifierId() != 0) {
          setInstancedModifierId(other.getInstancedModifierId());
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
        emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int localId_ ;
      /**
       * <code>int32 local_id = 1;</code>
       * @return The localId.
       */
      @java.lang.Override
      public int getLocalId() {
        return localId_;
      }
      /**
       * <code>int32 local_id = 1;</code>
       * @param value The localId to set.
       * @return This builder for chaining.
       */
      public Builder setLocalId(int value) {
        
        localId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 local_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocalId() {
        
        localId_ = 0;
        onChanged();
        return this;
      }

      private int serverBuffUid_ ;
      /**
       * <code>uint32 server_buff_uid = 5;</code>
       * @return The serverBuffUid.
       */
      @java.lang.Override
      public int getServerBuffUid() {
        return serverBuffUid_;
      }
      /**
       * <code>uint32 server_buff_uid = 5;</code>
       * @param value The serverBuffUid to set.
       * @return This builder for chaining.
       */
      public Builder setServerBuffUid(int value) {
        
        serverBuffUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 server_buff_uid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerBuffUid() {
        
        serverBuffUid_ = 0;
        onChanged();
        return this;
      }

      private int modifierConfigLocalId_ ;
      /**
       * <code>int32 modifier_config_local_id = 6;</code>
       * @return The modifierConfigLocalId.
       */
      @java.lang.Override
      public int getModifierConfigLocalId() {
        return modifierConfigLocalId_;
      }
      /**
       * <code>int32 modifier_config_local_id = 6;</code>
       * @param value The modifierConfigLocalId to set.
       * @return This builder for chaining.
       */
      public Builder setModifierConfigLocalId(int value) {
        
        modifierConfigLocalId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 modifier_config_local_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearModifierConfigLocalId() {
        
        modifierConfigLocalId_ = 0;
        onChanged();
        return this;
      }

      private boolean isServerbuffModifier_ ;
      /**
       * <code>bool is_serverbuff_modifier = 7;</code>
       * @return The isServerbuffModifier.
       */
      @java.lang.Override
      public boolean getIsServerbuffModifier() {
        return isServerbuffModifier_;
      }
      /**
       * <code>bool is_serverbuff_modifier = 7;</code>
       * @param value The isServerbuffModifier to set.
       * @return This builder for chaining.
       */
      public Builder setIsServerbuffModifier(boolean value) {
        
        isServerbuffModifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_serverbuff_modifier = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsServerbuffModifier() {
        
        isServerbuffModifier_ = false;
        onChanged();
        return this;
      }

      private int instancedAbilityId_ ;
      /**
       * <code>uint32 instanced_ability_id = 9;</code>
       * @return The instancedAbilityId.
       */
      @java.lang.Override
      public int getInstancedAbilityId() {
        return instancedAbilityId_;
      }
      /**
       * <code>uint32 instanced_ability_id = 9;</code>
       * @param value The instancedAbilityId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedAbilityId(int value) {
        
        instancedAbilityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_ability_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedAbilityId() {
        
        instancedAbilityId_ = 0;
        onChanged();
        return this;
      }

      private int targetId_ ;
      /**
       * <code>uint32 target_id = 13;</code>
       * @return The targetId.
       */
      @java.lang.Override
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>uint32 target_id = 13;</code>
       * @param value The targetId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetId(int value) {
        
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetId() {
        
        targetId_ = 0;
        onChanged();
        return this;
      }

      private int instancedModifierId_ ;
      /**
       * <code>uint32 instanced_modifier_id = 14;</code>
       * @return The instancedModifierId.
       */
      @java.lang.Override
      public int getInstancedModifierId() {
        return instancedModifierId_;
      }
      /**
       * <code>uint32 instanced_modifier_id = 14;</code>
       * @param value The instancedModifierId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedModifierId(int value) {
        
        instancedModifierId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_modifier_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedModifierId() {
        
        instancedModifierId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityInvokeEntryHead)
    }

    // @@protoc_insertion_point(class_scope:AbilityInvokeEntryHead)
    private static final emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead();
    }

    public static emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityInvokeEntryHead>
        PARSER = new com.google.protobuf.AbstractParser<AbilityInvokeEntryHead>() {
      @java.lang.Override
      public AbilityInvokeEntryHead parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityInvokeEntryHead(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityInvokeEntryHead> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityInvokeEntryHead> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityInvokeEntryHeadOuterClass.AbilityInvokeEntryHead getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityInvokeEntryHead_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityInvokeEntryHead_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034AbilityInvokeEntryHead.proto\"\325\001\n\026Abili" +
      "tyInvokeEntryHead\022\020\n\010local_id\030\001 \001(\005\022\027\n\017s" +
      "erver_buff_uid\030\005 \001(\r\022 \n\030modifier_config_" +
      "local_id\030\006 \001(\005\022\036\n\026is_serverbuff_modifier" +
      "\030\007 \001(\010\022\034\n\024instanced_ability_id\030\t \001(\r\022\021\n\t" +
      "target_id\030\r \001(\r\022\035\n\025instanced_modifier_id" +
      "\030\016 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityInvokeEntryHead_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityInvokeEntryHead_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityInvokeEntryHead_descriptor,
        new java.lang.String[] { "LocalId", "ServerBuffUid", "ModifierConfigLocalId", "IsServerbuffModifier", "InstancedAbilityId", "TargetId", "InstancedModifierId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
