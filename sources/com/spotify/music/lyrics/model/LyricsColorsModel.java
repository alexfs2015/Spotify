package com.spotify.music.lyrics.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LyricsColorsModel implements JacksonModel {
    private slf mColors;
    private TrackLyrics mTrackLyrics;

    @JsonCreator
    public LyricsColorsModel(@JsonProperty("lyrics") TrackLyrics trackLyrics, @JsonProperty("colors") slf slf) {
        this.mTrackLyrics = trackLyrics;
        this.mColors = slf;
    }

    public TrackLyrics getTrackLyrics() {
        return this.mTrackLyrics;
    }

    public void setTrackLyrics(TrackLyrics trackLyrics) {
        this.mTrackLyrics = trackLyrics;
    }

    public slf getColors() {
        return this.mColors;
    }

    public void setColors(slf slf) {
        this.mColors = slf;
    }
}
