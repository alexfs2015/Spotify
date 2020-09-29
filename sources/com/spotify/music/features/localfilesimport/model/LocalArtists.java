package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalArtists implements JacksonModel, nxk<LocalItem> {
    @JsonProperty("rows")
    private final List<LocalArtistJacksonModel> mItems;
    @JsonProperty("unfilteredLength")
    private final int mUnfilteredLength;

    public LocalArtists(@JsonProperty("rows") List<LocalArtistJacksonModel> list, @JsonProperty("unfilteredLength") int i) {
        this.mItems = list;
        this.mUnfilteredLength = i;
    }

    public nxj[] getItems() {
        return (nxj[]) this.mItems.toArray(new nxj[0]);
    }

    public int getUnfilteredLength() {
        return this.mUnfilteredLength;
    }

    public int getUnrangedLength() {
        return this.mItems.size();
    }

    public boolean isLoading() {
        return false;
    }
}
