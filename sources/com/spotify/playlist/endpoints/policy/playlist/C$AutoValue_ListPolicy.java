package com.spotify.playlist.endpoints.policy.playlist;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;

/* renamed from: com.spotify.playlist.endpoints.policy.playlist.$AutoValue_ListPolicy reason: invalid class name */
abstract class C$AutoValue_ListPolicy extends ListPolicy {
    private final ImmutableMap<String, Boolean> addedByAttributes;
    private final ImmutableMap<String, Boolean> albumAttributes;
    private final ImmutableMap<String, Boolean> artistsAttributes;
    private final ImmutableMap<String, Boolean> attributes;
    private final ImmutableMap<String, Boolean> showAttributes;

    /* renamed from: com.spotify.playlist.endpoints.policy.playlist.$AutoValue_ListPolicy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.playlist.ListPolicy.a {
        private ImmutableMap<String, Boolean> a;
        private ImmutableMap<String, Boolean> b;
        private ImmutableMap<String, Boolean> c;
        private ImmutableMap<String, Boolean> d;
        private ImmutableMap<String, Boolean> e;

        /* synthetic */ a(ListPolicy listPolicy, byte b2) {
            this(listPolicy);
        }

        a() {
        }

        private a(ListPolicy listPolicy) {
            this.a = listPolicy.attributes();
            this.b = listPolicy.albumAttributes();
            this.c = listPolicy.artistsAttributes();
            this.d = listPolicy.showAttributes();
            this.e = listPolicy.addedByAttributes();
        }

        public final com.spotify.playlist.endpoints.policy.playlist.ListPolicy.a a(ImmutableMap<String, Boolean> immutableMap) {
            this.a = immutableMap;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.playlist.ListPolicy.a b(ImmutableMap<String, Boolean> immutableMap) {
            this.b = immutableMap;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.playlist.ListPolicy.a c(ImmutableMap<String, Boolean> immutableMap) {
            this.c = immutableMap;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.playlist.ListPolicy.a d(ImmutableMap<String, Boolean> immutableMap) {
            this.d = immutableMap;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.playlist.ListPolicy.a e(ImmutableMap<String, Boolean> immutableMap) {
            this.e = immutableMap;
            return this;
        }

        public final ListPolicy a() {
            AutoValue_ListPolicy autoValue_ListPolicy = new AutoValue_ListPolicy(this.a, this.b, this.c, this.d, this.e);
            return autoValue_ListPolicy;
        }
    }

    C$AutoValue_ListPolicy(ImmutableMap<String, Boolean> immutableMap, ImmutableMap<String, Boolean> immutableMap2, ImmutableMap<String, Boolean> immutableMap3, ImmutableMap<String, Boolean> immutableMap4, ImmutableMap<String, Boolean> immutableMap5) {
        this.attributes = immutableMap;
        this.albumAttributes = immutableMap2;
        this.artistsAttributes = immutableMap3;
        this.showAttributes = immutableMap4;
        this.addedByAttributes = immutableMap5;
    }

    @JsonAnyGetter
    public ImmutableMap<String, Boolean> attributes() {
        return this.attributes;
    }

    @JsonProperty("album")
    public ImmutableMap<String, Boolean> albumAttributes() {
        return this.albumAttributes;
    }

    @JsonProperty("artists")
    public ImmutableMap<String, Boolean> artistsAttributes() {
        return this.artistsAttributes;
    }

    @JsonProperty("show")
    public ImmutableMap<String, Boolean> showAttributes() {
        return this.showAttributes;
    }

    @JsonProperty("addedBy")
    public ImmutableMap<String, Boolean> addedByAttributes() {
        return this.addedByAttributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListPolicy{attributes=");
        sb.append(this.attributes);
        sb.append(", albumAttributes=");
        sb.append(this.albumAttributes);
        sb.append(", artistsAttributes=");
        sb.append(this.artistsAttributes);
        sb.append(", showAttributes=");
        sb.append(this.showAttributes);
        sb.append(", addedByAttributes=");
        sb.append(this.addedByAttributes);
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
                ImmutableMap<String, Boolean> immutableMap2 = this.albumAttributes;
                if (immutableMap2 != null ? immutableMap2.equals(listPolicy.albumAttributes()) : listPolicy.albumAttributes() == null) {
                    ImmutableMap<String, Boolean> immutableMap3 = this.artistsAttributes;
                    if (immutableMap3 != null ? immutableMap3.equals(listPolicy.artistsAttributes()) : listPolicy.artistsAttributes() == null) {
                        ImmutableMap<String, Boolean> immutableMap4 = this.showAttributes;
                        if (immutableMap4 != null ? immutableMap4.equals(listPolicy.showAttributes()) : listPolicy.showAttributes() == null) {
                            ImmutableMap<String, Boolean> immutableMap5 = this.addedByAttributes;
                            return immutableMap5 != null ? immutableMap5.equals(listPolicy.addedByAttributes()) : listPolicy.addedByAttributes() == null;
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        ImmutableMap<String, Boolean> immutableMap = this.attributes;
        int i = 0;
        int hashCode = ((immutableMap == null ? 0 : immutableMap.hashCode()) ^ 1000003) * 1000003;
        ImmutableMap<String, Boolean> immutableMap2 = this.albumAttributes;
        int hashCode2 = (hashCode ^ (immutableMap2 == null ? 0 : immutableMap2.hashCode())) * 1000003;
        ImmutableMap<String, Boolean> immutableMap3 = this.artistsAttributes;
        int hashCode3 = (hashCode2 ^ (immutableMap3 == null ? 0 : immutableMap3.hashCode())) * 1000003;
        ImmutableMap<String, Boolean> immutableMap4 = this.showAttributes;
        int hashCode4 = (hashCode3 ^ (immutableMap4 == null ? 0 : immutableMap4.hashCode())) * 1000003;
        ImmutableMap<String, Boolean> immutableMap5 = this.addedByAttributes;
        if (immutableMap5 != null) {
            i = immutableMap5.hashCode();
        }
        return hashCode4 ^ i;
    }

    public com.spotify.playlist.endpoints.policy.playlist.ListPolicy.a toBuilder() {
        return new a(this, 0);
    }
}
