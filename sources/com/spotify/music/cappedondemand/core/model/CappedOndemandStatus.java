package com.spotify.music.cappedondemand.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CappedOndemandStatus implements JacksonModel {
    @JsonCreator
    public static CappedOndemandStatus create(@JsonProperty("under_cap") boolean z, @JsonProperty("timestamp") long j, @JsonProperty("seconds_until_refill") long j2) {
        return new AutoValue_CappedOndemandStatus(z, j, Long.valueOf(j2));
    }

    public abstract Long countdownTillRefill();

    public abstract boolean ondemand();

    public abstract long timestamp();
}
