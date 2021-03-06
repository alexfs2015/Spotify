package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BootstrapRequired implements LoginResponseBody {
    public abstract String accessToken();

    @JsonCreator
    public static BootstrapRequired create(@JsonProperty("accessToken") String str) {
        return new AutoValue_BootstrapRequired(str);
    }
}
