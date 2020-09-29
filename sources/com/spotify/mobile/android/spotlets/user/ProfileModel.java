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
        this.mUsername = Uri.decode(jgi.c(this.mUri));
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

    public static ProfileModel create(ProfileV2VolatileModel profileV2VolatileModel, ProfileV2Model profileV2Model) {
        ProfileV2VolatileModel profileV2VolatileModel2 = profileV2VolatileModel;
        ProfileV2VolatileModel profileV2VolatileModel3 = profileV2VolatileModel;
        ProfileV2Model profileV2Model2 = profileV2Model;
        ProfileV2Model profileV2Model3 = profileV2Model;
        String str = profileV2VolatileModel3.uri;
        String str2 = profileV2VolatileModel3.fullName;
        int i = profileV2VolatileModel3.playlistCount;
        int i2 = profileV2VolatileModel3.followersCount;
        int i3 = profileV2VolatileModel3.followingCount;
        String str3 = profileV2VolatileModel3.imageUrl;
        boolean z = profileV2VolatileModel3.isFollowing;
        String str4 = profileV2VolatileModel3.userUri;
        String str5 = profileV2VolatileModel3.artistUri;
        boolean z2 = profileV2VolatileModel3.isVerified;
        boolean z3 = profileV2VolatileModel3.reportAbuseEnabled;
        PlaylistModel[] playlistModelArr = profileV2Model3.playlists;
        TopArtistModel[] topArtistModelArr = profileV2Model3.topArtists;
        InvitationCodeModel[] invitationCodeModelArr = profileV2Model3.invitationCodes;
        Integer num = profileV2Model3.totalInvitationCodes;
        Integer num2 = num;
        Integer num3 = num;
        ProfileModel profileModel = r1;
        ProfileModel profileModel2 = r1;
        InvitationCodeModel[] invitationCodeModelArr2 = invitationCodeModelArr;
        ProfileModel profileModel3 = new ProfileModel(str, str2, i, i2, i3, str3, z, str4, str5, z2, z3, playlistModelArr, topArtistModelArr, invitationCodeModelArr, num3);
        ProfileModel profileModel4 = profileModel2;
        ProfileModel profileModel5 = profileModel2;
        profileModel5.setHasRecentShares(profileV2VolatileModel.hasRecentShares);
        return profileModel5;
    }

    private void setHasRecentShares(boolean z) {
        this.mHasRecentShares = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileModel) {
            ProfileModel profileModel = (ProfileModel) obj;
            if (fbn.a(this.mUri, profileModel.getUri()) && fbn.a(this.mUsername, profileModel.mUsername) && fbn.a(this.mFullName, profileModel.mFullName) && fbn.a(Integer.valueOf(this.mPlaylistCount), Integer.valueOf(profileModel.mPlaylistCount)) && fbn.a(this.mImageUrl, profileModel.mImageUrl) && fbn.a(this.mFollowData, profileModel.mFollowData) && Arrays.equals(this.mPlaylists, profileModel.mPlaylists) && Arrays.equals(this.mTopArtists, profileModel.mTopArtists) && Arrays.equals(this.mInvitationCodes, profileModel.mInvitationCodes) && fbn.a(this.mTotalInvitationCodes, profileModel.mTotalInvitationCodes) && fbn.a(Boolean.valueOf(this.mHasRecentShares), Boolean.valueOf(profileModel.mHasRecentShares)) && fbn.a(Boolean.valueOf(this.mIsVerified), Boolean.valueOf(profileModel.mIsVerified)) && fbn.a(Boolean.valueOf(this.mReportAbuseEnabled), Boolean.valueOf(profileModel.mReportAbuseEnabled))) {
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    public String getDisplayName() {
        return TextUtils.isEmpty(this.mFullName) ? this.mUsername : this.mFullName;
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

    @JsonProperty("full_name")
    public String getFullName() {
        return this.mFullName;
    }

    @JsonProperty("image_url")
    public String getImageHttpUrl() {
        return this.mImageUrl;
    }

    @JsonProperty("invitation_codes")
    public InvitationCodeModel[] getInvitationCodes() {
        return this.mInvitationCodes;
    }

    @JsonProperty("total_invitation_codes")
    public Integer getInvitationCodesCount() {
        return this.mTotalInvitationCodes;
    }

    @JsonProperty("total_playlist_count")
    public int getPlaylistCount() {
        return this.mPlaylistCount;
    }

    @JsonProperty("playlists")
    public PlaylistModel[] getPlaylists() {
        return this.mPlaylists;
    }

    @JsonProperty("most_played_artists")
    public TopArtistModel[] getTopArtists() {
        return this.mTopArtists;
    }

    @JsonProperty("uri")
    public String getUri() {
        return this.mUri;
    }

    @JsonIgnore
    public String getUsername() {
        return this.mUsername;
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

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mUri, this.mUsername, this.mFullName, Integer.valueOf(this.mPlaylistCount), this.mImageUrl, this.mFollowData, Integer.valueOf(Arrays.hashCode(this.mPlaylists)), Integer.valueOf(Arrays.hashCode(this.mTopArtists)), Integer.valueOf(Arrays.hashCode(this.mInvitationCodes)), this.mTotalInvitationCodes, Boolean.valueOf(this.mHasRecentShares), Boolean.valueOf(this.mIsVerified), Boolean.valueOf(this.mReportAbuseEnabled)});
    }

    @JsonProperty("is_following")
    public boolean isFollowing() {
        return this.mFollowData.d;
    }

    @JsonProperty("is_verified")
    public boolean isVerified() {
        return this.mIsVerified;
    }

    @JsonProperty("report_abuse_enabled")
    public boolean reportAbuseEnabled() {
        return this.mReportAbuseEnabled;
    }

    public String toString() {
        boolean z = true | true;
        String str = " ssfemou%epg ll Cts %:  :Uwsaa:u  %aaluls:ar rrsltDm%un   ,s%o:lnnmoait s:feey s l%i";
        return String.format(Locale.US, "uri: %s  username: %s  fullname: %s  playlistCount: %s, imageUrl: %s  followData: %s", new Object[]{this.mUri, this.mUsername, this.mFullName, Integer.valueOf(this.mPlaylistCount), this.mImageUrl, this.mFollowData});
    }
}
