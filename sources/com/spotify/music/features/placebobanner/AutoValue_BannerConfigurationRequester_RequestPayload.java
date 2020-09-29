package com.spotify.music.features.placebobanner;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_BannerConfigurationRequester_RequestPayload extends RequestPayload {
    private final String userLocale;

    AutoValue_BannerConfigurationRequester_RequestPayload(String str) {
        if (str != null) {
            this.userLocale = str;
            return;
        }
        throw new NullPointerException("Null userLocale");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestPayload)) {
            return false;
        }
        return this.userLocale.equals(((RequestPayload) obj).userLocale());
    }

    public final int hashCode() {
        return this.userLocale.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestPayload{userLocale=");
        sb.append(this.userLocale);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("userLocale")
    public final String userLocale() {
        return this.userLocale;
    }
}
