package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileV2Model implements JacksonModel {
    public final InvitationCodeModel[] invitationCodes;
    public final PlaylistModel[] playlists;
    public final TopArtistModel[] topArtists;
    public final Integer totalInvitationCodes;

    public ProfileV2Model(@JsonProperty("playlists") PlaylistModel[] playlistModelArr, @JsonProperty("most_played_artists") TopArtistModel[] topArtistModelArr, @JsonProperty("invitation_codes") InvitationCodeModel[] invitationCodeModelArr, @JsonProperty("total_invitation_codes") Integer num) {
        this.playlists = playlistModelArr;
        this.topArtists = topArtistModelArr;
        this.invitationCodes = invitationCodeModelArr;
        this.totalInvitationCodes = num;
    }
}
