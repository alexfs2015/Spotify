package com.spotify.mobile.android.spotlets.user;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistModel implements JacksonModel {
    private final String mCuratorName;
    private final String mCuratorUri;
    private final int mFollowersCount;
    private final String mImageUrl;
    private final String mName;
    private final String mUri;

    public PlaylistModel(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("followers_count") int i, @JsonProperty("image_url") String str3, @JsonProperty("curator_uri") String str4, @JsonProperty("curator_name") String str5) {
        this.mUri = str;
        this.mName = str2;
        this.mFollowersCount = i;
        this.mImageUrl = str3;
        this.mCuratorUri = str4;
        this.mCuratorName = str5;
    }

    @JsonProperty("uri")
    public String getUri() {
        return this.mUri;
    }

    @JsonProperty("name")
    public String getName() {
        return this.mName;
    }

    @JsonProperty("followers_count")
    public int getFollowersCount() {
        return this.mFollowersCount;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return this.mImageUrl;
    }

    @JsonProperty("curator_name")
    public String getCuratorName() {
        return this.mCuratorName;
    }

    @JsonProperty("curator_uri")
    public String getCuratorUri() {
        return this.mCuratorUri;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaylistModel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlaylistModel playlistModel = (PlaylistModel) obj;
        return TextUtils.equals(this.mUri, playlistModel.mUri) && TextUtils.equals(this.mName, playlistModel.mName) && this.mFollowersCount == playlistModel.mFollowersCount && TextUtils.equals(this.mImageUrl, playlistModel.mImageUrl) && TextUtils.equals(this.mCuratorUri, playlistModel.mCuratorUri) && TextUtils.equals(this.mCuratorName, playlistModel.mCuratorName);
    }

    public int hashCode() {
        String str = this.mUri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mName;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mFollowersCount) * 31;
        String str3 = this.mImageUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.mCuratorUri;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mCuratorName;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
