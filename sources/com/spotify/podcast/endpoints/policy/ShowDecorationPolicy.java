package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class ShowDecorationPolicy implements JacksonModel {

    public interface a {
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("sections")
    public abstract KeyValuePolicy auxiliarySectionsPolicy();

    @JsonProperty("list")
    public abstract EpisodeDecorationPolicy episodeDecorationPolicy();

    @JsonProperty("header")
    public abstract KeyValuePolicy headerPolicy();

    public abstract a toBuilder();
}
