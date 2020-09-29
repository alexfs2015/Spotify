package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class QueryParameter implements Parcelable, JacksonModel {
    @JsonCreator
    public static QueryParameter create(@JsonProperty("key") String str, @JsonProperty("value") String str2) {
        return new AutoValue_QueryParameter(str, str2);
    }

    @JsonProperty("key")
    public abstract String key();

    @JsonProperty("value")
    public abstract String value();
}
