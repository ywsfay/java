/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.proto;

public final class V1Batch {
  private V1Batch() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface JobOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1.Job)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobSpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Current status of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Current status of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobStatus getStatus();
    /**
     *
     *
     * <pre>
     * Current status of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobStatusOrBuilder getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * Job represents the configuration of a single job.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1.Job}
   */
  public static final class Job extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1.Job)
      JobOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Job.newBuilder() to construct.
    private Job(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Job() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Job(
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
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Batch.JobSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Batch.JobSpec.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Batch.JobStatus.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Batch.JobStatus.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Batch.internal_static_k8s_io_api_batch_v1_Job_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_Job_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Batch.Job.class,
              io.kubernetes.client.proto.V1Batch.Job.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Batch.JobSpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Batch.JobStatus status_;
    /**
     *
     *
     * <pre>
     * Current status of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Current status of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1Batch.JobStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Current status of a job.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobStatusOrBuilder getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1Batch.JobStatus.getDefaultInstance()
          : status_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Batch.Job)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Batch.Job other = (io.kubernetes.client.proto.V1Batch.Job) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.Job parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Batch.Job prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Job represents the configuration of a single job.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1.Job}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1.Job)
        io.kubernetes.client.proto.V1Batch.JobOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_Job_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_Job_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Batch.Job.class,
                io.kubernetes.client.proto.V1Batch.Job.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Batch.Job.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_Job_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.Job getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Batch.Job.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.Job build() {
        io.kubernetes.client.proto.V1Batch.Job result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.Job buildPartial() {
        io.kubernetes.client.proto.V1Batch.Job result =
            new io.kubernetes.client.proto.V1Batch.Job(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Batch.Job) {
          return mergeFrom((io.kubernetes.client.proto.V1Batch.Job) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Batch.Job other) {
        if (other == io.kubernetes.client.proto.V1Batch.Job.getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
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
        io.kubernetes.client.proto.V1Batch.Job parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Batch.Job) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1Batch.JobSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.JobSpec,
              io.kubernetes.client.proto.V1Batch.JobSpec.Builder,
              io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Batch.JobSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Batch.JobSpec.Builder builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1Batch.JobSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_ != io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1Batch.JobSpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.JobSpec,
              io.kubernetes.client.proto.V1Batch.JobSpec.Builder,
              io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Batch.JobSpec,
                  io.kubernetes.client.proto.V1Batch.JobSpec.Builder,
                  io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1Batch.JobStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.JobStatus,
              io.kubernetes.client.proto.V1Batch.JobStatus.Builder,
              io.kubernetes.client.proto.V1Batch.JobStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1Batch.JobStatus.getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      public Builder setStatus(io.kubernetes.client.proto.V1Batch.JobStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1Batch.JobStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      public Builder mergeStatus(io.kubernetes.client.proto.V1Batch.JobStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_ != io.kubernetes.client.proto.V1Batch.JobStatus.getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1Batch.JobStatus.newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobStatus.Builder getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobStatusOrBuilder getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1Batch.JobStatus.getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Current status of a job.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.batch.v1.JobStatus status = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.JobStatus,
              io.kubernetes.client.proto.V1Batch.JobStatus.Builder,
              io.kubernetes.client.proto.V1Batch.JobStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Batch.JobStatus,
                  io.kubernetes.client.proto.V1Batch.JobStatus.Builder,
                  io.kubernetes.client.proto.V1Batch.JobStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1.Job)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1.Job)
    private static final io.kubernetes.client.proto.V1Batch.Job DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Batch.Job();
    }

    public static io.kubernetes.client.proto.V1Batch.Job getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Job> PARSER =
        new com.google.protobuf.AbstractParser<Job>() {
          @java.lang.Override
          public Job parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Job(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Job> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Job> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Batch.Job getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface JobConditionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1.JobCondition)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Type of job condition, Complete or Failed.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * Type of job condition, Complete or Failed.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * Type of job condition, Complete or Failed.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * Status of the condition, one of True, False, Unknown.
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status of the condition, one of True, False, Unknown.
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    java.lang.String getStatus();
    /**
     *
     *
     * <pre>
     * Status of the condition, one of True, False, Unknown.
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    com.google.protobuf.ByteString getStatusBytes();

    /**
     *
     *
     * <pre>
     * Last time the condition was checked.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
     */
    boolean hasLastProbeTime();
    /**
     *
     *
     * <pre>
     * Last time the condition was checked.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastProbeTime();
    /**
     *
     *
     * <pre>
     * Last time the condition was checked.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastProbeTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * Last time the condition transit from one status to another.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;</code>
     */
    boolean hasLastTransitionTime();
    /**
     *
     *
     * <pre>
     * Last time the condition transit from one status to another.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastTransitionTime();
    /**
     *
     *
     * <pre>
     * Last time the condition transit from one status to another.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * (brief) reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 5;</code>
     */
    boolean hasReason();
    /**
     *
     *
     * <pre>
     * (brief) reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 5;</code>
     */
    java.lang.String getReason();
    /**
     *
     *
     * <pre>
     * (brief) reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 5;</code>
     */
    com.google.protobuf.ByteString getReasonBytes();

    /**
     *
     *
     * <pre>
     * Human readable message indicating details about last transition.
     * +optional
     * </pre>
     *
     * <code>optional string message = 6;</code>
     */
    boolean hasMessage();
    /**
     *
     *
     * <pre>
     * Human readable message indicating details about last transition.
     * +optional
     * </pre>
     *
     * <code>optional string message = 6;</code>
     */
    java.lang.String getMessage();
    /**
     *
     *
     * <pre>
     * Human readable message indicating details about last transition.
     * +optional
     * </pre>
     *
     * <code>optional string message = 6;</code>
     */
    com.google.protobuf.ByteString getMessageBytes();
  }
  /**
   *
   *
   * <pre>
   * JobCondition describes current state of a job.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1.JobCondition}
   */
  public static final class JobCondition extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1.JobCondition)
      JobConditionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use JobCondition.newBuilder() to construct.
    private JobCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private JobCondition() {
      type_ = "";
      status_ = "";
      reason_ = "";
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private JobCondition(
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                status_ = bs;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = lastProbeTime_.toBuilder();
                }
                lastProbeTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastProbeTime_);
                  lastProbeTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = lastTransitionTime_.toBuilder();
                }
                lastTransitionTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastTransitionTime_);
                  lastTransitionTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                reason_ = bs;
                break;
              }
            case 50:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000020;
                message_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_JobCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_JobCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Batch.JobCondition.class,
              io.kubernetes.client.proto.V1Batch.JobCondition.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * Type of job condition, Complete or Failed.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Type of job condition, Complete or Failed.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of job condition, Complete or Failed.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private volatile java.lang.Object status_;
    /**
     *
     *
     * <pre>
     * Status of the condition, one of True, False, Unknown.
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Status of the condition, one of True, False, Unknown.
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          status_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Status of the condition, one of True, False, Unknown.
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public com.google.protobuf.ByteString getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LASTPROBETIME_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Meta.Time lastProbeTime_;
    /**
     *
     *
     * <pre>
     * Last time the condition was checked.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
     */
    public boolean hasLastProbeTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was checked.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastProbeTime() {
      return lastProbeTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastProbeTime_;
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was checked.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastProbeTimeOrBuilder() {
      return lastProbeTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastProbeTime_;
    }

    public static final int LASTTRANSITIONTIME_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.Meta.Time lastTransitionTime_;
    /**
     *
     *
     * <pre>
     * Last time the condition transit from one status to another.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;</code>
     */
    public boolean hasLastTransitionTime() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * Last time the condition transit from one status to another.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastTransitionTime() {
      return lastTransitionTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastTransitionTime_;
    }
    /**
     *
     *
     * <pre>
     * Last time the condition transit from one status to another.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder() {
      return lastTransitionTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastTransitionTime_;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private volatile java.lang.Object reason_;
    /**
     *
     *
     * <pre>
     * (brief) reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 5;</code>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * (brief) reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 5;</code>
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reason_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * (brief) reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 5;</code>
     */
    public com.google.protobuf.ByteString getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 6;
    private volatile java.lang.Object message_;
    /**
     *
     *
     * <pre>
     * Human readable message indicating details about last transition.
     * +optional
     * </pre>
     *
     * <code>optional string message = 6;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     *
     *
     * <pre>
     * Human readable message indicating details about last transition.
     * +optional
     * </pre>
     *
     * <code>optional string message = 6;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable message indicating details about last transition.
     * +optional
     * </pre>
     *
     * <code>optional string message = 6;</code>
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getLastProbeTime());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getLastTransitionTime());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, reason_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, message_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getLastProbeTime());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(4, getLastTransitionTime());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, reason_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, message_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Batch.JobCondition)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Batch.JobCondition other =
          (io.kubernetes.client.proto.V1Batch.JobCondition) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && (hasLastProbeTime() == other.hasLastProbeTime());
      if (hasLastProbeTime()) {
        result = result && getLastProbeTime().equals(other.getLastProbeTime());
      }
      result = result && (hasLastTransitionTime() == other.hasLastTransitionTime());
      if (hasLastTransitionTime()) {
        result = result && getLastTransitionTime().equals(other.getLastTransitionTime());
      }
      result = result && (hasReason() == other.hasReason());
      if (hasReason()) {
        result = result && getReason().equals(other.getReason());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage().equals(other.getMessage());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      if (hasLastProbeTime()) {
        hash = (37 * hash) + LASTPROBETIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastProbeTime().hashCode();
      }
      if (hasLastTransitionTime()) {
        hash = (37 * hash) + LASTTRANSITIONTIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastTransitionTime().hashCode();
      }
      if (hasReason()) {
        hash = (37 * hash) + REASON_FIELD_NUMBER;
        hash = (53 * hash) + getReason().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Batch.JobCondition prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * JobCondition describes current state of a job.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1.JobCondition}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1.JobCondition)
        io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobCondition_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Batch.JobCondition.class,
                io.kubernetes.client.proto.V1Batch.JobCondition.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Batch.JobCondition.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getLastProbeTimeFieldBuilder();
          getLastTransitionTimeFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (lastProbeTimeBuilder_ == null) {
          lastProbeTime_ = null;
        } else {
          lastProbeTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = null;
        } else {
          lastTransitionTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        reason_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobCondition_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobCondition getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Batch.JobCondition.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobCondition build() {
        io.kubernetes.client.proto.V1Batch.JobCondition result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobCondition buildPartial() {
        io.kubernetes.client.proto.V1Batch.JobCondition result =
            new io.kubernetes.client.proto.V1Batch.JobCondition(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (lastProbeTimeBuilder_ == null) {
          result.lastProbeTime_ = lastProbeTime_;
        } else {
          result.lastProbeTime_ = lastProbeTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (lastTransitionTimeBuilder_ == null) {
          result.lastTransitionTime_ = lastTransitionTime_;
        } else {
          result.lastTransitionTime_ = lastTransitionTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.reason_ = reason_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Batch.JobCondition) {
          return mergeFrom((io.kubernetes.client.proto.V1Batch.JobCondition) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Batch.JobCondition other) {
        if (other == io.kubernetes.client.proto.V1Batch.JobCondition.getDefaultInstance())
          return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasStatus()) {
          bitField0_ |= 0x00000002;
          status_ = other.status_;
          onChanged();
        }
        if (other.hasLastProbeTime()) {
          mergeLastProbeTime(other.getLastProbeTime());
        }
        if (other.hasLastTransitionTime()) {
          mergeLastTransitionTime(other.getLastTransitionTime());
        }
        if (other.hasReason()) {
          bitField0_ |= 0x00000010;
          reason_ = other.reason_;
          onChanged();
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000020;
          message_ = other.message_;
          onChanged();
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
        io.kubernetes.client.proto.V1Batch.JobCondition parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Batch.JobCondition) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * Type of job condition, Complete or Failed.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Type of job condition, Complete or Failed.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Type of job condition, Complete or Failed.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Type of job condition, Complete or Failed.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Type of job condition, Complete or Failed.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Type of job condition, Complete or Failed.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object status_ = "";
      /**
       *
       *
       * <pre>
       * Status of the condition, one of True, False, Unknown.
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Status of the condition, one of True, False, Unknown.
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public java.lang.String getStatus() {
        java.lang.Object ref = status_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            status_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Status of the condition, one of True, False, Unknown.
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public com.google.protobuf.ByteString getStatusBytes() {
        java.lang.Object ref = status_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          status_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Status of the condition, one of True, False, Unknown.
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder setStatus(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the condition, one of True, False, Unknown.
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = getDefaultInstance().getStatus();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the condition, one of True, False, Unknown.
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder setStatusBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.Time lastProbeTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastProbeTimeBuilder_;
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      public boolean hasLastProbeTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastProbeTime() {
        if (lastProbeTimeBuilder_ == null) {
          return lastProbeTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastProbeTime_;
        } else {
          return lastProbeTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      public Builder setLastProbeTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastProbeTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastProbeTime_ = value;
          onChanged();
        } else {
          lastProbeTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      public Builder setLastProbeTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastProbeTimeBuilder_ == null) {
          lastProbeTime_ = builderForValue.build();
          onChanged();
        } else {
          lastProbeTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      public Builder mergeLastProbeTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastProbeTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && lastProbeTime_ != null
              && lastProbeTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastProbeTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastProbeTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastProbeTime_ = value;
          }
          onChanged();
        } else {
          lastProbeTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      public Builder clearLastProbeTime() {
        if (lastProbeTimeBuilder_ == null) {
          lastProbeTime_ = null;
          onChanged();
        } else {
          lastProbeTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastProbeTimeBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getLastProbeTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastProbeTimeOrBuilder() {
        if (lastProbeTimeBuilder_ != null) {
          return lastProbeTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastProbeTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastProbeTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * Last time the condition was checked.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastProbeTime = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastProbeTimeFieldBuilder() {
        if (lastProbeTimeBuilder_ == null) {
          lastProbeTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastProbeTime(), getParentForChildren(), isClean());
          lastProbeTime_ = null;
        }
        return lastProbeTimeBuilder_;
      }

      private io.kubernetes.client.proto.Meta.Time lastTransitionTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastTransitionTimeBuilder_;
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      public boolean hasLastTransitionTime() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastTransitionTime() {
        if (lastTransitionTimeBuilder_ == null) {
          return lastTransitionTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastTransitionTime_;
        } else {
          return lastTransitionTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      public Builder setLastTransitionTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastTransitionTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastTransitionTime_ = value;
          onChanged();
        } else {
          lastTransitionTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      public Builder setLastTransitionTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = builderForValue.build();
          onChanged();
        } else {
          lastTransitionTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      public Builder mergeLastTransitionTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastTransitionTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && lastTransitionTime_ != null
              && lastTransitionTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastTransitionTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastTransitionTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastTransitionTime_ = value;
          }
          onChanged();
        } else {
          lastTransitionTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      public Builder clearLastTransitionTime() {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = null;
          onChanged();
        } else {
          lastTransitionTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastTransitionTimeBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getLastTransitionTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder() {
        if (lastTransitionTimeBuilder_ != null) {
          return lastTransitionTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastTransitionTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastTransitionTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * Last time the condition transit from one status to another.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastTransitionTimeFieldBuilder() {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastTransitionTime(), getParentForChildren(), isClean());
          lastTransitionTime_ = null;
        }
        return lastTransitionTimeBuilder_;
      }

      private java.lang.Object reason_ = "";
      /**
       *
       *
       * <pre>
       * (brief) reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 5;</code>
       */
      public boolean hasReason() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * (brief) reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 5;</code>
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reason_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * (brief) reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 5;</code>
       */
      public com.google.protobuf.ByteString getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * (brief) reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 5;</code>
       */
      public Builder setReason(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * (brief) reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 5;</code>
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000010);
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * (brief) reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 5;</code>
       */
      public Builder setReasonBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        reason_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       *
       *
       * <pre>
       * Human readable message indicating details about last transition.
       * +optional
       * </pre>
       *
       * <code>optional string message = 6;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * Human readable message indicating details about last transition.
       * +optional
       * </pre>
       *
       * <code>optional string message = 6;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Human readable message indicating details about last transition.
       * +optional
       * </pre>
       *
       * <code>optional string message = 6;</code>
       */
      public com.google.protobuf.ByteString getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Human readable message indicating details about last transition.
       * +optional
       * </pre>
       *
       * <code>optional string message = 6;</code>
       */
      public Builder setMessage(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Human readable message indicating details about last transition.
       * +optional
       * </pre>
       *
       * <code>optional string message = 6;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000020);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Human readable message indicating details about last transition.
       * +optional
       * </pre>
       *
       * <code>optional string message = 6;</code>
       */
      public Builder setMessageBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        message_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1.JobCondition)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1.JobCondition)
    private static final io.kubernetes.client.proto.V1Batch.JobCondition DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Batch.JobCondition();
    }

    public static io.kubernetes.client.proto.V1Batch.JobCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<JobCondition> PARSER =
        new com.google.protobuf.AbstractParser<JobCondition>() {
          @java.lang.Override
          public JobCondition parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new JobCondition(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<JobCondition> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JobCondition> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Batch.JobCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface JobListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1.JobList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Batch.Job> getItemsList();
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    io.kubernetes.client.proto.V1Batch.Job getItems(int index);
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Batch.JobOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * JobList is a collection of jobs.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1.JobList}
   */
  public static final class JobList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1.JobList)
      JobListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use JobList.newBuilder() to construct.
    private JobList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private JobList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private JobList(
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
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Batch.Job>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Batch.Job.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_JobList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_JobList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Batch.JobList.class,
              io.kubernetes.client.proto.V1Batch.JobList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Batch.Job> items_;
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Batch.Job> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Batch.JobOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Batch.Job getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * items is the list of Jobs.
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobOrBuilder getItemsOrBuilder(int index) {
      return items_.get(index);
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Batch.JobList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Batch.JobList other =
          (io.kubernetes.client.proto.V1Batch.JobList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Batch.JobList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * JobList is a collection of jobs.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1.JobList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1.JobList)
        io.kubernetes.client.proto.V1Batch.JobListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Batch.JobList.class,
                io.kubernetes.client.proto.V1Batch.JobList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Batch.JobList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Batch.JobList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobList build() {
        io.kubernetes.client.proto.V1Batch.JobList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobList buildPartial() {
        io.kubernetes.client.proto.V1Batch.JobList result =
            new io.kubernetes.client.proto.V1Batch.JobList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Batch.JobList) {
          return mergeFrom((io.kubernetes.client.proto.V1Batch.JobList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Batch.JobList other) {
        if (other == io.kubernetes.client.proto.V1Batch.JobList.getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
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
        io.kubernetes.client.proto.V1Batch.JobList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Batch.JobList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Batch.Job> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Batch.Job>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.Job,
              io.kubernetes.client.proto.V1Batch.Job.Builder,
              io.kubernetes.client.proto.V1Batch.JobOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Batch.Job> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.Job getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1Batch.Job value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Batch.Job.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Batch.Job value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1Batch.Job value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Batch.Job.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Batch.Job.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Batch.Job> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.Job.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobOrBuilder getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Batch.JobOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.Job.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Batch.Job.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Batch.Job.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Batch.Job.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of Jobs.
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.Job items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Batch.Job.Builder> getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.Job,
              io.kubernetes.client.proto.V1Batch.Job.Builder,
              io.kubernetes.client.proto.V1Batch.JobOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Batch.Job,
                  io.kubernetes.client.proto.V1Batch.Job.Builder,
                  io.kubernetes.client.proto.V1Batch.JobOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1.JobList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1.JobList)
    private static final io.kubernetes.client.proto.V1Batch.JobList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Batch.JobList();
    }

    public static io.kubernetes.client.proto.V1Batch.JobList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<JobList> PARSER =
        new com.google.protobuf.AbstractParser<JobList>() {
          @java.lang.Override
          public JobList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new JobList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<JobList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JobList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Batch.JobList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface JobSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1.JobSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Specifies the maximum desired number of pods the job should
     * run at any given time. The actual number of pods running in steady state will
     * be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism),
     * i.e. when the work left to do is less than max parallelism.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * </pre>
     *
     * <code>optional int32 parallelism = 1;</code>
     */
    boolean hasParallelism();
    /**
     *
     *
     * <pre>
     * Specifies the maximum desired number of pods the job should
     * run at any given time. The actual number of pods running in steady state will
     * be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism),
     * i.e. when the work left to do is less than max parallelism.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * </pre>
     *
     * <code>optional int32 parallelism = 1;</code>
     */
    int getParallelism();

    /**
     *
     *
     * <pre>
     * Specifies the desired number of successfully finished pods the
     * job should be run with.  Setting to nil means that the success of any
     * pod signals the success of all pods, and allows parallelism to have any positive
     * value.  Setting to 1 means that parallelism is limited to 1 and the success of that
     * pod signals the success of the job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * </pre>
     *
     * <code>optional int32 completions = 2;</code>
     */
    boolean hasCompletions();
    /**
     *
     *
     * <pre>
     * Specifies the desired number of successfully finished pods the
     * job should be run with.  Setting to nil means that the success of any
     * pod signals the success of all pods, and allows parallelism to have any positive
     * value.  Setting to 1 means that parallelism is limited to 1 and the success of that
     * pod signals the success of the job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * </pre>
     *
     * <code>optional int32 completions = 2;</code>
     */
    int getCompletions();

    /**
     *
     *
     * <pre>
     * Specifies the duration in seconds relative to the startTime that the job may be active
     * before the system tries to terminate it; value must be positive integer
     * +optional
     * </pre>
     *
     * <code>optional int64 activeDeadlineSeconds = 3;</code>
     */
    boolean hasActiveDeadlineSeconds();
    /**
     *
     *
     * <pre>
     * Specifies the duration in seconds relative to the startTime that the job may be active
     * before the system tries to terminate it; value must be positive integer
     * +optional
     * </pre>
     *
     * <code>optional int64 activeDeadlineSeconds = 3;</code>
     */
    long getActiveDeadlineSeconds();

    /**
     *
     *
     * <pre>
     * Specifies the number of retries before marking this job failed.
     * Defaults to 6
     * +optional
     * </pre>
     *
     * <code>optional int32 backoffLimit = 7;</code>
     */
    boolean hasBackoffLimit();
    /**
     *
     *
     * <pre>
     * Specifies the number of retries before marking this job failed.
     * Defaults to 6
     * +optional
     * </pre>
     *
     * <code>optional int32 backoffLimit = 7;</code>
     */
    int getBackoffLimit();

    /**
     *
     *
     * <pre>
     * A label query over pods that should match the pod count.
     * Normally, the system sets this field for you.
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * A label query over pods that should match the pod count.
     * Normally, the system sets this field for you.
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * A label query over pods that should match the pod count.
     * Normally, the system sets this field for you.
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * manualSelector controls generation of pod labels and pod selectors.
     * Leave `manualSelector` unset unless you are certain what you are doing.
     * When false or unset, the system pick labels unique to this job
     * and appends those labels to the pod template.  When true,
     * the user is responsible for picking unique labels and specifying
     * the selector.  Failure to pick a unique label may cause this
     * and other jobs to not function correctly.  However, You may see
     * `manualSelector=true` in jobs that were created with the old `extensions/v1beta1`
     * API.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * +optional
     * </pre>
     *
     * <code>optional bool manualSelector = 5;</code>
     */
    boolean hasManualSelector();
    /**
     *
     *
     * <pre>
     * manualSelector controls generation of pod labels and pod selectors.
     * Leave `manualSelector` unset unless you are certain what you are doing.
     * When false or unset, the system pick labels unique to this job
     * and appends those labels to the pod template.  When true,
     * the user is responsible for picking unique labels and specifying
     * the selector.  Failure to pick a unique label may cause this
     * and other jobs to not function correctly.  However, You may see
     * `manualSelector=true` in jobs that were created with the old `extensions/v1beta1`
     * API.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * +optional
     * </pre>
     *
     * <code>optional bool manualSelector = 5;</code>
     */
    boolean getManualSelector();

    /**
     *
     *
     * <pre>
     * Describes the pod that will be created when executing a job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
     */
    boolean hasTemplate();
    /**
     *
     *
     * <pre>
     * Describes the pod that will be created when executing a job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
     */
    io.kubernetes.client.proto.V1.PodTemplateSpec getTemplate();
    /**
     *
     *
     * <pre>
     * Describes the pod that will be created when executing a job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
     */
    io.kubernetes.client.proto.V1.PodTemplateSpecOrBuilder getTemplateOrBuilder();

    /**
     *
     *
     * <pre>
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished
     * execution (either Complete or Failed). If this field is set,
     * ttlSecondsAfterFinished after the Job finishes, it is eligible to be
     * automatically deleted. When the Job is being deleted, its lifecycle
     * guarantees (e.g. finalizers) will be honored. If this field is unset,
     * the Job won't be automatically deleted. If this field is set to zero,
     * the Job becomes eligible to be deleted immediately after it finishes.
     * This field is alpha-level and is only honored by servers that enable the
     * TTLAfterFinished feature.
     * +optional
     * </pre>
     *
     * <code>optional int32 ttlSecondsAfterFinished = 8;</code>
     */
    boolean hasTtlSecondsAfterFinished();
    /**
     *
     *
     * <pre>
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished
     * execution (either Complete or Failed). If this field is set,
     * ttlSecondsAfterFinished after the Job finishes, it is eligible to be
     * automatically deleted. When the Job is being deleted, its lifecycle
     * guarantees (e.g. finalizers) will be honored. If this field is unset,
     * the Job won't be automatically deleted. If this field is set to zero,
     * the Job becomes eligible to be deleted immediately after it finishes.
     * This field is alpha-level and is only honored by servers that enable the
     * TTLAfterFinished feature.
     * +optional
     * </pre>
     *
     * <code>optional int32 ttlSecondsAfterFinished = 8;</code>
     */
    int getTtlSecondsAfterFinished();
  }
  /**
   *
   *
   * <pre>
   * JobSpec describes how the job execution will look like.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1.JobSpec}
   */
  public static final class JobSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1.JobSpec)
      JobSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use JobSpec.newBuilder() to construct.
    private JobSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private JobSpec() {
      parallelism_ = 0;
      completions_ = 0;
      activeDeadlineSeconds_ = 0L;
      backoffLimit_ = 0;
      manualSelector_ = false;
      ttlSecondsAfterFinished_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private JobSpec(
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
            case 8:
              {
                bitField0_ |= 0x00000001;
                parallelism_ = input.readInt32();
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                completions_ = input.readInt32();
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000004;
                activeDeadlineSeconds_ = input.readInt64();
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            case 40:
              {
                bitField0_ |= 0x00000020;
                manualSelector_ = input.readBool();
                break;
              }
            case 50:
              {
                io.kubernetes.client.proto.V1.PodTemplateSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000040) == 0x00000040)) {
                  subBuilder = template_.toBuilder();
                }
                template_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1.PodTemplateSpec.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(template_);
                  template_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000040;
                break;
              }
            case 56:
              {
                bitField0_ |= 0x00000008;
                backoffLimit_ = input.readInt32();
                break;
              }
            case 64:
              {
                bitField0_ |= 0x00000080;
                ttlSecondsAfterFinished_ = input.readInt32();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_JobSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_JobSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Batch.JobSpec.class,
              io.kubernetes.client.proto.V1Batch.JobSpec.Builder.class);
    }

    private int bitField0_;
    public static final int PARALLELISM_FIELD_NUMBER = 1;
    private int parallelism_;
    /**
     *
     *
     * <pre>
     * Specifies the maximum desired number of pods the job should
     * run at any given time. The actual number of pods running in steady state will
     * be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism),
     * i.e. when the work left to do is less than max parallelism.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * </pre>
     *
     * <code>optional int32 parallelism = 1;</code>
     */
    public boolean hasParallelism() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Specifies the maximum desired number of pods the job should
     * run at any given time. The actual number of pods running in steady state will
     * be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism),
     * i.e. when the work left to do is less than max parallelism.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * </pre>
     *
     * <code>optional int32 parallelism = 1;</code>
     */
    public int getParallelism() {
      return parallelism_;
    }

    public static final int COMPLETIONS_FIELD_NUMBER = 2;
    private int completions_;
    /**
     *
     *
     * <pre>
     * Specifies the desired number of successfully finished pods the
     * job should be run with.  Setting to nil means that the success of any
     * pod signals the success of all pods, and allows parallelism to have any positive
     * value.  Setting to 1 means that parallelism is limited to 1 and the success of that
     * pod signals the success of the job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * </pre>
     *
     * <code>optional int32 completions = 2;</code>
     */
    public boolean hasCompletions() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specifies the desired number of successfully finished pods the
     * job should be run with.  Setting to nil means that the success of any
     * pod signals the success of all pods, and allows parallelism to have any positive
     * value.  Setting to 1 means that parallelism is limited to 1 and the success of that
     * pod signals the success of the job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * </pre>
     *
     * <code>optional int32 completions = 2;</code>
     */
    public int getCompletions() {
      return completions_;
    }

    public static final int ACTIVEDEADLINESECONDS_FIELD_NUMBER = 3;
    private long activeDeadlineSeconds_;
    /**
     *
     *
     * <pre>
     * Specifies the duration in seconds relative to the startTime that the job may be active
     * before the system tries to terminate it; value must be positive integer
     * +optional
     * </pre>
     *
     * <code>optional int64 activeDeadlineSeconds = 3;</code>
     */
    public boolean hasActiveDeadlineSeconds() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Specifies the duration in seconds relative to the startTime that the job may be active
     * before the system tries to terminate it; value must be positive integer
     * +optional
     * </pre>
     *
     * <code>optional int64 activeDeadlineSeconds = 3;</code>
     */
    public long getActiveDeadlineSeconds() {
      return activeDeadlineSeconds_;
    }

    public static final int BACKOFFLIMIT_FIELD_NUMBER = 7;
    private int backoffLimit_;
    /**
     *
     *
     * <pre>
     * Specifies the number of retries before marking this job failed.
     * Defaults to 6
     * +optional
     * </pre>
     *
     * <code>optional int32 backoffLimit = 7;</code>
     */
    public boolean hasBackoffLimit() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * Specifies the number of retries before marking this job failed.
     * Defaults to 6
     * +optional
     * </pre>
     *
     * <code>optional int32 backoffLimit = 7;</code>
     */
    public int getBackoffLimit() {
      return backoffLimit_;
    }

    public static final int SELECTOR_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * A label query over pods that should match the pod count.
     * Normally, the system sets this field for you.
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * A label query over pods that should match the pod count.
     * Normally, the system sets this field for you.
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }
    /**
     *
     *
     * <pre>
     * A label query over pods that should match the pod count.
     * Normally, the system sets this field for you.
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }

    public static final int MANUALSELECTOR_FIELD_NUMBER = 5;
    private boolean manualSelector_;
    /**
     *
     *
     * <pre>
     * manualSelector controls generation of pod labels and pod selectors.
     * Leave `manualSelector` unset unless you are certain what you are doing.
     * When false or unset, the system pick labels unique to this job
     * and appends those labels to the pod template.  When true,
     * the user is responsible for picking unique labels and specifying
     * the selector.  Failure to pick a unique label may cause this
     * and other jobs to not function correctly.  However, You may see
     * `manualSelector=true` in jobs that were created with the old `extensions/v1beta1`
     * API.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * +optional
     * </pre>
     *
     * <code>optional bool manualSelector = 5;</code>
     */
    public boolean hasManualSelector() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     *
     *
     * <pre>
     * manualSelector controls generation of pod labels and pod selectors.
     * Leave `manualSelector` unset unless you are certain what you are doing.
     * When false or unset, the system pick labels unique to this job
     * and appends those labels to the pod template.  When true,
     * the user is responsible for picking unique labels and specifying
     * the selector.  Failure to pick a unique label may cause this
     * and other jobs to not function correctly.  However, You may see
     * `manualSelector=true` in jobs that were created with the old `extensions/v1beta1`
     * API.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * +optional
     * </pre>
     *
     * <code>optional bool manualSelector = 5;</code>
     */
    public boolean getManualSelector() {
      return manualSelector_;
    }

    public static final int TEMPLATE_FIELD_NUMBER = 6;
    private io.kubernetes.client.proto.V1.PodTemplateSpec template_;
    /**
     *
     *
     * <pre>
     * Describes the pod that will be created when executing a job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
     */
    public boolean hasTemplate() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     *
     *
     * <pre>
     * Describes the pod that will be created when executing a job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
     */
    public io.kubernetes.client.proto.V1.PodTemplateSpec getTemplate() {
      return template_ == null
          ? io.kubernetes.client.proto.V1.PodTemplateSpec.getDefaultInstance()
          : template_;
    }
    /**
     *
     *
     * <pre>
     * Describes the pod that will be created when executing a job.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
     */
    public io.kubernetes.client.proto.V1.PodTemplateSpecOrBuilder getTemplateOrBuilder() {
      return template_ == null
          ? io.kubernetes.client.proto.V1.PodTemplateSpec.getDefaultInstance()
          : template_;
    }

    public static final int TTLSECONDSAFTERFINISHED_FIELD_NUMBER = 8;
    private int ttlSecondsAfterFinished_;
    /**
     *
     *
     * <pre>
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished
     * execution (either Complete or Failed). If this field is set,
     * ttlSecondsAfterFinished after the Job finishes, it is eligible to be
     * automatically deleted. When the Job is being deleted, its lifecycle
     * guarantees (e.g. finalizers) will be honored. If this field is unset,
     * the Job won't be automatically deleted. If this field is set to zero,
     * the Job becomes eligible to be deleted immediately after it finishes.
     * This field is alpha-level and is only honored by servers that enable the
     * TTLAfterFinished feature.
     * +optional
     * </pre>
     *
     * <code>optional int32 ttlSecondsAfterFinished = 8;</code>
     */
    public boolean hasTtlSecondsAfterFinished() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     *
     *
     * <pre>
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished
     * execution (either Complete or Failed). If this field is set,
     * ttlSecondsAfterFinished after the Job finishes, it is eligible to be
     * automatically deleted. When the Job is being deleted, its lifecycle
     * guarantees (e.g. finalizers) will be honored. If this field is unset,
     * the Job won't be automatically deleted. If this field is set to zero,
     * the Job becomes eligible to be deleted immediately after it finishes.
     * This field is alpha-level and is only honored by servers that enable the
     * TTLAfterFinished feature.
     * +optional
     * </pre>
     *
     * <code>optional int32 ttlSecondsAfterFinished = 8;</code>
     */
    public int getTtlSecondsAfterFinished() {
      return ttlSecondsAfterFinished_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, parallelism_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, completions_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, activeDeadlineSeconds_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(4, getSelector());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(5, manualSelector_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeMessage(6, getTemplate());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(7, backoffLimit_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, ttlSecondsAfterFinished_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, parallelism_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, completions_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, activeDeadlineSeconds_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getSelector());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, manualSelector_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, getTemplate());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(7, backoffLimit_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(8, ttlSecondsAfterFinished_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Batch.JobSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Batch.JobSpec other =
          (io.kubernetes.client.proto.V1Batch.JobSpec) obj;

      boolean result = true;
      result = result && (hasParallelism() == other.hasParallelism());
      if (hasParallelism()) {
        result = result && (getParallelism() == other.getParallelism());
      }
      result = result && (hasCompletions() == other.hasCompletions());
      if (hasCompletions()) {
        result = result && (getCompletions() == other.getCompletions());
      }
      result = result && (hasActiveDeadlineSeconds() == other.hasActiveDeadlineSeconds());
      if (hasActiveDeadlineSeconds()) {
        result = result && (getActiveDeadlineSeconds() == other.getActiveDeadlineSeconds());
      }
      result = result && (hasBackoffLimit() == other.hasBackoffLimit());
      if (hasBackoffLimit()) {
        result = result && (getBackoffLimit() == other.getBackoffLimit());
      }
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && (hasManualSelector() == other.hasManualSelector());
      if (hasManualSelector()) {
        result = result && (getManualSelector() == other.getManualSelector());
      }
      result = result && (hasTemplate() == other.hasTemplate());
      if (hasTemplate()) {
        result = result && getTemplate().equals(other.getTemplate());
      }
      result = result && (hasTtlSecondsAfterFinished() == other.hasTtlSecondsAfterFinished());
      if (hasTtlSecondsAfterFinished()) {
        result = result && (getTtlSecondsAfterFinished() == other.getTtlSecondsAfterFinished());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasParallelism()) {
        hash = (37 * hash) + PARALLELISM_FIELD_NUMBER;
        hash = (53 * hash) + getParallelism();
      }
      if (hasCompletions()) {
        hash = (37 * hash) + COMPLETIONS_FIELD_NUMBER;
        hash = (53 * hash) + getCompletions();
      }
      if (hasActiveDeadlineSeconds()) {
        hash = (37 * hash) + ACTIVEDEADLINESECONDS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getActiveDeadlineSeconds());
      }
      if (hasBackoffLimit()) {
        hash = (37 * hash) + BACKOFFLIMIT_FIELD_NUMBER;
        hash = (53 * hash) + getBackoffLimit();
      }
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      if (hasManualSelector()) {
        hash = (37 * hash) + MANUALSELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getManualSelector());
      }
      if (hasTemplate()) {
        hash = (37 * hash) + TEMPLATE_FIELD_NUMBER;
        hash = (53 * hash) + getTemplate().hashCode();
      }
      if (hasTtlSecondsAfterFinished()) {
        hash = (37 * hash) + TTLSECONDSAFTERFINISHED_FIELD_NUMBER;
        hash = (53 * hash) + getTtlSecondsAfterFinished();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Batch.JobSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * JobSpec describes how the job execution will look like.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1.JobSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1.JobSpec)
        io.kubernetes.client.proto.V1Batch.JobSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Batch.JobSpec.class,
                io.kubernetes.client.proto.V1Batch.JobSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Batch.JobSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getSelectorFieldBuilder();
          getTemplateFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        parallelism_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        completions_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        activeDeadlineSeconds_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        backoffLimit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        manualSelector_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        if (templateBuilder_ == null) {
          template_ = null;
        } else {
          templateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        ttlSecondsAfterFinished_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobSpec build() {
        io.kubernetes.client.proto.V1Batch.JobSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobSpec buildPartial() {
        io.kubernetes.client.proto.V1Batch.JobSpec result =
            new io.kubernetes.client.proto.V1Batch.JobSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.parallelism_ = parallelism_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.completions_ = completions_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.activeDeadlineSeconds_ = activeDeadlineSeconds_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.backoffLimit_ = backoffLimit_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.manualSelector_ = manualSelector_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        if (templateBuilder_ == null) {
          result.template_ = template_;
        } else {
          result.template_ = templateBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.ttlSecondsAfterFinished_ = ttlSecondsAfterFinished_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Batch.JobSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1Batch.JobSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Batch.JobSpec other) {
        if (other == io.kubernetes.client.proto.V1Batch.JobSpec.getDefaultInstance()) return this;
        if (other.hasParallelism()) {
          setParallelism(other.getParallelism());
        }
        if (other.hasCompletions()) {
          setCompletions(other.getCompletions());
        }
        if (other.hasActiveDeadlineSeconds()) {
          setActiveDeadlineSeconds(other.getActiveDeadlineSeconds());
        }
        if (other.hasBackoffLimit()) {
          setBackoffLimit(other.getBackoffLimit());
        }
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
        }
        if (other.hasManualSelector()) {
          setManualSelector(other.getManualSelector());
        }
        if (other.hasTemplate()) {
          mergeTemplate(other.getTemplate());
        }
        if (other.hasTtlSecondsAfterFinished()) {
          setTtlSecondsAfterFinished(other.getTtlSecondsAfterFinished());
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
        io.kubernetes.client.proto.V1Batch.JobSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Batch.JobSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private int parallelism_;
      /**
       *
       *
       * <pre>
       * Specifies the maximum desired number of pods the job should
       * run at any given time. The actual number of pods running in steady state will
       * be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism),
       * i.e. when the work left to do is less than max parallelism.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * </pre>
       *
       * <code>optional int32 parallelism = 1;</code>
       */
      public boolean hasParallelism() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Specifies the maximum desired number of pods the job should
       * run at any given time. The actual number of pods running in steady state will
       * be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism),
       * i.e. when the work left to do is less than max parallelism.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * </pre>
       *
       * <code>optional int32 parallelism = 1;</code>
       */
      public int getParallelism() {
        return parallelism_;
      }
      /**
       *
       *
       * <pre>
       * Specifies the maximum desired number of pods the job should
       * run at any given time. The actual number of pods running in steady state will
       * be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism),
       * i.e. when the work left to do is less than max parallelism.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * </pre>
       *
       * <code>optional int32 parallelism = 1;</code>
       */
      public Builder setParallelism(int value) {
        bitField0_ |= 0x00000001;
        parallelism_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the maximum desired number of pods the job should
       * run at any given time. The actual number of pods running in steady state will
       * be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism),
       * i.e. when the work left to do is less than max parallelism.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * </pre>
       *
       * <code>optional int32 parallelism = 1;</code>
       */
      public Builder clearParallelism() {
        bitField0_ = (bitField0_ & ~0x00000001);
        parallelism_ = 0;
        onChanged();
        return this;
      }

      private int completions_;
      /**
       *
       *
       * <pre>
       * Specifies the desired number of successfully finished pods the
       * job should be run with.  Setting to nil means that the success of any
       * pod signals the success of all pods, and allows parallelism to have any positive
       * value.  Setting to 1 means that parallelism is limited to 1 and the success of that
       * pod signals the success of the job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * </pre>
       *
       * <code>optional int32 completions = 2;</code>
       */
      public boolean hasCompletions() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specifies the desired number of successfully finished pods the
       * job should be run with.  Setting to nil means that the success of any
       * pod signals the success of all pods, and allows parallelism to have any positive
       * value.  Setting to 1 means that parallelism is limited to 1 and the success of that
       * pod signals the success of the job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * </pre>
       *
       * <code>optional int32 completions = 2;</code>
       */
      public int getCompletions() {
        return completions_;
      }
      /**
       *
       *
       * <pre>
       * Specifies the desired number of successfully finished pods the
       * job should be run with.  Setting to nil means that the success of any
       * pod signals the success of all pods, and allows parallelism to have any positive
       * value.  Setting to 1 means that parallelism is limited to 1 and the success of that
       * pod signals the success of the job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * </pre>
       *
       * <code>optional int32 completions = 2;</code>
       */
      public Builder setCompletions(int value) {
        bitField0_ |= 0x00000002;
        completions_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the desired number of successfully finished pods the
       * job should be run with.  Setting to nil means that the success of any
       * pod signals the success of all pods, and allows parallelism to have any positive
       * value.  Setting to 1 means that parallelism is limited to 1 and the success of that
       * pod signals the success of the job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * </pre>
       *
       * <code>optional int32 completions = 2;</code>
       */
      public Builder clearCompletions() {
        bitField0_ = (bitField0_ & ~0x00000002);
        completions_ = 0;
        onChanged();
        return this;
      }

      private long activeDeadlineSeconds_;
      /**
       *
       *
       * <pre>
       * Specifies the duration in seconds relative to the startTime that the job may be active
       * before the system tries to terminate it; value must be positive integer
       * +optional
       * </pre>
       *
       * <code>optional int64 activeDeadlineSeconds = 3;</code>
       */
      public boolean hasActiveDeadlineSeconds() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Specifies the duration in seconds relative to the startTime that the job may be active
       * before the system tries to terminate it; value must be positive integer
       * +optional
       * </pre>
       *
       * <code>optional int64 activeDeadlineSeconds = 3;</code>
       */
      public long getActiveDeadlineSeconds() {
        return activeDeadlineSeconds_;
      }
      /**
       *
       *
       * <pre>
       * Specifies the duration in seconds relative to the startTime that the job may be active
       * before the system tries to terminate it; value must be positive integer
       * +optional
       * </pre>
       *
       * <code>optional int64 activeDeadlineSeconds = 3;</code>
       */
      public Builder setActiveDeadlineSeconds(long value) {
        bitField0_ |= 0x00000004;
        activeDeadlineSeconds_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the duration in seconds relative to the startTime that the job may be active
       * before the system tries to terminate it; value must be positive integer
       * +optional
       * </pre>
       *
       * <code>optional int64 activeDeadlineSeconds = 3;</code>
       */
      public Builder clearActiveDeadlineSeconds() {
        bitField0_ = (bitField0_ & ~0x00000004);
        activeDeadlineSeconds_ = 0L;
        onChanged();
        return this;
      }

      private int backoffLimit_;
      /**
       *
       *
       * <pre>
       * Specifies the number of retries before marking this job failed.
       * Defaults to 6
       * +optional
       * </pre>
       *
       * <code>optional int32 backoffLimit = 7;</code>
       */
      public boolean hasBackoffLimit() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * Specifies the number of retries before marking this job failed.
       * Defaults to 6
       * +optional
       * </pre>
       *
       * <code>optional int32 backoffLimit = 7;</code>
       */
      public int getBackoffLimit() {
        return backoffLimit_;
      }
      /**
       *
       *
       * <pre>
       * Specifies the number of retries before marking this job failed.
       * Defaults to 6
       * +optional
       * </pre>
       *
       * <code>optional int32 backoffLimit = 7;</code>
       */
      public Builder setBackoffLimit(int value) {
        bitField0_ |= 0x00000008;
        backoffLimit_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the number of retries before marking this job failed.
       * Defaults to 6
       * +optional
       * </pre>
       *
       * <code>optional int32 backoffLimit = 7;</code>
       */
      public Builder clearBackoffLimit() {
        bitField0_ = (bitField0_ & ~0x00000008);
        backoffLimit_ = 0;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector selector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          selectorBuilder_;
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
        if (selectorBuilder_ == null) {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        } else {
          return selectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder setSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          selector_ = value;
          onChanged();
        } else {
          selectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder setSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (selectorBuilder_ == null) {
          selector_ = builderForValue.build();
          onChanged();
        } else {
          selectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && selector_ != null
              && selector_ != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            selector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(selector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            selector_ = value;
          }
          onChanged();
        } else {
          selectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
        if (selectorBuilder_ != null) {
          return selectorBuilder_.getMessageOrBuilder();
        } else {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        }
      }
      /**
       *
       *
       * <pre>
       * A label query over pods that should match the pod count.
       * Normally, the system sets this field for you.
       * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getSelectorFieldBuilder() {
        if (selectorBuilder_ == null) {
          selectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getSelector(), getParentForChildren(), isClean());
          selector_ = null;
        }
        return selectorBuilder_;
      }

      private boolean manualSelector_;
      /**
       *
       *
       * <pre>
       * manualSelector controls generation of pod labels and pod selectors.
       * Leave `manualSelector` unset unless you are certain what you are doing.
       * When false or unset, the system pick labels unique to this job
       * and appends those labels to the pod template.  When true,
       * the user is responsible for picking unique labels and specifying
       * the selector.  Failure to pick a unique label may cause this
       * and other jobs to not function correctly.  However, You may see
       * `manualSelector=true` in jobs that were created with the old `extensions/v1beta1`
       * API.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
       * +optional
       * </pre>
       *
       * <code>optional bool manualSelector = 5;</code>
       */
      public boolean hasManualSelector() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * manualSelector controls generation of pod labels and pod selectors.
       * Leave `manualSelector` unset unless you are certain what you are doing.
       * When false or unset, the system pick labels unique to this job
       * and appends those labels to the pod template.  When true,
       * the user is responsible for picking unique labels and specifying
       * the selector.  Failure to pick a unique label may cause this
       * and other jobs to not function correctly.  However, You may see
       * `manualSelector=true` in jobs that were created with the old `extensions/v1beta1`
       * API.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
       * +optional
       * </pre>
       *
       * <code>optional bool manualSelector = 5;</code>
       */
      public boolean getManualSelector() {
        return manualSelector_;
      }
      /**
       *
       *
       * <pre>
       * manualSelector controls generation of pod labels and pod selectors.
       * Leave `manualSelector` unset unless you are certain what you are doing.
       * When false or unset, the system pick labels unique to this job
       * and appends those labels to the pod template.  When true,
       * the user is responsible for picking unique labels and specifying
       * the selector.  Failure to pick a unique label may cause this
       * and other jobs to not function correctly.  However, You may see
       * `manualSelector=true` in jobs that were created with the old `extensions/v1beta1`
       * API.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
       * +optional
       * </pre>
       *
       * <code>optional bool manualSelector = 5;</code>
       */
      public Builder setManualSelector(boolean value) {
        bitField0_ |= 0x00000020;
        manualSelector_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * manualSelector controls generation of pod labels and pod selectors.
       * Leave `manualSelector` unset unless you are certain what you are doing.
       * When false or unset, the system pick labels unique to this job
       * and appends those labels to the pod template.  When true,
       * the user is responsible for picking unique labels and specifying
       * the selector.  Failure to pick a unique label may cause this
       * and other jobs to not function correctly.  However, You may see
       * `manualSelector=true` in jobs that were created with the old `extensions/v1beta1`
       * API.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
       * +optional
       * </pre>
       *
       * <code>optional bool manualSelector = 5;</code>
       */
      public Builder clearManualSelector() {
        bitField0_ = (bitField0_ & ~0x00000020);
        manualSelector_ = false;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1.PodTemplateSpec template_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1.PodTemplateSpec,
              io.kubernetes.client.proto.V1.PodTemplateSpec.Builder,
              io.kubernetes.client.proto.V1.PodTemplateSpecOrBuilder>
          templateBuilder_;
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      public boolean hasTemplate() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      public io.kubernetes.client.proto.V1.PodTemplateSpec getTemplate() {
        if (templateBuilder_ == null) {
          return template_ == null
              ? io.kubernetes.client.proto.V1.PodTemplateSpec.getDefaultInstance()
              : template_;
        } else {
          return templateBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      public Builder setTemplate(io.kubernetes.client.proto.V1.PodTemplateSpec value) {
        if (templateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          template_ = value;
          onChanged();
        } else {
          templateBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      public Builder setTemplate(
          io.kubernetes.client.proto.V1.PodTemplateSpec.Builder builderForValue) {
        if (templateBuilder_ == null) {
          template_ = builderForValue.build();
          onChanged();
        } else {
          templateBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      public Builder mergeTemplate(io.kubernetes.client.proto.V1.PodTemplateSpec value) {
        if (templateBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)
              && template_ != null
              && template_ != io.kubernetes.client.proto.V1.PodTemplateSpec.getDefaultInstance()) {
            template_ =
                io.kubernetes.client.proto.V1.PodTemplateSpec.newBuilder(template_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            template_ = value;
          }
          onChanged();
        } else {
          templateBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      public Builder clearTemplate() {
        if (templateBuilder_ == null) {
          template_ = null;
          onChanged();
        } else {
          templateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      public io.kubernetes.client.proto.V1.PodTemplateSpec.Builder getTemplateBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getTemplateFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      public io.kubernetes.client.proto.V1.PodTemplateSpecOrBuilder getTemplateOrBuilder() {
        if (templateBuilder_ != null) {
          return templateBuilder_.getMessageOrBuilder();
        } else {
          return template_ == null
              ? io.kubernetes.client.proto.V1.PodTemplateSpec.getDefaultInstance()
              : template_;
        }
      }
      /**
       *
       *
       * <pre>
       * Describes the pod that will be created when executing a job.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PodTemplateSpec template = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1.PodTemplateSpec,
              io.kubernetes.client.proto.V1.PodTemplateSpec.Builder,
              io.kubernetes.client.proto.V1.PodTemplateSpecOrBuilder>
          getTemplateFieldBuilder() {
        if (templateBuilder_ == null) {
          templateBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1.PodTemplateSpec,
                  io.kubernetes.client.proto.V1.PodTemplateSpec.Builder,
                  io.kubernetes.client.proto.V1.PodTemplateSpecOrBuilder>(
                  getTemplate(), getParentForChildren(), isClean());
          template_ = null;
        }
        return templateBuilder_;
      }

      private int ttlSecondsAfterFinished_;
      /**
       *
       *
       * <pre>
       * ttlSecondsAfterFinished limits the lifetime of a Job that has finished
       * execution (either Complete or Failed). If this field is set,
       * ttlSecondsAfterFinished after the Job finishes, it is eligible to be
       * automatically deleted. When the Job is being deleted, its lifecycle
       * guarantees (e.g. finalizers) will be honored. If this field is unset,
       * the Job won't be automatically deleted. If this field is set to zero,
       * the Job becomes eligible to be deleted immediately after it finishes.
       * This field is alpha-level and is only honored by servers that enable the
       * TTLAfterFinished feature.
       * +optional
       * </pre>
       *
       * <code>optional int32 ttlSecondsAfterFinished = 8;</code>
       */
      public boolean hasTtlSecondsAfterFinished() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       *
       *
       * <pre>
       * ttlSecondsAfterFinished limits the lifetime of a Job that has finished
       * execution (either Complete or Failed). If this field is set,
       * ttlSecondsAfterFinished after the Job finishes, it is eligible to be
       * automatically deleted. When the Job is being deleted, its lifecycle
       * guarantees (e.g. finalizers) will be honored. If this field is unset,
       * the Job won't be automatically deleted. If this field is set to zero,
       * the Job becomes eligible to be deleted immediately after it finishes.
       * This field is alpha-level and is only honored by servers that enable the
       * TTLAfterFinished feature.
       * +optional
       * </pre>
       *
       * <code>optional int32 ttlSecondsAfterFinished = 8;</code>
       */
      public int getTtlSecondsAfterFinished() {
        return ttlSecondsAfterFinished_;
      }
      /**
       *
       *
       * <pre>
       * ttlSecondsAfterFinished limits the lifetime of a Job that has finished
       * execution (either Complete or Failed). If this field is set,
       * ttlSecondsAfterFinished after the Job finishes, it is eligible to be
       * automatically deleted. When the Job is being deleted, its lifecycle
       * guarantees (e.g. finalizers) will be honored. If this field is unset,
       * the Job won't be automatically deleted. If this field is set to zero,
       * the Job becomes eligible to be deleted immediately after it finishes.
       * This field is alpha-level and is only honored by servers that enable the
       * TTLAfterFinished feature.
       * +optional
       * </pre>
       *
       * <code>optional int32 ttlSecondsAfterFinished = 8;</code>
       */
      public Builder setTtlSecondsAfterFinished(int value) {
        bitField0_ |= 0x00000080;
        ttlSecondsAfterFinished_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ttlSecondsAfterFinished limits the lifetime of a Job that has finished
       * execution (either Complete or Failed). If this field is set,
       * ttlSecondsAfterFinished after the Job finishes, it is eligible to be
       * automatically deleted. When the Job is being deleted, its lifecycle
       * guarantees (e.g. finalizers) will be honored. If this field is unset,
       * the Job won't be automatically deleted. If this field is set to zero,
       * the Job becomes eligible to be deleted immediately after it finishes.
       * This field is alpha-level and is only honored by servers that enable the
       * TTLAfterFinished feature.
       * +optional
       * </pre>
       *
       * <code>optional int32 ttlSecondsAfterFinished = 8;</code>
       */
      public Builder clearTtlSecondsAfterFinished() {
        bitField0_ = (bitField0_ & ~0x00000080);
        ttlSecondsAfterFinished_ = 0;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1.JobSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1.JobSpec)
    private static final io.kubernetes.client.proto.V1Batch.JobSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Batch.JobSpec();
    }

    public static io.kubernetes.client.proto.V1Batch.JobSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<JobSpec> PARSER =
        new com.google.protobuf.AbstractParser<JobSpec>() {
          @java.lang.Override
          public JobSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new JobSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<JobSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JobSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Batch.JobSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface JobStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.batch.v1.JobStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Batch.JobCondition> getConditionsList();
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobCondition getConditions(int index);
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    int getConditionsCount();
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder>
        getConditionsOrBuilderList();
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder getConditionsOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * Represents time when the job was acknowledged by the job controller.
     * It is not guaranteed to be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
     */
    boolean hasStartTime();
    /**
     *
     *
     * <pre>
     * Represents time when the job was acknowledged by the job controller.
     * It is not guaranteed to be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
     */
    io.kubernetes.client.proto.Meta.Time getStartTime();
    /**
     *
     *
     * <pre>
     * Represents time when the job was acknowledged by the job controller.
     * It is not guaranteed to be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getStartTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * Represents time when the job was completed. It is not guaranteed to
     * be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
     */
    boolean hasCompletionTime();
    /**
     *
     *
     * <pre>
     * Represents time when the job was completed. It is not guaranteed to
     * be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
     */
    io.kubernetes.client.proto.Meta.Time getCompletionTime();
    /**
     *
     *
     * <pre>
     * Represents time when the job was completed. It is not guaranteed to
     * be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getCompletionTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * The number of actively running pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 active = 4;</code>
     */
    boolean hasActive();
    /**
     *
     *
     * <pre>
     * The number of actively running pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 active = 4;</code>
     */
    int getActive();

    /**
     *
     *
     * <pre>
     * The number of pods which reached phase Succeeded.
     * +optional
     * </pre>
     *
     * <code>optional int32 succeeded = 5;</code>
     */
    boolean hasSucceeded();
    /**
     *
     *
     * <pre>
     * The number of pods which reached phase Succeeded.
     * +optional
     * </pre>
     *
     * <code>optional int32 succeeded = 5;</code>
     */
    int getSucceeded();

    /**
     *
     *
     * <pre>
     * The number of pods which reached phase Failed.
     * +optional
     * </pre>
     *
     * <code>optional int32 failed = 6;</code>
     */
    boolean hasFailed();
    /**
     *
     *
     * <pre>
     * The number of pods which reached phase Failed.
     * +optional
     * </pre>
     *
     * <code>optional int32 failed = 6;</code>
     */
    int getFailed();
  }
  /**
   *
   *
   * <pre>
   * JobStatus represents the current state of a Job.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.batch.v1.JobStatus}
   */
  public static final class JobStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.batch.v1.JobStatus)
      JobStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use JobStatus.newBuilder() to construct.
    private JobStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private JobStatus() {
      conditions_ = java.util.Collections.emptyList();
      active_ = 0;
      succeeded_ = 0;
      failed_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private JobStatus(
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
            case 10:
              {
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  conditions_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1Batch.JobCondition>();
                  mutable_bitField0_ |= 0x00000001;
                }
                conditions_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Batch.JobCondition.PARSER, extensionRegistry));
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = startTime_.toBuilder();
                }
                startTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(startTime_);
                  startTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = completionTime_.toBuilder();
                }
                completionTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(completionTime_);
                  completionTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000004;
                active_ = input.readInt32();
                break;
              }
            case 40:
              {
                bitField0_ |= 0x00000008;
                succeeded_ = input.readInt32();
                break;
              }
            case 48:
              {
                bitField0_ |= 0x00000010;
                failed_ = input.readInt32();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          conditions_ = java.util.Collections.unmodifiableList(conditions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_JobStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Batch
          .internal_static_k8s_io_api_batch_v1_JobStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Batch.JobStatus.class,
              io.kubernetes.client.proto.V1Batch.JobStatus.Builder.class);
    }

    private int bitField0_;
    public static final int CONDITIONS_FIELD_NUMBER = 1;
    private java.util.List<io.kubernetes.client.proto.V1Batch.JobCondition> conditions_;
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Batch.JobCondition> getConditionsList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder>
        getConditionsOrBuilderList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    public int getConditionsCount() {
      return conditions_.size();
    }
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobCondition getConditions(int index) {
      return conditions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The latest available observations of an object's current state.
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
     */
    public io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder getConditionsOrBuilder(
        int index) {
      return conditions_.get(index);
    }

    public static final int STARTTIME_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.Time startTime_;
    /**
     *
     *
     * <pre>
     * Represents time when the job was acknowledged by the job controller.
     * It is not guaranteed to be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Represents time when the job was acknowledged by the job controller.
     * It is not guaranteed to be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getStartTime() {
      return startTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : startTime_;
    }
    /**
     *
     *
     * <pre>
     * Represents time when the job was acknowledged by the job controller.
     * It is not guaranteed to be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getStartTimeOrBuilder() {
      return startTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : startTime_;
    }

    public static final int COMPLETIONTIME_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Meta.Time completionTime_;
    /**
     *
     *
     * <pre>
     * Represents time when the job was completed. It is not guaranteed to
     * be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
     */
    public boolean hasCompletionTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Represents time when the job was completed. It is not guaranteed to
     * be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getCompletionTime() {
      return completionTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : completionTime_;
    }
    /**
     *
     *
     * <pre>
     * Represents time when the job was completed. It is not guaranteed to
     * be set in happens-before order across separate operations.
     * It is represented in RFC3339 form and is in UTC.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getCompletionTimeOrBuilder() {
      return completionTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : completionTime_;
    }

    public static final int ACTIVE_FIELD_NUMBER = 4;
    private int active_;
    /**
     *
     *
     * <pre>
     * The number of actively running pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 active = 4;</code>
     */
    public boolean hasActive() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * The number of actively running pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 active = 4;</code>
     */
    public int getActive() {
      return active_;
    }

    public static final int SUCCEEDED_FIELD_NUMBER = 5;
    private int succeeded_;
    /**
     *
     *
     * <pre>
     * The number of pods which reached phase Succeeded.
     * +optional
     * </pre>
     *
     * <code>optional int32 succeeded = 5;</code>
     */
    public boolean hasSucceeded() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * The number of pods which reached phase Succeeded.
     * +optional
     * </pre>
     *
     * <code>optional int32 succeeded = 5;</code>
     */
    public int getSucceeded() {
      return succeeded_;
    }

    public static final int FAILED_FIELD_NUMBER = 6;
    private int failed_;
    /**
     *
     *
     * <pre>
     * The number of pods which reached phase Failed.
     * +optional
     * </pre>
     *
     * <code>optional int32 failed = 6;</code>
     */
    public boolean hasFailed() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * The number of pods which reached phase Failed.
     * +optional
     * </pre>
     *
     * <code>optional int32 failed = 6;</code>
     */
    public int getFailed() {
      return failed_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < conditions_.size(); i++) {
        output.writeMessage(1, conditions_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(2, getStartTime());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, getCompletionTime());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(4, active_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(5, succeeded_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(6, failed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < conditions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, conditions_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStartTime());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCompletionTime());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, active_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(5, succeeded_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(6, failed_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Batch.JobStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Batch.JobStatus other =
          (io.kubernetes.client.proto.V1Batch.JobStatus) obj;

      boolean result = true;
      result = result && getConditionsList().equals(other.getConditionsList());
      result = result && (hasStartTime() == other.hasStartTime());
      if (hasStartTime()) {
        result = result && getStartTime().equals(other.getStartTime());
      }
      result = result && (hasCompletionTime() == other.hasCompletionTime());
      if (hasCompletionTime()) {
        result = result && getCompletionTime().equals(other.getCompletionTime());
      }
      result = result && (hasActive() == other.hasActive());
      if (hasActive()) {
        result = result && (getActive() == other.getActive());
      }
      result = result && (hasSucceeded() == other.hasSucceeded());
      if (hasSucceeded()) {
        result = result && (getSucceeded() == other.getSucceeded());
      }
      result = result && (hasFailed() == other.hasFailed());
      if (hasFailed()) {
        result = result && (getFailed() == other.getFailed());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getConditionsCount() > 0) {
        hash = (37 * hash) + CONDITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getConditionsList().hashCode();
      }
      if (hasStartTime()) {
        hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
        hash = (53 * hash) + getStartTime().hashCode();
      }
      if (hasCompletionTime()) {
        hash = (37 * hash) + COMPLETIONTIME_FIELD_NUMBER;
        hash = (53 * hash) + getCompletionTime().hashCode();
      }
      if (hasActive()) {
        hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
        hash = (53 * hash) + getActive();
      }
      if (hasSucceeded()) {
        hash = (37 * hash) + SUCCEEDED_FIELD_NUMBER;
        hash = (53 * hash) + getSucceeded();
      }
      if (hasFailed()) {
        hash = (37 * hash) + FAILED_FIELD_NUMBER;
        hash = (53 * hash) + getFailed();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Batch.JobStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * JobStatus represents the current state of a Job.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.batch.v1.JobStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.batch.v1.JobStatus)
        io.kubernetes.client.proto.V1Batch.JobStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Batch.JobStatus.class,
                io.kubernetes.client.proto.V1Batch.JobStatus.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Batch.JobStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getConditionsFieldBuilder();
          getStartTimeFieldBuilder();
          getCompletionTimeFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          conditionsBuilder_.clear();
        }
        if (startTimeBuilder_ == null) {
          startTime_ = null;
        } else {
          startTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (completionTimeBuilder_ == null) {
          completionTime_ = null;
        } else {
          completionTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        active_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        succeeded_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        failed_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Batch
            .internal_static_k8s_io_api_batch_v1_JobStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobStatus getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Batch.JobStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobStatus build() {
        io.kubernetes.client.proto.V1Batch.JobStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Batch.JobStatus buildPartial() {
        io.kubernetes.client.proto.V1Batch.JobStatus result =
            new io.kubernetes.client.proto.V1Batch.JobStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (conditionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            conditions_ = java.util.Collections.unmodifiableList(conditions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.conditions_ = conditions_;
        } else {
          result.conditions_ = conditionsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        if (startTimeBuilder_ == null) {
          result.startTime_ = startTime_;
        } else {
          result.startTime_ = startTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (completionTimeBuilder_ == null) {
          result.completionTime_ = completionTime_;
        } else {
          result.completionTime_ = completionTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.active_ = active_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.succeeded_ = succeeded_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        result.failed_ = failed_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Batch.JobStatus) {
          return mergeFrom((io.kubernetes.client.proto.V1Batch.JobStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Batch.JobStatus other) {
        if (other == io.kubernetes.client.proto.V1Batch.JobStatus.getDefaultInstance()) return this;
        if (conditionsBuilder_ == null) {
          if (!other.conditions_.isEmpty()) {
            if (conditions_.isEmpty()) {
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureConditionsIsMutable();
              conditions_.addAll(other.conditions_);
            }
            onChanged();
          }
        } else {
          if (!other.conditions_.isEmpty()) {
            if (conditionsBuilder_.isEmpty()) {
              conditionsBuilder_.dispose();
              conditionsBuilder_ = null;
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              conditionsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getConditionsFieldBuilder()
                      : null;
            } else {
              conditionsBuilder_.addAllMessages(other.conditions_);
            }
          }
        }
        if (other.hasStartTime()) {
          mergeStartTime(other.getStartTime());
        }
        if (other.hasCompletionTime()) {
          mergeCompletionTime(other.getCompletionTime());
        }
        if (other.hasActive()) {
          setActive(other.getActive());
        }
        if (other.hasSucceeded()) {
          setSucceeded(other.getSucceeded());
        }
        if (other.hasFailed()) {
          setFailed(other.getFailed());
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
        io.kubernetes.client.proto.V1Batch.JobStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Batch.JobStatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<io.kubernetes.client.proto.V1Batch.JobCondition> conditions_ =
          java.util.Collections.emptyList();

      private void ensureConditionsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          conditions_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Batch.JobCondition>(conditions_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.JobCondition,
              io.kubernetes.client.proto.V1Batch.JobCondition.Builder,
              io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder>
          conditionsBuilder_;

      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Batch.JobCondition> getConditionsList() {
        if (conditionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(conditions_);
        } else {
          return conditionsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public int getConditionsCount() {
        if (conditionsBuilder_ == null) {
          return conditions_.size();
        } else {
          return conditionsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobCondition getConditions(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder setConditions(
          int index, io.kubernetes.client.proto.V1Batch.JobCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.set(index, value);
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder setConditions(
          int index, io.kubernetes.client.proto.V1Batch.JobCondition.Builder builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.set(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder addConditions(io.kubernetes.client.proto.V1Batch.JobCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder addConditions(
          int index, io.kubernetes.client.proto.V1Batch.JobCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(index, value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder addConditions(
          io.kubernetes.client.proto.V1Batch.JobCondition.Builder builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder addConditions(
          int index, io.kubernetes.client.proto.V1Batch.JobCondition.Builder builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder addAllConditions(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Batch.JobCondition> values) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, conditions_);
          onChanged();
        } else {
          conditionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder clearConditions() {
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          conditionsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public Builder removeConditions(int index) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.remove(index);
          onChanged();
        } else {
          conditionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobCondition.Builder getConditionsBuilder(
          int index) {
        return getConditionsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder getConditionsOrBuilder(
          int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder>
          getConditionsOrBuilderList() {
        if (conditionsBuilder_ != null) {
          return conditionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(conditions_);
        }
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobCondition.Builder addConditionsBuilder() {
        return getConditionsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Batch.JobCondition.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public io.kubernetes.client.proto.V1Batch.JobCondition.Builder addConditionsBuilder(
          int index) {
        return getConditionsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Batch.JobCondition.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * The latest available observations of an object's current state.
       * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.batch.v1.JobCondition conditions = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Batch.JobCondition.Builder>
          getConditionsBuilderList() {
        return getConditionsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Batch.JobCondition,
              io.kubernetes.client.proto.V1Batch.JobCondition.Builder,
              io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder>
          getConditionsFieldBuilder() {
        if (conditionsBuilder_ == null) {
          conditionsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Batch.JobCondition,
                  io.kubernetes.client.proto.V1Batch.JobCondition.Builder,
                  io.kubernetes.client.proto.V1Batch.JobConditionOrBuilder>(
                  conditions_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          conditions_ = null;
        }
        return conditionsBuilder_;
      }

      private io.kubernetes.client.proto.Meta.Time startTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          startTimeBuilder_;
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      public boolean hasStartTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getStartTime() {
        if (startTimeBuilder_ == null) {
          return startTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : startTime_;
        } else {
          return startTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      public Builder setStartTime(io.kubernetes.client.proto.Meta.Time value) {
        if (startTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          startTime_ = value;
          onChanged();
        } else {
          startTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      public Builder setStartTime(io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (startTimeBuilder_ == null) {
          startTime_ = builderForValue.build();
          onChanged();
        } else {
          startTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      public Builder mergeStartTime(io.kubernetes.client.proto.Meta.Time value) {
        if (startTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && startTime_ != null
              && startTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            startTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(startTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            startTime_ = value;
          }
          onChanged();
        } else {
          startTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      public Builder clearStartTime() {
        if (startTimeBuilder_ == null) {
          startTime_ = null;
          onChanged();
        } else {
          startTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getStartTimeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getStartTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getStartTimeOrBuilder() {
        if (startTimeBuilder_ != null) {
          return startTimeBuilder_.getMessageOrBuilder();
        } else {
          return startTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : startTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was acknowledged by the job controller.
       * It is not guaranteed to be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time startTime = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getStartTimeFieldBuilder() {
        if (startTimeBuilder_ == null) {
          startTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getStartTime(), getParentForChildren(), isClean());
          startTime_ = null;
        }
        return startTimeBuilder_;
      }

      private io.kubernetes.client.proto.Meta.Time completionTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          completionTimeBuilder_;
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      public boolean hasCompletionTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getCompletionTime() {
        if (completionTimeBuilder_ == null) {
          return completionTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : completionTime_;
        } else {
          return completionTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      public Builder setCompletionTime(io.kubernetes.client.proto.Meta.Time value) {
        if (completionTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          completionTime_ = value;
          onChanged();
        } else {
          completionTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      public Builder setCompletionTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (completionTimeBuilder_ == null) {
          completionTime_ = builderForValue.build();
          onChanged();
        } else {
          completionTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      public Builder mergeCompletionTime(io.kubernetes.client.proto.Meta.Time value) {
        if (completionTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && completionTime_ != null
              && completionTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            completionTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(completionTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            completionTime_ = value;
          }
          onChanged();
        } else {
          completionTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      public Builder clearCompletionTime() {
        if (completionTimeBuilder_ == null) {
          completionTime_ = null;
          onChanged();
        } else {
          completionTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getCompletionTimeBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getCompletionTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getCompletionTimeOrBuilder() {
        if (completionTimeBuilder_ != null) {
          return completionTimeBuilder_.getMessageOrBuilder();
        } else {
          return completionTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : completionTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * Represents time when the job was completed. It is not guaranteed to
       * be set in happens-before order across separate operations.
       * It is represented in RFC3339 form and is in UTC.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time completionTime = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getCompletionTimeFieldBuilder() {
        if (completionTimeBuilder_ == null) {
          completionTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getCompletionTime(), getParentForChildren(), isClean());
          completionTime_ = null;
        }
        return completionTimeBuilder_;
      }

      private int active_;
      /**
       *
       *
       * <pre>
       * The number of actively running pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 active = 4;</code>
       */
      public boolean hasActive() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * The number of actively running pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 active = 4;</code>
       */
      public int getActive() {
        return active_;
      }
      /**
       *
       *
       * <pre>
       * The number of actively running pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 active = 4;</code>
       */
      public Builder setActive(int value) {
        bitField0_ |= 0x00000008;
        active_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The number of actively running pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 active = 4;</code>
       */
      public Builder clearActive() {
        bitField0_ = (bitField0_ & ~0x00000008);
        active_ = 0;
        onChanged();
        return this;
      }

      private int succeeded_;
      /**
       *
       *
       * <pre>
       * The number of pods which reached phase Succeeded.
       * +optional
       * </pre>
       *
       * <code>optional int32 succeeded = 5;</code>
       */
      public boolean hasSucceeded() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * The number of pods which reached phase Succeeded.
       * +optional
       * </pre>
       *
       * <code>optional int32 succeeded = 5;</code>
       */
      public int getSucceeded() {
        return succeeded_;
      }
      /**
       *
       *
       * <pre>
       * The number of pods which reached phase Succeeded.
       * +optional
       * </pre>
       *
       * <code>optional int32 succeeded = 5;</code>
       */
      public Builder setSucceeded(int value) {
        bitField0_ |= 0x00000010;
        succeeded_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The number of pods which reached phase Succeeded.
       * +optional
       * </pre>
       *
       * <code>optional int32 succeeded = 5;</code>
       */
      public Builder clearSucceeded() {
        bitField0_ = (bitField0_ & ~0x00000010);
        succeeded_ = 0;
        onChanged();
        return this;
      }

      private int failed_;
      /**
       *
       *
       * <pre>
       * The number of pods which reached phase Failed.
       * +optional
       * </pre>
       *
       * <code>optional int32 failed = 6;</code>
       */
      public boolean hasFailed() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * The number of pods which reached phase Failed.
       * +optional
       * </pre>
       *
       * <code>optional int32 failed = 6;</code>
       */
      public int getFailed() {
        return failed_;
      }
      /**
       *
       *
       * <pre>
       * The number of pods which reached phase Failed.
       * +optional
       * </pre>
       *
       * <code>optional int32 failed = 6;</code>
       */
      public Builder setFailed(int value) {
        bitField0_ |= 0x00000020;
        failed_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The number of pods which reached phase Failed.
       * +optional
       * </pre>
       *
       * <code>optional int32 failed = 6;</code>
       */
      public Builder clearFailed() {
        bitField0_ = (bitField0_ & ~0x00000020);
        failed_ = 0;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.batch.v1.JobStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.batch.v1.JobStatus)
    private static final io.kubernetes.client.proto.V1Batch.JobStatus DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Batch.JobStatus();
    }

    public static io.kubernetes.client.proto.V1Batch.JobStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<JobStatus> PARSER =
        new com.google.protobuf.AbstractParser<JobStatus>() {
          @java.lang.Override
          public JobStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new JobStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<JobStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JobStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Batch.JobStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1_Job_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1_Job_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1_JobCondition_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1_JobCondition_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1_JobList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1_JobList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1_JobSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1_JobSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_batch_v1_JobStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_batch_v1_JobStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#k8s.io/api/batch/v1/generated.proto\022\023k"
          + "8s.io.api.batch.v1\032\"k8s.io/api/core/v1/g"
          + "enerated.proto\0324k8s.io/apimachinery/pkg/"
          + "apis/meta/v1/generated.proto\032/k8s.io/api"
          + "machinery/pkg/runtime/generated.proto\0326k"
          + "8s.io/apimachinery/pkg/runtime/schema/ge"
          + "nerated.proto\"\245\001\n\003Job\022B\n\010metadata\030\001 \001(\0132"
          + "0.k8s.io.apimachinery.pkg.apis.meta.v1.O"
          + "bjectMeta\022*\n\004spec\030\002 \001(\0132\034.k8s.io.api.bat"
          + "ch.v1.JobSpec\022.\n\006status\030\003 \001(\0132\036.k8s.io.a"
          + "pi.batch.v1.JobStatus\"\330\001\n\014JobCondition\022\014"
          + "\n\004type\030\001 \001(\t\022\016\n\006status\030\002 \001(\t\022A\n\rlastProb"
          + "eTime\030\003 \001(\0132*.k8s.io.apimachinery.pkg.ap"
          + "is.meta.v1.Time\022F\n\022lastTransitionTime\030\004 "
          + "\001(\0132*.k8s.io.apimachinery.pkg.apis.meta."
          + "v1.Time\022\016\n\006reason\030\005 \001(\t\022\017\n\007message\030\006 \001(\t"
          + "\"t\n\007JobList\022@\n\010metadata\030\001 \001(\0132..k8s.io.a"
          + "pimachinery.pkg.apis.meta.v1.ListMeta\022\'\n"
          + "\005items\030\002 \003(\0132\030.k8s.io.api.batch.v1.Job\"\237"
          + "\002\n\007JobSpec\022\023\n\013parallelism\030\001 \001(\005\022\023\n\013compl"
          + "etions\030\002 \001(\005\022\035\n\025activeDeadlineSeconds\030\003 "
          + "\001(\003\022\024\n\014backoffLimit\030\007 \001(\005\022E\n\010selector\030\004 "
          + "\001(\01323.k8s.io.apimachinery.pkg.apis.meta."
          + "v1.LabelSelector\022\026\n\016manualSelector\030\005 \001(\010"
          + "\0225\n\010template\030\006 \001(\0132#.k8s.io.api.core.v1."
          + "PodTemplateSpec\022\037\n\027ttlSecondsAfterFinish"
          + "ed\030\010 \001(\005\"\370\001\n\tJobStatus\0225\n\nconditions\030\001 \003"
          + "(\0132!.k8s.io.api.batch.v1.JobCondition\022=\n"
          + "\tstartTime\030\002 \001(\0132*.k8s.io.apimachinery.p"
          + "kg.apis.meta.v1.Time\022B\n\016completionTime\030\003"
          + " \001(\0132*.k8s.io.apimachinery.pkg.apis.meta"
          + ".v1.Time\022\016\n\006active\030\004 \001(\005\022\021\n\tsucceeded\030\005 "
          + "\001(\005\022\016\n\006failed\030\006 \001(\005B)\n\032io.kubernetes.cli"
          + "ent.protoB\007V1BatchZ\002v1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.V1.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_batch_v1_Job_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_batch_v1_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1_Job_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_batch_v1_JobCondition_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_batch_v1_JobCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1_JobCondition_descriptor,
            new java.lang.String[] {
              "Type", "Status", "LastProbeTime", "LastTransitionTime", "Reason", "Message",
            });
    internal_static_k8s_io_api_batch_v1_JobList_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_batch_v1_JobList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1_JobList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_batch_v1_JobSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_batch_v1_JobSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1_JobSpec_descriptor,
            new java.lang.String[] {
              "Parallelism",
              "Completions",
              "ActiveDeadlineSeconds",
              "BackoffLimit",
              "Selector",
              "ManualSelector",
              "Template",
              "TtlSecondsAfterFinished",
            });
    internal_static_k8s_io_api_batch_v1_JobStatus_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_batch_v1_JobStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_batch_v1_JobStatus_descriptor,
            new java.lang.String[] {
              "Conditions", "StartTime", "CompletionTime", "Active", "Succeeded", "Failed",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
