package com.spotify.podcastonboarding.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CompleteRequestBody implements JacksonModel {
    @JsonProperty("podcast")
    public abstract vai podcast();

    @JsonCreator
    public static CompleteRequestBody create(vai vai) {
        return new AutoValue_CompleteRequestBody(vai);
    }
}
