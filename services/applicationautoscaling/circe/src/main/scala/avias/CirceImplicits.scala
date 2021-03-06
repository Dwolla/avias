package avias.applicationautoscaling
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val FailedResourceAccessExceptionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.FailedResourceAccessException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ScalableTargetEncoder: io.circe.Encoder[avias.applicationautoscaling.models.ScalableTarget] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "RoleARN" -> o.roleARN.asJson, "ServiceNamespace" -> o.serviceNamespace.asJson, "CreationTime" -> o.creationTime.asJson, "MinCapacity" -> o.minCapacity.asJson, "MaxCapacity" -> o.maxCapacity.asJson, "ScalableDimension" -> o.scalableDimension.asJson)
  }
  final implicit val DescribeScheduledActionsRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DescribeScheduledActionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceNamespace" -> o.serviceNamespace.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson, "ResourceId" -> o.resourceId.asJson, "ScheduledActionNames" -> o.scheduledActionNames.asJson, "ScalableDimension" -> o.scalableDimension.asJson)
  }
  final implicit val RegisterScalableTargetResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.RegisterScalableTargetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeScalingPoliciesResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DescribeScalingPoliciesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ScalingPolicies" -> o.scalingPolicies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConcurrentUpdateExceptionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.ConcurrentUpdateException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeregisterScalableTargetResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DeregisterScalableTargetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeScalingActivitiesRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DescribeScalingActivitiesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceNamespace" -> o.serviceNamespace.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson, "ResourceId" -> o.resourceId.asJson, "ScalableDimension" -> o.scalableDimension.asJson)
  }
  final implicit val StepScalingPolicyConfigurationEncoder: io.circe.Encoder[avias.applicationautoscaling.models.StepScalingPolicyConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("MinAdjustmentMagnitude" -> o.minAdjustmentMagnitude.asJson, "MetricAggregationType" -> o.metricAggregationType.asJson, "AdjustmentType" -> o.adjustmentType.asJson, "StepAdjustments" -> o.stepAdjustments.asJson, "Cooldown" -> o.cooldown.asJson)
  }
  final implicit val InternalServiceExceptionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.InternalServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CustomizedMetricSpecificationEncoder: io.circe.Encoder[avias.applicationautoscaling.models.CustomizedMetricSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("Statistic" -> o.statistic.asJson, "Namespace" -> o.namespace.asJson, "MetricName" -> o.metricName.asJson, "Dimensions" -> o.dimensions.asJson, "Unit" -> o.unit.asJson)
  }
  final implicit val DescribeScheduledActionsResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DescribeScheduledActionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ScheduledActions" -> o.scheduledActions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val TargetTrackingScalingPolicyConfigurationEncoder: io.circe.Encoder[avias.applicationautoscaling.models.TargetTrackingScalingPolicyConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("TargetValue" -> o.targetValue.asJson, "CustomizedMetricSpecification" -> o.customizedMetricSpecification.asJson, "ScaleOutCooldown" -> o.scaleOutCooldown.asJson, "ScaleInCooldown" -> o.scaleInCooldown.asJson, "PredefinedMetricSpecification" -> o.predefinedMetricSpecification.asJson, "DisableScaleIn" -> o.disableScaleIn.asJson)
  }
  final implicit val DescribeScalingActivitiesResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DescribeScalingActivitiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ScalingActivities" -> o.scalingActivities.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ScheduledActionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.ScheduledAction] = io.circe.Encoder.instance { o => 
    Json.obj("ScheduledActionARN" -> o.scheduledActionARN.asJson, "Schedule" -> o.schedule.asJson, "ResourceId" -> o.resourceId.asJson, "ServiceNamespace" -> o.serviceNamespace.asJson, "CreationTime" -> o.creationTime.asJson, "ScheduledActionName" -> o.scheduledActionName.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "ScalableDimension" -> o.scalableDimension.asJson, "ScalableTargetAction" -> o.scalableTargetAction.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val RegisterScalableTargetRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.RegisterScalableTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceNamespace" -> o.serviceNamespace.asJson, "ResourceId" -> o.resourceId.asJson, "ScalableDimension" -> o.scalableDimension.asJson, "RoleARN" -> o.roleARN.asJson, "MinCapacity" -> o.minCapacity.asJson, "MaxCapacity" -> o.maxCapacity.asJson)
  }
  final implicit val ScalingPolicyEncoder: io.circe.Encoder[avias.applicationautoscaling.models.ScalingPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyARN" -> o.policyARN.asJson, "ResourceId" -> o.resourceId.asJson, "PolicyType" -> o.policyType.asJson, "ServiceNamespace" -> o.serviceNamespace.asJson, "PolicyName" -> o.policyName.asJson, "CreationTime" -> o.creationTime.asJson, "ScalableDimension" -> o.scalableDimension.asJson, "StepScalingPolicyConfiguration" -> o.stepScalingPolicyConfiguration.asJson, "TargetTrackingScalingPolicyConfiguration" -> o.targetTrackingScalingPolicyConfiguration.asJson, "Alarms" -> o.alarms.asJson)
  }
  final implicit val DeleteScheduledActionRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DeleteScheduledActionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceNamespace" -> o.serviceNamespace.asJson, "ScheduledActionName" -> o.scheduledActionName.asJson, "ResourceId" -> o.resourceId.asJson, "ScalableDimension" -> o.scalableDimension.asJson)
  }
  final implicit val PutScalingPolicyResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.PutScalingPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyARN" -> o.policyARN.asJson, "Alarms" -> o.alarms.asJson)
  }
  final implicit val PredefinedMetricSpecificationEncoder: io.circe.Encoder[avias.applicationautoscaling.models.PredefinedMetricSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("PredefinedMetricType" -> o.predefinedMetricType.asJson, "ResourceLabel" -> o.resourceLabel.asJson)
  }
  final implicit val DescribeScalingPoliciesRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DescribeScalingPoliciesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceNamespace" -> o.serviceNamespace.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson, "ResourceId" -> o.resourceId.asJson, "PolicyNames" -> o.policyNames.asJson, "ScalableDimension" -> o.scalableDimension.asJson)
  }
  final implicit val DeleteScalingPolicyResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DeleteScalingPolicyResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutScalingPolicyRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.PutScalingPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "ServiceNamespace" -> o.serviceNamespace.asJson, "PolicyName" -> o.policyName.asJson, "ScalableDimension" -> o.scalableDimension.asJson, "PolicyType" -> o.policyType.asJson, "StepScalingPolicyConfiguration" -> o.stepScalingPolicyConfiguration.asJson, "TargetTrackingScalingPolicyConfiguration" -> o.targetTrackingScalingPolicyConfiguration.asJson)
  }
  final implicit val DeregisterScalableTargetRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DeregisterScalableTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceNamespace" -> o.serviceNamespace.asJson, "ResourceId" -> o.resourceId.asJson, "ScalableDimension" -> o.scalableDimension.asJson)
  }
  final implicit val ScalingActivityEncoder: io.circe.Encoder[avias.applicationautoscaling.models.ScalingActivity] = io.circe.Encoder.instance { o => 
    Json.obj("Description" -> o.description.asJson, "Cause" -> o.cause.asJson, "ResourceId" -> o.resourceId.asJson, "ServiceNamespace" -> o.serviceNamespace.asJson, "StartTime" -> o.startTime.asJson, "StatusCode" -> o.statusCode.asJson, "ScalableDimension" -> o.scalableDimension.asJson, "ActivityId" -> o.activityId.asJson, "StatusMessage" -> o.statusMessage.asJson, "Details" -> o.details.asJson, "EndTime" -> o.endTime.asJson)
  }
  final implicit val ObjectNotFoundExceptionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.ObjectNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteScheduledActionResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DeleteScheduledActionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StepAdjustmentEncoder: io.circe.Encoder[avias.applicationautoscaling.models.StepAdjustment] = io.circe.Encoder.instance { o => 
    Json.obj("ScalingAdjustment" -> o.scalingAdjustment.asJson, "MetricIntervalLowerBound" -> o.metricIntervalLowerBound.asJson, "MetricIntervalUpperBound" -> o.metricIntervalUpperBound.asJson)
  }
  final implicit val MetricDimensionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.MetricDimension] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val PutScheduledActionRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.PutScheduledActionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "ServiceNamespace" -> o.serviceNamespace.asJson, "ScheduledActionName" -> o.scheduledActionName.asJson, "Schedule" -> o.schedule.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "ScalableDimension" -> o.scalableDimension.asJson, "ScalableTargetAction" -> o.scalableTargetAction.asJson)
  }
  final implicit val AlarmEncoder: io.circe.Encoder[avias.applicationautoscaling.models.Alarm] = io.circe.Encoder.instance { o => 
    Json.obj("AlarmName" -> o.alarmName.asJson, "AlarmARN" -> o.alarmARN.asJson)
  }
  final implicit val ScalableTargetActionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.ScalableTargetAction] = io.circe.Encoder.instance { o => 
    Json.obj("MinCapacity" -> o.minCapacity.asJson, "MaxCapacity" -> o.maxCapacity.asJson)
  }
  final implicit val PutScheduledActionResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.PutScheduledActionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.ValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[avias.applicationautoscaling.models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeScalableTargetsResponseEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DescribeScalableTargetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ScalableTargets" -> o.scalableTargets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeScalableTargetsRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DescribeScalableTargetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceNamespace" -> o.serviceNamespace.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson, "ResourceIds" -> o.resourceIds.asJson, "ScalableDimension" -> o.scalableDimension.asJson)
  }
  final implicit val DeleteScalingPolicyRequestEncoder: io.circe.Encoder[avias.applicationautoscaling.models.DeleteScalingPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyName" -> o.policyName.asJson, "ResourceId" -> o.resourceId.asJson, "ServiceNamespace" -> o.serviceNamespace.asJson, "ScalableDimension" -> o.scalableDimension.asJson)
  }
  final implicit val FailedResourceAccessExceptionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.FailedResourceAccessException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.applicationautoscaling.models.FailedResourceAccessException.apply _)
  }
  final implicit val ScalableTargetDecoder: io.circe.Decoder[avias.applicationautoscaling.models.ScalableTarget] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("RoleARN"), o.get[java.lang.String]("ServiceNamespace"), o.get[java.time.Instant]("CreationTime"), o.get[scala.Int]("MinCapacity"), o.get[scala.Int]("MaxCapacity"), o.get[java.lang.String]("ScalableDimension")).mapN(avias.applicationautoscaling.models.ScalableTarget.apply _)
  }
  final implicit val DescribeScheduledActionsRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DescribeScheduledActionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServiceNamespace"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[scala.List[java.lang.String]]]("ScheduledActionNames"), o.get[scala.Option[java.lang.String]]("ScalableDimension")).mapN(avias.applicationautoscaling.models.DescribeScheduledActionsRequest.apply _)
  }
  final implicit val RegisterScalableTargetResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.RegisterScalableTargetResponse.type] = io.circe.Decoder.decodeUnit.as(avias.applicationautoscaling.models.RegisterScalableTargetResponse)
  final implicit val DescribeScalingPoliciesResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DescribeScalingPoliciesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.applicationautoscaling.models.ScalingPolicy]]]("ScalingPolicies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.applicationautoscaling.models.DescribeScalingPoliciesResponse.apply _)
  }
  final implicit val ConcurrentUpdateExceptionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.ConcurrentUpdateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.applicationautoscaling.models.ConcurrentUpdateException.apply _)
  }
  final implicit val DeregisterScalableTargetResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DeregisterScalableTargetResponse.type] = io.circe.Decoder.decodeUnit.as(avias.applicationautoscaling.models.DeregisterScalableTargetResponse)
  final implicit val DescribeScalingActivitiesRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DescribeScalingActivitiesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServiceNamespace"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[java.lang.String]]("ScalableDimension")).mapN(avias.applicationautoscaling.models.DescribeScalingActivitiesRequest.apply _)
  }
  final implicit val StepScalingPolicyConfigurationDecoder: io.circe.Decoder[avias.applicationautoscaling.models.StepScalingPolicyConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MinAdjustmentMagnitude"), o.get[scala.Option[java.lang.String]]("MetricAggregationType"), o.get[scala.Option[java.lang.String]]("AdjustmentType"), o.get[scala.Option[scala.List[avias.applicationautoscaling.models.StepAdjustment]]]("StepAdjustments"), o.get[scala.Option[scala.Int]]("Cooldown")).mapN(avias.applicationautoscaling.models.StepScalingPolicyConfiguration.apply _)
  }
  final implicit val InternalServiceExceptionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.InternalServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.applicationautoscaling.models.InternalServiceException.apply _)
  }
  final implicit val CustomizedMetricSpecificationDecoder: io.circe.Decoder[avias.applicationautoscaling.models.CustomizedMetricSpecification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Statistic"), o.get[java.lang.String]("Namespace"), o.get[java.lang.String]("MetricName"), o.get[scala.Option[scala.List[avias.applicationautoscaling.models.MetricDimension]]]("Dimensions"), o.get[scala.Option[java.lang.String]]("Unit")).mapN(avias.applicationautoscaling.models.CustomizedMetricSpecification.apply _)
  }
  final implicit val DescribeScheduledActionsResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DescribeScheduledActionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.applicationautoscaling.models.ScheduledAction]]]("ScheduledActions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.applicationautoscaling.models.DescribeScheduledActionsResponse.apply _)
  }
  final implicit val TargetTrackingScalingPolicyConfigurationDecoder: io.circe.Decoder[avias.applicationautoscaling.models.TargetTrackingScalingPolicyConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Double]("TargetValue"), o.get[scala.Option[avias.applicationautoscaling.models.CustomizedMetricSpecification]]("CustomizedMetricSpecification"), o.get[scala.Option[scala.Int]]("ScaleOutCooldown"), o.get[scala.Option[scala.Int]]("ScaleInCooldown"), o.get[scala.Option[avias.applicationautoscaling.models.PredefinedMetricSpecification]]("PredefinedMetricSpecification"), o.get[scala.Option[scala.Boolean]]("DisableScaleIn")).mapN(avias.applicationautoscaling.models.TargetTrackingScalingPolicyConfiguration.apply _)
  }
  final implicit val DescribeScalingActivitiesResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DescribeScalingActivitiesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.applicationautoscaling.models.ScalingActivity]]]("ScalingActivities"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.applicationautoscaling.models.DescribeScalingActivitiesResponse.apply _)
  }
  final implicit val ScheduledActionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.ScheduledAction] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ScheduledActionARN"), o.get[java.lang.String]("Schedule"), o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ServiceNamespace"), o.get[java.time.Instant]("CreationTime"), o.get[java.lang.String]("ScheduledActionName"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("ScalableDimension"), o.get[scala.Option[avias.applicationautoscaling.models.ScalableTargetAction]]("ScalableTargetAction")).mapN(avias.applicationautoscaling.models.ScheduledAction.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.applicationautoscaling.models.LimitExceededException.apply _)
  }
  final implicit val RegisterScalableTargetRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.RegisterScalableTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServiceNamespace"), o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ScalableDimension"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[scala.Int]]("MinCapacity"), o.get[scala.Option[scala.Int]]("MaxCapacity")).mapN(avias.applicationautoscaling.models.RegisterScalableTargetRequest.apply _)
  }
  final implicit val ScalingPolicyDecoder: io.circe.Decoder[avias.applicationautoscaling.models.ScalingPolicy] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyARN"), o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("PolicyType"), o.get[java.lang.String]("ServiceNamespace"), o.get[java.lang.String]("PolicyName"), o.get[java.time.Instant]("CreationTime"), o.get[java.lang.String]("ScalableDimension"), o.get[scala.Option[avias.applicationautoscaling.models.StepScalingPolicyConfiguration]]("StepScalingPolicyConfiguration"), o.get[scala.Option[avias.applicationautoscaling.models.TargetTrackingScalingPolicyConfiguration]]("TargetTrackingScalingPolicyConfiguration"), o.get[scala.Option[scala.List[avias.applicationautoscaling.models.Alarm]]]("Alarms")).mapN(avias.applicationautoscaling.models.ScalingPolicy.apply _)
  }
  final implicit val DeleteScheduledActionRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DeleteScheduledActionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServiceNamespace"), o.get[java.lang.String]("ScheduledActionName"), o.get[java.lang.String]("ResourceId"), o.get[scala.Option[java.lang.String]]("ScalableDimension")).mapN(avias.applicationautoscaling.models.DeleteScheduledActionRequest.apply _)
  }
  final implicit val PutScalingPolicyResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.PutScalingPolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyARN"), o.get[scala.Option[scala.List[avias.applicationautoscaling.models.Alarm]]]("Alarms")).mapN(avias.applicationautoscaling.models.PutScalingPolicyResponse.apply _)
  }
  final implicit val PredefinedMetricSpecificationDecoder: io.circe.Decoder[avias.applicationautoscaling.models.PredefinedMetricSpecification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PredefinedMetricType"), o.get[scala.Option[java.lang.String]]("ResourceLabel")).mapN(avias.applicationautoscaling.models.PredefinedMetricSpecification.apply _)
  }
  final implicit val DescribeScalingPoliciesRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DescribeScalingPoliciesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServiceNamespace"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[scala.List[java.lang.String]]]("PolicyNames"), o.get[scala.Option[java.lang.String]]("ScalableDimension")).mapN(avias.applicationautoscaling.models.DescribeScalingPoliciesRequest.apply _)
  }
  final implicit val DeleteScalingPolicyResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DeleteScalingPolicyResponse.type] = io.circe.Decoder.decodeUnit.as(avias.applicationautoscaling.models.DeleteScalingPolicyResponse)
  final implicit val PutScalingPolicyRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.PutScalingPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ServiceNamespace"), o.get[java.lang.String]("PolicyName"), o.get[java.lang.String]("ScalableDimension"), o.get[scala.Option[java.lang.String]]("PolicyType"), o.get[scala.Option[avias.applicationautoscaling.models.StepScalingPolicyConfiguration]]("StepScalingPolicyConfiguration"), o.get[scala.Option[avias.applicationautoscaling.models.TargetTrackingScalingPolicyConfiguration]]("TargetTrackingScalingPolicyConfiguration")).mapN(avias.applicationautoscaling.models.PutScalingPolicyRequest.apply _)
  }
  final implicit val DeregisterScalableTargetRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DeregisterScalableTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServiceNamespace"), o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ScalableDimension")).mapN(avias.applicationautoscaling.models.DeregisterScalableTargetRequest.apply _)
  }
  final implicit val ScalingActivityDecoder: io.circe.Decoder[avias.applicationautoscaling.models.ScalingActivity] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Description"), o.get[java.lang.String]("Cause"), o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ServiceNamespace"), o.get[java.time.Instant]("StartTime"), o.get[java.lang.String]("StatusCode"), o.get[java.lang.String]("ScalableDimension"), o.get[java.lang.String]("ActivityId"), o.get[scala.Option[java.lang.String]]("StatusMessage"), o.get[scala.Option[java.lang.String]]("Details"), o.get[scala.Option[java.time.Instant]]("EndTime")).mapN(avias.applicationautoscaling.models.ScalingActivity.apply _)
  }
  final implicit val ObjectNotFoundExceptionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.ObjectNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.applicationautoscaling.models.ObjectNotFoundException.apply _)
  }
  final implicit val DeleteScheduledActionResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DeleteScheduledActionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.applicationautoscaling.models.DeleteScheduledActionResponse)
  final implicit val StepAdjustmentDecoder: io.circe.Decoder[avias.applicationautoscaling.models.StepAdjustment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("ScalingAdjustment"), o.get[scala.Option[scala.Double]]("MetricIntervalLowerBound"), o.get[scala.Option[scala.Double]]("MetricIntervalUpperBound")).mapN(avias.applicationautoscaling.models.StepAdjustment.apply _)
  }
  final implicit val MetricDimensionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.MetricDimension] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Value")).mapN(avias.applicationautoscaling.models.MetricDimension.apply _)
  }
  final implicit val PutScheduledActionRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.PutScheduledActionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ServiceNamespace"), o.get[java.lang.String]("ScheduledActionName"), o.get[scala.Option[java.lang.String]]("Schedule"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("ScalableDimension"), o.get[scala.Option[avias.applicationautoscaling.models.ScalableTargetAction]]("ScalableTargetAction")).mapN(avias.applicationautoscaling.models.PutScheduledActionRequest.apply _)
  }
  final implicit val AlarmDecoder: io.circe.Decoder[avias.applicationautoscaling.models.Alarm] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AlarmName"), o.get[java.lang.String]("AlarmARN")).mapN(avias.applicationautoscaling.models.Alarm.apply _)
  }
  final implicit val ScalableTargetActionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.ScalableTargetAction] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MinCapacity"), o.get[scala.Option[scala.Int]]("MaxCapacity")).mapN(avias.applicationautoscaling.models.ScalableTargetAction.apply _)
  }
  final implicit val PutScheduledActionResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.PutScheduledActionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.applicationautoscaling.models.PutScheduledActionResponse)
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.ValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.applicationautoscaling.models.ValidationException.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[avias.applicationautoscaling.models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.applicationautoscaling.models.InvalidNextTokenException.apply _)
  }
  final implicit val DescribeScalableTargetsResponseDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DescribeScalableTargetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.applicationautoscaling.models.ScalableTarget]]]("ScalableTargets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.applicationautoscaling.models.DescribeScalableTargetsResponse.apply _)
  }
  final implicit val DescribeScalableTargetsRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DescribeScalableTargetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServiceNamespace"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[java.lang.String]]]("ResourceIds"), o.get[scala.Option[java.lang.String]]("ScalableDimension")).mapN(avias.applicationautoscaling.models.DescribeScalableTargetsRequest.apply _)
  }
  final implicit val DeleteScalingPolicyRequestDecoder: io.circe.Decoder[avias.applicationautoscaling.models.DeleteScalingPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyName"), o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ServiceNamespace"), o.get[java.lang.String]("ScalableDimension")).mapN(avias.applicationautoscaling.models.DeleteScalingPolicyRequest.apply _)
  }
}