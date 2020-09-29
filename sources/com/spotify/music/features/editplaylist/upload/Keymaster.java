package com.spotify.music.features.editplaylist.upload;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Keymaster implements JacksonModel {
    @JsonCreator
    public static Keymaster create(@JsonProperty("accessToken") String str, @JsonProperty("expiresIn") int i) {
        return new AutoValue_Keymaster(str, i);
    }

    @JsonProperty("expiresIn")
    public abstract int expiresIn();

    @JsonProperty("accessToken")
    public abstract String token();
}
