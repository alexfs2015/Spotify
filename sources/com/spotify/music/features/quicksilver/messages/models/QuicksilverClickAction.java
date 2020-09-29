package com.spotify.music.features.quicksilver.messages.models;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class QuicksilverClickAction implements Parcelable, JacksonModel {
    public static final String ADD_TO_PLAYLIST = "ADD_TO_PLAYLIST";
    public static final String BAN_ENTITY = "BAN_ENTITY";
    public static final String CALLBACK = "CALLBACK";
    public static final String CREATE_PLAYLIST = "CREATE_PLAYLIST";
    public static final String DISMISS = "DISMISS";
    public static final String EXTERNAL = "EXTERNAL_URL";
    public static final String IAP = "IAP";
    public static final String SAVE_ENTITY = "SAVE_ENTITY";
    public static final String START_PLAYBACK = "START_PLAYBACK";
    public static final String TRIAL = "TRIAL";
    public static final String URL = "URL";

    public interface a {
    }

    @JsonProperty("action")
    public abstract String getButtonType();

    @JsonProperty("should_dismiss")
    public abstract Boolean getShouldDismiss();

    @JsonProperty("tracking_url")
    public abstract String getTrackingUrl();

    @JsonProperty("url")
    public abstract String getUrl();

    public abstract a toBuilder();

    @JsonCreator
    public static QuicksilverClickAction create(@JsonProperty("action") String str, @JsonProperty("url") String str2, @JsonProperty("tracking_url") String str3, @JsonProperty("should_dismiss") Boolean bool) {
        if (bool == null) {
            bool = Boolean.valueOf(!EXTERNAL.equals(str));
        }
        return new AutoValue_QuicksilverClickAction(str, str2, str3, bool);
    }

    public static a builder() {
        a aVar = new a();
        Boolean bool = Boolean.TRUE;
        if (bool != null) {
            aVar.a = bool;
            return aVar;
        }
        throw new NullPointerException("Null shouldDismiss");
    }
}
