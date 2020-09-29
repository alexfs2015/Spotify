package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;

final class AutoValue_Suppressions extends Suppressions {
    private final ImmutableSet<String> providers;

    AutoValue_Suppressions(ImmutableSet<String> immutableSet) {
        if (immutableSet != null) {
            this.providers = immutableSet;
            return;
        }
        throw new NullPointerException("Null providers");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Suppressions)) {
            return false;
        }
        return this.providers.equals(((Suppressions) obj).providers());
    }

    public final int hashCode() {
        return this.providers.hashCode() ^ 1000003;
    }

    @JsonProperty("providers")
    public final ImmutableSet<String> providers() {
        return this.providers;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Suppressions{providers=");
        sb.append(this.providers);
        sb.append("}");
        return sb.toString();
    }
}
