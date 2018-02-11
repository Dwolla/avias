package org.lyranthe.araethura.dms.http4s
import org.http4s.Method._
import org.lyranthe.araethura.dms.circe._
import org.lyranthe.araethura.dms.models
class AmazondmsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.dms.Amazondms[F] {
  private[this] final val ServiceType: String = "dms"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AmazonDMSv20160101")
  override def describeTableStatistics(input: models.DescribeTableStatisticsMessage): F[models.DescribeTableStatisticsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeTableStatisticsResponse, models.DescribeTableStatisticsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTableStatistics", POST, "/", input)
  override def modifyEventSubscription(input: models.ModifyEventSubscriptionMessage): F[models.ModifyEventSubscriptionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ModifyEventSubscriptionResponse, models.ModifyEventSubscriptionMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyEventSubscription", POST, "/", input)
  override def describeReplicationInstances(input: models.DescribeReplicationInstancesMessage): F[models.DescribeReplicationInstancesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeReplicationInstancesResponse, models.DescribeReplicationInstancesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReplicationInstances", POST, "/", input)
  override def describeCertificates(input: models.DescribeCertificatesMessage): F[models.DescribeCertificatesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeCertificatesResponse, models.DescribeCertificatesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeCertificates", POST, "/", input)
  override def deleteCertificate(input: models.DeleteCertificateMessage): F[models.DeleteCertificateResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DeleteCertificateResponse, models.DeleteCertificateMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteCertificate", POST, "/", input)
  override def stopReplicationTask(input: models.StopReplicationTaskMessage): F[models.StopReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StopReplicationTaskResponse, models.StopReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "StopReplicationTask", POST, "/", input)
  override def describeEndpointTypes(input: models.DescribeEndpointTypesMessage): F[models.DescribeEndpointTypesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEndpointTypesResponse, models.DescribeEndpointTypesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEndpointTypes", POST, "/", input)
  override def startReplicationTaskAssessment(input: models.StartReplicationTaskAssessmentMessage): F[models.StartReplicationTaskAssessmentResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StartReplicationTaskAssessmentResponse, models.StartReplicationTaskAssessmentMessage](client, awsData, ServiceType, ServiceAndPrefix, "StartReplicationTaskAssessment", POST, "/", input)
  override def modifyReplicationTask(input: models.ModifyReplicationTaskMessage): F[models.ModifyReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ModifyReplicationTaskResponse, models.ModifyReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyReplicationTask", POST, "/", input)
  override def deleteReplicationTask(input: models.DeleteReplicationTaskMessage): F[models.DeleteReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DeleteReplicationTaskResponse, models.DeleteReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReplicationTask", POST, "/", input)
  override def startReplicationTask(input: models.StartReplicationTaskMessage): F[models.StartReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StartReplicationTaskResponse, models.StartReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "StartReplicationTask", POST, "/", input)
  override def createReplicationInstance(input: models.CreateReplicationInstanceMessage): F[models.CreateReplicationInstanceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateReplicationInstanceResponse, models.CreateReplicationInstanceMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateReplicationInstance", POST, "/", input)
  override def describeEventCategories(input: models.DescribeEventCategoriesMessage): F[models.DescribeEventCategoriesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEventCategoriesResponse, models.DescribeEventCategoriesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventCategories", POST, "/", input)
  override def deleteEventSubscription(input: models.DeleteEventSubscriptionMessage): F[models.DeleteEventSubscriptionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DeleteEventSubscriptionResponse, models.DeleteEventSubscriptionMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteEventSubscription", POST, "/", input)
  override def testConnection(input: models.TestConnectionMessage): F[models.TestConnectionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.TestConnectionResponse, models.TestConnectionMessage](client, awsData, ServiceType, ServiceAndPrefix, "TestConnection", POST, "/", input)
  override def describeConnections(input: models.DescribeConnectionsMessage): F[models.DescribeConnectionsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeConnectionsResponse, models.DescribeConnectionsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeConnections", POST, "/", input)
  override def listTagsForResource(input: models.ListTagsForResourceMessage): F[models.ListTagsForResourceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListTagsForResourceResponse, models.ListTagsForResourceMessage](client, awsData, ServiceType, ServiceAndPrefix, "ListTagsForResource", POST, "/", input)
  override def createEventSubscription(input: models.CreateEventSubscriptionMessage): F[models.CreateEventSubscriptionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateEventSubscriptionResponse, models.CreateEventSubscriptionMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateEventSubscription", POST, "/", input)
  override def describeOrderableReplicationInstances(input: models.DescribeOrderableReplicationInstancesMessage): F[models.DescribeOrderableReplicationInstancesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeOrderableReplicationInstancesResponse, models.DescribeOrderableReplicationInstancesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeOrderableReplicationInstances", POST, "/", input)
  override def describeReplicationTasks(input: models.DescribeReplicationTasksMessage): F[models.DescribeReplicationTasksResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeReplicationTasksResponse, models.DescribeReplicationTasksMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReplicationTasks", POST, "/", input)
  override def modifyReplicationSubnetGroup(input: models.ModifyReplicationSubnetGroupMessage): F[models.ModifyReplicationSubnetGroupResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ModifyReplicationSubnetGroupResponse, models.ModifyReplicationSubnetGroupMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyReplicationSubnetGroup", POST, "/", input)
  override def describeReplicationTaskAssessmentResults(input: models.DescribeReplicationTaskAssessmentResultsMessage): F[models.DescribeReplicationTaskAssessmentResultsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeReplicationTaskAssessmentResultsResponse, models.DescribeReplicationTaskAssessmentResultsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReplicationTaskAssessmentResults", POST, "/", input)
  override def describeReplicationSubnetGroups(input: models.DescribeReplicationSubnetGroupsMessage): F[models.DescribeReplicationSubnetGroupsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeReplicationSubnetGroupsResponse, models.DescribeReplicationSubnetGroupsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReplicationSubnetGroups", POST, "/", input)
  override def deleteReplicationInstance(input: models.DeleteReplicationInstanceMessage): F[models.DeleteReplicationInstanceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DeleteReplicationInstanceResponse, models.DeleteReplicationInstanceMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReplicationInstance", POST, "/", input)
  override def createReplicationSubnetGroup(input: models.CreateReplicationSubnetGroupMessage): F[models.CreateReplicationSubnetGroupResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateReplicationSubnetGroupResponse, models.CreateReplicationSubnetGroupMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateReplicationSubnetGroup", POST, "/", input)
  override def createReplicationTask(input: models.CreateReplicationTaskMessage): F[models.CreateReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateReplicationTaskResponse, models.CreateReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateReplicationTask", POST, "/", input)
  override def addTagsToResource(input: models.AddTagsToResourceMessage): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.AddTagsToResourceMessage](client, awsData, ServiceType, ServiceAndPrefix, "AddTagsToResource", POST, "/", input)
  override def describeEndpoints(input: models.DescribeEndpointsMessage): F[models.DescribeEndpointsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEndpointsResponse, models.DescribeEndpointsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEndpoints", POST, "/", input)
  override def removeTagsFromResource(input: models.RemoveTagsFromResourceMessage): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.RemoveTagsFromResourceMessage](client, awsData, ServiceType, ServiceAndPrefix, "RemoveTagsFromResource", POST, "/", input)
  override def importCertificate(input: models.ImportCertificateMessage): F[models.ImportCertificateResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ImportCertificateResponse, models.ImportCertificateMessage](client, awsData, ServiceType, ServiceAndPrefix, "ImportCertificate", POST, "/", input)
  override def modifyEndpoint(input: models.ModifyEndpointMessage): F[models.ModifyEndpointResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ModifyEndpointResponse, models.ModifyEndpointMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyEndpoint", POST, "/", input)
  override def describeEventSubscriptions(input: models.DescribeEventSubscriptionsMessage): F[models.DescribeEventSubscriptionsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEventSubscriptionsResponse, models.DescribeEventSubscriptionsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventSubscriptions", POST, "/", input)
  override def deleteReplicationSubnetGroup(input: models.DeleteReplicationSubnetGroupMessage): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteReplicationSubnetGroupMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReplicationSubnetGroup", POST, "/", input)
  override def describeEvents(input: models.DescribeEventsMessage): F[models.DescribeEventsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEventsResponse, models.DescribeEventsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEvents", POST, "/", input)
  override def describeRefreshSchemasStatus(input: models.DescribeRefreshSchemasStatusMessage): F[models.DescribeRefreshSchemasStatusResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeRefreshSchemasStatusResponse, models.DescribeRefreshSchemasStatusMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeRefreshSchemasStatus", POST, "/", input)
  override def describeAccountAttributes: F[models.DescribeAccountAttributesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeAccountAttributesResponse, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAccountAttributes", POST, "/", ())
  override def refreshSchemas(input: models.RefreshSchemasMessage): F[models.RefreshSchemasResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.RefreshSchemasResponse, models.RefreshSchemasMessage](client, awsData, ServiceType, ServiceAndPrefix, "RefreshSchemas", POST, "/", input)
  override def reloadTables(input: models.ReloadTablesMessage): F[models.ReloadTablesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ReloadTablesResponse, models.ReloadTablesMessage](client, awsData, ServiceType, ServiceAndPrefix, "ReloadTables", POST, "/", input)
  override def deleteEndpoint(input: models.DeleteEndpointMessage): F[models.DeleteEndpointResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DeleteEndpointResponse, models.DeleteEndpointMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteEndpoint", POST, "/", input)
  override def createEndpoint(input: models.CreateEndpointMessage): F[models.CreateEndpointResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateEndpointResponse, models.CreateEndpointMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateEndpoint", POST, "/", input)
  override def modifyReplicationInstance(input: models.ModifyReplicationInstanceMessage): F[models.ModifyReplicationInstanceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ModifyReplicationInstanceResponse, models.ModifyReplicationInstanceMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyReplicationInstance", POST, "/", input)
  override def describeSchemas(input: models.DescribeSchemasMessage): F[models.DescribeSchemasResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeSchemasResponse, models.DescribeSchemasMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeSchemas", POST, "/", input)
}