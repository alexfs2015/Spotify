package com.spotify.music.features.trackcredits.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Source implements JacksonModel {
    @JsonCreator
    public static Source create(@JsonProperty("label") String str, @JsonProperty("value") String str2) {
        return new AutoValue_Source(str, str2);
    }

    public abstract String label();

    public abstract String value();
}
