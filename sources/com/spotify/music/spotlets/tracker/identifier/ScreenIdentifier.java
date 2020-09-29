package com.spotify.music.spotlets.tracker.identifier;

public enum ScreenIdentifier {
    START("start"),
    LOGIN("login"),
    SIGN_UP("sign_up"),
    SIGN_UP_STEP_ONE("sign_up_step_one"),
    SIGN_UP_STEP_TWO("sign_up_step_two"),
    SIGN_UP_STEP_THREE("sign_up_step_three"),
    SIGN_UP_EMAIL("sign_up_email"),
    SIGN_UP_PASSWORD("sign_up_password"),
    SIGN_UP_BIRTHDAY("sign_up_birthday"),
    SIGN_UP_GENDER("sign_up_gender"),
    SIGN_UP_DISPLAY_NAME("sign_up_display_name"),
    CREATE_FB_ACCOUNT("create_fb_account"),
    LOGIN_FB_ACCOUNT("login_fb_account"),
    SMARTLOCK_LOGIN("smartlock_login"),
    RESET_PASSWORD_USERNAME("reset_password_username"),
    RESET_PASSWORD_SUPPORT_PAGE("reset_password_support_page"),
    RESET_PASSWORD_EMAIL_SENT("reset_password_email_sent"),
    SET_PASSWORD("set_password"),
    SET_PASSWORD_CONFIRMATION("set_password_confirmation"),
    MAGICLINK_EMAIL_SENT("magiclink_email_sent"),
    MAGICLINK_EMAIL_USERNAME("magiclink_email_username"),
    MAGICLINK_LOGIN("magiclink_login"),
    ON_LOGGED_IN("on_logged_in"),
    PHONE_NUMBER_AGE_GENDER("phone_number_age_gender"),
    PHONE_NUMBER_CONTINUE_WITH_EMAIL("phone_number_continue_with_email"),
    PHONE_NUMBER_DISPLAY_NAME("phone_number_display_name"),
    PHONE_NUMBER_LOGIN("phone_number_login"),
    PHONE_NUMBER_OTP("phone_number_otp"),
    PHONE_NUMBER_PHONE_NUMBER("phone_number_phone_number"),
    PHONE_NUMBER_SIGN_UP("phone_number_sign_up"),
    PHONE_NUMBER_START("phone_number_start"),
    SAMSUNG_EFFORTLESS_LOGIN_SHEET("samsung_effortless_login_sheet"),
    SAMSUNG_EFFORTLESS_LOGIN_LOADING("samsung_effortless_login_loading");
    
    public final String mType;

    private ScreenIdentifier(String str) {
        this.mType = str;
    }
}
