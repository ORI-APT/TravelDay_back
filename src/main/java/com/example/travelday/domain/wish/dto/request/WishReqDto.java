package com.example.travelday.domain.wish.dto.request;

import com.example.travelday.global.exception.ValidException;
import com.example.travelday.global.exception.ValidationMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;


@Builder
public record WishReqDto(

        @NotBlank(message = ValidationMessage.WISH_NAME_REQUIRED)
        String name,

        @NotNull(message = ValidationMessage.WISH_LATITUDE_REQUIRED)
        double latitude,

        @NotNull(message = ValidationMessage.WISH_LONGITUDE_REQUIRED)
        double longitude
) {
}