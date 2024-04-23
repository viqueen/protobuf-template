// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: todo/v1/todo_service.proto

// Protobuf Java Version: 4.26.1
package io.github.viqueen.todo.v1;

/**
 * Protobuf type {@code todo.v1.UpdateRequest}
 */
public final class UpdateRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:todo.v1.UpdateRequest)
    UpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      UpdateRequest.class.getName());
  }
  // Use UpdateRequest.newBuilder() to construct.
  private UpdateRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.github.viqueen.todo.v1.TodoServiceOuterClass.internal_static_todo_v1_UpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.viqueen.todo.v1.TodoServiceOuterClass.internal_static_todo_v1_UpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.viqueen.todo.v1.UpdateRequest.class, io.github.viqueen.todo.v1.UpdateRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TODO_FIELD_NUMBER = 1;
  private io.github.viqueen.todo.v1.Todo todo_;
  /**
   * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
   * @return Whether the todo field is set.
   */
  @java.lang.Override
  public boolean hasTodo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
   * @return The todo.
   */
  @java.lang.Override
  public io.github.viqueen.todo.v1.Todo getTodo() {
    return todo_ == null ? io.github.viqueen.todo.v1.Todo.getDefaultInstance() : todo_;
  }
  /**
   * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
   */
  @java.lang.Override
  public io.github.viqueen.todo.v1.TodoOrBuilder getTodoOrBuilder() {
    return todo_ == null ? io.github.viqueen.todo.v1.Todo.getDefaultInstance() : todo_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTodo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTodo());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.github.viqueen.todo.v1.UpdateRequest)) {
      return super.equals(obj);
    }
    io.github.viqueen.todo.v1.UpdateRequest other = (io.github.viqueen.todo.v1.UpdateRequest) obj;

    if (hasTodo() != other.hasTodo()) return false;
    if (hasTodo()) {
      if (!getTodo()
          .equals(other.getTodo())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTodo()) {
      hash = (37 * hash) + TODO_FIELD_NUMBER;
      hash = (53 * hash) + getTodo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.github.viqueen.todo.v1.UpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.github.viqueen.todo.v1.UpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.github.viqueen.todo.v1.UpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.github.viqueen.todo.v1.UpdateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code todo.v1.UpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:todo.v1.UpdateRequest)
      io.github.viqueen.todo.v1.UpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.viqueen.todo.v1.TodoServiceOuterClass.internal_static_todo_v1_UpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.viqueen.todo.v1.TodoServiceOuterClass.internal_static_todo_v1_UpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.viqueen.todo.v1.UpdateRequest.class, io.github.viqueen.todo.v1.UpdateRequest.Builder.class);
    }

    // Construct using io.github.viqueen.todo.v1.UpdateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getTodoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      todo_ = null;
      if (todoBuilder_ != null) {
        todoBuilder_.dispose();
        todoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.viqueen.todo.v1.TodoServiceOuterClass.internal_static_todo_v1_UpdateRequest_descriptor;
    }

    @java.lang.Override
    public io.github.viqueen.todo.v1.UpdateRequest getDefaultInstanceForType() {
      return io.github.viqueen.todo.v1.UpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.github.viqueen.todo.v1.UpdateRequest build() {
      io.github.viqueen.todo.v1.UpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.github.viqueen.todo.v1.UpdateRequest buildPartial() {
      io.github.viqueen.todo.v1.UpdateRequest result = new io.github.viqueen.todo.v1.UpdateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.github.viqueen.todo.v1.UpdateRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.todo_ = todoBuilder_ == null
            ? todo_
            : todoBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.github.viqueen.todo.v1.UpdateRequest) {
        return mergeFrom((io.github.viqueen.todo.v1.UpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.viqueen.todo.v1.UpdateRequest other) {
      if (other == io.github.viqueen.todo.v1.UpdateRequest.getDefaultInstance()) return this;
      if (other.hasTodo()) {
        mergeTodo(other.getTodo());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getTodoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private io.github.viqueen.todo.v1.Todo todo_;
    private com.google.protobuf.SingleFieldBuilder<
        io.github.viqueen.todo.v1.Todo, io.github.viqueen.todo.v1.Todo.Builder, io.github.viqueen.todo.v1.TodoOrBuilder> todoBuilder_;
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     * @return Whether the todo field is set.
     */
    public boolean hasTodo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     * @return The todo.
     */
    public io.github.viqueen.todo.v1.Todo getTodo() {
      if (todoBuilder_ == null) {
        return todo_ == null ? io.github.viqueen.todo.v1.Todo.getDefaultInstance() : todo_;
      } else {
        return todoBuilder_.getMessage();
      }
    }
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     */
    public Builder setTodo(io.github.viqueen.todo.v1.Todo value) {
      if (todoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        todo_ = value;
      } else {
        todoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     */
    public Builder setTodo(
        io.github.viqueen.todo.v1.Todo.Builder builderForValue) {
      if (todoBuilder_ == null) {
        todo_ = builderForValue.build();
      } else {
        todoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     */
    public Builder mergeTodo(io.github.viqueen.todo.v1.Todo value) {
      if (todoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          todo_ != null &&
          todo_ != io.github.viqueen.todo.v1.Todo.getDefaultInstance()) {
          getTodoBuilder().mergeFrom(value);
        } else {
          todo_ = value;
        }
      } else {
        todoBuilder_.mergeFrom(value);
      }
      if (todo_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     */
    public Builder clearTodo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      todo_ = null;
      if (todoBuilder_ != null) {
        todoBuilder_.dispose();
        todoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     */
    public io.github.viqueen.todo.v1.Todo.Builder getTodoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTodoFieldBuilder().getBuilder();
    }
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     */
    public io.github.viqueen.todo.v1.TodoOrBuilder getTodoOrBuilder() {
      if (todoBuilder_ != null) {
        return todoBuilder_.getMessageOrBuilder();
      } else {
        return todo_ == null ?
            io.github.viqueen.todo.v1.Todo.getDefaultInstance() : todo_;
      }
    }
    /**
     * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.github.viqueen.todo.v1.Todo, io.github.viqueen.todo.v1.Todo.Builder, io.github.viqueen.todo.v1.TodoOrBuilder> 
        getTodoFieldBuilder() {
      if (todoBuilder_ == null) {
        todoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.github.viqueen.todo.v1.Todo, io.github.viqueen.todo.v1.Todo.Builder, io.github.viqueen.todo.v1.TodoOrBuilder>(
                getTodo(),
                getParentForChildren(),
                isClean());
        todo_ = null;
      }
      return todoBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:todo.v1.UpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:todo.v1.UpdateRequest)
  private static final io.github.viqueen.todo.v1.UpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.viqueen.todo.v1.UpdateRequest();
  }

  public static io.github.viqueen.todo.v1.UpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRequest>() {
    @java.lang.Override
    public UpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.github.viqueen.todo.v1.UpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

