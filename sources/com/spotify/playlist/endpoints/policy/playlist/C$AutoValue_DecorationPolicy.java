package com.spotify.playlist.endpoints.policy.playlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.playlist.endpoints.policy.playlist.$AutoValue_DecorationPolicy reason: invalid class name */
abstract class C$AutoValue_DecorationPolicy extends DecorationPolicy {
    private final HeaderPolicy headerPolicy;
    private final ListPolicy listPolicy;

    /* renamed from: com.spotify.playlist.endpoints.policy.playlist.$AutoValue_DecorationPolicy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy.a {
        private ListPolicy a;
        private HeaderPolicy b;

        /* synthetic */ a(DecorationPolicy decorationPolicy, byte b2) {
            this(decorationPolicy);
        }

        a() {
        }

        private a(DecorationPolicy decorationPolicy) {
            this.a = decorationPolicy.listPolicy();
            this.b = decorationPolicy.headerPolicy();
        }

        public final com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy.a a(ListPolicy listPolicy) {
            this.a = listPolicy;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy.a a(HeaderPolicy headerPolicy) {
            this.b = headerPolicy;
            return this;
        }

        public final DecorationPolicy a() {
            return new AutoValue_DecorationPolicy(this.a, this.b);
        }
    }

    C$AutoValue_DecorationPolicy(ListPolicy listPolicy2, HeaderPolicy headerPolicy2) {
        this.listPolicy = listPolicy2;
        this.headerPolicy = headerPolicy2;
    }

    @JsonProperty("list")
    public ListPolicy listPolicy() {
        return this.listPolicy;
    }

    @JsonProperty("header")
    public HeaderPolicy headerPolicy() {
        return this.headerPolicy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecorationPolicy{listPolicy=");
        sb.append(this.listPolicy);
        sb.append(", headerPolicy=");
        sb.append(this.headerPolicy);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DecorationPolicy) {
            DecorationPolicy decorationPolicy = (DecorationPolicy) obj;
            ListPolicy listPolicy2 = this.listPolicy;
            if (listPolicy2 != null ? listPolicy2.equals(decorationPolicy.listPolicy()) : decorationPolicy.listPolicy() == null) {
                HeaderPolicy headerPolicy2 = this.headerPolicy;
                return headerPolicy2 != null ? headerPolicy2.equals(decorationPolicy.headerPolicy()) : decorationPolicy.headerPolicy() == null;
            }
        }
    }

    public int hashCode() {
        ListPolicy listPolicy2 = this.listPolicy;
        int i = 0;
        int hashCode = ((listPolicy2 == null ? 0 : listPolicy2.hashCode()) ^ 1000003) * 1000003;
        HeaderPolicy headerPolicy2 = this.headerPolicy;
        if (headerPolicy2 != null) {
            i = headerPolicy2.hashCode();
        }
        return hashCode ^ i;
    }

    public com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }
}
