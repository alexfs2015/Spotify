package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class MagicLinkRequestBody implements JacksonModel {
    public static final String TEMPLATE_EMAIL = "login-autosend";

    @JsonCreator
    public static MagicLinkRequestBody create(@JsonProperty("emailOrUsername") String str) {
        return new AutoValue_MagicLinkRequestBody(str, "");
    }

    @JsonCreator
    public static MagicLinkRequestBody create(@JsonProperty("emailOrUsername") String str, @JsonProperty("template") String str2) {
        return new AutoValue_MagicLinkRequestBody(str, str2);
    }

    @JsonGetter("emailOrUsername")
    public abstract String emailOrUsername();

    @JsonGetter("template")
    @JsonInclude(Include.NON_EMPTY)
    public abstract String template();
}
