package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Album implements Parcelable, JacksonModel {
    @JsonProperty("artistName")
    public abstract String getArtistName();

    @JsonProperty("imageUri")
    public abstract String getImageUri();

    @JsonProperty("name")
    public abstract String getName();

    @JsonProperty("uri")
    public abstract String getUri();

    @JsonCreator
    public static Album create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("imageUri") String str3, @JsonProperty("artistName") String str4) {
        return new AutoValue_Album(str, str2, str3, str4);
    }
}
