package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalAlbums implements JacksonModel, nrh<LocalItem> {
    @JsonProperty("rows")
    private final List<LocalAlbumJacksonModel> mItems;
    @JsonProperty("unfilteredLength")
    private final int mUnfilteredLength;

    public boolean isLoading() {
        return false;
    }

    public LocalAlbums(@JsonProperty("rows") List<LocalAlbumJacksonModel> list, @JsonProperty("unfilteredLength") int i) {
        this.mItems = list;
        this.mUnfilteredLength = i;
    }

    public nrf[] getItems() {
        return (nrf[]) this.mItems.toArray(new nrf[0]);
    }

    public int getUnfilteredLength() {
        return this.mUnfilteredLength;
    }

    public int getUnrangedLength() {
        return this.mItems.size();
    }
}
