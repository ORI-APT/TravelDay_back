package com.example.travelday.domain.travelplan.dto.request;

import com.example.travelday.global.exception.ValidationMessage;
import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record TravelPlanOverwriteReqDto(

    @NotNull(message = ValidationMessage.TRAVELPLAN_ID_REQUIRED)
    Long id,

    @Nullable
    int scheduledDay,

    @NotNull(message = ValidationMessage.TRAVELPLAN_LOCATION_REQUIRED)
    int position
) {
}