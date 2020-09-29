package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;

/* renamed from: qwh reason: default package */
public final class qwh extends MusicPagesModel {
    private final qyb a;
    private final Optional<uqv> b;
    private final Optional<ImmutableMap<String, Boolean>> c;
    private final Optional<PagePrefs> d;
    private final String e;
    private final int f;
    private final int g;
    private final qun h;
    private final Optional<Boolean> i;
    private final Optional<Boolean> j;
    private final Optional<Boolean> k;
    private final Optional<Boolean> l;
    private final Optional<Boolean> m;
    private final LoadingState n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final uqg t;
    private final uqu u;
    private final qwl v;

    /* renamed from: qwh$a */
    public static final class a extends com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a {
        private qyb a;
        private Optional<uqv> b;
        private Optional<ImmutableMap<String, Boolean>> c;
        private Optional<PagePrefs> d;
        private String e;
        private Integer f;
        private Integer g;
        private qun h;
        private Optional<Boolean> i;
        private Optional<Boolean> j;
        private Optional<Boolean> k;
        private Optional<Boolean> l;
        private Optional<Boolean> m;
        private LoadingState n;
        private Boolean o;
        private Boolean p;
        private Boolean q;
        private Boolean r;
        private Boolean s;
        private uqg t;
        private uqu u;
        private qwl v;

        /* synthetic */ a(MusicPagesModel musicPagesModel, byte b2) {
            this(musicPagesModel);
        }

        public a() {
            this.b = Optional.e();
            this.c = Optional.e();
            this.d = Optional.e();
            this.i = Optional.e();
            this.j = Optional.e();
            this.k = Optional.e();
            this.l = Optional.e();
            this.m = Optional.e();
        }

