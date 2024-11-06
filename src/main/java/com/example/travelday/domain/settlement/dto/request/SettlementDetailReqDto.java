package com.example.travelday.domain.settlement.dto.request;

import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record SettlementDetailReqDto(
        @NotBlank(message = ValidationMessage.SETTLEMENT_NAME_REQUIRED)
        String name,
        @Positive(message = ValidationMessage.SETTLEMENT_AMOUNT_POSITIVE)
        Long amount
) {
}
