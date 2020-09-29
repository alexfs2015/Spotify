package com.spotify.music.features.partneraccountlinking.clientprovider;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class PartnerAccountLinkingRequest implements JacksonModel {
    @JsonProperty("access_token")
    public abstract String accessToken();

    @JsonProperty("api_server_url")
    public abstract String apiServerUrl();

    @JsonProperty("auth_server_url")
    public abstract String authServerUrl();

    public abstract String backendUrl();

    public static PartnerAccountLinkingRequest create(String str, String str2, String str3, String str4) {
        return new AutoValue_PartnerAccountLinkingRequest(str, str2, str3, str4);
    }
}
