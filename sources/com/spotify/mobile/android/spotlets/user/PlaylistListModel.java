package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistListModel implements JacksonModel {
    private final PlaylistModel[] mPlaylists;

    public PlaylistListModel(@JsonProperty("playlists") PlaylistModel[] playlistModelArr) {
        this.mPlaylists = playlistModelArr;
    }

    public PlaylistModel[] getPlaylists() {
        return this.mPlaylists;
    }
}
