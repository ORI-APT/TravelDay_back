package com.example.travelday.domain.travelroom.dto.request;

import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Builder
public record TravelRoomReqDto(

    @NotBlank(message = ValidationMessage.TRAVELROOM_NAME_REQUIRED)
    String name,

    @NotBlank(message = ValidationMessage.TRAVELROOM_START_DATE_REQUIRED)
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = ValidationMessage.TRAVELROOM_START_DATE_PATTERN)
    String startDate,

    @NotBlank(message = ValidationMessage.TRAVELROOM_END_DATE_REQUIRED)
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = ValidationMessage.TRAVELROOM_END_DATE_PATTERN)
    String endDate
) {
}
