package com.spotify.mobile.android.service.media.browser.loaders.browse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpaceItemWrapper implements JacksonModel {
    @JsonProperty("genre")
    public SpaceGenre genre;
    @JsonProperty("playlist")
    public SpacePlaylist playlist;
    @JsonProperty("release")
    public SpaceNewRelease release;
}