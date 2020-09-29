package com.spotify.music.newplaying.scroll.widgets.pivots.datasource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PivotRecommendation implements JacksonModel {
    private final String mImageUri;
    private final String mSubtitle;
    private final String mTitle;
    private final String mUri;

    @JsonCreator
    public PivotRecommendation(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("subtitle") String str3, @JsonProperty("imageUri") String str4) {
        this.mTitle = str2;
        this.mSubtitle = str3;
        this.mUri = str;
        this.mImageUri = str4;
    }

    public String getImageUri() {
        return this.mImageUri;
    }

    public String getSubtitle() {
        return this.mSubtitle;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUri() {
        return this.mUri;
    }
}
