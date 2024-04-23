// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: todo/admin/v1/admin_todo_service.proto

package todoAdminV1

import (
	v1 "github.com/viqueen/monorepo-template/_api/go-sdk/todo/v1"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type ListTodosRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Query string `protobuf:"bytes,1,opt,name=query,proto3" json:"query,omitempty"`
}

func (x *ListTodosRequest) Reset() {
	*x = ListTodosRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_todo_admin_v1_admin_todo_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListTodosRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListTodosRequest) ProtoMessage() {}

func (x *ListTodosRequest) ProtoReflect() protoreflect.Message {
	mi := &file_todo_admin_v1_admin_todo_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListTodosRequest.ProtoReflect.Descriptor instead.
func (*ListTodosRequest) Descriptor() ([]byte, []int) {
	return file_todo_admin_v1_admin_todo_service_proto_rawDescGZIP(), []int{0}
}

func (x *ListTodosRequest) GetQuery() string {
	if x != nil {
		return x.Query
	}
	return ""
}

type ListTodosResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Todos []*v1.Todo `protobuf:"bytes,1,rep,name=todos,proto3" json:"todos,omitempty"`
}

func (x *ListTodosResponse) Reset() {
	*x = ListTodosResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_todo_admin_v1_admin_todo_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListTodosResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListTodosResponse) ProtoMessage() {}

func (x *ListTodosResponse) ProtoReflect() protoreflect.Message {
	mi := &file_todo_admin_v1_admin_todo_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListTodosResponse.ProtoReflect.Descriptor instead.
func (*ListTodosResponse) Descriptor() ([]byte, []int) {
	return file_todo_admin_v1_admin_todo_service_proto_rawDescGZIP(), []int{1}
}

func (x *ListTodosResponse) GetTodos() []*v1.Todo {
	if x != nil {
		return x.Todos
	}
	return nil
}

var File_todo_admin_v1_admin_todo_service_proto protoreflect.FileDescriptor

var file_todo_admin_v1_admin_todo_service_proto_rawDesc = []byte{
	0x0a, 0x26, 0x74, 0x6f, 0x64, 0x6f, 0x2f, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2f, 0x76, 0x31, 0x2f,
	0x61, 0x64, 0x6d, 0x69, 0x6e, 0x5f, 0x74, 0x6f, 0x64, 0x6f, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x74, 0x6f, 0x64, 0x6f, 0x2e, 0x61,
	0x64, 0x6d, 0x69, 0x6e, 0x2e, 0x76, 0x31, 0x1a, 0x14, 0x74, 0x6f, 0x64, 0x6f, 0x2f, 0x76, 0x31,
	0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x28, 0x0a,
	0x10, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x6f, 0x64, 0x6f, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x14, 0x0a, 0x05, 0x71, 0x75, 0x65, 0x72, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x05, 0x71, 0x75, 0x65, 0x72, 0x79, 0x22, 0x38, 0x0a, 0x11, 0x4c, 0x69, 0x73, 0x74, 0x54,
	0x6f, 0x64, 0x6f, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x23, 0x0a, 0x05,
	0x74, 0x6f, 0x64, 0x6f, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x74, 0x6f,
	0x64, 0x6f, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x6f, 0x64, 0x6f, 0x52, 0x05, 0x74, 0x6f, 0x64, 0x6f,
	0x73, 0x32, 0x62, 0x0a, 0x10, 0x41, 0x64, 0x6d, 0x69, 0x6e, 0x54, 0x6f, 0x64, 0x6f, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x4e, 0x0a, 0x09, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x6f, 0x64,
	0x6f, 0x73, 0x12, 0x1f, 0x2e, 0x74, 0x6f, 0x64, 0x6f, 0x2e, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2e,
	0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x6f, 0x64, 0x6f, 0x73, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x20, 0x2e, 0x74, 0x6f, 0x64, 0x6f, 0x2e, 0x61, 0x64, 0x6d, 0x69, 0x6e,
	0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x6f, 0x64, 0x6f, 0x73, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x6f, 0x0a, 0x1f, 0x69, 0x6f, 0x2e, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x76, 0x69, 0x71, 0x75, 0x65, 0x65, 0x6e, 0x2e, 0x74, 0x6f, 0x64, 0x6f, 0x2e,
	0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2e, 0x76, 0x31, 0x50, 0x01, 0x5a, 0x4a, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x76, 0x69, 0x71, 0x75, 0x65, 0x65, 0x6e, 0x2f, 0x6d,
	0x6f, 0x6e, 0x6f, 0x72, 0x65, 0x70, 0x6f, 0x2d, 0x74, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65,
	0x2f, 0x5f, 0x61, 0x70, 0x69, 0x2f, 0x67, 0x6f, 0x2d, 0x73, 0x64, 0x6b, 0x2f, 0x74, 0x6f, 0x64,
	0x6f, 0x2f, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2f, 0x76, 0x31, 0x3b, 0x74, 0x6f, 0x64, 0x6f, 0x41,
	0x64, 0x6d, 0x69, 0x6e, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_todo_admin_v1_admin_todo_service_proto_rawDescOnce sync.Once
	file_todo_admin_v1_admin_todo_service_proto_rawDescData = file_todo_admin_v1_admin_todo_service_proto_rawDesc
)

func file_todo_admin_v1_admin_todo_service_proto_rawDescGZIP() []byte {
	file_todo_admin_v1_admin_todo_service_proto_rawDescOnce.Do(func() {
		file_todo_admin_v1_admin_todo_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_todo_admin_v1_admin_todo_service_proto_rawDescData)
	})
	return file_todo_admin_v1_admin_todo_service_proto_rawDescData
}

var file_todo_admin_v1_admin_todo_service_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_todo_admin_v1_admin_todo_service_proto_goTypes = []interface{}{
	(*ListTodosRequest)(nil),  // 0: todo.admin.v1.ListTodosRequest
	(*ListTodosResponse)(nil), // 1: todo.admin.v1.ListTodosResponse
	(*v1.Todo)(nil),           // 2: todo.v1.Todo
}
var file_todo_admin_v1_admin_todo_service_proto_depIdxs = []int32{
	2, // 0: todo.admin.v1.ListTodosResponse.todos:type_name -> todo.v1.Todo
	0, // 1: todo.admin.v1.AdminTodoService.ListTodos:input_type -> todo.admin.v1.ListTodosRequest
	1, // 2: todo.admin.v1.AdminTodoService.ListTodos:output_type -> todo.admin.v1.ListTodosResponse
	2, // [2:3] is the sub-list for method output_type
	1, // [1:2] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_todo_admin_v1_admin_todo_service_proto_init() }
func file_todo_admin_v1_admin_todo_service_proto_init() {
	if File_todo_admin_v1_admin_todo_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_todo_admin_v1_admin_todo_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListTodosRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_todo_admin_v1_admin_todo_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListTodosResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_todo_admin_v1_admin_todo_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_todo_admin_v1_admin_todo_service_proto_goTypes,
		DependencyIndexes: file_todo_admin_v1_admin_todo_service_proto_depIdxs,
		MessageInfos:      file_todo_admin_v1_admin_todo_service_proto_msgTypes,
	}.Build()
	File_todo_admin_v1_admin_todo_service_proto = out.File
	file_todo_admin_v1_admin_todo_service_proto_rawDesc = nil
	file_todo_admin_v1_admin_todo_service_proto_goTypes = nil
	file_todo_admin_v1_admin_todo_service_proto_depIdxs = nil
}