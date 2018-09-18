package avias.kms
trait Amazonkms[F[_]] {
  def enableKey(input: avias.kms.models.EnableKeyRequest): F[scala.Unit]
  def getKeyPolicy(input: avias.kms.models.GetKeyPolicyRequest): F[avias.kms.models.GetKeyPolicyResponse]
  def generateRandom(input: avias.kms.models.GenerateRandomRequest): F[avias.kms.models.GenerateRandomResponse]
  def scheduleKeyDeletion(input: avias.kms.models.ScheduleKeyDeletionRequest): F[avias.kms.models.ScheduleKeyDeletionResponse]
  def disableKey(input: avias.kms.models.DisableKeyRequest): F[scala.Unit]
  def revokeGrant(input: avias.kms.models.RevokeGrantRequest): F[scala.Unit]
  def retireGrant(input: avias.kms.models.RetireGrantRequest): F[scala.Unit]
  def reEncrypt(input: avias.kms.models.ReEncryptRequest): F[avias.kms.models.ReEncryptResponse]
  def generateDataKeyWithoutPlaintext(input: avias.kms.models.GenerateDataKeyWithoutPlaintextRequest): F[avias.kms.models.GenerateDataKeyWithoutPlaintextResponse]
  def deleteImportedKeyMaterial(input: avias.kms.models.DeleteImportedKeyMaterialRequest): F[scala.Unit]
  def tagResource(input: avias.kms.models.TagResourceRequest): F[scala.Unit]
  def describeKey(input: avias.kms.models.DescribeKeyRequest): F[avias.kms.models.DescribeKeyResponse]
  def generateDataKey(input: avias.kms.models.GenerateDataKeyRequest): F[avias.kms.models.GenerateDataKeyResponse]
  def listRetirableGrants(input: avias.kms.models.ListRetirableGrantsRequest): F[avias.kms.models.ListGrantsResponse]
  def listResourceTags(input: avias.kms.models.ListResourceTagsRequest): F[avias.kms.models.ListResourceTagsResponse]
  def updateKeyDescription(input: avias.kms.models.UpdateKeyDescriptionRequest): F[scala.Unit]
  def encrypt(input: avias.kms.models.EncryptRequest): F[avias.kms.models.EncryptResponse]
  def createGrant(input: avias.kms.models.CreateGrantRequest): F[avias.kms.models.CreateGrantResponse]
  def cancelKeyDeletion(input: avias.kms.models.CancelKeyDeletionRequest): F[avias.kms.models.CancelKeyDeletionResponse]
  def putKeyPolicy(input: avias.kms.models.PutKeyPolicyRequest): F[scala.Unit]
  def deleteAlias(input: avias.kms.models.DeleteAliasRequest): F[scala.Unit]
  def listAliases(input: avias.kms.models.ListAliasesRequest): F[avias.kms.models.ListAliasesResponse]
  def getKeyRotationStatus(input: avias.kms.models.GetKeyRotationStatusRequest): F[avias.kms.models.GetKeyRotationStatusResponse]
  def getParametersForImport(input: avias.kms.models.GetParametersForImportRequest): F[avias.kms.models.GetParametersForImportResponse]
  def enableKeyRotation(input: avias.kms.models.EnableKeyRotationRequest): F[scala.Unit]
  def updateAlias(input: avias.kms.models.UpdateAliasRequest): F[scala.Unit]
  def listKeys(input: avias.kms.models.ListKeysRequest): F[avias.kms.models.ListKeysResponse]
  def createAlias(input: avias.kms.models.CreateAliasRequest): F[scala.Unit]
  def decrypt(input: avias.kms.models.DecryptRequest): F[avias.kms.models.DecryptResponse]
  def untagResource(input: avias.kms.models.UntagResourceRequest): F[scala.Unit]
  def createKey(input: avias.kms.models.CreateKeyRequest): F[avias.kms.models.CreateKeyResponse]
  def listKeyPolicies(input: avias.kms.models.ListKeyPoliciesRequest): F[avias.kms.models.ListKeyPoliciesResponse]
  def listGrants(input: avias.kms.models.ListGrantsRequest): F[avias.kms.models.ListGrantsResponse]
  def importKeyMaterial(input: avias.kms.models.ImportKeyMaterialRequest): F[scala.Unit]
  def disableKeyRotation(input: avias.kms.models.DisableKeyRotationRequest): F[scala.Unit]
}