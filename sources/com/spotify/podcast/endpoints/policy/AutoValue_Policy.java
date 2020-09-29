package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_Policy extends Policy {
    private final DecorationPolicy decorationPolicy;

    static final class a implements com.spotify.podcast.endpoints.policy.Policy.a {
        private DecorationPolicy a;

        a() {
        }

        private a(Policy policy) {
            this.a = policy.decorationPolicy();
        }

        /* synthetic */ a(Policy policy, byte b) {
            this(policy);
        }

        public final com.spotify.podcast.endpoints.policy.Policy.a a(DecorationPolicy decorationPolicy) {
            this.a = decorationPolicy;
            return this;
        }

        public final Policy a() {
            return new AutoValue_Policy(this.a);
        }
    }

    private AutoValue_Policy(DecorationPolicy decorationPolicy2) {
        this.decorationPolicy = decorationPolicy2;
    }

    @JsonProperty("policy")
    public final DecorationPolicy decorationPolicy() {
        return this.decorationPolicy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Policy)) {
            return false;
        }
        Policy policy = (Policy) obj;
        DecorationPolicy decorationPolicy2 = this.decorationPolicy;
        DecorationPolicy decorationPolicy3 = policy.decorationPolicy();
        return decorationPolicy2 == null ? decorationPolicy3 == null : decorationPolicy2.equals(decorationPolicy3);
    }

    public final int hashCode() {
        DecorationPolicy decorationPolicy2 = this.decorationPolicy;
        return (decorationPolicy2 == null ? 0 : decorationPolicy2.hashCode()) ^ 1000003;
    }

    public final com.spotify.podcast.endpoints.policy.Policy.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Policy{decorationPolicy=");
        sb.append(this.decorationPolicy);
        sb.append("}");
        return sb.toString();
    }
}
