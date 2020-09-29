package com.spotify.mobile.android.spotlets.collection.json;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumJacksonModel implements JacksonModel, vkt {
    @JsonProperty("addTime")
    private final int mAddTime;
    @JsonProperty("artist")
    private final ArtistJacksonModel mArtist;
    @JsonProperty("collectionLink")
    private final String mCollectionUri;
    @JsonProperty("copyrights")
    private final String[] mCopyrights;
    @JsonProperty("covers")
    private final CoversJacksonModel mCovers;
    @JsonProperty("inferredOffline")
    private final String mInferredOffline;
    @JsonProperty("playability")
    private final boolean mIsAnyTrackPlayable;
    @JsonProperty("complete")
    private final boolean mIsSavedToCollection;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("numDiscs")
    private final int mNumDiscs;
    @JsonProperty("numTracks")
    private final int mNumTracks;
    @JsonProperty("numTracksInCollection")
    private final int mNumTracksInCollection;
    @JsonProperty("offline")
    private final String mOffline;
    @JsonProperty("syncProgress")
    private final int mSyncProgress;
    @JsonProperty("link")
    private final String mUri;
    @JsonProperty("year")
    private final int mYear;

    public AlbumJacksonModel(@JsonProperty("link") String str, @JsonProperty("collectionLink") String str2, @JsonProperty("name") String str3, @JsonProperty("copyrights") String[] strArr, @JsonProperty("artist") ArtistJacksonModel artistJacksonModel, @JsonProperty("covers") CoversJacksonModel coversJacksonModel, @JsonProperty("offline") String str4, @JsonProperty("inferredOffline") String str5, @JsonProperty("syncProgress") int i, @JsonProperty("year") int i2, @JsonProperty("numDiscs") int i3, @JsonProperty("numTracks") int i4, @JsonProperty("numTracksInCollection") int i5, @JsonProperty("playability") boolean z, @JsonProperty("complete") boolean z2, @JsonProperty("addTime") int i6) {
        this.mUri = str;
        this.mCollectionUri = str2;
        this.mName = str3;
        this.mCopyrights = strArr;
        this.mArtist = artistJacksonModel;
        this.mCovers = coversJacksonModel;
        this.mOffline = str4;
        this.mInferredOffline = str5;
        this.mSyncProgress = i;
        this.mYear = i2;
        this.mNumDiscs = i3;
        this.mNumTracks = i4;
        this.mNumTracksInCollection = i5;
        this.mIsAnyTrackPlayable = z;
        this.mIsSavedToCollection = z2;
        this.mAddTime = i6;
    }

    @JsonIgnore
    public int getAddTime() {
        return this.mAddTime;
    }

    @JsonIgnore
    public vku getArtist() {
        return this.mArtist;
    }

    @JsonIgnore
    public ImmutableList<vku> getArtists() {
        vku artist = getArtist();
        return artist == null ? ImmutableList.d() : ImmutableList.a(artist);
    }

    @JsonIgnore
    public String getCollectionUri() {
        return this.mCollectionUri;
    }

    @JsonIgnore
    public String getCopyright() {
        String str = "n/";
        return TextUtils.join("\n", this.mCopyrights);
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
    public vkt getItem() {
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.mName;
    }

    @JsonIgnore
    public int getNumDiscs() {
        return this.mNumDiscs;
    }

    @JsonIgnore
    public int getNumTracks() {
        return this.mNumTracks;
    }

    @JsonIgnore
    public int getNumTracksInCollection() {
        return this.mNumTracksInCollection;
    }

    public vli getOfflineState() {
        return vlj.a(this.mOffline, this.mSyncProgress);
    }

    public String getTargetUri() {
        return itc.a((vkt) this);
    }

    public String getTitle() {
        return this.mName;
    }

    @JsonIgnore
    public String getUri() {
        return this.mUri;
    }

    @JsonIgnore
    public int getYear() {
        return this.mYear;
    }

    @JsonIgnore
    public boolean isAnyTrackPlayable() {
        return this.mIsAnyTrackPlayable;
    }

    @JsonIgnore
    public boolean isHeader() {
        return false;
    }

    @JsonIgnore
    public boolean isSavedToCollection() {
        return this.mIsSavedToCollection;
    }
}
