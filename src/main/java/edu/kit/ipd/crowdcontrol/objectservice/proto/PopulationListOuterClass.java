// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: population_list.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public final class PopulationListOuterClass {
    private PopulationListOuterClass() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    static com.google.protobuf.Descriptors.Descriptor
            internal_static_crowdcontrol_PopulationList_descriptor;
    static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_crowdcontrol_PopulationList_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\025population_list.proto\022\014crowdcontrol\032\020p" +
                        "opulation.proto\"9\n\016PopulationList\022\'\n\005ite" +
                        "ms\030\001 \003(\0132\030.crowdcontrol.PopulationB0\n,ed" +
                        "u.kit.ipd.crowdcontrol.objectservice.pro" +
                        "toP\001b\006proto3"
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
                                edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOuterClass.getDescriptor(),
                        }, assigner);
        internal_static_crowdcontrol_PopulationList_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_crowdcontrol_PopulationList_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_crowdcontrol_PopulationList_descriptor,
                new java.lang.String[]{"Items",});
        edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
