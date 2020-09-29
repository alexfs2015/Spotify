package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.StupidFlag2;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.StupidFlag4;

/* renamed from: vgi reason: default package */
public final class vgi extends AndroidLibsPlaylistEntityConfigurationProperties {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final StupidFlag2 e;
    private final boolean f;
    private final StupidFlag4 g;

    /* renamed from: vgi$a */
    public static final class a extends com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private StupidFlag2 e;
        private Boolean f;
        private StupidFlag4 g;

        public final com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.a a(StupidFlag2 stupidFlag2) {
            if (stupidFlag2 != null) {
                this.e = stupidFlag2;
                return this;
            }
            throw new NullPointerException("Null stupidFlag2");
        }

        public final com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties.a a(StupidFlag4 stupidFlag4) {
            if (stupidFlag4 != null) {
                this.g = stupidFlag4;
                return this;
            }
            throw new NullPointerException("Null stupidFlag4");
        }

        public final AndroidLibsPlaylistEntityConfigurationProperties a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" allowAutoPlayOfEpisodesInShuffleModeInPlaylist");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" enableWeightedShufflePlayback");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" respectShowsCollectionFlagInPlaylistForIncludingEpisodes");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" stupidFlag");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" stupidFlag2");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" stupidFlag3");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" stupidFlag4");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                vgi vgi = new vgi(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e, this.f.booleanValue(), this.g, 0);
                return vgi;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    /* synthetic */ vgi(boolean z, boolean z2, boolean z3, boolean z4, StupidFlag2 stupidFlag2, boolean z5, StupidFlag4 stupidFlag4, byte b2) {
        this(z, z2, z3, z4, stupidFlag2, z5, stupidFlag4);
    }

    private vgi(boolean z, boolean z2, boolean z3, boolean z4, StupidFlag2 stupidFlag2, boolean z5, StupidFlag4 stupidFlag4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = stupidFlag2;
        this.f = z5;
        this.g = stupidFlag4;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final StupidFlag2 e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final StupidFlag4 g() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsPlaylistEntityConfigurationProperties{allowAutoPlayOfEpisodesInShuffleModeInPlaylist=");
        sb.append(this.a);
        sb.append(", enableWeightedShufflePlayback=");
        sb.append(this.b);
        sb.append(", respectShowsCollectionFlagInPlaylistForIncludingEpisodes=");
        sb.append(this.c);
        sb.append(", stupidFlag=");
        sb.append(this.d);
        sb.append(", stupidFlag2=");
        sb.append(this.e);
        sb.append(", stupidFlag3=");
        sb.append(this.f);
        sb.append(", stupidFlag4=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidLibsPlaylistEntityConfigurationProperties) {
            AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties = (AndroidLibsPlaylistEntityConfigurationProperties) obj;
            return this.a == androidLibsPlaylistEntityConfigurationProperties.a() && this.b == androidLibsPlaylistEntityConfigurationProperties.b() && this.c == androidLibsPlaylistEntityConfigurationProperties.c() && this.d == androidLibsPlaylistEntityConfigurationProperties.d() && this.e.equals(androidLibsPlaylistEntityConfigurationProperties.e()) && this.f == androidLibsPlaylistEntityConfigurationProperties.f() && this.g.equals(androidLibsPlaylistEntityConfigurationProperties.g());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.g.hashCode();
    }
}
