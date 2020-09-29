package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class ShowPolicy implements JacksonModel {

    public interface a {
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("policy")
    public abstract ShowDecorationPolicy listDecorationPolicy();

    public abstract a toBuilder();
}
