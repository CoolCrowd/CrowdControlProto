// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rating.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

/**
 * Protobuf type {@code crowdcontrol.Rating}
 */
public final class Rating extends
        com.google.protobuf.GeneratedMessage implements
        // @@protoc_insertion_point(message_implements:crowdcontrol.Rating)
        RatingOrBuilder {
    // Use Rating.newBuilder() to construct.
    private Rating(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
    }

    private Rating() {
        experimentId_ = 0;
        rating_ = 0;
        feedback_ = "";
        worker_ = 0;
        time_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private Rating(
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
                    case 8: {

                        experimentId_ = input.readInt32();
                        break;
                    }
                    case 16: {

                        rating_ = input.readInt32();
                        break;
                    }
                    case 26: {
                        String s = input.readStringRequireUtf8();

                        feedback_ = s;
                        break;
                    }
                    case 32: {

                        worker_ = input.readInt32();
                        break;
                    }
                    case 40: {

                        time_ = input.readInt32();
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
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return edu.kit.ipd.crowdcontrol.objectservice.proto.RatingOuterClass.internal_static_crowdcontrol_Rating_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return edu.kit.ipd.crowdcontrol.objectservice.proto.RatingOuterClass.internal_static_crowdcontrol_Rating_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        edu.kit.ipd.crowdcontrol.objectservice.proto.Rating.class, edu.kit.ipd.crowdcontrol.objectservice.proto.Rating.Builder.class);
    }

    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private int experimentId_;

    /**
     * <code>optional int32 experiment_id = 1;</code>
     */
    public int getExperimentId() {
        return experimentId_;
    }

    public static final int RATING_FIELD_NUMBER = 2;
    private int rating_;

    /**
     * <code>optional int32 rating = 2;</code>
     */
    public int getRating() {
        return rating_;
    }

    public static final int FEEDBACK_FIELD_NUMBER = 3;
    private volatile java.lang.Object feedback_;

    /**
     * <code>optional string feedback = 3;</code>
     */
    public java.lang.String getFeedback() {
        java.lang.Object ref = feedback_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            feedback_ = s;
            return s;
        }
    }

    /**
     * <code>optional string feedback = 3;</code>
     */
    public com.google.protobuf.ByteString
    getFeedbackBytes() {
        java.lang.Object ref = feedback_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            feedback_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int WORKER_FIELD_NUMBER = 4;
    private int worker_;

    /**
     * <code>optional int32 worker = 4;</code>
     */
    public int getWorker() {
        return worker_;
    }

    public static final int TIME_FIELD_NUMBER = 5;
    private int time_;

    /**
     * <code>optional int32 time = 5;</code>
     */
    public int getTime() {
        return time_;
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
        if (experimentId_ != 0) {
            output.writeInt32(1, experimentId_);
        }
        if (rating_ != 0) {
            output.writeInt32(2, rating_);
        }
        if (!getFeedbackBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessage.writeString(output, 3, feedback_);
        }
        if (worker_ != 0) {
            output.writeInt32(4, worker_);
        }
        if (time_ != 0) {
            output.writeInt32(5, time_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (experimentId_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, experimentId_);
        }
        if (rating_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, rating_);
        }
        if (!getFeedbackBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessage.computeStringSize(3, feedback_);
        }
        if (worker_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(4, worker_);
        }
        if (time_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(5, time_);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parseFrom(
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

    public static Builder newBuilder(edu.kit.ipd.crowdcontrol.objectservice.proto.Rating prototype) {
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
     * Protobuf type {@code crowdcontrol.Rating}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:crowdcontrol.Rating)
            edu.kit.ipd.crowdcontrol.objectservice.proto.RatingOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return edu.kit.ipd.crowdcontrol.objectservice.proto.RatingOuterClass.internal_static_crowdcontrol_Rating_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return edu.kit.ipd.crowdcontrol.objectservice.proto.RatingOuterClass.internal_static_crowdcontrol_Rating_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            edu.kit.ipd.crowdcontrol.objectservice.proto.Rating.class, edu.kit.ipd.crowdcontrol.objectservice.proto.Rating.Builder.class);
        }

        // Construct using edu.kit.ipd.crowdcontrol.objectservice.proto.Rating.newBuilder()
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
            }
        }

        public Builder clear() {
            super.clear();
            experimentId_ = 0;

            rating_ = 0;

            feedback_ = "";

            worker_ = 0;

            time_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return edu.kit.ipd.crowdcontrol.objectservice.proto.RatingOuterClass.internal_static_crowdcontrol_Rating_descriptor;
        }

        public edu.kit.ipd.crowdcontrol.objectservice.proto.Rating getDefaultInstanceForType() {
            return edu.kit.ipd.crowdcontrol.objectservice.proto.Rating.getDefaultInstance();
        }

        public edu.kit.ipd.crowdcontrol.objectservice.proto.Rating build() {
            edu.kit.ipd.crowdcontrol.objectservice.proto.Rating result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public edu.kit.ipd.crowdcontrol.objectservice.proto.Rating buildPartial() {
            edu.kit.ipd.crowdcontrol.objectservice.proto.Rating result = new edu.kit.ipd.crowdcontrol.objectservice.proto.Rating(this);
            result.experimentId_ = experimentId_;
            result.rating_ = rating_;
            result.feedback_ = feedback_;
            result.worker_ = worker_;
            result.time_ = time_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof edu.kit.ipd.crowdcontrol.objectservice.proto.Rating) {
                return mergeFrom((edu.kit.ipd.crowdcontrol.objectservice.proto.Rating) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(edu.kit.ipd.crowdcontrol.objectservice.proto.Rating other) {
            if (other == edu.kit.ipd.crowdcontrol.objectservice.proto.Rating.getDefaultInstance()) return this;
            if (other.getExperimentId() != 0) {
                setExperimentId(other.getExperimentId());
            }
            if (other.getRating() != 0) {
                setRating(other.getRating());
            }
            if (!other.getFeedback().isEmpty()) {
                feedback_ = other.feedback_;
                onChanged();
            }
            if (other.getWorker() != 0) {
                setWorker(other.getWorker());
            }
            if (other.getTime() != 0) {
                setTime(other.getTime());
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
            edu.kit.ipd.crowdcontrol.objectservice.proto.Rating parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (edu.kit.ipd.crowdcontrol.objectservice.proto.Rating) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int experimentId_;

        /**
         * <code>optional int32 experiment_id = 1;</code>
         */
        public int getExperimentId() {
            return experimentId_;
        }

        /**
         * <code>optional int32 experiment_id = 1;</code>
         */
        public Builder setExperimentId(int value) {

            experimentId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 experiment_id = 1;</code>
         */
        public Builder clearExperimentId() {

            experimentId_ = 0;
            onChanged();
            return this;
        }

        private int rating_;

        /**
         * <code>optional int32 rating = 2;</code>
         */
        public int getRating() {
            return rating_;
        }

        /**
         * <code>optional int32 rating = 2;</code>
         */
        public Builder setRating(int value) {

            rating_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 rating = 2;</code>
         */
        public Builder clearRating() {

            rating_ = 0;
            onChanged();
            return this;
        }

        private java.lang.Object feedback_ = "";

        /**
         * <code>optional string feedback = 3;</code>
         */
        public java.lang.String getFeedback() {
            java.lang.Object ref = feedback_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                feedback_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>optional string feedback = 3;</code>
         */
        public com.google.protobuf.ByteString
        getFeedbackBytes() {
            java.lang.Object ref = feedback_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                feedback_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string feedback = 3;</code>
         */
        public Builder setFeedback(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            feedback_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string feedback = 3;</code>
         */
        public Builder clearFeedback() {

            feedback_ = getDefaultInstance().getFeedback();
            onChanged();
            return this;
        }

        /**
         * <code>optional string feedback = 3;</code>
         */
        public Builder setFeedbackBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            feedback_ = value;
            onChanged();
            return this;
        }

        private int worker_;

        /**
         * <code>optional int32 worker = 4;</code>
         */
        public int getWorker() {
            return worker_;
        }

        /**
         * <code>optional int32 worker = 4;</code>
         */
        public Builder setWorker(int value) {

            worker_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 worker = 4;</code>
         */
        public Builder clearWorker() {

            worker_ = 0;
            onChanged();
            return this;
        }

        private int time_;

        /**
         * <code>optional int32 time = 5;</code>
         */
        public int getTime() {
            return time_;
        }

        /**
         * <code>optional int32 time = 5;</code>
         */
        public Builder setTime(int value) {

            time_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 time = 5;</code>
         */
        public Builder clearTime() {

            time_ = 0;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:crowdcontrol.Rating)
    }

    // @@protoc_insertion_point(class_scope:crowdcontrol.Rating)
    private static final edu.kit.ipd.crowdcontrol.objectservice.proto.Rating DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new edu.kit.ipd.crowdcontrol.objectservice.proto.Rating();
    }

    public static edu.kit.ipd.crowdcontrol.objectservice.proto.Rating getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Rating>
            PARSER = new com.google.protobuf.AbstractParser<Rating>() {
        public Rating parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                return new Rating(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<Rating> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Rating> getParserForType() {
        return PARSER;
    }

    public edu.kit.ipd.crowdcontrol.objectservice.proto.Rating getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

