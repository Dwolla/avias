package org.lyranthe.araethura.codecommit
trait Amazoncodecommit[F[_]] {
  def getDifferences(input: models.GetDifferencesInput): F[models.GetDifferencesOutput]
  def deleteRepository(input: models.DeleteRepositoryInput): F[models.DeleteRepositoryOutput]
  def deleteCommentContent(input: models.DeleteCommentContentInput): F[models.DeleteCommentContentOutput]
  def getBlob(input: models.GetBlobInput): F[models.GetBlobOutput]
  def getBranch(input: models.GetBranchInput): F[models.GetBranchOutput]
  def getPullRequest(input: models.GetPullRequestInput): F[models.GetPullRequestOutput]
  def describePullRequestEvents(input: models.DescribePullRequestEventsInput): F[models.DescribePullRequestEventsOutput]
  def getComment(input: models.GetCommentInput): F[models.GetCommentOutput]
  def getRepositoryTriggers(input: models.GetRepositoryTriggersInput): F[models.GetRepositoryTriggersOutput]
  def updatePullRequestTitle(input: models.UpdatePullRequestTitleInput): F[models.UpdatePullRequestTitleOutput]
  def updateComment(input: models.UpdateCommentInput): F[models.UpdateCommentOutput]
  def postCommentReply(input: models.PostCommentReplyInput): F[models.PostCommentReplyOutput]
  def getRepository(input: models.GetRepositoryInput): F[models.GetRepositoryOutput]
  def createBranch(input: models.CreateBranchInput): F[Unit]
  def updateRepositoryDescription(input: models.UpdateRepositoryDescriptionInput): F[Unit]
  def getCommentsForComparedCommit(input: models.GetCommentsForComparedCommitInput): F[models.GetCommentsForComparedCommitOutput]
  def getMergeConflicts(input: models.GetMergeConflictsInput): F[models.GetMergeConflictsOutput]
  def createRepository(input: models.CreateRepositoryInput): F[models.CreateRepositoryOutput]
  def listRepositories(input: models.ListRepositoriesInput): F[models.ListRepositoriesOutput]
  def getCommentsForPullRequest(input: models.GetCommentsForPullRequestInput): F[models.GetCommentsForPullRequestOutput]
  def putRepositoryTriggers(input: models.PutRepositoryTriggersInput): F[models.PutRepositoryTriggersOutput]
  def listPullRequests(input: models.ListPullRequestsInput): F[models.ListPullRequestsOutput]
  def createPullRequest(input: models.CreatePullRequestInput): F[models.CreatePullRequestOutput]
  def updatePullRequestDescription(input: models.UpdatePullRequestDescriptionInput): F[models.UpdatePullRequestDescriptionOutput]
  def postCommentForPullRequest(input: models.PostCommentForPullRequestInput): F[models.PostCommentForPullRequestOutput]
  def getCommit(input: models.GetCommitInput): F[models.GetCommitOutput]
  def testRepositoryTriggers(input: models.TestRepositoryTriggersInput): F[models.TestRepositoryTriggersOutput]
  def batchGetRepositories(input: models.BatchGetRepositoriesInput): F[models.BatchGetRepositoriesOutput]
  def updateRepositoryName(input: models.UpdateRepositoryNameInput): F[Unit]
  def mergePullRequestByFastForward(input: models.MergePullRequestByFastForwardInput): F[models.MergePullRequestByFastForwardOutput]
  def postCommentForComparedCommit(input: models.PostCommentForComparedCommitInput): F[models.PostCommentForComparedCommitOutput]
  def updatePullRequestStatus(input: models.UpdatePullRequestStatusInput): F[models.UpdatePullRequestStatusOutput]
  def deleteBranch(input: models.DeleteBranchInput): F[models.DeleteBranchOutput]
  def listBranches(input: models.ListBranchesInput): F[models.ListBranchesOutput]
  def updateDefaultBranch(input: models.UpdateDefaultBranchInput): F[Unit]
}