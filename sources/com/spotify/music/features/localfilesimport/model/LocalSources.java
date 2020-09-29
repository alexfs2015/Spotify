package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalSources implements JacksonModel, nxk<LocalItem> {
    @JsonProperty("rows")
    private final List<LocalSourceJacksonModel> mItems;

    public LocalSources(@JsonProperty("rows") List<LocalSourceJacksonModel> list) {
        this.mItems = list;
    }

    public nxl[] getItems() {
        return (nxl[]) this.mItems.toArray(new nxl[0]);
    }

    public int getUnfilteredLength() {
        return this.mItems.size();
    }

    public int getUnrangedLength() {
        return this.mItems.size();
    }

    public boolean isLoading() {
        return false;
    }
}
