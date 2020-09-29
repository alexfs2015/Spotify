package com.spotify.music.features.payfail;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_PaymentFailureRepository_Resources_Resource extends Resource {
    private final String offlineAvailability;
    private final String uri;

    AutoValue_PaymentFailureRepository_Resources_Resource(String str, String str2) {
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

    @JsonProperty("uri")
    public final String uri() {
        return this.uri;
    }

    @JsonProperty("offline_availability")
    public final String offlineAvailability() {
        return this.offlineAvailability;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resource{uri=");
        sb.append(this.uri);
        sb.append(", offlineAvailability=");
        sb.append(this.offlineAvailability);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Resource) {
            Resource resource = (Resource) obj;
            return this.uri.equals(resource.uri()) && this.offlineAvailability.equals(resource.offlineAvailability());
        }
    }

    public final int hashCode() {
        return ((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.offlineAvailability.hashCode();
    }
}
