package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_ShowPolicy extends ShowPolicy {
    private final ShowDecorationPolicy listDecorationPolicy;

    static final class a implements com.spotify.podcast.endpoints.policy.ShowPolicy.a {
        private ShowDecorationPolicy a;

        a() {
        }

        private a(ShowPolicy showPolicy) {
            this.a = showPolicy.listDecorationPolicy();
        }

        /* synthetic */ a(ShowPolicy showPolicy, byte b) {
            this(showPolicy);
        }
    }

    private AutoValue_ShowPolicy(ShowDecorationPolicy showDecorationPolicy) {
        this.listDecorationPolicy = showDecorationPolicy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowPolicy)) {
            return false;
        }
        ShowPolicy showPolicy = (ShowPolicy) obj;
        ShowDecorationPolicy showDecorationPolicy = this.listDecorationPolicy;
        ShowDecorationPolicy listDecorationPolicy2 = showPolicy.listDecorationPolicy();
        return showDecorationPolicy == null ? listDecorationPolicy2 == null : showDecorationPolicy.equals(listDecorationPolicy2);
    }

    public final int hashCode() {
        ShowDecorationPolicy showDecorationPolicy = this.listDecorationPolicy;
        return (showDecorationPolicy == null ? 0 : showDecorationPolicy.hashCode()) ^ 1000003;
    }

    @JsonProperty("policy")
    public final ShowDecorationPolicy listDecorationPolicy() {
        return this.listDecorationPolicy;
    }

    public final com.spotify.podcast.endpoints.policy.ShowPolicy.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowPolicy{listDecorationPolicy=");
        sb.append(this.listDecorationPolicy);
        sb.append("}");
        return sb.toString();
    }
}
