package org.lyranthe.araethura.kinesisanalytics.models
import org.lyranthe.araethura.kinesisanalytics.models
final case class InputProcessingConfigurationUpdate(inputLambdaProcessorUpdate: models.InputLambdaProcessorUpdate)
final case class AddApplicationCloudWatchLoggingOptionRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, cloudWatchLoggingOption: models.CloudWatchLoggingOption)
final case class ListApplicationsRequest(limit: scala.Option[scala.Int] = None, exclusiveStartApplicationName: scala.Option[java.lang.String] = None)
final case class AddApplicationOutputRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, output: models.Output)
final case class InputLambdaProcessorUpdate(resourceARNUpdate: scala.Option[java.lang.String] = None, roleARNUpdate: scala.Option[java.lang.String] = None)
case object AddApplicationInputResponse
case object DeleteApplicationReferenceDataSourceResponse
final case class InputProcessingConfiguration(inputLambdaProcessor: models.InputLambdaProcessor)
final case class SourceSchema(recordFormat: models.RecordFormat, recordColumns: scala.List[models.RecordColumn], recordEncoding: scala.Option[java.lang.String] = None)
final case class ResourceProvisionedThroughputExceededException(message: scala.Option[java.lang.String] = None)
final case class KinesisStreamsOutputDescription(resourceARN: scala.Option[java.lang.String] = None, roleARN: scala.Option[java.lang.String] = None)
final case class KinesisFirehoseOutputDescription(resourceARN: scala.Option[java.lang.String] = None, roleARN: scala.Option[java.lang.String] = None)
final case class InvalidArgumentException(message: scala.Option[java.lang.String] = None)
final case class InputStartingPositionConfiguration(inputStartingPosition: scala.Option[java.lang.String] = None)
final case class LimitExceededException(message: scala.Option[java.lang.String] = None)
final case class ConcurrentModificationException(message: scala.Option[java.lang.String] = None)
final case class AddApplicationReferenceDataSourceRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, referenceDataSource: models.ReferenceDataSource)
final case class KinesisStreamsInputDescription(resourceARN: scala.Option[java.lang.String] = None, roleARN: scala.Option[java.lang.String] = None)
final case class DeleteApplicationReferenceDataSourceRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, referenceId: java.lang.String)
final case class CSVMappingParameters(recordRowDelimiter: java.lang.String, recordColumnDelimiter: java.lang.String)
final case class ReferenceDataSourceUpdate(referenceId: java.lang.String, tableNameUpdate: scala.Option[java.lang.String] = None, s3ReferenceDataSourceUpdate: scala.Option[models.S3ReferenceDataSourceUpdate] = None, referenceSchemaUpdate: scala.Option[models.SourceSchema] = None)
final case class StopApplicationRequest(applicationName: java.lang.String)
final case class ServiceUnavailableException(message: scala.Option[java.lang.String] = None)
final case class DeleteApplicationOutputRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, outputId: java.lang.String)
final case class InputParallelismUpdate(countUpdate: scala.Option[scala.Int] = None)
final case class KinesisFirehoseInput(resourceARN: java.lang.String, roleARN: java.lang.String)
final case class ListApplicationsResponse(applicationSummaries: scala.List[models.ApplicationSummary], hasMoreApplications: scala.Boolean)
final case class InputConfiguration(id: java.lang.String, inputStartingPositionConfiguration: models.InputStartingPositionConfiguration)
case object DeleteApplicationInputProcessingConfigurationResponse
case object AddApplicationInputProcessingConfigurationResponse
final case class DeleteApplicationInputProcessingConfigurationRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, inputId: java.lang.String)
final case class Output(name: java.lang.String, destinationSchema: models.DestinationSchema, kinesisStreamsOutput: scala.Option[models.KinesisStreamsOutput] = None, kinesisFirehoseOutput: scala.Option[models.KinesisFirehoseOutput] = None)
final case class S3ReferenceDataSourceUpdate(bucketARNUpdate: scala.Option[java.lang.String] = None, fileKeyUpdate: scala.Option[java.lang.String] = None, referenceRoleARNUpdate: scala.Option[java.lang.String] = None)
final case class OutputUpdate(outputId: java.lang.String, nameUpdate: scala.Option[java.lang.String] = None, kinesisStreamsOutputUpdate: scala.Option[models.KinesisStreamsOutputUpdate] = None, kinesisFirehoseOutputUpdate: scala.Option[models.KinesisFirehoseOutputUpdate] = None, destinationSchemaUpdate: scala.Option[models.DestinationSchema] = None)
final case class JSONMappingParameters(recordRowPath: java.lang.String)
case object StartApplicationResponse
final case class KinesisStreamsInputUpdate(resourceARNUpdate: scala.Option[java.lang.String] = None, roleARNUpdate: scala.Option[java.lang.String] = None)
case object DeleteApplicationResponse
final case class ApplicationDetail(applicationVersionId: scala.Long, applicationStatus: java.lang.String, applicationARN: java.lang.String, applicationName: java.lang.String, createTimestamp: scala.Option[java.time.Instant] = None, lastUpdateTimestamp: scala.Option[java.time.Instant] = None, inputDescriptions: scala.Option[scala.List[models.InputDescription]] = None, cloudWatchLoggingOptionDescriptions: scala.Option[scala.List[models.CloudWatchLoggingOptionDescription]] = None, outputDescriptions: scala.Option[scala.List[models.OutputDescription]] = None, applicationCode: scala.Option[java.lang.String] = None, referenceDataSourceDescriptions: scala.Option[scala.List[models.ReferenceDataSourceDescription]] = None, applicationDescription: scala.Option[java.lang.String] = None)
final case class DiscoverInputSchemaResponse(inputSchema: scala.Option[models.SourceSchema] = None, parsedInputRecords: scala.Option[scala.List[scala.List[java.lang.String]]] = None, processedInputRecords: scala.Option[scala.List[java.lang.String]] = None, rawInputRecords: scala.Option[scala.List[java.lang.String]] = None)
final case class KinesisStreamsOutputUpdate(resourceARNUpdate: scala.Option[java.lang.String] = None, roleARNUpdate: scala.Option[java.lang.String] = None)
final case class OutputDescription(name: scala.Option[java.lang.String] = None, kinesisStreamsOutputDescription: scala.Option[models.KinesisStreamsOutputDescription] = None, kinesisFirehoseOutputDescription: scala.Option[models.KinesisFirehoseOutputDescription] = None, outputId: scala.Option[java.lang.String] = None, destinationSchema: scala.Option[models.DestinationSchema] = None)
final case class DescribeApplicationRequest(applicationName: java.lang.String)
final case class UnableToDetectSchemaException(message: scala.Option[java.lang.String] = None, rawInputRecords: scala.Option[scala.List[java.lang.String]] = None, processedInputRecords: scala.Option[scala.List[java.lang.String]] = None)
final case class UpdateApplicationRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, applicationUpdate: models.ApplicationUpdate)
final case class AddApplicationInputRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, input: models.Input)
final case class CloudWatchLoggingOption(logStreamARN: java.lang.String, roleARN: java.lang.String)
final case class KinesisStreamsOutput(resourceARN: java.lang.String, roleARN: java.lang.String)
case object DeleteApplicationOutputResponse
final case class InputProcessingConfigurationDescription(inputLambdaProcessorDescription: scala.Option[models.InputLambdaProcessorDescription] = None)
final case class AddApplicationInputProcessingConfigurationRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, inputId: java.lang.String, inputProcessingConfiguration: models.InputProcessingConfiguration)
final case class ApplicationSummary(applicationName: java.lang.String, applicationARN: java.lang.String, applicationStatus: java.lang.String)
final case class ResourceNotFoundException(message: scala.Option[java.lang.String] = None)
final case class CloudWatchLoggingOptionUpdate(cloudWatchLoggingOptionId: java.lang.String, logStreamARNUpdate: scala.Option[java.lang.String] = None, roleARNUpdate: scala.Option[java.lang.String] = None)
final case class DiscoverInputSchemaRequest(inputProcessingConfiguration: scala.Option[models.InputProcessingConfiguration] = None, inputStartingPositionConfiguration: scala.Option[models.InputStartingPositionConfiguration] = None, s3Configuration: scala.Option[models.S3Configuration] = None, roleARN: scala.Option[java.lang.String] = None, resourceARN: scala.Option[java.lang.String] = None)
final case class S3ReferenceDataSourceDescription(bucketARN: java.lang.String, fileKey: java.lang.String, referenceRoleARN: java.lang.String)
final case class CloudWatchLoggingOptionDescription(logStreamARN: java.lang.String, roleARN: java.lang.String, cloudWatchLoggingOptionId: scala.Option[java.lang.String] = None)
final case class InputUpdate(inputId: java.lang.String, inputProcessingConfigurationUpdate: scala.Option[models.InputProcessingConfigurationUpdate] = None, namePrefixUpdate: scala.Option[java.lang.String] = None, inputParallelismUpdate: scala.Option[models.InputParallelismUpdate] = None, kinesisStreamsInputUpdate: scala.Option[models.KinesisStreamsInputUpdate] = None, inputSchemaUpdate: scala.Option[models.InputSchemaUpdate] = None, kinesisFirehoseInputUpdate: scala.Option[models.KinesisFirehoseInputUpdate] = None)
final case class S3Configuration(roleARN: java.lang.String, bucketARN: java.lang.String, fileKey: java.lang.String)
final case class CreateApplicationRequest(applicationName: java.lang.String, outputs: scala.Option[scala.List[models.Output]] = None, cloudWatchLoggingOptions: scala.Option[scala.List[models.CloudWatchLoggingOption]] = None, inputs: scala.Option[scala.List[models.Input]] = None, applicationCode: scala.Option[java.lang.String] = None, applicationDescription: scala.Option[java.lang.String] = None)
final case class S3ReferenceDataSource(bucketARN: java.lang.String, fileKey: java.lang.String, referenceRoleARN: java.lang.String)
case object AddApplicationOutputResponse
final case class RecordColumn(name: java.lang.String, sqlType: java.lang.String, mapping: scala.Option[java.lang.String] = None)
final case class Input(namePrefix: java.lang.String, inputSchema: models.SourceSchema, inputProcessingConfiguration: scala.Option[models.InputProcessingConfiguration] = None, kinesisFirehoseInput: scala.Option[models.KinesisFirehoseInput] = None, inputParallelism: scala.Option[models.InputParallelism] = None, kinesisStreamsInput: scala.Option[models.KinesisStreamsInput] = None)
case object StopApplicationResponse
final case class DeleteApplicationRequest(applicationName: java.lang.String, createTimestamp: java.time.Instant)
case object UpdateApplicationResponse
final case class ResourceInUseException(message: scala.Option[java.lang.String] = None)
final case class CreateApplicationResponse(applicationSummary: models.ApplicationSummary)
final case class KinesisFirehoseOutputUpdate(resourceARNUpdate: scala.Option[java.lang.String] = None, roleARNUpdate: scala.Option[java.lang.String] = None)
final case class InputLambdaProcessorDescription(resourceARN: scala.Option[java.lang.String] = None, roleARN: scala.Option[java.lang.String] = None)
final case class InvalidApplicationConfigurationException(message: scala.Option[java.lang.String] = None)
final case class MappingParameters(jsonmappingParameters: scala.Option[models.JSONMappingParameters] = None, csvmappingParameters: scala.Option[models.CSVMappingParameters] = None)
final case class ReferenceDataSourceDescription(referenceId: java.lang.String, tableName: java.lang.String, s3ReferenceDataSourceDescription: models.S3ReferenceDataSourceDescription, referenceSchema: scala.Option[models.SourceSchema] = None)
case object DeleteApplicationCloudWatchLoggingOptionResponse
final case class InputLambdaProcessor(resourceARN: java.lang.String, roleARN: java.lang.String)
case object AddApplicationReferenceDataSourceResponse
final case class InputParallelism(count: scala.Option[scala.Int] = None)
final case class KinesisStreamsInput(resourceARN: java.lang.String, roleARN: java.lang.String)
final case class DestinationSchema(recordFormatType: scala.Option[java.lang.String] = None)
final case class KinesisFirehoseInputDescription(resourceARN: scala.Option[java.lang.String] = None, roleARN: scala.Option[java.lang.String] = None)
final case class CodeValidationException(message: scala.Option[java.lang.String] = None)
final case class KinesisFirehoseOutput(resourceARN: java.lang.String, roleARN: java.lang.String)
final case class DeleteApplicationCloudWatchLoggingOptionRequest(applicationName: java.lang.String, currentApplicationVersionId: scala.Long, cloudWatchLoggingOptionId: java.lang.String)
final case class ApplicationUpdate(inputUpdates: scala.Option[scala.List[models.InputUpdate]] = None, referenceDataSourceUpdates: scala.Option[scala.List[models.ReferenceDataSourceUpdate]] = None, cloudWatchLoggingOptionUpdates: scala.Option[scala.List[models.CloudWatchLoggingOptionUpdate]] = None, applicationCodeUpdate: scala.Option[java.lang.String] = None, outputUpdates: scala.Option[scala.List[models.OutputUpdate]] = None)
case object AddApplicationCloudWatchLoggingOptionResponse
final case class InputSchemaUpdate(recordFormatUpdate: scala.Option[models.RecordFormat] = None, recordEncodingUpdate: scala.Option[java.lang.String] = None, recordColumnUpdates: scala.Option[scala.List[models.RecordColumn]] = None)
final case class RecordFormat(recordFormatType: java.lang.String, mappingParameters: scala.Option[models.MappingParameters] = None)
final case class InputDescription(namePrefix: scala.Option[java.lang.String] = None, inputSchema: scala.Option[models.SourceSchema] = None, inputStartingPositionConfiguration: scala.Option[models.InputStartingPositionConfiguration] = None, kinesisStreamsInputDescription: scala.Option[models.KinesisStreamsInputDescription] = None, inAppStreamNames: scala.Option[scala.List[java.lang.String]] = None, inputProcessingConfigurationDescription: scala.Option[models.InputProcessingConfigurationDescription] = None, inputId: scala.Option[java.lang.String] = None, inputParallelism: scala.Option[models.InputParallelism] = None, kinesisFirehoseInputDescription: scala.Option[models.KinesisFirehoseInputDescription] = None)
final case class DescribeApplicationResponse(applicationDetail: models.ApplicationDetail)
final case class StartApplicationRequest(applicationName: java.lang.String, inputConfigurations: scala.List[models.InputConfiguration])
final case class ReferenceDataSource(tableName: java.lang.String, referenceSchema: models.SourceSchema, s3ReferenceDataSource: scala.Option[models.S3ReferenceDataSource] = None)
final case class KinesisFirehoseInputUpdate(resourceARNUpdate: scala.Option[java.lang.String] = None, roleARNUpdate: scala.Option[java.lang.String] = None)