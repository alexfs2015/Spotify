package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvitationCodeListModel implements JacksonModel {
    private final InvitationCodeModel[] mInvitationCodes;

    public InvitationCodeListModel(@JsonProperty("invitation_codes") InvitationCodeModel[] invitationCodeModelArr) {
        this.mInvitationCodes = invitationCodeModelArr;
    }

    @JsonProperty("invitation_codes")
    public InvitationCodeModel[] getInvitationCodes() {
        return this.mInvitationCodes;
    }
}
