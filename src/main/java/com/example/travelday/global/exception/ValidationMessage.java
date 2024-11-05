package com.example.travelday.global.exception;

public class ValidationMessage {

    public static final String NICKNAME_REQUIRED = "닉네임은 필수 항목입니다.";
    public static final String NICKNAME_MAX_LENGTH = "닉네임은 최대 15자까지 가능합니다.";
    public static final String NICKNAME_PATTERN = "닉네임은 영문, 숫자, 한글만 입력 가능합니다.";

    public static final String MESSAGE_MAX_LENGTH = "메시지는 5000자 이내로 입력해야 합니다.";
    public static final String MISSING_REQUIRED_FIELD = "메세지 입력은 필수 항목입니다.";

    public static final String INVITATION_STATUS_REQUIRED = "상태 값은 필수입니다.";
    public static final String INVITATION_STATUS_PATTERN = "상태 값은 'ACCEPTED' 또는 'REJECTED' 또는 'PENDING' 여야 합니다.";


}
