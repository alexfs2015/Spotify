package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class DecorationPolicy implements JacksonModel {

    public interface a {
        a a(EpisodeDecorationPolicy episodeDecorationPolicy);

        DecorationPolicy a();
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("episode")
    public abstract EpisodeDecorationPolicy episodeDecorationPolicy();

    public abstract a toBuilder();
}
