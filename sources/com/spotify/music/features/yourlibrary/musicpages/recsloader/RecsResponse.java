package com.spotify.music.features.yourlibrary.musicpages.recsloader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecsResponse implements JacksonModel {
    @JsonProperty("recommended_tracks")
    public abstract List<RecsTrack> recommendedTracks();

    @JsonCreator
    public static RecsResponse create(@JsonProperty("recommended_tracks") List<RecsTrack> list) {
        return new AutoValue_RecsResponse(list);
    }
}
