package com.spotify.music.features.quicksilver.messages.models;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

public abstract class NoteMessage implements Parcelable, JacksonModel {

    public static abstract class a {
    }

    @JsonProperty("click_actions")
    public abstract Map<String, QuicksilverClickAction> getClickActions();

    @JsonProperty("html_content")
    public abstract String getHtmlContent();

    @JsonProperty("id")
    public abstract String getId();

    @JsonProperty("impression_url")
    public abstract String getImpressionUrl();

    @JsonProperty("uuid")
    public abstract String getUuid();

    public abstract a toBuilder();

    @JsonCreator
    public static NoteMessage create(@JsonProperty("html_content") String str, @JsonProperty("click_actions") Map<String, QuicksilverClickAction> map, @JsonProperty("impression_url") String str2, @JsonProperty("id") String str3, @JsonProperty("uuid") String str4) {
        AutoValue_NoteMessage autoValue_NoteMessage = new AutoValue_NoteMessage(str, map, str2, str3, str4);
        return autoValue_NoteMessage;
    }

    public static a builder() {
        return new a();
    }
}
