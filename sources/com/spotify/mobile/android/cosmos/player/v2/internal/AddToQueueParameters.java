package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddToQueueParameters implements JacksonModel {
    @JsonProperty("options")
    public final PlayOptions mPlayOptions;
    @JsonProperty("track")
    public final PlayerTrack track;

    public AddToQueueParameters(PlayerTrack playerTrack, boolean z) {
        this.track = playerTrack;
        this.mPlayOptions = new Builder().overrideRestrictions(z).build();
    }
}
