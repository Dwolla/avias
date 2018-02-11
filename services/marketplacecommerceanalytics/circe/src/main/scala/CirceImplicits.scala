package org.lyranthe.araethura.marketplacecommerceanalytics
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val GenerateDataSetRequestEncoder: io.circe.Encoder[models.GenerateDataSetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("dataSetPublicationDate" -> o.dataSetPublicationDate.asJson, "roleNameArn" -> o.roleNameArn.asJson, "snsTopicArn" -> o.snsTopicArn.asJson, "destinationS3BucketName" -> o.destinationS3BucketName.asJson, "dataSetType" -> o.dataSetType.asJson, "destinationS3Prefix" -> o.destinationS3Prefix.asJson, "customerDefinedValues" -> o.customerDefinedValues.asJson)
  }
  final implicit val StartSupportDataExportRequestEncoder: io.circe.Encoder[models.StartSupportDataExportRequest] = io.circe.Encoder.instance { o => 
    Json.obj("dataSetType" -> o.dataSetType.asJson, "roleNameArn" -> o.roleNameArn.asJson, "snsTopicArn" -> o.snsTopicArn.asJson, "destinationS3BucketName" -> o.destinationS3BucketName.asJson, "fromDate" -> o.fromDate.asJson, "destinationS3Prefix" -> o.destinationS3Prefix.asJson, "customerDefinedValues" -> o.customerDefinedValues.asJson)
  }
  final implicit val MarketplaceCommerceAnalyticsExceptionEncoder: io.circe.Encoder[models.MarketplaceCommerceAnalyticsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StartSupportDataExportResultEncoder: io.circe.Encoder[models.StartSupportDataExportResult] = io.circe.Encoder.instance { o => 
    Json.obj("dataSetRequestId" -> o.dataSetRequestId.asJson)
  }
  final implicit val GenerateDataSetResultEncoder: io.circe.Encoder[models.GenerateDataSetResult] = io.circe.Encoder.instance { o => 
    Json.obj("dataSetRequestId" -> o.dataSetRequestId.asJson)
  }
  final implicit val GenerateDataSetRequestDecoder: io.circe.Decoder[models.GenerateDataSetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("dataSetPublicationDate"), o.get[java.lang.String]("roleNameArn"), o.get[java.lang.String]("snsTopicArn"), o.get[java.lang.String]("destinationS3BucketName"), o.get[java.lang.String]("dataSetType"), o.get[scala.Option[java.lang.String]]("destinationS3Prefix"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("customerDefinedValues")).mapN(models.GenerateDataSetRequest.apply _)
  }
  final implicit val StartSupportDataExportRequestDecoder: io.circe.Decoder[models.StartSupportDataExportRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("dataSetType"), o.get[java.lang.String]("roleNameArn"), o.get[java.lang.String]("snsTopicArn"), o.get[java.lang.String]("destinationS3BucketName"), o.get[java.time.Instant]("fromDate"), o.get[scala.Option[java.lang.String]]("destinationS3Prefix"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("customerDefinedValues")).mapN(models.StartSupportDataExportRequest.apply _)
  }
  final implicit val MarketplaceCommerceAnalyticsExceptionDecoder: io.circe.Decoder[models.MarketplaceCommerceAnalyticsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.MarketplaceCommerceAnalyticsException.apply _)
  }
  final implicit val StartSupportDataExportResultDecoder: io.circe.Decoder[models.StartSupportDataExportResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("dataSetRequestId").map(models.StartSupportDataExportResult.apply _)
  }
  final implicit val GenerateDataSetResultDecoder: io.circe.Decoder[models.GenerateDataSetResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("dataSetRequestId").map(models.GenerateDataSetResult.apply _)
  }
}