package com.spotify.mobile.android.util.loader;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import java.util.Map;

public class PlayPayload implements JacksonModel {
    @JsonProperty("context_metadata")
    private final Map<String, String> mContextMetadata;
    @JsonProperty("logging_params")
    private final LoggingParameters mLoggingParameters = LoggingParameters.createWithCurrentTimestamp();
    @JsonProperty("prepare_play_options")
    private final PlayOptions mPlayOptions;
    @JsonProperty("play_origin")
    private final PlayOrigin mPlayOrigin;

    public PlayPayload(PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map) {
        this.mPlayOptions = playOptions;
        this.mPlayOrigin = playOrigin;
        this.mContextMetadata = map;
    }

    public Map<String, String> getContextMetadata() {
        return this.mContextMetadata;
    }

    public LoggingParameters getLoggingParameters() {
        return this.mLoggingParameters;
    }

    public PlayOptions getPlayOptions() {
        return this.mPlayOptions;
    }

    public PlayOrigin getPlayOrigin() {
        return this.mPlayOrigin;
    }
}
