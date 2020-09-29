package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_SamsungLinkingRequest extends SamsungLinkingRequest {
    private final String accessToken;
    private final String apiServerUrl;
    private final String authServerUrl;

    AutoValue_SamsungLinkingRequest(String str, String str2, String str3) {
        this.accessToken = str;
        if (str2 != null) {
            this.authServerUrl = str2;
            if (str3 != null) {
                this.apiServerUrl = str3;
                return;
            }
            throw new NullPointerException("Null apiServerUrl");
        }
        throw new NullPointerException("Null authServerUrl");
    }

    @JsonProperty("access_token")
    public final String accessToken() {
        return this.accessToken;
    }

    @JsonProperty("api_server_url")
    public final String apiServerUrl() {
        return this.apiServerUrl;
    }

    @JsonProperty("auth_server_url")
    public final String authServerUrl() {
        return this.authServerUrl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SamsungLinkingRequest) {
            SamsungLinkingRequest samsungLinkingRequest = (SamsungLinkingRequest) obj;
            String str = this.accessToken;
            if (str != null ? str.equals(samsungLinkingRequest.accessToken()) : samsungLinkingRequest.accessToken() == null) {
                return this.authServerUrl.equals(samsungLinkingRequest.authServerUrl()) && this.apiServerUrl.equals(samsungLinkingRequest.apiServerUrl());
            }
        }
    }

    public final int hashCode() {
        String str = this.accessToken;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.authServerUrl.hashCode()) * 1000003) ^ this.apiServerUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SamsungLinkingRequest{accessToken=");
        sb.append(this.accessToken);
        sb.append(", authServerUrl=");
        sb.append(this.authServerUrl);
        sb.append(", apiServerUrl=");
        sb.append(this.apiServerUrl);
        sb.append("}");
        return sb.toString();
    }
}
