package org.lyranthe.araethura.gamelift.http4s
import org.http4s.Method._
import org.lyranthe.araethura.gamelift.circe._
import org.lyranthe.araethura.gamelift.models
class AmazongameliftClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.gamelift.Amazongamelift[F] {
  private[this] final val ServiceType: String = "gamelift"
  private[this] final val ServiceAndPrefix: Option[String] = Some("GameLift")
  override def describeVpcPeeringAuthorizations: F[models.DescribeVpcPeeringAuthorizationsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeVpcPeeringAuthorizationsOutput, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DescribeVpcPeeringAuthorizations", POST, "/", ())
  override def createPlayerSession(input: models.CreatePlayerSessionInput): F[models.CreatePlayerSessionOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreatePlayerSessionOutput, models.CreatePlayerSessionInput](client, awsData, ServiceType, ServiceAndPrefix, "CreatePlayerSession", POST, "/", input)
  override def updateGameSession(input: models.UpdateGameSessionInput): F[models.UpdateGameSessionOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateGameSessionOutput, models.UpdateGameSessionInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateGameSession", POST, "/", input)
  override def describeGameSessionDetails(input: models.DescribeGameSessionDetailsInput): F[models.DescribeGameSessionDetailsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeGameSessionDetailsOutput, models.DescribeGameSessionDetailsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeGameSessionDetails", POST, "/", input)
  override def stopGameSessionPlacement(input: models.StopGameSessionPlacementInput): F[models.StopGameSessionPlacementOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StopGameSessionPlacementOutput, models.StopGameSessionPlacementInput](client, awsData, ServiceType, ServiceAndPrefix, "StopGameSessionPlacement", POST, "/", input)
  override def validateMatchmakingRuleSet(input: models.ValidateMatchmakingRuleSetInput): F[models.ValidateMatchmakingRuleSetOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ValidateMatchmakingRuleSetOutput, models.ValidateMatchmakingRuleSetInput](client, awsData, ServiceType, ServiceAndPrefix, "ValidateMatchmakingRuleSet", POST, "/", input)
  override def listAliases(input: models.ListAliasesInput): F[models.ListAliasesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListAliasesOutput, models.ListAliasesInput](client, awsData, ServiceType, ServiceAndPrefix, "ListAliases", POST, "/", input)
  override def getGameSessionLogUrl(input: models.GetGameSessionLogUrlInput): F[models.GetGameSessionLogUrlOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetGameSessionLogUrlOutput, models.GetGameSessionLogUrlInput](client, awsData, ServiceType, ServiceAndPrefix, "GetGameSessionLogUrl", POST, "/", input)
  override def describeMatchmaking(input: models.DescribeMatchmakingInput): F[models.DescribeMatchmakingOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeMatchmakingOutput, models.DescribeMatchmakingInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeMatchmaking", POST, "/", input)
  override def searchGameSessions(input: models.SearchGameSessionsInput): F[models.SearchGameSessionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.SearchGameSessionsOutput, models.SearchGameSessionsInput](client, awsData, ServiceType, ServiceAndPrefix, "SearchGameSessions", POST, "/", input)
  override def describeRuntimeConfiguration(input: models.DescribeRuntimeConfigurationInput): F[models.DescribeRuntimeConfigurationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeRuntimeConfigurationOutput, models.DescribeRuntimeConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeRuntimeConfiguration", POST, "/", input)
  override def stopMatchmaking(input: models.StopMatchmakingInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.StopMatchmakingInput](client, awsData, ServiceType, ServiceAndPrefix, "StopMatchmaking", POST, "/", input)
  override def updateFleetCapacity(input: models.UpdateFleetCapacityInput): F[models.UpdateFleetCapacityOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateFleetCapacityOutput, models.UpdateFleetCapacityInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateFleetCapacity", POST, "/", input)
  override def describeMatchmakingRuleSets(input: models.DescribeMatchmakingRuleSetsInput): F[models.DescribeMatchmakingRuleSetsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeMatchmakingRuleSetsOutput, models.DescribeMatchmakingRuleSetsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeMatchmakingRuleSets", POST, "/", input)
  override def describeScalingPolicies(input: models.DescribeScalingPoliciesInput): F[models.DescribeScalingPoliciesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeScalingPoliciesOutput, models.DescribeScalingPoliciesInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeScalingPolicies", POST, "/", input)
  override def createAlias(input: models.CreateAliasInput): F[models.CreateAliasOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateAliasOutput, models.CreateAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateAlias", POST, "/", input)
  override def createBuild(input: models.CreateBuildInput): F[models.CreateBuildOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateBuildOutput, models.CreateBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateBuild", POST, "/", input)
  override def createVpcPeeringConnection(input: models.CreateVpcPeeringConnectionInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.CreateVpcPeeringConnectionInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateVpcPeeringConnection", POST, "/", input)
  override def describeBuild(input: models.DescribeBuildInput): F[models.DescribeBuildOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeBuildOutput, models.DescribeBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeBuild", POST, "/", input)
  override def createGameSession(input: models.CreateGameSessionInput): F[models.CreateGameSessionOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateGameSessionOutput, models.CreateGameSessionInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateGameSession", POST, "/", input)
  override def createVpcPeeringAuthorization(input: models.CreateVpcPeeringAuthorizationInput): F[models.CreateVpcPeeringAuthorizationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateVpcPeeringAuthorizationOutput, models.CreateVpcPeeringAuthorizationInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateVpcPeeringAuthorization", POST, "/", input)
  override def describeFleetPortSettings(input: models.DescribeFleetPortSettingsInput): F[models.DescribeFleetPortSettingsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeFleetPortSettingsOutput, models.DescribeFleetPortSettingsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetPortSettings", POST, "/", input)
  override def deleteMatchmakingConfiguration(input: models.DeleteMatchmakingConfigurationInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteMatchmakingConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteMatchmakingConfiguration", POST, "/", input)
  override def createMatchmakingRuleSet(input: models.CreateMatchmakingRuleSetInput): F[models.CreateMatchmakingRuleSetOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateMatchmakingRuleSetOutput, models.CreateMatchmakingRuleSetInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateMatchmakingRuleSet", POST, "/", input)
  override def describeAlias(input: models.DescribeAliasInput): F[models.DescribeAliasOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeAliasOutput, models.DescribeAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAlias", POST, "/", input)
  override def deleteVpcPeeringAuthorization(input: models.DeleteVpcPeeringAuthorizationInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteVpcPeeringAuthorizationInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteVpcPeeringAuthorization", POST, "/", input)
  override def updateBuild(input: models.UpdateBuildInput): F[models.UpdateBuildOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateBuildOutput, models.UpdateBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateBuild", POST, "/", input)
  override def describeMatchmakingConfigurations(input: models.DescribeMatchmakingConfigurationsInput): F[models.DescribeMatchmakingConfigurationsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeMatchmakingConfigurationsOutput, models.DescribeMatchmakingConfigurationsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeMatchmakingConfigurations", POST, "/", input)
  override def describeFleetAttributes(input: models.DescribeFleetAttributesInput): F[models.DescribeFleetAttributesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeFleetAttributesOutput, models.DescribeFleetAttributesInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetAttributes", POST, "/", input)
  override def deleteAlias(input: models.DeleteAliasInput): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DeleteAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteAlias", POST, "/", input)
  override def createPlayerSessions(input: models.CreatePlayerSessionsInput): F[models.CreatePlayerSessionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreatePlayerSessionsOutput, models.CreatePlayerSessionsInput](client, awsData, ServiceType, ServiceAndPrefix, "CreatePlayerSessions", POST, "/", input)
  override def updateFleetPortSettings(input: models.UpdateFleetPortSettingsInput): F[models.UpdateFleetPortSettingsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateFleetPortSettingsOutput, models.UpdateFleetPortSettingsInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateFleetPortSettings", POST, "/", input)
  override def describeGameSessionQueues(input: models.DescribeGameSessionQueuesInput): F[models.DescribeGameSessionQueuesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeGameSessionQueuesOutput, models.DescribeGameSessionQueuesInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeGameSessionQueues", POST, "/", input)
  override def updateMatchmakingConfiguration(input: models.UpdateMatchmakingConfigurationInput): F[models.UpdateMatchmakingConfigurationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateMatchmakingConfigurationOutput, models.UpdateMatchmakingConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateMatchmakingConfiguration", POST, "/", input)
  override def describeEC2InstanceLimits(input: models.DescribeEC2InstanceLimitsInput): F[models.DescribeEC2InstanceLimitsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEC2InstanceLimitsOutput, models.DescribeEC2InstanceLimitsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEC2InstanceLimits", POST, "/", input)
  override def updateGameSessionQueue(input: models.UpdateGameSessionQueueInput): F[models.UpdateGameSessionQueueOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateGameSessionQueueOutput, models.UpdateGameSessionQueueInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateGameSessionQueue", POST, "/", input)
  override def describeInstances(input: models.DescribeInstancesInput): F[models.DescribeInstancesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeInstancesOutput, models.DescribeInstancesInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeInstances", POST, "/", input)
  override def resolveAlias(input: models.ResolveAliasInput): F[models.ResolveAliasOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ResolveAliasOutput, models.ResolveAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "ResolveAlias", POST, "/", input)
  override def updateFleetAttributes(input: models.UpdateFleetAttributesInput): F[models.UpdateFleetAttributesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateFleetAttributesOutput, models.UpdateFleetAttributesInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateFleetAttributes", POST, "/", input)
  override def getInstanceAccess(input: models.GetInstanceAccessInput): F[models.GetInstanceAccessOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetInstanceAccessOutput, models.GetInstanceAccessInput](client, awsData, ServiceType, ServiceAndPrefix, "GetInstanceAccess", POST, "/", input)
  override def updateAlias(input: models.UpdateAliasInput): F[models.UpdateAliasOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateAliasOutput, models.UpdateAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateAlias", POST, "/", input)
  override def listBuilds(input: models.ListBuildsInput): F[models.ListBuildsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListBuildsOutput, models.ListBuildsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListBuilds", POST, "/", input)
  override def describeGameSessionPlacement(input: models.DescribeGameSessionPlacementInput): F[models.DescribeGameSessionPlacementOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeGameSessionPlacementOutput, models.DescribeGameSessionPlacementInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeGameSessionPlacement", POST, "/", input)
  override def updateRuntimeConfiguration(input: models.UpdateRuntimeConfigurationInput): F[models.UpdateRuntimeConfigurationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateRuntimeConfigurationOutput, models.UpdateRuntimeConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateRuntimeConfiguration", POST, "/", input)
  override def deleteScalingPolicy(input: models.DeleteScalingPolicyInput): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DeleteScalingPolicyInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteScalingPolicy", POST, "/", input)
  override def describePlayerSessions(input: models.DescribePlayerSessionsInput): F[models.DescribePlayerSessionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribePlayerSessionsOutput, models.DescribePlayerSessionsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribePlayerSessions", POST, "/", input)
  override def deleteVpcPeeringConnection(input: models.DeleteVpcPeeringConnectionInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteVpcPeeringConnectionInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteVpcPeeringConnection", POST, "/", input)
  override def deleteGameSessionQueue(input: models.DeleteGameSessionQueueInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteGameSessionQueueInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteGameSessionQueue", POST, "/", input)
  override def describeVpcPeeringConnections(input: models.DescribeVpcPeeringConnectionsInput): F[models.DescribeVpcPeeringConnectionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeVpcPeeringConnectionsOutput, models.DescribeVpcPeeringConnectionsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeVpcPeeringConnections", POST, "/", input)
  override def createMatchmakingConfiguration(input: models.CreateMatchmakingConfigurationInput): F[models.CreateMatchmakingConfigurationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateMatchmakingConfigurationOutput, models.CreateMatchmakingConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateMatchmakingConfiguration", POST, "/", input)
  override def acceptMatch(input: models.AcceptMatchInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.AcceptMatchInput](client, awsData, ServiceType, ServiceAndPrefix, "AcceptMatch", POST, "/", input)
  override def putScalingPolicy(input: models.PutScalingPolicyInput): F[models.PutScalingPolicyOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.PutScalingPolicyOutput, models.PutScalingPolicyInput](client, awsData, ServiceType, ServiceAndPrefix, "PutScalingPolicy", POST, "/", input)
  override def describeFleetEvents(input: models.DescribeFleetEventsInput): F[models.DescribeFleetEventsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeFleetEventsOutput, models.DescribeFleetEventsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetEvents", POST, "/", input)
  override def listFleets(input: models.ListFleetsInput): F[models.ListFleetsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListFleetsOutput, models.ListFleetsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListFleets", POST, "/", input)
  override def describeFleetCapacity(input: models.DescribeFleetCapacityInput): F[models.DescribeFleetCapacityOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeFleetCapacityOutput, models.DescribeFleetCapacityInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetCapacity", POST, "/", input)
  override def describeFleetUtilization(input: models.DescribeFleetUtilizationInput): F[models.DescribeFleetUtilizationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeFleetUtilizationOutput, models.DescribeFleetUtilizationInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetUtilization", POST, "/", input)
  override def deleteBuild(input: models.DeleteBuildInput): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DeleteBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteBuild", POST, "/", input)
  override def deleteFleet(input: models.DeleteFleetInput): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DeleteFleetInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteFleet", POST, "/", input)
  override def createGameSessionQueue(input: models.CreateGameSessionQueueInput): F[models.CreateGameSessionQueueOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateGameSessionQueueOutput, models.CreateGameSessionQueueInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateGameSessionQueue", POST, "/", input)
  override def requestUploadCredentials(input: models.RequestUploadCredentialsInput): F[models.RequestUploadCredentialsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.RequestUploadCredentialsOutput, models.RequestUploadCredentialsInput](client, awsData, ServiceType, ServiceAndPrefix, "RequestUploadCredentials", POST, "/", input)
  override def describeGameSessions(input: models.DescribeGameSessionsInput): F[models.DescribeGameSessionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeGameSessionsOutput, models.DescribeGameSessionsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeGameSessions", POST, "/", input)
  override def startMatchmaking(input: models.StartMatchmakingInput): F[models.StartMatchmakingOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StartMatchmakingOutput, models.StartMatchmakingInput](client, awsData, ServiceType, ServiceAndPrefix, "StartMatchmaking", POST, "/", input)
  override def startGameSessionPlacement(input: models.StartGameSessionPlacementInput): F[models.StartGameSessionPlacementOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.StartGameSessionPlacementOutput, models.StartGameSessionPlacementInput](client, awsData, ServiceType, ServiceAndPrefix, "StartGameSessionPlacement", POST, "/", input)
  override def createFleet(input: models.CreateFleetInput): F[models.CreateFleetOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateFleetOutput, models.CreateFleetInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateFleet", POST, "/", input)
}