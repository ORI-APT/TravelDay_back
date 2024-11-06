package com.example.travelday.domain.travelplan.dto.request.group;

import com.example.travelday.domain.travelplan.dto.request.TravelPlanReqDto;
import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;

import java.util.List;

@Builder
public record TravelPlansReqDto(
    @NotEmpty(message = ValidationMessage.TRAVELPLAN_REQUIRED)
    List<@Valid TravelPlanReqDto> body
) {
}