package com.example.travelday.domain.travelplan.dto.request;

import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record TravelPlanReqDto (

    @NotBlank(message = ValidationMessage.TRAVELPLAN_REQUIRED)
    String name,

    @NotNull(message = ValidationMessage.TRAVELPLAN_SCHEDULED_DAY_REQUIRED)
    int scheduledDay,

    @NotNull(message = ValidationMessage.TRAVELPLAN_LOCATION_REQUIRED)
    double latitude,

    @NotNull(message = ValidationMessage.TRAVELPLAN_LOCATION_REQUIRED)
    double longitude
) {
}
