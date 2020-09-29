package com.spotify.mobile.android.spotlets.collection.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistJacksonModel implements JacksonModel, vku {
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

    @JsonIgnore
    public int getAddTime() {
        return this.mAddTime;
    }

    @JsonIgnore
    public String getCollectionUri() {
        return this.mCollectionUri;
    }

    @JsonIgnore
    public Covers getCovers() {
        return this.mCovers;
    }

    @JsonIgnore
    public String getHeader() {
        return null;
    }

    public String getImageUri() {
        return getImageUri(Size.SMALL);
    }

    public String getImageUri(Size size) {
        CoversJacksonModel coversJacksonModel = this.mCovers;
        if (coversJacksonModel != null) {
            return coversJacksonModel.getImageUri(size);
        }
        String str = "";
        return "";
    }

    public vli getInferredOfflineState() {
        return vlj.a(this.mInferredOffline, this.mSyncProgress);
    }

    @JsonIgnore
    public vku getItem() {
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.mName;
    }

    @JsonIgnore
    public int getNumAlbumsInCollection() {
        return this.mNumAlbumsInCollection;
    }

    @JsonIgnore
    public int getNumTracksInCollection() {
        return this.mNumTracksInCollection;
    }

    public vli getOfflineState() {
        return vlj.a(this.mOffline, this.mSyncProgress);
    }

    public String getTargetUri() {
        return itc.a((vku) this);
    }

    public String getTitle() {
        return this.mName;
    }

    @JsonIgnore
    public String getUri() {
        return this.mUri;
    }

    public boolean isDismissed() {
        return this.mIsDismissed;
    }

    @JsonIgnore
    public boolean isFollowed() {
        return this.mIsFollowed;
    }

    @JsonIgnore
    public boolean isHeader() {
        return false;
    }

    @JsonIgnore
    public boolean isVariousArtists() {
        return this.mIsVariousArtist;
    }
}
