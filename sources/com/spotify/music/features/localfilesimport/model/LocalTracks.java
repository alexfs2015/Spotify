package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalTracks implements JacksonModel, nxk<LocalItem> {
    @JsonProperty("rows")
    private final List<LocalTrackJacksonModel> mItems;
    @JsonProperty("unfilteredLength")
    private final int mUnfilteredLength;

    public LocalTracks(@JsonProperty("rows") List<LocalTrackJacksonModel> list, @JsonProperty("unfilteredLength") int i) {
        this.mItems = list;
        this.mUnfilteredLength = i;
    }

    public nxn[] getItems() {
        return (nxn[]) this.mItems.toArray(new nxn[0]);
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
