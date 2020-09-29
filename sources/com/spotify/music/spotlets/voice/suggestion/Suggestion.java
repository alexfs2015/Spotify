package com.spotify.music.spotlets.voice.suggestion;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Suggestion implements JacksonModel {
    public abstract String suggestion();

    Suggestion() {
    }

    @JsonCreator
    public static Suggestion create(@JsonProperty("suggestion") String str) {
        return new AutoValue_Suggestion(str);
    }
}
