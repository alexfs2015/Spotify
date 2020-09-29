package com.spotify.voiceassistant.models.v1;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

public class CosmosSearchResponse {
    @fiq(a = "context")
    public PlayerContext context;
    @fiq(a = "intent")
    public String intent;
    @fiq(a = "play_options")
    public PlayOptions play_options;
    @fiq(a = "play_origin")
    public PlayOrigin play_origin;
    @fiq(a = "result")
    public String result;
    @fiq(a = "view_uri")
    public String view_uri;
}
