package com.spotify.music.lyrics.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LyricsColorsModel implements JacksonModel {
    private svm mColors;
    private TrackLyrics mTrackLyrics;

    @JsonCreator
    public LyricsColorsModel(@JsonProperty("lyrics") TrackLyrics trackLyrics, @JsonProperty("colors") svm svm) {
        this.mTrackLyrics = trackLyrics;
        this.mColors = svm;
    }

    public svm getColors() {
        return this.mColors;
    }

    public TrackLyrics getTrackLyrics() {
        return this.mTrackLyrics;
    }

    public void setColors(svm svm) {
        this.mColors = svm;
    }

    public void setTrackLyrics(TrackLyrics trackLyrics) {
        this.mTrackLyrics = trackLyrics;
    }
}
