package org.lyranthe.araethura.organizations.http4s
import org.http4s.Method._
import org.lyranthe.araethura.organizations.circe._
import org.lyranthe.araethura.organizations.models
class AmazonorganizationsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.organizations.Amazonorganizations[F] {
  private[this] final val ServiceType: String = "organizations"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSOrganizationsV20161128")
  override def enablePolicyType(input: models.EnablePolicyTypeRequest): F[models.EnablePolicyTypeResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.EnablePolicyTypeResponse, models.EnablePolicyTypeRequest](client, awsData, ServiceType, ServiceAndPrefix, "EnablePolicyType", POST, "/", input)
  override def deleteOrganizationalUnit(input: models.DeleteOrganizationalUnitRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DeleteOrganizationalUnitRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteOrganizationalUnit", POST, "/", input)
  override def listAWSServiceAccessForOrganization(input: models.ListAWSServiceAccessForOrganizationRequest): F[models.ListAWSServiceAccessForOrganizationResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListAWSServiceAccessForOrganizationResponse, models.ListAWSServiceAccessForOrganizationRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListAWSServiceAccessForOrganization", POST, "/", input)
  override def listHandshakesForAccount(input: models.ListHandshakesForAccountRequest): F[models.ListHandshakesForAccountResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListHandshakesForAccountResponse, models.ListHandshakesForAccountRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListHandshakesForAccount", POST, "/", input)
  override def listRoots(input: models.ListRootsRequest): F[models.ListRootsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListRootsResponse, models.ListRootsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListRoots", POST, "/", input)
  override def detachPolicy(input: models.DetachPolicyRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DetachPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DetachPolicy", POST, "/", input)
  override def createPolicy(input: models.CreatePolicyRequest): F[models.CreatePolicyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreatePolicyResponse, models.CreatePolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreatePolicy", POST, "/", input)
  override def listAccounts(input: models.ListAccountsRequest): F[models.ListAccountsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListAccountsResponse, models.ListAccountsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListAccounts", POST, "/", input)
  override def inviteAccountToOrganization(input: models.InviteAccountToOrganizationRequest): F[models.InviteAccountToOrganizationResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.InviteAccountToOrganizationResponse, models.InviteAccountToOrganizationRequest](client, awsData, ServiceType, ServiceAndPrefix, "InviteAccountToOrganization", POST, "/", input)
  override def listPolicies(input: models.ListPoliciesRequest): F[models.ListPoliciesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListPoliciesResponse, models.ListPoliciesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListPolicies", POST, "/", input)
  override def cancelHandshake(input: models.CancelHandshakeRequest): F[models.CancelHandshakeResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CancelHandshakeResponse, models.CancelHandshakeRequest](client, awsData, ServiceType, ServiceAndPrefix, "CancelHandshake", POST, "/", input)
  override def enableAWSServiceAccess(input: models.EnableAWSServiceAccessRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.EnableAWSServiceAccessRequest](client, awsData, ServiceType, ServiceAndPrefix, "EnableAWSServiceAccess", POST, "/", input)
  override def removeAccountFromOrganization(input: models.RemoveAccountFromOrganizationRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.RemoveAccountFromOrganizationRequest](client, awsData, ServiceType, ServiceAndPrefix, "RemoveAccountFromOrganization", POST, "/", input)
  override def attachPolicy(input: models.AttachPolicyRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.AttachPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "AttachPolicy", POST, "/", input)
  override def listOrganizationalUnitsForParent(input: models.ListOrganizationalUnitsForParentRequest): F[models.ListOrganizationalUnitsForParentResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListOrganizationalUnitsForParentResponse, models.ListOrganizationalUnitsForParentRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListOrganizationalUnitsForParent", POST, "/", input)
  override def moveAccount(input: models.MoveAccountRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.MoveAccountRequest](client, awsData, ServiceType, ServiceAndPrefix, "MoveAccount", POST, "/", input)
  override def deletePolicy(input: models.DeletePolicyRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DeletePolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeletePolicy", POST, "/", input)
  override def describeOrganizationalUnit(input: models.DescribeOrganizationalUnitRequest): F[models.DescribeOrganizationalUnitResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeOrganizationalUnitResponse, models.DescribeOrganizationalUnitRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeOrganizationalUnit", POST, "/", input)
  override def updatePolicy(input: models.UpdatePolicyRequest): F[models.UpdatePolicyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdatePolicyResponse, models.UpdatePolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdatePolicy", POST, "/", input)
  override def listChildren(input: models.ListChildrenRequest): F[models.ListChildrenResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListChildrenResponse, models.ListChildrenRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListChildren", POST, "/", input)
  override def listAccountsForParent(input: models.ListAccountsForParentRequest): F[models.ListAccountsForParentResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListAccountsForParentResponse, models.ListAccountsForParentRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListAccountsForParent", POST, "/", input)
  override def disablePolicyType(input: models.DisablePolicyTypeRequest): F[models.DisablePolicyTypeResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DisablePolicyTypeResponse, models.DisablePolicyTypeRequest](client, awsData, ServiceType, ServiceAndPrefix, "DisablePolicyType", POST, "/", input)
  override def createOrganization(input: models.CreateOrganizationRequest): F[models.CreateOrganizationResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateOrganizationResponse, models.CreateOrganizationRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateOrganization", POST, "/", input)
  override def deleteOrganization: F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequestWithoutBody[F, Unit](client, awsData, ServiceType, ServiceAndPrefix, "DeleteOrganization", POST, "/")
  override def describeAccount(input: models.DescribeAccountRequest): F[models.DescribeAccountResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeAccountResponse, models.DescribeAccountRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAccount", POST, "/", input)
  override def createOrganizationalUnit(input: models.CreateOrganizationalUnitRequest): F[models.CreateOrganizationalUnitResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateOrganizationalUnitResponse, models.CreateOrganizationalUnitRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateOrganizationalUnit", POST, "/", input)
  override def createAccount(input: models.CreateAccountRequest): F[models.CreateAccountResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateAccountResponse, models.CreateAccountRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateAccount", POST, "/", input)
  override def leaveOrganization: F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequestWithoutBody[F, Unit](client, awsData, ServiceType, ServiceAndPrefix, "LeaveOrganization", POST, "/")
  override def describeHandshake(input: models.DescribeHandshakeRequest): F[models.DescribeHandshakeResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeHandshakeResponse, models.DescribeHandshakeRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeHandshake", POST, "/", input)
  override def enableAllFeatures: F[models.EnableAllFeaturesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.EnableAllFeaturesResponse, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "EnableAllFeatures", POST, "/", ())
  override def listParents(input: models.ListParentsRequest): F[models.ListParentsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListParentsResponse, models.ListParentsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListParents", POST, "/", input)
  override def listPoliciesForTarget(input: models.ListPoliciesForTargetRequest): F[models.ListPoliciesForTargetResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListPoliciesForTargetResponse, models.ListPoliciesForTargetRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListPoliciesForTarget", POST, "/", input)
  override def describeCreateAccountStatus(input: models.DescribeCreateAccountStatusRequest): F[models.DescribeCreateAccountStatusResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeCreateAccountStatusResponse, models.DescribeCreateAccountStatusRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeCreateAccountStatus", POST, "/", input)
  override def listTargetsForPolicy(input: models.ListTargetsForPolicyRequest): F[models.ListTargetsForPolicyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListTargetsForPolicyResponse, models.ListTargetsForPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTargetsForPolicy", POST, "/", input)
  override def acceptHandshake(input: models.AcceptHandshakeRequest): F[models.AcceptHandshakeResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.AcceptHandshakeResponse, models.AcceptHandshakeRequest](client, awsData, ServiceType, ServiceAndPrefix, "AcceptHandshake", POST, "/", input)
  override def declineHandshake(input: models.DeclineHandshakeRequest): F[models.DeclineHandshakeResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DeclineHandshakeResponse, models.DeclineHandshakeRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeclineHandshake", POST, "/", input)
  override def disableAWSServiceAccess(input: models.DisableAWSServiceAccessRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DisableAWSServiceAccessRequest](client, awsData, ServiceType, ServiceAndPrefix, "DisableAWSServiceAccess", POST, "/", input)
  override def updateOrganizationalUnit(input: models.UpdateOrganizationalUnitRequest): F[models.UpdateOrganizationalUnitResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UpdateOrganizationalUnitResponse, models.UpdateOrganizationalUnitRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateOrganizationalUnit", POST, "/", input)
  override def listHandshakesForOrganization(input: models.ListHandshakesForOrganizationRequest): F[models.ListHandshakesForOrganizationResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListHandshakesForOrganizationResponse, models.ListHandshakesForOrganizationRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListHandshakesForOrganization", POST, "/", input)
  override def describePolicy(input: models.DescribePolicyRequest): F[models.DescribePolicyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribePolicyResponse, models.DescribePolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribePolicy", POST, "/", input)
  override def describeOrganization: F[models.DescribeOrganizationResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequestWithoutBody[F, models.DescribeOrganizationResponse](client, awsData, ServiceType, ServiceAndPrefix, "DescribeOrganization", POST, "/")
  override def listCreateAccountStatus(input: models.ListCreateAccountStatusRequest): F[models.ListCreateAccountStatusResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListCreateAccountStatusResponse, models.ListCreateAccountStatusRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListCreateAccountStatus", POST, "/", input)
}