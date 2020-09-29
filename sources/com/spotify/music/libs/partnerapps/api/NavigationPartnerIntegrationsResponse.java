package com.spotify.music.libs.partnerapps.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class NavigationPartnerIntegrationsResponse implements JacksonModel {
    /* access modifiers changed from: 0000 */
    public abstract String categoryId();

    public abstract List<NavigationPartnerIntegrationsEntry> partnerIntegrations();

    NavigationPartnerIntegrationsResponse() {
    }

    @JsonCreator
    static NavigationPartnerIntegrationsResponse create(@JsonProperty("categoryId") String str, @JsonProperty("partnerIntegrations") List<NavigationPartnerIntegrationsEntry> list) {
        return new AutoValue_NavigationPartnerIntegrationsResponse(str, list);
    }
}
