package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalFilesMetadataChildModel implements JacksonModel {
    @JsonProperty("loaded")
    private final boolean mLoaded;
    @JsonProperty("length")
    private final int mNumTracks;

    public LocalFilesMetadataChildModel(@JsonProperty("length") int i, @JsonProperty("loaded") boolean z) {
        this.mNumTracks = i;
        this.mLoaded = z;
    }

    public int getNumTracks() {
        return this.mNumTracks;
    }

    public boolean isLoaded() {
        return this.mLoaded;
    }
}
