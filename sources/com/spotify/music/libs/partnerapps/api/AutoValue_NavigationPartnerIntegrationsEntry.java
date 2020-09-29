package com.spotify.music.libs.partnerapps.api;

final class AutoValue_NavigationPartnerIntegrationsEntry extends NavigationPartnerIntegrationsEntry {
    private final String clientId;
    private final boolean isConnected;
    private final String partnerIntegrationId;

    AutoValue_NavigationPartnerIntegrationsEntry(boolean z, String str, String str2) {
        this.isConnected = z;
        if (str != null) {
            this.clientId = str;
            if (str2 != null) {
                this.partnerIntegrationId = str2;
                return;
            }
            throw new NullPointerException("Null partnerIntegrationId");
        }
        throw new NullPointerException("Null clientId");
    }

    /* access modifiers changed from: 0000 */
    public final String clientId() {
        return this.clientId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NavigationPartnerIntegrationsEntry) {
            NavigationPartnerIntegrationsEntry navigationPartnerIntegrationsEntry = (NavigationPartnerIntegrationsEntry) obj;
            return this.isConnected == navigationPartnerIntegrationsEntry.isConnected() && this.clientId.equals(navigationPartnerIntegrationsEntry.clientId()) && this.partnerIntegrationId.equals(navigationPartnerIntegrationsEntry.partnerIntegrationId());
        }
    }

    public final int hashCode() {
        return (((((this.isConnected ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.clientId.hashCode()) * 1000003) ^ this.partnerIntegrationId.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public final boolean isConnected() {
        return this.isConnected;
    }

    /* access modifiers changed from: 0000 */
    public final String partnerIntegrationId() {
        return this.partnerIntegrationId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationPartnerIntegrationsEntry{isConnected=");
        sb.append(this.isConnected);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", partnerIntegrationId=");
        sb.append(this.partnerIntegrationId);
        sb.append("}");
        return sb.toString();
    }
}
