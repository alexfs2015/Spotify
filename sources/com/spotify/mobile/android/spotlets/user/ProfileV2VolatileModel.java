package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileV2VolatileModel implements JacksonModel {
    public final String artistUri;
    public final int followersCount;
    public final int followingCount;
    public final String fullName;
    public final boolean hasRecentShares;
    public final String imageUrl;
    public final boolean isFollowing;
    public final boolean isVerified;
    public final int playlistCount;
    public final boolean reportAbuseEnabled;
    public final String uri;
    public final String userUri;

    public ProfileV2VolatileModel(@JsonProperty("uri") String str, @JsonProperty("full_name") String str2, @JsonProperty("total_playlist_count") int i, @JsonProperty("followers_count") int i2, @JsonProperty("following_count") int i3, @JsonProperty("image_url") String str3, @JsonProperty("is_following") boolean z, @JsonProperty("user_uri") String str4, @JsonProperty("artist_uri") String str5, @JsonProperty("has_recent_shares") boolean z2, @JsonProperty("is_verified") boolean z3, @JsonProperty("report_abuse_enabled") boolean z4) {
        this.uri = str;
        this.fullName = str2;
        this.playlistCount = i;
        this.imageUrl = str3;
        this.followersCount = Math.max(0, i2);
        this.followingCount = Math.max(0, i3);
        this.isFollowing = z;
        this.userUri = str4;
        this.artistUri = str5;
        this.hasRecentShares = z2;
        this.isVerified = z3;
        this.reportAbuseEnabled = z4;
    }
}
