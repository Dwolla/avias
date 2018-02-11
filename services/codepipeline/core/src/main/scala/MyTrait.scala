package org.lyranthe.araethura.codepipeline
trait Amazoncodepipeline[F[_]] {
  def listPipelineExecutions(input: models.ListPipelineExecutionsInput): F[models.ListPipelineExecutionsOutput]
  def createCustomActionType(input: models.CreateCustomActionTypeInput): F[models.CreateCustomActionTypeOutput]
  def putActionRevision(input: models.PutActionRevisionInput): F[models.PutActionRevisionOutput]
  def acknowledgeJob(input: models.AcknowledgeJobInput): F[models.AcknowledgeJobOutput]
  def putApprovalResult(input: models.PutApprovalResultInput): F[models.PutApprovalResultOutput]
  def putJobFailureResult(input: models.PutJobFailureResultInput): F[Unit]
  def listActionTypes(input: models.ListActionTypesInput): F[models.ListActionTypesOutput]
  def putThirdPartyJobSuccessResult(input: models.PutThirdPartyJobSuccessResultInput): F[Unit]
  def pollForJobs(input: models.PollForJobsInput): F[models.PollForJobsOutput]
  def acknowledgeThirdPartyJob(input: models.AcknowledgeThirdPartyJobInput): F[models.AcknowledgeThirdPartyJobOutput]
  def deleteCustomActionType(input: models.DeleteCustomActionTypeInput): F[Unit]
  def putThirdPartyJobFailureResult(input: models.PutThirdPartyJobFailureResultInput): F[Unit]
  def listPipelines(input: models.ListPipelinesInput): F[models.ListPipelinesOutput]
  def startPipelineExecution(input: models.StartPipelineExecutionInput): F[models.StartPipelineExecutionOutput]
  def getThirdPartyJobDetails(input: models.GetThirdPartyJobDetailsInput): F[models.GetThirdPartyJobDetailsOutput]
  def deletePipeline(input: models.DeletePipelineInput): F[Unit]
  def enableStageTransition(input: models.EnableStageTransitionInput): F[Unit]
  def createPipeline(input: models.CreatePipelineInput): F[models.CreatePipelineOutput]
  def getPipeline(input: models.GetPipelineInput): F[models.GetPipelineOutput]
  def pollForThirdPartyJobs(input: models.PollForThirdPartyJobsInput): F[models.PollForThirdPartyJobsOutput]
  def getPipelineExecution(input: models.GetPipelineExecutionInput): F[models.GetPipelineExecutionOutput]
  def updatePipeline(input: models.UpdatePipelineInput): F[models.UpdatePipelineOutput]
  def retryStageExecution(input: models.RetryStageExecutionInput): F[models.RetryStageExecutionOutput]
  def getJobDetails(input: models.GetJobDetailsInput): F[models.GetJobDetailsOutput]
  def disableStageTransition(input: models.DisableStageTransitionInput): F[Unit]
  def getPipelineState(input: models.GetPipelineStateInput): F[models.GetPipelineStateOutput]
  def putJobSuccessResult(input: models.PutJobSuccessResultInput): F[Unit]
}