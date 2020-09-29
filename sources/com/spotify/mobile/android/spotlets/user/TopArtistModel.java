package com.spotify.mobile.android.spotlets.user;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TopArtistModel implements Parcelable, JacksonModel {
    @JsonCreator
    public static TopArtistModel create(@JsonProperty("name") String str, @JsonProperty("image_url") String str2, @JsonProperty("uri") String str3, @JsonProperty("followers_count") int i) {
        return new AutoValue_TopArtistModel(str, str2, str3, i);
    }

    @JsonProperty("followers_count")
    public abstract int followersCount();

    @JsonProperty("image_url")
    public abstract String imageUrl();

    @JsonProperty("name")
    public abstract String name();

    @JsonProperty("uri")
    public abstract String uri();
}
