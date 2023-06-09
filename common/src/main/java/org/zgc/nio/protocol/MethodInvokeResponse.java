// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response.proto

package org.zgc.nio.protocol;

/**
 * Protobuf type {@code org.nio.test.MethodInvokeResponse}
 */
public final class MethodInvokeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.nio.test.MethodInvokeResponse)
    MethodInvokeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MethodInvokeResponse.newBuilder() to construct.
  private MethodInvokeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MethodInvokeResponse() {
    clazz_ = "";
    method_ = "";
    args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    result_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MethodInvokeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MethodInvokeResponse(
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
          case 8: {

            requestId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            clazz_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            method_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              args_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            args_.add(s);
            break;
          }
          case 42: {

            result_ = input.readBytes();
            break;
          }
          case 50: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (time_ != null) {
              subBuilder = time_.toBuilder();
            }
            time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(time_);
              time_ = subBuilder.buildPartial();
            }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        args_ = args_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zgc.nio.protocol.Response.internal_static_org_nio_test_MethodInvokeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zgc.nio.protocol.Response.internal_static_org_nio_test_MethodInvokeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zgc.nio.protocol.MethodInvokeResponse.class, org.zgc.nio.protocol.MethodInvokeResponse.Builder.class);
  }

  public static final int REQUESTID_FIELD_NUMBER = 1;
  private int requestId_;
  /**
   * <code>int32 requestId = 1;</code>
   * @return The requestId.
   */
  @java.lang.Override
  public int getRequestId() {
    return requestId_;
  }

  public static final int CLAZZ_FIELD_NUMBER = 2;
  private volatile java.lang.Object clazz_;
  /**
   * <code>string clazz = 2;</code>
   * @return The clazz.
   */
  @java.lang.Override
  public java.lang.String getClazz() {
    java.lang.Object ref = clazz_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clazz_ = s;
      return s;
    }
  }
  /**
   * <code>string clazz = 2;</code>
   * @return The bytes for clazz.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClazzBytes() {
    java.lang.Object ref = clazz_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clazz_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METHOD_FIELD_NUMBER = 3;
  private volatile java.lang.Object method_;
  /**
   * <code>string method = 3;</code>
   * @return The method.
   */
  @java.lang.Override
  public java.lang.String getMethod() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      method_ = s;
      return s;
    }
  }
  /**
   * <code>string method = 3;</code>
   * @return The bytes for method.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMethodBytes() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      method_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARGS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList args_;
  /**
   * <code>repeated string args = 4;</code>
   * @return A list containing the args.
   */
  public com.google.protobuf.ProtocolStringList
      getArgsList() {
    return args_;
  }
  /**
   * <code>repeated string args = 4;</code>
   * @return The count of args.
   */
  public int getArgsCount() {
    return args_.size();
  }
  /**
   * <code>repeated string args = 4;</code>
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  public java.lang.String getArgs(int index) {
    return args_.get(index);
  }
  /**
   * <code>repeated string args = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  public com.google.protobuf.ByteString
      getArgsBytes(int index) {
    return args_.getByteString(index);
  }

  public static final int RESULT_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString result_;
  /**
   * <code>bytes result = 5;</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResult() {
    return result_;
  }

  public static final int TIME_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp time_;
  /**
   * <code>.google.protobuf.Timestamp time = 6;</code>
   * @return Whether the time field is set.
   */
  @java.lang.Override
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 6;</code>
   * @return The time.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 6;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return getTime();
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
    if (requestId_ != 0) {
      output.writeInt32(1, requestId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clazz_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clazz_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(method_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, method_);
    }
    for (int i = 0; i < args_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, args_.getRaw(i));
    }
    if (!result_.isEmpty()) {
      output.writeBytes(5, result_);
    }
    if (time_ != null) {
      output.writeMessage(6, getTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, requestId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clazz_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clazz_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(method_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, method_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < args_.size(); i++) {
        dataSize += computeStringSizeNoTag(args_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getArgsList().size();
    }
    if (!result_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, result_);
    }
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getTime());
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
    if (!(obj instanceof org.zgc.nio.protocol.MethodInvokeResponse)) {
      return super.equals(obj);
    }
    org.zgc.nio.protocol.MethodInvokeResponse other = (org.zgc.nio.protocol.MethodInvokeResponse) obj;

    if (getRequestId()
        != other.getRequestId()) return false;
    if (!getClazz()
        .equals(other.getClazz())) return false;
    if (!getMethod()
        .equals(other.getMethod())) return false;
    if (!getArgsList()
        .equals(other.getArgsList())) return false;
    if (!getResult()
        .equals(other.getResult())) return false;
    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
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
    hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId();
    hash = (37 * hash) + CLAZZ_FIELD_NUMBER;
    hash = (53 * hash) + getClazz().hashCode();
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getMethod().hashCode();
    if (getArgsCount() > 0) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgsList().hashCode();
    }
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zgc.nio.protocol.MethodInvokeResponse parseFrom(
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
  public static Builder newBuilder(org.zgc.nio.protocol.MethodInvokeResponse prototype) {
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
   * Protobuf type {@code org.nio.test.MethodInvokeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.nio.test.MethodInvokeResponse)
      org.zgc.nio.protocol.MethodInvokeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zgc.nio.protocol.Response.internal_static_org_nio_test_MethodInvokeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zgc.nio.protocol.Response.internal_static_org_nio_test_MethodInvokeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zgc.nio.protocol.MethodInvokeResponse.class, org.zgc.nio.protocol.MethodInvokeResponse.Builder.class);
    }

    // Construct using org.zgc.nio.protocol.MethodInvokeResponse.newBuilder()
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
      requestId_ = 0;

      clazz_ = "";

      method_ = "";

      args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = com.google.protobuf.ByteString.EMPTY;

      if (timeBuilder_ == null) {
        time_ = null;
      } else {
        time_ = null;
        timeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zgc.nio.protocol.Response.internal_static_org_nio_test_MethodInvokeResponse_descriptor;
    }

    @java.lang.Override
    public org.zgc.nio.protocol.MethodInvokeResponse getDefaultInstanceForType() {
      return org.zgc.nio.protocol.MethodInvokeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.zgc.nio.protocol.MethodInvokeResponse build() {
      org.zgc.nio.protocol.MethodInvokeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zgc.nio.protocol.MethodInvokeResponse buildPartial() {
      org.zgc.nio.protocol.MethodInvokeResponse result = new org.zgc.nio.protocol.MethodInvokeResponse(this);
      int from_bitField0_ = bitField0_;
      result.requestId_ = requestId_;
      result.clazz_ = clazz_;
      result.method_ = method_;
      if (((bitField0_ & 0x00000001) != 0)) {
        args_ = args_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.args_ = args_;
      result.result_ = result_;
      if (timeBuilder_ == null) {
        result.time_ = time_;
      } else {
        result.time_ = timeBuilder_.build();
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
      if (other instanceof org.zgc.nio.protocol.MethodInvokeResponse) {
        return mergeFrom((org.zgc.nio.protocol.MethodInvokeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zgc.nio.protocol.MethodInvokeResponse other) {
      if (other == org.zgc.nio.protocol.MethodInvokeResponse.getDefaultInstance()) return this;
      if (other.getRequestId() != 0) {
        setRequestId(other.getRequestId());
      }
      if (!other.getClazz().isEmpty()) {
        clazz_ = other.clazz_;
        onChanged();
      }
      if (!other.getMethod().isEmpty()) {
        method_ = other.method_;
        onChanged();
      }
      if (!other.args_.isEmpty()) {
        if (args_.isEmpty()) {
          args_ = other.args_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureArgsIsMutable();
          args_.addAll(other.args_);
        }
        onChanged();
      }
      if (other.getResult() != com.google.protobuf.ByteString.EMPTY) {
        setResult(other.getResult());
      }
      if (other.hasTime()) {
        mergeTime(other.getTime());
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
      org.zgc.nio.protocol.MethodInvokeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zgc.nio.protocol.MethodInvokeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int requestId_ ;
    /**
     * <code>int32 requestId = 1;</code>
     * @return The requestId.
     */
    @java.lang.Override
    public int getRequestId() {
      return requestId_;
    }
    /**
     * <code>int32 requestId = 1;</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(int value) {
      
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 requestId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      
      requestId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object clazz_ = "";
    /**
     * <code>string clazz = 2;</code>
     * @return The clazz.
     */
    public java.lang.String getClazz() {
      java.lang.Object ref = clazz_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clazz_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clazz = 2;</code>
     * @return The bytes for clazz.
     */
    public com.google.protobuf.ByteString
        getClazzBytes() {
      java.lang.Object ref = clazz_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clazz_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clazz = 2;</code>
     * @param value The clazz to set.
     * @return This builder for chaining.
     */
    public Builder setClazz(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clazz_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clazz = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClazz() {
      
      clazz_ = getDefaultInstance().getClazz();
      onChanged();
      return this;
    }
    /**
     * <code>string clazz = 2;</code>
     * @param value The bytes for clazz to set.
     * @return This builder for chaining.
     */
    public Builder setClazzBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clazz_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object method_ = "";
    /**
     * <code>string method = 3;</code>
     * @return The method.
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string method = 3;</code>
     * @return The bytes for method.
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string method = 3;</code>
     * @param value The method to set.
     * @return This builder for chaining.
     */
    public Builder setMethod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string method = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMethod() {
      
      method_ = getDefaultInstance().getMethod();
      onChanged();
      return this;
    }
    /**
     * <code>string method = 3;</code>
     * @param value The bytes for method to set.
     * @return This builder for chaining.
     */
    public Builder setMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      method_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureArgsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        args_ = new com.google.protobuf.LazyStringArrayList(args_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string args = 4;</code>
     * @return A list containing the args.
     */
    public com.google.protobuf.ProtocolStringList
        getArgsList() {
      return args_.getUnmodifiableView();
    }
    /**
     * <code>repeated string args = 4;</code>
     * @return The count of args.
     */
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <code>repeated string args = 4;</code>
     * @param index The index of the element to return.
     * @return The args at the given index.
     */
    public java.lang.String getArgs(int index) {
      return args_.get(index);
    }
    /**
     * <code>repeated string args = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the args at the given index.
     */
    public com.google.protobuf.ByteString
        getArgsBytes(int index) {
      return args_.getByteString(index);
    }
    /**
     * <code>repeated string args = 4;</code>
     * @param index The index to set the value at.
     * @param value The args to set.
     * @return This builder for chaining.
     */
    public Builder setArgs(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
      args_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string args = 4;</code>
     * @param value The args to add.
     * @return This builder for chaining.
     */
    public Builder addArgs(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
      args_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string args = 4;</code>
     * @param values The args to add.
     * @return This builder for chaining.
     */
    public Builder addAllArgs(
        java.lang.Iterable<java.lang.String> values) {
      ensureArgsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, args_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string args = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgs() {
      args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string args = 4;</code>
     * @param value The bytes of the args to add.
     * @return This builder for chaining.
     */
    public Builder addArgsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureArgsIsMutable();
      args_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString result_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes result = 5;</code>
     * @return The result.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getResult() {
      return result_;
    }
    /**
     * <code>bytes result = 5;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes result = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp time_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return timeBuilder_ != null || time_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     * @return The time.
     */
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
        onChanged();
      } else {
        timeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
        onChanged();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (time_ != null) {
          time_ =
            com.google.protobuf.Timestamp.newBuilder(time_).mergeFrom(value).buildPartial();
        } else {
          time_ = value;
        }
        onChanged();
      } else {
        timeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     */
    public Builder clearTime() {
      if (timeBuilder_ == null) {
        time_ = null;
        onChanged();
      } else {
        time_ = null;
        timeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.nio.test.MethodInvokeResponse)
  }

  // @@protoc_insertion_point(class_scope:org.nio.test.MethodInvokeResponse)
  private static final org.zgc.nio.protocol.MethodInvokeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zgc.nio.protocol.MethodInvokeResponse();
  }

  public static org.zgc.nio.protocol.MethodInvokeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MethodInvokeResponse>
      PARSER = new com.google.protobuf.AbstractParser<MethodInvokeResponse>() {
    @java.lang.Override
    public MethodInvokeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MethodInvokeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MethodInvokeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MethodInvokeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zgc.nio.protocol.MethodInvokeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

