package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerError implements JacksonModel {
    public static final String CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY = "playback_id";
    public static final String CONTEXT_PLAYER_ERROR_REASON_KEY = "reasons";
    public static final String CONTEXT_PLAYER_ERROR_TRACK_URI_KEY = "track_uri";
    public static final String ERROR_CATALOGUE_RESTRICTED = "video_catalogue_restricted";
    public static final String ERROR_COUNTRY_RESTRICTED = "video_country_restricted";
    public static final String ERROR_GEORESTRICTED = "video_georestricted";
    public static final String ERROR_IN_OFFLINE_MODE = "track_unavailable_offline";
    public static final String ERROR_MANIFEST_DELETED = "video_manifest_deleted";
    public static final String ERROR_PLAYBACK = "video_playback_error";
    public static final String ERROR_PLAYBACK_STUCK = "playback_stuck";
    public static final String ERROR_UNAVAILABLE = "video_unavailable";
    public static final String ERROR_UNSUPPORTED_CLIENT_VERSION = "video_unsupported_client_version";
    public static final String ERROR_UNSUPPORTED_PLATFORM_VERSION = "video_unsupported_platform_version";
    public final Map<String, String> data;
    public final String type;

    public PlayerError(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, str2);
        hashMap.put(CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY, str3);
        this.type = str;
        this.data = hashMap;
    }

    @JsonCreator
    public PlayerError(@JsonProperty("type") String str, @JsonProperty("data") Map<String, String> map) {
        this.type = str;
        this.data = map;
    }

    public static PlayerError fromVideoPlaybackError(BetamaxException betamaxException, String str, String str2) {
        String str3;
        switch (betamaxException.mErrorType) {
            case ERROR_GEORESTRICTED:
                String str4 = "risetobgcvdireoteed";
                str3 = ERROR_GEORESTRICTED;
                break;
            case ERROR_UNSUPPORTED_PLATFORM_VERSION:
                str3 = ERROR_UNSUPPORTED_PLATFORM_VERSION;
                break;
            case ERROR_UNSUPPORTED_CLIENT_VERSION:
                str3 = ERROR_UNSUPPORTED_CLIENT_VERSION;
                break;
            case ERROR_IN_OFFLINE_MODE:
                String str5 = "libvnbacanoaulfrakf_eteli";
                str3 = ERROR_IN_OFFLINE_MODE;
                break;
            case ERROR_MANIFEST_DELETED:
                str3 = ERROR_MANIFEST_DELETED;
                break;
            case ERROR_COUNTRY_RESTRICTED:
                String str6 = "oerior__onyeditusttevcdr";
                str3 = ERROR_COUNTRY_RESTRICTED;
                break;
            case ERROR_UNAVAILABLE:
                String str7 = "ilumlevanveiaobad";
                str3 = ERROR_UNAVAILABLE;
                break;
            case ERROR_CATALOGUE_RESTRICTED:
                str3 = ERROR_CATALOGUE_RESTRICTED;
                break;
            case ERROR_PLAYBACK_STUCK:
                String str8 = "baskkcsculay_t";
                str3 = ERROR_PLAYBACK_STUCK;
                break;
            default:
                str3 = ERROR_PLAYBACK;
                break;
        }
        return new PlayerError(str3, str, str2);
    }

    public static PlayerError fromVideoPlaybackError(BetamaxException betamaxException, kaa kaa) {
        String str = "bkv_yiitadalecnd_odp";
        return fromVideoPlaybackError(betamaxException, kbg.b(kaa), (String) kaa.e().get("endvideo_playback_id"));
    }
}
