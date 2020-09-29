package com.spotify.music.lyrics.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProviderAndroidIntent implements Parcelable, JacksonModel {
    public abstract String getAction();

    public abstract String getContentType();

    public abstract String getData();

    public abstract String getProviderAndroidPackage();

    @JsonCreator
    public static ProviderAndroidIntent create(@JsonProperty("providerAndroidAppId") String str, @JsonProperty("action") String str2, @JsonProperty("data") String str3, @JsonProperty("contentType") String str4) {
        return new AutoValue_ProviderAndroidIntent(str, str2, str3, str4);
    }
}
