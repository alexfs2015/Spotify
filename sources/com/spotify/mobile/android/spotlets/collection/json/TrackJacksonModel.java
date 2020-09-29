package com.spotify.mobile.android.spotlets.collection.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers.Size;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackJacksonModel implements JacksonModel, uzc {
    @JsonProperty("addTime")
    private final int mAddTime;
    @JsonProperty("album")
    private final AlbumJacksonModel mAlbum;
    @JsonProperty("artists")
    private final List<ArtistJacksonModel> mArtists;
    @JsonProperty("canAddToCollection")
    private final boolean mCanAddToCollection;
    @JsonProperty("canBan")
    private final boolean mCanBan;
    @JsonProperty("header")
    private final String mHeader;
    @JsonProperty("inCollection")
    private final boolean mInCollection;
    @JsonProperty("isAvailableInMetadataCatalogue")
    private final boolean mIsAvailableInMetadataCatalogue;
    @JsonProperty("isBanned")
    private final boolean mIsBanned;
    @JsonProperty("isCurrentlyPlayable")
    private final boolean mIsCurrentlyPlayable;
    @JsonProperty("isExplicit")
    private final boolean mIsExplicit;
    @JsonProperty("isLocal")
    private final boolean mIsLocal;
    @JsonProperty("length")
    private final int mLength;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("offline")
    private final String mOffline;
    @JsonProperty("previewId")
    private final String mPreviewId;
    @JsonProperty("link")
    private final String mUri;

    @JsonIgnore
    public uzd getAddedBy() {
        return null;
    }

    @JsonIgnore
    public uzc getItem() {
        return this;
    }

    public boolean hasLyrics() {
        return false;
    }

    public boolean is19plus() {
        return false;
    }

    public String playableTrackUri() {
        return null;
    }

    public TrackJacksonModel(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("header") String str3, @JsonProperty("offline") String str4, @JsonProperty("previewId") String str5, @JsonProperty("album") AlbumJacksonModel albumJacksonModel, @JsonProperty("artists") List<ArtistJacksonModel> list, @JsonProperty("isCurrentlyPlayable") boolean z, @JsonProperty("isAvailableInMetadataCatalogue") boolean z2, @JsonProperty("isExplicit") boolean z3, @JsonProperty("isLocal") boolean z4, @JsonProperty("inCollection") boolean z5, @JsonProperty("canAddToCollection") boolean z6, @JsonProperty("isBanned") boolean z7, @JsonProperty("canBan") boolean z8, @JsonProperty("addTime") int i, @JsonProperty("length") int i2) {
        this.mUri = str;
        this.mName = str2;
        this.mHeader = str3;
        this.mAlbum = albumJacksonModel;
        this.mArtists = list;
        this.mIsCurrentlyPlayable = z;
        this.mIsAvailableInMetadataCatalogue = z2;
        this.mIsExplicit = z3;
        this.mIsLocal = z4;
        this.mInCollection = z5;
        this.mCanAddToCollection = z6;
        this.mIsBanned = z7;
        this.mCanBan = z8;
        this.mOffline = str4;
        this.mPreviewId = str5;
        this.mAddTime = i;
        this.mLength = i2;
    }

    public String getTitle() {
        return this.mName;
    }

    public String getTargetUri() {
        return getUri();
    }

    @JsonIgnore
    public String getUri() {
        return this.mUri;
    }

    public String getImageUri() {
        return this.mAlbum.getImageUri(Size.SMALL);
    }

    public String getImageUri(Size size) {
        AlbumJacksonModel albumJacksonModel = this.mAlbum;
        return albumJacksonModel != null ? albumJacksonModel.getImageUri(size) : "";
    }

    @JsonIgnore
    public String getName() {
        return this.mName;
    }

    @JsonIgnore
    public uyq getAlbum() {
        return this.mAlbum;
    }

    @JsonIgnore
    public List<uyr> getArtists() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mArtists);
        return arrayList;
    }

    @JsonIgnore
    public boolean inCollection() {
        return this.mInCollection;
    }

    public boolean canAddToCollection() {
        return this.mCanAddToCollection;
    }

    public boolean isBanned() {
        return this.mIsBanned;
    }

    public boolean canBan() {
        return this.mCanBan;
    }

    @JsonIgnore
    public boolean isCurrentlyPlayable() {
        return this.mIsCurrentlyPlayable;
    }

    @JsonIgnore
    public boolean isAvailableInMetadataCatalogue() {
        return this.mIsAvailableInMetadataCatalogue;
    }

    @JsonIgnore
    public boolean isExplicit() {
        return this.mIsExplicit;
    }

    public boolean isLocal() {
        return this.mIsLocal;
    }

    public boolean isPremiumOnly() {
        throw new UnsupportedOperationException("isPremiumOnly() not implemented!!!");
    }

    public uzf getOfflineState() {
        return uzg.a(this.mOffline, 0);
    }

    @JsonIgnore
    public int getAddTime() {
        return this.mAddTime;
    }

    public String previewId() {
        return this.mPreviewId;
    }

    public int getLength() {
        return this.mLength;
    }

    @JsonIgnore
    public boolean isHeader() {
        return fax.a(this.mHeader);
    }

    @JsonIgnore
    public String getHeader() {
        return this.mHeader;
    }
}
