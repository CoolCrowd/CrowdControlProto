// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: worker_list.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public final class WorkerListOuterClass {
    private WorkerListOuterClass() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    static com.google.protobuf.Descriptors.Descriptor
            internal_static_crowdcontrol_WorkerList_descriptor;
    static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_crowdcontrol_WorkerList_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\021worker_list.proto\022\014crowdcontrol\032\014worke" +
                        "r.proto\"1\n\nWorkerList\022#\n\005items\030\001 \003(\0132\024.c" +
                        "rowdcontrol.WorkerB0\n,edu.kit.ipd.crowdc" +
                        "ontrol.objectservice.protoP\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                edu.kit.ipd.crowdcontrol.objectservice.proto.WorkerOuterClass.getDescriptor(),
                        }, assigner);
        internal_static_crowdcontrol_WorkerList_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_crowdcontrol_WorkerList_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_crowdcontrol_WorkerList_descriptor,
                new java.lang.String[]{"Items",});
        edu.kit.ipd.crowdcontrol.objectservice.proto.WorkerOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
