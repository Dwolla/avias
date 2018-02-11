package org.lyranthe.araethura.devicefarm.models
import org.lyranthe.araethura.devicefarm.models
final case class ListSamplesRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class CreateRemoteAccessSessionRequest(projectArn: java.lang.String, deviceArn: java.lang.String, name: scala.Option[java.lang.String] = None, configuration: scala.Option[models.CreateRemoteAccessSessionConfiguration] = None, clientId: scala.Option[java.lang.String] = None, remoteDebugEnabled: scala.Option[scala.Boolean] = None, sshPublicKey: scala.Option[java.lang.String] = None)
case object DeleteUploadResult
final case class GetDeviceResult(device: scala.Option[models.Device] = None)
final case class Offering(recurringCharges: scala.Option[scala.List[models.RecurringCharge]] = None, id: scala.Option[java.lang.String] = None, platform: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None)
final case class CreateUploadRequest(projectArn: java.lang.String, name: java.lang.String, `type`: java.lang.String, contentType: scala.Option[java.lang.String] = None)
final case class StopRunResult(run: scala.Option[models.Run] = None)
final case class Upload(arn: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, created: scala.Option[java.time.Instant] = None, contentType: scala.Option[java.lang.String] = None, url: scala.Option[java.lang.String] = None, metadata: scala.Option[java.lang.String] = None)
final case class RecurringCharge(cost: scala.Option[models.MonetaryAmount] = None, frequency: scala.Option[java.lang.String] = None)
final case class ListArtifactsResult(artifacts: scala.Option[scala.List[models.Artifact]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListJobsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class GetSuiteResult(suite: scala.Option[models.Suite] = None)
final case class GetProjectResult(project: scala.Option[models.Project] = None)
final case class Suite(arn: scala.Option[java.lang.String] = None, deviceMinutes: scala.Option[models.DeviceMinutes] = None, name: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, result: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, counters: scala.Option[models.Counters] = None, created: scala.Option[java.time.Instant] = None, started: scala.Option[java.time.Instant] = None, stopped: scala.Option[java.time.Instant] = None)
final case class GetDevicePoolCompatibilityResult(compatibleDevices: scala.Option[scala.List[models.DevicePoolCompatibilityResult]] = None, incompatibleDevices: scala.Option[scala.List[models.DevicePoolCompatibilityResult]] = None)
final case class CustomerArtifactPaths(iosPaths: scala.Option[scala.List[java.lang.String]] = None, androidPaths: scala.Option[scala.List[java.lang.String]] = None, deviceHostPaths: scala.Option[scala.List[java.lang.String]] = None)
final case class ScheduleRunTest(`type`: java.lang.String, testPackageArn: scala.Option[java.lang.String] = None, filter: scala.Option[java.lang.String] = None, parameters: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = None)
final case class ListOfferingTransactionsRequest(nextToken: scala.Option[java.lang.String] = None)
final case class ListSamplesResult(samples: scala.Option[scala.List[models.Sample]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class LimitExceededException(message: scala.Option[java.lang.String] = None)
final case class DeviceMinutes(total: scala.Option[scala.Double] = None, metered: scala.Option[scala.Double] = None, unmetered: scala.Option[scala.Double] = None)
final case class Radios(wifi: scala.Option[scala.Boolean] = None, bluetooth: scala.Option[scala.Boolean] = None, nfc: scala.Option[scala.Boolean] = None, gps: scala.Option[scala.Boolean] = None)
final case class UpdateDevicePoolResult(devicePool: scala.Option[models.DevicePool] = None)
final case class GetDeviceRequest(arn: java.lang.String)
final case class InstallToRemoteAccessSessionResult(appUpload: scala.Option[models.Upload] = None)
final case class ListRunsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class DevicePoolCompatibilityResult(device: scala.Option[models.Device] = None, compatible: scala.Option[scala.Boolean] = None, incompatibilityMessages: scala.Option[scala.List[models.IncompatibilityMessage]] = None)
final case class Rule(attribute: scala.Option[java.lang.String] = None, operator: scala.Option[java.lang.String] = None, value: scala.Option[java.lang.String] = None)
final case class Device(arn: scala.Option[java.lang.String] = None, heapSize: scala.Option[scala.Long] = None, memory: scala.Option[scala.Long] = None, os: scala.Option[java.lang.String] = None, radio: scala.Option[java.lang.String] = None, manufacturer: scala.Option[java.lang.String] = None, model: scala.Option[java.lang.String] = None, image: scala.Option[java.lang.String] = None, carrier: scala.Option[java.lang.String] = None, fleetType: scala.Option[java.lang.String] = None, fleetName: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, platform: scala.Option[java.lang.String] = None, resolution: scala.Option[models.Resolution] = None, cpu: scala.Option[models.CPU] = None, remoteAccessEnabled: scala.Option[scala.Boolean] = None, remoteDebugEnabled: scala.Option[scala.Boolean] = None, formFactor: scala.Option[java.lang.String] = None)
final case class ListUploadsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class GetNetworkProfileResult(networkProfile: scala.Option[models.NetworkProfile] = None)
final case class UpdateNetworkProfileRequest(arn: java.lang.String, uplinkLossPercent: scala.Option[scala.Int] = None, downlinkLossPercent: scala.Option[scala.Int] = None, `type`: scala.Option[java.lang.String] = None, uplinkDelayMs: scala.Option[scala.Long] = None, downlinkJitterMs: scala.Option[scala.Long] = None, downlinkDelayMs: scala.Option[scala.Long] = None, uplinkJitterMs: scala.Option[scala.Long] = None, downlinkBandwidthBits: scala.Option[scala.Long] = None, uplinkBandwidthBits: scala.Option[scala.Long] = None, name: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class GetRunResult(run: scala.Option[models.Run] = None)
final case class Location(latitude: scala.Double, longitude: scala.Double)
final case class DeleteUploadRequest(arn: java.lang.String)
final case class ListTestsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class AccountSettings(unmeteredDevices: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]] = None, unmeteredRemoteAccessDevices: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]] = None, maxSlots: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]] = None, trialMinutes: scala.Option[models.TrialMinutes] = None, awsAccountNumber: scala.Option[java.lang.String] = None, maxJobTimeoutMinutes: scala.Option[scala.Int] = None, defaultJobTimeoutMinutes: scala.Option[scala.Int] = None)
final case class CreateRemoteAccessSessionConfiguration(billingMethod: scala.Option[java.lang.String] = None)
final case class ListNetworkProfilesRequest(arn: java.lang.String, `type`: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListOfferingsRequest(nextToken: scala.Option[java.lang.String] = None)
final case class OfferingStatus(`type`: scala.Option[java.lang.String] = None, offering: scala.Option[models.Offering] = None, quantity: scala.Option[scala.Int] = None, effectiveOn: scala.Option[java.time.Instant] = None)
final case class Problem(run: scala.Option[models.ProblemDetail] = None, job: scala.Option[models.ProblemDetail] = None, suite: scala.Option[models.ProblemDetail] = None, test: scala.Option[models.ProblemDetail] = None, device: scala.Option[models.Device] = None, result: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None)
final case class GetProjectRequest(arn: java.lang.String)
final case class GetRunRequest(arn: java.lang.String)
final case class GetRemoteAccessSessionRequest(arn: java.lang.String)
final case class CreateNetworkProfileRequest(projectArn: java.lang.String, name: java.lang.String, uplinkLossPercent: scala.Option[scala.Int] = None, downlinkLossPercent: scala.Option[scala.Int] = None, `type`: scala.Option[java.lang.String] = None, uplinkDelayMs: scala.Option[scala.Long] = None, downlinkJitterMs: scala.Option[scala.Long] = None, downlinkDelayMs: scala.Option[scala.Long] = None, uplinkJitterMs: scala.Option[scala.Long] = None, downlinkBandwidthBits: scala.Option[scala.Long] = None, uplinkBandwidthBits: scala.Option[scala.Long] = None, description: scala.Option[java.lang.String] = None)
final case class DeleteRunRequest(arn: java.lang.String)
final case class ListProjectsResult(projects: scala.Option[scala.List[models.Project]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class CreateNetworkProfileResult(networkProfile: scala.Option[models.NetworkProfile] = None)
final case class UpdateNetworkProfileResult(networkProfile: scala.Option[models.NetworkProfile] = None)
case object DeleteNetworkProfileResult
final case class Artifact(`type`: scala.Option[java.lang.String] = None, arn: scala.Option[java.lang.String] = None, extension: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, url: scala.Option[java.lang.String] = None)
final case class OfferingTransaction(transactionId: scala.Option[java.lang.String] = None, offeringStatus: scala.Option[models.OfferingStatus] = None, createdOn: scala.Option[java.time.Instant] = None, offeringPromotionId: scala.Option[java.lang.String] = None, cost: scala.Option[models.MonetaryAmount] = None)
final case class ListRunsResult(runs: scala.Option[scala.List[models.Run]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class IdempotencyException(message: scala.Option[java.lang.String] = None)
final case class GetNetworkProfileRequest(arn: java.lang.String)
final case class Project(arn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, defaultJobTimeoutMinutes: scala.Option[scala.Int] = None, created: scala.Option[java.time.Instant] = None)
final case class ListJobsResult(jobs: scala.Option[scala.List[models.Job]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ScheduleRunRequest(projectArn: java.lang.String, devicePoolArn: java.lang.String, test: models.ScheduleRunTest, appArn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, executionConfiguration: scala.Option[models.ExecutionConfiguration] = None, configuration: scala.Option[models.ScheduleRunConfiguration] = None)
case object DeleteDevicePoolResult
final case class CreateUploadResult(upload: scala.Option[models.Upload] = None)
final case class ListUniqueProblemsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class StopRemoteAccessSessionRequest(arn: java.lang.String)
final case class ListOfferingPromotionsResult(offeringPromotions: scala.Option[scala.List[models.OfferingPromotion]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DeleteDevicePoolRequest(arn: java.lang.String)
final case class CreateDevicePoolResult(devicePool: scala.Option[models.DevicePool] = None)
final case class ListOfferingsResult(offerings: scala.Option[scala.List[models.Offering]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ScheduleRunResult(run: scala.Option[models.Run] = None)
final case class PurchaseOfferingRequest(offeringId: scala.Option[java.lang.String] = None, quantity: scala.Option[scala.Int] = None, offeringPromotionId: scala.Option[java.lang.String] = None)
case object GetAccountSettingsRequest
final case class GetJobRequest(arn: java.lang.String)
final case class DeleteRemoteAccessSessionRequest(arn: java.lang.String)
final case class GetAccountSettingsResult(accountSettings: scala.Option[models.AccountSettings] = None)
final case class Counters(passed: scala.Option[scala.Int] = None, total: scala.Option[scala.Int] = None, errored: scala.Option[scala.Int] = None, skipped: scala.Option[scala.Int] = None, warned: scala.Option[scala.Int] = None, failed: scala.Option[scala.Int] = None, stopped: scala.Option[scala.Int] = None)
final case class InstallToRemoteAccessSessionRequest(remoteAccessSessionArn: java.lang.String, appArn: java.lang.String)
final case class ArgumentException(message: scala.Option[java.lang.String] = None)
final case class NotEligibleException(message: scala.Option[java.lang.String] = None)
final case class ListOfferingTransactionsResult(offeringTransactions: scala.Option[scala.List[models.OfferingTransaction]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListRemoteAccessSessionsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class Job(arn: scala.Option[java.lang.String] = None, deviceMinutes: scala.Option[models.DeviceMinutes] = None, device: scala.Option[models.Device] = None, name: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, result: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, counters: scala.Option[models.Counters] = None, created: scala.Option[java.time.Instant] = None, started: scala.Option[java.time.Instant] = None, stopped: scala.Option[java.time.Instant] = None)
case object DeleteRemoteAccessSessionResult
final case class ListDevicePoolsRequest(arn: java.lang.String, `type`: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
final case class NotFoundException(message: scala.Option[java.lang.String] = None)
final case class RemoteAccessSession(arn: scala.Option[java.lang.String] = None, hostAddress: scala.Option[java.lang.String] = None, deviceMinutes: scala.Option[models.DeviceMinutes] = None, endpoint: scala.Option[java.lang.String] = None, deviceUdid: scala.Option[java.lang.String] = None, device: scala.Option[models.Device] = None, name: scala.Option[java.lang.String] = None, result: scala.Option[java.lang.String] = None, clientId: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, created: scala.Option[java.time.Instant] = None, started: scala.Option[java.time.Instant] = None, stopped: scala.Option[java.time.Instant] = None, billingMethod: scala.Option[java.lang.String] = None, remoteDebugEnabled: scala.Option[scala.Boolean] = None)
final case class Sample(arn: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, url: scala.Option[java.lang.String] = None)
final case class GetOfferingStatusRequest(nextToken: scala.Option[java.lang.String] = None)
final case class ServiceAccountException(message: scala.Option[java.lang.String] = None)
final case class CreateProjectRequest(name: java.lang.String, defaultJobTimeoutMinutes: scala.Option[scala.Int] = None)
final case class Resolution(width: scala.Option[scala.Int] = None, height: scala.Option[scala.Int] = None)
final case class RenewOfferingRequest(offeringId: scala.Option[java.lang.String] = None, quantity: scala.Option[scala.Int] = None)
final case class Run(arn: scala.Option[java.lang.String] = None, customerArtifactPaths: scala.Option[models.CustomerArtifactPaths] = None, deviceMinutes: scala.Option[models.DeviceMinutes] = None, parsingResultUrl: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, platform: scala.Option[java.lang.String] = None, result: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, counters: scala.Option[models.Counters] = None, created: scala.Option[java.time.Instant] = None, started: scala.Option[java.time.Instant] = None, stopped: scala.Option[java.time.Instant] = None, billingMethod: scala.Option[java.lang.String] = None, totalJobs: scala.Option[scala.Int] = None, completedJobs: scala.Option[scala.Int] = None, resultCode: scala.Option[java.lang.String] = None, networkProfile: scala.Option[models.NetworkProfile] = None)
final case class CPU(frequency: scala.Option[java.lang.String] = None, architecture: scala.Option[java.lang.String] = None, clock: scala.Option[scala.Double] = None)
final case class ListTestsResult(tests: scala.Option[scala.List[models.Test]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DeleteProjectRequest(arn: java.lang.String)
final case class DevicePool(arn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, rules: scala.Option[scala.List[models.Rule]] = None, description: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None)
final case class StopRemoteAccessSessionResult(remoteAccessSession: scala.Option[models.RemoteAccessSession] = None)
final case class GetUploadResult(upload: scala.Option[models.Upload] = None)
final case class ListSuitesResult(suites: scala.Option[scala.List[models.Suite]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class GetTestRequest(arn: java.lang.String)
final case class GetSuiteRequest(arn: java.lang.String)
final case class ExecutionConfiguration(jobTimeoutMinutes: scala.Option[scala.Int] = None, accountsCleanup: scala.Option[scala.Boolean] = None, appPackagesCleanup: scala.Option[scala.Boolean] = None)
final case class RenewOfferingResult(offeringTransaction: scala.Option[models.OfferingTransaction] = None)
final case class CreateDevicePoolRequest(projectArn: java.lang.String, name: java.lang.String, rules: scala.List[models.Rule], description: scala.Option[java.lang.String] = None)
final case class GetOfferingStatusResult(current: scala.Option[scala.collection.immutable.Map[java.lang.String, models.OfferingStatus]] = None, nextPeriod: scala.Option[scala.collection.immutable.Map[java.lang.String, models.OfferingStatus]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListUploadsResult(uploads: scala.Option[scala.List[models.Upload]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListDevicesRequest(arn: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ScheduleRunConfiguration(extraDataPackageArn: scala.Option[java.lang.String] = None, networkProfileArn: scala.Option[java.lang.String] = None, customerArtifactPaths: scala.Option[models.CustomerArtifactPaths] = None, radios: scala.Option[models.Radios] = None, locale: scala.Option[java.lang.String] = None, location: scala.Option[models.Location] = None, billingMethod: scala.Option[java.lang.String] = None, auxiliaryApps: scala.Option[scala.List[java.lang.String]] = None)
final case class TrialMinutes(total: scala.Option[scala.Double] = None, remaining: scala.Option[scala.Double] = None)
final case class ListDevicesResult(devices: scala.Option[scala.List[models.Device]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class UpdateProjectRequest(arn: java.lang.String, name: scala.Option[java.lang.String] = None, defaultJobTimeoutMinutes: scala.Option[scala.Int] = None)
case object DeleteProjectResult
final case class GetRemoteAccessSessionResult(remoteAccessSession: scala.Option[models.RemoteAccessSession] = None)
final case class ListDevicePoolsResult(devicePools: scala.Option[scala.List[models.DevicePool]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class GetJobResult(job: scala.Option[models.Job] = None)
final case class ListRemoteAccessSessionsResult(remoteAccessSessions: scala.Option[scala.List[models.RemoteAccessSession]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class GetUploadRequest(arn: java.lang.String)
final case class PurchaseOfferingResult(offeringTransaction: scala.Option[models.OfferingTransaction] = None)
final case class ListArtifactsRequest(arn: java.lang.String, `type`: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class GetDevicePoolCompatibilityRequest(devicePoolArn: java.lang.String, appArn: scala.Option[java.lang.String] = None, testType: scala.Option[java.lang.String] = None, test: scala.Option[models.ScheduleRunTest] = None)
final case class UpdateDevicePoolRequest(arn: java.lang.String, name: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, rules: scala.Option[scala.List[models.Rule]] = None)
final case class ListSuitesRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class MonetaryAmount(amount: scala.Option[scala.Double] = None, currencyCode: scala.Option[java.lang.String] = None)
final case class Test(arn: scala.Option[java.lang.String] = None, deviceMinutes: scala.Option[models.DeviceMinutes] = None, name: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, result: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, counters: scala.Option[models.Counters] = None, created: scala.Option[java.time.Instant] = None, started: scala.Option[java.time.Instant] = None, stopped: scala.Option[java.time.Instant] = None)
case object DeleteRunResult
final case class ListOfferingPromotionsRequest(nextToken: scala.Option[java.lang.String] = None)
final case class ProblemDetail(arn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None)
final case class CreateRemoteAccessSessionResult(remoteAccessSession: scala.Option[models.RemoteAccessSession] = None)
final case class StopRunRequest(arn: java.lang.String)
final case class ListUniqueProblemsResult(uniqueProblems: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[models.UniqueProblem]]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListNetworkProfilesResult(networkProfiles: scala.Option[scala.List[models.NetworkProfile]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DeleteNetworkProfileRequest(arn: java.lang.String)
final case class OfferingPromotion(id: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class IncompatibilityMessage(message: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None)
final case class UniqueProblem(message: scala.Option[java.lang.String] = None, problems: scala.Option[scala.List[models.Problem]] = None)
final case class GetTestResult(test: scala.Option[models.Test] = None)
final case class GetDevicePoolResult(devicePool: scala.Option[models.DevicePool] = None)
final case class NetworkProfile(arn: scala.Option[java.lang.String] = None, uplinkLossPercent: scala.Option[scala.Int] = None, downlinkLossPercent: scala.Option[scala.Int] = None, `type`: scala.Option[java.lang.String] = None, uplinkDelayMs: scala.Option[scala.Long] = None, downlinkJitterMs: scala.Option[scala.Long] = None, downlinkDelayMs: scala.Option[scala.Long] = None, uplinkJitterMs: scala.Option[scala.Long] = None, downlinkBandwidthBits: scala.Option[scala.Long] = None, uplinkBandwidthBits: scala.Option[scala.Long] = None, name: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class UpdateProjectResult(project: scala.Option[models.Project] = None)
final case class CreateProjectResult(project: scala.Option[models.Project] = None)
final case class ListProjectsRequest(arn: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
final case class GetDevicePoolRequest(arn: java.lang.String)