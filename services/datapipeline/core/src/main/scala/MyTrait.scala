package org.lyranthe.araethura.datapipeline
trait Amazondatapipeline[F[_]] {
  def deactivatePipeline(input: models.DeactivatePipelineInput): F[scala.Unit]
  def queryObjects(input: models.QueryObjectsInput): F[models.QueryObjectsOutput]
  def putPipelineDefinition(input: models.PutPipelineDefinitionInput): F[models.PutPipelineDefinitionOutput]
  def evaluateExpression(input: models.EvaluateExpressionInput): F[models.EvaluateExpressionOutput]
  def reportTaskRunnerHeartbeat(input: models.ReportTaskRunnerHeartbeatInput): F[models.ReportTaskRunnerHeartbeatOutput]
  def getPipelineDefinition(input: models.GetPipelineDefinitionInput): F[models.GetPipelineDefinitionOutput]
  def reportTaskProgress(input: models.ReportTaskProgressInput): F[models.ReportTaskProgressOutput]
  def validatePipelineDefinition(input: models.ValidatePipelineDefinitionInput): F[models.ValidatePipelineDefinitionOutput]
  def deletePipeline(input: models.DeletePipelineInput): F[Unit]
  def pollForTask(input: models.PollForTaskInput): F[models.PollForTaskOutput]
  def activatePipeline(input: models.ActivatePipelineInput): F[scala.Unit]
  def setStatus(input: models.SetStatusInput): F[Unit]
  def setTaskStatus(input: models.SetTaskStatusInput): F[scala.Unit]
  def describeObjects(input: models.DescribeObjectsInput): F[models.DescribeObjectsOutput]
  def removeTags(input: models.RemoveTagsInput): F[scala.Unit]
  def addTags(input: models.AddTagsInput): F[scala.Unit]
  def describePipelines(input: models.DescribePipelinesInput): F[models.DescribePipelinesOutput]
  def listPipelines(input: models.ListPipelinesInput): F[models.ListPipelinesOutput]
  def createPipeline(input: models.CreatePipelineInput): F[models.CreatePipelineOutput]
}