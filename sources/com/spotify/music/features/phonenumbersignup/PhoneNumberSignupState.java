package com.spotify.music.features.phonenumbersignup;

public enum PhoneNumberSignupState {
    REQUEST_OTP,
    VALIDATE_OTP,
    AGE_GENDER,
    DISPLAY_NAME;
    
    public static final PhoneNumberSignupState[] e = null;

    static {
        e = values();
    }
}
