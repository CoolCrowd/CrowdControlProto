// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: answer_type.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

/**
 * Protobuf enum {@code crowdcontrol.AnswerType}
 */
public enum AnswerType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INVALID = 0;</code>
   */
  INVALID(0, 0),
  /**
   * <code>TEXT = 1;</code>
   */
  TEXT(1, 1),
  /**
   * <code>IMAGE = 2;</code>
   */
  IMAGE(2, 2),
  UNRECOGNIZED(-1, -1),
  ;

  /**
   * <code>INVALID = 0;</code>
   */
  public static final int INVALID_VALUE = 0;
  /**
   * <code>TEXT = 1;</code>
   */
  public static final int TEXT_VALUE = 1;
  /**
   * <code>IMAGE = 2;</code>
   */
  public static final int IMAGE_VALUE = 2;


  public final int getNumber() {
    if (index == -1) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  public static AnswerType valueOf(int value) {
    switch (value) {
      case 0: return INVALID;
      case 1: return TEXT;
      case 2: return IMAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AnswerType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AnswerType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AnswerType>() {
          public AnswerType findValueByNumber(int number) {
            return AnswerType.valueOf(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(index);
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return edu.kit.ipd.crowdcontrol.objectservice.proto.AnswerTypeOuterClass.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final AnswerType[] VALUES = values();

  public static AnswerType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int index;
  private final int value;

  private AnswerType(int index, int value) {
    this.index = index;
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:crowdcontrol.AnswerType)
}

