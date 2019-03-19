// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface EmployerFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.EmployerFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The name of the employer, for example "Google", "Alphabet".
   * </pre>
   *
   * <code>string employer = 1;</code>
   */
  java.lang.String getEmployer();
  /**
   *
   *
   * <pre>
   * Required.
   * The name of the employer, for example "Google", "Alphabet".
   * </pre>
   *
   * <code>string employer = 1;</code>
   */
  com.google.protobuf.ByteString getEmployerBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * Define set of
   * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
   * against.
   * Defaults to
   * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
   */
  int getModeValue();
  /**
   *
   *
   * <pre>
   * Optional.
   * Define set of
   * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
   * against.
   * Defaults to
   * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
   */
  com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode getMode();

  /**
   *
   *
   * <pre>
   * Optional.
   * Whether to apply negation to the filter so profiles matching the filter
   * is excluded.
   * </pre>
   *
   * <code>bool negated = 3;</code>
   */
  boolean getNegated();
}
