package com.spotify.music.newplaying.scroll.widgets.pivots.datasource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PivotRecommendations implements JacksonModel {
    private final List<PivotRecommendation> mPivots;

    @JsonCreator
    public PivotRecommendations(@JsonProperty("recommendations") List<PivotRecommendation> list) {
        this.mPivots = list;
    }

    public List<PivotRecommendation> getPivots() {
        return this.mPivots;
    }
}
