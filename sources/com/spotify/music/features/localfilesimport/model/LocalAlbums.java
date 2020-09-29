package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalAlbums implements JacksonModel, nxk<LocalItem> {
    @JsonProperty("rows")
    private final List<LocalAlbumJacksonModel> mItems;
    @JsonProperty("unfilteredLength")
    private final int mUnfilteredLength;

    public LocalAlbums(@JsonProperty("rows") List<LocalAlbumJacksonModel> list, @JsonProperty("unfilteredLength") int i) {
        this.mItems = list;
        this.mUnfilteredLength = i;
    }

    public nxi[] getItems() {
        return (nxi[]) this.mItems.toArray(new nxi[0]);
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
