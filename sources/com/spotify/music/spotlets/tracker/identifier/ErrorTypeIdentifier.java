package com.spotify.music.spotlets.tracker.identifier;

public enum ErrorTypeIdentifier {
    INVALID_USERNAME_OR_PASSWORD("invalid_username_or_password"),
    FACEBOOK_GENERIC("facebook_generic"),
    FACEBOOK_EMAIL_EXISTS("facebook_email_exists"),
    FACEBOOK_NOT_REGISTERED("facebook_not_registered"),
    REGION_MISSMATCH("region_missmatch"),
    GENERIC("generic"),
    MAGIC_LINK_LOGIN_FAILURE("magic_link_login_failure"),
    NOT_ALLOWED_CHARACTER("not_allowed_character"),
    EMAIL_ALREADY_EXIST("email_already_exist"),
    USERNAME_ALREADY_EXIST("username_already_exist"),
    TOO_SHORT_PASSWORD("too_short_password"),
    TOO_WEAK_PASSWORD("too_weak_password"),
    PASSWORD_TOKEN_EXPIRED("password_token_expired"),
    EMAIL_FORMAT_WRONG("email_format_wrong"),
    TOO_YOUNG_AGE("too_young_age"),
    TOO_OLD_AGE("too_old_age"),
    INVALID_COUNTRY("invalid_country"),
    NO_CONNECTION("no_connection"),
    RATE_LIMIT("rate_limit"),
    EMAIL_GENERIC("email_generic"),
    USERNAME_GENERIC("username_generic"),
    AGE_GENERIC("age_generic"),
    INVALID_FORM_DATA("invalid_form_data"),
    DISPLAY_NAME_FAILED_TO_SAVE("display_name_failed_to_save");
    
    public final String mType;

    private ErrorTypeIdentifier(String str) {
        this.mType = str;
    }
}
