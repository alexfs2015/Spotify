package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.podcast.endpoints.policy.$AutoValue_DecorationPolicy reason: invalid class name */
abstract class C$AutoValue_DecorationPolicy extends DecorationPolicy {
    private final ListPolicy listPolicy;

    /* renamed from: com.spotify.podcast.endpoints.policy.$AutoValue_DecorationPolicy$a */
    static final class a implements com.spotify.podcast.endpoints.policy.DecorationPolicy.a {
        private ListPolicy a;

        /* synthetic */ a(DecorationPolicy decorationPolicy, byte b) {
            this(decorationPolicy);
        }

        a() {
        }

        private a(DecorationPolicy decorationPolicy) {
            this.a = decorationPolicy.listPolicy();
        }
    }

    C$AutoValue_DecorationPolicy(ListPolicy listPolicy2) {
        this.listPolicy = listPolicy2;
    }

    @JsonProperty("list")
    public ListPolicy listPolicy() {
        return this.listPolicy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecorationPolicy{listPolicy=");
        sb.append(this.listPolicy);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DecorationPolicy)) {
            return false;
        }
        DecorationPolicy decorationPolicy = (DecorationPolicy) obj;
        ListPolicy listPolicy2 = this.listPolicy;
        ListPolicy listPolicy3 = decorationPolicy.listPolicy();
        if (listPolicy2 == null) {
            return listPolicy3 == null;
        }
        return listPolicy2.equals(listPolicy3);
    }

    public int hashCode() {
        ListPolicy listPolicy2 = this.listPolicy;
        return (listPolicy2 == null ? 0 : listPolicy2.hashCode()) ^ 1000003;
    }

    public com.spotify.podcast.endpoints.policy.DecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }
}
