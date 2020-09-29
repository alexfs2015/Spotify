package com.spotify.music.features.payfail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_PaymentFailureRepository_Resources extends Resources {
    private final List<Resource> offlineAvailabilities;

    AutoValue_PaymentFailureRepository_Resources(List<Resource> list) {
        if (list != null) {
            this.offlineAvailabilities = list;
            return;
        }
        throw new NullPointerException("Null offlineAvailabilities");
    }

    @JsonProperty("resources")
    public final List<Resource> offlineAvailabilities() {
        return this.offlineAvailabilities;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resources{offlineAvailabilities=");
        sb.append(this.offlineAvailabilities);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Resources)) {
            return false;
        }
        return this.offlineAvailabilities.equals(((Resources) obj).offlineAvailabilities());
    }

    public final int hashCode() {
        return this.offlineAvailabilities.hashCode() ^ 1000003;
    }
}
