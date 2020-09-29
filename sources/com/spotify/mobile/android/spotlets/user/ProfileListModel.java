package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileListModel implements JacksonModel {
    private final ProfileModel[] mProfiles;

    public ProfileListModel(@JsonProperty("profiles") ProfileModel[] profileModelArr, @JsonProperty("most_played_artists") ProfileModel[] profileModelArr2, @JsonProperty("facebook_friends") ProfileModel[] profileModelArr3) {
        if (profileModelArr == null) {
            profileModelArr = profileModelArr2 != null ? profileModelArr2 : profileModelArr3;
        }
        this.mProfiles = profileModelArr;
    }

    public ProfileModel[] getProfiles() {
        return this.mProfiles;
    }
}
