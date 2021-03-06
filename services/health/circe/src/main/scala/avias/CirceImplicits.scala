package avias.health
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val EventAggregateEncoder: io.circe.Encoder[avias.health.models.EventAggregate] = io.circe.Encoder.instance { o => 
    Json.obj("aggregateValue" -> o.aggregateValue.asJson, "count" -> o.count.asJson)
  }
  final implicit val DescribeAffectedEntitiesRequestEncoder: io.circe.Encoder[avias.health.models.DescribeAffectedEntitiesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("filter" -> o.filter.asJson, "locale" -> o.locale.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val EventDescriptionEncoder: io.circe.Encoder[avias.health.models.EventDescription] = io.circe.Encoder.instance { o => 
    Json.obj("latestDescription" -> o.latestDescription.asJson)
  }
  final implicit val DateTimeRangeEncoder: io.circe.Encoder[avias.health.models.DateTimeRange] = io.circe.Encoder.instance { o => 
    Json.obj("from" -> o.from.asJson, "to" -> o.to.asJson)
  }
  final implicit val DescribeEventDetailsResponseEncoder: io.circe.Encoder[avias.health.models.DescribeEventDetailsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("successfulSet" -> o.successfulSet.asJson, "failedSet" -> o.failedSet.asJson)
  }
  final implicit val EventTypeFilterEncoder: io.circe.Encoder[avias.health.models.EventTypeFilter] = io.circe.Encoder.instance { o => 
    Json.obj("eventTypeCodes" -> o.eventTypeCodes.asJson, "services" -> o.services.asJson, "eventTypeCategories" -> o.eventTypeCategories.asJson)
  }
  final implicit val DescribeEventAggregatesRequestEncoder: io.circe.Encoder[avias.health.models.DescribeEventAggregatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("aggregateField" -> o.aggregateField.asJson, "filter" -> o.filter.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val EntityAggregateEncoder: io.circe.Encoder[avias.health.models.EntityAggregate] = io.circe.Encoder.instance { o => 
    Json.obj("eventArn" -> o.eventArn.asJson, "count" -> o.count.asJson)
  }
  final implicit val DescribeEventTypesRequestEncoder: io.circe.Encoder[avias.health.models.DescribeEventTypesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("filter" -> o.filter.asJson, "locale" -> o.locale.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val EventTypeEncoder: io.circe.Encoder[avias.health.models.EventType] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson, "code" -> o.code.asJson, "category" -> o.category.asJson)
  }
  final implicit val DescribeEventAggregatesResponseEncoder: io.circe.Encoder[avias.health.models.DescribeEventAggregatesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("eventAggregates" -> o.eventAggregates.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val EntityFilterEncoder: io.circe.Encoder[avias.health.models.EntityFilter] = io.circe.Encoder.instance { o => 
    Json.obj("eventArns" -> o.eventArns.asJson, "entityArns" -> o.entityArns.asJson, "entityValues" -> o.entityValues.asJson, "lastUpdatedTimes" -> o.lastUpdatedTimes.asJson, "tags" -> o.tags.asJson, "statusCodes" -> o.statusCodes.asJson)
  }
  final implicit val DescribeEntityAggregatesRequestEncoder: io.circe.Encoder[avias.health.models.DescribeEntityAggregatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("eventArns" -> o.eventArns.asJson)
  }
  final implicit val DescribeEventsResponseEncoder: io.circe.Encoder[avias.health.models.DescribeEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("events" -> o.events.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeEventsRequestEncoder: io.circe.Encoder[avias.health.models.DescribeEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson, "locale" -> o.locale.asJson)
  }
  final implicit val DescribeEventDetailsRequestEncoder: io.circe.Encoder[avias.health.models.DescribeEventDetailsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("eventArns" -> o.eventArns.asJson, "locale" -> o.locale.asJson)
  }
  final implicit val DescribeEntityAggregatesResponseEncoder: io.circe.Encoder[avias.health.models.DescribeEntityAggregatesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("entityAggregates" -> o.entityAggregates.asJson)
  }
  final implicit val EventFilterEncoder: io.circe.Encoder[avias.health.models.EventFilter] = io.circe.Encoder.instance { o => 
    Json.obj("entityArns" -> o.entityArns.asJson, "availabilityZones" -> o.availabilityZones.asJson, "entityValues" -> o.entityValues.asJson, "regions" -> o.regions.asJson, "startTimes" -> o.startTimes.asJson, "endTimes" -> o.endTimes.asJson, "lastUpdatedTimes" -> o.lastUpdatedTimes.asJson, "eventStatusCodes" -> o.eventStatusCodes.asJson, "eventTypeCodes" -> o.eventTypeCodes.asJson, "tags" -> o.tags.asJson, "eventArns" -> o.eventArns.asJson, "eventTypeCategories" -> o.eventTypeCategories.asJson, "services" -> o.services.asJson)
  }
  final implicit val EventDetailsErrorItemEncoder: io.circe.Encoder[avias.health.models.EventDetailsErrorItem] = io.circe.Encoder.instance { o => 
    Json.obj("eventArn" -> o.eventArn.asJson, "errorName" -> o.errorName.asJson, "errorMessage" -> o.errorMessage.asJson)
  }
  final implicit val EventDetailsEncoder: io.circe.Encoder[avias.health.models.EventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("event" -> o.event.asJson, "eventDescription" -> o.eventDescription.asJson, "eventMetadata" -> o.eventMetadata.asJson)
  }
  final implicit val DescribeEventTypesResponseEncoder: io.circe.Encoder[avias.health.models.DescribeEventTypesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("eventTypes" -> o.eventTypes.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidPaginationTokenEncoder: io.circe.Encoder[avias.health.models.InvalidPaginationToken] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeAffectedEntitiesResponseEncoder: io.circe.Encoder[avias.health.models.DescribeAffectedEntitiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("entities" -> o.entities.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AffectedEntityEncoder: io.circe.Encoder[avias.health.models.AffectedEntity] = io.circe.Encoder.instance { o => 
    Json.obj("entityValue" -> o.entityValue.asJson, "entityArn" -> o.entityArn.asJson, "tags" -> o.tags.asJson, "awsAccountId" -> o.awsAccountId.asJson, "statusCode" -> o.statusCode.asJson, "lastUpdatedTime" -> o.lastUpdatedTime.asJson, "eventArn" -> o.eventArn.asJson)
  }
  final implicit val EventEncoder: io.circe.Encoder[avias.health.models.Event] = io.circe.Encoder.instance { o => 
    Json.obj("statusCode" -> o.statusCode.asJson, "availabilityZone" -> o.availabilityZone.asJson, "region" -> o.region.asJson, "eventTypeCode" -> o.eventTypeCode.asJson, "service" -> o.service.asJson, "eventTypeCategory" -> o.eventTypeCategory.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "lastUpdatedTime" -> o.lastUpdatedTime.asJson, "arn" -> o.arn.asJson)
  }
  final implicit val UnsupportedLocaleEncoder: io.circe.Encoder[avias.health.models.UnsupportedLocale] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val EventAggregateDecoder: io.circe.Decoder[avias.health.models.EventAggregate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("aggregateValue"), o.get[scala.Option[scala.Int]]("count")).mapN(avias.health.models.EventAggregate.apply _)
  }
  final implicit val DescribeAffectedEntitiesRequestDecoder: io.circe.Decoder[avias.health.models.DescribeAffectedEntitiesRequest] = io.circe.Decoder.instance { o => 
    (o.get[avias.health.models.EntityFilter]("filter"), o.get[scala.Option[java.lang.String]]("locale"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.health.models.DescribeAffectedEntitiesRequest.apply _)
  }
  final implicit val EventDescriptionDecoder: io.circe.Decoder[avias.health.models.EventDescription] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("latestDescription").map(avias.health.models.EventDescription.apply _)
  }
  final implicit val DateTimeRangeDecoder: io.circe.Decoder[avias.health.models.DateTimeRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("from"), o.get[scala.Option[java.time.Instant]]("to")).mapN(avias.health.models.DateTimeRange.apply _)
  }
  final implicit val DescribeEventDetailsResponseDecoder: io.circe.Decoder[avias.health.models.DescribeEventDetailsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.health.models.EventDetails]]]("successfulSet"), o.get[scala.Option[scala.List[avias.health.models.EventDetailsErrorItem]]]("failedSet")).mapN(avias.health.models.DescribeEventDetailsResponse.apply _)
  }
  final implicit val EventTypeFilterDecoder: io.circe.Decoder[avias.health.models.EventTypeFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("eventTypeCodes"), o.get[scala.Option[scala.List[java.lang.String]]]("services"), o.get[scala.Option[scala.List[java.lang.String]]]("eventTypeCategories")).mapN(avias.health.models.EventTypeFilter.apply _)
  }
  final implicit val DescribeEventAggregatesRequestDecoder: io.circe.Decoder[avias.health.models.DescribeEventAggregatesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("aggregateField"), o.get[scala.Option[avias.health.models.EventFilter]]("filter"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.health.models.DescribeEventAggregatesRequest.apply _)
  }
  final implicit val EntityAggregateDecoder: io.circe.Decoder[avias.health.models.EntityAggregate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("eventArn"), o.get[scala.Option[scala.Int]]("count")).mapN(avias.health.models.EntityAggregate.apply _)
  }
  final implicit val DescribeEventTypesRequestDecoder: io.circe.Decoder[avias.health.models.DescribeEventTypesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.health.models.EventTypeFilter]]("filter"), o.get[scala.Option[java.lang.String]]("locale"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.health.models.DescribeEventTypesRequest.apply _)
  }
  final implicit val EventTypeDecoder: io.circe.Decoder[avias.health.models.EventType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("service"), o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("category")).mapN(avias.health.models.EventType.apply _)
  }
  final implicit val DescribeEventAggregatesResponseDecoder: io.circe.Decoder[avias.health.models.DescribeEventAggregatesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.health.models.EventAggregate]]]("eventAggregates"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.health.models.DescribeEventAggregatesResponse.apply _)
  }
  final implicit val EntityFilterDecoder: io.circe.Decoder[avias.health.models.EntityFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("eventArns"), o.get[scala.Option[scala.List[java.lang.String]]]("entityArns"), o.get[scala.Option[scala.List[java.lang.String]]]("entityValues"), o.get[scala.Option[scala.List[avias.health.models.DateTimeRange]]]("lastUpdatedTimes"), o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]]("tags"), o.get[scala.Option[scala.List[java.lang.String]]]("statusCodes")).mapN(avias.health.models.EntityFilter.apply _)
  }
  final implicit val DescribeEntityAggregatesRequestDecoder: io.circe.Decoder[avias.health.models.DescribeEntityAggregatesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("eventArns").map(avias.health.models.DescribeEntityAggregatesRequest.apply _)
  }
  final implicit val DescribeEventsResponseDecoder: io.circe.Decoder[avias.health.models.DescribeEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.health.models.Event]]]("events"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.health.models.DescribeEventsResponse.apply _)
  }
  final implicit val DescribeEventsRequestDecoder: io.circe.Decoder[avias.health.models.DescribeEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.health.models.EventFilter]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("locale")).mapN(avias.health.models.DescribeEventsRequest.apply _)
  }
  final implicit val DescribeEventDetailsRequestDecoder: io.circe.Decoder[avias.health.models.DescribeEventDetailsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("eventArns"), o.get[scala.Option[java.lang.String]]("locale")).mapN(avias.health.models.DescribeEventDetailsRequest.apply _)
  }
  final implicit val DescribeEntityAggregatesResponseDecoder: io.circe.Decoder[avias.health.models.DescribeEntityAggregatesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.health.models.EntityAggregate]]]("entityAggregates").map(avias.health.models.DescribeEntityAggregatesResponse.apply _)
  }
  final implicit val EventFilterDecoder: io.circe.Decoder[avias.health.models.EventFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("entityArns"), o.get[scala.Option[scala.List[java.lang.String]]]("availabilityZones"), o.get[scala.Option[scala.List[java.lang.String]]]("entityValues"), o.get[scala.Option[scala.List[java.lang.String]]]("regions"), o.get[scala.Option[scala.List[avias.health.models.DateTimeRange]]]("startTimes"), o.get[scala.Option[scala.List[avias.health.models.DateTimeRange]]]("endTimes"), o.get[scala.Option[scala.List[avias.health.models.DateTimeRange]]]("lastUpdatedTimes"), o.get[scala.Option[scala.List[java.lang.String]]]("eventStatusCodes"), o.get[scala.Option[scala.List[java.lang.String]]]("eventTypeCodes"), o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]]("tags"), o.get[scala.Option[scala.List[java.lang.String]]]("eventArns"), o.get[scala.Option[scala.List[java.lang.String]]]("eventTypeCategories"), o.get[scala.Option[scala.List[java.lang.String]]]("services")).mapN(avias.health.models.EventFilter.apply _)
  }
  final implicit val EventDetailsErrorItemDecoder: io.circe.Decoder[avias.health.models.EventDetailsErrorItem] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("eventArn"), o.get[scala.Option[java.lang.String]]("errorName"), o.get[scala.Option[java.lang.String]]("errorMessage")).mapN(avias.health.models.EventDetailsErrorItem.apply _)
  }
  final implicit val EventDetailsDecoder: io.circe.Decoder[avias.health.models.EventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.health.models.Event]]("event"), o.get[scala.Option[avias.health.models.EventDescription]]("eventDescription"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("eventMetadata")).mapN(avias.health.models.EventDetails.apply _)
  }
  final implicit val DescribeEventTypesResponseDecoder: io.circe.Decoder[avias.health.models.DescribeEventTypesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.health.models.EventType]]]("eventTypes"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.health.models.DescribeEventTypesResponse.apply _)
  }
  final implicit val InvalidPaginationTokenDecoder: io.circe.Decoder[avias.health.models.InvalidPaginationToken] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.health.models.InvalidPaginationToken.apply _)
  }
  final implicit val DescribeAffectedEntitiesResponseDecoder: io.circe.Decoder[avias.health.models.DescribeAffectedEntitiesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.health.models.AffectedEntity]]]("entities"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.health.models.DescribeAffectedEntitiesResponse.apply _)
  }
  final implicit val AffectedEntityDecoder: io.circe.Decoder[avias.health.models.AffectedEntity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("entityValue"), o.get[scala.Option[java.lang.String]]("entityArn"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("tags"), o.get[scala.Option[java.lang.String]]("awsAccountId"), o.get[scala.Option[java.lang.String]]("statusCode"), o.get[scala.Option[java.time.Instant]]("lastUpdatedTime"), o.get[scala.Option[java.lang.String]]("eventArn")).mapN(avias.health.models.AffectedEntity.apply _)
  }
  final implicit val EventDecoder: io.circe.Decoder[avias.health.models.Event] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("statusCode"), o.get[scala.Option[java.lang.String]]("availabilityZone"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[java.lang.String]]("eventTypeCode"), o.get[scala.Option[java.lang.String]]("service"), o.get[scala.Option[java.lang.String]]("eventTypeCategory"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[java.time.Instant]]("lastUpdatedTime"), o.get[scala.Option[java.lang.String]]("arn")).mapN(avias.health.models.Event.apply _)
  }
  final implicit val UnsupportedLocaleDecoder: io.circe.Decoder[avias.health.models.UnsupportedLocale] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.health.models.UnsupportedLocale.apply _)
  }
}