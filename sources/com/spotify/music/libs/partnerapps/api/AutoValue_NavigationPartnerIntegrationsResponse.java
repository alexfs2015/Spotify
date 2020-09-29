package com.spotify.music.libs.partnerapps.api;

import java.util.List;

final class AutoValue_NavigationPartnerIntegrationsResponse extends NavigationPartnerIntegrationsResponse {
    private final String categoryId;
    private final List<NavigationPartnerIntegrationsEntry> partnerIntegrations;

    AutoValue_NavigationPartnerIntegrationsResponse(String str, List<NavigationPartnerIntegrationsEntry> list) {
        if (str != null) {
            this.categoryId = str;
            if (list != null) {
                this.partnerIntegrations = list;
                return;
            }
            throw new NullPointerException("Null partnerIntegrations");
        }
        throw new NullPointerException("Null categoryId");
    }

    /* access modifiers changed from: 0000 */
    public final String categoryId() {
        return this.categoryId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NavigationPartnerIntegrationsResponse) {
            NavigationPartnerIntegrationsResponse navigationPartnerIntegrationsResponse = (NavigationPartnerIntegrationsResponse) obj;
            return this.categoryId.equals(navigationPartnerIntegrationsResponse.categoryId()) && this.partnerIntegrations.equals(navigationPartnerIntegrationsResponse.partnerIntegrations());
        }
    }

    public final int hashCode() {
        return ((this.categoryId.hashCode() ^ 1000003) * 1000003) ^ this.partnerIntegrations.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public final List<NavigationPartnerIntegrationsEntry> partnerIntegrations() {
        return this.partnerIntegrations;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationPartnerIntegrationsResponse{categoryId=");
        sb.append(this.categoryId);
        sb.append(", partnerIntegrations=");
        sb.append(this.partnerIntegrations);
        sb.append("}");
        return sb.toString();
    }
}
