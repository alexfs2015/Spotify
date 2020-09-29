package com.spotify.mobile.android.util;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;

public enum SpotifyError {
    SUCCESS(0, 0),
    DNS(4, R.string.error_connection),
    OUT_OF_DISK_SPACE(8, R.string.error_out_of_disk_space),
    OFFLINE_EXPIRED(14, R.string.error_offline_mode_expired),
    TOO_MANY_TRACKS(19, R.string.error_too_many_tracks),
    OFFLINE_LICENSE_SERVER_ERROR(21, R.string.error_ap),
    OFFLINE_LICENSE_LOST(22, R.string.error_offline_license_lost),
    OFFLINE_NOT_ALLOWED(23, R.string.error_offline_not_allowed),
    OFFLINE_SYNC_CONNECTION_DISABLED(36, R.string.error_offline_sync_connection_disabled),
    AP_SOCKET(101, R.string.error_connection),
    AP_PROTOCOL(102, R.string.error_connection),
    AP_UNKNOWN(103, R.string.error_ap),
    AP_NOT_AVAILABLE(104, R.string.error_ap),
    AP_CHANNEL(105, R.string.error_ap),
    AP_CHANNEL_TEMP(106, R.string.error_ap),
    AP_CHANNEL_UNKNOWN(107, R.string.error_ap),
    AP_CANT_RESOLVE_PROXY(108, R.string.error_ap),
    AP_NO_AUTHMETHOD(110, R.string.error_ap),
    AP_SIGNATURE(ContentType.SHORT_FORM_ON_DEMAND, R.string.error_ap),
    AP_SOCKET_RESET(ContentType.LONG_FORM_ON_DEMAND, R.string.error_ap),
    AP_SOCKET_TIMEOUT(ContentType.LIVE, R.string.error_ap),
    AP_PING_TIMEOUT(a.aB, R.string.error_ap),
    AP_ESTABLISH_TIMEOUT(a.aC, R.string.error_ap),
    AP_LOGIN_TIMEOUT(a.aD, R.string.error_ap),
    AP_TCPSOCKET_TIMEOUT(a.aE, R.string.error_ap),
    AP_BAD_INTERLEAVE_SIZE(a.aF, R.string.error_ap),
    AP_MISSING_SUBSTREAMSIZE(a.aG, R.string.error_ap),
    AP_BAD_SUBSTREAMSIZE(120, R.string.error_ap),
    AP_GOT_TOO_LITTLE_DATA(121, R.string.error_ap),
    AP_GOT_TOO_MUCH_DATA(122, R.string.error_ap),
    AP_BLOCK_IDX_MISMATCH(123, R.string.error_ap),
    AP_BLOCK_IDX_TOOLARGE(a.aL, R.string.error_ap),
    AP_BAD_MASK(125, R.string.error_ap),
    AP_NETWORK_DISABLED(126, R.string.error_ap),
    AP_PASSWORD_CHANGED(127, R.string.error_ap),
    LOGIN_USERPASS(401, R.string.error_login_bad_credentials),
    LOGIN_TOO_OLD(402, R.string.error_login_too_old),
    LOGIN_USER_DISABLED(403, R.string.error_login_user_disabled),
    LOGIN_TEMP_APERROR(404, R.string.error_ap),
    LOGIN_PROTOCOL(405, R.string.error_login_protocol),
    LOGIN_FORBIDDEN_SERVICE(406, R.string.error_login_forbidden_service),
    LOGIN_MISSING_USER_INFO(407, R.string.error_login_missing_user_info),
    LOGIN_REGION_MISMATCH(408, R.string.error_login_region_mismatch),
    LOGIN_NEEDS_PREMIUM(409, R.string.error_login_needs_premium),
    LOGIN_BAD_CREDENTIALS(410, R.string.error_login_bad_credentials),
    LOGIN_BAD_CONNECTION_ID(411, R.string.error_ap),
    LOGIN_INVALID_CREDENTIALS(412, R.string.error_ap),
    LOGIN_ACCOUNT_EXISTS(413, R.string.error_login_account_no_credentials),
    LOGIN_FACEBOOK_CREDENTIALS_DISALLOWED(417, R.string.error_login_facebook_credentials_disallowed),
    LOGIN_UNKNOWN_ERROR(418, R.string.error_login_unknown_error),
    UNKNOWN(-1, R.string.error_unknown_error);
    
    private static SpotifyError[] Z;
    public final int mCode;
    public final int mResourceId;

    static {
        Z = values();
    }

    private SpotifyError(int i, int i2) {
        this.mCode = i;
        this.mResourceId = i2;
    }

    public static SpotifyError a(int i) {
        SpotifyError[] spotifyErrorArr;
        for (SpotifyError spotifyError : Z) {
            if (spotifyError.mCode == i) {
                return spotifyError;
            }
        }
        String str = " isroHrnda rfeefeorot oc v einndo";
        StringBuilder sb = new StringBuilder("Have no definition for errorcode ");
        sb.append(i);
        Assertion.b(sb.toString());
        return UNKNOWN;
    }
}
