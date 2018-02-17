package avias.ssm
trait Amazonssm[F[_]] {
  def getDeployablePatchSnapshotForInstance(input: avias.ssm.models.GetDeployablePatchSnapshotForInstanceRequest): F[avias.ssm.models.GetDeployablePatchSnapshotForInstanceResult]
  def deleteParameters(input: avias.ssm.models.DeleteParametersRequest): F[avias.ssm.models.DeleteParametersResult]
  def listDocuments(input: avias.ssm.models.ListDocumentsRequest): F[avias.ssm.models.ListDocumentsResult]
  def listResourceDataSync(input: avias.ssm.models.ListResourceDataSyncRequest): F[avias.ssm.models.ListResourceDataSyncResult]
  def describeInstancePatches(input: avias.ssm.models.DescribeInstancePatchesRequest): F[avias.ssm.models.DescribeInstancePatchesResult]
  def describePatchBaselines(input: avias.ssm.models.DescribePatchBaselinesRequest): F[avias.ssm.models.DescribePatchBaselinesResult]
  def describeEffectiveInstanceAssociations(input: avias.ssm.models.DescribeEffectiveInstanceAssociationsRequest): F[avias.ssm.models.DescribeEffectiveInstanceAssociationsResult]
  def describeInstancePatchStatesForPatchGroup(input: avias.ssm.models.DescribeInstancePatchStatesForPatchGroupRequest): F[avias.ssm.models.DescribeInstancePatchStatesForPatchGroupResult]
  def describeMaintenanceWindowExecutions(input: avias.ssm.models.DescribeMaintenanceWindowExecutionsRequest): F[avias.ssm.models.DescribeMaintenanceWindowExecutionsResult]
  def updateAssociation(input: avias.ssm.models.UpdateAssociationRequest): F[avias.ssm.models.UpdateAssociationResult]
  def describeInstanceAssociationsStatus(input: avias.ssm.models.DescribeInstanceAssociationsStatusRequest): F[avias.ssm.models.DescribeInstanceAssociationsStatusResult]
  def describeEffectivePatchesForPatchBaseline(input: avias.ssm.models.DescribeEffectivePatchesForPatchBaselineRequest): F[avias.ssm.models.DescribeEffectivePatchesForPatchBaselineResult]
  def createAssociation(input: avias.ssm.models.CreateAssociationRequest): F[avias.ssm.models.CreateAssociationResult]
  def createPatchBaseline(input: avias.ssm.models.CreatePatchBaselineRequest): F[avias.ssm.models.CreatePatchBaselineResult]
  def createDocument(input: avias.ssm.models.CreateDocumentRequest): F[avias.ssm.models.CreateDocumentResult]
  def registerPatchBaselineForPatchGroup(input: avias.ssm.models.RegisterPatchBaselineForPatchGroupRequest): F[avias.ssm.models.RegisterPatchBaselineForPatchGroupResult]
  def createAssociationBatch(input: avias.ssm.models.CreateAssociationBatchRequest): F[avias.ssm.models.CreateAssociationBatchResult]
  def deleteResourceDataSync(input: avias.ssm.models.DeleteResourceDataSyncRequest): F[scala.Unit]
  def getCommandInvocation(input: avias.ssm.models.GetCommandInvocationRequest): F[avias.ssm.models.GetCommandInvocationResult]
  def modifyDocumentPermission(input: avias.ssm.models.ModifyDocumentPermissionRequest): F[scala.Unit]
  def updateMaintenanceWindowTask(input: avias.ssm.models.UpdateMaintenanceWindowTaskRequest): F[avias.ssm.models.UpdateMaintenanceWindowTaskResult]
  def describeMaintenanceWindowExecutionTasks(input: avias.ssm.models.DescribeMaintenanceWindowExecutionTasksRequest): F[avias.ssm.models.DescribeMaintenanceWindowExecutionTasksResult]
  def describePatchGroupState(input: avias.ssm.models.DescribePatchGroupStateRequest): F[avias.ssm.models.DescribePatchGroupStateResult]
  def getMaintenanceWindowExecutionTask(input: avias.ssm.models.GetMaintenanceWindowExecutionTaskRequest): F[avias.ssm.models.GetMaintenanceWindowExecutionTaskResult]
  def getParametersByPath(input: avias.ssm.models.GetParametersByPathRequest): F[avias.ssm.models.GetParametersByPathResult]
  def registerTaskWithMaintenanceWindow(input: avias.ssm.models.RegisterTaskWithMaintenanceWindowRequest): F[avias.ssm.models.RegisterTaskWithMaintenanceWindowResult]
  def sendAutomationSignal(input: avias.ssm.models.SendAutomationSignalRequest): F[scala.Unit]
  def listDocumentVersions(input: avias.ssm.models.ListDocumentVersionsRequest): F[avias.ssm.models.ListDocumentVersionsResult]
  def updateManagedInstanceRole(input: avias.ssm.models.UpdateManagedInstanceRoleRequest): F[scala.Unit]
  def getInventorySchema(input: avias.ssm.models.GetInventorySchemaRequest): F[avias.ssm.models.GetInventorySchemaResult]
  def describeMaintenanceWindows(input: avias.ssm.models.DescribeMaintenanceWindowsRequest): F[avias.ssm.models.DescribeMaintenanceWindowsResult]
  def describeAvailablePatches(input: avias.ssm.models.DescribeAvailablePatchesRequest): F[avias.ssm.models.DescribeAvailablePatchesResult]
  def getInventory(input: avias.ssm.models.GetInventoryRequest): F[avias.ssm.models.GetInventoryResult]
  def updatePatchBaseline(input: avias.ssm.models.UpdatePatchBaselineRequest): F[avias.ssm.models.UpdatePatchBaselineResult]
  def listTagsForResource(input: avias.ssm.models.ListTagsForResourceRequest): F[avias.ssm.models.ListTagsForResourceResult]
  def describeMaintenanceWindowExecutionTaskInvocations(input: avias.ssm.models.DescribeMaintenanceWindowExecutionTaskInvocationsRequest): F[avias.ssm.models.DescribeMaintenanceWindowExecutionTaskInvocationsResult]
  def registerDefaultPatchBaseline(input: avias.ssm.models.RegisterDefaultPatchBaselineRequest): F[avias.ssm.models.RegisterDefaultPatchBaselineResult]
  def describeParameters(input: avias.ssm.models.DescribeParametersRequest): F[avias.ssm.models.DescribeParametersResult]
  def sendCommand(input: avias.ssm.models.SendCommandRequest): F[avias.ssm.models.SendCommandResult]
  def describeMaintenanceWindowTasks(input: avias.ssm.models.DescribeMaintenanceWindowTasksRequest): F[avias.ssm.models.DescribeMaintenanceWindowTasksResult]
  def listAssociationVersions(input: avias.ssm.models.ListAssociationVersionsRequest): F[avias.ssm.models.ListAssociationVersionsResult]
  def deregisterTaskFromMaintenanceWindow(input: avias.ssm.models.DeregisterTaskFromMaintenanceWindowRequest): F[avias.ssm.models.DeregisterTaskFromMaintenanceWindowResult]
  def updateDocument(input: avias.ssm.models.UpdateDocumentRequest): F[avias.ssm.models.UpdateDocumentResult]
  def updateAssociationStatus(input: avias.ssm.models.UpdateAssociationStatusRequest): F[avias.ssm.models.UpdateAssociationStatusResult]
  def getPatchBaselineForPatchGroup(input: avias.ssm.models.GetPatchBaselineForPatchGroupRequest): F[avias.ssm.models.GetPatchBaselineForPatchGroupResult]
  def listInventoryEntries(input: avias.ssm.models.ListInventoryEntriesRequest): F[avias.ssm.models.ListInventoryEntriesResult]
  def putInventory(input: avias.ssm.models.PutInventoryRequest): F[scala.Unit]
  def getParameterHistory(input: avias.ssm.models.GetParameterHistoryRequest): F[avias.ssm.models.GetParameterHistoryResult]
  def listCommands(input: avias.ssm.models.ListCommandsRequest): F[avias.ssm.models.ListCommandsResult]
  def getMaintenanceWindowTask(input: avias.ssm.models.GetMaintenanceWindowTaskRequest): F[avias.ssm.models.GetMaintenanceWindowTaskResult]
  def createActivation(input: avias.ssm.models.CreateActivationRequest): F[avias.ssm.models.CreateActivationResult]
  def stopAutomationExecution(input: avias.ssm.models.StopAutomationExecutionRequest): F[scala.Unit]
  def getPatchBaseline(input: avias.ssm.models.GetPatchBaselineRequest): F[avias.ssm.models.GetPatchBaselineResult]
  def listResourceComplianceSummaries(input: avias.ssm.models.ListResourceComplianceSummariesRequest): F[avias.ssm.models.ListResourceComplianceSummariesResult]
  def addTagsToResource(input: avias.ssm.models.AddTagsToResourceRequest): F[scala.Unit]
  def deleteActivation(input: avias.ssm.models.DeleteActivationRequest): F[scala.Unit]
  def describeInstancePatchStates(input: avias.ssm.models.DescribeInstancePatchStatesRequest): F[avias.ssm.models.DescribeInstancePatchStatesResult]
  def getAutomationExecution(input: avias.ssm.models.GetAutomationExecutionRequest): F[avias.ssm.models.GetAutomationExecutionResult]
  def createResourceDataSync(input: avias.ssm.models.CreateResourceDataSyncRequest): F[scala.Unit]
  def cancelCommand(input: avias.ssm.models.CancelCommandRequest): F[scala.Unit]
  def updateMaintenanceWindow(input: avias.ssm.models.UpdateMaintenanceWindowRequest): F[avias.ssm.models.UpdateMaintenanceWindowResult]
  def getMaintenanceWindowExecution(input: avias.ssm.models.GetMaintenanceWindowExecutionRequest): F[avias.ssm.models.GetMaintenanceWindowExecutionResult]
  def getParameter(input: avias.ssm.models.GetParameterRequest): F[avias.ssm.models.GetParameterResult]
  def startAutomationExecution(input: avias.ssm.models.StartAutomationExecutionRequest): F[avias.ssm.models.StartAutomationExecutionResult]
  def createMaintenanceWindow(input: avias.ssm.models.CreateMaintenanceWindowRequest): F[avias.ssm.models.CreateMaintenanceWindowResult]
  def describeInstanceInformation(input: avias.ssm.models.DescribeInstanceInformationRequest): F[avias.ssm.models.DescribeInstanceInformationResult]
  def putComplianceItems(input: avias.ssm.models.PutComplianceItemsRequest): F[scala.Unit]
  def putParameter(input: avias.ssm.models.PutParameterRequest): F[avias.ssm.models.PutParameterResult]
  def describeDocumentPermission(input: avias.ssm.models.DescribeDocumentPermissionRequest): F[avias.ssm.models.DescribeDocumentPermissionResponse]
  def updateDocumentDefaultVersion(input: avias.ssm.models.UpdateDocumentDefaultVersionRequest): F[avias.ssm.models.UpdateDocumentDefaultVersionResult]
  def describeDocument(input: avias.ssm.models.DescribeDocumentRequest): F[avias.ssm.models.DescribeDocumentResult]
  def registerTargetWithMaintenanceWindow(input: avias.ssm.models.RegisterTargetWithMaintenanceWindowRequest): F[avias.ssm.models.RegisterTargetWithMaintenanceWindowResult]
  def listComplianceItems(input: avias.ssm.models.ListComplianceItemsRequest): F[avias.ssm.models.ListComplianceItemsResult]
  def deleteDocument(input: avias.ssm.models.DeleteDocumentRequest): F[scala.Unit]
  def deregisterManagedInstance(input: avias.ssm.models.DeregisterManagedInstanceRequest): F[scala.Unit]
  def deregisterPatchBaselineForPatchGroup(input: avias.ssm.models.DeregisterPatchBaselineForPatchGroupRequest): F[avias.ssm.models.DeregisterPatchBaselineForPatchGroupResult]
  def describeActivations(input: avias.ssm.models.DescribeActivationsRequest): F[avias.ssm.models.DescribeActivationsResult]
  def getDocument(input: avias.ssm.models.GetDocumentRequest): F[avias.ssm.models.GetDocumentResult]
  def removeTagsFromResource(input: avias.ssm.models.RemoveTagsFromResourceRequest): F[scala.Unit]
  def getMaintenanceWindow(input: avias.ssm.models.GetMaintenanceWindowRequest): F[avias.ssm.models.GetMaintenanceWindowResult]
  def updateMaintenanceWindowTarget(input: avias.ssm.models.UpdateMaintenanceWindowTargetRequest): F[avias.ssm.models.UpdateMaintenanceWindowTargetResult]
  def deleteAssociation(input: avias.ssm.models.DeleteAssociationRequest): F[scala.Unit]
  def deleteMaintenanceWindow(input: avias.ssm.models.DeleteMaintenanceWindowRequest): F[avias.ssm.models.DeleteMaintenanceWindowResult]
  def getDefaultPatchBaseline(input: avias.ssm.models.GetDefaultPatchBaselineRequest): F[avias.ssm.models.GetDefaultPatchBaselineResult]
  def listComplianceSummaries(input: avias.ssm.models.ListComplianceSummariesRequest): F[avias.ssm.models.ListComplianceSummariesResult]
  def deletePatchBaseline(input: avias.ssm.models.DeletePatchBaselineRequest): F[avias.ssm.models.DeletePatchBaselineResult]
  def listCommandInvocations(input: avias.ssm.models.ListCommandInvocationsRequest): F[avias.ssm.models.ListCommandInvocationsResult]
  def getParameters(input: avias.ssm.models.GetParametersRequest): F[avias.ssm.models.GetParametersResult]
  def listAssociations(input: avias.ssm.models.ListAssociationsRequest): F[avias.ssm.models.ListAssociationsResult]
  def deleteParameter(input: avias.ssm.models.DeleteParameterRequest): F[scala.Unit]
  def describeMaintenanceWindowTargets(input: avias.ssm.models.DescribeMaintenanceWindowTargetsRequest): F[avias.ssm.models.DescribeMaintenanceWindowTargetsResult]
  def getMaintenanceWindowExecutionTaskInvocation(input: avias.ssm.models.GetMaintenanceWindowExecutionTaskInvocationRequest): F[avias.ssm.models.GetMaintenanceWindowExecutionTaskInvocationResult]
  def describePatchGroups(input: avias.ssm.models.DescribePatchGroupsRequest): F[avias.ssm.models.DescribePatchGroupsResult]
  def deregisterTargetFromMaintenanceWindow(input: avias.ssm.models.DeregisterTargetFromMaintenanceWindowRequest): F[avias.ssm.models.DeregisterTargetFromMaintenanceWindowResult]
  def describeAssociation(input: avias.ssm.models.DescribeAssociationRequest): F[avias.ssm.models.DescribeAssociationResult]
  def describeAutomationExecutions(input: avias.ssm.models.DescribeAutomationExecutionsRequest): F[avias.ssm.models.DescribeAutomationExecutionsResult]
}