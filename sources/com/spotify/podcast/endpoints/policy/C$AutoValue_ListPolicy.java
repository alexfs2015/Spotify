package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;

/* renamed from: com.spotify.podcast.endpoints.policy.$AutoValue_ListPolicy reason: invalid class name */
abstract class C$AutoValue_ListPolicy extends ListPolicy {
    private final ImmutableMap<String, Boolean> attributes;
    private final ImmutableMap<String, Boolean> showAttributes;

    /* renamed from: com.spotify.podcast.endpoints.policy.$AutoValue_ListPolicy$a */
    static final class a implements com.spotify.podcast.endpoints.policy.ListPolicy.a {
        private ImmutableMap<String, Boolean> a;
        private ImmutableMap<String, Boolean> b;

        /* synthetic */ a(ListPolicy listPolicy, byte b2) {
            this(listPolicy);
        }

        a() {
        }

        private a(ListPolicy listPolicy) {
            this.a = listPolicy.attributes();
            this.b = listPolicy.showAttributes();
        }
    }

    C$AutoValue_ListPolicy(ImmutableMap<String, Boolean> immutableMap, ImmutableMap<String, Boolean> immutableMap2) {
        this.attributes = immutableMap;
        this.showAttributes = immutableMap2;
    }

    @JsonProperty("episode")
    public ImmutableMap<String, Boolean> attributes() {
        return this.attributes;
    }

    @JsonProperty("show")
    public ImmutableMap<String, Boolean> showAttributes() {
        return this.showAttributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListPolicy{attributes=");
        sb.append(this.attributes);
        sb.append(", showAttributes=");
        sb.append(this.showAttributes);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ListPolicy) {
            ListPolicy listPolicy = (ListPolicy) obj;
            ImmutableMap<String, Boolean> immutableMap = this.attributes;
            if (immutableMap != null ? immutableMap.equals(listPolicy.attributes()) : listPolicy.attributes() == null) {
                ImmutableMap<String, Boolean> immutableMap2 = this.showAttributes;
                return immutableMap2 != null ? immutableMap2.equals(listPolicy.showAttributes()) : listPolicy.showAttributes() == null;
            }
        }
    }

    public int hashCode() {
        ImmutableMap<String, Boolean> immutableMap = this.attributes;
        int i = 0;
        int hashCode = ((immutableMap == null ? 0 : immutableMap.hashCode()) ^ 1000003) * 1000003;
        ImmutableMap<String, Boolean> immutableMap2 = this.showAttributes;
        if (immutableMap2 != null) {
            i = immutableMap2.hashCode();
        }
        return hashCode ^ i;
    }

    public com.spotify.podcast.endpoints.policy.ListPolicy.a toBuilder() {
        return new a(this, 0);
    }
}
