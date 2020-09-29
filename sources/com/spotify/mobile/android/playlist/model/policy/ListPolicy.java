package com.spotify.mobile.android.playlist.model.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

@JsonInclude(Include.NON_NULL)
@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListPolicy implements JacksonModel {
    @JsonProperty("addedBy")
    private Map<String, Boolean> mAddedByAttributes;
    @JsonProperty("album")
    private a mAlbumAttributes;
    @JsonProperty("artist")
    private Map<String, Boolean> mArtistAttributes;
    @JsonProperty("artists")
    private Map<String, Boolean> mArtistsAttributes;
    @JsonIgnore
    private Map<String, Boolean> mAttributes;
    @JsonProperty("show")
    private Map<String, Boolean> mShowAttributes;

    static class a {
        @JsonProperty("artist")
        Map<String, Boolean> a;
        Map<String, Boolean> b;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    @JsonAnyGetter
    public Map<String, Boolean> getMap() {
        return this.mAttributes;
    }

    public void setListAttributes(Map<String, Boolean> map) {
        this.mAttributes = map;
    }

    public void setAlbumArtistAttributes(Map<String, Boolean> map) {
        a aVar = this.mAlbumAttributes;
        if (aVar == null) {
            aVar = new a(0);
        }
        this.mAlbumAttributes = aVar;
        this.mAlbumAttributes.a = map;
    }

    public void setAlbumAttributes(Map<String, Boolean> map) {
        a aVar = this.mAlbumAttributes;
        if (aVar == null) {
            aVar = new a(0);
        }
        this.mAlbumAttributes = aVar;
        this.mAlbumAttributes.b = map;
    }

    public void setShowAttributes(Map<String, Boolean> map) {
        this.mShowAttributes = map;
    }

    public void setArtistsAttributes(Map<String, Boolean> map) {
        this.mArtistsAttributes = map;
    }

    public void setArtistAttributes(Map<String, Boolean> map) {
        this.mArtistAttributes = map;
    }

    public void setAddedByAttributes(Map<String, Boolean> map) {
        this.mAddedByAttributes = map;
    }
}
