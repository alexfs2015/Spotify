package com.spotify.mobile.android.spotlets.collection.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumEntityJacksonModel implements JacksonModel, ios {
    @JsonProperty("album")
    private final AlbumJacksonModel mHeader;
    @JsonProperty("isLoading")
    private final boolean mIsLoading;
    @JsonProperty("items")
    private final TrackJacksonModel[] mItems;
    @JsonProperty("unfilteredLength")
    private final int mUnfilteredLength;
    @JsonProperty("unrangedLength")
    private final int mUnrangedLength;

    public AlbumEntityJacksonModel(@JsonProperty("album") AlbumJacksonModel albumJacksonModel, @JsonProperty("items") TrackJacksonModel[] trackJacksonModelArr, @JsonProperty("isLoading") boolean z, @JsonProperty("unfilteredLength") int i, @JsonProperty("unrangedLength") int i2) {
        this.mHeader = albumJacksonModel;
        this.mItems = trackJacksonModelArr;
        this.mIsLoading = z;
        this.mUnfilteredLength = i;
        this.mUnrangedLength = i2;
    }

    @JsonIgnore
    public uyq getHeader() {
        return this.mHeader;
    }

    @JsonIgnore
    public uzc[] getItems() {
        return this.mItems;
    }

    @JsonIgnore
    public boolean isLoading() {
        return this.mIsLoading;
    }

    @JsonIgnore
    public int getUnfilteredLength() {
        return this.mUnfilteredLength;
    }

    @JsonIgnore
    public int getUnrangedLength() {
        return this.mUnrangedLength;
    }
}
