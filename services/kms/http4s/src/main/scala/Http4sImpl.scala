package org.lyranthe.araethura.kms.http4s
import org.http4s.Method._
import org.lyranthe.araethura.kms.circe._
import org.lyranthe.araethura.kms.models
class AmazonkmsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.kms.Amazonkms[F] {
  private[this] final val ServiceType: String = "kms"
  private[this] final val ServiceAndPrefix: Option[String] = Some("TrentService")
  override def enableKey(input: models.EnableKeyRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.EnableKeyRequest](client, awsData, ServiceType, ServiceAndPrefix, "EnableKey", POST, "/", input)
  override def getKeyPolicy(input: models.GetKeyPolicyRequest): F[models.GetKeyPolicyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetKeyPolicyResponse, models.GetKeyPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetKeyPolicy", POST, "/", input)
  override def generateRandom(input: models.GenerateRandomRequest): F[models.GenerateRandomResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GenerateRandomResponse, models.GenerateRandomRequest](client, awsData, ServiceType, ServiceAndPrefix, "GenerateRandom", POST, "/", input)
  override def scheduleKeyDeletion(input: models.ScheduleKeyDeletionRequest): F[models.ScheduleKeyDeletionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ScheduleKeyDeletionResponse, models.ScheduleKeyDeletionRequest](client, awsData, ServiceType, ServiceAndPrefix, "ScheduleKeyDeletion", POST, "/", input)
  override def disableKey(input: models.DisableKeyRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DisableKeyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DisableKey", POST, "/", input)
  override def revokeGrant(input: models.RevokeGrantRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.RevokeGrantRequest](client, awsData, ServiceType, ServiceAndPrefix, "RevokeGrant", POST, "/", input)
  override def retireGrant(input: models.RetireGrantRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.RetireGrantRequest](client, awsData, ServiceType, ServiceAndPrefix, "RetireGrant", POST, "/", input)
  override def reEncrypt(input: models.ReEncryptRequest): F[models.ReEncryptResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ReEncryptResponse, models.ReEncryptRequest](client, awsData, ServiceType, ServiceAndPrefix, "ReEncrypt", POST, "/", input)
  override def generateDataKeyWithoutPlaintext(input: models.GenerateDataKeyWithoutPlaintextRequest): F[models.GenerateDataKeyWithoutPlaintextResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GenerateDataKeyWithoutPlaintextResponse, models.GenerateDataKeyWithoutPlaintextRequest](client, awsData, ServiceType, ServiceAndPrefix, "GenerateDataKeyWithoutPlaintext", POST, "/", input)
  override def deleteImportedKeyMaterial(input: models.DeleteImportedKeyMaterialRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DeleteImportedKeyMaterialRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteImportedKeyMaterial", POST, "/", input)
  override def tagResource(input: models.TagResourceRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.TagResourceRequest](client, awsData, ServiceType, ServiceAndPrefix, "TagResource", POST, "/", input)
  override def describeKey(input: models.DescribeKeyRequest): F[models.DescribeKeyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeKeyResponse, models.DescribeKeyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeKey", POST, "/", input)
  override def generateDataKey(input: models.GenerateDataKeyRequest): F[models.GenerateDataKeyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GenerateDataKeyResponse, models.GenerateDataKeyRequest](client, awsData, ServiceType, ServiceAndPrefix, "GenerateDataKey", POST, "/", input)
  override def listRetirableGrants(input: models.ListRetirableGrantsRequest): F[models.ListGrantsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListGrantsResponse, models.ListRetirableGrantsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListRetirableGrants", POST, "/", input)
  override def listResourceTags(input: models.ListResourceTagsRequest): F[models.ListResourceTagsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListResourceTagsResponse, models.ListResourceTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListResourceTags", POST, "/", input)
  override def updateKeyDescription(input: models.UpdateKeyDescriptionRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.UpdateKeyDescriptionRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateKeyDescription", POST, "/", input)
  override def encrypt(input: models.EncryptRequest): F[models.EncryptResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.EncryptResponse, models.EncryptRequest](client, awsData, ServiceType, ServiceAndPrefix, "Encrypt", POST, "/", input)
  override def createGrant(input: models.CreateGrantRequest): F[models.CreateGrantResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateGrantResponse, models.CreateGrantRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateGrant", POST, "/", input)
  override def cancelKeyDeletion(input: models.CancelKeyDeletionRequest): F[models.CancelKeyDeletionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CancelKeyDeletionResponse, models.CancelKeyDeletionRequest](client, awsData, ServiceType, ServiceAndPrefix, "CancelKeyDeletion", POST, "/", input)
  override def putKeyPolicy(input: models.PutKeyPolicyRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.PutKeyPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutKeyPolicy", POST, "/", input)
  override def deleteAlias(input: models.DeleteAliasRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DeleteAliasRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteAlias", POST, "/", input)
  override def listAliases(input: models.ListAliasesRequest): F[models.ListAliasesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListAliasesResponse, models.ListAliasesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListAliases", POST, "/", input)
  override def getKeyRotationStatus(input: models.GetKeyRotationStatusRequest): F[models.GetKeyRotationStatusResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetKeyRotationStatusResponse, models.GetKeyRotationStatusRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetKeyRotationStatus", POST, "/", input)
  override def getParametersForImport(input: models.GetParametersForImportRequest): F[models.GetParametersForImportResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetParametersForImportResponse, models.GetParametersForImportRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetParametersForImport", POST, "/", input)
  override def enableKeyRotation(input: models.EnableKeyRotationRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.EnableKeyRotationRequest](client, awsData, ServiceType, ServiceAndPrefix, "EnableKeyRotation", POST, "/", input)
  override def updateAlias(input: models.UpdateAliasRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.UpdateAliasRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateAlias", POST, "/", input)
  override def listKeys(input: models.ListKeysRequest): F[models.ListKeysResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListKeysResponse, models.ListKeysRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListKeys", POST, "/", input)
  override def createAlias(input: models.CreateAliasRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.CreateAliasRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateAlias", POST, "/", input)
  override def decrypt(input: models.DecryptRequest): F[models.DecryptResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DecryptResponse, models.DecryptRequest](client, awsData, ServiceType, ServiceAndPrefix, "Decrypt", POST, "/", input)
  override def untagResource(input: models.UntagResourceRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.UntagResourceRequest](client, awsData, ServiceType, ServiceAndPrefix, "UntagResource", POST, "/", input)
  override def createKey(input: models.CreateKeyRequest): F[models.CreateKeyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateKeyResponse, models.CreateKeyRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateKey", POST, "/", input)
  override def listKeyPolicies(input: models.ListKeyPoliciesRequest): F[models.ListKeyPoliciesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListKeyPoliciesResponse, models.ListKeyPoliciesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListKeyPolicies", POST, "/", input)
  override def listGrants(input: models.ListGrantsRequest): F[models.ListGrantsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListGrantsResponse, models.ListGrantsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListGrants", POST, "/", input)
  override def importKeyMaterial(input: models.ImportKeyMaterialRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.ImportKeyMaterialRequest](client, awsData, ServiceType, ServiceAndPrefix, "ImportKeyMaterial", POST, "/", input)
  override def disableKeyRotation(input: models.DisableKeyRotationRequest): F[Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, Unit, models.DisableKeyRotationRequest](client, awsData, ServiceType, ServiceAndPrefix, "DisableKeyRotation", POST, "/", input)
}