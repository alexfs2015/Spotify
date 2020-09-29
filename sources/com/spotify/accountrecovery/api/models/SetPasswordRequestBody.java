package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SetPasswordRequestBody implements JacksonModel {
    @JsonCreator
    public static SetPasswordRequestBody create(@JsonProperty("password") String str, @JsonProperty("oneTimeToken") String str2) {
        return new AutoValue_SetPasswordRequestBody(str, str2);
    }

    @JsonGetter("oneTimeToken")
    public abstract String oneTimeToken();

    @JsonGetter("password")
    public abstract String password();
}
