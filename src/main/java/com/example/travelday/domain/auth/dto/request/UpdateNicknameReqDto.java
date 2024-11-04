package com.example.travelday.domain.auth.dto.request;

import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UpdateNicknameReqDto(

    @NotBlank(message = ValidationMessage.NICKNAME_REQUIRED)
    @Size(max = 15, message = ValidationMessage.NICKNAME_MAX_LENGTH)
    @Pattern(regexp = "^[a-zA-Z0-9가-힣]+$", message = ValidationMessage.NICKNAME_PATTERN)
    String nickname
) {
}
