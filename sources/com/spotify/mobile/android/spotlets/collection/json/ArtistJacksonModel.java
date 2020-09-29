package com.spotify.mobile.android.spotlets.collection.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistJacksonModel implements JacksonModel, uyr {
    @JsonProperty("addTime")
    private final int mAddTime;
    @JsonProperty("collectionLink")
    private final String mCollectionUri;
    @JsonProperty("portraits")
    private final CoversJacksonModel mCovers;
    @JsonProperty("inferredOffline")
    private final String mInferredOffline;
    @JsonProperty("isBanned")
    private final boolean mIsDismissed;
    @JsonProperty("isFollowed")
    private final boolean mIsFollowed;
    @JsonProperty("isVariousArtists")
    private final boolean mIsVariousArtist;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("numAlbumsInCollection")
    private final int mNumAlbumsInCollection;
    @JsonProperty("numTracksInCollection")
    private final int mNumTracksInCollection;
    @JsonProperty("offline")
    private final String mOffline;
    @JsonProperty("syncProgress")
    private final int mSyncProgress;
    @JsonProperty("link")
    private final String mUri;

    @JsonIgnore
    public String getHeader() {
        return null;
    }

    @JsonIgnore
    public uyr getItem() {
        return this;
    }

    @JsonIgnore
    public boolean isHeader() {
        return false;
    }

    public ArtistJacksonModel(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("portraits") CoversJacksonModel coversJacksonModel, @JsonProperty("offline") String str4, @JsonProperty("inferredOffline") String str5, @JsonProperty("syncProgress") int i, @JsonProperty("numTracksInCollection") int i2, @JsonProperty("numAlbumsInCollection") int i3, @JsonProperty("isFollowed") boolean z, @JsonProperty("isBanned") boolean z2, @JsonProperty("isVariousArtists") boolean z3, @JsonProperty("addTime") int i4) {
        this.mUri = str;
        this.mCollectionUri = str2;
        this.mName = str3;
        this.mCovers = coversJacksonModel;
        this.mOffline = str4;
        this.mInferredOffline = str5;
        this.mSyncProgress = i;
        this.mNumTracksInCollection = i2;
        this.mNumAlbumsInCollection = i3;
        this.mIsFollowed = z;
        this.mIsDismissed = z2;
        this.mIsVariousArtist = z3;
        this.mAddTime = i4;
    }

    public String getTitle() {
        return this.mName;
    }

    public String getTargetUri() {
        return iqp.a((uyr) this);
    }

    @JsonIgnore
    public String getUri() {
        return this.mUri;
    }

    public String getImageUri() {
        return getImageUri(Size.SMALL);
    }

    public String getImageUri(Size size) {
        CoversJacksonModel coversJacksonModel = this.mCovers;
        return coversJacksonModel != null ? coversJacksonModel.getImageUri(size) : "";
    }

    @JsonIgnore
    public String getCollectionUri() {
        return this.mCollectionUri;
    }

    @JsonIgnore
    public String getName() {
        return this.mName;
    }

    @JsonIgnore
    public Covers getCovers() {
        return this.mCovers;
    }

    public uzf getOfflineState() {
        return uzg.a(this.mOffline, this.mSyncProgress);
    }

    public uzf getInferredOfflineState() {
        return uzg.a(this.mInferredOffline, this.mSyncProgress);
    }

    @JsonIgnore
    public int getNumTracksInCollection() {
        return this.mNumTracksInCollection;
    }

    @JsonIgnore
    public int getNumAlbumsInCollection() {
        return this.mNumAlbumsInCollection;
    }

    @JsonIgnore
    public boolean isFollowed() {
        return this.mIsFollowed;
    }

    public boolean isDismissed() {
        return this.mIsDismissed;
    }

    @JsonIgnore
    public boolean isVariousArtists() {
        return this.mIsVariousArtist;
    }

    @JsonIgnore
    public int getAddTime() {
        return this.mAddTime;
    }
}
