package com.spotify.music.features.quicksilver.qa;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class QuicksilverAdminBannerMessage implements Parcelable, JacksonModel {
    @JsonProperty("active")
    public abstract boolean active();

    @JsonProperty("content")
    public abstract BannerMessage content();

    @JsonProperty("group_id")
    public abstract int groupId();

    @JsonProperty("id")
    public abstract String id();

    @JsonProperty("locale")
    public abstract String locales();

    @JsonProperty("template_id")
    public abstract int templateId();

    @JsonCreator
    public static QuicksilverAdminBannerMessage create(@JsonProperty("id") String str, @JsonProperty("active") boolean z, @JsonProperty("content") BannerMessage bannerMessage, @JsonProperty("group_id") int i, @JsonProperty("locale") String str2, @JsonProperty("template_id") int i2) {
        AutoValue_QuicksilverAdminBannerMessage autoValue_QuicksilverAdminBannerMessage = new AutoValue_QuicksilverAdminBannerMessage(str, z, bannerMessage, i, str2, i2);
        return autoValue_QuicksilverAdminBannerMessage;
    }
}
