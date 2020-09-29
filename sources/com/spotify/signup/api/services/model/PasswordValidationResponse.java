package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.dataenum.dataenum_case;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PasswordValidationResponse {
    @JsonProperty("errors")
    @fiq(a = "errors")
    private Map<String, String> mErrors;
    @JsonProperty("status")
    @fiq(a = "status")
    private int mStatus;

    interface PasswordValidation_dataenum {
        dataenum_case Error(int i, String str);

        dataenum_case Ok();
    }

    public PasswordValidation status() {
        int i = this.mStatus;
        if (i == 1) {
            return PasswordValidation.ok();
        }
        Map<String, String> map = this.mErrors;
        return PasswordValidation.error(i, map != null ? (String) map.get("password") : "");
    }
}
