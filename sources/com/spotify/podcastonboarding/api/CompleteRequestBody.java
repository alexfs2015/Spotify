package com.spotify.podcastonboarding.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CompleteRequestBody implements JacksonModel {
    @JsonCreator
    public static CompleteRequestBody create(vmw vmw) {
        return new AutoValue_CompleteRequestBody(vmw);
    }

    @JsonProperty("podcast")
    public abstract vmw podcast();
}
