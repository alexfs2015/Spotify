package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AdState implements Parcelable, JacksonModel {
    @JsonProperty("state")
    public abstract State getState();

    @JsonCreator
    public static AdState create(@JsonProperty("state") State state) {
        return new AutoValue_AdState(state);
    }
}
