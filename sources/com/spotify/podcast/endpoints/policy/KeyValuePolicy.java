package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class KeyValuePolicy implements JacksonModel {

    public interface a {
        a a(ImmutableMap<String, Boolean> immutableMap);

        KeyValuePolicy a();
    }

    public static a builder() {
        return new a();
    }

    @JsonAnyGetter
    public abstract ImmutableMap<String, Boolean> attributes();

    public abstract a toBuilder();
}
