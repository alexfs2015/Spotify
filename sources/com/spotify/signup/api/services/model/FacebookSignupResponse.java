package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.dataenum.dataenum_case;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookSignupResponse {
    @JsonProperty("message")
    @fjk(a = "message")
    private String mMessage;
    @JsonProperty("status")
    @fjk(a = "status")
    private int mStatus;
    @JsonProperty("username")
    @fjk(a = "username")
    private String mUserName;

    interface FacebookSignupStatus_dataenum {
        dataenum_case Error(String str, int i);

        dataenum_case Ok(String str);
    }

    public FacebookSignupStatus status() {
        int i = this.mStatus;
        return i == 1 ? FacebookSignupStatus.ok(this.mUserName) : FacebookSignupStatus.error(this.mMessage, i);
    }
}
