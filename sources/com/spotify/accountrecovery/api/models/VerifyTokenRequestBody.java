package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class VerifyTokenRequestBody implements JacksonModel {
    @JsonGetter("oneTimeToken")
    public abstract String oneTimeToken();

    @JsonCreator
    public static VerifyTokenRequestBody create(@JsonProperty("oneTimeToken") String str) {
        return new AutoValue_VerifyTokenRequestBody(str);
    }
}
