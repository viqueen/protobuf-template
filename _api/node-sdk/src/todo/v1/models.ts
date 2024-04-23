/**
 * Generated by the protoc-gen-ts.  DO NOT EDIT!
 * compiler version: 0.0.0
 * source: todo/v1/models.proto
 * git: https://github.com/thesayyn/protoc-gen-ts */
import * as pb_1 from "google-protobuf";
export namespace todo.v1 {
    export class Todo extends pb_1.Message {
        #one_of_decls: number[][] = [];
        constructor(data?: any[] | {
            id?: string;
            description?: string;
            completed?: boolean;
        }) {
            super();
            pb_1.Message.initialize(this, Array.isArray(data) ? data : [], 0, -1, [], this.#one_of_decls);
            if (!Array.isArray(data) && typeof data == "object") {
                if ("id" in data && data.id != undefined) {
                    this.id = data.id;
                }
                if ("description" in data && data.description != undefined) {
                    this.description = data.description;
                }
                if ("completed" in data && data.completed != undefined) {
                    this.completed = data.completed;
                }
            }
        }
        get id() {
            return pb_1.Message.getFieldWithDefault(this, 1, "") as string;
        }
        set id(value: string) {
            pb_1.Message.setField(this, 1, value);
        }
        get description() {
            return pb_1.Message.getFieldWithDefault(this, 2, "") as string;
        }
        set description(value: string) {
            pb_1.Message.setField(this, 2, value);
        }
        get completed() {
            return pb_1.Message.getFieldWithDefault(this, 3, false) as boolean;
        }
        set completed(value: boolean) {
            pb_1.Message.setField(this, 3, value);
        }
        static fromObject(data: {
            id?: string;
            description?: string;
            completed?: boolean;
        }): Todo {
            const message = new Todo({});
            if (data.id != null) {
                message.id = data.id;
            }
            if (data.description != null) {
                message.description = data.description;
            }
            if (data.completed != null) {
                message.completed = data.completed;
            }
            return message;
        }
        toObject() {
            const data: {
                id?: string;
                description?: string;
                completed?: boolean;
            } = {};
            if (this.id != null) {
                data.id = this.id;
            }
            if (this.description != null) {
                data.description = this.description;
            }
            if (this.completed != null) {
                data.completed = this.completed;
            }
            return data;
        }
        serialize(): Uint8Array;
        serialize(w: pb_1.BinaryWriter): void;
        serialize(w?: pb_1.BinaryWriter): Uint8Array | void {
            const writer = w || new pb_1.BinaryWriter();
            if (this.id.length)
                writer.writeString(1, this.id);
            if (this.description.length)
                writer.writeString(2, this.description);
            if (this.completed != false)
                writer.writeBool(3, this.completed);
            if (!w)
                return writer.getResultBuffer();
        }
        static deserialize(bytes: Uint8Array | pb_1.BinaryReader): Todo {
            const reader = bytes instanceof pb_1.BinaryReader ? bytes : new pb_1.BinaryReader(bytes), message = new Todo();
            while (reader.nextField()) {
                if (reader.isEndGroup())
                    break;
                switch (reader.getFieldNumber()) {
                    case 1:
                        message.id = reader.readString();
                        break;
                    case 2:
                        message.description = reader.readString();
                        break;
                    case 3:
                        message.completed = reader.readBool();
                        break;
                    default: reader.skipField();
                }
            }
            return message;
        }
        serializeBinary(): Uint8Array {
            return this.serialize();
        }
        static deserializeBinary(bytes: Uint8Array): Todo {
            return Todo.deserialize(bytes);
        }
    }
}
