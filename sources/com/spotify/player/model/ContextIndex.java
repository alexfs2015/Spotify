package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ContextIndex {
    public static ContextIndex create() {
        return create(0, 0);
    }

    @JsonCreator
    public static ContextIndex create(@JsonProperty("page") long j, @JsonProperty("track") long j2) {
        return new AutoValue_ContextIndex(j, j2);
    }

    @JsonProperty("page")
    public abstract long page();

    @JsonProperty("track")
    public abstract long track();
}
