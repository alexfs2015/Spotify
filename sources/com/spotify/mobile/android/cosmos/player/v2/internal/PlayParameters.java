package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

public class PlayParameters implements JacksonModel {
    @JsonProperty("context")
    public PlayerContext context;
    @JsonProperty("logging_params")
    public final LoggingParameters loggingParams = LoggingParameters.createWithCurrentTimestamp();
    @JsonProperty("options")
    public PlayOptions options;
    @JsonProperty("play_origin")
    public PlayOrigin playOrigin;
}
