package com.spotify.music.spotlets.radio.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ClusterUrisModel implements Parcelable, JacksonModel {
    @JsonCreator
    public static ClusterUrisModel create(String[] strArr) {
        return new AutoValue_ClusterUrisModel(Collections.unmodifiableList(Arrays.asList((Object[]) fbp.a(strArr))));
    }

    @JsonProperty
    public abstract List<String> clusterUris();
}
