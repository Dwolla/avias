package org.lyranthe.araethura.lightsail.models
import org.lyranthe.araethura.lightsail.models
final case class GetStaticIpRequest(staticIpName: java.lang.String)
final case class GetRegionsRequest(includeAvailabilityZones: scala.Option[scala.Boolean] = None)
final case class GetDomainResult(domain: scala.Option[models.Domain] = None)
final case class AccountSetupInProgressException(code: scala.Option[java.lang.String] = None, docs: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, tip: scala.Option[java.lang.String] = None)
final case class DiskMap(originalDiskPath: scala.Option[java.lang.String] = None, newDiskName: scala.Option[java.lang.String] = None)
final case class GetInstancePortStatesRequest(instanceName: java.lang.String)
final case class DeleteInstanceRequest(instanceName: java.lang.String)
final case class ResourceLocation(availabilityZone: scala.Option[java.lang.String] = None, regionName: scala.Option[java.lang.String] = None)
final case class Domain(domainEntries: scala.Option[scala.List[models.DomainEntry]] = None, location: scala.Option[models.ResourceLocation] = None, arn: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, supportCode: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, createdAt: scala.Option[java.time.Instant] = None)
final case class GetKeyPairsRequest(pageToken: scala.Option[java.lang.String] = None)
final case class CreateDiskSnapshotRequest(diskName: java.lang.String, diskSnapshotName: java.lang.String)
final case class GetStaticIpResult(staticIp: scala.Option[models.StaticIp] = None)
final case class DeleteKeyPairRequest(keyPairName: java.lang.String)
final case class StopInstanceResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class Disk(location: scala.Option[models.ResourceLocation] = None, arn: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, supportCode: scala.Option[java.lang.String] = None, path: scala.Option[java.lang.String] = None, attachmentState: scala.Option[java.lang.String] = None, isSystemDisk: scala.Option[scala.Boolean] = None, isAttached: scala.Option[scala.Boolean] = None, sizeInGb: scala.Option[scala.Int] = None, iops: scala.Option[scala.Int] = None, gbInUse: scala.Option[scala.Int] = None, name: scala.Option[java.lang.String] = None, attachedTo: scala.Option[java.lang.String] = None, createdAt: scala.Option[java.time.Instant] = None, state: scala.Option[java.lang.String] = None)
final case class IsVpcPeeredResult(isPeered: scala.Option[scala.Boolean] = None)
final case class GetDiskResult(disk: scala.Option[models.Disk] = None)
final case class GetDomainRequest(domainName: java.lang.String)
final case class DetachDiskResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class ServiceException(code: scala.Option[java.lang.String] = None, docs: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, tip: scala.Option[java.lang.String] = None)
final case class CloseInstancePublicPortsResult(operation: scala.Option[models.Operation] = None)
final case class CloseInstancePublicPortsRequest(portInfo: models.PortInfo, instanceName: java.lang.String)
final case class GetActiveNamesRequest(pageToken: scala.Option[java.lang.String] = None)
case object UnpeerVpcRequest
final case class GetDiskSnapshotsRequest(pageToken: scala.Option[java.lang.String] = None)
final case class Operation(location: scala.Option[models.ResourceLocation] = None, id: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, operationDetails: scala.Option[java.lang.String] = None, errorCode: scala.Option[java.lang.String] = None, errorDetails: scala.Option[java.lang.String] = None, isTerminal: scala.Option[scala.Boolean] = None, resourceName: scala.Option[java.lang.String] = None, createdAt: scala.Option[java.time.Instant] = None, statusChangedAt: scala.Option[java.time.Instant] = None, operationType: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None)
final case class ReleaseStaticIpRequest(staticIpName: java.lang.String)
case object IsVpcPeeredRequest
final case class GetInstanceSnapshotsResult(instanceSnapshots: scala.Option[scala.List[models.InstanceSnapshot]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class InstancePortState(fromPort: scala.Option[scala.Int] = None, toPort: scala.Option[scala.Int] = None, protocol: scala.Option[java.lang.String] = None, state: scala.Option[java.lang.String] = None)
final case class GetInstancePortStatesResult(portStates: scala.Option[scala.List[models.InstancePortState]] = None)
final case class GetBlueprintsResult(blueprints: scala.Option[scala.List[models.Blueprint]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class StaticIp(location: scala.Option[models.ResourceLocation] = None, arn: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, supportCode: scala.Option[java.lang.String] = None, isAttached: scala.Option[scala.Boolean] = None, name: scala.Option[java.lang.String] = None, attachedTo: scala.Option[java.lang.String] = None, createdAt: scala.Option[java.time.Instant] = None, ipAddress: scala.Option[java.lang.String] = None)
final case class InstanceHardware(cpuCount: scala.Option[scala.Int] = None, disks: scala.Option[scala.List[models.Disk]] = None, ramSizeInGb: scala.Option[scala.Float] = None)
final case class GetInstanceStateRequest(instanceName: java.lang.String)
final case class RebootInstanceRequest(instanceName: java.lang.String)
final case class GetInstancesResult(instances: scala.Option[scala.List[models.Instance]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class AvailabilityZone(zoneName: scala.Option[java.lang.String] = None, state: scala.Option[java.lang.String] = None)
final case class GetRegionsResult(regions: scala.Option[scala.List[models.Region]] = None)
final case class GetInstanceAccessDetailsRequest(instanceName: java.lang.String, protocol: scala.Option[java.lang.String] = None)
final case class ImportKeyPairRequest(keyPairName: java.lang.String, publicKeyBase64: java.lang.String)
final case class CreateDiskSnapshotResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class InstanceState(code: scala.Option[scala.Int] = None, name: scala.Option[java.lang.String] = None)
final case class GetInstanceMetricDataResult(metricName: scala.Option[java.lang.String] = None, metricData: scala.Option[scala.List[models.MetricDatapoint]] = None)
final case class GetDiskSnapshotResult(diskSnapshot: scala.Option[models.DiskSnapshot] = None)
final case class CreateInstancesRequest(instanceNames: scala.List[java.lang.String], availabilityZone: java.lang.String, blueprintId: java.lang.String, bundleId: java.lang.String, userData: scala.Option[java.lang.String] = None, customImageName: scala.Option[java.lang.String] = None, keyPairName: scala.Option[java.lang.String] = None)
final case class GetBundlesRequest(includeInactive: scala.Option[scala.Boolean] = None, pageToken: scala.Option[java.lang.String] = None)
final case class DeleteInstanceResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class GetStaticIpsResult(staticIps: scala.Option[scala.List[models.StaticIp]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class DeleteDomainEntryRequest(domainName: java.lang.String, domainEntry: models.DomainEntry)
final case class DeleteDomainRequest(domainName: java.lang.String)
final case class GetInstanceMetricDataRequest(metricName: java.lang.String, unit: java.lang.String, statistics: scala.List[java.lang.String], instanceName: java.lang.String, startTime: java.time.Instant, endTime: java.time.Instant, period: scala.Int)
final case class CreateKeyPairResult(keyPair: scala.Option[models.KeyPair] = None, publicKeyBase64: scala.Option[java.lang.String] = None, privateKeyBase64: scala.Option[java.lang.String] = None, operation: scala.Option[models.Operation] = None)
final case class CreateDomainResult(operation: scala.Option[models.Operation] = None)
final case class Region(continentCode: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, displayName: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, availabilityZones: scala.Option[scala.List[models.AvailabilityZone]] = None)
final case class DomainEntry(options: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = None, id: scala.Option[java.lang.String] = None, target: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None)
final case class GetActiveNamesResult(activeNames: scala.Option[scala.List[java.lang.String]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class CreateKeyPairRequest(keyPairName: java.lang.String)
final case class AttachStaticIpResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class GetDisksRequest(pageToken: scala.Option[java.lang.String] = None)
final case class UpdateDomainEntryResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class CreateInstanceSnapshotResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class CreateInstanceSnapshotRequest(instanceSnapshotName: java.lang.String, instanceName: java.lang.String)
final case class DeleteDomainEntryResult(operation: scala.Option[models.Operation] = None)
final case class DeleteDomainResult(operation: scala.Option[models.Operation] = None)
final case class DeleteInstanceSnapshotRequest(instanceSnapshotName: java.lang.String)
final case class AttachDiskResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class OpenInstancePublicPortsResult(operation: scala.Option[models.Operation] = None)
final case class GetInstanceSnapshotResult(instanceSnapshot: scala.Option[models.InstanceSnapshot] = None)
case object DownloadDefaultKeyPairRequest
final case class GetKeyPairsResult(keyPairs: scala.Option[scala.List[models.KeyPair]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class CreateInstancesFromSnapshotRequest(bundleId: java.lang.String, availabilityZone: java.lang.String, instanceNames: scala.List[java.lang.String], instanceSnapshotName: java.lang.String, userData: scala.Option[java.lang.String] = None, keyPairName: scala.Option[java.lang.String] = None, attachedDiskMapping: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[models.DiskMap]]] = None)
final case class StartInstanceResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class CreateDomainEntryResult(operation: scala.Option[models.Operation] = None)
final case class GetOperationsRequest(pageToken: scala.Option[java.lang.String] = None)
final case class AccessDeniedException(code: scala.Option[java.lang.String] = None, docs: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, tip: scala.Option[java.lang.String] = None)
final case class StopInstanceRequest(instanceName: java.lang.String, force: scala.Option[scala.Boolean] = None)
final case class ReleaseStaticIpResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class DeleteDiskResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class RebootInstanceResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class UpdateDomainEntryRequest(domainName: java.lang.String, domainEntry: models.DomainEntry)
final case class GetBlueprintsRequest(includeInactive: scala.Option[scala.Boolean] = None, pageToken: scala.Option[java.lang.String] = None)
final case class InvalidInputException(code: scala.Option[java.lang.String] = None, docs: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, tip: scala.Option[java.lang.String] = None)
final case class GetKeyPairRequest(keyPairName: java.lang.String)
final case class CreateDomainRequest(domainName: java.lang.String)
final case class GetDiskSnapshotsResult(diskSnapshots: scala.Option[scala.List[models.DiskSnapshot]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class GetOperationResult(operation: scala.Option[models.Operation] = None)
final case class GetInstanceResult(instance: scala.Option[models.Instance] = None)
final case class GetInstancesRequest(pageToken: scala.Option[java.lang.String] = None)
final case class CreateDiskRequest(diskName: java.lang.String, availabilityZone: java.lang.String, sizeInGb: scala.Int)
final case class CreateDomainEntryRequest(domainName: java.lang.String, domainEntry: models.DomainEntry)
final case class CreateDiskResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class GetStaticIpsRequest(pageToken: scala.Option[java.lang.String] = None)
final case class OpenInstancePublicPortsRequest(portInfo: models.PortInfo, instanceName: java.lang.String)
final case class KeyPair(location: scala.Option[models.ResourceLocation] = None, arn: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, supportCode: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, createdAt: scala.Option[java.time.Instant] = None, fingerprint: scala.Option[java.lang.String] = None)
final case class GetOperationRequest(operationId: java.lang.String)
final case class NotFoundException(code: scala.Option[java.lang.String] = None, docs: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, tip: scala.Option[java.lang.String] = None)
final case class GetOperationsForResourceRequest(resourceName: java.lang.String, pageToken: scala.Option[java.lang.String] = None)
final case class UnauthenticatedException(code: scala.Option[java.lang.String] = None, docs: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, tip: scala.Option[java.lang.String] = None)
final case class DeleteInstanceSnapshotResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class MonthlyTransfer(gbPerMonthAllocated: scala.Option[scala.Int] = None)
final case class CreateInstancesFromSnapshotResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class DownloadDefaultKeyPairResult(publicKeyBase64: scala.Option[java.lang.String] = None, privateKeyBase64: scala.Option[java.lang.String] = None)
final case class DeleteDiskRequest(diskName: java.lang.String)
final case class DetachStaticIpResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class InstanceSnapshot(location: scala.Option[models.ResourceLocation] = None, arn: scala.Option[java.lang.String] = None, fromInstanceArn: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, state: scala.Option[java.lang.String] = None, supportCode: scala.Option[java.lang.String] = None, progress: scala.Option[java.lang.String] = None, fromBlueprintId: scala.Option[java.lang.String] = None, fromBundleId: scala.Option[java.lang.String] = None, sizeInGb: scala.Option[scala.Int] = None, name: scala.Option[java.lang.String] = None, fromInstanceName: scala.Option[java.lang.String] = None, createdAt: scala.Option[java.time.Instant] = None, fromAttachedDisks: scala.Option[scala.List[models.Disk]] = None)
final case class DetachStaticIpRequest(staticIpName: java.lang.String)
final case class StartInstanceRequest(instanceName: java.lang.String)
final case class GetInstanceSnapshotRequest(instanceSnapshotName: java.lang.String)
final case class AllocateStaticIpRequest(staticIpName: java.lang.String)
case object PeerVpcRequest
final case class PortInfo(fromPort: scala.Option[scala.Int] = None, toPort: scala.Option[scala.Int] = None, protocol: scala.Option[java.lang.String] = None)
final case class DetachDiskRequest(diskName: java.lang.String)
final case class Blueprint(`type`: scala.Option[java.lang.String] = None, blueprintId: scala.Option[java.lang.String] = None, group: scala.Option[java.lang.String] = None, versionCode: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, productUrl: scala.Option[java.lang.String] = None, licenseUrl: scala.Option[java.lang.String] = None, version: scala.Option[java.lang.String] = None, platform: scala.Option[java.lang.String] = None, isActive: scala.Option[scala.Boolean] = None, minPower: scala.Option[scala.Int] = None, name: scala.Option[java.lang.String] = None)
final case class GetDomainsResult(domains: scala.Option[scala.List[models.Domain]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class InstancePortInfo(fromPort: scala.Option[scala.Int] = None, toPort: scala.Option[scala.Int] = None, accessFrom: scala.Option[java.lang.String] = None, commonName: scala.Option[java.lang.String] = None, accessDirection: scala.Option[java.lang.String] = None, accessType: scala.Option[java.lang.String] = None, protocol: scala.Option[java.lang.String] = None)
final case class CreateDiskFromSnapshotRequest(diskName: java.lang.String, diskSnapshotName: java.lang.String, availabilityZone: java.lang.String, sizeInGb: scala.Int)
final case class GetDomainsRequest(pageToken: scala.Option[java.lang.String] = None)
final case class GetInstanceStateResult(state: scala.Option[models.InstanceState] = None)
final case class DeleteKeyPairResult(operation: scala.Option[models.Operation] = None)
final case class PutInstancePublicPortsRequest(portInfos: scala.List[models.PortInfo], instanceName: java.lang.String)
final case class AttachDiskRequest(diskName: java.lang.String, instanceName: java.lang.String, diskPath: java.lang.String)
final case class Bundle(price: scala.Option[scala.Float] = None, ramSizeInGb: scala.Option[scala.Float] = None, supportedPlatforms: scala.Option[scala.List[java.lang.String]] = None, bundleId: scala.Option[java.lang.String] = None, instanceType: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, isActive: scala.Option[scala.Boolean] = None, cpuCount: scala.Option[scala.Int] = None, diskSizeInGb: scala.Option[scala.Int] = None, power: scala.Option[scala.Int] = None, transferPerMonthInGb: scala.Option[scala.Int] = None)
final case class GetBundlesResult(bundles: scala.Option[scala.List[models.Bundle]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class GetInstanceSnapshotsRequest(pageToken: scala.Option[java.lang.String] = None)
final case class UnpeerVpcResult(operation: scala.Option[models.Operation] = None)
final case class CreateInstancesResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class PutInstancePublicPortsResult(operation: scala.Option[models.Operation] = None)
final case class Instance(ipv6Address: scala.Option[java.lang.String] = None, location: scala.Option[models.ResourceLocation] = None, bundleId: scala.Option[java.lang.String] = None, arn: scala.Option[java.lang.String] = None, username: scala.Option[java.lang.String] = None, blueprintName: scala.Option[java.lang.String] = None, blueprintId: scala.Option[java.lang.String] = None, hardware: scala.Option[models.InstanceHardware] = None, state: scala.Option[models.InstanceState] = None, resourceType: scala.Option[java.lang.String] = None, supportCode: scala.Option[java.lang.String] = None, isStaticIp: scala.Option[scala.Boolean] = None, name: scala.Option[java.lang.String] = None, sshKeyName: scala.Option[java.lang.String] = None, createdAt: scala.Option[java.time.Instant] = None, networking: scala.Option[models.InstanceNetworking] = None, privateIpAddress: scala.Option[java.lang.String] = None, publicIpAddress: scala.Option[java.lang.String] = None)
final case class GetOperationsResult(operations: scala.Option[scala.List[models.Operation]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class OperationFailureException(code: scala.Option[java.lang.String] = None, docs: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, tip: scala.Option[java.lang.String] = None)
final case class DeleteDiskSnapshotResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class GetOperationsForResourceResult(operations: scala.Option[scala.List[models.Operation]] = None, nextPageCount: scala.Option[java.lang.String] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class PasswordData(ciphertext: scala.Option[java.lang.String] = None, keyPairName: scala.Option[java.lang.String] = None)
final case class ImportKeyPairResult(operation: scala.Option[models.Operation] = None)
final case class GetKeyPairResult(keyPair: scala.Option[models.KeyPair] = None)
final case class AllocateStaticIpResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class InstanceNetworking(monthlyTransfer: scala.Option[models.MonthlyTransfer] = None, ports: scala.Option[scala.List[models.InstancePortInfo]] = None)
final case class GetDisksResult(disks: scala.Option[scala.List[models.Disk]] = None, nextPageToken: scala.Option[java.lang.String] = None)
final case class MetricDatapoint(minimum: scala.Option[scala.Double] = None, average: scala.Option[scala.Double] = None, sum: scala.Option[scala.Double] = None, sampleCount: scala.Option[scala.Double] = None, maximum: scala.Option[scala.Double] = None, timestamp: scala.Option[java.time.Instant] = None, unit: scala.Option[java.lang.String] = None)
final case class AttachStaticIpRequest(staticIpName: java.lang.String, instanceName: java.lang.String)
final case class GetInstanceRequest(instanceName: java.lang.String)
final case class PeerVpcResult(operation: scala.Option[models.Operation] = None)
final case class GetDiskRequest(diskName: java.lang.String)
final case class InstanceAccessDetails(certKey: scala.Option[java.lang.String] = None, password: scala.Option[java.lang.String] = None, privateKey: scala.Option[java.lang.String] = None, username: scala.Option[java.lang.String] = None, protocol: scala.Option[java.lang.String] = None, instanceName: scala.Option[java.lang.String] = None, expiresAt: scala.Option[java.time.Instant] = None, passwordData: scala.Option[models.PasswordData] = None, ipAddress: scala.Option[java.lang.String] = None)
final case class GetInstanceAccessDetailsResult(accessDetails: scala.Option[models.InstanceAccessDetails] = None)
final case class DiskSnapshot(location: scala.Option[models.ResourceLocation] = None, state: scala.Option[java.lang.String] = None, arn: scala.Option[java.lang.String] = None, fromDiskArn: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, supportCode: scala.Option[java.lang.String] = None, progress: scala.Option[java.lang.String] = None, sizeInGb: scala.Option[scala.Int] = None, name: scala.Option[java.lang.String] = None, fromDiskName: scala.Option[java.lang.String] = None, createdAt: scala.Option[java.time.Instant] = None)
final case class DeleteDiskSnapshotRequest(diskSnapshotName: java.lang.String)
final case class CreateDiskFromSnapshotResult(operations: scala.Option[scala.List[models.Operation]] = None)
final case class GetDiskSnapshotRequest(diskSnapshotName: java.lang.String)