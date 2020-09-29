package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public class SkipToTrackParameters implements JacksonModel {
    @JsonProperty("logging_params")
    public final LoggingParameters loggingParams = LoggingParameters.createWithCurrentTimestamp();
    @JsonProperty("options")
    public PlayOptions playOptions;
    @JsonProperty("track")
    public PlayerTrack track;
}
