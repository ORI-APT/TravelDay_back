package com.example.travelday.domain.chat.dto.request;

import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record ChatReqDto(
    @NotNull(message = ValidationMessage.MISSING_REQUIRED_FIELD)
    @Size(max = 5000, message = ValidationMessage.MESSAGE_MAX_LENGTH)
    String message
) {
}
