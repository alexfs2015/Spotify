package com.spotify.mobile.android.spotlets.user;

import android.net.Uri;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.follow.FollowManager.a;
import java.util.Arrays;
import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileModel implements JacksonModel {
    private final a mFollowData;
    private final String mFullName;
    private boolean mHasRecentShares;
    private final String mImageUrl;
    private final InvitationCodeModel[] mInvitationCodes;
    private final boolean mIsVerified;
    private final int mPlaylistCount;
    private final PlaylistModel[] mPlaylists;
    private final boolean mReportAbuseEnabled;
    private final TopArtistModel[] mTopArtists;
    private final Integer mTotalInvitationCodes;
    private final String mUri;
    private final String mUsername;

    public static ProfileModel create(ProfileV2VolatileModel profileV2VolatileModel, ProfileV2Model profileV2Model) {
        ProfileV2VolatileModel profileV2VolatileModel2 = profileV2VolatileModel;
        ProfileV2Model profileV2Model2 = profileV2Model;
        ProfileModel profileModel = r1;
        ProfileModel profileModel2 = new ProfileModel(profileV2VolatileModel2.uri, profileV2VolatileModel2.fullName, profileV2VolatileModel2.playlistCount, profileV2VolatileModel2.followersCount, profileV2VolatileModel2.followingCount, profileV2VolatileModel2.imageUrl, profileV2VolatileModel2.isFollowing, profileV2VolatileModel2.userUri, profileV2VolatileModel2.artistUri, profileV2VolatileModel2.isVerified, profileV2VolatileModel2.reportAbuseEnabled, profileV2Model2.playlists, profileV2Model2.topArtists, profileV2Model2.invitationCodes, profileV2Model2.totalInvitationCodes);
        ProfileModel profileModel3 = profileModel;
        profileModel3.setHasRecentShares(profileV2VolatileModel.hasRecentShares);
        return profileModel3;
    }

    private void setHasRecentShares(boolean z) {
        this.mHasRecentShares = z;
    }

    public ProfileModel(@JsonProperty("uri") String str, @JsonProperty("full_name") String str2, @JsonProperty("total_playlist_count") int i, @JsonProperty("followers_count") int i2, @JsonProperty("following_count") int i3, @JsonProperty("image_url") String str3, @JsonProperty("is_following") boolean z, @JsonProperty("user_uri") String str4, @JsonProperty("artist_uri") String str5, @JsonProperty("is_verified") boolean z2, @JsonProperty("report_abuse_enabled") boolean z3, @JsonProperty("playlists") PlaylistModel[] playlistModelArr, @JsonProperty("most_played_artists") TopArtistModel[] topArtistModelArr, @JsonProperty("invitation_codes") InvitationCodeModel[] invitationCodeModelArr, @JsonProperty("total_invitation_codes") Integer num) {
        String str6 = str;
        String str7 = str4;
        String str8 = str5;
        if (str6 != null) {
            this.mUri = str6;
        } else if (str8 != null) {
            this.mUri = str8;
        } else if (str7 != null) {
            this.mUri = str7;
        } else {
            Assertion.a("A ProfileModel must have a uri");
            this.mUri = null;
        }
        this.mUsername = Uri.decode(jdt.c(this.mUri));
        this.mFullName = str2;
        this.mPlaylistCount = i;
        this.mImageUrl = str3;
        a aVar = new a(this.mUri, i2, i3, z, false);
        this.mFollowData = aVar;
        this.mIsVerified = z2;
        this.mReportAbuseEnabled = z3;
        this.mPlaylists = playlistModelArr;
        this.mTopArtists = topArtistModelArr;
        this.mInvitationCodes = invitationCodeModelArr;
        this.mTotalInvitationCodes = num;
    }

    @JsonProperty("uri")
    public String getUri() {
        return this.mUri;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return this.mFullName;
    }

    @JsonIgnore
    public String getDisplayName() {
        return TextUtils.isEmpty(this.mFullName) ? this.mUsername : this.mFullName;
    }

    @JsonIgnore
    public String getUsername() {
        return this.mUsername;
    }

    @JsonProperty("total_playlist_count")
    public int getPlaylistCount() {
        return this.mPlaylistCount;
    }

    @JsonIgnore
    public a getFollowData() {
        return this.mFollowData;
    }

    @JsonProperty("followers_count")
    public int getFollowersCount() {
        return this.mFollowData.c;
    }

    @JsonProperty("following_count")
    public int getFollowingCount() {
        return this.mFollowData.b;
    }

    @JsonProperty("is_following")
    public boolean isFollowing() {
        return this.mFollowData.d;
    }

    @JsonProperty("image_url")
    public String getImageHttpUrl() {
        return this.mImageUrl;
    }

    @JsonProperty("playlists")
    public PlaylistModel[] getPlaylists() {
        return this.mPlaylists;
    }

    @JsonProperty("most_played_artists")
    public TopArtistModel[] getTopArtists() {
        return this.mTopArtists;
    }

    @JsonProperty("invitation_codes")
    public InvitationCodeModel[] getInvitationCodes() {
        return this.mInvitationCodes;
    }

    @JsonProperty("total_invitation_codes")
    public Integer getInvitationCodesCount() {
        return this.mTotalInvitationCodes;
    }

    @JsonProperty("is_verified")
    public boolean isVerified() {
        return this.mIsVerified;
    }

    @JsonProperty("report_abuse_enabled")
    public boolean reportAbuseEnabled() {
        return this.mReportAbuseEnabled;
    }

    @JsonIgnore
    public boolean hasMoreInvitationCodes() {
        Integer num = this.mTotalInvitationCodes;
        return (num == null || this.mInvitationCodes == null || num.intValue() <= this.mInvitationCodes.length) ? false : true;
    }

    @JsonIgnore
    public boolean hasRecentShares() {
        return this.mHasRecentShares;
    }

    public String toString() {
        return String.format(Locale.US, "uri: %s  username: %s  fullname: %s  playlistCount: %s, imageUrl: %s  followData: %s", new Object[]{this.mUri, this.mUsername, this.mFullName, Integer.valueOf(this.mPlaylistCount), this.mImageUrl, this.mFollowData});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileModel) {
            ProfileModel profileModel = (ProfileModel) obj;
            return faw.a(this.mUri, profileModel.getUri()) && faw.a(this.mUsername, profileModel.mUsername) && faw.a(this.mFullName, profileModel.mFullName) && faw.a(Integer.valueOf(this.mPlaylistCount), Integer.valueOf(profileModel.mPlaylistCount)) && faw.a(this.mImageUrl, profileModel.mImageUrl) && faw.a(this.mFollowData, profileModel.mFollowData) && Arrays.equals(this.mPlaylists, profileModel.mPlaylists) && Arrays.equals(this.mTopArtists, profileModel.mTopArtists) && Arrays.equals(this.mInvitationCodes, profileModel.mInvitationCodes) && faw.a(this.mTotalInvitationCodes, profileModel.mTotalInvitationCodes) && faw.a(Boolean.valueOf(this.mHasRecentShares), Boolean.valueOf(profileModel.mHasRecentShares)) && faw.a(Boolean.valueOf(this.mIsVerified), Boolean.valueOf(profileModel.mIsVerified)) && faw.a(Boolean.valueOf(this.mReportAbuseEnabled), Boolean.valueOf(profileModel.mReportAbuseEnabled));
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mUri, this.mUsername, this.mFullName, Integer.valueOf(this.mPlaylistCount), this.mImageUrl, this.mFollowData, Integer.valueOf(Arrays.hashCode(this.mPlaylists)), Integer.valueOf(Arrays.hashCode(this.mTopArtists)), Integer.valueOf(Arrays.hashCode(this.mInvitationCodes)), this.mTotalInvitationCodes, Boolean.valueOf(this.mHasRecentShares), Boolean.valueOf(this.mIsVerified), Boolean.valueOf(this.mReportAbuseEnabled)});
    }
}
