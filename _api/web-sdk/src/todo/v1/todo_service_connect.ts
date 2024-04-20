// @generated by protoc-gen-connect-es v1.4.0 with parameter "target=ts"
// @generated from file todo/v1/todo_service.proto (package todo.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { CreateRequest, CreateResponse, DeleteRequest, DeleteResponse, ListRequest, ListResponse, ReadRequest, ReadResponse, UpdateRequest, UpdateResponse } from "./todo_service_pb.js";
import { MethodKind } from "@bufbuild/protobuf";

/**
 * @generated from service todo.v1.TodoService
 */
export const TodoService = {
  typeName: "todo.v1.TodoService",
  methods: {
    /**
     * @generated from rpc todo.v1.TodoService.Create
     */
    create: {
      name: "Create",
      I: CreateRequest,
      O: CreateResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc todo.v1.TodoService.Read
     */
    read: {
      name: "Read",
      I: ReadRequest,
      O: ReadResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc todo.v1.TodoService.Update
     */
    update: {
      name: "Update",
      I: UpdateRequest,
      O: UpdateResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc todo.v1.TodoService.Delete
     */
    delete: {
      name: "Delete",
      I: DeleteRequest,
      O: DeleteResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc todo.v1.TodoService.List
     */
    list: {
      name: "List",
      I: ListRequest,
      O: ListResponse,
      kind: MethodKind.Unary,
    },
  }
} as const;

