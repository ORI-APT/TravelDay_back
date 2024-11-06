package com.example.travelday.global.exception;

public class ValidationMessage {

    public static final String NICKNAME_REQUIRED = "닉네임은 필수 항목입니다.";
    public static final String NICKNAME_MAX_LENGTH = "닉네임은 최대 15자까지 가능합니다.";
    public static final String NICKNAME_PATTERN = "닉네임은 영문, 숫자, 한글만 입력 가능합니다.";

    public static final String MESSAGE_MAX_LENGTH = "메시지는 5000자 이내로 입력해야 합니다.";
    public static final String MISSING_REQUIRED_FIELD = "메세지 입력은 필수 항목입니다.";

    public static final String INVITATION_STATUS_REQUIRED = "상태 값은 필수입니다.";
    public static final String INVITATION_STATUS_PATTERN = "상태 값은 'ACCEPTED' 또는 'REJECTED' 또는 'PENDING' 여야 합니다.";

    public static final String SETTLEMENT_NAME_REQUIRED = "정산 이름은 필수 항목입니다.";
    public static final String SETTLEMENT_AMOUNT_POSITIVE = "정산 금액은 0보다 커야 합니다.";
    public static final String SETTLEMENT_AMOUNT_REQUIRED = "정산 금액은 필수 항목입니다.";

    public static final String TRAVELPLAN_REQUIRED = "여행 일정은 최소 1개 이상 있어야 합니다.";
    public static final String TRAVELPLAN_ID_REQUIRED = "여행 일정 이름은 필수 항목입니다.";
    public static final String TRAVELPLAN_LOCATION_REQUIRED = "여행 일정의 위치는 필수 항목입니다.";
    public static final String TRAVELPLAN_NAME_REQUIRED = "여행 일정 이름은 필수 항목입니다.";
    public static final String TRAVELPLAN_SCHEDULED_DAY_REQUIRED = "여행 일정 날짜는 필수 항목입니다.";

    public static final String TRAVELROOM_NAME_REQUIRED = "여행방 이름은 필수 항목입니다.";
    public static final String TRAVELROOM_START_DATE_REQUIRED = "여행 시작 날짜는 필수 항목입니다.";
    public static final String TRAVELROOM_END_DATE_REQUIRED = "여행 종료 날짜는 필수 항목입니다.";
    public static final String TRAVELROOM_START_DATE_PATTERN = "여행 시작 날짜는 yyyy-MM-dd 형식이어야 합니다.";
    public static final String TRAVELROOM_END_DATE_PATTERN = "여행 종료 날짜는 yyyy-MM-dd 형식이어야 합니다.";

    public static final String WISH_NAME_REQUIRED = "위시 이름은 필수 항목입니다.";
    public static final String WISH_LATITUDE_REQUIRED = "위시 위도는 필수 항목입니다.";
    public static final String WISH_LONGITUDE_REQUIRED = "위시 경도는 필수 항목입니다.";

}
