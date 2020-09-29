package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.dataenum.dataenum_case;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookSignupResponse {
    @JsonProperty("message")
    @fiq(a = "message")
    private String mMessage;
    @JsonProperty("status")
    @fiq(a = "status")
    private int mStatus;
    @JsonProperty("username")
    @fiq(a = "username")
    private String mUserName;

    interface FacebookSignupStatus_dataenum {
        dataenum_case Error(String str, int i);

        dataenum_case Ok(String str);
    }

    public FacebookSignupStatus status() {
        int i = this.mStatus;
        if (i == 1) {
            return FacebookSignupStatus.ok(this.mUserName);
        }
        return FacebookSignupStatus.error(this.mMessage, i);
    }
}
