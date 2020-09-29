package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: rfm reason: default package */
final class rfm extends rfs {
    private final String a;
    private final SpotifyIconV2 b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    /* renamed from: rfm$a */
    static final class a implements defpackage.rfs.a {
        private String a;
        private SpotifyIconV2 b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Boolean m;

        /* synthetic */ a(rfs rfs, byte b2) {
            this(rfs);
        }

        a() {
        }

        private a(rfs rfs) {
            this.a = rfs.a();
            this.b = rfs.b();
            this.c = Boolean.valueOf(rfs.c());
            this.d = Boolean.valueOf(rfs.d());
            this.e = Boolean.valueOf(rfs.e());
            this.f = Boolean.valueOf(rfs.f());
            this.g = Boolean.valueOf(rfs.g());
            this.h = Boolean.valueOf(rfs.h());
            this.i = Boolean.valueOf(rfs.i());
            this.j = Boolean.valueOf(rfs.j());
            this.k = Boolean.valueOf(rfs.k());
            this.l = Boolean.valueOf(rfs.l());
            this.m = Boolean.valueOf(rfs.m());
        }

        public final defpackage.rfs.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.rfs.a a(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.b = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null icon");
        }

        public final defpackage.rfs.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a d(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a e(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a f(boolean z) {
            this.h = Boolean.FALSE;
            return this;
        }

        public final defpackage.rfs.a g(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a h(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a i(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a j(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.rfs.a k(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public final rfs a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" title");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" icon");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isImageRounded");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" canBan");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" canGoToArtist");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" canAddToPlaylist");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" canAddToQueue");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" localBanIcon");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" canGoToRadio");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" shouldAddFollowToToolbar");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" canSaveAllTracks");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" canReport");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" canAddToHomeScreen");
                str = sb13.toString();
            }
            if (str.isEmpty()) {
                rfm rfm = new rfm(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), 0);
                return rfm;
            }
            StringBuilder sb14 = new StringBuilder("Missing required properties:");
            sb14.append(str);
            throw new IllegalStateException(sb14.toString());
        }
    }

    /* synthetic */ rfm(String str, SpotifyIconV2 spotifyIconV2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, byte b2) {
        this(str, spotifyIconV2, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
    }

    private rfm(String str, SpotifyIconV2 spotifyIconV2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = str;
        this.b = spotifyIconV2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = z11;
    }

    public final String a() {
        return this.a;
    }

    public final SpotifyIconV2 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.l;
    }

    public final boolean m() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreeTierToolbarConfiguration{title=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", isImageRounded=");
        sb.append(this.c);
        sb.append(", canBan=");
        sb.append(this.d);
        sb.append(", canGoToArtist=");
        sb.append(this.e);
        sb.append(", canAddToPlaylist=");
        sb.append(this.f);
        sb.append(", canAddToQueue=");
        sb.append(this.g);
        sb.append(", localBanIcon=");
        sb.append(this.h);
        sb.append(", canGoToRadio=");
        sb.append(this.i);
        sb.append(", shouldAddFollowToToolbar=");
        sb.append(this.j);
        sb.append(", canSaveAllTracks=");
        sb.append(this.k);
        sb.append(", canReport=");
        sb.append(this.l);
        sb.append(", canAddToHomeScreen=");
        sb.append(this.m);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfs) {
            rfs rfs = (rfs) obj;
            return this.a.equals(rfs.a()) && this.b.equals(rfs.b()) && this.c == rfs.c() && this.d == rfs.d() && this.e == rfs.e() && this.f == rfs.f() && this.g == rfs.g() && this.h == rfs.h() && this.i == rfs.i() && this.j == rfs.j() && this.k == rfs.k() && this.l == rfs.l() && this.m == rfs.m();
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003;
        if (!this.m) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    public final defpackage.rfs.a n() {
        return new a(this, 0);
    }
}
