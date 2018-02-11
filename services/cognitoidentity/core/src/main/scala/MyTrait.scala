package org.lyranthe.araethura.cognitoidentity
trait Amazoncognitoidentity[F[_]] {
  def updateIdentityPool(input: models.IdentityPool): F[models.IdentityPool]
  def deleteIdentities(input: models.DeleteIdentitiesInput): F[models.DeleteIdentitiesResponse]
  def getId(input: models.GetIdInput): F[models.GetIdResponse]
  def getIdentityPoolRoles(input: models.GetIdentityPoolRolesInput): F[models.GetIdentityPoolRolesResponse]
  def unlinkDeveloperIdentity(input: models.UnlinkDeveloperIdentityInput): F[Unit]
  def unlinkIdentity(input: models.UnlinkIdentityInput): F[Unit]
  def getOpenIdTokenForDeveloperIdentity(input: models.GetOpenIdTokenForDeveloperIdentityInput): F[models.GetOpenIdTokenForDeveloperIdentityResponse]
  def listIdentities(input: models.ListIdentitiesInput): F[models.ListIdentitiesResponse]
  def createIdentityPool(input: models.CreateIdentityPoolInput): F[models.IdentityPool]
  def setIdentityPoolRoles(input: models.SetIdentityPoolRolesInput): F[Unit]
  def lookupDeveloperIdentity(input: models.LookupDeveloperIdentityInput): F[models.LookupDeveloperIdentityResponse]
  def mergeDeveloperIdentities(input: models.MergeDeveloperIdentitiesInput): F[models.MergeDeveloperIdentitiesResponse]
  def describeIdentity(input: models.DescribeIdentityInput): F[models.IdentityDescription]
  def describeIdentityPool(input: models.DescribeIdentityPoolInput): F[models.IdentityPool]
  def getCredentialsForIdentity(input: models.GetCredentialsForIdentityInput): F[models.GetCredentialsForIdentityResponse]
  def listIdentityPools(input: models.ListIdentityPoolsInput): F[models.ListIdentityPoolsResponse]
  def getOpenIdToken(input: models.GetOpenIdTokenInput): F[models.GetOpenIdTokenResponse]
  def deleteIdentityPool(input: models.DeleteIdentityPoolInput): F[Unit]
}