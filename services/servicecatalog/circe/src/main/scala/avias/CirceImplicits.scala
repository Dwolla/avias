package avias.servicecatalog
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val CreateProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreateProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewDetail" -> o.productViewDetail.asJson, "ProvisioningArtifactDetail" -> o.provisioningArtifactDetail.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val UsageInstructionEncoder: io.circe.Encoder[avias.servicecatalog.models.UsageInstruction] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Value" -> o.value.asJson)
  }
  final implicit val DescribeCopyProductStatusOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeCopyProductStatusOutput] = io.circe.Encoder.instance { o => 
    Json.obj("CopyProductStatus" -> o.copyProductStatus.asJson, "TargetProductId" -> o.targetProductId.asJson, "StatusDetail" -> o.statusDetail.asJson)
  }
  final implicit val DeletePortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeletePortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateProvisionedProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateProvisionedProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetail" -> o.recordDetail.asJson)
  }
  final implicit val DescribeTagOptionOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeTagOptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionDetail" -> o.tagOptionDetail.asJson)
  }
  final implicit val DescribeCopyProductStatusInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeCopyProductStatusInput] = io.circe.Encoder.instance { o => 
    Json.obj("CopyProductToken" -> o.copyProductToken.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DescribeProvisionedProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProvisionedProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisionedProductDetail" -> o.provisionedProductDetail.asJson)
  }
  final implicit val CreateTagOptionInputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreateTagOptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val RecordOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.RecordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("OutputKey" -> o.outputKey.asJson, "OutputValue" -> o.outputValue.asJson, "Description" -> o.description.asJson)
  }
  final implicit val TagOptionDetailEncoder: io.circe.Encoder[avias.servicecatalog.models.TagOptionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Active" -> o.active.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ProvisioningParameterEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisioningParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val UpdateTagOptionOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateTagOptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionDetail" -> o.tagOptionDetail.asJson)
  }
  final implicit val RecordErrorEncoder: io.circe.Encoder[avias.servicecatalog.models.RecordError] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Description" -> o.description.asJson)
  }
  final implicit val UpdateProvisioningArtifactInputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateProvisioningArtifactInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson)
  }
  final implicit val CopyProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.CopyProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("CopyProductToken" -> o.copyProductToken.asJson)
  }
  final implicit val DescribeProductAsAdminInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProductAsAdminInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListAcceptedPortfolioSharesOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListAcceptedPortfolioSharesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetails" -> o.portfolioDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ConstraintDetailEncoder: io.circe.Encoder[avias.servicecatalog.models.ConstraintDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintId" -> o.constraintId.asJson, "Type" -> o.`type`.asJson, "Description" -> o.description.asJson, "Owner" -> o.owner.asJson)
  }
  final implicit val DescribePortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribePortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DescribeProductAsAdminOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProductAsAdminOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewDetail" -> o.productViewDetail.asJson, "ProvisioningArtifactSummaries" -> o.provisioningArtifactSummaries.asJson, "Tags" -> o.tags.asJson, "TagOptions" -> o.tagOptions.asJson)
  }
  final implicit val ListPortfoliosOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListPortfoliosOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetails" -> o.portfolioDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val UpdateProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewDetail" -> o.productViewDetail.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ProvisioningArtifactPropertiesEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisioningArtifactProperties] = io.circe.Encoder.instance { o => 
    Json.obj("Info" -> o.info.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListTagOptionsOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListTagOptionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionDetails" -> o.tagOptionDetails.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val UpdateProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "SupportUrl" -> o.supportUrl.asJson, "SupportDescription" -> o.supportDescription.asJson, "Owner" -> o.owner.asJson, "Distributor" -> o.distributor.asJson, "AddTags" -> o.addTags.asJson, "RemoveTags" -> o.removeTags.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "SupportEmail" -> o.supportEmail.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListPortfoliosForProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListPortfoliosForProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetails" -> o.portfolioDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val SearchProductsAsAdminInputEncoder: io.circe.Encoder[avias.servicecatalog.models.SearchProductsAsAdminInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductSource" -> o.productSource.asJson, "PortfolioId" -> o.portfolioId.asJson, "SortOrder" -> o.sortOrder.asJson, "PageSize" -> o.pageSize.asJson, "Filters" -> o.filters.asJson, "PageToken" -> o.pageToken.asJson, "SortBy" -> o.sortBy.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DisassociateTagOptionFromResourceInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DisassociateTagOptionFromResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagOptionId" -> o.tagOptionId.asJson)
  }
  final implicit val CreatePortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreatePortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetail" -> o.portfolioDetail.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val AssociateProductWithPortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.AssociateProductWithPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "PortfolioId" -> o.portfolioId.asJson, "SourcePortfolioId" -> o.sourcePortfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListRecordHistoryInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListRecordHistoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("SearchFilter" -> o.searchFilter.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "AccessLevelFilter" -> o.accessLevelFilter.asJson)
  }
  final implicit val ProvisioningArtifactParameterEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisioningArtifactParameter] = io.circe.Encoder.instance { o => 
    Json.obj("IsNoEcho" -> o.isNoEcho.asJson, "ParameterConstraints" -> o.parameterConstraints.asJson, "ParameterKey" -> o.parameterKey.asJson, "Description" -> o.description.asJson, "ParameterType" -> o.parameterType.asJson, "DefaultValue" -> o.defaultValue.asJson)
  }
  final implicit val ListConstraintsForPortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListConstraintsForPortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintDetails" -> o.constraintDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DeleteProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeleteProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val RecordTagEncoder: io.circe.Encoder[avias.servicecatalog.models.RecordTag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ListPortfoliosForProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListPortfoliosForProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageToken" -> o.pageToken.asJson, "PageSize" -> o.pageSize.asJson)
  }
  final implicit val DescribeProvisioningArtifactOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProvisioningArtifactOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactDetail" -> o.provisioningArtifactDetail.asJson, "Info" -> o.info.asJson, "Status" -> o.status.asJson)
  }
  final implicit val DisassociateTagOptionFromResourceOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DisassociateTagOptionFromResourceOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AssociateTagOptionWithResourceInputEncoder: io.circe.Encoder[avias.servicecatalog.models.AssociateTagOptionWithResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagOptionId" -> o.tagOptionId.asJson)
  }
  final implicit val ListResourcesForTagOptionInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListResourcesForTagOptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionId" -> o.tagOptionId.asJson, "ResourceType" -> o.resourceType.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val ListProvisioningArtifactsInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListProvisioningArtifactsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val UpdateConstraintOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateConstraintOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintDetail" -> o.constraintDetail.asJson, "ConstraintParameters" -> o.constraintParameters.asJson, "Status" -> o.status.asJson)
  }
  final implicit val DeleteConstraintOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeleteConstraintOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProductViewAggregationValueEncoder: io.circe.Encoder[avias.servicecatalog.models.ProductViewAggregationValue] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "ApproximateCount" -> o.approximateCount.asJson)
  }
  final implicit val CreateTagOptionOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreateTagOptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionDetail" -> o.tagOptionDetail.asJson)
  }
  final implicit val ProductViewDetailEncoder: io.circe.Encoder[avias.servicecatalog.models.ProductViewDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewSummary" -> o.productViewSummary.asJson, "Status" -> o.status.asJson, "ProductARN" -> o.productARN.asJson, "CreatedTime" -> o.createdTime.asJson)
  }
  final implicit val ListResourcesForTagOptionOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListResourcesForTagOptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceDetails" -> o.resourceDetails.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[avias.servicecatalog.models.ResourceInUseException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteProvisioningArtifactOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeleteProvisioningArtifactOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreateProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdempotencyToken" -> o.idempotencyToken.asJson, "ProvisioningArtifactParameters" -> o.provisioningArtifactParameters.asJson, "Owner" -> o.owner.asJson, "ProductType" -> o.productType.asJson, "Name" -> o.name.asJson, "SupportUrl" -> o.supportUrl.asJson, "SupportDescription" -> o.supportDescription.asJson, "Distributor" -> o.distributor.asJson, "Tags" -> o.tags.asJson, "Description" -> o.description.asJson, "SupportEmail" -> o.supportEmail.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DescribeProductViewInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProductViewInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.servicecatalog.models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PortfolioDetailEncoder: io.circe.Encoder[avias.servicecatalog.models.PortfolioDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "DisplayName" -> o.displayName.asJson, "ARN" -> o.arn.asJson, "Id" -> o.id.asJson, "CreatedTime" -> o.createdTime.asJson, "Description" -> o.description.asJson)
  }
  final implicit val ProvisionedProductDetailEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisionedProductDetail] = io.circe.Encoder.instance { o => 
    Json.obj("IdempotencyToken" -> o.idempotencyToken.asJson, "StatusMessage" -> o.statusMessage.asJson, "Type" -> o.`type`.asJson, "Id" -> o.id.asJson, "Status" -> o.status.asJson, "LastRecordId" -> o.lastRecordId.asJson, "CreatedTime" -> o.createdTime.asJson, "Name" -> o.name.asJson, "Arn" -> o.arn.asJson)
  }
  final implicit val DisassociateProductFromPortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DisassociateProductFromPortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.servicecatalog.models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeletePortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeletePortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CreatePortfolioShareOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreatePortfolioShareOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProvisioningArtifactSummaryEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisioningArtifactSummary] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactMetadata" -> o.provisioningArtifactMetadata.asJson, "Id" -> o.id.asJson, "CreatedTime" -> o.createdTime.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson)
  }
  final implicit val ParameterConstraintsEncoder: io.circe.Encoder[avias.servicecatalog.models.ParameterConstraints] = io.circe.Encoder.instance { o => 
    Json.obj("AllowedValues" -> o.allowedValues.asJson)
  }
  final implicit val AssociatePrincipalWithPortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.AssociatePrincipalWithPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "PrincipalARN" -> o.principalARN.asJson, "PrincipalType" -> o.principalType.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val UpdatePortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdatePortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "ProviderName" -> o.providerName.asJson, "DisplayName" -> o.displayName.asJson, "AddTags" -> o.addTags.asJson, "RemoveTags" -> o.removeTags.asJson, "Description" -> o.description.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DescribeProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewSummary" -> o.productViewSummary.asJson, "ProvisioningArtifacts" -> o.provisioningArtifacts.asJson)
  }
  final implicit val DescribePortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribePortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetail" -> o.portfolioDetail.asJson, "Tags" -> o.tags.asJson, "TagOptions" -> o.tagOptions.asJson)
  }
  final implicit val ListTagOptionsFiltersEncoder: io.circe.Encoder[avias.servicecatalog.models.ListTagOptionsFilters] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Active" -> o.active.asJson)
  }
  final implicit val InvalidParametersExceptionEncoder: io.circe.Encoder[avias.servicecatalog.models.InvalidParametersException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DuplicateResourceExceptionEncoder: io.circe.Encoder[avias.servicecatalog.models.DuplicateResourceException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidStateExceptionEncoder: io.circe.Encoder[avias.servicecatalog.models.InvalidStateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProvisioningArtifactDetailEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisioningArtifactDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "Type" -> o.`type`.asJson, "CreatedTime" -> o.createdTime.asJson)
  }
  final implicit val ListLaunchPathsInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListLaunchPathsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val DescribeProductViewOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProductViewOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewSummary" -> o.productViewSummary.asJson, "ProvisioningArtifacts" -> o.provisioningArtifacts.asJson)
  }
  final implicit val DescribeProvisioningArtifactInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProvisioningArtifactInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "Verbose" -> o.verbose.asJson)
  }
  final implicit val DescribeRecordOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeRecordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetail" -> o.recordDetail.asJson, "RecordOutputs" -> o.recordOutputs.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ProvisionProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisionProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisionToken" -> o.provisionToken.asJson, "ProvisionedProductName" -> o.provisionedProductName.asJson, "ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "ProvisioningParameters" -> o.provisioningParameters.asJson, "NotificationArns" -> o.notificationArns.asJson, "PathId" -> o.pathId.asJson, "Tags" -> o.tags.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val TagOptionNotMigratedExceptionEncoder: io.circe.Encoder[avias.servicecatalog.models.TagOptionNotMigratedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateProvisioningArtifactOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateProvisioningArtifactOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactDetail" -> o.provisioningArtifactDetail.asJson, "Info" -> o.info.asJson, "Status" -> o.status.asJson)
  }
  final implicit val CreateConstraintInputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreateConstraintInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdempotencyToken" -> o.idempotencyToken.asJson, "Type" -> o.`type`.asJson, "PortfolioId" -> o.portfolioId.asJson, "ProductId" -> o.productId.asJson, "Parameters" -> o.parameters.asJson, "Description" -> o.description.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListConstraintsForPortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListConstraintsForPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.servicecatalog.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val DescribeConstraintOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeConstraintOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintDetail" -> o.constraintDetail.asJson, "ConstraintParameters" -> o.constraintParameters.asJson, "Status" -> o.status.asJson)
  }
  final implicit val ProductViewSummaryEncoder: io.circe.Encoder[avias.servicecatalog.models.ProductViewSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Distributor" -> o.distributor.asJson, "SupportUrl" -> o.supportUrl.asJson, "SupportDescription" -> o.supportDescription.asJson, "Owner" -> o.owner.asJson, "HasDefaultPath" -> o.hasDefaultPath.asJson, "Id" -> o.id.asJson, "ProductId" -> o.productId.asJson, "Type" -> o.`type`.asJson, "Name" -> o.name.asJson, "ShortDescription" -> o.shortDescription.asJson, "SupportEmail" -> o.supportEmail.asJson)
  }
  final implicit val SearchProductsInputEncoder: io.circe.Encoder[avias.servicecatalog.models.SearchProductsInput] = io.circe.Encoder.instance { o => 
    Json.obj("SortOrder" -> o.sortOrder.asJson, "PageSize" -> o.pageSize.asJson, "Filters" -> o.filters.asJson, "PageToken" -> o.pageToken.asJson, "SortBy" -> o.sortBy.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val AssociatePrincipalWithPortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.AssociatePrincipalWithPortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagOptionSummaryEncoder: io.circe.Encoder[avias.servicecatalog.models.TagOptionSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val ListRecordHistorySearchFilterEncoder: io.circe.Encoder[avias.servicecatalog.models.ListRecordHistorySearchFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val DescribeProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ProvisionProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisionProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetail" -> o.recordDetail.asJson)
  }
  final implicit val CreateProvisioningArtifactOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreateProvisioningArtifactOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactDetail" -> o.provisioningArtifactDetail.asJson, "Info" -> o.info.asJson, "Status" -> o.status.asJson)
  }
  final implicit val SearchProductsOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.SearchProductsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewSummaries" -> o.productViewSummaries.asJson, "ProductViewAggregations" -> o.productViewAggregations.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ListPortfolioAccessInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListPortfolioAccessInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CopyProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.CopyProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("SourceProductArn" -> o.sourceProductArn.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "TargetProductId" -> o.targetProductId.asJson, "TargetProductName" -> o.targetProductName.asJson, "SourceProvisioningArtifactIdentifiers" -> o.sourceProvisioningArtifactIdentifiers.asJson, "CopyOptions" -> o.copyOptions.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DisassociatePrincipalFromPortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DisassociatePrincipalFromPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "PrincipalARN" -> o.principalARN.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val AcceptPortfolioShareInputEncoder: io.circe.Encoder[avias.servicecatalog.models.AcceptPortfolioShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val SearchProductsAsAdminOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.SearchProductsAsAdminOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewDetails" -> o.productViewDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DescribeConstraintInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeConstraintInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val UpdateProvisionedProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateProvisionedProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("UpdateToken" -> o.updateToken.asJson, "ProvisioningParameters" -> o.provisioningParameters.asJson, "ProvisionedProductId" -> o.provisionedProductId.asJson, "ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "PathId" -> o.pathId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "ProvisionedProductName" -> o.provisionedProductName.asJson)
  }
  final implicit val UpdatePortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdatePortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetail" -> o.portfolioDetail.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val TerminateProvisionedProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.TerminateProvisionedProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("TerminateToken" -> o.terminateToken.asJson, "ProvisionedProductId" -> o.provisionedProductId.asJson, "IgnoreErrors" -> o.ignoreErrors.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "ProvisionedProductName" -> o.provisionedProductName.asJson)
  }
  final implicit val ScanProvisionedProductsInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ScanProvisionedProductsInput] = io.circe.Encoder.instance { o => 
    Json.obj("AcceptLanguage" -> o.acceptLanguage.asJson, "AccessLevelFilter" -> o.accessLevelFilter.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val ResourceDetailEncoder: io.circe.Encoder[avias.servicecatalog.models.ResourceDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Id" -> o.id.asJson, "Description" -> o.description.asJson, "CreatedTime" -> o.createdTime.asJson, "ARN" -> o.arn.asJson)
  }
  final implicit val DescribeProvisioningParametersOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProvisioningParametersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactParameters" -> o.provisioningArtifactParameters.asJson, "ConstraintSummaries" -> o.constraintSummaries.asJson, "UsageInstructions" -> o.usageInstructions.asJson, "TagOptions" -> o.tagOptions.asJson)
  }
  final implicit val ScanProvisionedProductsOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ScanProvisionedProductsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisionedProducts" -> o.provisionedProducts.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val LaunchPathSummaryEncoder: io.circe.Encoder[avias.servicecatalog.models.LaunchPathSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "ConstraintSummaries" -> o.constraintSummaries.asJson, "Tags" -> o.tags.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DescribeTagOptionInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeTagOptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson)
  }
  final implicit val CreateConstraintOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreateConstraintOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintDetail" -> o.constraintDetail.asJson, "ConstraintParameters" -> o.constraintParameters.asJson, "Status" -> o.status.asJson)
  }
  final implicit val UpdateConstraintInputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateConstraintInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "Description" -> o.description.asJson)
  }
  final implicit val AssociateTagOptionWithResourceOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.AssociateTagOptionWithResourceOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListPrincipalsForPortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListPrincipalsForPortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Principals" -> o.principals.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ListProvisioningArtifactsOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListProvisioningArtifactsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactDetails" -> o.provisioningArtifactDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val UpdateProvisioningParameterEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateProvisioningParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "UsePreviousValue" -> o.usePreviousValue.asJson)
  }
  final implicit val ProvisioningArtifactEncoder: io.circe.Encoder[avias.servicecatalog.models.ProvisioningArtifact] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "CreatedTime" -> o.createdTime.asJson)
  }
  final implicit val ListPortfoliosInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListPortfoliosInput] = io.circe.Encoder.instance { o => 
    Json.obj("AcceptLanguage" -> o.acceptLanguage.asJson, "PageToken" -> o.pageToken.asJson, "PageSize" -> o.pageSize.asJson)
  }
  final implicit val CreatePortfolioShareInputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreatePortfolioShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AccountId" -> o.accountId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val PrincipalEncoder: io.circe.Encoder[avias.servicecatalog.models.Principal] = io.circe.Encoder.instance { o => 
    Json.obj("PrincipalARN" -> o.principalARN.asJson, "PrincipalType" -> o.principalType.asJson)
  }
  final implicit val ListTagOptionsInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListTagOptionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val TerminateProvisionedProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.TerminateProvisionedProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetail" -> o.recordDetail.asJson)
  }
  final implicit val RejectPortfolioShareInputEncoder: io.circe.Encoder[avias.servicecatalog.models.RejectPortfolioShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DeleteProductOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeleteProductOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RecordDetailEncoder: io.circe.Encoder[avias.servicecatalog.models.RecordDetail] = io.circe.Encoder.instance { o => 
    Json.obj("RecordType" -> o.recordType.asJson, "ProvisionedProductType" -> o.provisionedProductType.asJson, "ProvisionedProductName" -> o.provisionedProductName.asJson, "Status" -> o.status.asJson, "ProductId" -> o.productId.asJson, "ProvisionedProductId" -> o.provisionedProductId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "PathId" -> o.pathId.asJson, "RecordId" -> o.recordId.asJson, "RecordTags" -> o.recordTags.asJson, "UpdatedTime" -> o.updatedTime.asJson, "CreatedTime" -> o.createdTime.asJson, "RecordErrors" -> o.recordErrors.asJson)
  }
  final implicit val DescribeProvisioningParametersInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProvisioningParametersInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "PathId" -> o.pathId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CreatePortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreatePortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdempotencyToken" -> o.idempotencyToken.asJson, "ProviderName" -> o.providerName.asJson, "DisplayName" -> o.displayName.asJson, "Tags" -> o.tags.asJson, "Description" -> o.description.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CreateProvisioningArtifactInputEncoder: io.circe.Encoder[avias.servicecatalog.models.CreateProvisioningArtifactInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "Parameters" -> o.parameters.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val AssociateProductWithPortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.AssociateProductWithPortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListRecordHistoryOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListRecordHistoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetails" -> o.recordDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DisassociateProductFromPortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DisassociateProductFromPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListPortfolioAccessOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListPortfolioAccessOutput] = io.circe.Encoder.instance { o => 
    Json.obj("AccountIds" -> o.accountIds.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DescribeRecordInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeRecordInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageToken" -> o.pageToken.asJson, "PageSize" -> o.pageSize.asJson)
  }
  final implicit val DeletePortfolioShareOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeletePortfolioShareOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListPrincipalsForPortfolioInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListPrincipalsForPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val AcceptPortfolioShareOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.AcceptPortfolioShareOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RejectPortfolioShareOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.RejectPortfolioShareOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListAcceptedPortfolioSharesInputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListAcceptedPortfolioSharesInput] = io.circe.Encoder.instance { o => 
    Json.obj("AcceptLanguage" -> o.acceptLanguage.asJson, "PageToken" -> o.pageToken.asJson, "PageSize" -> o.pageSize.asJson)
  }
  final implicit val DisassociatePrincipalFromPortfolioOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.DisassociatePrincipalFromPortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AccessLevelFilterEncoder: io.circe.Encoder[avias.servicecatalog.models.AccessLevelFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val DeleteConstraintInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeleteConstraintInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ConstraintSummaryEncoder: io.circe.Encoder[avias.servicecatalog.models.ConstraintSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeProvisionedProductInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DescribeProvisionedProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DeletePortfolioShareInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeletePortfolioShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AccountId" -> o.accountId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListLaunchPathsOutputEncoder: io.circe.Encoder[avias.servicecatalog.models.ListLaunchPathsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("LaunchPathSummaries" -> o.launchPathSummaries.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val UpdateTagOptionInputEncoder: io.circe.Encoder[avias.servicecatalog.models.UpdateTagOptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Value" -> o.value.asJson, "Active" -> o.active.asJson)
  }
  final implicit val DeleteProvisioningArtifactInputEncoder: io.circe.Encoder[avias.servicecatalog.models.DeleteProvisioningArtifactInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CreateProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreateProductOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProductViewDetail]]("ProductViewDetail"), o.get[scala.Option[avias.servicecatalog.models.ProvisioningArtifactDetail]]("ProvisioningArtifactDetail"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags")).mapN(avias.servicecatalog.models.CreateProductOutput.apply _)
  }
  final implicit val UsageInstructionDecoder: io.circe.Decoder[avias.servicecatalog.models.UsageInstruction] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.servicecatalog.models.UsageInstruction.apply _)
  }
  final implicit val DescribeCopyProductStatusOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeCopyProductStatusOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CopyProductStatus"), o.get[scala.Option[java.lang.String]]("TargetProductId"), o.get[scala.Option[java.lang.String]]("StatusDetail")).mapN(avias.servicecatalog.models.DescribeCopyProductStatusOutput.apply _)
  }
  final implicit val DeletePortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeletePortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DeletePortfolioOutput)
  final implicit val UpdateProvisionedProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateProvisionedProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.servicecatalog.models.RecordDetail]]("RecordDetail").map(avias.servicecatalog.models.UpdateProvisionedProductOutput.apply _)
  }
  final implicit val DescribeTagOptionOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeTagOptionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.servicecatalog.models.TagOptionDetail]]("TagOptionDetail").map(avias.servicecatalog.models.DescribeTagOptionOutput.apply _)
  }
  final implicit val DescribeCopyProductStatusInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeCopyProductStatusInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CopyProductToken"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DescribeCopyProductStatusInput.apply _)
  }
  final implicit val DescribeProvisionedProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProvisionedProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.servicecatalog.models.ProvisionedProductDetail]]("ProvisionedProductDetail").map(avias.servicecatalog.models.DescribeProvisionedProductOutput.apply _)
  }
  final implicit val CreateTagOptionInputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreateTagOptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(avias.servicecatalog.models.CreateTagOptionInput.apply _)
  }
  final implicit val RecordOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.RecordOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("OutputKey"), o.get[scala.Option[java.lang.String]]("OutputValue"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.servicecatalog.models.RecordOutput.apply _)
  }
  final implicit val TagOptionDetailDecoder: io.circe.Decoder[avias.servicecatalog.models.TagOptionDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Boolean]]("Active"), o.get[scala.Option[java.lang.String]]("Id")).mapN(avias.servicecatalog.models.TagOptionDetail.apply _)
  }
  final implicit val ProvisioningParameterDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisioningParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.servicecatalog.models.ProvisioningParameter.apply _)
  }
  final implicit val UpdateTagOptionOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateTagOptionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.servicecatalog.models.TagOptionDetail]]("TagOptionDetail").map(avias.servicecatalog.models.UpdateTagOptionOutput.apply _)
  }
  final implicit val RecordErrorDecoder: io.circe.Decoder[avias.servicecatalog.models.RecordError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.servicecatalog.models.RecordError.apply _)
  }
  final implicit val UpdateProvisioningArtifactInputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateProvisioningArtifactInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.servicecatalog.models.UpdateProvisioningArtifactInput.apply _)
  }
  final implicit val CopyProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.CopyProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("CopyProductToken").map(avias.servicecatalog.models.CopyProductOutput.apply _)
  }
  final implicit val DescribeProductAsAdminInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProductAsAdminInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DescribeProductAsAdminInput.apply _)
  }
  final implicit val ListAcceptedPortfolioSharesOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListAcceptedPortfolioSharesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.PortfolioDetail]]]("PortfolioDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListAcceptedPortfolioSharesOutput.apply _)
  }
  final implicit val ConstraintDetailDecoder: io.circe.Decoder[avias.servicecatalog.models.ConstraintDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ConstraintId"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Owner")).mapN(avias.servicecatalog.models.ConstraintDetail.apply _)
  }
  final implicit val DescribePortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribePortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DescribePortfolioInput.apply _)
  }
  final implicit val DescribeProductAsAdminOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProductAsAdminOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProductViewDetail]]("ProductViewDetail"), o.get[scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifactSummary]]]("ProvisioningArtifactSummaries"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags"), o.get[scala.Option[scala.List[avias.servicecatalog.models.TagOptionDetail]]]("TagOptions")).mapN(avias.servicecatalog.models.DescribeProductAsAdminOutput.apply _)
  }
  final implicit val ListPortfoliosOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListPortfoliosOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.PortfolioDetail]]]("PortfolioDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListPortfoliosOutput.apply _)
  }
  final implicit val UpdateProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateProductOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProductViewDetail]]("ProductViewDetail"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags")).mapN(avias.servicecatalog.models.UpdateProductOutput.apply _)
  }
  final implicit val ProvisioningArtifactPropertiesDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisioningArtifactProperties] = io.circe.Decoder.instance { o => 
    (o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Info"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Type")).mapN(avias.servicecatalog.models.ProvisioningArtifactProperties.apply _)
  }
  final implicit val ListTagOptionsOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListTagOptionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.TagOptionDetail]]]("TagOptionDetails"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(avias.servicecatalog.models.ListTagOptionsOutput.apply _)
  }
  final implicit val UpdateProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("SupportUrl"), o.get[scala.Option[java.lang.String]]("SupportDescription"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[java.lang.String]]("Distributor"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("AddTags"), o.get[scala.Option[scala.List[java.lang.String]]]("RemoveTags"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("SupportEmail"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.UpdateProductInput.apply _)
  }
  final implicit val ListPortfoliosForProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListPortfoliosForProductOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.PortfolioDetail]]]("PortfolioDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListPortfoliosForProductOutput.apply _)
  }
  final implicit val SearchProductsAsAdminInputDecoder: io.circe.Decoder[avias.servicecatalog.models.SearchProductsAsAdminInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProductSource"), o.get[scala.Option[java.lang.String]]("PortfolioId"), o.get[scala.Option[java.lang.String]]("SortOrder"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Filters"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[java.lang.String]]("SortBy"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.SearchProductsAsAdminInput.apply _)
  }
  final implicit val DisassociateTagOptionFromResourceInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DisassociateTagOptionFromResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("TagOptionId")).mapN(avias.servicecatalog.models.DisassociateTagOptionFromResourceInput.apply _)
  }
  final implicit val CreatePortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreatePortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.PortfolioDetail]]("PortfolioDetail"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags")).mapN(avias.servicecatalog.models.CreatePortfolioOutput.apply _)
  }
  final implicit val AssociateProductWithPortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.AssociateProductWithPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("SourcePortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.AssociateProductWithPortfolioInput.apply _)
  }
  final implicit val ListRecordHistoryInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListRecordHistoryInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ListRecordHistorySearchFilter]]("SearchFilter"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[avias.servicecatalog.models.AccessLevelFilter]]("AccessLevelFilter")).mapN(avias.servicecatalog.models.ListRecordHistoryInput.apply _)
  }
  final implicit val ProvisioningArtifactParameterDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisioningArtifactParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("IsNoEcho"), o.get[scala.Option[avias.servicecatalog.models.ParameterConstraints]]("ParameterConstraints"), o.get[scala.Option[java.lang.String]]("ParameterKey"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("ParameterType"), o.get[scala.Option[java.lang.String]]("DefaultValue")).mapN(avias.servicecatalog.models.ProvisioningArtifactParameter.apply _)
  }
  final implicit val ListConstraintsForPortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListConstraintsForPortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.ConstraintDetail]]]("ConstraintDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListConstraintsForPortfolioOutput.apply _)
  }
  final implicit val DeleteProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeleteProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DeleteProductInput.apply _)
  }
  final implicit val RecordTagDecoder: io.circe.Decoder[avias.servicecatalog.models.RecordTag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.servicecatalog.models.RecordTag.apply _)
  }
  final implicit val ListPortfoliosForProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListPortfoliosForProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[scala.Int]]("PageSize")).mapN(avias.servicecatalog.models.ListPortfoliosForProductInput.apply _)
  }
  final implicit val DescribeProvisioningArtifactOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProvisioningArtifactOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProvisioningArtifactDetail]]("ProvisioningArtifactDetail"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Info"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.servicecatalog.models.DescribeProvisioningArtifactOutput.apply _)
  }
  final implicit val DisassociateTagOptionFromResourceOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DisassociateTagOptionFromResourceOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DisassociateTagOptionFromResourceOutput)
  final implicit val AssociateTagOptionWithResourceInputDecoder: io.circe.Decoder[avias.servicecatalog.models.AssociateTagOptionWithResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("TagOptionId")).mapN(avias.servicecatalog.models.AssociateTagOptionWithResourceInput.apply _)
  }
  final implicit val ListResourcesForTagOptionInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListResourcesForTagOptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TagOptionId"), o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(avias.servicecatalog.models.ListResourcesForTagOptionInput.apply _)
  }
  final implicit val ListProvisioningArtifactsInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListProvisioningArtifactsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.ListProvisioningArtifactsInput.apply _)
  }
  final implicit val UpdateConstraintOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateConstraintOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ConstraintDetail]]("ConstraintDetail"), o.get[scala.Option[java.lang.String]]("ConstraintParameters"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.servicecatalog.models.UpdateConstraintOutput.apply _)
  }
  final implicit val DeleteConstraintOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeleteConstraintOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DeleteConstraintOutput)
  final implicit val ProductViewAggregationValueDecoder: io.circe.Decoder[avias.servicecatalog.models.ProductViewAggregationValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Int]]("ApproximateCount")).mapN(avias.servicecatalog.models.ProductViewAggregationValue.apply _)
  }
  final implicit val CreateTagOptionOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreateTagOptionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.servicecatalog.models.TagOptionDetail]]("TagOptionDetail").map(avias.servicecatalog.models.CreateTagOptionOutput.apply _)
  }
  final implicit val ProductViewDetailDecoder: io.circe.Decoder[avias.servicecatalog.models.ProductViewDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProductViewSummary]]("ProductViewSummary"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("ProductARN"), o.get[scala.Option[java.time.Instant]]("CreatedTime")).mapN(avias.servicecatalog.models.ProductViewDetail.apply _)
  }
  final implicit val ListResourcesForTagOptionOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListResourcesForTagOptionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.ResourceDetail]]]("ResourceDetails"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(avias.servicecatalog.models.ListResourcesForTagOptionOutput.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[avias.servicecatalog.models.ResourceInUseException.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.ResourceInUseException)
  final implicit val DeleteProvisioningArtifactOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeleteProvisioningArtifactOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DeleteProvisioningArtifactOutput)
  final implicit val CreateProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreateProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdempotencyToken"), o.get[avias.servicecatalog.models.ProvisioningArtifactProperties]("ProvisioningArtifactParameters"), o.get[java.lang.String]("Owner"), o.get[java.lang.String]("ProductType"), o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("SupportUrl"), o.get[scala.Option[java.lang.String]]("SupportDescription"), o.get[scala.Option[java.lang.String]]("Distributor"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("SupportEmail"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.CreateProductInput.apply _)
  }
  final implicit val DescribeProductViewInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProductViewInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DescribeProductViewInput.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.servicecatalog.models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.ResourceNotFoundException)
  final implicit val PortfolioDetailDecoder: io.circe.Decoder[avias.servicecatalog.models.PortfolioDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[java.lang.String]]("ARN"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.servicecatalog.models.PortfolioDetail.apply _)
  }
  final implicit val ProvisionedProductDetailDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisionedProductDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdempotencyToken"), o.get[scala.Option[java.lang.String]]("StatusMessage"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("LastRecordId"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Arn")).mapN(avias.servicecatalog.models.ProvisionedProductDetail.apply _)
  }
  final implicit val DisassociateProductFromPortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DisassociateProductFromPortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DisassociateProductFromPortfolioOutput)
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.servicecatalog.models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.LimitExceededException)
  final implicit val DeletePortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeletePortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DeletePortfolioInput.apply _)
  }
  final implicit val CreatePortfolioShareOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreatePortfolioShareOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.CreatePortfolioShareOutput)
  final implicit val ProvisioningArtifactSummaryDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisioningArtifactSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ProvisioningArtifactMetadata"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.servicecatalog.models.ProvisioningArtifactSummary.apply _)
  }
  final implicit val ParameterConstraintsDecoder: io.circe.Decoder[avias.servicecatalog.models.ParameterConstraints] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("AllowedValues").map(avias.servicecatalog.models.ParameterConstraints.apply _)
  }
  final implicit val AssociatePrincipalWithPortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.AssociatePrincipalWithPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("PrincipalARN"), o.get[java.lang.String]("PrincipalType"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.AssociatePrincipalWithPortfolioInput.apply _)
  }
  final implicit val UpdatePortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdatePortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("AddTags"), o.get[scala.Option[scala.List[java.lang.String]]]("RemoveTags"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.UpdatePortfolioInput.apply _)
  }
  final implicit val DescribeProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProductOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProductViewSummary]]("ProductViewSummary"), o.get[scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifact]]]("ProvisioningArtifacts")).mapN(avias.servicecatalog.models.DescribeProductOutput.apply _)
  }
  final implicit val DescribePortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribePortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.PortfolioDetail]]("PortfolioDetail"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags"), o.get[scala.Option[scala.List[avias.servicecatalog.models.TagOptionDetail]]]("TagOptions")).mapN(avias.servicecatalog.models.DescribePortfolioOutput.apply _)
  }
  final implicit val ListTagOptionsFiltersDecoder: io.circe.Decoder[avias.servicecatalog.models.ListTagOptionsFilters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Boolean]]("Active")).mapN(avias.servicecatalog.models.ListTagOptionsFilters.apply _)
  }
  final implicit val InvalidParametersExceptionDecoder: io.circe.Decoder[avias.servicecatalog.models.InvalidParametersException.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.InvalidParametersException)
  final implicit val DuplicateResourceExceptionDecoder: io.circe.Decoder[avias.servicecatalog.models.DuplicateResourceException.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DuplicateResourceException)
  final implicit val InvalidStateExceptionDecoder: io.circe.Decoder[avias.servicecatalog.models.InvalidStateException.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.InvalidStateException)
  final implicit val ProvisioningArtifactDetailDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisioningArtifactDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.time.Instant]]("CreatedTime")).mapN(avias.servicecatalog.models.ProvisioningArtifactDetail.apply _)
  }
  final implicit val ListLaunchPathsInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListLaunchPathsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(avias.servicecatalog.models.ListLaunchPathsInput.apply _)
  }
  final implicit val DescribeProductViewOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProductViewOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProductViewSummary]]("ProductViewSummary"), o.get[scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifact]]]("ProvisioningArtifacts")).mapN(avias.servicecatalog.models.DescribeProductViewOutput.apply _)
  }
  final implicit val DescribeProvisioningArtifactInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProvisioningArtifactInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProvisioningArtifactId"), o.get[java.lang.String]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[scala.Boolean]]("Verbose")).mapN(avias.servicecatalog.models.DescribeProvisioningArtifactInput.apply _)
  }
  final implicit val DescribeRecordOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeRecordOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.RecordDetail]]("RecordDetail"), o.get[scala.Option[scala.List[avias.servicecatalog.models.RecordOutput]]]("RecordOutputs"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.DescribeRecordOutput.apply _)
  }
  final implicit val ProvisionProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisionProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProvisionToken"), o.get[java.lang.String]("ProvisionedProductName"), o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("ProvisioningArtifactId"), o.get[scala.Option[scala.List[avias.servicecatalog.models.ProvisioningParameter]]]("ProvisioningParameters"), o.get[scala.Option[scala.List[java.lang.String]]]("NotificationArns"), o.get[scala.Option[java.lang.String]]("PathId"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.ProvisionProductInput.apply _)
  }
  final implicit val TagOptionNotMigratedExceptionDecoder: io.circe.Decoder[avias.servicecatalog.models.TagOptionNotMigratedException.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.TagOptionNotMigratedException)
  final implicit val UpdateProvisioningArtifactOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateProvisioningArtifactOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProvisioningArtifactDetail]]("ProvisioningArtifactDetail"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Info"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.servicecatalog.models.UpdateProvisioningArtifactOutput.apply _)
  }
  final implicit val CreateConstraintInputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreateConstraintInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdempotencyToken"), o.get[java.lang.String]("Type"), o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("Parameters"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.CreateConstraintInput.apply _)
  }
  final implicit val ListConstraintsForPortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListConstraintsForPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(avias.servicecatalog.models.ListConstraintsForPortfolioInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.servicecatalog.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(avias.servicecatalog.models.Tag.apply _)
  }
  final implicit val DescribeConstraintOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeConstraintOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ConstraintDetail]]("ConstraintDetail"), o.get[scala.Option[java.lang.String]]("ConstraintParameters"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.servicecatalog.models.DescribeConstraintOutput.apply _)
  }
  final implicit val ProductViewSummaryDecoder: io.circe.Decoder[avias.servicecatalog.models.ProductViewSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Distributor"), o.get[scala.Option[java.lang.String]]("SupportUrl"), o.get[scala.Option[java.lang.String]]("SupportDescription"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[scala.Boolean]]("HasDefaultPath"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("ProductId"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ShortDescription"), o.get[scala.Option[java.lang.String]]("SupportEmail")).mapN(avias.servicecatalog.models.ProductViewSummary.apply _)
  }
  final implicit val SearchProductsInputDecoder: io.circe.Decoder[avias.servicecatalog.models.SearchProductsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SortOrder"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Filters"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[java.lang.String]]("SortBy"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.SearchProductsInput.apply _)
  }
  final implicit val AssociatePrincipalWithPortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.AssociatePrincipalWithPortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.AssociatePrincipalWithPortfolioOutput)
  final implicit val TagOptionSummaryDecoder: io.circe.Decoder[avias.servicecatalog.models.TagOptionSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(avias.servicecatalog.models.TagOptionSummary.apply _)
  }
  final implicit val ListRecordHistorySearchFilterDecoder: io.circe.Decoder[avias.servicecatalog.models.ListRecordHistorySearchFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.servicecatalog.models.ListRecordHistorySearchFilter.apply _)
  }
  final implicit val DescribeProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DescribeProductInput.apply _)
  }
  final implicit val ProvisionProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisionProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.servicecatalog.models.RecordDetail]]("RecordDetail").map(avias.servicecatalog.models.ProvisionProductOutput.apply _)
  }
  final implicit val CreateProvisioningArtifactOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreateProvisioningArtifactOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ProvisioningArtifactDetail]]("ProvisioningArtifactDetail"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Info"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.servicecatalog.models.CreateProvisioningArtifactOutput.apply _)
  }
  final implicit val SearchProductsOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.SearchProductsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.ProductViewSummary]]]("ProductViewSummaries"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[avias.servicecatalog.models.ProductViewAggregationValue]]]]("ProductViewAggregations"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.SearchProductsOutput.apply _)
  }
  final implicit val ListPortfolioAccessInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListPortfolioAccessInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.ListPortfolioAccessInput.apply _)
  }
  final implicit val CopyProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.CopyProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SourceProductArn"), o.get[java.lang.String]("IdempotencyToken"), o.get[scala.Option[java.lang.String]]("TargetProductId"), o.get[scala.Option[java.lang.String]]("TargetProductName"), o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]]("SourceProvisioningArtifactIdentifiers"), o.get[scala.Option[scala.List[java.lang.String]]]("CopyOptions"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.CopyProductInput.apply _)
  }
  final implicit val DisassociatePrincipalFromPortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DisassociatePrincipalFromPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("PrincipalARN"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DisassociatePrincipalFromPortfolioInput.apply _)
  }
  final implicit val AcceptPortfolioShareInputDecoder: io.circe.Decoder[avias.servicecatalog.models.AcceptPortfolioShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.AcceptPortfolioShareInput.apply _)
  }
  final implicit val SearchProductsAsAdminOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.SearchProductsAsAdminOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.ProductViewDetail]]]("ProductViewDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.SearchProductsAsAdminOutput.apply _)
  }
  final implicit val DescribeConstraintInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeConstraintInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DescribeConstraintInput.apply _)
  }
  final implicit val UpdateProvisionedProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateProvisionedProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UpdateToken"), o.get[scala.Option[scala.List[avias.servicecatalog.models.UpdateProvisioningParameter]]]("ProvisioningParameters"), o.get[scala.Option[java.lang.String]]("ProvisionedProductId"), o.get[scala.Option[java.lang.String]]("ProductId"), o.get[scala.Option[java.lang.String]]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("PathId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("ProvisionedProductName")).mapN(avias.servicecatalog.models.UpdateProvisionedProductInput.apply _)
  }
  final implicit val UpdatePortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdatePortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.PortfolioDetail]]("PortfolioDetail"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags")).mapN(avias.servicecatalog.models.UpdatePortfolioOutput.apply _)
  }
  final implicit val TerminateProvisionedProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.TerminateProvisionedProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TerminateToken"), o.get[scala.Option[java.lang.String]]("ProvisionedProductId"), o.get[scala.Option[scala.Boolean]]("IgnoreErrors"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("ProvisionedProductName")).mapN(avias.servicecatalog.models.TerminateProvisionedProductInput.apply _)
  }
  final implicit val ScanProvisionedProductsInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ScanProvisionedProductsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[avias.servicecatalog.models.AccessLevelFilter]]("AccessLevelFilter"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(avias.servicecatalog.models.ScanProvisionedProductsInput.apply _)
  }
  final implicit val ResourceDetailDecoder: io.circe.Decoder[avias.servicecatalog.models.ResourceDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.lang.String]]("ARN")).mapN(avias.servicecatalog.models.ResourceDetail.apply _)
  }
  final implicit val DescribeProvisioningParametersOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProvisioningParametersOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifactParameter]]]("ProvisioningArtifactParameters"), o.get[scala.Option[scala.List[avias.servicecatalog.models.ConstraintSummary]]]("ConstraintSummaries"), o.get[scala.Option[scala.List[avias.servicecatalog.models.UsageInstruction]]]("UsageInstructions"), o.get[scala.Option[scala.List[avias.servicecatalog.models.TagOptionSummary]]]("TagOptions")).mapN(avias.servicecatalog.models.DescribeProvisioningParametersOutput.apply _)
  }
  final implicit val ScanProvisionedProductsOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ScanProvisionedProductsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.ProvisionedProductDetail]]]("ProvisionedProducts"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ScanProvisionedProductsOutput.apply _)
  }
  final implicit val LaunchPathSummaryDecoder: io.circe.Decoder[avias.servicecatalog.models.LaunchPathSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.List[avias.servicecatalog.models.ConstraintSummary]]]("ConstraintSummaries"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("Name")).mapN(avias.servicecatalog.models.LaunchPathSummary.apply _)
  }
  final implicit val DescribeTagOptionInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeTagOptionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Id").map(avias.servicecatalog.models.DescribeTagOptionInput.apply _)
  }
  final implicit val CreateConstraintOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreateConstraintOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ConstraintDetail]]("ConstraintDetail"), o.get[scala.Option[java.lang.String]]("ConstraintParameters"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.servicecatalog.models.CreateConstraintOutput.apply _)
  }
  final implicit val UpdateConstraintInputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateConstraintInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.servicecatalog.models.UpdateConstraintInput.apply _)
  }
  final implicit val AssociateTagOptionWithResourceOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.AssociateTagOptionWithResourceOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.AssociateTagOptionWithResourceOutput)
  final implicit val ListPrincipalsForPortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListPrincipalsForPortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.Principal]]]("Principals"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListPrincipalsForPortfolioOutput.apply _)
  }
  final implicit val ListProvisioningArtifactsOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListProvisioningArtifactsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifactDetail]]]("ProvisioningArtifactDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListProvisioningArtifactsOutput.apply _)
  }
  final implicit val UpdateProvisioningParameterDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateProvisioningParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Boolean]]("UsePreviousValue")).mapN(avias.servicecatalog.models.UpdateProvisioningParameter.apply _)
  }
  final implicit val ProvisioningArtifactDecoder: io.circe.Decoder[avias.servicecatalog.models.ProvisioningArtifact] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.time.Instant]]("CreatedTime")).mapN(avias.servicecatalog.models.ProvisioningArtifact.apply _)
  }
  final implicit val ListPortfoliosInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListPortfoliosInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[scala.Int]]("PageSize")).mapN(avias.servicecatalog.models.ListPortfoliosInput.apply _)
  }
  final implicit val CreatePortfolioShareInputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreatePortfolioShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("AccountId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.CreatePortfolioShareInput.apply _)
  }
  final implicit val PrincipalDecoder: io.circe.Decoder[avias.servicecatalog.models.Principal] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PrincipalARN"), o.get[scala.Option[java.lang.String]]("PrincipalType")).mapN(avias.servicecatalog.models.Principal.apply _)
  }
  final implicit val ListTagOptionsInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListTagOptionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servicecatalog.models.ListTagOptionsFilters]]("Filters"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(avias.servicecatalog.models.ListTagOptionsInput.apply _)
  }
  final implicit val TerminateProvisionedProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.TerminateProvisionedProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.servicecatalog.models.RecordDetail]]("RecordDetail").map(avias.servicecatalog.models.TerminateProvisionedProductOutput.apply _)
  }
  final implicit val RejectPortfolioShareInputDecoder: io.circe.Decoder[avias.servicecatalog.models.RejectPortfolioShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.RejectPortfolioShareInput.apply _)
  }
  final implicit val DeleteProductOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeleteProductOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DeleteProductOutput)
  final implicit val RecordDetailDecoder: io.circe.Decoder[avias.servicecatalog.models.RecordDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RecordType"), o.get[scala.Option[java.lang.String]]("ProvisionedProductType"), o.get[scala.Option[java.lang.String]]("ProvisionedProductName"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("ProductId"), o.get[scala.Option[java.lang.String]]("ProvisionedProductId"), o.get[scala.Option[java.lang.String]]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("PathId"), o.get[scala.Option[java.lang.String]]("RecordId"), o.get[scala.Option[scala.List[avias.servicecatalog.models.RecordTag]]]("RecordTags"), o.get[scala.Option[java.time.Instant]]("UpdatedTime"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[scala.List[avias.servicecatalog.models.RecordError]]]("RecordErrors")).mapN(avias.servicecatalog.models.RecordDetail.apply _)
  }
  final implicit val DescribeProvisioningParametersInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProvisioningParametersInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("PathId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DescribeProvisioningParametersInput.apply _)
  }
  final implicit val CreatePortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreatePortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdempotencyToken"), o.get[java.lang.String]("ProviderName"), o.get[java.lang.String]("DisplayName"), o.get[scala.Option[scala.List[avias.servicecatalog.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.CreatePortfolioInput.apply _)
  }
  final implicit val CreateProvisioningArtifactInputDecoder: io.circe.Decoder[avias.servicecatalog.models.CreateProvisioningArtifactInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[avias.servicecatalog.models.ProvisioningArtifactProperties]("Parameters"), o.get[java.lang.String]("IdempotencyToken"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.CreateProvisioningArtifactInput.apply _)
  }
  final implicit val AssociateProductWithPortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.AssociateProductWithPortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.AssociateProductWithPortfolioOutput)
  final implicit val ListRecordHistoryOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListRecordHistoryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.RecordDetail]]]("RecordDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListRecordHistoryOutput.apply _)
  }
  final implicit val DisassociateProductFromPortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DisassociateProductFromPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DisassociateProductFromPortfolioInput.apply _)
  }
  final implicit val ListPortfolioAccessOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListPortfolioAccessOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("AccountIds"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListPortfolioAccessOutput.apply _)
  }
  final implicit val DescribeRecordInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeRecordInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[scala.Int]]("PageSize")).mapN(avias.servicecatalog.models.DescribeRecordInput.apply _)
  }
  final implicit val DeletePortfolioShareOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeletePortfolioShareOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DeletePortfolioShareOutput)
  final implicit val ListPrincipalsForPortfolioInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListPrincipalsForPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(avias.servicecatalog.models.ListPrincipalsForPortfolioInput.apply _)
  }
  final implicit val AcceptPortfolioShareOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.AcceptPortfolioShareOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.AcceptPortfolioShareOutput)
  final implicit val RejectPortfolioShareOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.RejectPortfolioShareOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.RejectPortfolioShareOutput)
  final implicit val ListAcceptedPortfolioSharesInputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListAcceptedPortfolioSharesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[scala.Int]]("PageSize")).mapN(avias.servicecatalog.models.ListAcceptedPortfolioSharesInput.apply _)
  }
  final implicit val DisassociatePrincipalFromPortfolioOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.DisassociatePrincipalFromPortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(avias.servicecatalog.models.DisassociatePrincipalFromPortfolioOutput)
  final implicit val AccessLevelFilterDecoder: io.circe.Decoder[avias.servicecatalog.models.AccessLevelFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.servicecatalog.models.AccessLevelFilter.apply _)
  }
  final implicit val DeleteConstraintInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeleteConstraintInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DeleteConstraintInput.apply _)
  }
  final implicit val ConstraintSummaryDecoder: io.circe.Decoder[avias.servicecatalog.models.ConstraintSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.servicecatalog.models.ConstraintSummary.apply _)
  }
  final implicit val DescribeProvisionedProductInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DescribeProvisionedProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DescribeProvisionedProductInput.apply _)
  }
  final implicit val DeletePortfolioShareInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeletePortfolioShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("AccountId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DeletePortfolioShareInput.apply _)
  }
  final implicit val ListLaunchPathsOutputDecoder: io.circe.Decoder[avias.servicecatalog.models.ListLaunchPathsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servicecatalog.models.LaunchPathSummary]]]("LaunchPathSummaries"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(avias.servicecatalog.models.ListLaunchPathsOutput.apply _)
  }
  final implicit val UpdateTagOptionInputDecoder: io.circe.Decoder[avias.servicecatalog.models.UpdateTagOptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Boolean]]("Active")).mapN(avias.servicecatalog.models.UpdateTagOptionInput.apply _)
  }
  final implicit val DeleteProvisioningArtifactInputDecoder: io.circe.Decoder[avias.servicecatalog.models.DeleteProvisioningArtifactInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(avias.servicecatalog.models.DeleteProvisioningArtifactInput.apply _)
  }
}