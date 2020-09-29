package com.spotify.mobile.android.spotlets.bixbyhomecards.apis;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import java.util.List;

public final class RecommendedPlaylists {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Image implements JacksonModel {
        @JsonIgnore
        private final int mHeight;
        @JsonIgnore
        private final String mUrl;
        @JsonIgnore
        private final int mWidth;

        @JsonCreator
        public Image(@JsonProperty("url") String str, @JsonProperty("height") int i, @JsonProperty("width") int i2) {
            this.mUrl = str;
            this.mHeight = i;
            this.mWidth = i2;
        }

        @JsonGetter("url")
        public String getUrl() {
            return this.mUrl;
        }

        @JsonGetter("height")
        public int getHeight() {
            return this.mHeight;
        }

        @JsonGetter("width")
        public int getWidth() {
            return this.mWidth;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Owner implements JacksonModel {
        @JsonIgnore
        private final String mDisplayName;

        @JsonCreator
        public Owner(@JsonProperty("display_name") String str) {
            this.mDisplayName = str;
        }

        @JsonGetter("display_name")
        public String getDisplayName() {
            return this.mDisplayName;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PlaylistItem implements JacksonModel {
        @JsonIgnore
        private final List<Image> mImages;
        @JsonIgnore
        private final String mName;
        @JsonIgnore
        private final Owner mOwner;
        @JsonIgnore
        private final String mUri;

        @JsonCreator
        public PlaylistItem(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("owner") Owner owner, @JsonProperty("images") List<Image> list) {
            this.mUri = str;
            this.mName = str2;
            this.mOwner = owner;
            this.mImages = list;
        }

        @JsonGetter("uri")
        public String getUri() {
            return this.mUri;
        }

        @JsonGetter("name")
        public String getName() {
            return this.mName;
        }

        @JsonGetter("owner")
        public Owner getOwner() {
            return this.mOwner;
        }

        @JsonGetter("images")
        public List<Image> getImages() {
            return this.mImages;
        }

        @JsonIgnore
        public Image getImage() {
            List<Image> list = this.mImages;
            if (list == null || list.isEmpty()) {
                return null;
            }
            return (Image) list.get(0);
        }

        public String toString() {
            return getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Playlists implements JacksonModel {
        /* access modifiers changed from: private */
        @JsonIgnore
        public final List<PlaylistItem> mItems;

        @JsonCreator
        public Playlists(@JsonProperty("items") List<PlaylistItem> list) {
            this.mItems = list;
        }

        @JsonGetter("items")
        public List<PlaylistItem> getItems() {
            Assertion.a((Object) this.mItems);
            return this.mItems;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Response implements JacksonModel {
        @JsonIgnore
        private final Playlists mPlaylists;

        @JsonCreator
        public Response(@JsonProperty("playlists") Playlists playlists) {
            this.mPlaylists = playlists;
        }

        @JsonGetter("playlists")
        public Playlists getPlaylists() {
            Assertion.a((Object) this.mPlaylists);
            return this.mPlaylists;
        }

        @JsonIgnore
        public boolean hasPlaylists() {
            Playlists playlists = this.mPlaylists;
            return (playlists == null || playlists.mItems == null || this.mPlaylists.mItems.isEmpty()) ? false : true;
        }
    }
}
