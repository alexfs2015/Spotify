package com.spotify.playlist.endpoints.policy.playlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.playlist.endpoints.policy.playlist.$AutoValue_Policy reason: invalid class name */
abstract class C$AutoValue_Policy extends Policy {
    private final DecorationPolicy decorationPolicy;

    /* renamed from: com.spotify.playlist.endpoints.policy.playlist.$AutoValue_Policy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.playlist.Policy.a {
        private DecorationPolicy a;

        /* synthetic */ a(Policy policy, byte b) {
            this(policy);
        }

        a() {
        }

        private a(Policy policy) {
            this.a = policy.decorationPolicy();
        }

        public final com.spotify.playlist.endpoints.policy.playlist.Policy.a a(DecorationPolicy decorationPolicy) {
            this.a = decorationPolicy;
            return this;
        }

        public final Policy a() {
            return new AutoValue_Policy(this.a);
        }
    }

    C$AutoValue_Policy(DecorationPolicy decorationPolicy2) {
        this.decorationPolicy = decorationPolicy2;
    }

    @JsonProperty("policy")
    public DecorationPolicy decorationPolicy() {
        return this.decorationPolicy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Policy{decorationPolicy=");
        sb.append(this.decorationPolicy);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Policy)) {
            return false;
        }
        Policy policy = (Policy) obj;
        DecorationPolicy decorationPolicy2 = this.decorationPolicy;
        DecorationPolicy decorationPolicy3 = policy.decorationPolicy();
        if (decorationPolicy2 == null) {
            return decorationPolicy3 == null;
        }
        return decorationPolicy2.equals(decorationPolicy3);
    }

    public int hashCode() {
        DecorationPolicy decorationPolicy2 = this.decorationPolicy;
        return (decorationPolicy2 == null ? 0 : decorationPolicy2.hashCode()) ^ 1000003;
    }

    public com.spotify.playlist.endpoints.policy.playlist.Policy.a toBuilder() {
        return new a(this, 0);
    }
}
