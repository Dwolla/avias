package org.lyranthe.araethura.discovery.http4s
import org.http4s.Method._
import org.lyranthe.araethura.discovery.circe._
import org.lyranthe.araethura.discovery.models
class AmazondiscoveryClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.discovery.Amazondiscovery[F] {
  private[this] final val ServiceType: String = "discovery"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSPoseidonService_V2015_11_01")
  override def listConfigurations(input: models.ListConfigurationsRequest): F[models.ListConfigurationsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListConfigurationsResponse, models.ListConfigurationsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListConfigurations", POST, "/", input)
  override def listServerNeighbors(input: models.ListServerNeighborsRequest): F[models.ListServerNeighborsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListServerNeighborsResponse, models.ListServerNeighborsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListServerNeighbors", POST, "/", input)
  override def deleteTags(input: models.DeleteTagsRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteTags", POST, "/", input)
  override def describeAgents(input: models.DescribeAgentsRequest): F[models.DescribeAgentsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeAgentsResponse, models.DescribeAgentsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAgents", POST, "/", input)
  override def createTags(input: models.CreateTagsRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.CreateTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateTags", POST, "/", input)
  override def describeTags(input: models.DescribeTagsRequest): F[models.DescribeTagsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeTagsResponse, models.DescribeTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTags", POST, "/", input)
  override def describeExportConfigurations(input: models.DescribeExportConfigurationsRequest): F[models.DescribeExportConfigurationsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeExportConfigurationsResponse, models.DescribeExportConfigurationsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeExportConfigurations", POST, "/", input)
  override def updateApplication(input: models.UpdateApplicationRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.UpdateApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateApplication", POST, "/", input)
  override def startDataCollectionByAgentIds(input: models.StartDataCollectionByAgentIdsRequest): F[models.StartDataCollectionByAgentIdsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StartDataCollectionByAgentIdsResponse, models.StartDataCollectionByAgentIdsRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartDataCollectionByAgentIds", POST, "/", input)
  override def createApplication(input: models.CreateApplicationRequest): F[models.CreateApplicationResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateApplicationResponse, models.CreateApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateApplication", POST, "/", input)
  override def startExportTask(input: models.StartExportTaskRequest): F[models.StartExportTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StartExportTaskResponse, models.StartExportTaskRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartExportTask", POST, "/", input)
  override def exportConfigurations: F[models.ExportConfigurationsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequestWithoutBody[F, models.ExportConfigurationsResponse](client, awsData, ServiceType, ServiceAndPrefix, "ExportConfigurations", POST, "/")
  override def associateConfigurationItemsToApplication(input: models.AssociateConfigurationItemsToApplicationRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.AssociateConfigurationItemsToApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "AssociateConfigurationItemsToApplication", POST, "/", input)
  override def stopDataCollectionByAgentIds(input: models.StopDataCollectionByAgentIdsRequest): F[models.StopDataCollectionByAgentIdsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StopDataCollectionByAgentIdsResponse, models.StopDataCollectionByAgentIdsRequest](client, awsData, ServiceType, ServiceAndPrefix, "StopDataCollectionByAgentIds", POST, "/", input)
  override def disassociateConfigurationItemsFromApplication(input: models.DisassociateConfigurationItemsFromApplicationRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DisassociateConfigurationItemsFromApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "DisassociateConfigurationItemsFromApplication", POST, "/", input)
  override def describeExportTasks(input: models.DescribeExportTasksRequest): F[models.DescribeExportTasksResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeExportTasksResponse, models.DescribeExportTasksRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeExportTasks", POST, "/", input)
  override def getDiscoverySummary: F[models.GetDiscoverySummaryResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetDiscoverySummaryResponse, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "GetDiscoverySummary", POST, "/", ())
  override def describeConfigurations(input: models.DescribeConfigurationsRequest): F[models.DescribeConfigurationsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeConfigurationsResponse, models.DescribeConfigurationsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeConfigurations", POST, "/", input)
  override def deleteApplications(input: models.DeleteApplicationsRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteApplicationsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteApplications", POST, "/", input)
}