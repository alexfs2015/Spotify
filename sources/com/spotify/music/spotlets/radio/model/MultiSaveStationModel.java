package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class MultiSaveStationModel implements JacksonModel {
    @JsonProperty
    public abstract List<String> seedUris();

    @JsonCreator
    public static MultiSaveStationModel create(String[] strArr) {
        return new AutoValue_MultiSaveStationModel(Arrays.asList((Object[]) fay.a(strArr)));
    }
}
