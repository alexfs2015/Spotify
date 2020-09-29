package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TopArtistsListModel implements JacksonModel {
    private final TopArtistModel[] mTopArtists;

    public TopArtistsListModel(@JsonProperty("artists") TopArtistModel[] topArtistModelArr) {
        this.mTopArtists = topArtistModelArr;
    }

    public TopArtistModel[] getTopArtists() {
        return this.mTopArtists;
    }
}
