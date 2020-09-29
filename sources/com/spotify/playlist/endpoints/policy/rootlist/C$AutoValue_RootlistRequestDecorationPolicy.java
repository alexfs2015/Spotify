package com.spotify.playlist.endpoints.policy.rootlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_RootlistRequestDecorationPolicy reason: invalid class name */
abstract class C$AutoValue_RootlistRequestDecorationPolicy extends RootlistRequestDecorationPolicy {
    private final Boolean isLoadingContents;
    private final Boolean unfilteredLength;
    private final Boolean unrangedLength;

    /* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_RootlistRequestDecorationPolicy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        a() {
        }

        private a(RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy) {
            this.a = rootlistRequestDecorationPolicy.unfilteredLength();
            this.b = rootlistRequestDecorationPolicy.unrangedLength();
            this.c = rootlistRequestDecorationPolicy.isLoadingContents();
        }

        /* synthetic */ a(RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, byte b2) {
            this(rootlistRequestDecorationPolicy);
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy.a a(Boolean bool) {
            this.a = bool;
            return this;
        }

        public final RootlistRequestDecorationPolicy a() {
            return new AutoValue_RootlistRequestDecorationPolicy(this.a, this.b, this.c);
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy.a b(Boolean bool) {
            this.b = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy.a c(Boolean bool) {
            this.c = bool;
            return this;
        }
    }

    C$AutoValue_RootlistRequestDecorationPolicy(Boolean bool, Boolean bool2, Boolean bool3) {
        this.unfilteredLength = bool;
        this.unrangedLength = bool2;
        this.isLoadingContents = bool3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RootlistRequestDecorationPolicy) {
            RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = (RootlistRequestDecorationPolicy) obj;
            Boolean bool = this.unfilteredLength;
            if (bool != null ? bool.equals(rootlistRequestDecorationPolicy.unfilteredLength()) : rootlistRequestDecorationPolicy.unfilteredLength() == null) {
                Boolean bool2 = this.unrangedLength;
                if (bool2 != null ? bool2.equals(rootlistRequestDecorationPolicy.unrangedLength()) : rootlistRequestDecorationPolicy.unrangedLength() == null) {
                    Boolean bool3 = this.isLoadingContents;
                    return bool3 != null ? bool3.equals(rootlistRequestDecorationPolicy.isLoadingContents()) : rootlistRequestDecorationPolicy.isLoadingContents() == null;
                }
            }
        }
    }

    public int hashCode() {
        Boolean bool = this.unfilteredLength;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        Boolean bool2 = this.unrangedLength;
        int hashCode2 = (hashCode ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.isLoadingContents;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("isLoadingContents")
    public Boolean isLoadingContents() {
        return this.isLoadingContents;
    }

    public com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RootlistRequestDecorationPolicy{unfilteredLength=");
        sb.append(this.unfilteredLength);
        sb.append(", unrangedLength=");
        sb.append(this.unrangedLength);
        sb.append(", isLoadingContents=");
        sb.append(this.isLoadingContents);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("unfilteredLength")
    public Boolean unfilteredLength() {
        return this.unfilteredLength;
    }

    @JsonProperty("unrangedLength")
    public Boolean unrangedLength() {
        return this.unrangedLength;
    }
}
