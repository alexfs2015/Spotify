package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Set;

@JsonDeserialize(using = TracksAndResources_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TracksAndResources implements JacksonModel {
    private final Set<String> mTrackUris;

    @JsonCreator
    public TracksAndResources(@JsonProperty("trackUris") String[] strArr) {
        this((Set<String>) ImmutableSet.a((E[]) strArr));
    }

    public TracksAndResources(Set<String> set) {
        this.mTrackUris = set;
    }

    public Set<String> getTrackUris() {
        return this.mTrackUris;
    }

    public boolean containsTrack(String str) {
        return this.mTrackUris.contains(str);
    }
}
