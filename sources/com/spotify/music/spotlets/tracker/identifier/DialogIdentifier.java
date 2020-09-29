package com.spotify.music.spotlets.tracker.identifier;

import com.comscore.android.id.IdHelperAndroid;

public enum DialogIdentifier {
    EMAIL_ALREADY_EXIST("email_already_exist"),
    SIGNUP_TERMS("signup_terms"),
    SIGNUP_POLICY("signup_policy"),
    SIGNUP_LOGIN_ERROR("signup_login_error"),
    SIGNUP_TERMS_AND_POLICY("signup_terms_and_policy"),
    FACEBOOK_LOGIN_ERROR("facebook_login_error"),
    NO_NETWORK_ERROR("no_network_error"),
    NO_NETWORK_RETRY_ERROR("no_network_retry_error"),
    RESET_PASSWORD_GET_HELP("reset_password_get_help"),
    SMARTLOCK_NUDGE_POPUP("smartlock_nudge_popup"),
    PHONE_NUMBER_ERROR("phone_number_error"),
    PHONE_NUMBER_INVALID_NUMBER("phone_number_invalid_number"),
    PHONE_NUMBER_NO_NETWORK("phone_number_no_network"),
    PHONE_NUMBER_RESEND_TOO_EARLY("phone_number_resend_too_early"),
    PHONE_NUMBER_TIMEOUT("phone_nubmer_timeout"),
    PHONE_NUMBER_TOO_MANY_TRIES("phone_nubmer_too_many_tries"),
    PHONE_NUMBER_TRY_AGAIN_LATER("phone_nubmer_try_again_later"),
    MAGIC_LINK_REGION_MISMATCH("magic_link_region_mismatch"),
    MAGIC_LINK_TOKEN_EXPIRED("magic_link_token_expired"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE);
    
    public final String mType;

    private DialogIdentifier(String str) {
        this.mType = str;
    }
}
