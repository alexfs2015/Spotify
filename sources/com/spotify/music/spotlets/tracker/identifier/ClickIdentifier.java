package com.spotify.music.spotlets.tracker.identifier;

public enum ClickIdentifier {
    NEXT("next"),
    MALE_BUTTON("male"),
    FEMALE_BUTTON("female"),
    NONE_BINARY_BUTTON("none_binary"),
    GO_TO_LOGIN(r5),
    DIALOG_DISMISS("dismiss"),
    DIALOG_OK("ok"),
    BACK_PRESSED("back_pressed"),
    SIGN_UP_BUTTON("sign_up"),
    LOGIN_BUTTON(r5),
    FACEBOOK_BUTTON("facebook"),
    CONTINUE_BUTTON("continue"),
    CANCEL_BUTTON("cancel"),
    RESET_PASSWORD_BUTTON("reset_password"),
    RESET_PASSWORD_MAGICLINK_BUTTON("magiclink_reset_password"),
    OPEN_EMAIL_APP_BUTTON("open_email_app"),
    MAGICLINK_SEND_REQUEST_BUTTON("magiclink_send_request"),
    SIGN_UP_NEXT_BUTTON("signup_next"),
    DISPLAY_NAME_SAVE_BUTTON("display_name_save"),
    ACCOUNT_ROW("account_row"),
    SMARTLOCK_NUDGE_OK("smartlock_nudge_ok"),
    GET_HELP_BUTTON("get_help"),
    TRY_AGAIN_BUTTON("try_again_button"),
    RESET_PASSWORD_REQUEST_BUTTON("reset_password_request"),
    SUPPORT_PAGE_BUTTON("reset_password_support_page"),
    RESET_PASSWORD_OPEN_MAIL_APP("reset_password_open_mail_app"),
    UPDATE_PASSWORD_BUTTON("set_password"),
    PHONE_NUMBER_SIGN_UP_BUTTON("phone_number_sign_up"),
    SHOW_CALLING_CODES_BUTTON("choose_calling_code"),
    REQUEST_OTP_BUTTON("request_otp"),
    RESEND_SMS_BUTTON("resend_sms"),
    EDIT_PHONE_NUMBER_BUTTON("edit_phone_number"),
    VALIDATE_OTP_BUTTON("validate_otp"),
    SMARTLOCK_EMAIL_HINT_BUTTON("smartlock_email_hint"),
    CONTINUE_WITH_EMAIL_BUTTON("continue_with_email"),
    RESEND_MAGIC_LINK("resend_magic_link"),
    MAGICLINK_ON_LOGGED_IN_DISMISSED("magiclink_on_logged_in_dismissed"),
    MAGICLINK_ON_LOGGED_IN_SET_PASSWORD("magiclink_on_logged_in_set_password"),
    SAMSUNG_EFFORTLESS_LOGIN_STARTED("samsung_effortless_login_started"),
    SAMSUNG_EFFORTLESS_LOGIN_DISMISSED("samsung_effortless_login_dismissed");
    
    public final String mType;

    private ClickIdentifier(String str) {
        this.mType = str;
    }
}
