package com.spotify.music.features.partneraccountlinking.clientprovider;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_PartnerAccountLinkingRequest extends PartnerAccountLinkingRequest {
    private final String accessToken;
    private final String apiServerUrl;
    private final String authServerUrl;
    private final String backendUrl;

    AutoValue_PartnerAccountLinkingRequest(String str, String str2, String str3, String str4) {
        this.accessToken = str;
        if (str2 != null) {
            this.authServerUrl = str2;
            if (str3 != null) {
                this.apiServerUrl = str3;
                if (str4 != null) {
                    this.backendUrl = str4;
                    return;
                }
                throw new NullPointerException("Null backendUrl");
            }
            throw new NullPointerException("Null apiServerUrl");
        }
        throw new NullPointerException("Null authServerUrl");
    }

    @JsonProperty("access_token")
    public final String accessToken() {
        return this.accessToken;
    }

    @JsonProperty("auth_server_url")
    public final String authServerUrl() {
        return this.authServerUrl;
    }

    @JsonProperty("api_server_url")
    public final String apiServerUrl() {
        return this.apiServerUrl;
    }

    public final String backendUrl() {
        return this.backendUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerAccountLinkingRequest{accessToken=");
        sb.append(this.accessToken);
        sb.append(", authServerUrl=");
        sb.append(this.authServerUrl);
        sb.append(", apiServerUrl=");
        sb.append(this.apiServerUrl);
        sb.append(", backendUrl=");
        sb.append(this.backendUrl);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PartnerAccountLinkingRequest) {
            PartnerAccountLinkingRequest partnerAccountLinkingRequest = (PartnerAccountLinkingRequest) obj;
            String str = this.accessToken;
            if (str != null ? str.equals(partnerAccountLinkingRequest.accessToken()) : partnerAccountLinkingRequest.accessToken() == null) {
                return this.authServerUrl.equals(partnerAccountLinkingRequest.authServerUrl()) && this.apiServerUrl.equals(partnerAccountLinkingRequest.apiServerUrl()) && this.backendUrl.equals(partnerAccountLinkingRequest.backendUrl());
            }
        }
    }

    public final int hashCode() {
        String str = this.accessToken;
        return (((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.authServerUrl.hashCode()) * 1000003) ^ this.apiServerUrl.hashCode()) * 1000003) ^ this.backendUrl.hashCode();
    }
}
