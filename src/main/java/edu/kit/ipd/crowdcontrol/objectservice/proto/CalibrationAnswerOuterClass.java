// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calibration_answer.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public final class CalibrationAnswerOuterClass {
  private CalibrationAnswerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_crowdcontrol_CalibrationAnswer_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_crowdcontrol_CalibrationAnswer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030calibration_answer.proto\022\014crowdcontrol" +
      "\"&\n\021CalibrationAnswer\022\021\n\tanswer_id\030\001 \001(\005" +
      "B0\n,edu.kit.ipd.crowdcontrol.objectservi" +
      "ce.protoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_crowdcontrol_CalibrationAnswer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_crowdcontrol_CalibrationAnswer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_crowdcontrol_CalibrationAnswer_descriptor,
        new java.lang.String[] { "AnswerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
