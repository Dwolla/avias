package avias.logs
trait Amazonlogs[F[_]] {
  def putRetentionPolicy(input: avias.logs.models.PutRetentionPolicyRequest): F[scala.Unit]
  def disassociateKmsKey(input: avias.logs.models.DisassociateKmsKeyRequest): F[scala.Unit]
  def putLogEvents(input: avias.logs.models.PutLogEventsRequest): F[avias.logs.models.PutLogEventsResponse]
  def describeResourcePolicies(input: avias.logs.models.DescribeResourcePoliciesRequest): F[avias.logs.models.DescribeResourcePoliciesResponse]
  def describeExportTasks(input: avias.logs.models.DescribeExportTasksRequest): F[avias.logs.models.DescribeExportTasksResponse]
  def putDestination(input: avias.logs.models.PutDestinationRequest): F[avias.logs.models.PutDestinationResponse]
  def describeSubscriptionFilters(input: avias.logs.models.DescribeSubscriptionFiltersRequest): F[avias.logs.models.DescribeSubscriptionFiltersResponse]
  def listTagsLogGroup(input: avias.logs.models.ListTagsLogGroupRequest): F[avias.logs.models.ListTagsLogGroupResponse]
  def tagLogGroup(input: avias.logs.models.TagLogGroupRequest): F[scala.Unit]
  def deleteResourcePolicy(input: avias.logs.models.DeleteResourcePolicyRequest): F[scala.Unit]
  def createExportTask(input: avias.logs.models.CreateExportTaskRequest): F[avias.logs.models.CreateExportTaskResponse]
  def deleteDestination(input: avias.logs.models.DeleteDestinationRequest): F[scala.Unit]
  def deleteRetentionPolicy(input: avias.logs.models.DeleteRetentionPolicyRequest): F[scala.Unit]
  def deleteLogStream(input: avias.logs.models.DeleteLogStreamRequest): F[scala.Unit]
  def deleteLogGroup(input: avias.logs.models.DeleteLogGroupRequest): F[scala.Unit]
  def getLogEvents(input: avias.logs.models.GetLogEventsRequest): F[avias.logs.models.GetLogEventsResponse]
  def describeMetricFilters(input: avias.logs.models.DescribeMetricFiltersRequest): F[avias.logs.models.DescribeMetricFiltersResponse]
  def putDestinationPolicy(input: avias.logs.models.PutDestinationPolicyRequest): F[scala.Unit]
  def putSubscriptionFilter(input: avias.logs.models.PutSubscriptionFilterRequest): F[scala.Unit]
  def describeLogStreams(input: avias.logs.models.DescribeLogStreamsRequest): F[avias.logs.models.DescribeLogStreamsResponse]
  def associateKmsKey(input: avias.logs.models.AssociateKmsKeyRequest): F[scala.Unit]
  def filterLogEvents(input: avias.logs.models.FilterLogEventsRequest): F[avias.logs.models.FilterLogEventsResponse]
  def describeDestinations(input: avias.logs.models.DescribeDestinationsRequest): F[avias.logs.models.DescribeDestinationsResponse]
  def createLogStream(input: avias.logs.models.CreateLogStreamRequest): F[scala.Unit]
  def cancelExportTask(input: avias.logs.models.CancelExportTaskRequest): F[scala.Unit]
  def deleteSubscriptionFilter(input: avias.logs.models.DeleteSubscriptionFilterRequest): F[scala.Unit]
  def untagLogGroup(input: avias.logs.models.UntagLogGroupRequest): F[scala.Unit]
  def deleteMetricFilter(input: avias.logs.models.DeleteMetricFilterRequest): F[scala.Unit]
  def testMetricFilter(input: avias.logs.models.TestMetricFilterRequest): F[avias.logs.models.TestMetricFilterResponse]
  def putResourcePolicy(input: avias.logs.models.PutResourcePolicyRequest): F[avias.logs.models.PutResourcePolicyResponse]
  def putMetricFilter(input: avias.logs.models.PutMetricFilterRequest): F[scala.Unit]
  def createLogGroup(input: avias.logs.models.CreateLogGroupRequest): F[scala.Unit]
  def describeLogGroups(input: avias.logs.models.DescribeLogGroupsRequest): F[avias.logs.models.DescribeLogGroupsResponse]
}