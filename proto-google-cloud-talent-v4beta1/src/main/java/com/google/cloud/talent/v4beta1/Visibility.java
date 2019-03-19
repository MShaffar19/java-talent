// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * An enum that represents who has view access to the resource.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.Visibility}
 */
public enum Visibility implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>VISIBILITY_UNSPECIFIED = 0;</code>
   */
  VISIBILITY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The resource is only visible to the GCP account who owns it.
   * </pre>
   *
   * <code>ACCOUNT_ONLY = 1;</code>
   */
  ACCOUNT_ONLY(1),
  /**
   *
   *
   * <pre>
   * The resource is visible to the owner and may be visible to other
   * applications and processes at Google.
   * </pre>
   *
   * <code>SHARED_WITH_GOOGLE = 2;</code>
   */
  SHARED_WITH_GOOGLE(2),
  /**
   *
   *
   * <pre>
   * The resource is visible to the owner and may be visible to all other API
   * clients.
   * </pre>
   *
   * <code>SHARED_WITH_PUBLIC = 3;</code>
   */
  SHARED_WITH_PUBLIC(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>VISIBILITY_UNSPECIFIED = 0;</code>
   */
  public static final int VISIBILITY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The resource is only visible to the GCP account who owns it.
   * </pre>
   *
   * <code>ACCOUNT_ONLY = 1;</code>
   */
  public static final int ACCOUNT_ONLY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The resource is visible to the owner and may be visible to other
   * applications and processes at Google.
   * </pre>
   *
   * <code>SHARED_WITH_GOOGLE = 2;</code>
   */
  public static final int SHARED_WITH_GOOGLE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The resource is visible to the owner and may be visible to all other API
   * clients.
   * </pre>
   *
   * <code>SHARED_WITH_PUBLIC = 3;</code>
   */
  public static final int SHARED_WITH_PUBLIC_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /** @deprecated Use {@link #forNumber(int)} instead. */
  @java.lang.Deprecated
  public static Visibility valueOf(int value) {
    return forNumber(value);
  }

  public static Visibility forNumber(int value) {
    switch (value) {
      case 0:
        return VISIBILITY_UNSPECIFIED;
      case 1:
        return ACCOUNT_ONLY;
      case 2:
        return SHARED_WITH_GOOGLE;
      case 3:
        return SHARED_WITH_PUBLIC;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Visibility> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Visibility> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Visibility>() {
        public Visibility findValueByNumber(int number) {
          return Visibility.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.CommonProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final Visibility[] VALUES = values();

  public static Visibility valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Visibility(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.Visibility)
}