        private a(MusicPagesModel musicPagesModel) {
            this.b = Optional.e();
            this.c = Optional.e();
            this.d = Optional.e();
            this.i = Optional.e();
            this.j = Optional.e();
            this.k = Optional.e();
            this.l = Optional.e();
            this.m = Optional.e();
            this.a = musicPagesModel.a();
            this.b = musicPagesModel.b();
            this.c = musicPagesModel.c();
            this.d = musicPagesModel.d();
            this.e = musicPagesModel.e();
            this.f = Integer.valueOf(musicPagesModel.f());
            this.g = Integer.valueOf(musicPagesModel.g());
            this.h = musicPagesModel.h();
            this.i = musicPagesModel.i();
            this.j = musicPagesModel.j();
            this.k = musicPagesModel.k();
            this.l = musicPagesModel.l();
            this.m = musicPagesModel.m();
            this.n = musicPagesModel.n();
            this.o = Boolean.valueOf(musicPagesModel.o());
            this.p = Boolean.valueOf(musicPagesModel.p());
            this.q = Boolean.valueOf(musicPagesModel.q());
            this.r = Boolean.valueOf(musicPagesModel.r());
            this.s = Boolean.valueOf(musicPagesModel.s());
            this.t = musicPagesModel.t();
            this.u = musicPagesModel.u();
            this.v = musicPagesModel.v();
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(qyb qyb) {
            if (qyb != null) {
                this.a = qyb;
                return this;
            }
            throw new NullPointerException("Null musicPage");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(Optional<uqv> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null activeSortOption");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a b(Optional<ImmutableMap<String, Boolean>> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null activeFilterStates");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a c(Optional<PagePrefs> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null pagePrefs");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(int i2) {
            this.f = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a b(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(qun qun) {
            if (qun != null) {
                this.h = qun;
                return this;
            }
            throw new NullPointerException("Null dataSourceViewport");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a d(Optional<Boolean> optional) {
            if (optional != null) {
                this.i = optional;
                return this;
            }
            throw new NullPointerException("Null explicitContentDisabled");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a e(Optional<Boolean> optional) {
            if (optional != null) {
                this.j = optional;
                return this;
            }
            throw new NullPointerException("Null showUnavailableTracks");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a f(Optional<Boolean> optional) {
            if (optional != null) {
                this.k = optional;
                return this;
            }
            throw new NullPointerException("Null isOffline");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a g(Optional<Boolean> optional) {
            if (optional != null) {
                this.l = optional;
                return this;
            }
            throw new NullPointerException("Null showOfflinedFirst");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a h(Optional<Boolean> optional) {
            if (optional != null) {
                this.m = optional;
                return this;
            }
            throw new NullPointerException("Null drillDownHeaderExpanded");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(LoadingState loadingState) {
            if (loadingState != null) {
                this.n = loadingState;
                return this;
            }
            throw new NullPointerException("Null loadingState");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a b(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a c(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a d(boolean z) {
            this.r = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a e(boolean z) {
            this.s = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(uqg uqg) {
            if (uqg != null) {
                this.t = uqg;
                return this;
            }
            throw new NullPointerException("Null optionsMenuConfiguration");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(uqu uqu) {
            if (uqu != null) {
                this.u = uqu;
                return this;
            }
            throw new NullPointerException("Null yourLibraryState");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a a(qwl qwl) {
            if (qwl != null) {
                this.v = qwl;
                return this;
            }
            throw new NullPointerException("Null playerState");
        }

        public final MusicPagesModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" musicPage");
                str = sb.toString();
            }
            if (this.e == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" textFilter");
                str = sb2.toString();
            }
            if (this.f == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" visibleRangeStart");
                str = sb3.toString();
            }
            if (this.g == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" visibleRangeSize");
                str = sb4.toString();
            }
            if (this.h == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" dataSourceViewport");
                str = sb5.toString();
            }
            if (this.n == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" loadingState");
                str = sb6.toString();
            }
            if (this.o == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" textFilterVisible");
                str = sb7.toString();
            }
            if (this.p == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" hasFocus");
                str = sb8.toString();
            }
            if (this.q == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" isConsumingBackPresses");
                str = sb9.toString();
            }
            if (this.r == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" isAutomaticSortByAvailableOfflineEnabled");
                str = sb10.toString();
            }
            if (this.s == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" isFilterAndSortPulldownEnabled");
                str = sb11.toString();
            }
            if (this.t == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" optionsMenuConfiguration");
                str = sb12.toString();
            }
            if (this.u == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" yourLibraryState");
                str = sb13.toString();
            }
            if (this.v == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" playerState");
                str = sb14.toString();
            }
            if (str.isEmpty()) {
                qwh qwh = new qwh(this.a, this.b, this.c, this.d, this.e, this.f.intValue(), this.g.intValue(), this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.r.booleanValue(), this.s.booleanValue(), this.t, this.u, this.v, 0);
                return qwh;
            }
            StringBuilder sb15 = new StringBuilder("Missing required properties:");
            sb15.append(str);
            throw new IllegalStateException(sb15.toString());
        }
    }

    /* synthetic */ qwh(qyb qyb, Optional optional, Optional optional2, Optional optional3, String str, int i2, int i3, qun qun, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, LoadingState loadingState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, uqg uqg, uqu uqu, qwl qwl, byte b2) {
        this(qyb, optional, optional2, optional3, str, i2, i3, qun, optional4, optional5, optional6, optional7, optional8, loadingState, z, z2, z3, z4, z5, uqg, uqu, qwl);
    }

    private qwh(qyb qyb, Optional<uqv> optional, Optional<ImmutableMap<String, Boolean>> optional2, Optional<PagePrefs> optional3, String str, int i2, int i3, qun qun, Optional<Boolean> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, Optional<Boolean> optional7, Optional<Boolean> optional8, LoadingState loadingState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, uqg uqg, uqu uqu, qwl qwl) {
        this.a = qyb;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = str;
        this.f = i2;
        this.g = i3;
        this.h = qun;
        this.i = optional4;
        this.j = optional5;
        this.k = optional6;
        this.l = optional7;
        this.m = optional8;
        this.n = loadingState;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = uqg;
        this.u = uqu;
        this.v = qwl;
    }

