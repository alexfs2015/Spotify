package com.spotify.mobile.android.spotlets.collection.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoversJacksonModel implements JacksonModel, Covers {
    @JsonProperty("large")
    private final String mLargeUri;
    @JsonProperty("small")
    private final String mSmallUri;
    @JsonProperty("default")
    private final String mUri;
    @JsonProperty("xlarge")
    private final String mXlargeUri;

    public CoversJacksonModel(@JsonProperty("default") String str, @JsonProperty("small") String str2, @JsonProperty("large") String str3, @JsonProperty("xlarge") String str4) {
        this.mUri = str;
        this.mSmallUri = str2;
        this.mLargeUri = str3;
        this.mXlargeUri = str4;
    }

    @JsonIgnore
    public String getUri() {
        return this.mUri;
    }

    @JsonIgnore
    public String getSmallUri() {
        return this.mSmallUri;
    }

    @JsonIgnore
    public String getLargeUri() {
        return this.mLargeUri;
    }

    @JsonIgnore
    public String getXlargeUri() {
        return this.mXlargeUri;
    }

    @JsonIgnore
    public String getImageUri(Size size) {
        return uze.a(this, size);
    }
}
