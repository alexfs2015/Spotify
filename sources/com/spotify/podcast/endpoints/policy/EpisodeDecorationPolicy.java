package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class EpisodeDecorationPolicy implements JacksonModel {

    public interface a {
        a a(ImmutableMap<String, Boolean> immutableMap);

        a a(KeyValuePolicy keyValuePolicy);

        EpisodeDecorationPolicy a();
    }

    public static a builder() {
        return new a();
    }

    @JsonAnyGetter
    public abstract ImmutableMap<String, Boolean> episodeAttributes();

    @JsonProperty("show")
    public abstract KeyValuePolicy showDecorationPolicy();

    public abstract a toBuilder();
}
