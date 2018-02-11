package org.lyranthe.araethura.dynamodb
trait Amazondynamodb[F[_]] {
  def listTables(input: models.ListTablesInput): F[models.ListTablesOutput]
  def scan(input: models.ScanInput): F[models.ScanOutput]
  def batchWriteItem(input: models.BatchWriteItemInput): F[models.BatchWriteItemOutput]
  def putItem(input: models.PutItemInput): F[models.PutItemOutput]
  def deleteItem(input: models.DeleteItemInput): F[models.DeleteItemOutput]
  def untagResource(input: models.UntagResourceInput): F[Unit]
  def createTable(input: models.CreateTableInput): F[models.CreateTableOutput]
  def describeTimeToLive(input: models.DescribeTimeToLiveInput): F[models.DescribeTimeToLiveOutput]
  def deleteTable(input: models.DeleteTableInput): F[models.DeleteTableOutput]
  def getItem(input: models.GetItemInput): F[models.GetItemOutput]
  def updateItem(input: models.UpdateItemInput): F[models.UpdateItemOutput]
  def tagResource(input: models.TagResourceInput): F[Unit]
  def describeLimits: F[models.DescribeLimitsOutput]
  def updateTable(input: models.UpdateTableInput): F[models.UpdateTableOutput]
  def query(input: models.QueryInput): F[models.QueryOutput]
  def listTagsOfResource(input: models.ListTagsOfResourceInput): F[models.ListTagsOfResourceOutput]
  def describeTable(input: models.DescribeTableInput): F[models.DescribeTableOutput]
  def updateTimeToLive(input: models.UpdateTimeToLiveInput): F[models.UpdateTimeToLiveOutput]
  def batchGetItem(input: models.BatchGetItemInput): F[models.BatchGetItemOutput]
}