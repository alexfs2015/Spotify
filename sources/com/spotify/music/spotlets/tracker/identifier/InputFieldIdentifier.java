package com.spotify.music.spotlets.tracker.identifier;

import com.comscore.android.id.IdHelperAndroid;

public enum InputFieldIdentifier {
    EMAIL("email"),
    PASSWORD("password"),
    USERNAME("username"),
    AGE("birth_date"),
    GENDER("gender"),
    DISPLAY_NAME("display_name"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE),
    CALLING_CODE("calling_code"),
    PHONE_NUMBER("phone_number"),
    OTP("otp");
    
    public final String mType;

    private InputFieldIdentifier(String str) {
        this.mType = str;
    }
}
