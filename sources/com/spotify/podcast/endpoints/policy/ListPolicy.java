package com.spotify.podcast.endpoints.policy;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class ListPolicy implements Parcelable, JacksonModel {

    public interface a {
    }

    @JsonProperty("episode")
    public abstract ImmutableMap<String, Boolean> attributes();

    @JsonProperty("show")
    public abstract ImmutableMap<String, Boolean> showAttributes();

    public abstract a toBuilder();

    public static a builder() {
        return new a();
    }
}
