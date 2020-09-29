package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PlayerOptions implements Parcelable, JacksonModel {
    @JsonCreator
    public static PlayerOptions create(@JsonProperty("shuffling_context") boolean z, @JsonProperty("repeating_context") boolean z2, @JsonProperty("repeating_track") boolean z3) {
        return new AutoValue_PlayerOptions(z, z2, z3);
    }

    @JsonProperty("repeating_context")
    public abstract boolean repeatingContext();

    @JsonProperty("repeating_track")
    public abstract boolean repeatingTrack();

    @JsonProperty("shuffling_context")
    public abstract boolean shufflingContext();
}
