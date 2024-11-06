package com.example.travelday.domain.settlement.dto.request;

import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Map;

public record SettlementNotificationReqDto(
    @NotEmpty(message = ValidationMessage.SETTLEMENT_AMOUNT_REQUIRED)
    Map<String, BigDecimal> nicknameToPrice
) {
}