package com.spotify.music.features.quicksilver.messages.models;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Locale;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class QuicksilverCardMessage implements Parcelable, JacksonModel {

    public interface a {
    }

    @JsonProperty("click_actions")
    public abstract Map<String, QuicksilverClickAction> getClickActions();

    @JsonProperty("close_title")
    public abstract String getCloseTitle();

    @JsonProperty("heading")
    public abstract String getHeading();

    @JsonProperty("html_content")
    public abstract String getHtmlContent();

    @JsonProperty("icon")
    public abstract String getIcon();

    @JsonProperty("id")
    public abstract String getId();

    @JsonProperty("impression_url")
    public abstract String getImpressionUrl();

    @JsonProperty("uuid")
    public abstract String getUuid();

    @JsonProperty("fullscreen")
    public abstract boolean isFullscreen();

    public abstract a toBuilder();

    @JsonCreator
    public static QuicksilverCardMessage create(@JsonProperty("heading") String str, @JsonProperty("html_content") String str2, @JsonProperty("click_actions") Map<String, QuicksilverClickAction> map, @JsonProperty("icon") String str3, @JsonProperty("impression_url") String str4, @JsonProperty("close_title") String str5, @JsonProperty("id") String str6, @JsonProperty("uuid") String str7, @JsonProperty("fullscreen") boolean z) {
        String str8 = str;
        String str9 = str5;
        if (str8 != null) {
            str8 = str.toUpperCase(Locale.getDefault());
        }
        AutoValue_QuicksilverCardMessage autoValue_QuicksilverCardMessage = new AutoValue_QuicksilverCardMessage(str8, str2, map, str3, str4, str9 != null ? str9.toUpperCase(Locale.getDefault()) : str9, str6, str7, z);
        return autoValue_QuicksilverCardMessage;
    }

    public static a builder() {
        return new a();
    }
}
