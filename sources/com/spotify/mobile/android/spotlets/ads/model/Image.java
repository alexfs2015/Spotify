package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Image implements Parcelable, JacksonModel {

    public static final class a extends upv<Image> {
        public a() {
            super(AutoValue_Image.CREATOR);
        }
    }

    @JsonProperty("url")
    public abstract String getUrl();

    @JsonCreator
    public static Image create(@JsonProperty("url") String str) {
        return new AutoValue_Image(str);
    }
}
