/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/trigger.proto

package com.google.cloud.eventarc.v1;

/**
 *
 *
 * <pre>
 * Represents a Cloud Run destination.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.v1.CloudRun}
 */
public final class CloudRun extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.v1.CloudRun)
    CloudRunOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CloudRun.newBuilder() to construct.
  private CloudRun(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CloudRun() {
    service_ = "";
    path_ = "";
    region_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CloudRun();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CloudRun(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              service_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              path_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              region_ = s;
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
    return com.google.cloud.eventarc.v1.TriggerProto
        .internal_static_google_cloud_eventarc_v1_CloudRun_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.v1.TriggerProto
        .internal_static_google_cloud_eventarc_v1_CloudRun_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.v1.CloudRun.class,
            com.google.cloud.eventarc.v1.CloudRun.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 1;
  private volatile java.lang.Object service_;
  /**
   *
   *
   * <pre>
   * Required. The name of the Cloud Run service being addressed. See
   * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
   * Only services located in the same project of the trigger object
   * can be addressed.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the Cloud Run service being addressed. See
   * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
   * Only services located in the same project of the trigger object
   * can be addressed.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object path_;
  /**
   *
   *
   * <pre>
   * Optional. The relative path on the Cloud Run service the events should be
   * sent to.
   * The value must conform to the definition of URI path segment (section 3.3
   * of RFC2396). Examples: "/route", "route", "route/subroute".
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The relative path on the Cloud Run service the events should be
   * sent to.
   * The value must conform to the definition of URI path segment (section 3.3
   * of RFC2396). Examples: "/route", "route", "route/subroute".
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_FIELD_NUMBER = 3;
  private volatile java.lang.Object region_;
  /**
   *
   *
   * <pre>
   * Required. The region the Cloud Run service is deployed in.
   * </pre>
   *
   * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The region the Cloud Run service is deployed in.
   * </pre>
   *
   * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      region_ = b;
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
    if (!getServiceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, service_);
    }
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    if (!getRegionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, region_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, service_);
    }
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
    }
    if (!getRegionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, region_);
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
    if (!(obj instanceof com.google.cloud.eventarc.v1.CloudRun)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.v1.CloudRun other = (com.google.cloud.eventarc.v1.CloudRun) obj;

    if (!getService().equals(other.getService())) return false;
    if (!getPath().equals(other.getPath())) return false;
    if (!getRegion().equals(other.getRegion())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CloudRun parseFrom(
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

  public static Builder newBuilder(com.google.cloud.eventarc.v1.CloudRun prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Represents a Cloud Run destination.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.v1.CloudRun}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.v1.CloudRun)
      com.google.cloud.eventarc.v1.CloudRunOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_CloudRun_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_CloudRun_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.v1.CloudRun.class,
              com.google.cloud.eventarc.v1.CloudRun.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.v1.CloudRun.newBuilder()
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
      service_ = "";

      path_ = "";

      region_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_CloudRun_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CloudRun getDefaultInstanceForType() {
      return com.google.cloud.eventarc.v1.CloudRun.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CloudRun build() {
      com.google.cloud.eventarc.v1.CloudRun result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CloudRun buildPartial() {
      com.google.cloud.eventarc.v1.CloudRun result =
          new com.google.cloud.eventarc.v1.CloudRun(this);
      result.service_ = service_;
      result.path_ = path_;
      result.region_ = region_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.eventarc.v1.CloudRun) {
        return mergeFrom((com.google.cloud.eventarc.v1.CloudRun) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.v1.CloudRun other) {
      if (other == com.google.cloud.eventarc.v1.CloudRun.getDefaultInstance()) return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
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
      com.google.cloud.eventarc.v1.CloudRun parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.eventarc.v1.CloudRun) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object service_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Run service being addressed. See
     * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
     * Only services located in the same project of the trigger object
     * can be addressed.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Run service being addressed. See
     * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
     * Only services located in the same project of the trigger object
     * can be addressed.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Run service being addressed. See
     * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
     * Only services located in the same project of the trigger object
     * can be addressed.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      service_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Run service being addressed. See
     * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
     * Only services located in the same project of the trigger object
     * can be addressed.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {

      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Run service being addressed. See
     * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
     * Only services located in the same project of the trigger object
     * can be addressed.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      service_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The relative path on the Cloud Run service the events should be
     * sent to.
     * The value must conform to the definition of URI path segment (section 3.3
     * of RFC2396). Examples: "/route", "route", "route/subroute".
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The relative path on the Cloud Run service the events should be
     * sent to.
     * The value must conform to the definition of URI path segment (section 3.3
     * of RFC2396). Examples: "/route", "route", "route/subroute".
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The relative path on the Cloud Run service the events should be
     * sent to.
     * The value must conform to the definition of URI path segment (section 3.3
     * of RFC2396). Examples: "/route", "route", "route/subroute".
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      path_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The relative path on the Cloud Run service the events should be
     * sent to.
     * The value must conform to the definition of URI path segment (section 3.3
     * of RFC2396). Examples: "/route", "route", "route/subroute".
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPath() {

      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The relative path on the Cloud Run service the events should be
     * sent to.
     * The value must conform to the definition of URI path segment (section 3.3
     * of RFC2396). Examples: "/route", "route", "route/subroute".
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      path_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     *
     *
     * <pre>
     * Required. The region the Cloud Run service is deployed in.
     * </pre>
     *
     * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The region the Cloud Run service is deployed in.
     * </pre>
     *
     * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The region the Cloud Run service is deployed in.
     * </pre>
     *
     * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      region_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The region the Cloud Run service is deployed in.
     * </pre>
     *
     * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRegion() {

      region_ = getDefaultInstance().getRegion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The region the Cloud Run service is deployed in.
     * </pre>
     *
     * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      region_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.v1.CloudRun)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.CloudRun)
  private static final com.google.cloud.eventarc.v1.CloudRun DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.v1.CloudRun();
  }

  public static com.google.cloud.eventarc.v1.CloudRun getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudRun> PARSER =
      new com.google.protobuf.AbstractParser<CloudRun>() {
        @java.lang.Override
        public CloudRun parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CloudRun(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CloudRun> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudRun> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.v1.CloudRun getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
