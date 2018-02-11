package org.lyranthe.araethura.support.http4s
import org.http4s.Method._
import org.lyranthe.araethura.support.circe._
import org.lyranthe.araethura.support.models
class AmazonsupportClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.support.Amazonsupport[F] {
  private[this] final val ServiceType: String = "support"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSSupport_20130415")
  override def describeServices(input: models.DescribeServicesRequest): F[models.DescribeServicesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeServicesResponse, models.DescribeServicesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeServices", POST, "/", input)
  override def describeTrustedAdvisorCheckSummaries(input: models.DescribeTrustedAdvisorCheckSummariesRequest): F[models.DescribeTrustedAdvisorCheckSummariesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeTrustedAdvisorCheckSummariesResponse, models.DescribeTrustedAdvisorCheckSummariesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrustedAdvisorCheckSummaries", POST, "/", input)
  override def describeTrustedAdvisorCheckRefreshStatuses(input: models.DescribeTrustedAdvisorCheckRefreshStatusesRequest): F[models.DescribeTrustedAdvisorCheckRefreshStatusesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeTrustedAdvisorCheckRefreshStatusesResponse, models.DescribeTrustedAdvisorCheckRefreshStatusesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrustedAdvisorCheckRefreshStatuses", POST, "/", input)
  override def describeTrustedAdvisorCheckResult(input: models.DescribeTrustedAdvisorCheckResultRequest): F[models.DescribeTrustedAdvisorCheckResultResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeTrustedAdvisorCheckResultResponse, models.DescribeTrustedAdvisorCheckResultRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrustedAdvisorCheckResult", POST, "/", input)
  override def addCommunicationToCase(input: models.AddCommunicationToCaseRequest): F[models.AddCommunicationToCaseResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.AddCommunicationToCaseResponse, models.AddCommunicationToCaseRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddCommunicationToCase", POST, "/", input)
  override def addAttachmentsToSet(input: models.AddAttachmentsToSetRequest): F[models.AddAttachmentsToSetResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.AddAttachmentsToSetResponse, models.AddAttachmentsToSetRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddAttachmentsToSet", POST, "/", input)
  override def refreshTrustedAdvisorCheck(input: models.RefreshTrustedAdvisorCheckRequest): F[models.RefreshTrustedAdvisorCheckResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.RefreshTrustedAdvisorCheckResponse, models.RefreshTrustedAdvisorCheckRequest](client, awsData, ServiceType, ServiceAndPrefix, "RefreshTrustedAdvisorCheck", POST, "/", input)
  override def describeSeverityLevels(input: models.DescribeSeverityLevelsRequest): F[models.DescribeSeverityLevelsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeSeverityLevelsResponse, models.DescribeSeverityLevelsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeSeverityLevels", POST, "/", input)
  override def resolveCase(input: models.ResolveCaseRequest): F[models.ResolveCaseResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ResolveCaseResponse, models.ResolveCaseRequest](client, awsData, ServiceType, ServiceAndPrefix, "ResolveCase", POST, "/", input)
  override def describeCommunications(input: models.DescribeCommunicationsRequest): F[models.DescribeCommunicationsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeCommunicationsResponse, models.DescribeCommunicationsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeCommunications", POST, "/", input)
  override def describeCases(input: models.DescribeCasesRequest): F[models.DescribeCasesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeCasesResponse, models.DescribeCasesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeCases", POST, "/", input)
  override def createCase(input: models.CreateCaseRequest): F[models.CreateCaseResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateCaseResponse, models.CreateCaseRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateCase", POST, "/", input)
  override def describeTrustedAdvisorChecks(input: models.DescribeTrustedAdvisorChecksRequest): F[models.DescribeTrustedAdvisorChecksResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeTrustedAdvisorChecksResponse, models.DescribeTrustedAdvisorChecksRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrustedAdvisorChecks", POST, "/", input)
  override def describeAttachment(input: models.DescribeAttachmentRequest): F[models.DescribeAttachmentResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeAttachmentResponse, models.DescribeAttachmentRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAttachment", POST, "/", input)
}