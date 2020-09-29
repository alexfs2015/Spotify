package com.spotify.playlist.endpoints.policy.rootlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_PlaylistUserDecorationPolicy reason: invalid class name */
abstract class C$AutoValue_PlaylistUserDecorationPolicy extends PlaylistUserDecorationPolicy {
    private final Boolean link;
    private final Boolean name;
    private final Boolean username;

    /* renamed from: com.spotify.playlist.endpoints.policy.rootlist.$AutoValue_PlaylistUserDecorationPolicy$a */
    static final class a implements com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        /* synthetic */ a(PlaylistUserDecorationPolicy playlistUserDecorationPolicy, byte b2) {
            this(playlistUserDecorationPolicy);
        }

        a() {
        }

        private a(PlaylistUserDecorationPolicy playlistUserDecorationPolicy) {
            this.a = playlistUserDecorationPolicy.username();
            this.b = playlistUserDecorationPolicy.link();
            this.c = playlistUserDecorationPolicy.name();
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy.a a(Boolean bool) {
            this.a = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy.a b(Boolean bool) {
            this.b = bool;
            return this;
        }

        public final com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy.a c(Boolean bool) {
            this.c = bool;
            return this;
        }

        public final PlaylistUserDecorationPolicy a() {
            return new AutoValue_PlaylistUserDecorationPolicy(this.a, this.b, this.c);
        }
    }

    C$AutoValue_PlaylistUserDecorationPolicy(Boolean bool, Boolean bool2, Boolean bool3) {
        this.username = bool;
        this.link = bool2;
        this.name = bool3;
    }

    @JsonProperty("username")
    public Boolean username() {
        return this.username;
    }

    @JsonProperty("link")
    public Boolean link() {
        return this.link;
    }

    @JsonProperty("name")
    public Boolean name() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaylistUserDecorationPolicy{username=");
        sb.append(this.username);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", name=");
        sb.append(this.name);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaylistUserDecorationPolicy) {
            PlaylistUserDecorationPolicy playlistUserDecorationPolicy = (PlaylistUserDecorationPolicy) obj;
            Boolean bool = this.username;
            if (bool != null ? bool.equals(playlistUserDecorationPolicy.username()) : playlistUserDecorationPolicy.username() == null) {
                Boolean bool2 = this.link;
                if (bool2 != null ? bool2.equals(playlistUserDecorationPolicy.link()) : playlistUserDecorationPolicy.link() == null) {
                    Boolean bool3 = this.name;
                    return bool3 != null ? bool3.equals(playlistUserDecorationPolicy.name()) : playlistUserDecorationPolicy.name() == null;
                }
            }
        }
    }

    public int hashCode() {
        Boolean bool = this.username;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        Boolean bool2 = this.link;
        int hashCode2 = (hashCode ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.name;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode2 ^ i;
    }

    public com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }
}
