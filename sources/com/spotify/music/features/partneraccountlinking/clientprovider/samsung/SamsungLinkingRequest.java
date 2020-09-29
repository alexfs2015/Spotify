package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class SamsungLinkingRequest implements JacksonModel {
    public static SamsungLinkingRequest create(String str, String str2, String str3) {
        return new AutoValue_SamsungLinkingRequest(str, str2, str3);
    }

    @JsonProperty("access_token")
    public abstract String accessToken();

    @JsonProperty("api_server_url")
    public abstract String apiServerUrl();

    @JsonProperty("auth_server_url")
    public abstract String authServerUrl();
}
