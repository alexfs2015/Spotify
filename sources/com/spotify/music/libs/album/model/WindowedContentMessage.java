package com.spotify.music.libs.album.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class WindowedContentMessage implements Parcelable, JacksonModel {
    public abstract String getBodyText();

    public abstract String getTitleText();

    @JsonCreator
    public static WindowedContentMessage create(@JsonProperty("title_text") String str, @JsonProperty("body_text") String str2) {
        return new AutoValue_WindowedContentMessage(str, str2);
    }
}
