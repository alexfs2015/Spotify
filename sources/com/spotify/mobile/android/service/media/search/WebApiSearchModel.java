package com.spotify.mobile.android.service.media.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public final class WebApiSearchModel {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Album implements JacksonModel {
        @JsonIgnore
        protected final List<Image> mImages;
        @JsonIgnore
        protected final String mName;
        @JsonIgnore
        protected final String mUri;

        @JsonCreator
        public Album(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("images") List<Image> list) {
            this.mUri = str;
            this.mName = str2;
            this.mImages = list;
        }

        @JsonIgnore
        public Image getImage() {
            return WebApiSearchModel.a(this.mImages);
        }

        @JsonGetter("images")
        public List<Image> getImages() {
            return this.mImages;
        }

        @JsonGetter("name")
        public String getName() {
            return this.mName;
        }

        @JsonGetter("uri")
        public String getUri() {
            return this.mUri;
        }

        public String toString() {
            return getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AlbumItem extends Album implements MediaBrowserItemConvertible {
        @JsonIgnore
        private final List<Artist> mArtists;

        @JsonCreator
        public AlbumItem(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("artists") List<Artist> list, @JsonProperty("images") List<Image> list2) {
            super(str, str2, list2);
            this.mArtists = list;
        }

        @JsonGetter("artists")
        public List<Artist> getArtists() {
            return this.mArtists;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Albums implements JacksonModel {
        /* access modifiers changed from: private */
        @JsonIgnore
        public final List<AlbumItem> mItems;

        @JsonCreator
        public Albums(@JsonProperty("items") List<AlbumItem> list) {
            this.mItems = list;
        }

        @JsonGetter("items")
        public List<AlbumItem> getItems() {
            return (List) fbp.a(this.mItems);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Artist implements JacksonModel {
        @JsonIgnore
        protected final String mName;
        @JsonIgnore
        protected final String mUri;

        @JsonCreator
        public Artist(@JsonProperty("uri") String str, @JsonProperty("name") String str2) {
            this.mUri = str;
            this.mName = str2;
        }

        @JsonGetter("name")
        public String getName() {
            return this.mName;
        }

        @JsonGetter("uri")
        public String getUri() {
            return this.mUri;
        }

        public String toString() {
            return getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistItem extends Artist implements MediaBrowserItemConvertible {
        @JsonIgnore
        private final List<Image> mImages;

        @JsonCreator
        public ArtistItem(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("images") List<Image> list) {
            super(str, str2);
            this.mImages = list;
        }

        @JsonIgnore
        public Image getImage() {
            return WebApiSearchModel.a(this.mImages);
        }

        @JsonGetter("images")
        public List<Image> getImages() {
            return this.mImages;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Artists implements JacksonModel {
        /* access modifiers changed from: private */
        @JsonIgnore
        public final List<ArtistItem> mItems;

        @JsonCreator
        public Artists(@JsonProperty("items") List<ArtistItem> list) {
            this.mItems = list;
        }

        @JsonGetter("items")
        public List<ArtistItem> getItems() {
            return (List) fbp.a(this.mItems);
        }
    }

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

        @JsonGetter("height")
        public int getHeight() {
            return this.mHeight;
        }

        @JsonGetter("url")
        public String getUrl() {
            return this.mUrl;
        }

        @JsonGetter("width")
        public int getWidth() {
            return this.mWidth;
        }
    }

    public interface MediaBrowserItemConvertible extends JacksonModel {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PlaylistItem implements MediaBrowserItemConvertible {
        @JsonIgnore
        private final List<Image> mImages;
        @JsonIgnore
        private final String mName;
        @JsonIgnore
        private final String mUri;

        @JsonCreator
        public PlaylistItem(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("images") List<Image> list) {
            this.mUri = str;
            this.mName = str2;
            this.mImages = list;
        }

        @JsonIgnore
        public Image getImage() {
            return WebApiSearchModel.a(this.mImages);
        }

        @JsonGetter("images")
        public List<Image> getImages() {
            return this.mImages;
        }

        @JsonGetter("name")
        public String getName() {
            return this.mName;
        }

        @JsonGetter("uri")
        public String getUri() {
            return this.mUri;
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
            return (List) fbp.a(this.mItems);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Response implements JacksonModel {
        @JsonIgnore
        private final Albums mAlbums;
        @JsonIgnore
        private final Artists mArtists;
        @JsonIgnore
        private final Playlists mPlaylists;
        @JsonIgnore
        private final Tracks mTracks;

        @JsonCreator
        public Response(@JsonProperty("albums") Albums albums, @JsonProperty("artists") Artists artists, @JsonProperty("playlists") Playlists playlists, @JsonProperty("tracks") Tracks tracks) {
            this.mAlbums = albums;
            this.mArtists = artists;
            this.mPlaylists = playlists;
            this.mTracks = tracks;
        }

        @JsonGetter("albums")
        public Albums getAlbums() {
            return (Albums) fbp.a(this.mAlbums);
        }

        @JsonGetter("artists")
        public Artists getArtists() {
            return (Artists) fbp.a(this.mArtists);
        }

        @JsonGetter("playlists")
        public Playlists getPlaylists() {
            return (Playlists) fbp.a(this.mPlaylists);
        }

        @JsonGetter("tracks")
        public Tracks getTracks() {
            return (Tracks) fbp.a(this.mTracks);
        }

        @JsonIgnore
        public boolean hasAlbums() {
            Albums albums = this.mAlbums;
            return (albums == null || albums.mItems == null || this.mAlbums.mItems.isEmpty()) ? false : true;
        }

        @JsonIgnore
        public boolean hasArtists() {
            Artists artists = this.mArtists;
            return (artists == null || artists.mItems == null || this.mArtists.mItems.isEmpty()) ? false : true;
        }

        @JsonIgnore
        public boolean hasPlaylists() {
            Playlists playlists = this.mPlaylists;
            return (playlists == null || playlists.mItems == null || this.mPlaylists.mItems.isEmpty()) ? false : true;
        }

        @JsonIgnore
        public boolean hasTracks() {
            Tracks tracks = this.mTracks;
            return (tracks == null || tracks.mItems == null || this.mTracks.mItems.isEmpty()) ? false : true;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TrackItem implements MediaBrowserItemConvertible {
        @JsonIgnore
        private final Album mAlbum;
        @JsonIgnore
        private final List<Artist> mArtists;
        @JsonIgnore
        private final String mName;
        @JsonIgnore
        private final String mUri;

        @JsonCreator
        public TrackItem(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("album") Album album, @JsonProperty("artists") List<Artist> list) {
            this.mUri = str;
            this.mName = str2;
            this.mAlbum = album;
            this.mArtists = list;
        }

        @JsonGetter("album")
        public Album getAlbum() {
            return this.mAlbum;
        }

        @JsonGetter("artists")
        public List<Artist> getArtists() {
            return this.mArtists;
        }

        @JsonGetter("name")
        public String getName() {
            return this.mName;
        }

        @JsonGetter("uri")
        public String getUri() {
            return this.mUri;
        }

        public String toString() {
            return getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Tracks implements JacksonModel {
        /* access modifiers changed from: private */
        @JsonIgnore
        public final List<TrackItem> mItems;

        @JsonCreator
        public Tracks(@JsonProperty("items") List<TrackItem> list) {
            this.mItems = list;
        }

        @JsonGetter("items")
        public List<TrackItem> getItems() {
            return (List) fbp.a(this.mItems);
        }
    }

    static /* synthetic */ Image a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Image) list.get(0);
    }
}
