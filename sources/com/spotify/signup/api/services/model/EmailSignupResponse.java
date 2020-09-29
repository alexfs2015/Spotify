package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.dataenum.dataenum_case;
import com.spotify.signup.api.services.SignupErrorStatus;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailSignupResponse {
    @JsonProperty("errors")
    @fjk(a = "errors")
    private Map<String, String> mErrors;
    @JsonProperty("status")
    @fjk(a = "status")
    private int mStatus;
    @JsonProperty("username")
    @fjk(a = "username")
    private String mUserName;

    interface EmailSignupStatus_dataenum {
        dataenum_case Error(SignupErrorStatus signupErrorStatus, Map<String, String> map);

        dataenum_case Ok(String str);

        dataenum_case Unknown();
    }

    public EmailSignupStatus status() {
        int i = this.mStatus;
        if (i == 1) {
            return EmailSignupStatus.ok(this.mUserName);
        }
        SignupErrorStatus a = SignupErrorStatus.a(i);
        if (a == SignupErrorStatus.STATUS_UNKNOWN_ERROR) {
            return EmailSignupStatus.unknown();
        }
        Map map = this.mErrors;
        if (map == null) {
            map = ImmutableMap.f();
        }
        return EmailSignupStatus.error(a, map);
    }
}
