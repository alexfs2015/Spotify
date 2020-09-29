package com.spotify.music.genie.omakasse;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OmakaseRequest implements Parcelable, JacksonModel {
    @JsonCreator
    public static OmakaseRequest create(@JsonProperty("doNotAllowPullContext") boolean z, @JsonProperty("numberOfResults") int i) {
        return new AutoValue_OmakaseRequest(z, i);
    }

    @JsonProperty("numberOfResults")
    public abstract int getNumberOfResults();

    @JsonProperty("doNotAllowPullContext")
    public abstract boolean isDoNotAllowPullRequest();
}
