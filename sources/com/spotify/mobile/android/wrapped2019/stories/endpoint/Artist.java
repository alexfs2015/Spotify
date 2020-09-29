package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class Artist implements Parcelable, JacksonModel {
    @JsonProperty("imageUrl")
    public abstract String imageUrl();

    @JsonProperty("name")
    public abstract String name();

    @JsonCreator
    public static Artist create(@JsonProperty("name") String str, @JsonProperty("imageUrl") String str2) {
        return new AutoValue_Artist(str, str2);
    }
}
