package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.spotlets.ads.model.OfflineResources.Resources;

final class AutoValue_OfflineResources extends OfflineResources {
    private final Resources resources;

    AutoValue_OfflineResources(Resources resources2) {
        if (resources2 != null) {
            this.resources = resources2;
            return;
        }
        throw new NullPointerException("Null resources");
    }

    public final Resources resources() {
        return this.resources;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineResources{resources=");
        sb.append(this.resources);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineResources)) {
            return false;
        }
        return this.resources.equals(((OfflineResources) obj).resources());
    }

    public final int hashCode() {
        return this.resources.hashCode() ^ 1000003;
    }
}
