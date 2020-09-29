package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.spotlets.ads.model.OfflineResources.Resources;

final class AutoValue_OfflineResources_Resources extends Resources {
    private final String offlineAvailability;
    private final String uri;

    AutoValue_OfflineResources_Resources(String str, String str2) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.offlineAvailability = str2;
                return;
            }
            throw new NullPointerException("Null offlineAvailability");
        }
        throw new NullPointerException("Null uri");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Resources) {
            Resources resources = (Resources) obj;
            if (this.uri.equals(resources.uri()) && this.offlineAvailability.equals(resources.offlineAvailability())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.offlineAvailability.hashCode();
    }

    public final String offlineAvailability() {
        return this.offlineAvailability;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resources{uri=");
        sb.append(this.uri);
        String str = "ensb=vo,iAlfiatylii la";
        sb.append(", offlineAvailability=");
        sb.append(this.offlineAvailability);
        sb.append("}");
        return sb.toString();
    }

    public final String uri() {
        return this.uri;
    }
}
