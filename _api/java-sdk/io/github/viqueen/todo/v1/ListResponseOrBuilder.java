// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: todo/v1/todo_service.proto

package io.github.viqueen.todo.v1;

public interface ListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:todo.v1.ListResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  java.util.List<io.github.viqueen.todo.v1.Todo> 
      getTodosList();
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  io.github.viqueen.todo.v1.Todo getTodos(int index);
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  int getTodosCount();
}