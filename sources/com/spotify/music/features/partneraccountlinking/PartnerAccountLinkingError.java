package com.spotify.music.features.partneraccountlinking;

public abstract class PartnerAccountLinkingError {

    public enum ErrorType {
        ERROR_SPOTIFY_LOGIN("error_spotify_login_unsuccessful"),
        ERROR_NO_PARTNER_ACCOUNT_APP("error_no_partner_account_app"),
        ERROR_CLIENT_LOGIN("error_client_login_unsuccessful"),
        ERROR_USER_CANCELLED("error_user_cancelled"),
        ERROR_CAN_NOT_CONNECT("error_can_not_connect"),
        ERROR_DOING_ACCOUNT_LINKING("error_linking_accounts"),
        ERROR_INTERNAL("error_internal"),
        ERROR_USER_LOGGED_OUT("error_user_logged_out");
        
        public final String mValue;

        private ErrorType(String str) {
            this.mValue = str;
        }
    }

    public static PartnerAccountLinkingError a(ErrorType errorType, String str) {
        return new ofo(errorType, str);
    }

    public abstract ErrorType a();

    public abstract String b();
}
