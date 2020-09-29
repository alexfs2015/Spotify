package defpackage;

import com.spotify.music.features.profile.model.LoadingState;

/* renamed from: psb reason: default package */
abstract class psb extends psg {
    final String a;
    final String b;
    final String c;
    final boolean d;
    final boolean e;
    final String f;
    final boolean g;
    final int h;
    final int i;
    final int j;
    final boolean k;
    final boolean l;
    final LoadingState m;
    final prg n;
    final prg o;

    /* renamed from: psb$a */
    static final class a extends defpackage.psg.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private Boolean e;
        private String f;
        private Boolean g;
        private Integer h;
        private Integer i;
        private Integer j;
        private Boolean k;
        private Boolean l;
        private LoadingState m;
        private prg n;
        private prg o;

        a() {
        }

        private a(psg psg) {
            this.a = psg.a();
            this.b = psg.b();
            this.c = psg.c();
            this.d = Boolean.valueOf(psg.d());
            this.e = Boolean.valueOf(psg.e());
            this.f = psg.f();
            this.g = Boolean.valueOf(psg.g());
            this.h = Integer.valueOf(psg.h());
            this.i = Integer.valueOf(psg.i());
            this.j = Integer.valueOf(psg.j());
            this.k = Boolean.valueOf(psg.k());
            this.l = Boolean.valueOf(psg.l());
            this.m = psg.m();
            this.n = psg.n();
            this.o = psg.o();
        }

        /* synthetic */ a(psg psg, byte b2) {
            this(psg);
        }

        public final defpackage.psg.a a(int i2) {
            this.h = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.psg.a a(LoadingState loadingState) {
            if (loadingState != null) {
                this.m = loadingState;
                return this;
            }
            throw new NullPointerException("Null loadingState");
        }

        public final defpackage.psg.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        public final defpackage.psg.a a(prg prg) {
            if (prg != null) {
                this.n = prg;
                return this;
            }
            throw new NullPointerException("Null recentlyPlayedArtists");
        }

        public final defpackage.psg.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final psg a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" username");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" displayName");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" verified");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" reportAbuseEnabled");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" reportAbuseUrl");
                str = sb5.toString();
            }
            if (this.g == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" followed");
                str = sb6.toString();
            }
            if (this.h == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" playlistsCount");
                str = sb7.toString();
            }
            if (this.i == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" followersCount");
                str = sb8.toString();
            }
            if (this.j == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" followingCount");
                str = sb9.toString();
            }
            if (this.k == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" currentUsersProfile");
                str = sb10.toString();
            }
            if (this.l == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" connected");
                str = sb11.toString();
            }
            if (this.m == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" loadingState");
                str = sb12.toString();
            }
            if (this.n == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" recentlyPlayedArtists");
                str = sb13.toString();
            }
            if (this.o == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" publicPlaylists");
                str = sb14.toString();
            }
            if (str.isEmpty()) {
                psc psc = new psc(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), this.f, this.g.booleanValue(), this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k.booleanValue(), this.l.booleanValue(), this.m, this.n, this.o);
                return psc;
            }
            StringBuilder sb15 = new StringBuilder("Missing required properties:");
            sb15.append(str);
            throw new IllegalStateException(sb15.toString());
        }

        public final defpackage.psg.a b(int i2) {
            this.i = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.psg.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        public final defpackage.psg.a b(prg prg) {
            if (prg != null) {
                this.o = prg;
                return this;
            }
            throw new NullPointerException("Null publicPlaylists");
        }

        public final defpackage.psg.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.psg.a c(int i2) {
            this.j = Integer.valueOf(i2);
            return this;
        }

        public final defpackage.psg.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.psg.a c(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.psg.a d(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null reportAbuseUrl");
        }

        public final defpackage.psg.a d(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.psg.a e(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }
    }

    psb(String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, int i2, int i3, int i4, boolean z4, boolean z5, LoadingState loadingState, prg prg, prg prg2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                this.d = z;
                this.e = z2;
                if (str4 != null) {
                    this.f = str4;
                    this.g = z3;
                    this.h = i2;
                    this.i = i3;
                    this.j = i4;
                    this.k = z4;
                    this.l = z5;
                    if (loadingState != null) {
                        this.m = loadingState;
                        if (prg != null) {
                            this.n = prg;
                            if (prg2 != null) {
                                this.o = prg2;
                                return;
                            }
                            throw new NullPointerException("Null publicPlaylists");
                        }
                        throw new NullPointerException("Null recentlyPlayedArtists");
                    }
                    throw new NullPointerException("Null loadingState");
                }
                throw new NullPointerException("Null reportAbuseUrl");
            }
            throw new NullPointerException("Null displayName");
        }
        throw new NullPointerException("Null username");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof psg) {
            psg psg = (psg) obj;
            if (this.a.equals(psg.a()) && this.b.equals(psg.b())) {
                String str = this.c;
                if (str != null ? str.equals(psg.c()) : psg.c() == null) {
                    return this.d == psg.d() && this.e == psg.e() && this.f.equals(psg.f()) && this.g == psg.g() && this.h == psg.h() && this.i == psg.i() && this.j == psg.j() && this.k == psg.k() && this.l == psg.l() && this.m.equals(psg.m()) && this.n.equals(psg.n()) && this.o.equals(psg.o());
                }
            }
        }
    }

    public final String f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 1231;
        int hashCode2 = (((((((((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return ((((((hashCode2 ^ i2) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    public final int i() {
        return this.i;
    }

    public final int j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.l;
    }

    public final LoadingState m() {
        return this.m;
    }

    public final prg n() {
        return this.n;
    }

    public final prg o() {
        return this.o;
    }

    public final defpackage.psg.a p() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileModel{username=");
        sb.append(this.a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", verified=");
        sb.append(this.d);
        sb.append(", reportAbuseEnabled=");
        sb.append(this.e);
        sb.append(", reportAbuseUrl=");
        sb.append(this.f);
        sb.append(", followed=");
        sb.append(this.g);
        sb.append(", playlistsCount=");
        sb.append(this.h);
        sb.append(", followersCount=");
        sb.append(this.i);
        sb.append(", followingCount=");
        sb.append(this.j);
        sb.append(", currentUsersProfile=");
        sb.append(this.k);
        sb.append(", connected=");
        sb.append(this.l);
        sb.append(", loadingState=");
        sb.append(this.m);
        sb.append(", recentlyPlayedArtists=");
        sb.append(this.n);
        sb.append(", publicPlaylists=");
        sb.append(this.o);
        sb.append("}");
        return sb.toString();
    }
}
