package com.spotify.music.features.quicksilver.messages.models;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

public abstract class BannerMessage implements Parcelable, JacksonModel {

    public static abstract class a {
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static BannerMessage create(@JsonProperty("html_content") String str, @JsonProperty("click_actions") Map<String, QuicksilverClickAction> map, @JsonProperty("impression_url") String str2, @JsonProperty("id") String str3, @JsonProperty("uuid") String str4) {
        AutoValue_BannerMessage autoValue_BannerMessage = new AutoValue_BannerMessage(str, map, str2, str3, str4);
        return autoValue_BannerMessage;
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
}
