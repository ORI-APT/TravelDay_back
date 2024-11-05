package com.example.travelday.domain.invitation.dto.request;

import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record InvitationStatusReqDto(
        @NotBlank(message = ValidationMessage.INVITATION_STATUS_REQUIRED)
        @Pattern(regexp = "^(ACCEPTED|REJECTED|PENDING)$", message = ValidationMessage.INVITATION_STATUS_PATTERN)
        String status
) {
}
