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

public final class V1beta1Policy {
  private V1beta1Policy() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface AllowedFlexVolumeOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.AllowedFlexVolume)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * driver is the name of the Flexvolume driver.
     * </pre>
     *
     * <code>optional string driver = 1;</code>
     */
    boolean hasDriver();
    /**
     *
     *
     * <pre>
     * driver is the name of the Flexvolume driver.
     * </pre>
     *
     * <code>optional string driver = 1;</code>
     */
    java.lang.String getDriver();
    /**
     *
     *
     * <pre>
     * driver is the name of the Flexvolume driver.
     * </pre>
     *
     * <code>optional string driver = 1;</code>
     */
    com.google.protobuf.ByteString getDriverBytes();
  }
  /**
   *
   *
   * <pre>
   * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.AllowedFlexVolume}
   */
  public static final class AllowedFlexVolume extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.AllowedFlexVolume)
      AllowedFlexVolumeOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AllowedFlexVolume.newBuilder() to construct.
    private AllowedFlexVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AllowedFlexVolume() {
      driver_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AllowedFlexVolume(
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
                driver_ = bs;
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.class,
              io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder.class);
    }

    private int bitField0_;
    public static final int DRIVER_FIELD_NUMBER = 1;
    private volatile java.lang.Object driver_;
    /**
     *
     *
     * <pre>
     * driver is the name of the Flexvolume driver.
     * </pre>
     *
     * <code>optional string driver = 1;</code>
     */
    public boolean hasDriver() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * driver is the name of the Flexvolume driver.
     * </pre>
     *
     * <code>optional string driver = 1;</code>
     */
    public java.lang.String getDriver() {
      java.lang.Object ref = driver_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          driver_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * driver is the name of the Flexvolume driver.
     * </pre>
     *
     * <code>optional string driver = 1;</code>
     */
    public com.google.protobuf.ByteString getDriverBytes() {
      java.lang.Object ref = driver_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        driver_ = b;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, driver_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, driver_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume other =
          (io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume) obj;

      boolean result = true;
      result = result && (hasDriver() == other.hasDriver());
      if (hasDriver()) {
        result = result && getDriver().equals(other.getDriver());
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
      if (hasDriver()) {
        hash = (37 * hash) + DRIVER_FIELD_NUMBER;
        hash = (53 * hash) + getDriver().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume prototype) {
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
     * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.AllowedFlexVolume}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.AllowedFlexVolume)
        io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.class,
                io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        driver_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume build() {
        io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume result =
            new io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.driver_ = driver_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.getDefaultInstance())
          return this;
        if (other.hasDriver()) {
          bitField0_ |= 0x00000001;
          driver_ = other.driver_;
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
        io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object driver_ = "";
      /**
       *
       *
       * <pre>
       * driver is the name of the Flexvolume driver.
       * </pre>
       *
       * <code>optional string driver = 1;</code>
       */
      public boolean hasDriver() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * driver is the name of the Flexvolume driver.
       * </pre>
       *
       * <code>optional string driver = 1;</code>
       */
      public java.lang.String getDriver() {
        java.lang.Object ref = driver_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            driver_ = s;
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
       * driver is the name of the Flexvolume driver.
       * </pre>
       *
       * <code>optional string driver = 1;</code>
       */
      public com.google.protobuf.ByteString getDriverBytes() {
        java.lang.Object ref = driver_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          driver_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * driver is the name of the Flexvolume driver.
       * </pre>
       *
       * <code>optional string driver = 1;</code>
       */
      public Builder setDriver(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        driver_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * driver is the name of the Flexvolume driver.
       * </pre>
       *
       * <code>optional string driver = 1;</code>
       */
      public Builder clearDriver() {
        bitField0_ = (bitField0_ & ~0x00000001);
        driver_ = getDefaultInstance().getDriver();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * driver is the name of the Flexvolume driver.
       * </pre>
       *
       * <code>optional string driver = 1;</code>
       */
      public Builder setDriverBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        driver_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.AllowedFlexVolume)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.AllowedFlexVolume)
    private static final io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AllowedFlexVolume> PARSER =
        new com.google.protobuf.AbstractParser<AllowedFlexVolume>() {
          @java.lang.Override
          public AllowedFlexVolume parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AllowedFlexVolume(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AllowedFlexVolume> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AllowedFlexVolume> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface AllowedHostPathOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.AllowedHostPath)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * pathPrefix is the path prefix that the host volume must match.
     * It does not support `*`.
     * Trailing slashes are trimmed when validating the path prefix with a host path.
     * Examples:
     * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
     * `/foo` would not allow `/food` or `/etc/foo`
     * </pre>
     *
     * <code>optional string pathPrefix = 1;</code>
     */
    boolean hasPathPrefix();
    /**
     *
     *
     * <pre>
     * pathPrefix is the path prefix that the host volume must match.
     * It does not support `*`.
     * Trailing slashes are trimmed when validating the path prefix with a host path.
     * Examples:
     * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
     * `/foo` would not allow `/food` or `/etc/foo`
     * </pre>
     *
     * <code>optional string pathPrefix = 1;</code>
     */
    java.lang.String getPathPrefix();
    /**
     *
     *
     * <pre>
     * pathPrefix is the path prefix that the host volume must match.
     * It does not support `*`.
     * Trailing slashes are trimmed when validating the path prefix with a host path.
     * Examples:
     * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
     * `/foo` would not allow `/food` or `/etc/foo`
     * </pre>
     *
     * <code>optional string pathPrefix = 1;</code>
     */
    com.google.protobuf.ByteString getPathPrefixBytes();

    /**
     *
     *
     * <pre>
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * +optional
     * </pre>
     *
     * <code>optional bool readOnly = 2;</code>
     */
    boolean hasReadOnly();
    /**
     *
     *
     * <pre>
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * +optional
     * </pre>
     *
     * <code>optional bool readOnly = 2;</code>
     */
    boolean getReadOnly();
  }
  /**
   *
   *
   * <pre>
   * AllowedHostPath defines the host volume conditions that will be enabled by a policy
   * for pods to use. It requires the path prefix to be defined.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.AllowedHostPath}
   */
  public static final class AllowedHostPath extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.AllowedHostPath)
      AllowedHostPathOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AllowedHostPath.newBuilder() to construct.
    private AllowedHostPath(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AllowedHostPath() {
      pathPrefix_ = "";
      readOnly_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AllowedHostPath(
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
                pathPrefix_ = bs;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                readOnly_ = input.readBool();
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.class,
              io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder.class);
    }

    private int bitField0_;
    public static final int PATHPREFIX_FIELD_NUMBER = 1;
    private volatile java.lang.Object pathPrefix_;
    /**
     *
     *
     * <pre>
     * pathPrefix is the path prefix that the host volume must match.
     * It does not support `*`.
     * Trailing slashes are trimmed when validating the path prefix with a host path.
     * Examples:
     * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
     * `/foo` would not allow `/food` or `/etc/foo`
     * </pre>
     *
     * <code>optional string pathPrefix = 1;</code>
     */
    public boolean hasPathPrefix() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * pathPrefix is the path prefix that the host volume must match.
     * It does not support `*`.
     * Trailing slashes are trimmed when validating the path prefix with a host path.
     * Examples:
     * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
     * `/foo` would not allow `/food` or `/etc/foo`
     * </pre>
     *
     * <code>optional string pathPrefix = 1;</code>
     */
    public java.lang.String getPathPrefix() {
      java.lang.Object ref = pathPrefix_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          pathPrefix_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * pathPrefix is the path prefix that the host volume must match.
     * It does not support `*`.
     * Trailing slashes are trimmed when validating the path prefix with a host path.
     * Examples:
     * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
     * `/foo` would not allow `/food` or `/etc/foo`
     * </pre>
     *
     * <code>optional string pathPrefix = 1;</code>
     */
    public com.google.protobuf.ByteString getPathPrefixBytes() {
      java.lang.Object ref = pathPrefix_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pathPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int READONLY_FIELD_NUMBER = 2;
    private boolean readOnly_;
    /**
     *
     *
     * <pre>
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * +optional
     * </pre>
     *
     * <code>optional bool readOnly = 2;</code>
     */
    public boolean hasReadOnly() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * +optional
     * </pre>
     *
     * <code>optional bool readOnly = 2;</code>
     */
    public boolean getReadOnly() {
      return readOnly_;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pathPrefix_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, readOnly_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pathPrefix_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, readOnly_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath other =
          (io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath) obj;

      boolean result = true;
      result = result && (hasPathPrefix() == other.hasPathPrefix());
      if (hasPathPrefix()) {
        result = result && getPathPrefix().equals(other.getPathPrefix());
      }
      result = result && (hasReadOnly() == other.hasReadOnly());
      if (hasReadOnly()) {
        result = result && (getReadOnly() == other.getReadOnly());
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
      if (hasPathPrefix()) {
        hash = (37 * hash) + PATHPREFIX_FIELD_NUMBER;
        hash = (53 * hash) + getPathPrefix().hashCode();
      }
      if (hasReadOnly()) {
        hash = (37 * hash) + READONLY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReadOnly());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath prototype) {
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
     * AllowedHostPath defines the host volume conditions that will be enabled by a policy
     * for pods to use. It requires the path prefix to be defined.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.AllowedHostPath}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.AllowedHostPath)
        io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.class,
                io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        pathPrefix_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        readOnly_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath build() {
        io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath result =
            new io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.pathPrefix_ = pathPrefix_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.readOnly_ = readOnly_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath other) {
        if (other == io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.getDefaultInstance())
          return this;
        if (other.hasPathPrefix()) {
          bitField0_ |= 0x00000001;
          pathPrefix_ = other.pathPrefix_;
          onChanged();
        }
        if (other.hasReadOnly()) {
          setReadOnly(other.getReadOnly());
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
        io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object pathPrefix_ = "";
      /**
       *
       *
       * <pre>
       * pathPrefix is the path prefix that the host volume must match.
       * It does not support `*`.
       * Trailing slashes are trimmed when validating the path prefix with a host path.
       * Examples:
       * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
       * `/foo` would not allow `/food` or `/etc/foo`
       * </pre>
       *
       * <code>optional string pathPrefix = 1;</code>
       */
      public boolean hasPathPrefix() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * pathPrefix is the path prefix that the host volume must match.
       * It does not support `*`.
       * Trailing slashes are trimmed when validating the path prefix with a host path.
       * Examples:
       * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
       * `/foo` would not allow `/food` or `/etc/foo`
       * </pre>
       *
       * <code>optional string pathPrefix = 1;</code>
       */
      public java.lang.String getPathPrefix() {
        java.lang.Object ref = pathPrefix_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            pathPrefix_ = s;
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
       * pathPrefix is the path prefix that the host volume must match.
       * It does not support `*`.
       * Trailing slashes are trimmed when validating the path prefix with a host path.
       * Examples:
       * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
       * `/foo` would not allow `/food` or `/etc/foo`
       * </pre>
       *
       * <code>optional string pathPrefix = 1;</code>
       */
      public com.google.protobuf.ByteString getPathPrefixBytes() {
        java.lang.Object ref = pathPrefix_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          pathPrefix_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * pathPrefix is the path prefix that the host volume must match.
       * It does not support `*`.
       * Trailing slashes are trimmed when validating the path prefix with a host path.
       * Examples:
       * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
       * `/foo` would not allow `/food` or `/etc/foo`
       * </pre>
       *
       * <code>optional string pathPrefix = 1;</code>
       */
      public Builder setPathPrefix(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        pathPrefix_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * pathPrefix is the path prefix that the host volume must match.
       * It does not support `*`.
       * Trailing slashes are trimmed when validating the path prefix with a host path.
       * Examples:
       * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
       * `/foo` would not allow `/food` or `/etc/foo`
       * </pre>
       *
       * <code>optional string pathPrefix = 1;</code>
       */
      public Builder clearPathPrefix() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pathPrefix_ = getDefaultInstance().getPathPrefix();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * pathPrefix is the path prefix that the host volume must match.
       * It does not support `*`.
       * Trailing slashes are trimmed when validating the path prefix with a host path.
       * Examples:
       * `/foo` would allow `/foo`, `/foo/` and `/foo/bar`
       * `/foo` would not allow `/food` or `/etc/foo`
       * </pre>
       *
       * <code>optional string pathPrefix = 1;</code>
       */
      public Builder setPathPrefixBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        pathPrefix_ = value;
        onChanged();
        return this;
      }

      private boolean readOnly_;
      /**
       *
       *
       * <pre>
       * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
       * +optional
       * </pre>
       *
       * <code>optional bool readOnly = 2;</code>
       */
      public boolean hasReadOnly() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
       * +optional
       * </pre>
       *
       * <code>optional bool readOnly = 2;</code>
       */
      public boolean getReadOnly() {
        return readOnly_;
      }
      /**
       *
       *
       * <pre>
       * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
       * +optional
       * </pre>
       *
       * <code>optional bool readOnly = 2;</code>
       */
      public Builder setReadOnly(boolean value) {
        bitField0_ |= 0x00000002;
        readOnly_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
       * +optional
       * </pre>
       *
       * <code>optional bool readOnly = 2;</code>
       */
      public Builder clearReadOnly() {
        bitField0_ = (bitField0_ & ~0x00000002);
        readOnly_ = false;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.AllowedHostPath)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.AllowedHostPath)
    private static final io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AllowedHostPath> PARSER =
        new com.google.protobuf.AbstractParser<AllowedHostPath>() {
          @java.lang.Override
          public AllowedHostPath parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AllowedHostPath(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AllowedHostPath> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AllowedHostPath> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface EvictionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.Eviction)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * ObjectMeta describes the pod that is being evicted.
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
     * ObjectMeta describes the pod that is being evicted.
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
     * ObjectMeta describes the pod that is being evicted.
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
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
     * </code>
     */
    boolean hasDeleteOptions();
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.DeleteOptions getDeleteOptions();
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder getDeleteOptionsOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * Eviction evicts a pod from its node subject to certain policies and safety constraints.
   * This is a subresource of Pod.  A request to cause such an eviction is
   * created by POSTing to .../pods/&lt;pod name&gt;/evictions.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.Eviction}
   */
  public static final class Eviction extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.Eviction)
      EvictionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Eviction.newBuilder() to construct.
    private Eviction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Eviction() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Eviction(
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
                io.kubernetes.client.proto.Meta.DeleteOptions.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = deleteOptions_.toBuilder();
                }
                deleteOptions_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.DeleteOptions.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(deleteOptions_);
                  deleteOptions_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_Eviction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_Eviction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.Eviction.class,
              io.kubernetes.client.proto.V1beta1Policy.Eviction.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * ObjectMeta describes the pod that is being evicted.
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
     * ObjectMeta describes the pod that is being evicted.
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
     * ObjectMeta describes the pod that is being evicted.
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

    public static final int DELETEOPTIONS_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.DeleteOptions deleteOptions_;
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
     * </code>
     */
    public boolean hasDeleteOptions() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.DeleteOptions getDeleteOptions() {
      return deleteOptions_ == null
          ? io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()
          : deleteOptions_;
    }
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder getDeleteOptionsOrBuilder() {
      return deleteOptions_ == null
          ? io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()
          : deleteOptions_;
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
        output.writeMessage(2, getDeleteOptions());
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
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDeleteOptions());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.Eviction)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.Eviction other =
          (io.kubernetes.client.proto.V1beta1Policy.Eviction) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasDeleteOptions() == other.hasDeleteOptions());
      if (hasDeleteOptions()) {
        result = result && getDeleteOptions().equals(other.getDeleteOptions());
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
      if (hasDeleteOptions()) {
        hash = (37 * hash) + DELETEOPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getDeleteOptions().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.V1beta1Policy.Eviction prototype) {
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
     * Eviction evicts a pod from its node subject to certain policies and safety constraints.
     * This is a subresource of Pod.  A request to cause such an eviction is
     * created by POSTing to .../pods/&lt;pod name&gt;/evictions.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.Eviction}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.Eviction)
        io.kubernetes.client.proto.V1beta1Policy.EvictionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_Eviction_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_Eviction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.Eviction.class,
                io.kubernetes.client.proto.V1beta1Policy.Eviction.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Policy.Eviction.newBuilder()
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
          getDeleteOptionsFieldBuilder();
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
        if (deleteOptionsBuilder_ == null) {
          deleteOptions_ = null;
        } else {
          deleteOptionsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_Eviction_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.Eviction getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.Eviction.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.Eviction build() {
        io.kubernetes.client.proto.V1beta1Policy.Eviction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.Eviction buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.Eviction result =
            new io.kubernetes.client.proto.V1beta1Policy.Eviction(this);
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
        if (deleteOptionsBuilder_ == null) {
          result.deleteOptions_ = deleteOptions_;
        } else {
          result.deleteOptions_ = deleteOptionsBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.Eviction) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.Eviction) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Policy.Eviction other) {
        if (other == io.kubernetes.client.proto.V1beta1Policy.Eviction.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasDeleteOptions()) {
          mergeDeleteOptions(other.getDeleteOptions());
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
        io.kubernetes.client.proto.V1beta1Policy.Eviction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.Eviction) e.getUnfinishedMessage();
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
       * ObjectMeta describes the pod that is being evicted.
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
       * ObjectMeta describes the pod that is being evicted.
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
       * ObjectMeta describes the pod that is being evicted.
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
       * ObjectMeta describes the pod that is being evicted.
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
       * ObjectMeta describes the pod that is being evicted.
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
       * ObjectMeta describes the pod that is being evicted.
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
       * ObjectMeta describes the pod that is being evicted.
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
       * ObjectMeta describes the pod that is being evicted.
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
       * ObjectMeta describes the pod that is being evicted.
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

      private io.kubernetes.client.proto.Meta.DeleteOptions deleteOptions_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.DeleteOptions,
              io.kubernetes.client.proto.Meta.DeleteOptions.Builder,
              io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder>
          deleteOptionsBuilder_;
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public boolean hasDeleteOptions() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.DeleteOptions getDeleteOptions() {
        if (deleteOptionsBuilder_ == null) {
          return deleteOptions_ == null
              ? io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()
              : deleteOptions_;
        } else {
          return deleteOptionsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public Builder setDeleteOptions(io.kubernetes.client.proto.Meta.DeleteOptions value) {
        if (deleteOptionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          deleteOptions_ = value;
          onChanged();
        } else {
          deleteOptionsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public Builder setDeleteOptions(
          io.kubernetes.client.proto.Meta.DeleteOptions.Builder builderForValue) {
        if (deleteOptionsBuilder_ == null) {
          deleteOptions_ = builderForValue.build();
          onChanged();
        } else {
          deleteOptionsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public Builder mergeDeleteOptions(io.kubernetes.client.proto.Meta.DeleteOptions value) {
        if (deleteOptionsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && deleteOptions_ != null
              && deleteOptions_
                  != io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()) {
            deleteOptions_ =
                io.kubernetes.client.proto.Meta.DeleteOptions.newBuilder(deleteOptions_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            deleteOptions_ = value;
          }
          onChanged();
        } else {
          deleteOptionsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public Builder clearDeleteOptions() {
        if (deleteOptionsBuilder_ == null) {
          deleteOptions_ = null;
          onChanged();
        } else {
          deleteOptionsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.DeleteOptions.Builder getDeleteOptionsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getDeleteOptionsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder getDeleteOptionsOrBuilder() {
        if (deleteOptionsBuilder_ != null) {
          return deleteOptionsBuilder_.getMessageOrBuilder();
        } else {
          return deleteOptions_ == null
              ? io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()
              : deleteOptions_;
        }
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.DeleteOptions,
              io.kubernetes.client.proto.Meta.DeleteOptions.Builder,
              io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder>
          getDeleteOptionsFieldBuilder() {
        if (deleteOptionsBuilder_ == null) {
          deleteOptionsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.DeleteOptions,
                  io.kubernetes.client.proto.Meta.DeleteOptions.Builder,
                  io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder>(
                  getDeleteOptions(), getParentForChildren(), isClean());
          deleteOptions_ = null;
        }
        return deleteOptionsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.Eviction)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.Eviction)
    private static final io.kubernetes.client.proto.V1beta1Policy.Eviction DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.Eviction();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.Eviction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Eviction> PARSER =
        new com.google.protobuf.AbstractParser<Eviction>() {
          @java.lang.Override
          public Eviction parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Eviction(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Eviction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Eviction> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.Eviction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface FSGroupStrategyOptionsOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.FSGroupStrategyOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    boolean hasRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    java.lang.String getRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    com.google.protobuf.ByteString getRuleBytes();

    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index);
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    int getRangesCount();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
        getRangesOrBuilderList();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.FSGroupStrategyOptions}
   */
  public static final class FSGroupStrategyOptions extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.FSGroupStrategyOptions)
      FSGroupStrategyOptionsOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use FSGroupStrategyOptions.newBuilder() to construct.
    private FSGroupStrategyOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private FSGroupStrategyOptions() {
      rule_ = "";
      ranges_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private FSGroupStrategyOptions(
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
                rule_ = bs;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  ranges_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.IDRange>();
                  mutable_bitField0_ |= 0x00000002;
                }
                ranges_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.IDRange.PARSER,
                        extensionRegistry));
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
          ranges_ = java.util.Collections.unmodifiableList(ranges_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.class,
              io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.Builder.class);
    }

    private int bitField0_;
    public static final int RULE_FIELD_NUMBER = 1;
    private volatile java.lang.Object rule_;
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public java.lang.String getRule() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rule_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public com.google.protobuf.ByteString getRuleBytes() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RANGES_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> ranges_;
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList() {
      return ranges_;
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
        getRangesOrBuilderList() {
      return ranges_;
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public int getRangesCount() {
      return ranges_.size();
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index) {
      return ranges_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of fs groups.  If you would like to force a single
     * fs group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(int index) {
      return ranges_.get(index);
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rule_);
      }
      for (int i = 0; i < ranges_.size(); i++) {
        output.writeMessage(2, ranges_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rule_);
      }
      for (int i = 0; i < ranges_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, ranges_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions other =
          (io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions) obj;

      boolean result = true;
      result = result && (hasRule() == other.hasRule());
      if (hasRule()) {
        result = result && getRule().equals(other.getRule());
      }
      result = result && getRangesList().equals(other.getRangesList());
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
      if (hasRule()) {
        hash = (37 * hash) + RULE_FIELD_NUMBER;
        hash = (53 * hash) + getRule().hashCode();
      }
      if (getRangesCount() > 0) {
        hash = (37 * hash) + RANGES_FIELD_NUMBER;
        hash = (53 * hash) + getRangesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions prototype) {
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
     * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.FSGroupStrategyOptions}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.FSGroupStrategyOptions)
        io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.class,
                io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getRangesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        rule_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (rangesBuilder_ == null) {
          ranges_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          rangesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions build() {
        io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions result =
            new io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rule_ = rule_;
        if (rangesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            ranges_ = java.util.Collections.unmodifiableList(ranges_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.ranges_ = ranges_;
        } else {
          result.ranges_ = rangesBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.getDefaultInstance())
          return this;
        if (other.hasRule()) {
          bitField0_ |= 0x00000001;
          rule_ = other.rule_;
          onChanged();
        }
        if (rangesBuilder_ == null) {
          if (!other.ranges_.isEmpty()) {
            if (ranges_.isEmpty()) {
              ranges_ = other.ranges_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRangesIsMutable();
              ranges_.addAll(other.ranges_);
            }
            onChanged();
          }
        } else {
          if (!other.ranges_.isEmpty()) {
            if (rangesBuilder_.isEmpty()) {
              rangesBuilder_.dispose();
              rangesBuilder_ = null;
              ranges_ = other.ranges_;
              bitField0_ = (bitField0_ & ~0x00000002);
              rangesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getRangesFieldBuilder()
                      : null;
            } else {
              rangesBuilder_.addAllMessages(other.ranges_);
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
        io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object rule_ = "";
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public boolean hasRule() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public java.lang.String getRule() {
        java.lang.Object ref = rule_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            rule_ = s;
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
       * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public com.google.protobuf.ByteString getRuleBytes() {
        java.lang.Object ref = rule_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          rule_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRule(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder clearRule() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rule_ = getDefaultInstance().getRule();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRuleBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> ranges_ =
          java.util.Collections.emptyList();

      private void ensureRangesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          ranges_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.IDRange>(ranges_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.IDRange,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          rangesBuilder_;

      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList() {
        if (rangesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ranges_);
        } else {
          return rangesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public int getRangesCount() {
        if (rangesBuilder_ == null) {
          return ranges_.size();
        } else {
          return rangesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index) {
        if (rangesBuilder_ == null) {
          return ranges_.get(index);
        } else {
          return rangesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder setRanges(int index, io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.set(index, value);
          onChanged();
        } else {
          rangesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder setRanges(
          int index, io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.set(index, builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.add(value);
          onChanged();
        } else {
          rangesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(int index, io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.add(index, value);
          onChanged();
        } else {
          rangesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(
          io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.add(builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(
          int index, io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.add(index, builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addAllRanges(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.IDRange> values) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ranges_);
          onChanged();
        } else {
          rangesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder clearRanges() {
        if (rangesBuilder_ == null) {
          ranges_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          rangesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder removeRanges(int index) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.remove(index);
          onChanged();
        } else {
          rangesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder getRangesBuilder(int index) {
        return getRangesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(
          int index) {
        if (rangesBuilder_ == null) {
          return ranges_.get(index);
        } else {
          return rangesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          getRangesOrBuilderList() {
        if (rangesBuilder_ != null) {
          return rangesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ranges_);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder addRangesBuilder() {
        return getRangesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder addRangesBuilder(int index) {
        return getRangesFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of fs groups.  If you would like to force a single
       * fs group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder>
          getRangesBuilderList() {
        return getRangesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.IDRange,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          getRangesFieldBuilder() {
        if (rangesBuilder_ == null) {
          rangesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.IDRange,
                  io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>(
                  ranges_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          ranges_ = null;
        }
        return rangesBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.FSGroupStrategyOptions)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.FSGroupStrategyOptions)
    private static final io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<FSGroupStrategyOptions> PARSER =
        new com.google.protobuf.AbstractParser<FSGroupStrategyOptions>() {
          @java.lang.Override
          public FSGroupStrategyOptions parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new FSGroupStrategyOptions(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<FSGroupStrategyOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FSGroupStrategyOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HostPortRangeOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.HostPortRange)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * min is the start of the range, inclusive.
     * </pre>
     *
     * <code>optional int32 min = 1;</code>
     */
    boolean hasMin();
    /**
     *
     *
     * <pre>
     * min is the start of the range, inclusive.
     * </pre>
     *
     * <code>optional int32 min = 1;</code>
     */
    int getMin();

    /**
     *
     *
     * <pre>
     * max is the end of the range, inclusive.
     * </pre>
     *
     * <code>optional int32 max = 2;</code>
     */
    boolean hasMax();
    /**
     *
     *
     * <pre>
     * max is the end of the range, inclusive.
     * </pre>
     *
     * <code>optional int32 max = 2;</code>
     */
    int getMax();
  }
  /**
   *
   *
   * <pre>
   * HostPortRange defines a range of host ports that will be enabled by a policy
   * for pods to use.  It requires both the start and end to be defined.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.HostPortRange}
   */
  public static final class HostPortRange extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.HostPortRange)
      HostPortRangeOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HostPortRange.newBuilder() to construct.
    private HostPortRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HostPortRange() {
      min_ = 0;
      max_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HostPortRange(
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
                min_ = input.readInt32();
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                max_ = input.readInt32();
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_HostPortRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_HostPortRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.HostPortRange.class,
              io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder.class);
    }

    private int bitField0_;
    public static final int MIN_FIELD_NUMBER = 1;
    private int min_;
    /**
     *
     *
     * <pre>
     * min is the start of the range, inclusive.
     * </pre>
     *
     * <code>optional int32 min = 1;</code>
     */
    public boolean hasMin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * min is the start of the range, inclusive.
     * </pre>
     *
     * <code>optional int32 min = 1;</code>
     */
    public int getMin() {
      return min_;
    }

    public static final int MAX_FIELD_NUMBER = 2;
    private int max_;
    /**
     *
     *
     * <pre>
     * max is the end of the range, inclusive.
     * </pre>
     *
     * <code>optional int32 max = 2;</code>
     */
    public boolean hasMax() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * max is the end of the range, inclusive.
     * </pre>
     *
     * <code>optional int32 max = 2;</code>
     */
    public int getMax() {
      return max_;
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
        output.writeInt32(1, min_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, max_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, min_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, max_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.HostPortRange)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.HostPortRange other =
          (io.kubernetes.client.proto.V1beta1Policy.HostPortRange) obj;

      boolean result = true;
      result = result && (hasMin() == other.hasMin());
      if (hasMin()) {
        result = result && (getMin() == other.getMin());
      }
      result = result && (hasMax() == other.hasMax());
      if (hasMax()) {
        result = result && (getMax() == other.getMax());
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
      if (hasMin()) {
        hash = (37 * hash) + MIN_FIELD_NUMBER;
        hash = (53 * hash) + getMin();
      }
      if (hasMax()) {
        hash = (37 * hash) + MAX_FIELD_NUMBER;
        hash = (53 * hash) + getMax();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.HostPortRange prototype) {
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
     * HostPortRange defines a range of host ports that will be enabled by a policy
     * for pods to use.  It requires both the start and end to be defined.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.HostPortRange}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.HostPortRange)
        io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_HostPortRange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_HostPortRange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.HostPortRange.class,
                io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Policy.HostPortRange.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        min_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        max_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_HostPortRange_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.HostPortRange getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.HostPortRange.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.HostPortRange build() {
        io.kubernetes.client.proto.V1beta1Policy.HostPortRange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.HostPortRange buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.HostPortRange result =
            new io.kubernetes.client.proto.V1beta1Policy.HostPortRange(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.min_ = min_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.max_ = max_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.HostPortRange) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.HostPortRange) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Policy.HostPortRange other) {
        if (other == io.kubernetes.client.proto.V1beta1Policy.HostPortRange.getDefaultInstance())
          return this;
        if (other.hasMin()) {
          setMin(other.getMin());
        }
        if (other.hasMax()) {
          setMax(other.getMax());
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
        io.kubernetes.client.proto.V1beta1Policy.HostPortRange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.HostPortRange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private int min_;
      /**
       *
       *
       * <pre>
       * min is the start of the range, inclusive.
       * </pre>
       *
       * <code>optional int32 min = 1;</code>
       */
      public boolean hasMin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * min is the start of the range, inclusive.
       * </pre>
       *
       * <code>optional int32 min = 1;</code>
       */
      public int getMin() {
        return min_;
      }
      /**
       *
       *
       * <pre>
       * min is the start of the range, inclusive.
       * </pre>
       *
       * <code>optional int32 min = 1;</code>
       */
      public Builder setMin(int value) {
        bitField0_ |= 0x00000001;
        min_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * min is the start of the range, inclusive.
       * </pre>
       *
       * <code>optional int32 min = 1;</code>
       */
      public Builder clearMin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        min_ = 0;
        onChanged();
        return this;
      }

      private int max_;
      /**
       *
       *
       * <pre>
       * max is the end of the range, inclusive.
       * </pre>
       *
       * <code>optional int32 max = 2;</code>
       */
      public boolean hasMax() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * max is the end of the range, inclusive.
       * </pre>
       *
       * <code>optional int32 max = 2;</code>
       */
      public int getMax() {
        return max_;
      }
      /**
       *
       *
       * <pre>
       * max is the end of the range, inclusive.
       * </pre>
       *
       * <code>optional int32 max = 2;</code>
       */
      public Builder setMax(int value) {
        bitField0_ |= 0x00000002;
        max_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * max is the end of the range, inclusive.
       * </pre>
       *
       * <code>optional int32 max = 2;</code>
       */
      public Builder clearMax() {
        bitField0_ = (bitField0_ & ~0x00000002);
        max_ = 0;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.HostPortRange)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.HostPortRange)
    private static final io.kubernetes.client.proto.V1beta1Policy.HostPortRange DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.HostPortRange();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.HostPortRange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HostPortRange> PARSER =
        new com.google.protobuf.AbstractParser<HostPortRange>() {
          @java.lang.Override
          public HostPortRange parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HostPortRange(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HostPortRange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HostPortRange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.HostPortRange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface IDRangeOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.IDRange)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * min is the start of the range, inclusive.
     * </pre>
     *
     * <code>optional int64 min = 1;</code>
     */
    boolean hasMin();
    /**
     *
     *
     * <pre>
     * min is the start of the range, inclusive.
     * </pre>
     *
     * <code>optional int64 min = 1;</code>
     */
    long getMin();

    /**
     *
     *
     * <pre>
     * max is the end of the range, inclusive.
     * </pre>
     *
     * <code>optional int64 max = 2;</code>
     */
    boolean hasMax();
    /**
     *
     *
     * <pre>
     * max is the end of the range, inclusive.
     * </pre>
     *
     * <code>optional int64 max = 2;</code>
     */
    long getMax();
  }
  /**
   *
   *
   * <pre>
   * IDRange provides a min/max of an allowed range of IDs.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.IDRange}
   */
  public static final class IDRange extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.IDRange)
      IDRangeOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use IDRange.newBuilder() to construct.
    private IDRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private IDRange() {
      min_ = 0L;
      max_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private IDRange(
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
                min_ = input.readInt64();
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                max_ = input.readInt64();
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_IDRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_IDRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.IDRange.class,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder.class);
    }

    private int bitField0_;
    public static final int MIN_FIELD_NUMBER = 1;
    private long min_;
    /**
     *
     *
     * <pre>
     * min is the start of the range, inclusive.
     * </pre>
     *
     * <code>optional int64 min = 1;</code>
     */
    public boolean hasMin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * min is the start of the range, inclusive.
     * </pre>
     *
     * <code>optional int64 min = 1;</code>
     */
    public long getMin() {
      return min_;
    }

    public static final int MAX_FIELD_NUMBER = 2;
    private long max_;
    /**
     *
     *
     * <pre>
     * max is the end of the range, inclusive.
     * </pre>
     *
     * <code>optional int64 max = 2;</code>
     */
    public boolean hasMax() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * max is the end of the range, inclusive.
     * </pre>
     *
     * <code>optional int64 max = 2;</code>
     */
    public long getMax() {
      return max_;
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
        output.writeInt64(1, min_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, max_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, min_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, max_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.IDRange)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.IDRange other =
          (io.kubernetes.client.proto.V1beta1Policy.IDRange) obj;

      boolean result = true;
      result = result && (hasMin() == other.hasMin());
      if (hasMin()) {
        result = result && (getMin() == other.getMin());
      }
      result = result && (hasMax() == other.hasMax());
      if (hasMax()) {
        result = result && (getMax() == other.getMax());
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
      if (hasMin()) {
        hash = (37 * hash) + MIN_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMin());
      }
      if (hasMax()) {
        hash = (37 * hash) + MAX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMax());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.V1beta1Policy.IDRange prototype) {
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
     * IDRange provides a min/max of an allowed range of IDs.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.IDRange}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.IDRange)
        io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_IDRange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_IDRange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.IDRange.class,
                io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1beta1Policy.IDRange.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        min_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        max_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_IDRange_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.IDRange getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.IDRange build() {
        io.kubernetes.client.proto.V1beta1Policy.IDRange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.IDRange buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.IDRange result =
            new io.kubernetes.client.proto.V1beta1Policy.IDRange(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.min_ = min_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.max_ = max_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.IDRange) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.IDRange) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Policy.IDRange other) {
        if (other == io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance())
          return this;
        if (other.hasMin()) {
          setMin(other.getMin());
        }
        if (other.hasMax()) {
          setMax(other.getMax());
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
        io.kubernetes.client.proto.V1beta1Policy.IDRange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.IDRange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long min_;
      /**
       *
       *
       * <pre>
       * min is the start of the range, inclusive.
       * </pre>
       *
       * <code>optional int64 min = 1;</code>
       */
      public boolean hasMin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * min is the start of the range, inclusive.
       * </pre>
       *
       * <code>optional int64 min = 1;</code>
       */
      public long getMin() {
        return min_;
      }
      /**
       *
       *
       * <pre>
       * min is the start of the range, inclusive.
       * </pre>
       *
       * <code>optional int64 min = 1;</code>
       */
      public Builder setMin(long value) {
        bitField0_ |= 0x00000001;
        min_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * min is the start of the range, inclusive.
       * </pre>
       *
       * <code>optional int64 min = 1;</code>
       */
      public Builder clearMin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        min_ = 0L;
        onChanged();
        return this;
      }

      private long max_;
      /**
       *
       *
       * <pre>
       * max is the end of the range, inclusive.
       * </pre>
       *
       * <code>optional int64 max = 2;</code>
       */
      public boolean hasMax() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * max is the end of the range, inclusive.
       * </pre>
       *
       * <code>optional int64 max = 2;</code>
       */
      public long getMax() {
        return max_;
      }
      /**
       *
       *
       * <pre>
       * max is the end of the range, inclusive.
       * </pre>
       *
       * <code>optional int64 max = 2;</code>
       */
      public Builder setMax(long value) {
        bitField0_ |= 0x00000002;
        max_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * max is the end of the range, inclusive.
       * </pre>
       *
       * <code>optional int64 max = 2;</code>
       */
      public Builder clearMax() {
        bitField0_ = (bitField0_ & ~0x00000002);
        max_ = 0L;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.IDRange)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.IDRange)
    private static final io.kubernetes.client.proto.V1beta1Policy.IDRange DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.IDRange();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.IDRange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<IDRange> PARSER =
        new com.google.protobuf.AbstractParser<IDRange>() {
          @java.lang.Override
          public IDRange parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new IDRange(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<IDRange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IDRange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.IDRange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodDisruptionBudgetOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.PodDisruptionBudget)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
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
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus getStatus();
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.PodDisruptionBudget}
   */
  public static final class PodDisruptionBudget extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.PodDisruptionBudget)
      PodDisruptionBudgetOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodDisruptionBudget.newBuilder() to construct.
    private PodDisruptionBudget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodDisruptionBudget() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodDisruptionBudget(
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
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.PARSER,
                        extensionRegistry);
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.class,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
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
    private io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus status_;
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.getDefaultInstance()
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget other =
          (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget) obj;

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

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget prototype) {
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
     * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.PodDisruptionBudget}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.PodDisruptionBudget)
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.class,
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.newBuilder()
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
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget build() {
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget result =
            new io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget(this);
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.getDefaultInstance())
          return this;
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
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget)
                  e.getUnfinishedMessage();
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

      private io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec value) {
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
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.Builder
              builderForValue) {
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
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.newBuilder(spec_)
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
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
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
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec,
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus value) {
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
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.Builder
              builderForValue) {
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
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.newBuilder(
                        status_)
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
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
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
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus status = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus,
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatusOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.PodDisruptionBudget)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.PodDisruptionBudget)
    private static final io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodDisruptionBudget> PARSER =
        new com.google.protobuf.AbstractParser<PodDisruptionBudget>() {
          @java.lang.Override
          public PodDisruptionBudget parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodDisruptionBudget(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodDisruptionBudget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodDisruptionBudget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodDisruptionBudgetListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.PodDisruptionBudgetList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
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
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget> getItemsList();
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget getItems(int index);
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    int getItemsCount();
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder>
        getItemsOrBuilderList();
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder getItemsOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.PodDisruptionBudgetList}
   */
  public static final class PodDisruptionBudgetList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.PodDisruptionBudgetList)
      PodDisruptionBudgetListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodDisruptionBudgetList.newBuilder() to construct.
    private PodDisruptionBudgetList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodDisruptionBudgetList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodDisruptionBudgetList(
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
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.PARSER,
                        extensionRegistry));
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList.class,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
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
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget> items_;
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget>
        getItemsList() {
      return items_;
    }
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    public int getItemsCount() {
      return items_.size();
    }
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget getItems(int index) {
      return items_.get(index);
    }
    /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder getItemsOrBuilder(
        int index) {
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList other =
          (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList) obj;

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

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList prototype) {
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
     * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.PodDisruptionBudgetList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.PodDisruptionBudgetList)
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList.class,
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList.newBuilder()
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
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList build() {
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList result =
            new io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList(this);
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList
                .getDefaultInstance()) return this;
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
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList)
                  e.getUnfinishedMessage();
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

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget>(
                  items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder>
          itemsBuilder_;

      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget>
          getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget value) {
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
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public Builder addItems(io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget value) {
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
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget value) {
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
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
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
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
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
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder
          getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder
          addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.getDefaultInstance());
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.getDefaultInstance());
      }
      /** <code>repeated .k8s.io.api.policy.v1beta1.PodDisruptionBudget items = 2;</code> */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget,
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudget.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.PodDisruptionBudgetList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.PodDisruptionBudgetList)
    private static final io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodDisruptionBudgetList> PARSER =
        new com.google.protobuf.AbstractParser<PodDisruptionBudgetList>() {
          @java.lang.Override
          public PodDisruptionBudgetList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodDisruptionBudgetList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodDisruptionBudgetList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodDisruptionBudgetList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodDisruptionBudgetSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    boolean hasMinAvailable();
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    io.kubernetes.client.proto.IntStr.IntOrString getMinAvailable();
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMinAvailableOrBuilder();

    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
     * </code>
     */
    boolean hasMaxUnavailable();
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
     * </code>
     */
    io.kubernetes.client.proto.IntStr.IntOrString getMaxUnavailable();
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
     * </code>
     */
    io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMaxUnavailableOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec}
   */
  public static final class PodDisruptionBudgetSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec)
      PodDisruptionBudgetSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodDisruptionBudgetSpec.newBuilder() to construct.
    private PodDisruptionBudgetSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodDisruptionBudgetSpec() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodDisruptionBudgetSpec(
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
                io.kubernetes.client.proto.IntStr.IntOrString.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = minAvailable_.toBuilder();
                }
                minAvailable_ =
                    input.readMessage(
                        io.kubernetes.client.proto.IntStr.IntOrString.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(minAvailable_);
                  minAvailable_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.IntStr.IntOrString.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = maxUnavailable_.toBuilder();
                }
                maxUnavailable_ =
                    input.readMessage(
                        io.kubernetes.client.proto.IntStr.IntOrString.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(maxUnavailable_);
                  maxUnavailable_ = subBuilder.buildPartial();
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.class,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.Builder.class);
    }

    private int bitField0_;
    public static final int MINAVAILABLE_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.IntStr.IntOrString minAvailable_;
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    public boolean hasMinAvailable() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrString getMinAvailable() {
      return minAvailable_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : minAvailable_;
    }
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMinAvailableOrBuilder() {
      return minAvailable_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : minAvailable_;
    }

    public static final int SELECTOR_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
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
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }

    public static final int MAXUNAVAILABLE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.IntStr.IntOrString maxUnavailable_;
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
     * </code>
     */
    public boolean hasMaxUnavailable() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
     * </code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrString getMaxUnavailable() {
      return maxUnavailable_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : maxUnavailable_;
    }
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
     * </code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMaxUnavailableOrBuilder() {
      return maxUnavailable_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : maxUnavailable_;
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
        output.writeMessage(1, getMinAvailable());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getMaxUnavailable());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMinAvailable());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getMaxUnavailable());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec other =
          (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec) obj;

      boolean result = true;
      result = result && (hasMinAvailable() == other.hasMinAvailable());
      if (hasMinAvailable()) {
        result = result && getMinAvailable().equals(other.getMinAvailable());
      }
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && (hasMaxUnavailable() == other.hasMaxUnavailable());
      if (hasMaxUnavailable()) {
        result = result && getMaxUnavailable().equals(other.getMaxUnavailable());
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
      if (hasMinAvailable()) {
        hash = (37 * hash) + MINAVAILABLE_FIELD_NUMBER;
        hash = (53 * hash) + getMinAvailable().hashCode();
      }
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      if (hasMaxUnavailable()) {
        hash = (37 * hash) + MAXUNAVAILABLE_FIELD_NUMBER;
        hash = (53 * hash) + getMaxUnavailable().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec prototype) {
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
     * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec)
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.class,
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMinAvailableFieldBuilder();
          getSelectorFieldBuilder();
          getMaxUnavailableFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (minAvailableBuilder_ == null) {
          minAvailable_ = null;
        } else {
          minAvailableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (maxUnavailableBuilder_ == null) {
          maxUnavailable_ = null;
        } else {
          maxUnavailableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec build() {
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec result =
            new io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (minAvailableBuilder_ == null) {
          result.minAvailable_ = minAvailable_;
        } else {
          result.minAvailable_ = minAvailableBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (maxUnavailableBuilder_ == null) {
          result.maxUnavailable_ = maxUnavailable_;
        } else {
          result.maxUnavailable_ = maxUnavailableBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
                .getDefaultInstance()) return this;
        if (other.hasMinAvailable()) {
          mergeMinAvailable(other.getMinAvailable());
        }
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
        }
        if (other.hasMaxUnavailable()) {
          mergeMaxUnavailable(other.getMaxUnavailable());
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
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.IntStr.IntOrString minAvailable_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          minAvailableBuilder_;
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      public boolean hasMinAvailable() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString getMinAvailable() {
        if (minAvailableBuilder_ == null) {
          return minAvailable_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : minAvailable_;
        } else {
          return minAvailableBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      public Builder setMinAvailable(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (minAvailableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          minAvailable_ = value;
          onChanged();
        } else {
          minAvailableBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      public Builder setMinAvailable(
          io.kubernetes.client.proto.IntStr.IntOrString.Builder builderForValue) {
        if (minAvailableBuilder_ == null) {
          minAvailable_ = builderForValue.build();
          onChanged();
        } else {
          minAvailableBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      public Builder mergeMinAvailable(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (minAvailableBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && minAvailable_ != null
              && minAvailable_
                  != io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()) {
            minAvailable_ =
                io.kubernetes.client.proto.IntStr.IntOrString.newBuilder(minAvailable_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            minAvailable_ = value;
          }
          onChanged();
        } else {
          minAvailableBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      public Builder clearMinAvailable() {
        if (minAvailableBuilder_ == null) {
          minAvailable_ = null;
          onChanged();
        } else {
          minAvailableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString.Builder getMinAvailableBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMinAvailableFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMinAvailableOrBuilder() {
        if (minAvailableBuilder_ != null) {
          return minAvailableBuilder_.getMessageOrBuilder();
        } else {
          return minAvailable_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : minAvailable_;
        }
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          getMinAvailableFieldBuilder() {
        if (minAvailableBuilder_ == null) {
          minAvailableBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.IntStr.IntOrString,
                  io.kubernetes.client.proto.IntStr.IntOrString.Builder,
                  io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>(
                  getMinAvailable(), getParentForChildren(), isClean());
          minAvailable_ = null;
        }
        return minAvailableBuilder_;
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
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
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
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
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
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
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
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
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
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
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
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
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

      private io.kubernetes.client.proto.IntStr.IntOrString maxUnavailable_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          maxUnavailableBuilder_;
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      public boolean hasMaxUnavailable() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString getMaxUnavailable() {
        if (maxUnavailableBuilder_ == null) {
          return maxUnavailable_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : maxUnavailable_;
        } else {
          return maxUnavailableBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      public Builder setMaxUnavailable(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (maxUnavailableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          maxUnavailable_ = value;
          onChanged();
        } else {
          maxUnavailableBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      public Builder setMaxUnavailable(
          io.kubernetes.client.proto.IntStr.IntOrString.Builder builderForValue) {
        if (maxUnavailableBuilder_ == null) {
          maxUnavailable_ = builderForValue.build();
          onChanged();
        } else {
          maxUnavailableBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      public Builder mergeMaxUnavailable(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (maxUnavailableBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && maxUnavailable_ != null
              && maxUnavailable_
                  != io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()) {
            maxUnavailable_ =
                io.kubernetes.client.proto.IntStr.IntOrString.newBuilder(maxUnavailable_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            maxUnavailable_ = value;
          }
          onChanged();
        } else {
          maxUnavailableBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      public Builder clearMaxUnavailable() {
        if (maxUnavailableBuilder_ == null) {
          maxUnavailable_ = null;
          onChanged();
        } else {
          maxUnavailableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString.Builder getMaxUnavailableBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getMaxUnavailableFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMaxUnavailableOrBuilder() {
        if (maxUnavailableBuilder_ != null) {
          return maxUnavailableBuilder_.getMessageOrBuilder();
        } else {
          return maxUnavailable_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : maxUnavailable_;
        }
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          getMaxUnavailableFieldBuilder() {
        if (maxUnavailableBuilder_ == null) {
          maxUnavailableBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.IntStr.IntOrString,
                  io.kubernetes.client.proto.IntStr.IntOrString.Builder,
                  io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>(
                  getMaxUnavailable(), getParentForChildren(), isClean());
          maxUnavailable_ = null;
        }
        return maxUnavailableBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.PodDisruptionBudgetSpec)
    private static final io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodDisruptionBudgetSpec> PARSER =
        new com.google.protobuf.AbstractParser<PodDisruptionBudgetSpec>() {
          @java.lang.Override
          public PodDisruptionBudgetSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodDisruptionBudgetSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodDisruptionBudgetSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodDisruptionBudgetSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodDisruptionBudgetStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other
     * status informatio is valid only if observedGeneration equals to PDB's object generation.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    boolean hasObservedGeneration();
    /**
     *
     *
     * <pre>
     * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other
     * status informatio is valid only if observedGeneration equals to PDB's object generation.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    long getObservedGeneration();

    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    int getDisruptedPodsCount();
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    boolean containsDisruptedPods(java.lang.String key);
    /** Use {@link #getDisruptedPodsMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> getDisruptedPods();
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> getDisruptedPodsMap();
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrDefault(
        java.lang.String key, io.kubernetes.client.proto.Meta.Time defaultValue);
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrThrow(java.lang.String key);

    /**
     *
     *
     * <pre>
     * Number of pod disruptions that are currently allowed.
     * </pre>
     *
     * <code>optional int32 disruptionsAllowed = 3;</code>
     */
    boolean hasDisruptionsAllowed();
    /**
     *
     *
     * <pre>
     * Number of pod disruptions that are currently allowed.
     * </pre>
     *
     * <code>optional int32 disruptionsAllowed = 3;</code>
     */
    int getDisruptionsAllowed();

    /**
     *
     *
     * <pre>
     * current number of healthy pods
     * </pre>
     *
     * <code>optional int32 currentHealthy = 4;</code>
     */
    boolean hasCurrentHealthy();
    /**
     *
     *
     * <pre>
     * current number of healthy pods
     * </pre>
     *
     * <code>optional int32 currentHealthy = 4;</code>
     */
    int getCurrentHealthy();

    /**
     *
     *
     * <pre>
     * minimum desired number of healthy pods
     * </pre>
     *
     * <code>optional int32 desiredHealthy = 5;</code>
     */
    boolean hasDesiredHealthy();
    /**
     *
     *
     * <pre>
     * minimum desired number of healthy pods
     * </pre>
     *
     * <code>optional int32 desiredHealthy = 5;</code>
     */
    int getDesiredHealthy();

    /**
     *
     *
     * <pre>
     * total number of pods counted by this disruption budget
     * </pre>
     *
     * <code>optional int32 expectedPods = 6;</code>
     */
    boolean hasExpectedPods();
    /**
     *
     *
     * <pre>
     * total number of pods counted by this disruption budget
     * </pre>
     *
     * <code>optional int32 expectedPods = 6;</code>
     */
    int getExpectedPods();
  }
  /**
   *
   *
   * <pre>
   * PodDisruptionBudgetStatus represents information about the status of a
   * PodDisruptionBudget. Status may trail the actual state of a system.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus}
   */
  public static final class PodDisruptionBudgetStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus)
      PodDisruptionBudgetStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodDisruptionBudgetStatus.newBuilder() to construct.
    private PodDisruptionBudgetStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodDisruptionBudgetStatus() {
      observedGeneration_ = 0L;
      disruptionsAllowed_ = 0;
      currentHealthy_ = 0;
      desiredHealthy_ = 0;
      expectedPods_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodDisruptionBudgetStatus(
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
                observedGeneration_ = input.readInt64();
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  disruptedPods_ =
                      com.google.protobuf.MapField.newMapField(
                          DisruptedPodsDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000002;
                }
                com.google.protobuf.MapEntry<java.lang.String, io.kubernetes.client.proto.Meta.Time>
                    disruptedPods__ =
                        input.readMessage(
                            DisruptedPodsDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                disruptedPods_
                    .getMutableMap()
                    .put(disruptedPods__.getKey(), disruptedPods__.getValue());
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000002;
                disruptionsAllowed_ = input.readInt32();
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000004;
                currentHealthy_ = input.readInt32();
                break;
              }
            case 40:
              {
                bitField0_ |= 0x00000008;
                desiredHealthy_ = input.readInt32();
                break;
              }
            case 48:
              {
                bitField0_ |= 0x00000010;
                expectedPods_ = input.readInt32();
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetDisruptedPods();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.class,
              io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.Builder.class);
    }

    private int bitField0_;
    public static final int OBSERVEDGENERATION_FIELD_NUMBER = 1;
    private long observedGeneration_;
    /**
     *
     *
     * <pre>
     * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other
     * status informatio is valid only if observedGeneration equals to PDB's object generation.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    public boolean hasObservedGeneration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other
     * status informatio is valid only if observedGeneration equals to PDB's object generation.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    public long getObservedGeneration() {
      return observedGeneration_;
    }

    public static final int DISRUPTEDPODS_FIELD_NUMBER = 2;

    private static final class DisruptedPodsDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
              java.lang.String, io.kubernetes.client.proto.Meta.Time>
          defaultEntry =
              com.google.protobuf.MapEntry
                  .<java.lang.String, io.kubernetes.client.proto.Meta.Time>newDefaultInstance(
                      io.kubernetes.client.proto.V1beta1Policy
                          .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_DisruptedPodsEntry_descriptor,
                      com.google.protobuf.WireFormat.FieldType.STRING,
                      "",
                      com.google.protobuf.WireFormat.FieldType.MESSAGE,
                      io.kubernetes.client.proto.Meta.Time.getDefaultInstance());
    }

    private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
        disruptedPods_;

    private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
        internalGetDisruptedPods() {
      if (disruptedPods_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DisruptedPodsDefaultEntryHolder.defaultEntry);
      }
      return disruptedPods_;
    }

    public int getDisruptedPodsCount() {
      return internalGetDisruptedPods().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    public boolean containsDisruptedPods(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetDisruptedPods().getMap().containsKey(key);
    }
    /** Use {@link #getDisruptedPodsMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
        getDisruptedPods() {
      return getDisruptedPodsMap();
    }
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
        getDisruptedPodsMap() {
      return internalGetDisruptedPods().getMap();
    }
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrDefault(
        java.lang.String key, io.kubernetes.client.proto.Meta.Time defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> map =
          internalGetDisruptedPods().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> map =
          internalGetDisruptedPods().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int DISRUPTIONSALLOWED_FIELD_NUMBER = 3;
    private int disruptionsAllowed_;
    /**
     *
     *
     * <pre>
     * Number of pod disruptions that are currently allowed.
     * </pre>
     *
     * <code>optional int32 disruptionsAllowed = 3;</code>
     */
    public boolean hasDisruptionsAllowed() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Number of pod disruptions that are currently allowed.
     * </pre>
     *
     * <code>optional int32 disruptionsAllowed = 3;</code>
     */
    public int getDisruptionsAllowed() {
      return disruptionsAllowed_;
    }

    public static final int CURRENTHEALTHY_FIELD_NUMBER = 4;
    private int currentHealthy_;
    /**
     *
     *
     * <pre>
     * current number of healthy pods
     * </pre>
     *
     * <code>optional int32 currentHealthy = 4;</code>
     */
    public boolean hasCurrentHealthy() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * current number of healthy pods
     * </pre>
     *
     * <code>optional int32 currentHealthy = 4;</code>
     */
    public int getCurrentHealthy() {
      return currentHealthy_;
    }

    public static final int DESIREDHEALTHY_FIELD_NUMBER = 5;
    private int desiredHealthy_;
    /**
     *
     *
     * <pre>
     * minimum desired number of healthy pods
     * </pre>
     *
     * <code>optional int32 desiredHealthy = 5;</code>
     */
    public boolean hasDesiredHealthy() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * minimum desired number of healthy pods
     * </pre>
     *
     * <code>optional int32 desiredHealthy = 5;</code>
     */
    public int getDesiredHealthy() {
      return desiredHealthy_;
    }

    public static final int EXPECTEDPODS_FIELD_NUMBER = 6;
    private int expectedPods_;
    /**
     *
     *
     * <pre>
     * total number of pods counted by this disruption budget
     * </pre>
     *
     * <code>optional int32 expectedPods = 6;</code>
     */
    public boolean hasExpectedPods() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * total number of pods counted by this disruption budget
     * </pre>
     *
     * <code>optional int32 expectedPods = 6;</code>
     */
    public int getExpectedPods() {
      return expectedPods_;
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
        output.writeInt64(1, observedGeneration_);
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output, internalGetDisruptedPods(), DisruptedPodsDefaultEntryHolder.defaultEntry, 2);
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(3, disruptionsAllowed_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(4, currentHealthy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(5, desiredHealthy_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(6, expectedPods_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, observedGeneration_);
      }
      for (java.util.Map.Entry<java.lang.String, io.kubernetes.client.proto.Meta.Time> entry :
          internalGetDisruptedPods().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, io.kubernetes.client.proto.Meta.Time>
            disruptedPods__ =
                DisruptedPodsDefaultEntryHolder.defaultEntry
                    .newBuilderForType()
                    .setKey(entry.getKey())
                    .setValue(entry.getValue())
                    .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, disruptedPods__);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, disruptionsAllowed_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, currentHealthy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(5, desiredHealthy_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(6, expectedPods_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus other =
          (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus) obj;

      boolean result = true;
      result = result && (hasObservedGeneration() == other.hasObservedGeneration());
      if (hasObservedGeneration()) {
        result = result && (getObservedGeneration() == other.getObservedGeneration());
      }
      result = result && internalGetDisruptedPods().equals(other.internalGetDisruptedPods());
      result = result && (hasDisruptionsAllowed() == other.hasDisruptionsAllowed());
      if (hasDisruptionsAllowed()) {
        result = result && (getDisruptionsAllowed() == other.getDisruptionsAllowed());
      }
      result = result && (hasCurrentHealthy() == other.hasCurrentHealthy());
      if (hasCurrentHealthy()) {
        result = result && (getCurrentHealthy() == other.getCurrentHealthy());
      }
      result = result && (hasDesiredHealthy() == other.hasDesiredHealthy());
      if (hasDesiredHealthy()) {
        result = result && (getDesiredHealthy() == other.getDesiredHealthy());
      }
      result = result && (hasExpectedPods() == other.hasExpectedPods());
      if (hasExpectedPods()) {
        result = result && (getExpectedPods() == other.getExpectedPods());
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
      if (hasObservedGeneration()) {
        hash = (37 * hash) + OBSERVEDGENERATION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getObservedGeneration());
      }
      if (!internalGetDisruptedPods().getMap().isEmpty()) {
        hash = (37 * hash) + DISRUPTEDPODS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetDisruptedPods().hashCode();
      }
      if (hasDisruptionsAllowed()) {
        hash = (37 * hash) + DISRUPTIONSALLOWED_FIELD_NUMBER;
        hash = (53 * hash) + getDisruptionsAllowed();
      }
      if (hasCurrentHealthy()) {
        hash = (37 * hash) + CURRENTHEALTHY_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentHealthy();
      }
      if (hasDesiredHealthy()) {
        hash = (37 * hash) + DESIREDHEALTHY_FIELD_NUMBER;
        hash = (53 * hash) + getDesiredHealthy();
      }
      if (hasExpectedPods()) {
        hash = (37 * hash) + EXPECTEDPODS_FIELD_NUMBER;
        hash = (53 * hash) + getExpectedPods();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus prototype) {
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
     * PodDisruptionBudgetStatus represents information about the status of a
     * PodDisruptionBudget. Status may trail the actual state of a system.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus)
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 2:
            return internalGetDisruptedPods();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 2:
            return internalGetMutableDisruptedPods();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.class,
                io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        observedGeneration_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableDisruptedPods().clear();
        disruptionsAllowed_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        currentHealthy_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        desiredHealthy_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        expectedPods_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus build() {
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus result =
            new io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.observedGeneration_ = observedGeneration_;
        result.disruptedPods_ = internalGetDisruptedPods();
        result.disruptedPods_.makeImmutable();
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.disruptionsAllowed_ = disruptionsAllowed_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.currentHealthy_ = currentHealthy_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.desiredHealthy_ = desiredHealthy_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        result.expectedPods_ = expectedPods_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
                .getDefaultInstance()) return this;
        if (other.hasObservedGeneration()) {
          setObservedGeneration(other.getObservedGeneration());
        }
        internalGetMutableDisruptedPods().mergeFrom(other.internalGetDisruptedPods());
        if (other.hasDisruptionsAllowed()) {
          setDisruptionsAllowed(other.getDisruptionsAllowed());
        }
        if (other.hasCurrentHealthy()) {
          setCurrentHealthy(other.getCurrentHealthy());
        }
        if (other.hasDesiredHealthy()) {
          setDesiredHealthy(other.getDesiredHealthy());
        }
        if (other.hasExpectedPods()) {
          setExpectedPods(other.getExpectedPods());
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
        io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long observedGeneration_;
      /**
       *
       *
       * <pre>
       * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other
       * status informatio is valid only if observedGeneration equals to PDB's object generation.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public boolean hasObservedGeneration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other
       * status informatio is valid only if observedGeneration equals to PDB's object generation.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public long getObservedGeneration() {
        return observedGeneration_;
      }
      /**
       *
       *
       * <pre>
       * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other
       * status informatio is valid only if observedGeneration equals to PDB's object generation.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public Builder setObservedGeneration(long value) {
        bitField0_ |= 0x00000001;
        observedGeneration_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other
       * status informatio is valid only if observedGeneration equals to PDB's object generation.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public Builder clearObservedGeneration() {
        bitField0_ = (bitField0_ & ~0x00000001);
        observedGeneration_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          disruptedPods_;

      private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          internalGetDisruptedPods() {
        if (disruptedPods_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              DisruptedPodsDefaultEntryHolder.defaultEntry);
        }
        return disruptedPods_;
      }

      private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          internalGetMutableDisruptedPods() {
        onChanged();
        ;
        if (disruptedPods_ == null) {
          disruptedPods_ =
              com.google.protobuf.MapField.newMapField(
                  DisruptedPodsDefaultEntryHolder.defaultEntry);
        }
        if (!disruptedPods_.isMutable()) {
          disruptedPods_ = disruptedPods_.copy();
        }
        return disruptedPods_;
      }

      public int getDisruptedPodsCount() {
        return internalGetDisruptedPods().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>
       * map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public boolean containsDisruptedPods(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetDisruptedPods().getMap().containsKey(key);
      }
      /** Use {@link #getDisruptedPodsMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          getDisruptedPods() {
        return getDisruptedPodsMap();
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>
       * map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          getDisruptedPodsMap() {
        return internalGetDisruptedPods().getMap();
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>
       * map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrDefault(
          java.lang.String key, io.kubernetes.client.proto.Meta.Time defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> map =
            internalGetDisruptedPods().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>
       * map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrThrow(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> map =
            internalGetDisruptedPods().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearDisruptedPods() {
        internalGetMutableDisruptedPods().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>
       * map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public Builder removeDisruptedPods(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableDisruptedPods().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          getMutableDisruptedPods() {
        return internalGetMutableDisruptedPods().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>
       * map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public Builder putDisruptedPods(
          java.lang.String key, io.kubernetes.client.proto.Meta.Time value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableDisruptedPods().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>
       * map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public Builder putAllDisruptedPods(
          java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> values) {
        internalGetMutableDisruptedPods().getMutableMap().putAll(values);
        return this;
      }

      private int disruptionsAllowed_;
      /**
       *
       *
       * <pre>
       * Number of pod disruptions that are currently allowed.
       * </pre>
       *
       * <code>optional int32 disruptionsAllowed = 3;</code>
       */
      public boolean hasDisruptionsAllowed() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Number of pod disruptions that are currently allowed.
       * </pre>
       *
       * <code>optional int32 disruptionsAllowed = 3;</code>
       */
      public int getDisruptionsAllowed() {
        return disruptionsAllowed_;
      }
      /**
       *
       *
       * <pre>
       * Number of pod disruptions that are currently allowed.
       * </pre>
       *
       * <code>optional int32 disruptionsAllowed = 3;</code>
       */
      public Builder setDisruptionsAllowed(int value) {
        bitField0_ |= 0x00000004;
        disruptionsAllowed_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Number of pod disruptions that are currently allowed.
       * </pre>
       *
       * <code>optional int32 disruptionsAllowed = 3;</code>
       */
      public Builder clearDisruptionsAllowed() {
        bitField0_ = (bitField0_ & ~0x00000004);
        disruptionsAllowed_ = 0;
        onChanged();
        return this;
      }

      private int currentHealthy_;
      /**
       *
       *
       * <pre>
       * current number of healthy pods
       * </pre>
       *
       * <code>optional int32 currentHealthy = 4;</code>
       */
      public boolean hasCurrentHealthy() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * current number of healthy pods
       * </pre>
       *
       * <code>optional int32 currentHealthy = 4;</code>
       */
      public int getCurrentHealthy() {
        return currentHealthy_;
      }
      /**
       *
       *
       * <pre>
       * current number of healthy pods
       * </pre>
       *
       * <code>optional int32 currentHealthy = 4;</code>
       */
      public Builder setCurrentHealthy(int value) {
        bitField0_ |= 0x00000008;
        currentHealthy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * current number of healthy pods
       * </pre>
       *
       * <code>optional int32 currentHealthy = 4;</code>
       */
      public Builder clearCurrentHealthy() {
        bitField0_ = (bitField0_ & ~0x00000008);
        currentHealthy_ = 0;
        onChanged();
        return this;
      }

      private int desiredHealthy_;
      /**
       *
       *
       * <pre>
       * minimum desired number of healthy pods
       * </pre>
       *
       * <code>optional int32 desiredHealthy = 5;</code>
       */
      public boolean hasDesiredHealthy() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * minimum desired number of healthy pods
       * </pre>
       *
       * <code>optional int32 desiredHealthy = 5;</code>
       */
      public int getDesiredHealthy() {
        return desiredHealthy_;
      }
      /**
       *
       *
       * <pre>
       * minimum desired number of healthy pods
       * </pre>
       *
       * <code>optional int32 desiredHealthy = 5;</code>
       */
      public Builder setDesiredHealthy(int value) {
        bitField0_ |= 0x00000010;
        desiredHealthy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * minimum desired number of healthy pods
       * </pre>
       *
       * <code>optional int32 desiredHealthy = 5;</code>
       */
      public Builder clearDesiredHealthy() {
        bitField0_ = (bitField0_ & ~0x00000010);
        desiredHealthy_ = 0;
        onChanged();
        return this;
      }

      private int expectedPods_;
      /**
       *
       *
       * <pre>
       * total number of pods counted by this disruption budget
       * </pre>
       *
       * <code>optional int32 expectedPods = 6;</code>
       */
      public boolean hasExpectedPods() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * total number of pods counted by this disruption budget
       * </pre>
       *
       * <code>optional int32 expectedPods = 6;</code>
       */
      public int getExpectedPods() {
        return expectedPods_;
      }
      /**
       *
       *
       * <pre>
       * total number of pods counted by this disruption budget
       * </pre>
       *
       * <code>optional int32 expectedPods = 6;</code>
       */
      public Builder setExpectedPods(int value) {
        bitField0_ |= 0x00000020;
        expectedPods_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * total number of pods counted by this disruption budget
       * </pre>
       *
       * <code>optional int32 expectedPods = 6;</code>
       */
      public Builder clearExpectedPods() {
        bitField0_ = (bitField0_ & ~0x00000020);
        expectedPods_ = 0;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.PodDisruptionBudgetStatus)
    private static final io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodDisruptionBudgetStatus> PARSER =
        new com.google.protobuf.AbstractParser<PodDisruptionBudgetStatus>() {
          @java.lang.Override
          public PodDisruptionBudgetStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodDisruptionBudgetStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodDisruptionBudgetStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodDisruptionBudgetStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.PodDisruptionBudgetStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodSecurityPolicyOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.PodSecurityPolicy)
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
     * spec defines the policy enforced.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * spec defines the policy enforced.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec getSpec();
    /**
     *
     *
     * <pre>
     * spec defines the policy enforced.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpecOrBuilder getSpecOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodSecurityPolicy governs the ability to make requests that affect the Security Context
   * that will be applied to a pod and container.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.PodSecurityPolicy}
   */
  public static final class PodSecurityPolicy extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.PodSecurityPolicy)
      PodSecurityPolicyOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodSecurityPolicy.newBuilder() to construct.
    private PodSecurityPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodSecurityPolicy() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodSecurityPolicy(
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
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.class,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder.class);
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
    private io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec spec_;
    /**
     *
     *
     * <pre>
     * spec defines the policy enforced.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * spec defines the policy enforced.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * spec defines the policy enforced.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.getDefaultInstance()
          : spec_;
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
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy other =
          (io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy prototype) {
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
     * PodSecurityPolicy governs the ability to make requests that affect the Security Context
     * that will be applied to a pod and container.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.PodSecurityPolicy}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.PodSecurityPolicy)
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.class,
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy build() {
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy result =
            new io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy(this);
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
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
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy) e.getUnfinishedMessage();
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

      private io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec value) {
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
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.Builder builderForValue) {
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
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.newBuilder(spec_)
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
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
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
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * spec defines the policy enforced.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.PodSecurityPolicySpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec,
                  io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.PodSecurityPolicy)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.PodSecurityPolicy)
    private static final io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodSecurityPolicy> PARSER =
        new com.google.protobuf.AbstractParser<PodSecurityPolicy>() {
          @java.lang.Override
          public PodSecurityPolicy parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodSecurityPolicy(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodSecurityPolicy> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodSecurityPolicy> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodSecurityPolicyListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.PodSecurityPolicyList)
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
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy> getItemsList();
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy getItems(int index);
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder getItemsOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * PodSecurityPolicyList is a list of PodSecurityPolicy objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.PodSecurityPolicyList}
   */
  public static final class PodSecurityPolicyList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.PodSecurityPolicyList)
      PodSecurityPolicyListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodSecurityPolicyList.newBuilder() to construct.
    private PodSecurityPolicyList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodSecurityPolicyList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodSecurityPolicyList(
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
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.PARSER,
                        extensionRegistry));
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList.class,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList.Builder.class);
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
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy> items_;
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy>
        getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder getItemsOrBuilder(
        int index) {
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList other =
          (io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList) obj;

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

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList prototype) {
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
     * PodSecurityPolicyList is a list of PodSecurityPolicy objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.PodSecurityPolicyList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.PodSecurityPolicyList)
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList.class,
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList.newBuilder()
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
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList build() {
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList result =
            new io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList(this);
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList.getDefaultInstance())
          return this;
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
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList)
                  e.getUnfinishedMessage();
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

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy>(
                  items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy>
          getItemsList() {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy getItems(int index) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy value) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder builderForValue) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy value) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy value) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder builderForValue) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder builderForValue) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy>
              values) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder getItemsOrBuilder(
          int index) {
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder>
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
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.PodSecurityPolicy items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy,
                  io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicy.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.PodSecurityPolicyList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.PodSecurityPolicyList)
    private static final io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodSecurityPolicyList> PARSER =
        new com.google.protobuf.AbstractParser<PodSecurityPolicyList>() {
          @java.lang.Override
          public PodSecurityPolicyList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodSecurityPolicyList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodSecurityPolicyList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodSecurityPolicyList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicyList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodSecurityPolicySpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.PodSecurityPolicySpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * privileged determines if a pod can request to be run as privileged.
     * +optional
     * </pre>
     *
     * <code>optional bool privileged = 1;</code>
     */
    boolean hasPrivileged();
    /**
     *
     *
     * <pre>
     * privileged determines if a pod can request to be run as privileged.
     * +optional
     * </pre>
     *
     * <code>optional bool privileged = 1;</code>
     */
    boolean getPrivileged();

    /**
     *
     *
     * <pre>
     * defaultAddCapabilities is the default set of capabilities that will be added to the container
     * unless the pod spec specifically drops the capability.  You may not list a capability in both
     * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
     * allowed, and need not be included in the allowedCapabilities list.
     * +optional
     * </pre>
     *
     * <code>repeated string defaultAddCapabilities = 2;</code>
     */
    java.util.List<java.lang.String> getDefaultAddCapabilitiesList();
    /**
     *
     *
     * <pre>
     * defaultAddCapabilities is the default set of capabilities that will be added to the container
     * unless the pod spec specifically drops the capability.  You may not list a capability in both
     * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
     * allowed, and need not be included in the allowedCapabilities list.
     * +optional
     * </pre>
     *
     * <code>repeated string defaultAddCapabilities = 2;</code>
     */
    int getDefaultAddCapabilitiesCount();
    /**
     *
     *
     * <pre>
     * defaultAddCapabilities is the default set of capabilities that will be added to the container
     * unless the pod spec specifically drops the capability.  You may not list a capability in both
     * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
     * allowed, and need not be included in the allowedCapabilities list.
     * +optional
     * </pre>
     *
     * <code>repeated string defaultAddCapabilities = 2;</code>
     */
    java.lang.String getDefaultAddCapabilities(int index);
    /**
     *
     *
     * <pre>
     * defaultAddCapabilities is the default set of capabilities that will be added to the container
     * unless the pod spec specifically drops the capability.  You may not list a capability in both
     * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
     * allowed, and need not be included in the allowedCapabilities list.
     * +optional
     * </pre>
     *
     * <code>repeated string defaultAddCapabilities = 2;</code>
     */
    com.google.protobuf.ByteString getDefaultAddCapabilitiesBytes(int index);

    /**
     *
     *
     * <pre>
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
     * are required to be dropped and cannot be added.
     * +optional
     * </pre>
     *
     * <code>repeated string requiredDropCapabilities = 3;</code>
     */
    java.util.List<java.lang.String> getRequiredDropCapabilitiesList();
    /**
     *
     *
     * <pre>
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
     * are required to be dropped and cannot be added.
     * +optional
     * </pre>
     *
     * <code>repeated string requiredDropCapabilities = 3;</code>
     */
    int getRequiredDropCapabilitiesCount();
    /**
     *
     *
     * <pre>
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
     * are required to be dropped and cannot be added.
     * +optional
     * </pre>
     *
     * <code>repeated string requiredDropCapabilities = 3;</code>
     */
    java.lang.String getRequiredDropCapabilities(int index);
    /**
     *
     *
     * <pre>
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
     * are required to be dropped and cannot be added.
     * +optional
     * </pre>
     *
     * <code>repeated string requiredDropCapabilities = 3;</code>
     */
    com.google.protobuf.ByteString getRequiredDropCapabilitiesBytes(int index);

    /**
     *
     *
     * <pre>
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * Capabilities in this field may be added at the pod author's discretion.
     * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedCapabilities = 4;</code>
     */
    java.util.List<java.lang.String> getAllowedCapabilitiesList();
    /**
     *
     *
     * <pre>
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * Capabilities in this field may be added at the pod author's discretion.
     * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedCapabilities = 4;</code>
     */
    int getAllowedCapabilitiesCount();
    /**
     *
     *
     * <pre>
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * Capabilities in this field may be added at the pod author's discretion.
     * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedCapabilities = 4;</code>
     */
    java.lang.String getAllowedCapabilities(int index);
    /**
     *
     *
     * <pre>
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * Capabilities in this field may be added at the pod author's discretion.
     * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedCapabilities = 4;</code>
     */
    com.google.protobuf.ByteString getAllowedCapabilitiesBytes(int index);

    /**
     *
     *
     * <pre>
     * volumes is a white list of allowed volume plugins. Empty indicates that
     * no volumes may be used. To allow all volumes you may use '*'.
     * +optional
     * </pre>
     *
     * <code>repeated string volumes = 5;</code>
     */
    java.util.List<java.lang.String> getVolumesList();
    /**
     *
     *
     * <pre>
     * volumes is a white list of allowed volume plugins. Empty indicates that
     * no volumes may be used. To allow all volumes you may use '*'.
     * +optional
     * </pre>
     *
     * <code>repeated string volumes = 5;</code>
     */
    int getVolumesCount();
    /**
     *
     *
     * <pre>
     * volumes is a white list of allowed volume plugins. Empty indicates that
     * no volumes may be used. To allow all volumes you may use '*'.
     * +optional
     * </pre>
     *
     * <code>repeated string volumes = 5;</code>
     */
    java.lang.String getVolumes(int index);
    /**
     *
     *
     * <pre>
     * volumes is a white list of allowed volume plugins. Empty indicates that
     * no volumes may be used. To allow all volumes you may use '*'.
     * +optional
     * </pre>
     *
     * <code>repeated string volumes = 5;</code>
     */
    com.google.protobuf.ByteString getVolumesBytes(int index);

    /**
     *
     *
     * <pre>
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostNetwork = 6;</code>
     */
    boolean hasHostNetwork();
    /**
     *
     *
     * <pre>
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostNetwork = 6;</code>
     */
    boolean getHostNetwork();

    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.HostPortRange> getHostPortsList();
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.HostPortRange getHostPorts(int index);
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    int getHostPortsCount();
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder>
        getHostPortsOrBuilderList();
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder getHostPortsOrBuilder(
        int index);

    /**
     *
     *
     * <pre>
     * hostPID determines if the policy allows the use of HostPID in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostPID = 8;</code>
     */
    boolean hasHostPID();
    /**
     *
     *
     * <pre>
     * hostPID determines if the policy allows the use of HostPID in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostPID = 8;</code>
     */
    boolean getHostPID();

    /**
     *
     *
     * <pre>
     * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostIPC = 9;</code>
     */
    boolean hasHostIPC();
    /**
     *
     *
     * <pre>
     * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostIPC = 9;</code>
     */
    boolean getHostIPC();

    /**
     *
     *
     * <pre>
     * seLinux is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
     */
    boolean hasSeLinux();
    /**
     *
     *
     * <pre>
     * seLinux is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions getSeLinux();
    /**
     *
     *
     * <pre>
     * seLinux is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptionsOrBuilder getSeLinuxOrBuilder();

    /**
     *
     *
     * <pre>
     * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;</code>
     */
    boolean hasRunAsUser();
    /**
     *
     *
     * <pre>
     * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions getRunAsUser();
    /**
     *
     *
     * <pre>
     * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptionsOrBuilder
        getRunAsUserOrBuilder();

    /**
     *
     *
     * <pre>
     * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
     * RunAsGroup feature gate to be enabled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
     * </code>
     */
    boolean hasRunAsGroup();
    /**
     *
     *
     * <pre>
     * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
     * RunAsGroup feature gate to be enabled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions getRunAsGroup();
    /**
     *
     *
     * <pre>
     * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
     * RunAsGroup feature gate to be enabled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptionsOrBuilder
        getRunAsGroupOrBuilder();

    /**
     *
     *
     * <pre>
     * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
     * </code>
     */
    boolean hasSupplementalGroups();
    /**
     *
     *
     * <pre>
     * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        getSupplementalGroups();
    /**
     *
     *
     * <pre>
     * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptionsOrBuilder
        getSupplementalGroupsOrBuilder();

    /**
     *
     *
     * <pre>
     * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
     */
    boolean hasFsGroup();
    /**
     *
     *
     * <pre>
     * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions getFsGroup();
    /**
     *
     *
     * <pre>
     * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptionsOrBuilder getFsGroupOrBuilder();

    /**
     *
     *
     * <pre>
     * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
     * system.  If the container specifically requests to run with a non-read only root file system
     * the PSP should deny the pod.
     * If set to false the container may run with a read only root file system if it wishes but it
     * will not be forced to.
     * +optional
     * </pre>
     *
     * <code>optional bool readOnlyRootFilesystem = 14;</code>
     */
    boolean hasReadOnlyRootFilesystem();
    /**
     *
     *
     * <pre>
     * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
     * system.  If the container specifically requests to run with a non-read only root file system
     * the PSP should deny the pod.
     * If set to false the container may run with a read only root file system if it wishes but it
     * will not be forced to.
     * +optional
     * </pre>
     *
     * <code>optional bool readOnlyRootFilesystem = 14;</code>
     */
    boolean getReadOnlyRootFilesystem();

    /**
     *
     *
     * <pre>
     * defaultAllowPrivilegeEscalation controls the default setting for whether a
     * process can gain more privileges than its parent process.
     * +optional
     * </pre>
     *
     * <code>optional bool defaultAllowPrivilegeEscalation = 15;</code>
     */
    boolean hasDefaultAllowPrivilegeEscalation();
    /**
     *
     *
     * <pre>
     * defaultAllowPrivilegeEscalation controls the default setting for whether a
     * process can gain more privileges than its parent process.
     * +optional
     * </pre>
     *
     * <code>optional bool defaultAllowPrivilegeEscalation = 15;</code>
     */
    boolean getDefaultAllowPrivilegeEscalation();

    /**
     *
     *
     * <pre>
     * allowPrivilegeEscalation determines if a pod can request to allow
     * privilege escalation. If unspecified, defaults to true.
     * +optional
     * </pre>
     *
     * <code>optional bool allowPrivilegeEscalation = 16;</code>
     */
    boolean hasAllowPrivilegeEscalation();
    /**
     *
     *
     * <pre>
     * allowPrivilegeEscalation determines if a pod can request to allow
     * privilege escalation. If unspecified, defaults to true.
     * +optional
     * </pre>
     *
     * <code>optional bool allowPrivilegeEscalation = 16;</code>
     */
    boolean getAllowPrivilegeEscalation();

    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath>
        getAllowedHostPathsList();
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath getAllowedHostPaths(int index);
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    int getAllowedHostPathsCount();
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder>
        getAllowedHostPathsOrBuilderList();
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder getAllowedHostPathsOrBuilder(
        int index);

    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume>
        getAllowedFlexVolumesList();
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume getAllowedFlexVolumes(int index);
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    int getAllowedFlexVolumesCount();
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder>
        getAllowedFlexVolumesOrBuilderList();
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder
        getAllowedFlexVolumesOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
     * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * Examples:
     * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedUnsafeSysctls = 19;</code>
     */
    java.util.List<java.lang.String> getAllowedUnsafeSysctlsList();
    /**
     *
     *
     * <pre>
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
     * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * Examples:
     * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedUnsafeSysctls = 19;</code>
     */
    int getAllowedUnsafeSysctlsCount();
    /**
     *
     *
     * <pre>
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
     * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * Examples:
     * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedUnsafeSysctls = 19;</code>
     */
    java.lang.String getAllowedUnsafeSysctls(int index);
    /**
     *
     *
     * <pre>
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
     * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * Examples:
     * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedUnsafeSysctls = 19;</code>
     */
    com.google.protobuf.ByteString getAllowedUnsafeSysctlsBytes(int index);

    /**
     *
     *
     * <pre>
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * Examples:
     * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string forbiddenSysctls = 20;</code>
     */
    java.util.List<java.lang.String> getForbiddenSysctlsList();
    /**
     *
     *
     * <pre>
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * Examples:
     * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string forbiddenSysctls = 20;</code>
     */
    int getForbiddenSysctlsCount();
    /**
     *
     *
     * <pre>
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * Examples:
     * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string forbiddenSysctls = 20;</code>
     */
    java.lang.String getForbiddenSysctls(int index);
    /**
     *
     *
     * <pre>
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * Examples:
     * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string forbiddenSysctls = 20;</code>
     */
    com.google.protobuf.ByteString getForbiddenSysctlsBytes(int index);

    /**
     *
     *
     * <pre>
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * Empty or nil indicates that only the DefaultProcMountType may be used.
     * This requires the ProcMountType feature flag to be enabled.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedProcMountTypes = 21;</code>
     */
    java.util.List<java.lang.String> getAllowedProcMountTypesList();
    /**
     *
     *
     * <pre>
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * Empty or nil indicates that only the DefaultProcMountType may be used.
     * This requires the ProcMountType feature flag to be enabled.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedProcMountTypes = 21;</code>
     */
    int getAllowedProcMountTypesCount();
    /**
     *
     *
     * <pre>
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * Empty or nil indicates that only the DefaultProcMountType may be used.
     * This requires the ProcMountType feature flag to be enabled.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedProcMountTypes = 21;</code>
     */
    java.lang.String getAllowedProcMountTypes(int index);
    /**
     *
     *
     * <pre>
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * Empty or nil indicates that only the DefaultProcMountType may be used.
     * This requires the ProcMountType feature flag to be enabled.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedProcMountTypes = 21;</code>
     */
    com.google.protobuf.ByteString getAllowedProcMountTypesBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * PodSecurityPolicySpec defines the policy enforced.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.PodSecurityPolicySpec}
   */
  public static final class PodSecurityPolicySpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.PodSecurityPolicySpec)
      PodSecurityPolicySpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodSecurityPolicySpec.newBuilder() to construct.
    private PodSecurityPolicySpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodSecurityPolicySpec() {
      privileged_ = false;
      defaultAddCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      requiredDropCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      allowedCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      volumes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      hostNetwork_ = false;
      hostPorts_ = java.util.Collections.emptyList();
      hostPID_ = false;
      hostIPC_ = false;
      readOnlyRootFilesystem_ = false;
      defaultAllowPrivilegeEscalation_ = false;
      allowPrivilegeEscalation_ = false;
      allowedHostPaths_ = java.util.Collections.emptyList();
      allowedFlexVolumes_ = java.util.Collections.emptyList();
      allowedUnsafeSysctls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      forbiddenSysctls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      allowedProcMountTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodSecurityPolicySpec(
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
                privileged_ = input.readBool();
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  defaultAddCapabilities_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000002;
                }
                defaultAddCapabilities_.add(bs);
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  requiredDropCapabilities_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000004;
                }
                requiredDropCapabilities_.add(bs);
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  allowedCapabilities_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000008;
                }
                allowedCapabilities_.add(bs);
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  volumes_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000010;
                }
                volumes_.add(bs);
                break;
              }
            case 48:
              {
                bitField0_ |= 0x00000002;
                hostNetwork_ = input.readBool();
                break;
              }
            case 58:
              {
                if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                  hostPorts_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Policy.HostPortRange>();
                  mutable_bitField0_ |= 0x00000040;
                }
                hostPorts_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.HostPortRange.PARSER,
                        extensionRegistry));
                break;
              }
            case 64:
              {
                bitField0_ |= 0x00000004;
                hostPID_ = input.readBool();
                break;
              }
            case 72:
              {
                bitField0_ |= 0x00000008;
                hostIPC_ = input.readBool();
                break;
              }
            case 82:
              {
                io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = seLinux_.toBuilder();
                }
                seLinux_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(seLinux_);
                  seLinux_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            case 90:
              {
                io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                  subBuilder = runAsUser_.toBuilder();
                }
                runAsUser_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(runAsUser_);
                  runAsUser_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000020;
                break;
              }
            case 98:
              {
                io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000080) == 0x00000080)) {
                  subBuilder = supplementalGroups_.toBuilder();
                }
                supplementalGroups_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(supplementalGroups_);
                  supplementalGroups_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000080;
                break;
              }
            case 106:
              {
                io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000100) == 0x00000100)) {
                  subBuilder = fsGroup_.toBuilder();
                }
                fsGroup_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(fsGroup_);
                  fsGroup_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000100;
                break;
              }
            case 112:
              {
                bitField0_ |= 0x00000200;
                readOnlyRootFilesystem_ = input.readBool();
                break;
              }
            case 120:
              {
                bitField0_ |= 0x00000400;
                defaultAllowPrivilegeEscalation_ = input.readBool();
                break;
              }
            case 128:
              {
                bitField0_ |= 0x00000800;
                allowPrivilegeEscalation_ = input.readBool();
                break;
              }
            case 138:
              {
                if (!((mutable_bitField0_ & 0x00020000) == 0x00020000)) {
                  allowedHostPaths_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath>();
                  mutable_bitField0_ |= 0x00020000;
                }
                allowedHostPaths_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.PARSER,
                        extensionRegistry));
                break;
              }
            case 146:
              {
                if (!((mutable_bitField0_ & 0x00040000) == 0x00040000)) {
                  allowedFlexVolumes_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume>();
                  mutable_bitField0_ |= 0x00040000;
                }
                allowedFlexVolumes_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.PARSER,
                        extensionRegistry));
                break;
              }
            case 154:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00080000) == 0x00080000)) {
                  allowedUnsafeSysctls_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00080000;
                }
                allowedUnsafeSysctls_.add(bs);
                break;
              }
            case 162:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00100000) == 0x00100000)) {
                  forbiddenSysctls_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00100000;
                }
                forbiddenSysctls_.add(bs);
                break;
              }
            case 170:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00200000) == 0x00200000)) {
                  allowedProcMountTypes_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00200000;
                }
                allowedProcMountTypes_.add(bs);
                break;
              }
            case 178:
              {
                io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000040) == 0x00000040)) {
                  subBuilder = runAsGroup_.toBuilder();
                }
                runAsGroup_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(runAsGroup_);
                  runAsGroup_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000040;
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
          defaultAddCapabilities_ = defaultAddCapabilities_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          requiredDropCapabilities_ = requiredDropCapabilities_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          allowedCapabilities_ = allowedCapabilities_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          volumes_ = volumes_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
          hostPorts_ = java.util.Collections.unmodifiableList(hostPorts_);
        }
        if (((mutable_bitField0_ & 0x00020000) == 0x00020000)) {
          allowedHostPaths_ = java.util.Collections.unmodifiableList(allowedHostPaths_);
        }
        if (((mutable_bitField0_ & 0x00040000) == 0x00040000)) {
          allowedFlexVolumes_ = java.util.Collections.unmodifiableList(allowedFlexVolumes_);
        }
        if (((mutable_bitField0_ & 0x00080000) == 0x00080000)) {
          allowedUnsafeSysctls_ = allowedUnsafeSysctls_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00100000) == 0x00100000)) {
          forbiddenSysctls_ = forbiddenSysctls_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00200000) == 0x00200000)) {
          allowedProcMountTypes_ = allowedProcMountTypes_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.class,
              io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.Builder.class);
    }

    private int bitField0_;
    public static final int PRIVILEGED_FIELD_NUMBER = 1;
    private boolean privileged_;
    /**
     *
     *
     * <pre>
     * privileged determines if a pod can request to be run as privileged.
     * +optional
     * </pre>
     *
     * <code>optional bool privileged = 1;</code>
     */
    public boolean hasPrivileged() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * privileged determines if a pod can request to be run as privileged.
     * +optional
     * </pre>
     *
     * <code>optional bool privileged = 1;</code>
     */
    public boolean getPrivileged() {
      return privileged_;
    }

    public static final int DEFAULTADDCAPABILITIES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList defaultAddCapabilities_;
    /**
     *
     *
     * <pre>
     * defaultAddCapabilities is the default set of capabilities that will be added to the container
     * unless the pod spec specifically drops the capability.  You may not list a capability in both
     * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
     * allowed, and need not be included in the allowedCapabilities list.
     * +optional
     * </pre>
     *
     * <code>repeated string defaultAddCapabilities = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getDefaultAddCapabilitiesList() {
      return defaultAddCapabilities_;
    }
    /**
     *
     *
     * <pre>
     * defaultAddCapabilities is the default set of capabilities that will be added to the container
     * unless the pod spec specifically drops the capability.  You may not list a capability in both
     * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
     * allowed, and need not be included in the allowedCapabilities list.
     * +optional
     * </pre>
     *
     * <code>repeated string defaultAddCapabilities = 2;</code>
     */
    public int getDefaultAddCapabilitiesCount() {
      return defaultAddCapabilities_.size();
    }
    /**
     *
     *
     * <pre>
     * defaultAddCapabilities is the default set of capabilities that will be added to the container
     * unless the pod spec specifically drops the capability.  You may not list a capability in both
     * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
     * allowed, and need not be included in the allowedCapabilities list.
     * +optional
     * </pre>
     *
     * <code>repeated string defaultAddCapabilities = 2;</code>
     */
    public java.lang.String getDefaultAddCapabilities(int index) {
      return defaultAddCapabilities_.get(index);
    }
    /**
     *
     *
     * <pre>
     * defaultAddCapabilities is the default set of capabilities that will be added to the container
     * unless the pod spec specifically drops the capability.  You may not list a capability in both
     * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
     * allowed, and need not be included in the allowedCapabilities list.
     * +optional
     * </pre>
     *
     * <code>repeated string defaultAddCapabilities = 2;</code>
     */
    public com.google.protobuf.ByteString getDefaultAddCapabilitiesBytes(int index) {
      return defaultAddCapabilities_.getByteString(index);
    }

    public static final int REQUIREDDROPCAPABILITIES_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList requiredDropCapabilities_;
    /**
     *
     *
     * <pre>
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
     * are required to be dropped and cannot be added.
     * +optional
     * </pre>
     *
     * <code>repeated string requiredDropCapabilities = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getRequiredDropCapabilitiesList() {
      return requiredDropCapabilities_;
    }
    /**
     *
     *
     * <pre>
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
     * are required to be dropped and cannot be added.
     * +optional
     * </pre>
     *
     * <code>repeated string requiredDropCapabilities = 3;</code>
     */
    public int getRequiredDropCapabilitiesCount() {
      return requiredDropCapabilities_.size();
    }
    /**
     *
     *
     * <pre>
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
     * are required to be dropped and cannot be added.
     * +optional
     * </pre>
     *
     * <code>repeated string requiredDropCapabilities = 3;</code>
     */
    public java.lang.String getRequiredDropCapabilities(int index) {
      return requiredDropCapabilities_.get(index);
    }
    /**
     *
     *
     * <pre>
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
     * are required to be dropped and cannot be added.
     * +optional
     * </pre>
     *
     * <code>repeated string requiredDropCapabilities = 3;</code>
     */
    public com.google.protobuf.ByteString getRequiredDropCapabilitiesBytes(int index) {
      return requiredDropCapabilities_.getByteString(index);
    }

    public static final int ALLOWEDCAPABILITIES_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList allowedCapabilities_;
    /**
     *
     *
     * <pre>
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * Capabilities in this field may be added at the pod author's discretion.
     * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedCapabilities = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList getAllowedCapabilitiesList() {
      return allowedCapabilities_;
    }
    /**
     *
     *
     * <pre>
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * Capabilities in this field may be added at the pod author's discretion.
     * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedCapabilities = 4;</code>
     */
    public int getAllowedCapabilitiesCount() {
      return allowedCapabilities_.size();
    }
    /**
     *
     *
     * <pre>
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * Capabilities in this field may be added at the pod author's discretion.
     * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedCapabilities = 4;</code>
     */
    public java.lang.String getAllowedCapabilities(int index) {
      return allowedCapabilities_.get(index);
    }
    /**
     *
     *
     * <pre>
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * Capabilities in this field may be added at the pod author's discretion.
     * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedCapabilities = 4;</code>
     */
    public com.google.protobuf.ByteString getAllowedCapabilitiesBytes(int index) {
      return allowedCapabilities_.getByteString(index);
    }

    public static final int VOLUMES_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList volumes_;
    /**
     *
     *
     * <pre>
     * volumes is a white list of allowed volume plugins. Empty indicates that
     * no volumes may be used. To allow all volumes you may use '*'.
     * +optional
     * </pre>
     *
     * <code>repeated string volumes = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList getVolumesList() {
      return volumes_;
    }
    /**
     *
     *
     * <pre>
     * volumes is a white list of allowed volume plugins. Empty indicates that
     * no volumes may be used. To allow all volumes you may use '*'.
     * +optional
     * </pre>
     *
     * <code>repeated string volumes = 5;</code>
     */
    public int getVolumesCount() {
      return volumes_.size();
    }
    /**
     *
     *
     * <pre>
     * volumes is a white list of allowed volume plugins. Empty indicates that
     * no volumes may be used. To allow all volumes you may use '*'.
     * +optional
     * </pre>
     *
     * <code>repeated string volumes = 5;</code>
     */
    public java.lang.String getVolumes(int index) {
      return volumes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * volumes is a white list of allowed volume plugins. Empty indicates that
     * no volumes may be used. To allow all volumes you may use '*'.
     * +optional
     * </pre>
     *
     * <code>repeated string volumes = 5;</code>
     */
    public com.google.protobuf.ByteString getVolumesBytes(int index) {
      return volumes_.getByteString(index);
    }

    public static final int HOSTNETWORK_FIELD_NUMBER = 6;
    private boolean hostNetwork_;
    /**
     *
     *
     * <pre>
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostNetwork = 6;</code>
     */
    public boolean hasHostNetwork() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostNetwork = 6;</code>
     */
    public boolean getHostNetwork() {
      return hostNetwork_;
    }

    public static final int HOSTPORTS_FIELD_NUMBER = 7;
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.HostPortRange> hostPorts_;
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.HostPortRange>
        getHostPortsList() {
      return hostPorts_;
    }
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder>
        getHostPortsOrBuilderList() {
      return hostPorts_;
    }
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    public int getHostPortsCount() {
      return hostPorts_.size();
    }
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.HostPortRange getHostPorts(int index) {
      return hostPorts_.get(index);
    }
    /**
     *
     *
     * <pre>
     * hostPorts determines which host port ranges are allowed to be exposed.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder getHostPortsOrBuilder(
        int index) {
      return hostPorts_.get(index);
    }

    public static final int HOSTPID_FIELD_NUMBER = 8;
    private boolean hostPID_;
    /**
     *
     *
     * <pre>
     * hostPID determines if the policy allows the use of HostPID in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostPID = 8;</code>
     */
    public boolean hasHostPID() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * hostPID determines if the policy allows the use of HostPID in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostPID = 8;</code>
     */
    public boolean getHostPID() {
      return hostPID_;
    }

    public static final int HOSTIPC_FIELD_NUMBER = 9;
    private boolean hostIPC_;
    /**
     *
     *
     * <pre>
     * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostIPC = 9;</code>
     */
    public boolean hasHostIPC() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
     * +optional
     * </pre>
     *
     * <code>optional bool hostIPC = 9;</code>
     */
    public boolean getHostIPC() {
      return hostIPC_;
    }

    public static final int SELINUX_FIELD_NUMBER = 10;
    private io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions seLinux_;
    /**
     *
     *
     * <pre>
     * seLinux is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
     */
    public boolean hasSeLinux() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * seLinux is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions getSeLinux() {
      return seLinux_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.getDefaultInstance()
          : seLinux_;
    }
    /**
     *
     *
     * <pre>
     * seLinux is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptionsOrBuilder
        getSeLinuxOrBuilder() {
      return seLinux_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.getDefaultInstance()
          : seLinux_;
    }

    public static final int RUNASUSER_FIELD_NUMBER = 11;
    private io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions runAsUser_;
    /**
     *
     *
     * <pre>
     * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;</code>
     */
    public boolean hasRunAsUser() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     *
     *
     * <pre>
     * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions getRunAsUser() {
      return runAsUser_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.getDefaultInstance()
          : runAsUser_;
    }
    /**
     *
     *
     * <pre>
     * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptionsOrBuilder
        getRunAsUserOrBuilder() {
      return runAsUser_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.getDefaultInstance()
          : runAsUser_;
    }

    public static final int RUNASGROUP_FIELD_NUMBER = 22;
    private io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions runAsGroup_;
    /**
     *
     *
     * <pre>
     * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
     * RunAsGroup feature gate to be enabled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
     * </code>
     */
    public boolean hasRunAsGroup() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     *
     *
     * <pre>
     * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
     * RunAsGroup feature gate to be enabled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions getRunAsGroup() {
      return runAsGroup_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.getDefaultInstance()
          : runAsGroup_;
    }
    /**
     *
     *
     * <pre>
     * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
     * RunAsGroup feature gate to be enabled.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptionsOrBuilder
        getRunAsGroupOrBuilder() {
      return runAsGroup_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.getDefaultInstance()
          : runAsGroup_;
    }

    public static final int SUPPLEMENTALGROUPS_FIELD_NUMBER = 12;
    private io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        supplementalGroups_;
    /**
     *
     *
     * <pre>
     * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
     * </code>
     */
    public boolean hasSupplementalGroups() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     *
     *
     * <pre>
     * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        getSupplementalGroups() {
      return supplementalGroups_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
              .getDefaultInstance()
          : supplementalGroups_;
    }
    /**
     *
     *
     * <pre>
     * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptionsOrBuilder
        getSupplementalGroupsOrBuilder() {
      return supplementalGroups_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
              .getDefaultInstance()
          : supplementalGroups_;
    }

    public static final int FSGROUP_FIELD_NUMBER = 13;
    private io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions fsGroup_;
    /**
     *
     *
     * <pre>
     * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
     */
    public boolean hasFsGroup() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     *
     *
     * <pre>
     * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions getFsGroup() {
      return fsGroup_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.getDefaultInstance()
          : fsGroup_;
    }
    /**
     *
     *
     * <pre>
     * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptionsOrBuilder
        getFsGroupOrBuilder() {
      return fsGroup_ == null
          ? io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.getDefaultInstance()
          : fsGroup_;
    }

    public static final int READONLYROOTFILESYSTEM_FIELD_NUMBER = 14;
    private boolean readOnlyRootFilesystem_;
    /**
     *
     *
     * <pre>
     * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
     * system.  If the container specifically requests to run with a non-read only root file system
     * the PSP should deny the pod.
     * If set to false the container may run with a read only root file system if it wishes but it
     * will not be forced to.
     * +optional
     * </pre>
     *
     * <code>optional bool readOnlyRootFilesystem = 14;</code>
     */
    public boolean hasReadOnlyRootFilesystem() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     *
     *
     * <pre>
     * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
     * system.  If the container specifically requests to run with a non-read only root file system
     * the PSP should deny the pod.
     * If set to false the container may run with a read only root file system if it wishes but it
     * will not be forced to.
     * +optional
     * </pre>
     *
     * <code>optional bool readOnlyRootFilesystem = 14;</code>
     */
    public boolean getReadOnlyRootFilesystem() {
      return readOnlyRootFilesystem_;
    }

    public static final int DEFAULTALLOWPRIVILEGEESCALATION_FIELD_NUMBER = 15;
    private boolean defaultAllowPrivilegeEscalation_;
    /**
     *
     *
     * <pre>
     * defaultAllowPrivilegeEscalation controls the default setting for whether a
     * process can gain more privileges than its parent process.
     * +optional
     * </pre>
     *
     * <code>optional bool defaultAllowPrivilegeEscalation = 15;</code>
     */
    public boolean hasDefaultAllowPrivilegeEscalation() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     *
     *
     * <pre>
     * defaultAllowPrivilegeEscalation controls the default setting for whether a
     * process can gain more privileges than its parent process.
     * +optional
     * </pre>
     *
     * <code>optional bool defaultAllowPrivilegeEscalation = 15;</code>
     */
    public boolean getDefaultAllowPrivilegeEscalation() {
      return defaultAllowPrivilegeEscalation_;
    }

    public static final int ALLOWPRIVILEGEESCALATION_FIELD_NUMBER = 16;
    private boolean allowPrivilegeEscalation_;
    /**
     *
     *
     * <pre>
     * allowPrivilegeEscalation determines if a pod can request to allow
     * privilege escalation. If unspecified, defaults to true.
     * +optional
     * </pre>
     *
     * <code>optional bool allowPrivilegeEscalation = 16;</code>
     */
    public boolean hasAllowPrivilegeEscalation() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     *
     *
     * <pre>
     * allowPrivilegeEscalation determines if a pod can request to allow
     * privilege escalation. If unspecified, defaults to true.
     * +optional
     * </pre>
     *
     * <code>optional bool allowPrivilegeEscalation = 16;</code>
     */
    public boolean getAllowPrivilegeEscalation() {
      return allowPrivilegeEscalation_;
    }

    public static final int ALLOWEDHOSTPATHS_FIELD_NUMBER = 17;
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath>
        allowedHostPaths_;
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath>
        getAllowedHostPathsList() {
      return allowedHostPaths_;
    }
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder>
        getAllowedHostPathsOrBuilderList() {
      return allowedHostPaths_;
    }
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    public int getAllowedHostPathsCount() {
      return allowedHostPaths_.size();
    }
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath getAllowedHostPaths(int index) {
      return allowedHostPaths_.get(index);
    }
    /**
     *
     *
     * <pre>
     * allowedHostPaths is a white list of allowed host paths. Empty indicates
     * that all host paths may be used.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder
        getAllowedHostPathsOrBuilder(int index) {
      return allowedHostPaths_.get(index);
    }

    public static final int ALLOWEDFLEXVOLUMES_FIELD_NUMBER = 18;
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume>
        allowedFlexVolumes_;
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume>
        getAllowedFlexVolumesList() {
      return allowedFlexVolumes_;
    }
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder>
        getAllowedFlexVolumesOrBuilderList() {
      return allowedFlexVolumes_;
    }
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    public int getAllowedFlexVolumesCount() {
      return allowedFlexVolumes_.size();
    }
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume getAllowedFlexVolumes(
        int index) {
      return allowedFlexVolumes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
     * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
     * is allowed in the "volumes" field.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
     * </code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder
        getAllowedFlexVolumesOrBuilder(int index) {
      return allowedFlexVolumes_.get(index);
    }

    public static final int ALLOWEDUNSAFESYSCTLS_FIELD_NUMBER = 19;
    private com.google.protobuf.LazyStringList allowedUnsafeSysctls_;
    /**
     *
     *
     * <pre>
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
     * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * Examples:
     * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedUnsafeSysctls = 19;</code>
     */
    public com.google.protobuf.ProtocolStringList getAllowedUnsafeSysctlsList() {
      return allowedUnsafeSysctls_;
    }
    /**
     *
     *
     * <pre>
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
     * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * Examples:
     * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedUnsafeSysctls = 19;</code>
     */
    public int getAllowedUnsafeSysctlsCount() {
      return allowedUnsafeSysctls_.size();
    }
    /**
     *
     *
     * <pre>
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
     * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * Examples:
     * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedUnsafeSysctls = 19;</code>
     */
    public java.lang.String getAllowedUnsafeSysctls(int index) {
      return allowedUnsafeSysctls_.get(index);
    }
    /**
     *
     *
     * <pre>
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
     * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * Examples:
     * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedUnsafeSysctls = 19;</code>
     */
    public com.google.protobuf.ByteString getAllowedUnsafeSysctlsBytes(int index) {
      return allowedUnsafeSysctls_.getByteString(index);
    }

    public static final int FORBIDDENSYSCTLS_FIELD_NUMBER = 20;
    private com.google.protobuf.LazyStringList forbiddenSysctls_;
    /**
     *
     *
     * <pre>
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * Examples:
     * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string forbiddenSysctls = 20;</code>
     */
    public com.google.protobuf.ProtocolStringList getForbiddenSysctlsList() {
      return forbiddenSysctls_;
    }
    /**
     *
     *
     * <pre>
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * Examples:
     * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string forbiddenSysctls = 20;</code>
     */
    public int getForbiddenSysctlsCount() {
      return forbiddenSysctls_.size();
    }
    /**
     *
     *
     * <pre>
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * Examples:
     * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string forbiddenSysctls = 20;</code>
     */
    public java.lang.String getForbiddenSysctls(int index) {
      return forbiddenSysctls_.get(index);
    }
    /**
     *
     *
     * <pre>
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
     * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * Examples:
     * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
     * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * +optional
     * </pre>
     *
     * <code>repeated string forbiddenSysctls = 20;</code>
     */
    public com.google.protobuf.ByteString getForbiddenSysctlsBytes(int index) {
      return forbiddenSysctls_.getByteString(index);
    }

    public static final int ALLOWEDPROCMOUNTTYPES_FIELD_NUMBER = 21;
    private com.google.protobuf.LazyStringList allowedProcMountTypes_;
    /**
     *
     *
     * <pre>
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * Empty or nil indicates that only the DefaultProcMountType may be used.
     * This requires the ProcMountType feature flag to be enabled.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedProcMountTypes = 21;</code>
     */
    public com.google.protobuf.ProtocolStringList getAllowedProcMountTypesList() {
      return allowedProcMountTypes_;
    }
    /**
     *
     *
     * <pre>
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * Empty or nil indicates that only the DefaultProcMountType may be used.
     * This requires the ProcMountType feature flag to be enabled.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedProcMountTypes = 21;</code>
     */
    public int getAllowedProcMountTypesCount() {
      return allowedProcMountTypes_.size();
    }
    /**
     *
     *
     * <pre>
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * Empty or nil indicates that only the DefaultProcMountType may be used.
     * This requires the ProcMountType feature flag to be enabled.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedProcMountTypes = 21;</code>
     */
    public java.lang.String getAllowedProcMountTypes(int index) {
      return allowedProcMountTypes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * Empty or nil indicates that only the DefaultProcMountType may be used.
     * This requires the ProcMountType feature flag to be enabled.
     * +optional
     * </pre>
     *
     * <code>repeated string allowedProcMountTypes = 21;</code>
     */
    public com.google.protobuf.ByteString getAllowedProcMountTypesBytes(int index) {
      return allowedProcMountTypes_.getByteString(index);
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
        output.writeBool(1, privileged_);
      }
      for (int i = 0; i < defaultAddCapabilities_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(
            output, 2, defaultAddCapabilities_.getRaw(i));
      }
      for (int i = 0; i < requiredDropCapabilities_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(
            output, 3, requiredDropCapabilities_.getRaw(i));
      }
      for (int i = 0; i < allowedCapabilities_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(
            output, 4, allowedCapabilities_.getRaw(i));
      }
      for (int i = 0; i < volumes_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, volumes_.getRaw(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(6, hostNetwork_);
      }
      for (int i = 0; i < hostPorts_.size(); i++) {
        output.writeMessage(7, hostPorts_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(8, hostPID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(9, hostIPC_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(10, getSeLinux());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeMessage(11, getRunAsUser());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeMessage(12, getSupplementalGroups());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeMessage(13, getFsGroup());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBool(14, readOnlyRootFilesystem_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeBool(15, defaultAllowPrivilegeEscalation_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeBool(16, allowPrivilegeEscalation_);
      }
      for (int i = 0; i < allowedHostPaths_.size(); i++) {
        output.writeMessage(17, allowedHostPaths_.get(i));
      }
      for (int i = 0; i < allowedFlexVolumes_.size(); i++) {
        output.writeMessage(18, allowedFlexVolumes_.get(i));
      }
      for (int i = 0; i < allowedUnsafeSysctls_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(
            output, 19, allowedUnsafeSysctls_.getRaw(i));
      }
      for (int i = 0; i < forbiddenSysctls_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 20, forbiddenSysctls_.getRaw(i));
      }
      for (int i = 0; i < allowedProcMountTypes_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(
            output, 21, allowedProcMountTypes_.getRaw(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeMessage(22, getRunAsGroup());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, privileged_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < defaultAddCapabilities_.size(); i++) {
          dataSize += computeStringSizeNoTag(defaultAddCapabilities_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getDefaultAddCapabilitiesList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < requiredDropCapabilities_.size(); i++) {
          dataSize += computeStringSizeNoTag(requiredDropCapabilities_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getRequiredDropCapabilitiesList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < allowedCapabilities_.size(); i++) {
          dataSize += computeStringSizeNoTag(allowedCapabilities_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAllowedCapabilitiesList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < volumes_.size(); i++) {
          dataSize += computeStringSizeNoTag(volumes_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getVolumesList().size();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, hostNetwork_);
      }
      for (int i = 0; i < hostPorts_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, hostPorts_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(8, hostPID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(9, hostIPC_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(10, getSeLinux());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(11, getRunAsUser());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(12, getSupplementalGroups());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(13, getFsGroup());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(14, readOnlyRootFilesystem_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeBoolSize(
                15, defaultAllowPrivilegeEscalation_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeBoolSize(16, allowPrivilegeEscalation_);
      }
      for (int i = 0; i < allowedHostPaths_.size(); i++) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(17, allowedHostPaths_.get(i));
      }
      for (int i = 0; i < allowedFlexVolumes_.size(); i++) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(
                18, allowedFlexVolumes_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < allowedUnsafeSysctls_.size(); i++) {
          dataSize += computeStringSizeNoTag(allowedUnsafeSysctls_.getRaw(i));
        }
        size += dataSize;
        size += 2 * getAllowedUnsafeSysctlsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < forbiddenSysctls_.size(); i++) {
          dataSize += computeStringSizeNoTag(forbiddenSysctls_.getRaw(i));
        }
        size += dataSize;
        size += 2 * getForbiddenSysctlsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < allowedProcMountTypes_.size(); i++) {
          dataSize += computeStringSizeNoTag(allowedProcMountTypes_.getRaw(i));
        }
        size += dataSize;
        size += 2 * getAllowedProcMountTypesList().size();
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(22, getRunAsGroup());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec other =
          (io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec) obj;

      boolean result = true;
      result = result && (hasPrivileged() == other.hasPrivileged());
      if (hasPrivileged()) {
        result = result && (getPrivileged() == other.getPrivileged());
      }
      result =
          result && getDefaultAddCapabilitiesList().equals(other.getDefaultAddCapabilitiesList());
      result =
          result
              && getRequiredDropCapabilitiesList().equals(other.getRequiredDropCapabilitiesList());
      result = result && getAllowedCapabilitiesList().equals(other.getAllowedCapabilitiesList());
      result = result && getVolumesList().equals(other.getVolumesList());
      result = result && (hasHostNetwork() == other.hasHostNetwork());
      if (hasHostNetwork()) {
        result = result && (getHostNetwork() == other.getHostNetwork());
      }
      result = result && getHostPortsList().equals(other.getHostPortsList());
      result = result && (hasHostPID() == other.hasHostPID());
      if (hasHostPID()) {
        result = result && (getHostPID() == other.getHostPID());
      }
      result = result && (hasHostIPC() == other.hasHostIPC());
      if (hasHostIPC()) {
        result = result && (getHostIPC() == other.getHostIPC());
      }
      result = result && (hasSeLinux() == other.hasSeLinux());
      if (hasSeLinux()) {
        result = result && getSeLinux().equals(other.getSeLinux());
      }
      result = result && (hasRunAsUser() == other.hasRunAsUser());
      if (hasRunAsUser()) {
        result = result && getRunAsUser().equals(other.getRunAsUser());
      }
      result = result && (hasRunAsGroup() == other.hasRunAsGroup());
      if (hasRunAsGroup()) {
        result = result && getRunAsGroup().equals(other.getRunAsGroup());
      }
      result = result && (hasSupplementalGroups() == other.hasSupplementalGroups());
      if (hasSupplementalGroups()) {
        result = result && getSupplementalGroups().equals(other.getSupplementalGroups());
      }
      result = result && (hasFsGroup() == other.hasFsGroup());
      if (hasFsGroup()) {
        result = result && getFsGroup().equals(other.getFsGroup());
      }
      result = result && (hasReadOnlyRootFilesystem() == other.hasReadOnlyRootFilesystem());
      if (hasReadOnlyRootFilesystem()) {
        result = result && (getReadOnlyRootFilesystem() == other.getReadOnlyRootFilesystem());
      }
      result =
          result
              && (hasDefaultAllowPrivilegeEscalation()
                  == other.hasDefaultAllowPrivilegeEscalation());
      if (hasDefaultAllowPrivilegeEscalation()) {
        result =
            result
                && (getDefaultAllowPrivilegeEscalation()
                    == other.getDefaultAllowPrivilegeEscalation());
      }
      result = result && (hasAllowPrivilegeEscalation() == other.hasAllowPrivilegeEscalation());
      if (hasAllowPrivilegeEscalation()) {
        result = result && (getAllowPrivilegeEscalation() == other.getAllowPrivilegeEscalation());
      }
      result = result && getAllowedHostPathsList().equals(other.getAllowedHostPathsList());
      result = result && getAllowedFlexVolumesList().equals(other.getAllowedFlexVolumesList());
      result = result && getAllowedUnsafeSysctlsList().equals(other.getAllowedUnsafeSysctlsList());
      result = result && getForbiddenSysctlsList().equals(other.getForbiddenSysctlsList());
      result =
          result && getAllowedProcMountTypesList().equals(other.getAllowedProcMountTypesList());
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
      if (hasPrivileged()) {
        hash = (37 * hash) + PRIVILEGED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPrivileged());
      }
      if (getDefaultAddCapabilitiesCount() > 0) {
        hash = (37 * hash) + DEFAULTADDCAPABILITIES_FIELD_NUMBER;
        hash = (53 * hash) + getDefaultAddCapabilitiesList().hashCode();
      }
      if (getRequiredDropCapabilitiesCount() > 0) {
        hash = (37 * hash) + REQUIREDDROPCAPABILITIES_FIELD_NUMBER;
        hash = (53 * hash) + getRequiredDropCapabilitiesList().hashCode();
      }
      if (getAllowedCapabilitiesCount() > 0) {
        hash = (37 * hash) + ALLOWEDCAPABILITIES_FIELD_NUMBER;
        hash = (53 * hash) + getAllowedCapabilitiesList().hashCode();
      }
      if (getVolumesCount() > 0) {
        hash = (37 * hash) + VOLUMES_FIELD_NUMBER;
        hash = (53 * hash) + getVolumesList().hashCode();
      }
      if (hasHostNetwork()) {
        hash = (37 * hash) + HOSTNETWORK_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHostNetwork());
      }
      if (getHostPortsCount() > 0) {
        hash = (37 * hash) + HOSTPORTS_FIELD_NUMBER;
        hash = (53 * hash) + getHostPortsList().hashCode();
      }
      if (hasHostPID()) {
        hash = (37 * hash) + HOSTPID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHostPID());
      }
      if (hasHostIPC()) {
        hash = (37 * hash) + HOSTIPC_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHostIPC());
      }
      if (hasSeLinux()) {
        hash = (37 * hash) + SELINUX_FIELD_NUMBER;
        hash = (53 * hash) + getSeLinux().hashCode();
      }
      if (hasRunAsUser()) {
        hash = (37 * hash) + RUNASUSER_FIELD_NUMBER;
        hash = (53 * hash) + getRunAsUser().hashCode();
      }
      if (hasRunAsGroup()) {
        hash = (37 * hash) + RUNASGROUP_FIELD_NUMBER;
        hash = (53 * hash) + getRunAsGroup().hashCode();
      }
      if (hasSupplementalGroups()) {
        hash = (37 * hash) + SUPPLEMENTALGROUPS_FIELD_NUMBER;
        hash = (53 * hash) + getSupplementalGroups().hashCode();
      }
      if (hasFsGroup()) {
        hash = (37 * hash) + FSGROUP_FIELD_NUMBER;
        hash = (53 * hash) + getFsGroup().hashCode();
      }
      if (hasReadOnlyRootFilesystem()) {
        hash = (37 * hash) + READONLYROOTFILESYSTEM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReadOnlyRootFilesystem());
      }
      if (hasDefaultAllowPrivilegeEscalation()) {
        hash = (37 * hash) + DEFAULTALLOWPRIVILEGEESCALATION_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashBoolean(getDefaultAllowPrivilegeEscalation());
      }
      if (hasAllowPrivilegeEscalation()) {
        hash = (37 * hash) + ALLOWPRIVILEGEESCALATION_FIELD_NUMBER;
        hash =
            (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowPrivilegeEscalation());
      }
      if (getAllowedHostPathsCount() > 0) {
        hash = (37 * hash) + ALLOWEDHOSTPATHS_FIELD_NUMBER;
        hash = (53 * hash) + getAllowedHostPathsList().hashCode();
      }
      if (getAllowedFlexVolumesCount() > 0) {
        hash = (37 * hash) + ALLOWEDFLEXVOLUMES_FIELD_NUMBER;
        hash = (53 * hash) + getAllowedFlexVolumesList().hashCode();
      }
      if (getAllowedUnsafeSysctlsCount() > 0) {
        hash = (37 * hash) + ALLOWEDUNSAFESYSCTLS_FIELD_NUMBER;
        hash = (53 * hash) + getAllowedUnsafeSysctlsList().hashCode();
      }
      if (getForbiddenSysctlsCount() > 0) {
        hash = (37 * hash) + FORBIDDENSYSCTLS_FIELD_NUMBER;
        hash = (53 * hash) + getForbiddenSysctlsList().hashCode();
      }
      if (getAllowedProcMountTypesCount() > 0) {
        hash = (37 * hash) + ALLOWEDPROCMOUNTTYPES_FIELD_NUMBER;
        hash = (53 * hash) + getAllowedProcMountTypesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec prototype) {
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
     * PodSecurityPolicySpec defines the policy enforced.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.PodSecurityPolicySpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.PodSecurityPolicySpec)
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.class,
                io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getHostPortsFieldBuilder();
          getSeLinuxFieldBuilder();
          getRunAsUserFieldBuilder();
          getRunAsGroupFieldBuilder();
          getSupplementalGroupsFieldBuilder();
          getFsGroupFieldBuilder();
          getAllowedHostPathsFieldBuilder();
          getAllowedFlexVolumesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        privileged_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        defaultAddCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        requiredDropCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        allowedCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        volumes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        hostNetwork_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        if (hostPortsBuilder_ == null) {
          hostPorts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          hostPortsBuilder_.clear();
        }
        hostPID_ = false;
        bitField0_ = (bitField0_ & ~0x00000080);
        hostIPC_ = false;
        bitField0_ = (bitField0_ & ~0x00000100);
        if (seLinuxBuilder_ == null) {
          seLinux_ = null;
        } else {
          seLinuxBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000200);
        if (runAsUserBuilder_ == null) {
          runAsUser_ = null;
        } else {
          runAsUserBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000400);
        if (runAsGroupBuilder_ == null) {
          runAsGroup_ = null;
        } else {
          runAsGroupBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000800);
        if (supplementalGroupsBuilder_ == null) {
          supplementalGroups_ = null;
        } else {
          supplementalGroupsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00001000);
        if (fsGroupBuilder_ == null) {
          fsGroup_ = null;
        } else {
          fsGroupBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00002000);
        readOnlyRootFilesystem_ = false;
        bitField0_ = (bitField0_ & ~0x00004000);
        defaultAllowPrivilegeEscalation_ = false;
        bitField0_ = (bitField0_ & ~0x00008000);
        allowPrivilegeEscalation_ = false;
        bitField0_ = (bitField0_ & ~0x00010000);
        if (allowedHostPathsBuilder_ == null) {
          allowedHostPaths_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00020000);
        } else {
          allowedHostPathsBuilder_.clear();
        }
        if (allowedFlexVolumesBuilder_ == null) {
          allowedFlexVolumes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00040000);
        } else {
          allowedFlexVolumesBuilder_.clear();
        }
        allowedUnsafeSysctls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00080000);
        forbiddenSysctls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00100000);
        allowedProcMountTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00200000);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec build() {
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec result =
            new io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.privileged_ = privileged_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          defaultAddCapabilities_ = defaultAddCapabilities_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.defaultAddCapabilities_ = defaultAddCapabilities_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          requiredDropCapabilities_ = requiredDropCapabilities_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.requiredDropCapabilities_ = requiredDropCapabilities_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          allowedCapabilities_ = allowedCapabilities_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.allowedCapabilities_ = allowedCapabilities_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          volumes_ = volumes_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.volumes_ = volumes_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000002;
        }
        result.hostNetwork_ = hostNetwork_;
        if (hostPortsBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            hostPorts_ = java.util.Collections.unmodifiableList(hostPorts_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.hostPorts_ = hostPorts_;
        } else {
          result.hostPorts_ = hostPortsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000004;
        }
        result.hostPID_ = hostPID_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000008;
        }
        result.hostIPC_ = hostIPC_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000010;
        }
        if (seLinuxBuilder_ == null) {
          result.seLinux_ = seLinux_;
        } else {
          result.seLinux_ = seLinuxBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000020;
        }
        if (runAsUserBuilder_ == null) {
          result.runAsUser_ = runAsUser_;
        } else {
          result.runAsUser_ = runAsUserBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000040;
        }
        if (runAsGroupBuilder_ == null) {
          result.runAsGroup_ = runAsGroup_;
        } else {
          result.runAsGroup_ = runAsGroupBuilder_.build();
        }
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00000080;
        }
        if (supplementalGroupsBuilder_ == null) {
          result.supplementalGroups_ = supplementalGroups_;
        } else {
          result.supplementalGroups_ = supplementalGroupsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
          to_bitField0_ |= 0x00000100;
        }
        if (fsGroupBuilder_ == null) {
          result.fsGroup_ = fsGroup_;
        } else {
          result.fsGroup_ = fsGroupBuilder_.build();
        }
        if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
          to_bitField0_ |= 0x00000200;
        }
        result.readOnlyRootFilesystem_ = readOnlyRootFilesystem_;
        if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
          to_bitField0_ |= 0x00000400;
        }
        result.defaultAllowPrivilegeEscalation_ = defaultAllowPrivilegeEscalation_;
        if (((from_bitField0_ & 0x00010000) == 0x00010000)) {
          to_bitField0_ |= 0x00000800;
        }
        result.allowPrivilegeEscalation_ = allowPrivilegeEscalation_;
        if (allowedHostPathsBuilder_ == null) {
          if (((bitField0_ & 0x00020000) == 0x00020000)) {
            allowedHostPaths_ = java.util.Collections.unmodifiableList(allowedHostPaths_);
            bitField0_ = (bitField0_ & ~0x00020000);
          }
          result.allowedHostPaths_ = allowedHostPaths_;
        } else {
          result.allowedHostPaths_ = allowedHostPathsBuilder_.build();
        }
        if (allowedFlexVolumesBuilder_ == null) {
          if (((bitField0_ & 0x00040000) == 0x00040000)) {
            allowedFlexVolumes_ = java.util.Collections.unmodifiableList(allowedFlexVolumes_);
            bitField0_ = (bitField0_ & ~0x00040000);
          }
          result.allowedFlexVolumes_ = allowedFlexVolumes_;
        } else {
          result.allowedFlexVolumes_ = allowedFlexVolumesBuilder_.build();
        }
        if (((bitField0_ & 0x00080000) == 0x00080000)) {
          allowedUnsafeSysctls_ = allowedUnsafeSysctls_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00080000);
        }
        result.allowedUnsafeSysctls_ = allowedUnsafeSysctls_;
        if (((bitField0_ & 0x00100000) == 0x00100000)) {
          forbiddenSysctls_ = forbiddenSysctls_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00100000);
        }
        result.forbiddenSysctls_ = forbiddenSysctls_;
        if (((bitField0_ & 0x00200000) == 0x00200000)) {
          allowedProcMountTypes_ = allowedProcMountTypes_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00200000);
        }
        result.allowedProcMountTypes_ = allowedProcMountTypes_;
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec.getDefaultInstance())
          return this;
        if (other.hasPrivileged()) {
          setPrivileged(other.getPrivileged());
        }
        if (!other.defaultAddCapabilities_.isEmpty()) {
          if (defaultAddCapabilities_.isEmpty()) {
            defaultAddCapabilities_ = other.defaultAddCapabilities_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDefaultAddCapabilitiesIsMutable();
            defaultAddCapabilities_.addAll(other.defaultAddCapabilities_);
          }
          onChanged();
        }
        if (!other.requiredDropCapabilities_.isEmpty()) {
          if (requiredDropCapabilities_.isEmpty()) {
            requiredDropCapabilities_ = other.requiredDropCapabilities_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRequiredDropCapabilitiesIsMutable();
            requiredDropCapabilities_.addAll(other.requiredDropCapabilities_);
          }
          onChanged();
        }
        if (!other.allowedCapabilities_.isEmpty()) {
          if (allowedCapabilities_.isEmpty()) {
            allowedCapabilities_ = other.allowedCapabilities_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureAllowedCapabilitiesIsMutable();
            allowedCapabilities_.addAll(other.allowedCapabilities_);
          }
          onChanged();
        }
        if (!other.volumes_.isEmpty()) {
          if (volumes_.isEmpty()) {
            volumes_ = other.volumes_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureVolumesIsMutable();
            volumes_.addAll(other.volumes_);
          }
          onChanged();
        }
        if (other.hasHostNetwork()) {
          setHostNetwork(other.getHostNetwork());
        }
        if (hostPortsBuilder_ == null) {
          if (!other.hostPorts_.isEmpty()) {
            if (hostPorts_.isEmpty()) {
              hostPorts_ = other.hostPorts_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureHostPortsIsMutable();
              hostPorts_.addAll(other.hostPorts_);
            }
            onChanged();
          }
        } else {
          if (!other.hostPorts_.isEmpty()) {
            if (hostPortsBuilder_.isEmpty()) {
              hostPortsBuilder_.dispose();
              hostPortsBuilder_ = null;
              hostPorts_ = other.hostPorts_;
              bitField0_ = (bitField0_ & ~0x00000040);
              hostPortsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getHostPortsFieldBuilder()
                      : null;
            } else {
              hostPortsBuilder_.addAllMessages(other.hostPorts_);
            }
          }
        }
        if (other.hasHostPID()) {
          setHostPID(other.getHostPID());
        }
        if (other.hasHostIPC()) {
          setHostIPC(other.getHostIPC());
        }
        if (other.hasSeLinux()) {
          mergeSeLinux(other.getSeLinux());
        }
        if (other.hasRunAsUser()) {
          mergeRunAsUser(other.getRunAsUser());
        }
        if (other.hasRunAsGroup()) {
          mergeRunAsGroup(other.getRunAsGroup());
        }
        if (other.hasSupplementalGroups()) {
          mergeSupplementalGroups(other.getSupplementalGroups());
        }
        if (other.hasFsGroup()) {
          mergeFsGroup(other.getFsGroup());
        }
        if (other.hasReadOnlyRootFilesystem()) {
          setReadOnlyRootFilesystem(other.getReadOnlyRootFilesystem());
        }
        if (other.hasDefaultAllowPrivilegeEscalation()) {
          setDefaultAllowPrivilegeEscalation(other.getDefaultAllowPrivilegeEscalation());
        }
        if (other.hasAllowPrivilegeEscalation()) {
          setAllowPrivilegeEscalation(other.getAllowPrivilegeEscalation());
        }
        if (allowedHostPathsBuilder_ == null) {
          if (!other.allowedHostPaths_.isEmpty()) {
            if (allowedHostPaths_.isEmpty()) {
              allowedHostPaths_ = other.allowedHostPaths_;
              bitField0_ = (bitField0_ & ~0x00020000);
            } else {
              ensureAllowedHostPathsIsMutable();
              allowedHostPaths_.addAll(other.allowedHostPaths_);
            }
            onChanged();
          }
        } else {
          if (!other.allowedHostPaths_.isEmpty()) {
            if (allowedHostPathsBuilder_.isEmpty()) {
              allowedHostPathsBuilder_.dispose();
              allowedHostPathsBuilder_ = null;
              allowedHostPaths_ = other.allowedHostPaths_;
              bitField0_ = (bitField0_ & ~0x00020000);
              allowedHostPathsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getAllowedHostPathsFieldBuilder()
                      : null;
            } else {
              allowedHostPathsBuilder_.addAllMessages(other.allowedHostPaths_);
            }
          }
        }
        if (allowedFlexVolumesBuilder_ == null) {
          if (!other.allowedFlexVolumes_.isEmpty()) {
            if (allowedFlexVolumes_.isEmpty()) {
              allowedFlexVolumes_ = other.allowedFlexVolumes_;
              bitField0_ = (bitField0_ & ~0x00040000);
            } else {
              ensureAllowedFlexVolumesIsMutable();
              allowedFlexVolumes_.addAll(other.allowedFlexVolumes_);
            }
            onChanged();
          }
        } else {
          if (!other.allowedFlexVolumes_.isEmpty()) {
            if (allowedFlexVolumesBuilder_.isEmpty()) {
              allowedFlexVolumesBuilder_.dispose();
              allowedFlexVolumesBuilder_ = null;
              allowedFlexVolumes_ = other.allowedFlexVolumes_;
              bitField0_ = (bitField0_ & ~0x00040000);
              allowedFlexVolumesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getAllowedFlexVolumesFieldBuilder()
                      : null;
            } else {
              allowedFlexVolumesBuilder_.addAllMessages(other.allowedFlexVolumes_);
            }
          }
        }
        if (!other.allowedUnsafeSysctls_.isEmpty()) {
          if (allowedUnsafeSysctls_.isEmpty()) {
            allowedUnsafeSysctls_ = other.allowedUnsafeSysctls_;
            bitField0_ = (bitField0_ & ~0x00080000);
          } else {
            ensureAllowedUnsafeSysctlsIsMutable();
            allowedUnsafeSysctls_.addAll(other.allowedUnsafeSysctls_);
          }
          onChanged();
        }
        if (!other.forbiddenSysctls_.isEmpty()) {
          if (forbiddenSysctls_.isEmpty()) {
            forbiddenSysctls_ = other.forbiddenSysctls_;
            bitField0_ = (bitField0_ & ~0x00100000);
          } else {
            ensureForbiddenSysctlsIsMutable();
            forbiddenSysctls_.addAll(other.forbiddenSysctls_);
          }
          onChanged();
        }
        if (!other.allowedProcMountTypes_.isEmpty()) {
          if (allowedProcMountTypes_.isEmpty()) {
            allowedProcMountTypes_ = other.allowedProcMountTypes_;
            bitField0_ = (bitField0_ & ~0x00200000);
          } else {
            ensureAllowedProcMountTypesIsMutable();
            allowedProcMountTypes_.addAll(other.allowedProcMountTypes_);
          }
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
        io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private boolean privileged_;
      /**
       *
       *
       * <pre>
       * privileged determines if a pod can request to be run as privileged.
       * +optional
       * </pre>
       *
       * <code>optional bool privileged = 1;</code>
       */
      public boolean hasPrivileged() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * privileged determines if a pod can request to be run as privileged.
       * +optional
       * </pre>
       *
       * <code>optional bool privileged = 1;</code>
       */
      public boolean getPrivileged() {
        return privileged_;
      }
      /**
       *
       *
       * <pre>
       * privileged determines if a pod can request to be run as privileged.
       * +optional
       * </pre>
       *
       * <code>optional bool privileged = 1;</code>
       */
      public Builder setPrivileged(boolean value) {
        bitField0_ |= 0x00000001;
        privileged_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * privileged determines if a pod can request to be run as privileged.
       * +optional
       * </pre>
       *
       * <code>optional bool privileged = 1;</code>
       */
      public Builder clearPrivileged() {
        bitField0_ = (bitField0_ & ~0x00000001);
        privileged_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList defaultAddCapabilities_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureDefaultAddCapabilitiesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          defaultAddCapabilities_ =
              new com.google.protobuf.LazyStringArrayList(defaultAddCapabilities_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList getDefaultAddCapabilitiesList() {
        return defaultAddCapabilities_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public int getDefaultAddCapabilitiesCount() {
        return defaultAddCapabilities_.size();
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public java.lang.String getDefaultAddCapabilities(int index) {
        return defaultAddCapabilities_.get(index);
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public com.google.protobuf.ByteString getDefaultAddCapabilitiesBytes(int index) {
        return defaultAddCapabilities_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public Builder setDefaultAddCapabilities(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDefaultAddCapabilitiesIsMutable();
        defaultAddCapabilities_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public Builder addDefaultAddCapabilities(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDefaultAddCapabilitiesIsMutable();
        defaultAddCapabilities_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public Builder addAllDefaultAddCapabilities(java.lang.Iterable<java.lang.String> values) {
        ensureDefaultAddCapabilitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, defaultAddCapabilities_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public Builder clearDefaultAddCapabilities() {
        defaultAddCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * defaultAddCapabilities is the default set of capabilities that will be added to the container
       * unless the pod spec specifically drops the capability.  You may not list a capability in both
       * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
       * allowed, and need not be included in the allowedCapabilities list.
       * +optional
       * </pre>
       *
       * <code>repeated string defaultAddCapabilities = 2;</code>
       */
      public Builder addDefaultAddCapabilitiesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDefaultAddCapabilitiesIsMutable();
        defaultAddCapabilities_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList requiredDropCapabilities_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureRequiredDropCapabilitiesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          requiredDropCapabilities_ =
              new com.google.protobuf.LazyStringArrayList(requiredDropCapabilities_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList getRequiredDropCapabilitiesList() {
        return requiredDropCapabilities_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public int getRequiredDropCapabilitiesCount() {
        return requiredDropCapabilities_.size();
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public java.lang.String getRequiredDropCapabilities(int index) {
        return requiredDropCapabilities_.get(index);
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public com.google.protobuf.ByteString getRequiredDropCapabilitiesBytes(int index) {
        return requiredDropCapabilities_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public Builder setRequiredDropCapabilities(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequiredDropCapabilitiesIsMutable();
        requiredDropCapabilities_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public Builder addRequiredDropCapabilities(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequiredDropCapabilitiesIsMutable();
        requiredDropCapabilities_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public Builder addAllRequiredDropCapabilities(java.lang.Iterable<java.lang.String> values) {
        ensureRequiredDropCapabilitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, requiredDropCapabilities_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public Builder clearRequiredDropCapabilities() {
        requiredDropCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * requiredDropCapabilities are the capabilities that will be dropped from the container.  These
       * are required to be dropped and cannot be added.
       * +optional
       * </pre>
       *
       * <code>repeated string requiredDropCapabilities = 3;</code>
       */
      public Builder addRequiredDropCapabilitiesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequiredDropCapabilitiesIsMutable();
        requiredDropCapabilities_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList allowedCapabilities_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureAllowedCapabilitiesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          allowedCapabilities_ = new com.google.protobuf.LazyStringArrayList(allowedCapabilities_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList getAllowedCapabilitiesList() {
        return allowedCapabilities_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public int getAllowedCapabilitiesCount() {
        return allowedCapabilities_.size();
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public java.lang.String getAllowedCapabilities(int index) {
        return allowedCapabilities_.get(index);
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public com.google.protobuf.ByteString getAllowedCapabilitiesBytes(int index) {
        return allowedCapabilities_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public Builder setAllowedCapabilities(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedCapabilitiesIsMutable();
        allowedCapabilities_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public Builder addAllowedCapabilities(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedCapabilitiesIsMutable();
        allowedCapabilities_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public Builder addAllAllowedCapabilities(java.lang.Iterable<java.lang.String> values) {
        ensureAllowedCapabilitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedCapabilities_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public Builder clearAllowedCapabilities() {
        allowedCapabilities_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedCapabilities is a list of capabilities that can be requested to add to the container.
       * Capabilities in this field may be added at the pod author's discretion.
       * You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedCapabilities = 4;</code>
       */
      public Builder addAllowedCapabilitiesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedCapabilitiesIsMutable();
        allowedCapabilities_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList volumes_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureVolumesIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          volumes_ = new com.google.protobuf.LazyStringArrayList(volumes_);
          bitField0_ |= 0x00000010;
        }
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public com.google.protobuf.ProtocolStringList getVolumesList() {
        return volumes_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public int getVolumesCount() {
        return volumes_.size();
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public java.lang.String getVolumes(int index) {
        return volumes_.get(index);
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public com.google.protobuf.ByteString getVolumesBytes(int index) {
        return volumes_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public Builder setVolumes(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumesIsMutable();
        volumes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public Builder addVolumes(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumesIsMutable();
        volumes_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public Builder addAllVolumes(java.lang.Iterable<java.lang.String> values) {
        ensureVolumesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, volumes_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public Builder clearVolumes() {
        volumes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * volumes is a white list of allowed volume plugins. Empty indicates that
       * no volumes may be used. To allow all volumes you may use '*'.
       * +optional
       * </pre>
       *
       * <code>repeated string volumes = 5;</code>
       */
      public Builder addVolumesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumesIsMutable();
        volumes_.add(value);
        onChanged();
        return this;
      }

      private boolean hostNetwork_;
      /**
       *
       *
       * <pre>
       * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostNetwork = 6;</code>
       */
      public boolean hasHostNetwork() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostNetwork = 6;</code>
       */
      public boolean getHostNetwork() {
        return hostNetwork_;
      }
      /**
       *
       *
       * <pre>
       * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostNetwork = 6;</code>
       */
      public Builder setHostNetwork(boolean value) {
        bitField0_ |= 0x00000020;
        hostNetwork_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostNetwork = 6;</code>
       */
      public Builder clearHostNetwork() {
        bitField0_ = (bitField0_ & ~0x00000020);
        hostNetwork_ = false;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.HostPortRange> hostPorts_ =
          java.util.Collections.emptyList();

      private void ensureHostPortsIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          hostPorts_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.HostPortRange>(
                  hostPorts_);
          bitField0_ |= 0x00000040;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.HostPortRange,
              io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder>
          hostPortsBuilder_;

      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.HostPortRange>
          getHostPortsList() {
        if (hostPortsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(hostPorts_);
        } else {
          return hostPortsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public int getHostPortsCount() {
        if (hostPortsBuilder_ == null) {
          return hostPorts_.size();
        } else {
          return hostPortsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.HostPortRange getHostPorts(int index) {
        if (hostPortsBuilder_ == null) {
          return hostPorts_.get(index);
        } else {
          return hostPortsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder setHostPorts(
          int index, io.kubernetes.client.proto.V1beta1Policy.HostPortRange value) {
        if (hostPortsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHostPortsIsMutable();
          hostPorts_.set(index, value);
          onChanged();
        } else {
          hostPortsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder setHostPorts(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder builderForValue) {
        if (hostPortsBuilder_ == null) {
          ensureHostPortsIsMutable();
          hostPorts_.set(index, builderForValue.build());
          onChanged();
        } else {
          hostPortsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder addHostPorts(io.kubernetes.client.proto.V1beta1Policy.HostPortRange value) {
        if (hostPortsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHostPortsIsMutable();
          hostPorts_.add(value);
          onChanged();
        } else {
          hostPortsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder addHostPorts(
          int index, io.kubernetes.client.proto.V1beta1Policy.HostPortRange value) {
        if (hostPortsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHostPortsIsMutable();
          hostPorts_.add(index, value);
          onChanged();
        } else {
          hostPortsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder addHostPorts(
          io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder builderForValue) {
        if (hostPortsBuilder_ == null) {
          ensureHostPortsIsMutable();
          hostPorts_.add(builderForValue.build());
          onChanged();
        } else {
          hostPortsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder addHostPorts(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder builderForValue) {
        if (hostPortsBuilder_ == null) {
          ensureHostPortsIsMutable();
          hostPorts_.add(index, builderForValue.build());
          onChanged();
        } else {
          hostPortsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder addAllHostPorts(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.HostPortRange>
              values) {
        if (hostPortsBuilder_ == null) {
          ensureHostPortsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, hostPorts_);
          onChanged();
        } else {
          hostPortsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder clearHostPorts() {
        if (hostPortsBuilder_ == null) {
          hostPorts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          hostPortsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public Builder removeHostPorts(int index) {
        if (hostPortsBuilder_ == null) {
          ensureHostPortsIsMutable();
          hostPorts_.remove(index);
          onChanged();
        } else {
          hostPortsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder getHostPortsBuilder(
          int index) {
        return getHostPortsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder getHostPortsOrBuilder(
          int index) {
        if (hostPortsBuilder_ == null) {
          return hostPorts_.get(index);
        } else {
          return hostPortsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder>
          getHostPortsOrBuilderList() {
        if (hostPortsBuilder_ != null) {
          return hostPortsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(hostPorts_);
        }
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder addHostPortsBuilder() {
        return getHostPortsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Policy.HostPortRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder addHostPortsBuilder(
          int index) {
        return getHostPortsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1beta1Policy.HostPortRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * hostPorts determines which host port ranges are allowed to be exposed.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.HostPortRange hostPorts = 7;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder>
          getHostPortsBuilderList() {
        return getHostPortsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.HostPortRange,
              io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder>
          getHostPortsFieldBuilder() {
        if (hostPortsBuilder_ == null) {
          hostPortsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.HostPortRange,
                  io.kubernetes.client.proto.V1beta1Policy.HostPortRange.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.HostPortRangeOrBuilder>(
                  hostPorts_,
                  ((bitField0_ & 0x00000040) == 0x00000040),
                  getParentForChildren(),
                  isClean());
          hostPorts_ = null;
        }
        return hostPortsBuilder_;
      }

      private boolean hostPID_;
      /**
       *
       *
       * <pre>
       * hostPID determines if the policy allows the use of HostPID in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostPID = 8;</code>
       */
      public boolean hasHostPID() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       *
       *
       * <pre>
       * hostPID determines if the policy allows the use of HostPID in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostPID = 8;</code>
       */
      public boolean getHostPID() {
        return hostPID_;
      }
      /**
       *
       *
       * <pre>
       * hostPID determines if the policy allows the use of HostPID in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostPID = 8;</code>
       */
      public Builder setHostPID(boolean value) {
        bitField0_ |= 0x00000080;
        hostPID_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostPID determines if the policy allows the use of HostPID in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostPID = 8;</code>
       */
      public Builder clearHostPID() {
        bitField0_ = (bitField0_ & ~0x00000080);
        hostPID_ = false;
        onChanged();
        return this;
      }

      private boolean hostIPC_;
      /**
       *
       *
       * <pre>
       * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostIPC = 9;</code>
       */
      public boolean hasHostIPC() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       *
       *
       * <pre>
       * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostIPC = 9;</code>
       */
      public boolean getHostIPC() {
        return hostIPC_;
      }
      /**
       *
       *
       * <pre>
       * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostIPC = 9;</code>
       */
      public Builder setHostIPC(boolean value) {
        bitField0_ |= 0x00000100;
        hostIPC_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
       * +optional
       * </pre>
       *
       * <code>optional bool hostIPC = 9;</code>
       */
      public Builder clearHostIPC() {
        bitField0_ = (bitField0_ & ~0x00000100);
        hostIPC_ = false;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions seLinux_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptionsOrBuilder>
          seLinuxBuilder_;
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      public boolean hasSeLinux() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions getSeLinux() {
        if (seLinuxBuilder_ == null) {
          return seLinux_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.getDefaultInstance()
              : seLinux_;
        } else {
          return seLinuxBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      public Builder setSeLinux(
          io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions value) {
        if (seLinuxBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          seLinux_ = value;
          onChanged();
        } else {
          seLinuxBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      public Builder setSeLinux(
          io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.Builder builderForValue) {
        if (seLinuxBuilder_ == null) {
          seLinux_ = builderForValue.build();
          onChanged();
        } else {
          seLinuxBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      public Builder mergeSeLinux(
          io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions value) {
        if (seLinuxBuilder_ == null) {
          if (((bitField0_ & 0x00000200) == 0x00000200)
              && seLinux_ != null
              && seLinux_
                  != io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions
                      .getDefaultInstance()) {
            seLinux_ =
                io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.newBuilder(seLinux_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            seLinux_ = value;
          }
          onChanged();
        } else {
          seLinuxBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      public Builder clearSeLinux() {
        if (seLinuxBuilder_ == null) {
          seLinux_ = null;
          onChanged();
        } else {
          seLinuxBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.Builder
          getSeLinuxBuilder() {
        bitField0_ |= 0x00000200;
        onChanged();
        return getSeLinuxFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptionsOrBuilder
          getSeLinuxOrBuilder() {
        if (seLinuxBuilder_ != null) {
          return seLinuxBuilder_.getMessageOrBuilder();
        } else {
          return seLinux_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.getDefaultInstance()
              : seLinux_;
        }
      }
      /**
       *
       *
       * <pre>
       * seLinux is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.SELinuxStrategyOptions seLinux = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptionsOrBuilder>
          getSeLinuxFieldBuilder() {
        if (seLinuxBuilder_ == null) {
          seLinuxBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions,
                  io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptionsOrBuilder>(
                  getSeLinux(), getParentForChildren(), isClean());
          seLinux_ = null;
        }
        return seLinuxBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions runAsUser_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptionsOrBuilder>
          runAsUserBuilder_;
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      public boolean hasRunAsUser() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions getRunAsUser() {
        if (runAsUserBuilder_ == null) {
          return runAsUser_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
                  .getDefaultInstance()
              : runAsUser_;
        } else {
          return runAsUserBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      public Builder setRunAsUser(
          io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions value) {
        if (runAsUserBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          runAsUser_ = value;
          onChanged();
        } else {
          runAsUserBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000400;
        return this;
      }
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      public Builder setRunAsUser(
          io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.Builder
              builderForValue) {
        if (runAsUserBuilder_ == null) {
          runAsUser_ = builderForValue.build();
          onChanged();
        } else {
          runAsUserBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000400;
        return this;
      }
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      public Builder mergeRunAsUser(
          io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions value) {
        if (runAsUserBuilder_ == null) {
          if (((bitField0_ & 0x00000400) == 0x00000400)
              && runAsUser_ != null
              && runAsUser_
                  != io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
                      .getDefaultInstance()) {
            runAsUser_ =
                io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.newBuilder(
                        runAsUser_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            runAsUser_ = value;
          }
          onChanged();
        } else {
          runAsUserBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000400;
        return this;
      }
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      public Builder clearRunAsUser() {
        if (runAsUserBuilder_ == null) {
          runAsUser_ = null;
          onChanged();
        } else {
          runAsUserBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.Builder
          getRunAsUserBuilder() {
        bitField0_ |= 0x00000400;
        onChanged();
        return getRunAsUserFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptionsOrBuilder
          getRunAsUserOrBuilder() {
        if (runAsUserBuilder_ != null) {
          return runAsUserBuilder_.getMessageOrBuilder();
        } else {
          return runAsUser_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
                  .getDefaultInstance()
              : runAsUser_;
        }
      }
      /**
       *
       *
       * <pre>
       * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions runAsUser = 11;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptionsOrBuilder>
          getRunAsUserFieldBuilder() {
        if (runAsUserBuilder_ == null) {
          runAsUserBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions,
                  io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptionsOrBuilder>(
                  getRunAsUser(), getParentForChildren(), isClean());
          runAsUser_ = null;
        }
        return runAsUserBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions runAsGroup_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptionsOrBuilder>
          runAsGroupBuilder_;
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      public boolean hasRunAsGroup() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions getRunAsGroup() {
        if (runAsGroupBuilder_ == null) {
          return runAsGroup_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
                  .getDefaultInstance()
              : runAsGroup_;
        } else {
          return runAsGroupBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      public Builder setRunAsGroup(
          io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions value) {
        if (runAsGroupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          runAsGroup_ = value;
          onChanged();
        } else {
          runAsGroupBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000800;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      public Builder setRunAsGroup(
          io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.Builder
              builderForValue) {
        if (runAsGroupBuilder_ == null) {
          runAsGroup_ = builderForValue.build();
          onChanged();
        } else {
          runAsGroupBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000800;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      public Builder mergeRunAsGroup(
          io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions value) {
        if (runAsGroupBuilder_ == null) {
          if (((bitField0_ & 0x00000800) == 0x00000800)
              && runAsGroup_ != null
              && runAsGroup_
                  != io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
                      .getDefaultInstance()) {
            runAsGroup_ =
                io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.newBuilder(
                        runAsGroup_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            runAsGroup_ = value;
          }
          onChanged();
        } else {
          runAsGroupBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000800;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      public Builder clearRunAsGroup() {
        if (runAsGroupBuilder_ == null) {
          runAsGroup_ = null;
          onChanged();
        } else {
          runAsGroupBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000800);
        return this;
      }
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.Builder
          getRunAsGroupBuilder() {
        bitField0_ |= 0x00000800;
        onChanged();
        return getRunAsGroupFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptionsOrBuilder
          getRunAsGroupOrBuilder() {
        if (runAsGroupBuilder_ != null) {
          return runAsGroupBuilder_.getMessageOrBuilder();
        } else {
          return runAsGroup_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
                  .getDefaultInstance()
              : runAsGroup_;
        }
      }
      /**
       *
       *
       * <pre>
       * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the
       * RunAsGroup feature gate to be enabled.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions runAsGroup = 22;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptionsOrBuilder>
          getRunAsGroupFieldBuilder() {
        if (runAsGroupBuilder_ == null) {
          runAsGroupBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions,
                  io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptionsOrBuilder>(
                  getRunAsGroup(), getParentForChildren(), isClean());
          runAsGroup_ = null;
        }
        return runAsGroupBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
          supplementalGroups_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptionsOrBuilder>
          supplementalGroupsBuilder_;
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      public boolean hasSupplementalGroups() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
          getSupplementalGroups() {
        if (supplementalGroupsBuilder_ == null) {
          return supplementalGroups_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
                  .getDefaultInstance()
              : supplementalGroups_;
        } else {
          return supplementalGroupsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      public Builder setSupplementalGroups(
          io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions value) {
        if (supplementalGroupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          supplementalGroups_ = value;
          onChanged();
        } else {
          supplementalGroupsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00001000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      public Builder setSupplementalGroups(
          io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.Builder
              builderForValue) {
        if (supplementalGroupsBuilder_ == null) {
          supplementalGroups_ = builderForValue.build();
          onChanged();
        } else {
          supplementalGroupsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00001000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      public Builder mergeSupplementalGroups(
          io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions value) {
        if (supplementalGroupsBuilder_ == null) {
          if (((bitField0_ & 0x00001000) == 0x00001000)
              && supplementalGroups_ != null
              && supplementalGroups_
                  != io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
                      .getDefaultInstance()) {
            supplementalGroups_ =
                io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
                    .newBuilder(supplementalGroups_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            supplementalGroups_ = value;
          }
          onChanged();
        } else {
          supplementalGroupsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00001000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      public Builder clearSupplementalGroups() {
        if (supplementalGroupsBuilder_ == null) {
          supplementalGroups_ = null;
          onChanged();
        } else {
          supplementalGroupsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.Builder
          getSupplementalGroupsBuilder() {
        bitField0_ |= 0x00001000;
        onChanged();
        return getSupplementalGroupsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptionsOrBuilder
          getSupplementalGroupsOrBuilder() {
        if (supplementalGroupsBuilder_ != null) {
          return supplementalGroupsBuilder_.getMessageOrBuilder();
        } else {
          return supplementalGroups_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
                  .getDefaultInstance()
              : supplementalGroups_;
        }
      }
      /**
       *
       *
       * <pre>
       * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions supplementalGroups = 12;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptionsOrBuilder>
          getSupplementalGroupsFieldBuilder() {
        if (supplementalGroupsBuilder_ == null) {
          supplementalGroupsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions,
                  io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
                      .Builder,
                  io.kubernetes.client.proto.V1beta1Policy
                      .SupplementalGroupsStrategyOptionsOrBuilder>(
                  getSupplementalGroups(), getParentForChildren(), isClean());
          supplementalGroups_ = null;
        }
        return supplementalGroupsBuilder_;
      }

      private io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions fsGroup_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptionsOrBuilder>
          fsGroupBuilder_;
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      public boolean hasFsGroup() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions getFsGroup() {
        if (fsGroupBuilder_ == null) {
          return fsGroup_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.getDefaultInstance()
              : fsGroup_;
        } else {
          return fsGroupBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      public Builder setFsGroup(
          io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions value) {
        if (fsGroupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fsGroup_ = value;
          onChanged();
        } else {
          fsGroupBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00002000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      public Builder setFsGroup(
          io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.Builder builderForValue) {
        if (fsGroupBuilder_ == null) {
          fsGroup_ = builderForValue.build();
          onChanged();
        } else {
          fsGroupBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00002000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      public Builder mergeFsGroup(
          io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions value) {
        if (fsGroupBuilder_ == null) {
          if (((bitField0_ & 0x00002000) == 0x00002000)
              && fsGroup_ != null
              && fsGroup_
                  != io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions
                      .getDefaultInstance()) {
            fsGroup_ =
                io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.newBuilder(fsGroup_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            fsGroup_ = value;
          }
          onChanged();
        } else {
          fsGroupBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00002000;
        return this;
      }
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      public Builder clearFsGroup() {
        if (fsGroupBuilder_ == null) {
          fsGroup_ = null;
          onChanged();
        } else {
          fsGroupBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00002000);
        return this;
      }
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.Builder
          getFsGroupBuilder() {
        bitField0_ |= 0x00002000;
        onChanged();
        return getFsGroupFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptionsOrBuilder
          getFsGroupOrBuilder() {
        if (fsGroupBuilder_ != null) {
          return fsGroupBuilder_.getMessageOrBuilder();
        } else {
          return fsGroup_ == null
              ? io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.getDefaultInstance()
              : fsGroup_;
        }
      }
      /**
       *
       *
       * <pre>
       * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1beta1.FSGroupStrategyOptions fsGroup = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions,
              io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.Builder,
              io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptionsOrBuilder>
          getFsGroupFieldBuilder() {
        if (fsGroupBuilder_ == null) {
          fsGroupBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions,
                  io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptions.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.FSGroupStrategyOptionsOrBuilder>(
                  getFsGroup(), getParentForChildren(), isClean());
          fsGroup_ = null;
        }
        return fsGroupBuilder_;
      }

      private boolean readOnlyRootFilesystem_;
      /**
       *
       *
       * <pre>
       * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
       * system.  If the container specifically requests to run with a non-read only root file system
       * the PSP should deny the pod.
       * If set to false the container may run with a read only root file system if it wishes but it
       * will not be forced to.
       * +optional
       * </pre>
       *
       * <code>optional bool readOnlyRootFilesystem = 14;</code>
       */
      public boolean hasReadOnlyRootFilesystem() {
        return ((bitField0_ & 0x00004000) == 0x00004000);
      }
      /**
       *
       *
       * <pre>
       * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
       * system.  If the container specifically requests to run with a non-read only root file system
       * the PSP should deny the pod.
       * If set to false the container may run with a read only root file system if it wishes but it
       * will not be forced to.
       * +optional
       * </pre>
       *
       * <code>optional bool readOnlyRootFilesystem = 14;</code>
       */
      public boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem_;
      }
      /**
       *
       *
       * <pre>
       * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
       * system.  If the container specifically requests to run with a non-read only root file system
       * the PSP should deny the pod.
       * If set to false the container may run with a read only root file system if it wishes but it
       * will not be forced to.
       * +optional
       * </pre>
       *
       * <code>optional bool readOnlyRootFilesystem = 14;</code>
       */
      public Builder setReadOnlyRootFilesystem(boolean value) {
        bitField0_ |= 0x00004000;
        readOnlyRootFilesystem_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
       * system.  If the container specifically requests to run with a non-read only root file system
       * the PSP should deny the pod.
       * If set to false the container may run with a read only root file system if it wishes but it
       * will not be forced to.
       * +optional
       * </pre>
       *
       * <code>optional bool readOnlyRootFilesystem = 14;</code>
       */
      public Builder clearReadOnlyRootFilesystem() {
        bitField0_ = (bitField0_ & ~0x00004000);
        readOnlyRootFilesystem_ = false;
        onChanged();
        return this;
      }

      private boolean defaultAllowPrivilegeEscalation_;
      /**
       *
       *
       * <pre>
       * defaultAllowPrivilegeEscalation controls the default setting for whether a
       * process can gain more privileges than its parent process.
       * +optional
       * </pre>
       *
       * <code>optional bool defaultAllowPrivilegeEscalation = 15;</code>
       */
      public boolean hasDefaultAllowPrivilegeEscalation() {
        return ((bitField0_ & 0x00008000) == 0x00008000);
      }
      /**
       *
       *
       * <pre>
       * defaultAllowPrivilegeEscalation controls the default setting for whether a
       * process can gain more privileges than its parent process.
       * +optional
       * </pre>
       *
       * <code>optional bool defaultAllowPrivilegeEscalation = 15;</code>
       */
      public boolean getDefaultAllowPrivilegeEscalation() {
        return defaultAllowPrivilegeEscalation_;
      }
      /**
       *
       *
       * <pre>
       * defaultAllowPrivilegeEscalation controls the default setting for whether a
       * process can gain more privileges than its parent process.
       * +optional
       * </pre>
       *
       * <code>optional bool defaultAllowPrivilegeEscalation = 15;</code>
       */
      public Builder setDefaultAllowPrivilegeEscalation(boolean value) {
        bitField0_ |= 0x00008000;
        defaultAllowPrivilegeEscalation_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * defaultAllowPrivilegeEscalation controls the default setting for whether a
       * process can gain more privileges than its parent process.
       * +optional
       * </pre>
       *
       * <code>optional bool defaultAllowPrivilegeEscalation = 15;</code>
       */
      public Builder clearDefaultAllowPrivilegeEscalation() {
        bitField0_ = (bitField0_ & ~0x00008000);
        defaultAllowPrivilegeEscalation_ = false;
        onChanged();
        return this;
      }

      private boolean allowPrivilegeEscalation_;
      /**
       *
       *
       * <pre>
       * allowPrivilegeEscalation determines if a pod can request to allow
       * privilege escalation. If unspecified, defaults to true.
       * +optional
       * </pre>
       *
       * <code>optional bool allowPrivilegeEscalation = 16;</code>
       */
      public boolean hasAllowPrivilegeEscalation() {
        return ((bitField0_ & 0x00010000) == 0x00010000);
      }
      /**
       *
       *
       * <pre>
       * allowPrivilegeEscalation determines if a pod can request to allow
       * privilege escalation. If unspecified, defaults to true.
       * +optional
       * </pre>
       *
       * <code>optional bool allowPrivilegeEscalation = 16;</code>
       */
      public boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation_;
      }
      /**
       *
       *
       * <pre>
       * allowPrivilegeEscalation determines if a pod can request to allow
       * privilege escalation. If unspecified, defaults to true.
       * +optional
       * </pre>
       *
       * <code>optional bool allowPrivilegeEscalation = 16;</code>
       */
      public Builder setAllowPrivilegeEscalation(boolean value) {
        bitField0_ |= 0x00010000;
        allowPrivilegeEscalation_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowPrivilegeEscalation determines if a pod can request to allow
       * privilege escalation. If unspecified, defaults to true.
       * +optional
       * </pre>
       *
       * <code>optional bool allowPrivilegeEscalation = 16;</code>
       */
      public Builder clearAllowPrivilegeEscalation() {
        bitField0_ = (bitField0_ & ~0x00010000);
        allowPrivilegeEscalation_ = false;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath>
          allowedHostPaths_ = java.util.Collections.emptyList();

      private void ensureAllowedHostPathsIsMutable() {
        if (!((bitField0_ & 0x00020000) == 0x00020000)) {
          allowedHostPaths_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath>(
                  allowedHostPaths_);
          bitField0_ |= 0x00020000;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath,
              io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder,
              io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder>
          allowedHostPathsBuilder_;

      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath>
          getAllowedHostPathsList() {
        if (allowedHostPathsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(allowedHostPaths_);
        } else {
          return allowedHostPathsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public int getAllowedHostPathsCount() {
        if (allowedHostPathsBuilder_ == null) {
          return allowedHostPaths_.size();
        } else {
          return allowedHostPathsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath getAllowedHostPaths(
          int index) {
        if (allowedHostPathsBuilder_ == null) {
          return allowedHostPaths_.get(index);
        } else {
          return allowedHostPathsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder setAllowedHostPaths(
          int index, io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath value) {
        if (allowedHostPathsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedHostPathsIsMutable();
          allowedHostPaths_.set(index, value);
          onChanged();
        } else {
          allowedHostPathsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder setAllowedHostPaths(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder builderForValue) {
        if (allowedHostPathsBuilder_ == null) {
          ensureAllowedHostPathsIsMutable();
          allowedHostPaths_.set(index, builderForValue.build());
          onChanged();
        } else {
          allowedHostPathsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder addAllowedHostPaths(
          io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath value) {
        if (allowedHostPathsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedHostPathsIsMutable();
          allowedHostPaths_.add(value);
          onChanged();
        } else {
          allowedHostPathsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder addAllowedHostPaths(
          int index, io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath value) {
        if (allowedHostPathsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedHostPathsIsMutable();
          allowedHostPaths_.add(index, value);
          onChanged();
        } else {
          allowedHostPathsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder addAllowedHostPaths(
          io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder builderForValue) {
        if (allowedHostPathsBuilder_ == null) {
          ensureAllowedHostPathsIsMutable();
          allowedHostPaths_.add(builderForValue.build());
          onChanged();
        } else {
          allowedHostPathsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder addAllowedHostPaths(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder builderForValue) {
        if (allowedHostPathsBuilder_ == null) {
          ensureAllowedHostPathsIsMutable();
          allowedHostPaths_.add(index, builderForValue.build());
          onChanged();
        } else {
          allowedHostPathsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder addAllAllowedHostPaths(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath>
              values) {
        if (allowedHostPathsBuilder_ == null) {
          ensureAllowedHostPathsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedHostPaths_);
          onChanged();
        } else {
          allowedHostPathsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder clearAllowedHostPaths() {
        if (allowedHostPathsBuilder_ == null) {
          allowedHostPaths_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00020000);
          onChanged();
        } else {
          allowedHostPathsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public Builder removeAllowedHostPaths(int index) {
        if (allowedHostPathsBuilder_ == null) {
          ensureAllowedHostPathsIsMutable();
          allowedHostPaths_.remove(index);
          onChanged();
        } else {
          allowedHostPathsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder
          getAllowedHostPathsBuilder(int index) {
        return getAllowedHostPathsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder
          getAllowedHostPathsOrBuilder(int index) {
        if (allowedHostPathsBuilder_ == null) {
          return allowedHostPaths_.get(index);
        } else {
          return allowedHostPathsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder>
          getAllowedHostPathsOrBuilderList() {
        if (allowedHostPathsBuilder_ != null) {
          return allowedHostPathsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(allowedHostPaths_);
        }
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder
          addAllowedHostPathsBuilder() {
        return getAllowedHostPathsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder
          addAllowedHostPathsBuilder(int index) {
        return getAllowedHostPathsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * allowedHostPaths is a white list of allowed host paths. Empty indicates
       * that all host paths may be used.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedHostPath allowedHostPaths = 17;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder>
          getAllowedHostPathsBuilderList() {
        return getAllowedHostPathsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath,
              io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder,
              io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder>
          getAllowedHostPathsFieldBuilder() {
        if (allowedHostPathsBuilder_ == null) {
          allowedHostPathsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath,
                  io.kubernetes.client.proto.V1beta1Policy.AllowedHostPath.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.AllowedHostPathOrBuilder>(
                  allowedHostPaths_,
                  ((bitField0_ & 0x00020000) == 0x00020000),
                  getParentForChildren(),
                  isClean());
          allowedHostPaths_ = null;
        }
        return allowedHostPathsBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume>
          allowedFlexVolumes_ = java.util.Collections.emptyList();

      private void ensureAllowedFlexVolumesIsMutable() {
        if (!((bitField0_ & 0x00040000) == 0x00040000)) {
          allowedFlexVolumes_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume>(
                  allowedFlexVolumes_);
          bitField0_ |= 0x00040000;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume,
              io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder,
              io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder>
          allowedFlexVolumesBuilder_;

      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume>
          getAllowedFlexVolumesList() {
        if (allowedFlexVolumesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(allowedFlexVolumes_);
        } else {
          return allowedFlexVolumesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public int getAllowedFlexVolumesCount() {
        if (allowedFlexVolumesBuilder_ == null) {
          return allowedFlexVolumes_.size();
        } else {
          return allowedFlexVolumesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume getAllowedFlexVolumes(
          int index) {
        if (allowedFlexVolumesBuilder_ == null) {
          return allowedFlexVolumes_.get(index);
        } else {
          return allowedFlexVolumesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder setAllowedFlexVolumes(
          int index, io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume value) {
        if (allowedFlexVolumesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedFlexVolumesIsMutable();
          allowedFlexVolumes_.set(index, value);
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder setAllowedFlexVolumes(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder builderForValue) {
        if (allowedFlexVolumesBuilder_ == null) {
          ensureAllowedFlexVolumesIsMutable();
          allowedFlexVolumes_.set(index, builderForValue.build());
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder addAllowedFlexVolumes(
          io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume value) {
        if (allowedFlexVolumesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedFlexVolumesIsMutable();
          allowedFlexVolumes_.add(value);
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder addAllowedFlexVolumes(
          int index, io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume value) {
        if (allowedFlexVolumesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedFlexVolumesIsMutable();
          allowedFlexVolumes_.add(index, value);
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder addAllowedFlexVolumes(
          io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder builderForValue) {
        if (allowedFlexVolumesBuilder_ == null) {
          ensureAllowedFlexVolumesIsMutable();
          allowedFlexVolumes_.add(builderForValue.build());
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder addAllowedFlexVolumes(
          int index,
          io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder builderForValue) {
        if (allowedFlexVolumesBuilder_ == null) {
          ensureAllowedFlexVolumesIsMutable();
          allowedFlexVolumes_.add(index, builderForValue.build());
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder addAllAllowedFlexVolumes(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume>
              values) {
        if (allowedFlexVolumesBuilder_ == null) {
          ensureAllowedFlexVolumesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedFlexVolumes_);
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder clearAllowedFlexVolumes() {
        if (allowedFlexVolumesBuilder_ == null) {
          allowedFlexVolumes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00040000);
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public Builder removeAllowedFlexVolumes(int index) {
        if (allowedFlexVolumesBuilder_ == null) {
          ensureAllowedFlexVolumesIsMutable();
          allowedFlexVolumes_.remove(index);
          onChanged();
        } else {
          allowedFlexVolumesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder
          getAllowedFlexVolumesBuilder(int index) {
        return getAllowedFlexVolumesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder
          getAllowedFlexVolumesOrBuilder(int index) {
        if (allowedFlexVolumesBuilder_ == null) {
          return allowedFlexVolumes_.get(index);
        } else {
          return allowedFlexVolumesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder>
          getAllowedFlexVolumesOrBuilderList() {
        if (allowedFlexVolumesBuilder_ != null) {
          return allowedFlexVolumesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(allowedFlexVolumes_);
        }
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder
          addAllowedFlexVolumesBuilder() {
        return getAllowedFlexVolumesFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder
          addAllowedFlexVolumesBuilder(int index) {
        return getAllowedFlexVolumesFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
       * Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes
       * is allowed in the "volumes" field.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.AllowedFlexVolume allowedFlexVolumes = 18;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder>
          getAllowedFlexVolumesBuilderList() {
        return getAllowedFlexVolumesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume,
              io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder,
              io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder>
          getAllowedFlexVolumesFieldBuilder() {
        if (allowedFlexVolumesBuilder_ == null) {
          allowedFlexVolumesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume,
                  io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolume.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.AllowedFlexVolumeOrBuilder>(
                  allowedFlexVolumes_,
                  ((bitField0_ & 0x00040000) == 0x00040000),
                  getParentForChildren(),
                  isClean());
          allowedFlexVolumes_ = null;
        }
        return allowedFlexVolumesBuilder_;
      }

      private com.google.protobuf.LazyStringList allowedUnsafeSysctls_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureAllowedUnsafeSysctlsIsMutable() {
        if (!((bitField0_ & 0x00080000) == 0x00080000)) {
          allowedUnsafeSysctls_ =
              new com.google.protobuf.LazyStringArrayList(allowedUnsafeSysctls_);
          bitField0_ |= 0x00080000;
        }
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public com.google.protobuf.ProtocolStringList getAllowedUnsafeSysctlsList() {
        return allowedUnsafeSysctls_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public int getAllowedUnsafeSysctlsCount() {
        return allowedUnsafeSysctls_.size();
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public java.lang.String getAllowedUnsafeSysctls(int index) {
        return allowedUnsafeSysctls_.get(index);
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public com.google.protobuf.ByteString getAllowedUnsafeSysctlsBytes(int index) {
        return allowedUnsafeSysctls_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public Builder setAllowedUnsafeSysctls(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedUnsafeSysctlsIsMutable();
        allowedUnsafeSysctls_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public Builder addAllowedUnsafeSysctls(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedUnsafeSysctlsIsMutable();
        allowedUnsafeSysctls_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public Builder addAllAllowedUnsafeSysctls(java.lang.Iterable<java.lang.String> values) {
        ensureAllowedUnsafeSysctlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedUnsafeSysctls_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public Builder clearAllowedUnsafeSysctls() {
        allowedUnsafeSysctls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00080000);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed.
       * Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
       * Examples:
       * e.g. "foo/&#42;" allows "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedUnsafeSysctls = 19;</code>
       */
      public Builder addAllowedUnsafeSysctlsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedUnsafeSysctlsIsMutable();
        allowedUnsafeSysctls_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList forbiddenSysctls_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureForbiddenSysctlsIsMutable() {
        if (!((bitField0_ & 0x00100000) == 0x00100000)) {
          forbiddenSysctls_ = new com.google.protobuf.LazyStringArrayList(forbiddenSysctls_);
          bitField0_ |= 0x00100000;
        }
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public com.google.protobuf.ProtocolStringList getForbiddenSysctlsList() {
        return forbiddenSysctls_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public int getForbiddenSysctlsCount() {
        return forbiddenSysctls_.size();
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public java.lang.String getForbiddenSysctls(int index) {
        return forbiddenSysctls_.get(index);
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public com.google.protobuf.ByteString getForbiddenSysctlsBytes(int index) {
        return forbiddenSysctls_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public Builder setForbiddenSysctls(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureForbiddenSysctlsIsMutable();
        forbiddenSysctls_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public Builder addForbiddenSysctls(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureForbiddenSysctlsIsMutable();
        forbiddenSysctls_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public Builder addAllForbiddenSysctls(java.lang.Iterable<java.lang.String> values) {
        ensureForbiddenSysctlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, forbiddenSysctls_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public Builder clearForbiddenSysctls() {
        forbiddenSysctls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00100000);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
       * Each entry is either a plain sysctl name or ends in "*" in which case it is considered
       * as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
       * Examples:
       * e.g. "foo/&#42;" forbids "foo/bar", "foo/baz", etc.
       * e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
       * +optional
       * </pre>
       *
       * <code>repeated string forbiddenSysctls = 20;</code>
       */
      public Builder addForbiddenSysctlsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureForbiddenSysctlsIsMutable();
        forbiddenSysctls_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList allowedProcMountTypes_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureAllowedProcMountTypesIsMutable() {
        if (!((bitField0_ & 0x00200000) == 0x00200000)) {
          allowedProcMountTypes_ =
              new com.google.protobuf.LazyStringArrayList(allowedProcMountTypes_);
          bitField0_ |= 0x00200000;
        }
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public com.google.protobuf.ProtocolStringList getAllowedProcMountTypesList() {
        return allowedProcMountTypes_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public int getAllowedProcMountTypesCount() {
        return allowedProcMountTypes_.size();
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public java.lang.String getAllowedProcMountTypes(int index) {
        return allowedProcMountTypes_.get(index);
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public com.google.protobuf.ByteString getAllowedProcMountTypesBytes(int index) {
        return allowedProcMountTypes_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public Builder setAllowedProcMountTypes(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedProcMountTypesIsMutable();
        allowedProcMountTypes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public Builder addAllowedProcMountTypes(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedProcMountTypesIsMutable();
        allowedProcMountTypes_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public Builder addAllAllowedProcMountTypes(java.lang.Iterable<java.lang.String> values) {
        ensureAllowedProcMountTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedProcMountTypes_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public Builder clearAllowedProcMountTypes() {
        allowedProcMountTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00200000);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
       * Empty or nil indicates that only the DefaultProcMountType may be used.
       * This requires the ProcMountType feature flag to be enabled.
       * +optional
       * </pre>
       *
       * <code>repeated string allowedProcMountTypes = 21;</code>
       */
      public Builder addAllowedProcMountTypesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedProcMountTypesIsMutable();
        allowedProcMountTypes_.add(value);
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.PodSecurityPolicySpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.PodSecurityPolicySpec)
    private static final io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodSecurityPolicySpec> PARSER =
        new com.google.protobuf.AbstractParser<PodSecurityPolicySpec>() {
          @java.lang.Override
          public PodSecurityPolicySpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodSecurityPolicySpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodSecurityPolicySpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodSecurityPolicySpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.PodSecurityPolicySpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RunAsGroupStrategyOptionsOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    boolean hasRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    java.lang.String getRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    com.google.protobuf.ByteString getRuleBytes();

    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index);
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    int getRangesCount();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
        getRangesOrBuilderList();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions}
   */
  public static final class RunAsGroupStrategyOptions extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions)
      RunAsGroupStrategyOptionsOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RunAsGroupStrategyOptions.newBuilder() to construct.
    private RunAsGroupStrategyOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RunAsGroupStrategyOptions() {
      rule_ = "";
      ranges_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RunAsGroupStrategyOptions(
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
                rule_ = bs;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  ranges_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.IDRange>();
                  mutable_bitField0_ |= 0x00000002;
                }
                ranges_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.IDRange.PARSER,
                        extensionRegistry));
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
          ranges_ = java.util.Collections.unmodifiableList(ranges_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.class,
              io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.Builder.class);
    }

    private int bitField0_;
    public static final int RULE_FIELD_NUMBER = 1;
    private volatile java.lang.Object rule_;
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public java.lang.String getRule() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rule_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public com.google.protobuf.ByteString getRuleBytes() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RANGES_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> ranges_;
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList() {
      return ranges_;
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
        getRangesOrBuilderList() {
      return ranges_;
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public int getRangesCount() {
      return ranges_.size();
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index) {
      return ranges_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(int index) {
      return ranges_.get(index);
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rule_);
      }
      for (int i = 0; i < ranges_.size(); i++) {
        output.writeMessage(2, ranges_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rule_);
      }
      for (int i = 0; i < ranges_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, ranges_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions other =
          (io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions) obj;

      boolean result = true;
      result = result && (hasRule() == other.hasRule());
      if (hasRule()) {
        result = result && getRule().equals(other.getRule());
      }
      result = result && getRangesList().equals(other.getRangesList());
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
      if (hasRule()) {
        hash = (37 * hash) + RULE_FIELD_NUMBER;
        hash = (53 * hash) + getRule().hashCode();
      }
      if (getRangesCount() > 0) {
        hash = (37 * hash) + RANGES_FIELD_NUMBER;
        hash = (53 * hash) + getRangesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions prototype) {
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
     * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions)
        io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.class,
                io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getRangesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        rule_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (rangesBuilder_ == null) {
          ranges_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          rangesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions build() {
        io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions result =
            new io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rule_ = rule_;
        if (rangesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            ranges_ = java.util.Collections.unmodifiableList(ranges_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.ranges_ = ranges_;
        } else {
          result.ranges_ = rangesBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
                .getDefaultInstance()) return this;
        if (other.hasRule()) {
          bitField0_ |= 0x00000001;
          rule_ = other.rule_;
          onChanged();
        }
        if (rangesBuilder_ == null) {
          if (!other.ranges_.isEmpty()) {
            if (ranges_.isEmpty()) {
              ranges_ = other.ranges_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRangesIsMutable();
              ranges_.addAll(other.ranges_);
            }
            onChanged();
          }
        } else {
          if (!other.ranges_.isEmpty()) {
            if (rangesBuilder_.isEmpty()) {
              rangesBuilder_.dispose();
              rangesBuilder_ = null;
              ranges_ = other.ranges_;
              bitField0_ = (bitField0_ & ~0x00000002);
              rangesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getRangesFieldBuilder()
                      : null;
            } else {
              rangesBuilder_.addAllMessages(other.ranges_);
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
        io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object rule_ = "";
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public boolean hasRule() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public java.lang.String getRule() {
        java.lang.Object ref = rule_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            rule_ = s;
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
       * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public com.google.protobuf.ByteString getRuleBytes() {
        java.lang.Object ref = rule_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          rule_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRule(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder clearRule() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rule_ = getDefaultInstance().getRule();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRuleBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> ranges_ =
          java.util.Collections.emptyList();

      private void ensureRangesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          ranges_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.IDRange>(ranges_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.IDRange,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          rangesBuilder_;

      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList() {
        if (rangesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ranges_);
        } else {
          return rangesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public int getRangesCount() {
        if (rangesBuilder_ == null) {
          return ranges_.size();
        } else {
          return rangesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index) {
        if (rangesBuilder_ == null) {
          return ranges_.get(index);
        } else {
          return rangesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder setRanges(int index, io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.set(index, value);
          onChanged();
        } else {
          rangesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder setRanges(
          int index, io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.set(index, builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.add(value);
          onChanged();
        } else {
          rangesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(int index, io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.add(index, value);
          onChanged();
        } else {
          rangesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(
          io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.add(builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(
          int index, io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.add(index, builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addAllRanges(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.IDRange> values) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ranges_);
          onChanged();
        } else {
          rangesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder clearRanges() {
        if (rangesBuilder_ == null) {
          ranges_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          rangesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder removeRanges(int index) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.remove(index);
          onChanged();
        } else {
          rangesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder getRangesBuilder(int index) {
        return getRangesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(
          int index) {
        if (rangesBuilder_ == null) {
          return ranges_.get(index);
        } else {
          return rangesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          getRangesOrBuilderList() {
        if (rangesBuilder_ != null) {
          return rangesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ranges_);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder addRangesBuilder() {
        return getRangesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder addRangesBuilder(int index) {
        return getRangesFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder>
          getRangesBuilderList() {
        return getRangesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.IDRange,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          getRangesFieldBuilder() {
        if (rangesBuilder_ == null) {
          rangesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.IDRange,
                  io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>(
                  ranges_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          ranges_ = null;
        }
        return rangesBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.RunAsGroupStrategyOptions)
    private static final io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RunAsGroupStrategyOptions> PARSER =
        new com.google.protobuf.AbstractParser<RunAsGroupStrategyOptions>() {
          @java.lang.Override
          public RunAsGroupStrategyOptions parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RunAsGroupStrategyOptions(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RunAsGroupStrategyOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RunAsGroupStrategyOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.RunAsGroupStrategyOptions
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RunAsUserStrategyOptionsOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    boolean hasRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    java.lang.String getRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    com.google.protobuf.ByteString getRuleBytes();

    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index);
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    int getRangesCount();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
        getRangesOrBuilderList();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions}
   */
  public static final class RunAsUserStrategyOptions extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions)
      RunAsUserStrategyOptionsOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RunAsUserStrategyOptions.newBuilder() to construct.
    private RunAsUserStrategyOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RunAsUserStrategyOptions() {
      rule_ = "";
      ranges_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RunAsUserStrategyOptions(
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
                rule_ = bs;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  ranges_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.IDRange>();
                  mutable_bitField0_ |= 0x00000002;
                }
                ranges_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.IDRange.PARSER,
                        extensionRegistry));
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
          ranges_ = java.util.Collections.unmodifiableList(ranges_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.class,
              io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.Builder.class);
    }

    private int bitField0_;
    public static final int RULE_FIELD_NUMBER = 1;
    private volatile java.lang.Object rule_;
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public java.lang.String getRule() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rule_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public com.google.protobuf.ByteString getRuleBytes() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RANGES_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> ranges_;
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList() {
      return ranges_;
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
        getRangesOrBuilderList() {
      return ranges_;
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public int getRangesCount() {
      return ranges_.size();
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index) {
      return ranges_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
     * then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(int index) {
      return ranges_.get(index);
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rule_);
      }
      for (int i = 0; i < ranges_.size(); i++) {
        output.writeMessage(2, ranges_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rule_);
      }
      for (int i = 0; i < ranges_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, ranges_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions other =
          (io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions) obj;

      boolean result = true;
      result = result && (hasRule() == other.hasRule());
      if (hasRule()) {
        result = result && getRule().equals(other.getRule());
      }
      result = result && getRangesList().equals(other.getRangesList());
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
      if (hasRule()) {
        hash = (37 * hash) + RULE_FIELD_NUMBER;
        hash = (53 * hash) + getRule().hashCode();
      }
      if (getRangesCount() > 0) {
        hash = (37 * hash) + RANGES_FIELD_NUMBER;
        hash = (53 * hash) + getRangesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions prototype) {
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
     * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions)
        io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.class,
                io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getRangesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        rule_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (rangesBuilder_ == null) {
          ranges_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          rangesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions build() {
        io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions result =
            new io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rule_ = rule_;
        if (rangesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            ranges_ = java.util.Collections.unmodifiableList(ranges_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.ranges_ = ranges_;
        } else {
          result.ranges_ = rangesBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
                .getDefaultInstance()) return this;
        if (other.hasRule()) {
          bitField0_ |= 0x00000001;
          rule_ = other.rule_;
          onChanged();
        }
        if (rangesBuilder_ == null) {
          if (!other.ranges_.isEmpty()) {
            if (ranges_.isEmpty()) {
              ranges_ = other.ranges_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRangesIsMutable();
              ranges_.addAll(other.ranges_);
            }
            onChanged();
          }
        } else {
          if (!other.ranges_.isEmpty()) {
            if (rangesBuilder_.isEmpty()) {
              rangesBuilder_.dispose();
              rangesBuilder_ = null;
              ranges_ = other.ranges_;
              bitField0_ = (bitField0_ & ~0x00000002);
              rangesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getRangesFieldBuilder()
                      : null;
            } else {
              rangesBuilder_.addAllMessages(other.ranges_);
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
        io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object rule_ = "";
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public boolean hasRule() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public java.lang.String getRule() {
        java.lang.Object ref = rule_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            rule_ = s;
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
       * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public com.google.protobuf.ByteString getRuleBytes() {
        java.lang.Object ref = rule_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          rule_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRule(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder clearRule() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rule_ = getDefaultInstance().getRule();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRuleBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> ranges_ =
          java.util.Collections.emptyList();

      private void ensureRangesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          ranges_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.IDRange>(ranges_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.IDRange,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          rangesBuilder_;

      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList() {
        if (rangesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ranges_);
        } else {
          return rangesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public int getRangesCount() {
        if (rangesBuilder_ == null) {
          return ranges_.size();
        } else {
          return rangesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index) {
        if (rangesBuilder_ == null) {
          return ranges_.get(index);
        } else {
          return rangesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder setRanges(int index, io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.set(index, value);
          onChanged();
        } else {
          rangesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder setRanges(
          int index, io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.set(index, builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.add(value);
          onChanged();
        } else {
          rangesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(int index, io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.add(index, value);
          onChanged();
        } else {
          rangesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(
          io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.add(builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(
          int index, io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.add(index, builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addAllRanges(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.IDRange> values) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ranges_);
          onChanged();
        } else {
          rangesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder clearRanges() {
        if (rangesBuilder_ == null) {
          ranges_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          rangesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder removeRanges(int index) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.remove(index);
          onChanged();
        } else {
          rangesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder getRangesBuilder(int index) {
        return getRangesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(
          int index) {
        if (rangesBuilder_ == null) {
          return ranges_.get(index);
        } else {
          return rangesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          getRangesOrBuilderList() {
        if (rangesBuilder_ != null) {
          return rangesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ranges_);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder addRangesBuilder() {
        return getRangesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder addRangesBuilder(int index) {
        return getRangesFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid
       * then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder>
          getRangesBuilderList() {
        return getRangesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.IDRange,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          getRangesFieldBuilder() {
        if (rangesBuilder_ == null) {
          rangesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.IDRange,
                  io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>(
                  ranges_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          ranges_ = null;
        }
        return rangesBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.RunAsUserStrategyOptions)
    private static final io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RunAsUserStrategyOptions> PARSER =
        new com.google.protobuf.AbstractParser<RunAsUserStrategyOptions>() {
          @java.lang.Override
          public RunAsUserStrategyOptions parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RunAsUserStrategyOptions(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RunAsUserStrategyOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RunAsUserStrategyOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.RunAsUserStrategyOptions
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SELinuxStrategyOptionsOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.SELinuxStrategyOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    boolean hasRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    java.lang.String getRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    com.google.protobuf.ByteString getRuleBytes();

    /**
     *
     *
     * <pre>
     * seLinuxOptions required to run as; required for MustRunAs
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
     */
    boolean hasSeLinuxOptions();
    /**
     *
     *
     * <pre>
     * seLinuxOptions required to run as; required for MustRunAs
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
     */
    io.kubernetes.client.proto.V1.SELinuxOptions getSeLinuxOptions();
    /**
     *
     *
     * <pre>
     * seLinuxOptions required to run as; required for MustRunAs
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
     */
    io.kubernetes.client.proto.V1.SELinuxOptionsOrBuilder getSeLinuxOptionsOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.SELinuxStrategyOptions}
   */
  public static final class SELinuxStrategyOptions extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.SELinuxStrategyOptions)
      SELinuxStrategyOptionsOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SELinuxStrategyOptions.newBuilder() to construct.
    private SELinuxStrategyOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SELinuxStrategyOptions() {
      rule_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SELinuxStrategyOptions(
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
                rule_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1.SELinuxOptions.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = seLinuxOptions_.toBuilder();
                }
                seLinuxOptions_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1.SELinuxOptions.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(seLinuxOptions_);
                  seLinuxOptions_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.class,
              io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.Builder.class);
    }

    private int bitField0_;
    public static final int RULE_FIELD_NUMBER = 1;
    private volatile java.lang.Object rule_;
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public java.lang.String getRule() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rule_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate the allowable labels that may be set.
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public com.google.protobuf.ByteString getRuleBytes() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SELINUXOPTIONS_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1.SELinuxOptions seLinuxOptions_;
    /**
     *
     *
     * <pre>
     * seLinuxOptions required to run as; required for MustRunAs
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
     */
    public boolean hasSeLinuxOptions() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * seLinuxOptions required to run as; required for MustRunAs
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
     */
    public io.kubernetes.client.proto.V1.SELinuxOptions getSeLinuxOptions() {
      return seLinuxOptions_ == null
          ? io.kubernetes.client.proto.V1.SELinuxOptions.getDefaultInstance()
          : seLinuxOptions_;
    }
    /**
     *
     *
     * <pre>
     * seLinuxOptions required to run as; required for MustRunAs
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
     */
    public io.kubernetes.client.proto.V1.SELinuxOptionsOrBuilder getSeLinuxOptionsOrBuilder() {
      return seLinuxOptions_ == null
          ? io.kubernetes.client.proto.V1.SELinuxOptions.getDefaultInstance()
          : seLinuxOptions_;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rule_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSeLinuxOptions());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rule_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSeLinuxOptions());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions other =
          (io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions) obj;

      boolean result = true;
      result = result && (hasRule() == other.hasRule());
      if (hasRule()) {
        result = result && getRule().equals(other.getRule());
      }
      result = result && (hasSeLinuxOptions() == other.hasSeLinuxOptions());
      if (hasSeLinuxOptions()) {
        result = result && getSeLinuxOptions().equals(other.getSeLinuxOptions());
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
      if (hasRule()) {
        hash = (37 * hash) + RULE_FIELD_NUMBER;
        hash = (53 * hash) + getRule().hashCode();
      }
      if (hasSeLinuxOptions()) {
        hash = (37 * hash) + SELINUXOPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getSeLinuxOptions().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions prototype) {
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
     * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.SELinuxStrategyOptions}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.SELinuxStrategyOptions)
        io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.class,
                io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getSeLinuxOptionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        rule_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (seLinuxOptionsBuilder_ == null) {
          seLinuxOptions_ = null;
        } else {
          seLinuxOptionsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions build() {
        io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions result =
            new io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rule_ = rule_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (seLinuxOptionsBuilder_ == null) {
          result.seLinuxOptions_ = seLinuxOptions_;
        } else {
          result.seLinuxOptions_ = seLinuxOptionsBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions) {
          return mergeFrom((io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions.getDefaultInstance())
          return this;
        if (other.hasRule()) {
          bitField0_ |= 0x00000001;
          rule_ = other.rule_;
          onChanged();
        }
        if (other.hasSeLinuxOptions()) {
          mergeSeLinuxOptions(other.getSeLinuxOptions());
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
        io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object rule_ = "";
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public boolean hasRule() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public java.lang.String getRule() {
        java.lang.Object ref = rule_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            rule_ = s;
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
       * rule is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public com.google.protobuf.ByteString getRuleBytes() {
        java.lang.Object ref = rule_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          rule_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRule(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder clearRule() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rule_ = getDefaultInstance().getRule();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate the allowable labels that may be set.
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRuleBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1.SELinuxOptions seLinuxOptions_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1.SELinuxOptions,
              io.kubernetes.client.proto.V1.SELinuxOptions.Builder,
              io.kubernetes.client.proto.V1.SELinuxOptionsOrBuilder>
          seLinuxOptionsBuilder_;
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      public boolean hasSeLinuxOptions() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      public io.kubernetes.client.proto.V1.SELinuxOptions getSeLinuxOptions() {
        if (seLinuxOptionsBuilder_ == null) {
          return seLinuxOptions_ == null
              ? io.kubernetes.client.proto.V1.SELinuxOptions.getDefaultInstance()
              : seLinuxOptions_;
        } else {
          return seLinuxOptionsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      public Builder setSeLinuxOptions(io.kubernetes.client.proto.V1.SELinuxOptions value) {
        if (seLinuxOptionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          seLinuxOptions_ = value;
          onChanged();
        } else {
          seLinuxOptionsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      public Builder setSeLinuxOptions(
          io.kubernetes.client.proto.V1.SELinuxOptions.Builder builderForValue) {
        if (seLinuxOptionsBuilder_ == null) {
          seLinuxOptions_ = builderForValue.build();
          onChanged();
        } else {
          seLinuxOptionsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      public Builder mergeSeLinuxOptions(io.kubernetes.client.proto.V1.SELinuxOptions value) {
        if (seLinuxOptionsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && seLinuxOptions_ != null
              && seLinuxOptions_
                  != io.kubernetes.client.proto.V1.SELinuxOptions.getDefaultInstance()) {
            seLinuxOptions_ =
                io.kubernetes.client.proto.V1.SELinuxOptions.newBuilder(seLinuxOptions_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            seLinuxOptions_ = value;
          }
          onChanged();
        } else {
          seLinuxOptionsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      public Builder clearSeLinuxOptions() {
        if (seLinuxOptionsBuilder_ == null) {
          seLinuxOptions_ = null;
          onChanged();
        } else {
          seLinuxOptionsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      public io.kubernetes.client.proto.V1.SELinuxOptions.Builder getSeLinuxOptionsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSeLinuxOptionsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      public io.kubernetes.client.proto.V1.SELinuxOptionsOrBuilder getSeLinuxOptionsOrBuilder() {
        if (seLinuxOptionsBuilder_ != null) {
          return seLinuxOptionsBuilder_.getMessageOrBuilder();
        } else {
          return seLinuxOptions_ == null
              ? io.kubernetes.client.proto.V1.SELinuxOptions.getDefaultInstance()
              : seLinuxOptions_;
        }
      }
      /**
       *
       *
       * <pre>
       * seLinuxOptions required to run as; required for MustRunAs
       * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.SELinuxOptions seLinuxOptions = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1.SELinuxOptions,
              io.kubernetes.client.proto.V1.SELinuxOptions.Builder,
              io.kubernetes.client.proto.V1.SELinuxOptionsOrBuilder>
          getSeLinuxOptionsFieldBuilder() {
        if (seLinuxOptionsBuilder_ == null) {
          seLinuxOptionsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1.SELinuxOptions,
                  io.kubernetes.client.proto.V1.SELinuxOptions.Builder,
                  io.kubernetes.client.proto.V1.SELinuxOptionsOrBuilder>(
                  getSeLinuxOptions(), getParentForChildren(), isClean());
          seLinuxOptions_ = null;
        }
        return seLinuxOptionsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.SELinuxStrategyOptions)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.SELinuxStrategyOptions)
    private static final io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SELinuxStrategyOptions> PARSER =
        new com.google.protobuf.AbstractParser<SELinuxStrategyOptions>() {
          @java.lang.Override
          public SELinuxStrategyOptions parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SELinuxStrategyOptions(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SELinuxStrategyOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SELinuxStrategyOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.SELinuxStrategyOptions
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SupplementalGroupsStrategyOptionsOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    boolean hasRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    java.lang.String getRule();
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    com.google.protobuf.ByteString getRuleBytes();

    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index);
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    int getRangesCount();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
        getRangesOrBuilderList();
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions}
   */
  public static final class SupplementalGroupsStrategyOptions
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions)
      SupplementalGroupsStrategyOptionsOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SupplementalGroupsStrategyOptions.newBuilder() to construct.
    private SupplementalGroupsStrategyOptions(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SupplementalGroupsStrategyOptions() {
      rule_ = "";
      ranges_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private SupplementalGroupsStrategyOptions(
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
                rule_ = bs;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  ranges_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.IDRange>();
                  mutable_bitField0_ |= 0x00000002;
                }
                ranges_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1beta1Policy.IDRange.PARSER,
                        extensionRegistry));
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
          ranges_ = java.util.Collections.unmodifiableList(ranges_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1beta1Policy
          .internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.class,
              io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.Builder
                  .class);
    }

    private int bitField0_;
    public static final int RULE_FIELD_NUMBER = 1;
    private volatile java.lang.Object rule_;
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public java.lang.String getRule() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rule_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * +optional
     * </pre>
     *
     * <code>optional string rule = 1;</code>
     */
    public com.google.protobuf.ByteString getRuleBytes() {
      java.lang.Object ref = rule_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RANGES_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> ranges_;
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList() {
      return ranges_;
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
        getRangesOrBuilderList() {
      return ranges_;
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public int getRangesCount() {
      return ranges_.size();
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index) {
      return ranges_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
     * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
     */
    public io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(int index) {
      return ranges_.get(index);
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rule_);
      }
      for (int i = 0; i < ranges_.size(); i++) {
        output.writeMessage(2, ranges_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rule_);
      }
      for (int i = 0; i < ranges_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, ranges_.get(i));
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
      if (!(obj
          instanceof io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions other =
          (io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions) obj;

      boolean result = true;
      result = result && (hasRule() == other.hasRule());
      if (hasRule()) {
        result = result && getRule().equals(other.getRule());
      }
      result = result && getRangesList().equals(other.getRangesList());
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
      if (hasRule()) {
        hash = (37 * hash) + RULE_FIELD_NUMBER;
        hash = (53 * hash) + getRule().hashCode();
      }
      if (getRangesCount() > 0) {
        hash = (37 * hash) + RANGES_FIELD_NUMBER;
        hash = (53 * hash) + getRangesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions prototype) {
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
     * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions)
        io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.class,
                io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getRangesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        rule_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (rangesBuilder_ == null) {
          ranges_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          rangesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1beta1Policy
            .internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions build() {
        io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
          buildPartial() {
        io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions result =
            new io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rule_ = rule_;
        if (rangesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            ranges_ = java.util.Collections.unmodifiableList(ranges_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.ranges_ = ranges_;
        } else {
          result.ranges_ = rangesBuilder_.build();
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
        if (other
            instanceof io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions other) {
        if (other
            == io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
                .getDefaultInstance()) return this;
        if (other.hasRule()) {
          bitField0_ |= 0x00000001;
          rule_ = other.rule_;
          onChanged();
        }
        if (rangesBuilder_ == null) {
          if (!other.ranges_.isEmpty()) {
            if (ranges_.isEmpty()) {
              ranges_ = other.ranges_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRangesIsMutable();
              ranges_.addAll(other.ranges_);
            }
            onChanged();
          }
        } else {
          if (!other.ranges_.isEmpty()) {
            if (rangesBuilder_.isEmpty()) {
              rangesBuilder_.dispose();
              rangesBuilder_ = null;
              ranges_ = other.ranges_;
              bitField0_ = (bitField0_ & ~0x00000002);
              rangesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getRangesFieldBuilder()
                      : null;
            } else {
              rangesBuilder_.addAllMessages(other.ranges_);
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
        io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object rule_ = "";
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public boolean hasRule() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public java.lang.String getRule() {
        java.lang.Object ref = rule_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            rule_ = s;
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
       * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public com.google.protobuf.ByteString getRuleBytes() {
        java.lang.Object ref = rule_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          rule_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRule(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder clearRule() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rule_ = getDefaultInstance().getRule();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
       * +optional
       * </pre>
       *
       * <code>optional string rule = 1;</code>
       */
      public Builder setRuleBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rule_ = value;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> ranges_ =
          java.util.Collections.emptyList();

      private void ensureRangesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          ranges_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1beta1Policy.IDRange>(ranges_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.IDRange,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          rangesBuilder_;

      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange> getRangesList() {
        if (rangesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ranges_);
        } else {
          return rangesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public int getRangesCount() {
        if (rangesBuilder_ == null) {
          return ranges_.size();
        } else {
          return rangesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange getRanges(int index) {
        if (rangesBuilder_ == null) {
          return ranges_.get(index);
        } else {
          return rangesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder setRanges(int index, io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.set(index, value);
          onChanged();
        } else {
          rangesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder setRanges(
          int index, io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.set(index, builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.add(value);
          onChanged();
        } else {
          rangesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(int index, io.kubernetes.client.proto.V1beta1Policy.IDRange value) {
        if (rangesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRangesIsMutable();
          ranges_.add(index, value);
          onChanged();
        } else {
          rangesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(
          io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.add(builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addRanges(
          int index, io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder builderForValue) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.add(index, builderForValue.build());
          onChanged();
        } else {
          rangesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder addAllRanges(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1beta1Policy.IDRange> values) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ranges_);
          onChanged();
        } else {
          rangesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder clearRanges() {
        if (rangesBuilder_ == null) {
          ranges_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          rangesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public Builder removeRanges(int index) {
        if (rangesBuilder_ == null) {
          ensureRangesIsMutable();
          ranges_.remove(index);
          onChanged();
        } else {
          rangesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder getRangesBuilder(int index) {
        return getRangesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder getRangesOrBuilder(
          int index) {
        if (rangesBuilder_ == null) {
          return ranges_.get(index);
        } else {
          return rangesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          getRangesOrBuilderList() {
        if (rangesBuilder_ != null) {
          return rangesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ranges_);
        }
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder addRangesBuilder() {
        return getRangesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder addRangesBuilder(int index) {
        return getRangesFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1beta1Policy.IDRange.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
       * supplemental group then supply a single range with the same start and end. Required for MustRunAs.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1beta1.IDRange ranges = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder>
          getRangesBuilderList() {
        return getRangesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1beta1Policy.IDRange,
              io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
              io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>
          getRangesFieldBuilder() {
        if (rangesBuilder_ == null) {
          rangesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1beta1Policy.IDRange,
                  io.kubernetes.client.proto.V1beta1Policy.IDRange.Builder,
                  io.kubernetes.client.proto.V1beta1Policy.IDRangeOrBuilder>(
                  ranges_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          ranges_ = null;
        }
        return rangesBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1beta1.SupplementalGroupsStrategyOptions)
    private static final io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions();
    }

    public static io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<SupplementalGroupsStrategyOptions> PARSER =
        new com.google.protobuf.AbstractParser<SupplementalGroupsStrategyOptions>() {
          @java.lang.Override
          public SupplementalGroupsStrategyOptions parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new SupplementalGroupsStrategyOptions(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<SupplementalGroupsStrategyOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SupplementalGroupsStrategyOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1beta1Policy.SupplementalGroupsStrategyOptions
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_Eviction_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_Eviction_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_HostPortRange_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_HostPortRange_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_IDRange_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_IDRange_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_DisruptedPodsEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_DisruptedPodsEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)k8s.io/api/policy/v1beta1/generated.pr"
          + "oto\022\031k8s.io.api.policy.v1beta1\032\"k8s.io/a"
          + "pi/core/v1/generated.proto\0324k8s.io/apima"
          + "chinery/pkg/apis/meta/v1/generated.proto"
          + "\032/k8s.io/apimachinery/pkg/runtime/genera"
          + "ted.proto\0326k8s.io/apimachinery/pkg/runti"
          + "me/schema/generated.proto\0323k8s.io/apimac"
          + "hinery/pkg/util/intstr/generated.proto\"#"
          + "\n\021AllowedFlexVolume\022\016\n\006driver\030\001 \001(\t\"7\n\017A"
          + "llowedHostPath\022\022\n\npathPrefix\030\001 \001(\t\022\020\n\010re"
          + "adOnly\030\002 \001(\010\"\232\001\n\010Eviction\022B\n\010metadata\030\001 "
          + "\001(\01320.k8s.io.apimachinery.pkg.apis.meta."
          + "v1.ObjectMeta\022J\n\rdeleteOptions\030\002 \001(\01323.k"
          + "8s.io.apimachinery.pkg.apis.meta.v1.Dele"
          + "teOptions\"Z\n\026FSGroupStrategyOptions\022\014\n\004r"
          + "ule\030\001 \001(\t\0222\n\006ranges\030\002 \003(\0132\".k8s.io.api.p"
          + "olicy.v1beta1.IDRange\")\n\rHostPortRange\022\013"
          + "\n\003min\030\001 \001(\005\022\013\n\003max\030\002 \001(\005\"#\n\007IDRange\022\013\n\003m"
          + "in\030\001 \001(\003\022\013\n\003max\030\002 \001(\003\"\341\001\n\023PodDisruptionB"
          + "udget\022B\n\010metadata\030\001 \001(\01320.k8s.io.apimach"
          + "inery.pkg.apis.meta.v1.ObjectMeta\022@\n\004spe"
          + "c\030\002 \001(\01322.k8s.io.api.policy.v1beta1.PodD"
          + "isruptionBudgetSpec\022D\n\006status\030\003 \001(\01324.k8"
          + "s.io.api.policy.v1beta1.PodDisruptionBud"
          + "getStatus\"\232\001\n\027PodDisruptionBudgetList\022@\n"
          + "\010metadata\030\001 \001(\0132..k8s.io.apimachinery.pk"
          + "g.apis.meta.v1.ListMeta\022=\n\005items\030\002 \003(\0132."
          + ".k8s.io.api.policy.v1beta1.PodDisruption"
          + "Budget\"\362\001\n\027PodDisruptionBudgetSpec\022F\n\014mi"
          + "nAvailable\030\001 \001(\01320.k8s.io.apimachinery.p"
          + "kg.util.intstr.IntOrString\022E\n\010selector\030\002"
          + " \001(\01323.k8s.io.apimachinery.pkg.apis.meta"
          + ".v1.LabelSelector\022H\n\016maxUnavailable\030\003 \001("
          + "\01320.k8s.io.apimachinery.pkg.util.intstr."
          + "IntOrString\"\333\002\n\031PodDisruptionBudgetStatu"
          + "s\022\032\n\022observedGeneration\030\001 \001(\003\022^\n\rdisrupt"
          + "edPods\030\002 \003(\0132G.k8s.io.api.policy.v1beta1"
          + ".PodDisruptionBudgetStatus.DisruptedPods"
          + "Entry\022\032\n\022disruptionsAllowed\030\003 \001(\005\022\026\n\016cur"
          + "rentHealthy\030\004 \001(\005\022\026\n\016desiredHealthy\030\005 \001("
          + "\005\022\024\n\014expectedPods\030\006 \001(\005\032`\n\022DisruptedPods"
          + "Entry\022\013\n\003key\030\001 \001(\t\0229\n\005value\030\002 \001(\0132*.k8s."
          + "io.apimachinery.pkg.apis.meta.v1.Time:\0028"
          + "\001\"\227\001\n\021PodSecurityPolicy\022B\n\010metadata\030\001 \001("
          + "\01320.k8s.io.apimachinery.pkg.apis.meta.v1"
          + ".ObjectMeta\022>\n\004spec\030\002 \001(\01320.k8s.io.api.p"
          + "olicy.v1beta1.PodSecurityPolicySpec\"\226\001\n\025"
          + "PodSecurityPolicyList\022@\n\010metadata\030\001 \001(\0132"
          + "..k8s.io.apimachinery.pkg.apis.meta.v1.L"
          + "istMeta\022;\n\005items\030\002 \003(\0132,.k8s.io.api.poli"
          + "cy.v1beta1.PodSecurityPolicy\"\325\007\n\025PodSecu"
          + "rityPolicySpec\022\022\n\nprivileged\030\001 \001(\010\022\036\n\026de"
          + "faultAddCapabilities\030\002 \003(\t\022 \n\030requiredDr"
          + "opCapabilities\030\003 \003(\t\022\033\n\023allowedCapabilit"
          + "ies\030\004 \003(\t\022\017\n\007volumes\030\005 \003(\t\022\023\n\013hostNetwor"
          + "k\030\006 \001(\010\022;\n\thostPorts\030\007 \003(\0132(.k8s.io.api."
          + "policy.v1beta1.HostPortRange\022\017\n\007hostPID\030"
          + "\010 \001(\010\022\017\n\007hostIPC\030\t \001(\010\022B\n\007seLinux\030\n \001(\0132"
          + "1.k8s.io.api.policy.v1beta1.SELinuxStrat"
          + "egyOptions\022F\n\trunAsUser\030\013 \001(\01323.k8s.io.a"
          + "pi.policy.v1beta1.RunAsUserStrategyOptio"
          + "ns\022H\n\nrunAsGroup\030\026 \001(\01324.k8s.io.api.poli"
          + "cy.v1beta1.RunAsGroupStrategyOptions\022X\n\022"
          + "supplementalGroups\030\014 \001(\0132<.k8s.io.api.po"
          + "licy.v1beta1.SupplementalGroupsStrategyO"
          + "ptions\022B\n\007fsGroup\030\r \001(\01321.k8s.io.api.pol"
          + "icy.v1beta1.FSGroupStrategyOptions\022\036\n\026re"
          + "adOnlyRootFilesystem\030\016 \001(\010\022\'\n\037defaultAll"
          + "owPrivilegeEscalation\030\017 \001(\010\022 \n\030allowPriv"
          + "ilegeEscalation\030\020 \001(\010\022D\n\020allowedHostPath"
          + "s\030\021 \003(\0132*.k8s.io.api.policy.v1beta1.Allo"
          + "wedHostPath\022H\n\022allowedFlexVolumes\030\022 \003(\0132"
          + ",.k8s.io.api.policy.v1beta1.AllowedFlexV"
          + "olume\022\034\n\024allowedUnsafeSysctls\030\023 \003(\t\022\030\n\020f"
          + "orbiddenSysctls\030\024 \003(\t\022\035\n\025allowedProcMoun"
          + "tTypes\030\025 \003(\t\"]\n\031RunAsGroupStrategyOption"
          + "s\022\014\n\004rule\030\001 \001(\t\0222\n\006ranges\030\002 \003(\0132\".k8s.io"
          + ".api.policy.v1beta1.IDRange\"\\\n\030RunAsUser"
          + "StrategyOptions\022\014\n\004rule\030\001 \001(\t\0222\n\006ranges\030"
          + "\002 \003(\0132\".k8s.io.api.policy.v1beta1.IDRang"
          + "e\"b\n\026SELinuxStrategyOptions\022\014\n\004rule\030\001 \001("
          + "\t\022:\n\016seLinuxOptions\030\002 \001(\0132\".k8s.io.api.c"
          + "ore.v1.SELinuxOptions\"e\n!SupplementalGro"
          + "upsStrategyOptions\022\014\n\004rule\030\001 \001(\t\0222\n\006rang"
          + "es\030\002 \003(\0132\".k8s.io.api.policy.v1beta1.IDR"
          + "angeB4\n\032io.kubernetes.client.protoB\rV1be"
          + "ta1PolicyZ\007v1beta1"
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
          io.kubernetes.client.proto.IntStr.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_AllowedFlexVolume_descriptor,
            new java.lang.String[] {
              "Driver",
            });
    internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_AllowedHostPath_descriptor,
            new java.lang.String[] {
              "PathPrefix", "ReadOnly",
            });
    internal_static_k8s_io_api_policy_v1beta1_Eviction_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_policy_v1beta1_Eviction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_Eviction_descriptor,
            new java.lang.String[] {
              "Metadata", "DeleteOptions",
            });
    internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_FSGroupStrategyOptions_descriptor,
            new java.lang.String[] {
              "Rule", "Ranges",
            });
    internal_static_k8s_io_api_policy_v1beta1_HostPortRange_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_policy_v1beta1_HostPortRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_HostPortRange_descriptor,
            new java.lang.String[] {
              "Min", "Max",
            });
    internal_static_k8s_io_api_policy_v1beta1_IDRange_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_policy_v1beta1_IDRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_IDRange_descriptor,
            new java.lang.String[] {
              "Min", "Max",
            });
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudget_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetSpec_descriptor,
            new java.lang.String[] {
              "MinAvailable", "Selector", "MaxUnavailable",
            });
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_descriptor,
            new java.lang.String[] {
              "ObservedGeneration",
              "DisruptedPods",
              "DisruptionsAllowed",
              "CurrentHealthy",
              "DesiredHealthy",
              "ExpectedPods",
            });
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_DisruptedPodsEntry_descriptor =
        internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_DisruptedPodsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_PodDisruptionBudgetStatus_DisruptedPodsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicy_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec",
            });
    internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicyList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_PodSecurityPolicySpec_descriptor,
            new java.lang.String[] {
              "Privileged",
              "DefaultAddCapabilities",
              "RequiredDropCapabilities",
              "AllowedCapabilities",
              "Volumes",
              "HostNetwork",
              "HostPorts",
              "HostPID",
              "HostIPC",
              "SeLinux",
              "RunAsUser",
              "RunAsGroup",
              "SupplementalGroups",
              "FsGroup",
              "ReadOnlyRootFilesystem",
              "DefaultAllowPrivilegeEscalation",
              "AllowPrivilegeEscalation",
              "AllowedHostPaths",
              "AllowedFlexVolumes",
              "AllowedUnsafeSysctls",
              "ForbiddenSysctls",
              "AllowedProcMountTypes",
            });
    internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_RunAsGroupStrategyOptions_descriptor,
            new java.lang.String[] {
              "Rule", "Ranges",
            });
    internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_RunAsUserStrategyOptions_descriptor,
            new java.lang.String[] {
              "Rule", "Ranges",
            });
    internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_SELinuxStrategyOptions_descriptor,
            new java.lang.String[] {
              "Rule", "SeLinuxOptions",
            });
    internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1beta1_SupplementalGroupsStrategyOptions_descriptor,
            new java.lang.String[] {
              "Rule", "Ranges",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
    io.kubernetes.client.proto.IntStr.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
