package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackWithPlayOrigin implements JacksonModel {
    @JsonProperty("context_uri")
    public String entityURI;
    @JsonProperty("play_origin")
    public PlayOrigin playOrigin;
    @JsonProperty("playback_id")
    public String playbackId;
    @JsonProperty("track")
    public PlayerTrack track;

    public TrackWithPlayOrigin() {
    }

    public TrackWithPlayOrigin(PlayerTrack playerTrack, String str) {
        this.track = playerTrack;
        this.playbackId = str;
    }

    @JsonCreator
    public TrackWithPlayOrigin(@JsonProperty("track") PlayerTrack playerTrack, @JsonProperty("play_origin") PlayOrigin playOrigin2, @JsonProperty("playback_id") String str, @JsonProperty("context_uri") String str2) {
        this.track = playerTrack;
        this.playOrigin = playOrigin2;
        this.playbackId = str;
        this.entityURI = str2;
    }
}
