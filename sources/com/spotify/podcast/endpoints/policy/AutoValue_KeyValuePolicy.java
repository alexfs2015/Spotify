package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.google.common.collect.ImmutableMap;

final class AutoValue_KeyValuePolicy extends KeyValuePolicy {
    private final ImmutableMap<String, Boolean> attributes;

    static final class a implements com.spotify.podcast.endpoints.policy.KeyValuePolicy.a {
        private ImmutableMap<String, Boolean> a;

        a() {
        }

        private a(KeyValuePolicy keyValuePolicy) {
            this.a = keyValuePolicy.attributes();
        }

        /* synthetic */ a(KeyValuePolicy keyValuePolicy, byte b) {
            this(keyValuePolicy);
        }

        public final com.spotify.podcast.endpoints.policy.KeyValuePolicy.a a(ImmutableMap<String, Boolean> immutableMap) {
            this.a = immutableMap;
            return this;
        }

        public final KeyValuePolicy a() {
            return new AutoValue_KeyValuePolicy(this.a);
        }
    }

    private AutoValue_KeyValuePolicy(ImmutableMap<String, Boolean> immutableMap) {
        this.attributes = immutableMap;
    }

    @JsonAnyGetter
    public final ImmutableMap<String, Boolean> attributes() {
        return this.attributes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyValuePolicy)) {
            return false;
        }
        KeyValuePolicy keyValuePolicy = (KeyValuePolicy) obj;
        ImmutableMap<String, Boolean> immutableMap = this.attributes;
        ImmutableMap attributes2 = keyValuePolicy.attributes();
        return immutableMap == null ? attributes2 == null : immutableMap.equals(attributes2);
    }

    public final int hashCode() {
        ImmutableMap<String, Boolean> immutableMap = this.attributes;
        return (immutableMap == null ? 0 : immutableMap.hashCode()) ^ 1000003;
    }

    public final com.spotify.podcast.endpoints.policy.KeyValuePolicy.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyValuePolicy{attributes=");
        sb.append(this.attributes);
        sb.append("}");
        return sb.toString();
    }
}
