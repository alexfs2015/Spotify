package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy;

/* renamed from: ogu reason: default package */
public final class ogu extends PlaylistDataSourceConfiguration {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final Optional<Boolean> e;
    private final Optional<Boolean> f;
    private final Optional<Boolean> g;
    private final Optional<Integer> h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final DecorationPolicy l;

    /* renamed from: ogu$a */
    public static final class a implements com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Optional<Boolean> d;
        private Optional<Boolean> e;
        private Optional<Boolean> f;
        private Optional<Integer> g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private DecorationPolicy k;

        /* synthetic */ a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration, byte b2) {
            this(playlistDataSourceConfiguration);
        }

        public a() {
            this.d = Optional.e();
            this.e = Optional.e();
            this.f = Optional.e();
            this.g = Optional.e();
        }

        private a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
            this.d = Optional.e();
            this.e = Optional.e();
            this.f = Optional.e();
            this.g = Optional.e();
            this.a = Boolean.valueOf(playlistDataSourceConfiguration.a());
            this.b = Boolean.valueOf(playlistDataSourceConfiguration.b());
            this.c = Boolean.valueOf(playlistDataSourceConfiguration.c());
            this.d = playlistDataSourceConfiguration.d();
            this.e = playlistDataSourceConfiguration.e();
            this.f = playlistDataSourceConfiguration.f();
            this.g = playlistDataSourceConfiguration.g();
            this.h = Boolean.valueOf(playlistDataSourceConfiguration.h());
            this.i = Boolean.valueOf(playlistDataSourceConfiguration.i());
            this.j = Boolean.valueOf(playlistDataSourceConfiguration.j());
            this.k = playlistDataSourceConfiguration.k();
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null showUnavailableSongs");
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a b(Optional<Boolean> optional) {
            if (optional != null) {
                this.e = optional;
                return this;
            }
            throw new NullPointerException("Null includeTracksFromBannedArtists");
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a c(Optional<Boolean> optional) {
            if (optional != null) {
                this.f = optional;
                return this;
            }
            throw new NullPointerException("Null includeBannedTracks");
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a d(Optional<Integer> optional) {
            if (optional != null) {
                this.g = optional;
                return this;
            }
            throw new NullPointerException("Null limitRangeTo");
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a d(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a e(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a f(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a a(DecorationPolicy decorationPolicy) {
            if (decorationPolicy != null) {
                this.k = decorationPolicy;
                return this;
            }
            throw new NullPointerException("Null decorationPolicy");
        }

        public final PlaylistDataSourceConfiguration a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" alwaysShowWindowedTracks");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loadRecommendations");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" includeEpisodes");
                str = sb3.toString();
            }
            if (this.h == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" keepRangeLimitDuringPlayback");
                str = sb4.toString();
            }
            if (this.i == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" keepTextFilterDuringPlayback");
                str = sb5.toString();
            }
            if (this.j == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" persistSortOptionInPreferences");
                str = sb6.toString();
            }
            if (this.k == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" decorationPolicy");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                ogu ogu = new ogu(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d, this.e, this.f, this.g, this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, 0);
                return ogu;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    /* synthetic */ ogu(boolean z, boolean z2, boolean z3, Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z4, boolean z5, boolean z6, DecorationPolicy decorationPolicy, byte b2) {
        this(z, z2, z3, optional, optional2, optional3, optional4, z4, z5, z6, decorationPolicy);
    }

    private ogu(boolean z, boolean z2, boolean z3, Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3, Optional<Integer> optional4, boolean z4, boolean z5, boolean z6, DecorationPolicy decorationPolicy) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = decorationPolicy;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final Optional<Boolean> d() {
        return this.e;
    }

    public final Optional<Boolean> e() {
        return this.f;
    }

    public final Optional<Boolean> f() {
        return this.g;
    }

    public final Optional<Integer> g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.k;
    }

    public final DecorationPolicy k() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistDataSourceConfiguration{alwaysShowWindowedTracks=");
        sb.append(this.b);
        sb.append(", loadRecommendations=");
        sb.append(this.c);
        sb.append(", includeEpisodes=");
        sb.append(this.d);
        sb.append(", showUnavailableSongs=");
        sb.append(this.e);
        sb.append(", includeTracksFromBannedArtists=");
        sb.append(this.f);
        sb.append(", includeBannedTracks=");
        sb.append(this.g);
        sb.append(", limitRangeTo=");
        sb.append(this.h);
        sb.append(", keepRangeLimitDuringPlayback=");
        sb.append(this.i);
        sb.append(", keepTextFilterDuringPlayback=");
        sb.append(this.j);
        sb.append(", persistSortOptionInPreferences=");
        sb.append(this.k);
        sb.append(", decorationPolicy=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaylistDataSourceConfiguration) {
            PlaylistDataSourceConfiguration playlistDataSourceConfiguration = (PlaylistDataSourceConfiguration) obj;
            return this.b == playlistDataSourceConfiguration.a() && this.c == playlistDataSourceConfiguration.b() && this.d == playlistDataSourceConfiguration.c() && this.e.equals(playlistDataSourceConfiguration.d()) && this.f.equals(playlistDataSourceConfiguration.e()) && this.g.equals(playlistDataSourceConfiguration.f()) && this.h.equals(playlistDataSourceConfiguration.g()) && this.i == playlistDataSourceConfiguration.h() && this.j == playlistDataSourceConfiguration.i() && this.k == playlistDataSourceConfiguration.j() && this.l.equals(playlistDataSourceConfiguration.k());
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003;
        if (!this.k) {
            i2 = 1237;
        }
        return ((hashCode ^ i2) * 1000003) ^ this.l.hashCode();
    }

    public final com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a l() {
        return new a(this, 0);
    }
}
