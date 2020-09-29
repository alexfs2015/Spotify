package com.spotify.playlist.endpoints.policy.playlist;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;

/* renamed from: com.spotify.playlist.endpoints.policy.playlist.$AutoValue_HeaderPolicy reason: invalid class name */
abstract class C$AutoValue_HeaderPolicy extends HeaderPolicy {
    private final ImmutableMap<String, Boolean> attributes;
    private final ImmutableMap<String, Boolean> madeForAttributes;
    private final ImmutableMap<String, Boolean> ownerAttributes;

    /* renamed from: com.spotify.playlist.endpoints.policy.playlist.$AutoValue_HeaderPolicy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy.a {
        private ImmutableMap<String, Boolean> a;
        private ImmutableMap<String, Boolean> b;
        private ImmutableMap<String, Boolean> c;

        a() {
        }

        private a(HeaderPolicy headerPolicy) {
            this.a = headerPolicy.attributes();
            this.b = headerPolicy.ownerAttributes();
            this.c = headerPolicy.madeForAttributes();
        }

        /* synthetic */ a(HeaderPolicy headerPolicy, byte b2) {
            this(headerPolicy);
        }

        public final com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy.a a(ImmutableMap<String, Boolean> immutableMap) {
            this.a = immutableMap;
            return this;
        }

        public final HeaderPolicy a() {
            return new AutoValue_HeaderPolicy(this.a, this.b, this.c);
        }

        public final com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy.a b(ImmutableMap<String, Boolean> immutableMap) {
            this.b = immutableMap;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy.a c(ImmutableMap<String, Boolean> immutableMap) {
            this.c = immutableMap;
            return this;
        }
    }

    C$AutoValue_HeaderPolicy(ImmutableMap<String, Boolean> immutableMap, ImmutableMap<String, Boolean> immutableMap2, ImmutableMap<String, Boolean> immutableMap3) {
        this.attributes = immutableMap;
        this.ownerAttributes = immutableMap2;
        this.madeForAttributes = immutableMap3;
    }

    @JsonAnyGetter
    public ImmutableMap<String, Boolean> attributes() {
        return this.attributes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeaderPolicy) {
            HeaderPolicy headerPolicy = (HeaderPolicy) obj;
            ImmutableMap<String, Boolean> immutableMap = this.attributes;
            if (immutableMap != null ? immutableMap.equals(headerPolicy.attributes()) : headerPolicy.attributes() == null) {
                ImmutableMap<String, Boolean> immutableMap2 = this.ownerAttributes;
                if (immutableMap2 != null ? immutableMap2.equals(headerPolicy.ownerAttributes()) : headerPolicy.ownerAttributes() == null) {
                    ImmutableMap<String, Boolean> immutableMap3 = this.madeForAttributes;
                    return immutableMap3 != null ? immutableMap3.equals(headerPolicy.madeForAttributes()) : headerPolicy.madeForAttributes() == null;
                }
            }
        }
    }

    public int hashCode() {
        ImmutableMap<String, Boolean> immutableMap = this.attributes;
        int i = 0;
        int hashCode = ((immutableMap == null ? 0 : immutableMap.hashCode()) ^ 1000003) * 1000003;
        ImmutableMap<String, Boolean> immutableMap2 = this.ownerAttributes;
        int hashCode2 = (hashCode ^ (immutableMap2 == null ? 0 : immutableMap2.hashCode())) * 1000003;
        ImmutableMap<String, Boolean> immutableMap3 = this.madeForAttributes;
        if (immutableMap3 != null) {
            i = immutableMap3.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("madeFor")
    public ImmutableMap<String, Boolean> madeForAttributes() {
        return this.madeForAttributes;
    }

    @JsonProperty("owner")
    public ImmutableMap<String, Boolean> ownerAttributes() {
        return this.ownerAttributes;
    }

    public com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderPolicy{attributes=");
        sb.append(this.attributes);
        sb.append(", ownerAttributes=");
        sb.append(this.ownerAttributes);
        sb.append(", madeForAttributes=");
        sb.append(this.madeForAttributes);
        sb.append("}");
        return sb.toString();
    }
}
