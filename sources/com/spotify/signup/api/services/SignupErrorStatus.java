package com.spotify.signup.api.services;

public enum SignupErrorStatus {
    STATUS_UNKNOWN_ERROR(5),
    STATUS_ALREADY_REGISTERED(10),
    STATUS_EMAIL_ALREADY_EXISTS(20),
    STATUS_INVALID_FORM_DATA(100),
    STATUS_INVALID_COUNTRY(120),
    STATUS_INVALID_EMAIL(130),
    STATUS_VALIDATE_TOO_YOUNG(200),
    STATUS_NO_CONNECTION(-1);
    
    final int mValue;

    private SignupErrorStatus(int i2) {
        this.mValue = i2;
    }

    public static SignupErrorStatus a(int i2) {
        SignupErrorStatus[] values;
        for (SignupErrorStatus signupErrorStatus : values()) {
            if (i2 == signupErrorStatus.mValue) {
                return signupErrorStatus;
            }
        }
        return STATUS_UNKNOWN_ERROR;
    }
}
