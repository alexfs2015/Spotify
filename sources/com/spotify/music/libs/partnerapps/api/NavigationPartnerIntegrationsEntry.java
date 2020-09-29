package com.spotify.music.libs.partnerapps.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class NavigationPartnerIntegrationsEntry implements JacksonModel {
    NavigationPartnerIntegrationsEntry() {
    }

    @JsonCreator
    static NavigationPartnerIntegrationsEntry create(@JsonProperty("isConnected") boolean z, @JsonProperty("clientId") String str, @JsonProperty("partnerIntegrationId") String str2) {
        return new AutoValue_NavigationPartnerIntegrationsEntry(z, str, str2);
    }

    public abstract String clientId();

    public abstract boolean isConnected();

    public abstract String partnerIntegrationId();
}
