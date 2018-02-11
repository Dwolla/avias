package org.lyranthe.araethura.directory
trait Amazondirectory[F[_]] {
  def connectDirectory(input: models.ConnectDirectoryRequest): F[models.ConnectDirectoryResult]
  def removeIpRoutes(input: models.RemoveIpRoutesRequest): F[scala.Unit]
  def deregisterEventTopic(input: models.DeregisterEventTopicRequest): F[scala.Unit]
  def createAlias(input: models.CreateAliasRequest): F[models.CreateAliasResult]
  def restoreFromSnapshot(input: models.RestoreFromSnapshotRequest): F[scala.Unit]
  def disableSso(input: models.DisableSsoRequest): F[scala.Unit]
  def createTrust(input: models.CreateTrustRequest): F[models.CreateTrustResult]
  def disableRadius(input: models.DisableRadiusRequest): F[scala.Unit]
  def updateConditionalForwarder(input: models.UpdateConditionalForwarderRequest): F[scala.Unit]
  def deleteDirectory(input: models.DeleteDirectoryRequest): F[models.DeleteDirectoryResult]
  def describeTrusts(input: models.DescribeTrustsRequest): F[models.DescribeTrustsResult]
  def cancelSchemaExtension(input: models.CancelSchemaExtensionRequest): F[scala.Unit]
  def listIpRoutes(input: models.ListIpRoutesRequest): F[models.ListIpRoutesResult]
  def getSnapshotLimits(input: models.GetSnapshotLimitsRequest): F[models.GetSnapshotLimitsResult]
  def createDirectory(input: models.CreateDirectoryRequest): F[models.CreateDirectoryResult]
  def describeEventTopics(input: models.DescribeEventTopicsRequest): F[models.DescribeEventTopicsResult]
  def describeSnapshots(input: models.DescribeSnapshotsRequest): F[models.DescribeSnapshotsResult]
  def deleteSnapshot(input: models.DeleteSnapshotRequest): F[models.DeleteSnapshotResult]
  def enableSso(input: models.EnableSsoRequest): F[scala.Unit]
  def createConditionalForwarder(input: models.CreateConditionalForwarderRequest): F[scala.Unit]
  def addTagsToResource(input: models.AddTagsToResourceRequest): F[scala.Unit]
  def getDirectoryLimits: F[models.GetDirectoryLimitsResult]
  def listTagsForResource(input: models.ListTagsForResourceRequest): F[models.ListTagsForResourceResult]
  def describeDirectories(input: models.DescribeDirectoriesRequest): F[models.DescribeDirectoriesResult]
  def removeTagsFromResource(input: models.RemoveTagsFromResourceRequest): F[scala.Unit]
  def createComputer(input: models.CreateComputerRequest): F[models.CreateComputerResult]
  def registerEventTopic(input: models.RegisterEventTopicRequest): F[scala.Unit]
  def deleteTrust(input: models.DeleteTrustRequest): F[models.DeleteTrustResult]
  def createMicrosoftAD(input: models.CreateMicrosoftADRequest): F[models.CreateMicrosoftADResult]
  def verifyTrust(input: models.VerifyTrustRequest): F[models.VerifyTrustResult]
  def deleteConditionalForwarder(input: models.DeleteConditionalForwarderRequest): F[scala.Unit]
  def startSchemaExtension(input: models.StartSchemaExtensionRequest): F[models.StartSchemaExtensionResult]
  def createSnapshot(input: models.CreateSnapshotRequest): F[models.CreateSnapshotResult]
  def describeConditionalForwarders(input: models.DescribeConditionalForwardersRequest): F[models.DescribeConditionalForwardersResult]
  def describeDomainControllers(input: models.DescribeDomainControllersRequest): F[models.DescribeDomainControllersResult]
  def listSchemaExtensions(input: models.ListSchemaExtensionsRequest): F[models.ListSchemaExtensionsResult]
  def updateRadius(input: models.UpdateRadiusRequest): F[scala.Unit]
  def enableRadius(input: models.EnableRadiusRequest): F[scala.Unit]
  def updateNumberOfDomainControllers(input: models.UpdateNumberOfDomainControllersRequest): F[scala.Unit]
  def addIpRoutes(input: models.AddIpRoutesRequest): F[scala.Unit]
}