// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: experiment.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public interface ExperimentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crowdcontrol.Experiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional .crowdcontrol.Experiment.State state = 4;</code>
   */
  int getStateValue();
  /**
   * <code>optional .crowdcontrol.Experiment.State state = 4;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.Experiment.State getState();

  /**
   * <code>optional .crowdcontrol.AnswerType answer_type = 5;</code>
   */
  int getAnswerTypeValue();
  /**
   * <code>optional .crowdcontrol.AnswerType answer_type = 5;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.AnswerType getAnswerType();

  /**
   * <code>optional string algorithm_task_chooser = 6;</code>
   */
  java.lang.String getAlgorithmTaskChooser();
  /**
   * <code>optional string algorithm_task_chooser = 6;</code>
   */
  com.google.protobuf.ByteString
      getAlgorithmTaskChooserBytes();

  /**
   * <code>optional string algorithm_quality_answer = 7;</code>
   */
  java.lang.String getAlgorithmQualityAnswer();
  /**
   * <code>optional string algorithm_quality_answer = 7;</code>
   */
  com.google.protobuf.ByteString
      getAlgorithmQualityAnswerBytes();

  /**
   * <code>optional string algorithm_quality_rating = 8;</code>
   */
  java.lang.String getAlgorithmQualityRating();
  /**
   * <code>optional string algorithm_quality_rating = 8;</code>
   */
  com.google.protobuf.ByteString
      getAlgorithmQualityRatingBytes();

  /**
   * <code>optional int32 answers_per_worker = 9;</code>
   */
  int getAnswersPerWorker();

  /**
   * <code>optional int32 ratings_per_worker = 10;</code>
   */
  int getRatingsPerWorker();

  /**
   * <code>optional int32 ratings_per_answer = 11;</code>
   */
  int getRatingsPerAnswer();

  /**
   * <code>optional int32 payment_base = 12;</code>
   */
  int getPaymentBase();

  /**
   * <code>optional int32 payment_answer = 13;</code>
   */
  int getPaymentAnswer();

  /**
   * <code>optional int32 payment_rating = 14;</code>
   */
  int getPaymentRating();

  /**
   * <code>repeated .crowdcontrol.Constraint constraints = 15;</code>
   */
  java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Constraint> 
      getConstraintsList();
  /**
   * <code>repeated .crowdcontrol.Constraint constraints = 15;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.Constraint getConstraints(int index);
  /**
   * <code>repeated .crowdcontrol.Constraint constraints = 15;</code>
   */
  int getConstraintsCount();
  /**
   * <code>repeated .crowdcontrol.Constraint constraints = 15;</code>
   */
  java.util.List<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.ConstraintOrBuilder> 
      getConstraintsOrBuilderList();
  /**
   * <code>repeated .crowdcontrol.Constraint constraints = 15;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.ConstraintOrBuilder getConstraintsOrBuilder(
      int index);

  /**
   * <code>repeated .crowdcontrol.Tag tags = 16;</code>
   */
  java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Tag> 
      getTagsList();
  /**
   * <code>repeated .crowdcontrol.Tag tags = 16;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.Tag getTags(int index);
  /**
   * <code>repeated .crowdcontrol.Tag tags = 16;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .crowdcontrol.Tag tags = 16;</code>
   */
  java.util.List<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .crowdcontrol.Tag tags = 16;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.TagOrBuilder getTagsOrBuilder(
      int index);

  /**
   * <code>repeated .crowdcontrol.Platform platforms = 17;</code>
   */
  java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Platform> 
      getPlatformsList();
  /**
   * <code>repeated .crowdcontrol.Platform platforms = 17;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.Platform getPlatforms(int index);
  /**
   * <code>repeated .crowdcontrol.Platform platforms = 17;</code>
   */
  int getPlatformsCount();
  /**
   * <code>repeated .crowdcontrol.Platform platforms = 17;</code>
   */
  java.util.List<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.PlatformOrBuilder> 
      getPlatformsOrBuilderList();
  /**
   * <code>repeated .crowdcontrol.Platform platforms = 17;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.PlatformOrBuilder getPlatformsOrBuilder(
      int index);

  /**
   * <code>map&lt;string, string&gt; placeholders = 18;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPlaceholders();

  /**
   * <code>optional int32 worker_quality_threshold = 19;</code>
   */
  int getWorkerQualityThreshold();

  /**
   * <code>optional int32 template_id = 20;</code>
   */
  int getTemplateId();
}
