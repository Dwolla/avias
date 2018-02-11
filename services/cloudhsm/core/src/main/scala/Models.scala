package org.lyranthe.araethura.cloudhsm.models
import org.lyranthe.araethura.cloudhsm.models
final case class ListHsmsResponse(hsmList: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class Tag(key: java.lang.String, value: java.lang.String)
final case class ModifyHsmRequest(hsmArn: java.lang.String, subnetId: scala.Option[java.lang.String] = None, iamRoleArn: scala.Option[java.lang.String] = None, externalId: scala.Option[java.lang.String] = None, eniIp: scala.Option[java.lang.String] = None, syslogIp: scala.Option[java.lang.String] = None)
final case class GetConfigResponse(configType: scala.Option[java.lang.String] = None, configFile: scala.Option[java.lang.String] = None, configCred: scala.Option[java.lang.String] = None)
final case class DeleteHsmRequest(hsmArn: java.lang.String)
final case class ListHsmsRequest(nextToken: scala.Option[java.lang.String] = None)
final case class ListTagsForResourceResponse(tagList: scala.List[models.Tag])
final case class RemoveTagsFromResourceResponse(status: java.lang.String)
final case class CreateHsmResponse(hsmArn: scala.Option[java.lang.String] = None)
final case class ModifyHapgRequest(hapgArn: java.lang.String, label: scala.Option[java.lang.String] = None, partitionSerialList: scala.Option[scala.List[java.lang.String]] = None)
final case class CreateLunaClientResponse(clientArn: scala.Option[java.lang.String] = None)
final case class DeleteHapgRequest(hapgArn: java.lang.String)
final case class DescribeHapgRequest(hapgArn: java.lang.String)
case object CloudHsmInternalException
final case class ListLunaClientsResponse(clientList: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = None)
case object ListAvailableZonesRequest
final case class CreateLunaClientRequest(certificate: java.lang.String, label: scala.Option[java.lang.String] = None)
final case class DeleteHsmResponse(status: java.lang.String)
final case class AddTagsToResourceRequest(resourceArn: java.lang.String, tagList: scala.List[models.Tag])
final case class DescribeHsmRequest(hsmArn: scala.Option[java.lang.String] = None, hsmSerialNumber: scala.Option[java.lang.String] = None)
final case class GetConfigRequest(clientArn: java.lang.String, clientVersion: java.lang.String, hapgList: scala.List[java.lang.String])
final case class CreateHsmRequest(subnetId: java.lang.String, sshKey: java.lang.String, iamRoleArn: java.lang.String, subscriptionType: java.lang.String, externalId: scala.Option[java.lang.String] = None, clientToken: scala.Option[java.lang.String] = None, eniIp: scala.Option[java.lang.String] = None, syslogIp: scala.Option[java.lang.String] = None)
final case class ModifyLunaClientRequest(clientArn: java.lang.String, certificate: java.lang.String)
final case class DescribeLunaClientResponse(certificate: scala.Option[java.lang.String] = None, certificateFingerprint: scala.Option[java.lang.String] = None, label: scala.Option[java.lang.String] = None, lastModifiedTimestamp: scala.Option[java.lang.String] = None, clientArn: scala.Option[java.lang.String] = None)
case object InvalidRequestException
final case class DescribeHsmResponse(eniId: scala.Option[java.lang.String] = None, vpcId: scala.Option[java.lang.String] = None, availabilityZone: scala.Option[java.lang.String] = None, vendorName: scala.Option[java.lang.String] = None, serverCertUri: scala.Option[java.lang.String] = None, softwareVersion: scala.Option[java.lang.String] = None, hsmType: scala.Option[java.lang.String] = None, statusDetails: scala.Option[java.lang.String] = None, subnetId: scala.Option[java.lang.String] = None, serialNumber: scala.Option[java.lang.String] = None, sshPublicKey: scala.Option[java.lang.String] = None, hsmArn: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, iamRoleArn: scala.Option[java.lang.String] = None, subscriptionType: scala.Option[java.lang.String] = None, partitions: scala.Option[scala.List[java.lang.String]] = None, subscriptionStartDate: scala.Option[java.lang.String] = None, subscriptionEndDate: scala.Option[java.lang.String] = None, sshKeyLastUpdated: scala.Option[java.lang.String] = None, serverCertLastUpdated: scala.Option[java.lang.String] = None, eniIp: scala.Option[java.lang.String] = None)
final case class ListHapgsResponse(hapgList: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = None)
final case class ListLunaClientsRequest(nextToken: scala.Option[java.lang.String] = None)
final case class AddTagsToResourceResponse(status: java.lang.String)
final case class DescribeHapgResponse(hsmsLastActionFailed: scala.Option[scala.List[java.lang.String]] = None, hsmsPendingDeletion: scala.Option[scala.List[java.lang.String]] = None, hsmsPendingRegistration: scala.Option[scala.List[java.lang.String]] = None, hapgSerial: scala.Option[java.lang.String] = None, partitionSerialList: scala.Option[scala.List[java.lang.String]] = None, state: scala.Option[java.lang.String] = None, label: scala.Option[java.lang.String] = None, lastModifiedTimestamp: scala.Option[java.lang.String] = None, hapgArn: scala.Option[java.lang.String] = None)
final case class ListTagsForResourceRequest(resourceArn: java.lang.String)
final case class DeleteHapgResponse(status: java.lang.String)
final case class DeleteLunaClientResponse(status: java.lang.String)
final case class ModifyHapgResponse(hapgArn: scala.Option[java.lang.String] = None)
final case class ListHapgsRequest(nextToken: scala.Option[java.lang.String] = None)
final case class CreateHapgResponse(hapgArn: scala.Option[java.lang.String] = None)
final case class DeleteLunaClientRequest(clientArn: java.lang.String)
final case class ListAvailableZonesResponse(azlist: scala.Option[scala.List[java.lang.String]] = None)
final case class CreateHapgRequest(label: java.lang.String)
final case class DescribeLunaClientRequest(clientArn: scala.Option[java.lang.String] = None, certificateFingerprint: scala.Option[java.lang.String] = None)
final case class CloudHsmServiceException(message: scala.Option[java.lang.String] = None, retryable: scala.Option[scala.Boolean] = None)
final case class ModifyHsmResponse(hsmArn: scala.Option[java.lang.String] = None)
final case class ModifyLunaClientResponse(clientArn: scala.Option[java.lang.String] = None)
final case class RemoveTagsFromResourceRequest(resourceArn: java.lang.String, tagKeyList: scala.List[java.lang.String])