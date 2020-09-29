package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class Podcast implements Parcelable, JacksonModel {
    @JsonProperty("imageUrl")
    public abstract String imageUrl();

    @JsonProperty("name")
    public abstract String name();

    @JsonProperty("rank")
    public abstract String rank();

    @JsonCreator
    public static Podcast create(@JsonProperty("name") String str, @JsonProperty("rank") String str2, @JsonProperty("imageUrl") String str3) {
        return new AutoValue_Podcast(str, str2, str3);
    }
}
