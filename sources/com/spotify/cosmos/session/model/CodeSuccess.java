package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class CodeSuccess implements LoginResponseBody {
    @JsonCreator
    public static CodeSuccess create(@JsonProperty("identifier_token") String str) {
        return new AutoValue_CodeSuccess(str);
    }

    public abstract String identifierToken();
}
