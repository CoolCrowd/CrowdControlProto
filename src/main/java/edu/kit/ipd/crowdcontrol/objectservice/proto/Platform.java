// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: platform.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

/**
 * Protobuf type {@code crowdcontrol.Platform}
 */
public final class Platform extends
        com.google.protobuf.GeneratedMessage implements
        // @@protoc_insertion_point(message_implements:crowdcontrol.Platform)
        PlatformOrBuilder {
    // Use Platform.newBuilder() to construct.
    private Platform(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
    }

    private Platform() {
        id_ = "";
        name_ = "";
        populations_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private Platform(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
        this();
        int mutable_bitField0_ = 0;
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!input.skipField(tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 10: {
                        String s = input.readStringRequireUtf8();

                        id_ = s;
                        break;
                    }
                    case 18: {
                        String s = input.readStringRequireUtf8();

                        name_ = s;
                        break;
                    }
                    case 26: {
                        if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                            populations_ = new java.util.ArrayList<edu.kit.ipd.crowdcontrol.objectservice.proto.Population>();
                            mutable_bitField0_ |= 0x00000004;
                        }
                        populations_.add(input.readMessage(edu.kit.ipd.crowdcontrol.objectservice.proto.Population.parser(), extensionRegistry));
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
            throw new RuntimeException(
                    new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this));
        } finally {
            if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                populations_ = java.util.Collections.unmodifiableList(populations_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return edu.kit.ipd.crowdcontrol.objectservice.proto.PlatformOuterClass.internal_static_crowdcontrol_Platform_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return edu.kit.ipd.crowdcontrol.objectservice.proto.PlatformOuterClass.internal_static_crowdcontrol_Platform_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        edu.kit.ipd.crowdcontrol.objectservice.proto.Platform.class, edu.kit.ipd.crowdcontrol.objectservice.proto.Platform.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;

    /**
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            id_ = s;
            return s;
        }
    }

    /**
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
    getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            id_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;

    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            name_ = s;
            return s;
        }
    }

    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
    getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            name_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int POPULATIONS_FIELD_NUMBER = 3;
    private java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population> populations_;

    /**
     * <code>repeated .crowdcontrol.Population populations = 3;</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population> getPopulationsList() {
        return populations_;
    }

    /**
     * <code>repeated .crowdcontrol.Population populations = 3;</code>
     */
    public java.util.List<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder>
    getPopulationsOrBuilderList() {
        return populations_;
    }

    /**
     * <code>repeated .crowdcontrol.Population populations = 3;</code>
     */
    public int getPopulationsCount() {
        return populations_.size();
    }

    /**
     * <code>repeated .crowdcontrol.Population populations = 3;</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.proto.Population getPopulations(int index) {
        return populations_.get(index);
    }

    /**
     * <code>repeated .crowdcontrol.Population populations = 3;</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder getPopulationsOrBuilder(
            int index) {
        return populations_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (!getIdBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
        }
        if (!getNameBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessage.writeString(output, 2, name_);
        }
        for (int i = 0; i < populations_.size(); i++) {
            output.writeMessage(3, populations_.get(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getIdBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
        }
        if (!getNameBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessage.computeStringSize(2, name_);
        }
        for (int i = 0; i < populations_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(3, populations_.get(i));
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(edu.kit.ipd.crowdcontrol.objectservice.proto.Platform prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code crowdcontrol.Platform}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:crowdcontrol.Platform)
            edu.kit.ipd.crowdcontrol.objectservice.proto.PlatformOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return edu.kit.ipd.crowdcontrol.objectservice.proto.PlatformOuterClass.internal_static_crowdcontrol_Platform_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return edu.kit.ipd.crowdcontrol.objectservice.proto.PlatformOuterClass.internal_static_crowdcontrol_Platform_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            edu.kit.ipd.crowdcontrol.objectservice.proto.Platform.class, edu.kit.ipd.crowdcontrol.objectservice.proto.Platform.Builder.class);
        }

        // Construct using edu.kit.ipd.crowdcontrol.objectservice.proto.Platform.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                getPopulationsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            id_ = "";

            name_ = "";

            if (populationsBuilder_ == null) {
                populations_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000004);
            } else {
                populationsBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return edu.kit.ipd.crowdcontrol.objectservice.proto.PlatformOuterClass.internal_static_crowdcontrol_Platform_descriptor;
        }

        public edu.kit.ipd.crowdcontrol.objectservice.proto.Platform getDefaultInstanceForType() {
            return edu.kit.ipd.crowdcontrol.objectservice.proto.Platform.getDefaultInstance();
        }

        public edu.kit.ipd.crowdcontrol.objectservice.proto.Platform build() {
            edu.kit.ipd.crowdcontrol.objectservice.proto.Platform result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public edu.kit.ipd.crowdcontrol.objectservice.proto.Platform buildPartial() {
            edu.kit.ipd.crowdcontrol.objectservice.proto.Platform result = new edu.kit.ipd.crowdcontrol.objectservice.proto.Platform(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.id_ = id_;
            result.name_ = name_;
            if (populationsBuilder_ == null) {
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    populations_ = java.util.Collections.unmodifiableList(populations_);
                    bitField0_ = (bitField0_ & ~0x00000004);
                }
                result.populations_ = populations_;
            } else {
                result.populations_ = populationsBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof edu.kit.ipd.crowdcontrol.objectservice.proto.Platform) {
                return mergeFrom((edu.kit.ipd.crowdcontrol.objectservice.proto.Platform) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(edu.kit.ipd.crowdcontrol.objectservice.proto.Platform other) {
            if (other == edu.kit.ipd.crowdcontrol.objectservice.proto.Platform.getDefaultInstance()) return this;
            if (!other.getId().isEmpty()) {
                id_ = other.id_;
                onChanged();
            }
            if (!other.getName().isEmpty()) {
                name_ = other.name_;
                onChanged();
            }
            if (populationsBuilder_ == null) {
                if (!other.populations_.isEmpty()) {
                    if (populations_.isEmpty()) {
                        populations_ = other.populations_;
                        bitField0_ = (bitField0_ & ~0x00000004);
                    } else {
                        ensurePopulationsIsMutable();
                        populations_.addAll(other.populations_);
                    }
                    onChanged();
                }
            } else {
                if (!other.populations_.isEmpty()) {
                    if (populationsBuilder_.isEmpty()) {
                        populationsBuilder_.dispose();
                        populationsBuilder_ = null;
                        populations_ = other.populations_;
                        bitField0_ = (bitField0_ & ~0x00000004);
                        populationsBuilder_ =
                                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                        getPopulationsFieldBuilder() : null;
                    } else {
                        populationsBuilder_.addAllMessages(other.populations_);
                    }
                }
            }
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            edu.kit.ipd.crowdcontrol.objectservice.proto.Platform parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (edu.kit.ipd.crowdcontrol.objectservice.proto.Platform) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private java.lang.Object id_ = "";

        /**
         * <code>optional string id = 1;</code>
         */
        public java.lang.String getId() {
            java.lang.Object ref = id_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                id_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>optional string id = 1;</code>
         */
        public com.google.protobuf.ByteString
        getIdBytes() {
            java.lang.Object ref = id_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                id_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string id = 1;</code>
         */
        public Builder setId(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            id_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string id = 1;</code>
         */
        public Builder clearId() {

            id_ = getDefaultInstance().getId();
            onChanged();
            return this;
        }

        /**
         * <code>optional string id = 1;</code>
         */
        public Builder setIdBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            id_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object name_ = "";

        /**
         * <code>optional string name = 2;</code>
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>optional string name = 2;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string name = 2;</code>
         */
        public Builder setName(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            name_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string name = 2;</code>
         */
        public Builder clearName() {

            name_ = getDefaultInstance().getName();
            onChanged();
            return this;
        }

        /**
         * <code>optional string name = 2;</code>
         */
        public Builder setNameBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            name_ = value;
            onChanged();
            return this;
        }

        private java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population> populations_ =
                java.util.Collections.emptyList();

        private void ensurePopulationsIsMutable() {
            if (!((bitField0_ & 0x00000004) == 0x00000004)) {
                populations_ = new java.util.ArrayList<edu.kit.ipd.crowdcontrol.objectservice.proto.Population>(populations_);
                bitField0_ |= 0x00000004;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilder<
                edu.kit.ipd.crowdcontrol.objectservice.proto.Population, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder, edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder> populationsBuilder_;

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population> getPopulationsList() {
            if (populationsBuilder_ == null) {
                return java.util.Collections.unmodifiableList(populations_);
            } else {
                return populationsBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public int getPopulationsCount() {
            if (populationsBuilder_ == null) {
                return populations_.size();
            } else {
                return populationsBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public edu.kit.ipd.crowdcontrol.objectservice.proto.Population getPopulations(int index) {
            if (populationsBuilder_ == null) {
                return populations_.get(index);
            } else {
                return populationsBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder setPopulations(
                int index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population value) {
            if (populationsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePopulationsIsMutable();
                populations_.set(index, value);
                onChanged();
            } else {
                populationsBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder setPopulations(
                int index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder builderForValue) {
            if (populationsBuilder_ == null) {
                ensurePopulationsIsMutable();
                populations_.set(index, builderForValue.build());
                onChanged();
            } else {
                populationsBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder addPopulations(edu.kit.ipd.crowdcontrol.objectservice.proto.Population value) {
            if (populationsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePopulationsIsMutable();
                populations_.add(value);
                onChanged();
            } else {
                populationsBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder addPopulations(
                int index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population value) {
            if (populationsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePopulationsIsMutable();
                populations_.add(index, value);
                onChanged();
            } else {
                populationsBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder addPopulations(
                edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder builderForValue) {
            if (populationsBuilder_ == null) {
                ensurePopulationsIsMutable();
                populations_.add(builderForValue.build());
                onChanged();
            } else {
                populationsBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder addPopulations(
                int index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder builderForValue) {
            if (populationsBuilder_ == null) {
                ensurePopulationsIsMutable();
                populations_.add(index, builderForValue.build());
                onChanged();
            } else {
                populationsBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder addAllPopulations(
                java.lang.Iterable<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.Population> values) {
            if (populationsBuilder_ == null) {
                ensurePopulationsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, populations_);
                onChanged();
            } else {
                populationsBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder clearPopulations() {
            if (populationsBuilder_ == null) {
                populations_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000004);
                onChanged();
            } else {
                populationsBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public Builder removePopulations(int index) {
            if (populationsBuilder_ == null) {
                ensurePopulationsIsMutable();
                populations_.remove(index);
                onChanged();
            } else {
                populationsBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder getPopulationsBuilder(
                int index) {
            return getPopulationsFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder getPopulationsOrBuilder(
                int index) {
            if (populationsBuilder_ == null) {
                return populations_.get(index);
            } else {
                return populationsBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public java.util.List<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder>
        getPopulationsOrBuilderList() {
            if (populationsBuilder_ != null) {
                return populationsBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(populations_);
            }
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder addPopulationsBuilder() {
            return getPopulationsFieldBuilder().addBuilder(
                    edu.kit.ipd.crowdcontrol.objectservice.proto.Population.getDefaultInstance());
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder addPopulationsBuilder(
                int index) {
            return getPopulationsFieldBuilder().addBuilder(
                    index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.getDefaultInstance());
        }

        /**
         * <code>repeated .crowdcontrol.Population populations = 3;</code>
         */
        public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder>
        getPopulationsBuilderList() {
            return getPopulationsFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilder<
                edu.kit.ipd.crowdcontrol.objectservice.proto.Population, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder, edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder>
        getPopulationsFieldBuilder() {
            if (populationsBuilder_ == null) {
                populationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                        edu.kit.ipd.crowdcontrol.objectservice.proto.Population, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder, edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder>(
                        populations_,
                        ((bitField0_ & 0x00000004) == 0x00000004),
                        getParentForChildren(),
                        isClean());
                populations_ = null;
            }
            return populationsBuilder_;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:crowdcontrol.Platform)
    }

    // @@protoc_insertion_point(class_scope:crowdcontrol.Platform)
    private static final edu.kit.ipd.crowdcontrol.objectservice.proto.Platform DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new edu.kit.ipd.crowdcontrol.objectservice.proto.Platform();
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Platform getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Platform>
            PARSER = new com.google.protobuf.AbstractParser<Platform>() {
        public Platform parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                return new Platform(input, extensionRegistry);
            } catch (RuntimeException e) {
                if (e.getCause() instanceof
                        com.google.protobuf.InvalidProtocolBufferException) {
                    throw (com.google.protobuf.InvalidProtocolBufferException)
                            e.getCause();
                }
                throw e;
            }
        }
    };

    public static com.google.protobuf.Parser<Platform> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Platform> getParserForType() {
        return PARSER;
    }

    public edu.kit.ipd.crowdcontrol.objectservice.proto.Platform getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

