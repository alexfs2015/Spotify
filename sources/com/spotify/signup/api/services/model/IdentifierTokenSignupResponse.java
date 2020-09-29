package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.dataenum.dataenum_case;
import com.spotify.signup.api.services.SignupErrorStatus;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentifierTokenSignupResponse {
    @JsonProperty("errors")
    @fjk(a = "errors")
    private Map<String, String> mErrors;
    @JsonProperty("login_token")
    @fjk(a = "login_token")
    private String mOneTimeToken;
    @JsonProperty("status")
    @fjk(a = "status")
    private int mStatus;
    @JsonProperty("username")
    @fjk(a = "username")
    private String mUserName;

    interface IdentifierTokenSignupStatus_dataenum {
        dataenum_case Error(SignupErrorStatus signupErrorStatus, Map<String, String> map);

        dataenum_case Ok(String str, String str2);

        dataenum_case Unknown();
    }

    public IdentifierTokenSignupStatus status() {
        int i = this.mStatus;
        if (i == 1) {
            return IdentifierTokenSignupStatus.ok(this.mUserName, this.mOneTimeToken);
        }
        SignupErrorStatus a = SignupErrorStatus.a(i);
        if (a == SignupErrorStatus.STATUS_UNKNOWN_ERROR) {
            return IdentifierTokenSignupStatus.unknown();
        }
        Map map = this.mErrors;
        if (map == null) {
            map = ImmutableMap.f();
        }
        return IdentifierTokenSignupStatus.error(a, map);
    }
}