    public final qyb a() {
        return this.a;
    }

    public final Optional<uqv> b() {
        return this.b;
    }

    public final Optional<ImmutableMap<String, Boolean>> c() {
        return this.c;
    }

    public final Optional<PagePrefs> d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final qun h() {
        return this.h;
    }

    public final Optional<Boolean> i() {
        return this.i;
    }

    public final Optional<Boolean> j() {
        return this.j;
    }

    public final Optional<Boolean> k() {
        return this.k;
    }

    public final Optional<Boolean> l() {
        return this.l;
    }

    public final Optional<Boolean> m() {
        return this.m;
    }

    public final LoadingState n() {
        return this.n;
    }

    public final boolean o() {
        return this.o;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    public final boolean r() {
        return this.r;
    }

    public final boolean s() {
        return this.s;
    }

    public final uqg t() {
        return this.t;
    }

    public final uqu u() {
        return this.u;
    }

    public final qwl v() {
        return this.v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPagesModel{musicPage=");
        sb.append(this.a);
        sb.append(", activeSortOption=");
        sb.append(this.b);
        sb.append(", activeFilterStates=");
        sb.append(this.c);
        sb.append(", pagePrefs=");
        sb.append(this.d);
        sb.append(", textFilter=");
        sb.append(this.e);
        sb.append(", visibleRangeStart=");
        sb.append(this.f);
        sb.append(", visibleRangeSize=");
        sb.append(this.g);
        sb.append(", dataSourceViewport=");
        sb.append(this.h);
        sb.append(", explicitContentDisabled=");
        sb.append(this.i);
        sb.append(", showUnavailableTracks=");
        sb.append(this.j);
        sb.append(", isOffline=");
        sb.append(this.k);
        sb.append(", showOfflinedFirst=");
        sb.append(this.l);
        sb.append(", drillDownHeaderExpanded=");
        sb.append(this.m);
        sb.append(", loadingState=");
        sb.append(this.n);
        sb.append(", textFilterVisible=");
        sb.append(this.o);
        sb.append(", hasFocus=");
        sb.append(this.p);
        sb.append(", isConsumingBackPresses=");
        sb.append(this.q);
        sb.append(", isAutomaticSortByAvailableOfflineEnabled=");
        sb.append(this.r);
        sb.append(", isFilterAndSortPulldownEnabled=");
        sb.append(this.s);
        sb.append(", optionsMenuConfiguration=");
        sb.append(this.t);
        sb.append(", yourLibraryState=");
        sb.append(this.u);
        sb.append(", playerState=");
        sb.append(this.v);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MusicPagesModel) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            return this.a.equals(musicPagesModel.a()) && this.b.equals(musicPagesModel.b()) && this.c.equals(musicPagesModel.c()) && this.d.equals(musicPagesModel.d()) && this.e.equals(musicPagesModel.e()) && this.f == musicPagesModel.f() && this.g == musicPagesModel.g() && this.h.equals(musicPagesModel.h()) && this.i.equals(musicPagesModel.i()) && this.j.equals(musicPagesModel.j()) && this.k.equals(musicPagesModel.k()) && this.l.equals(musicPagesModel.l()) && this.m.equals(musicPagesModel.m()) && this.n.equals(musicPagesModel.n()) && this.o == musicPagesModel.o() && this.p == musicPagesModel.p() && this.q == musicPagesModel.q() && this.r == musicPagesModel.r() && this.s == musicPagesModel.s() && this.t.equals(musicPagesModel.t()) && this.u.equals(musicPagesModel.u()) && this.v.equals(musicPagesModel.v());
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003) ^ (this.r ? 1231 : 1237)) * 1000003;
        if (!this.s) {
            i2 = 1237;
        }
        return ((((((hashCode ^ i2) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode();
    }

    public final com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a w() {
        return new a(this, 0);
    }
}
