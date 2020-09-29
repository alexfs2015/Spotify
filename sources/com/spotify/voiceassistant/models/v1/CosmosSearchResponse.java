package com.spotify.voiceassistant.models.v1;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

public class CosmosSearchResponse {
    @fjk(a = "context")
    public PlayerContext context;
    @fjk(a = "intent")
    public String intent;
    @fjk(a = "play_options")
    public PlayOptions play_options;
    @fjk(a = "play_origin")
    public PlayOrigin play_origin;
    @fjk(a = "result")
    public String result;
    @fjk(a = "view_uri")
    public String view_uri;
}
