package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: rkj reason: default package */
abstract class rkj extends b {
    final String a;
    final String b;
    final SpotifyIconV2 c;
    final SpotifyIconV2 d;
    final boolean e;
    private final String f;

    /* renamed from: rkj$a */
    static final class a extends defpackage.rkm.b.a {
        private String a;
        private String b;
        private String c;
        private SpotifyIconV2 d;
        private SpotifyIconV2 e;
        private Boolean f;

        a() {
        }

        private a(b bVar) {
            this.a = bVar.a();
            this.b = bVar.b();
            this.c = bVar.c();
            this.d = bVar.d();
            this.e = bVar.e();
            this.f = Boolean.valueOf(bVar.f());
        }

        /* synthetic */ a(b bVar, byte b2) {
            this(bVar);
        }

        public final defpackage.rkm.b.a a(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.d = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null inactiveIcon");
        }

        public final defpackage.rkm.b.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.rkm.b.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" inactiveTitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" activeTitle");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" inactiveIcon");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" activeIcon");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isActive");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                rkl rkl = new rkl(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue());
                return rkl;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.rkm.b.a b(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.e = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null activeIcon");
        }

        public final defpackage.rkm.b.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null inactiveTitle");
        }

        public final defpackage.rkm.b.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null activeTitle");
        }
    }

    rkj(String str, String str2, String str3, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, boolean z) {
        if (str != null) {
            this.f = str;
            if (str2 != null) {
                this.a = str2;
                if (str3 != null) {
                    this.b = str3;
                    if (spotifyIconV2 != null) {
                        this.c = spotifyIconV2;
                        if (spotifyIconV22 != null) {
                            this.d = spotifyIconV22;
                            this.e = z;
                            return;
                        }
                        throw new NullPointerException("Null activeIcon");
                    }
                    throw new NullPointerException("Null inactiveIcon");
                }
                throw new NullPointerException("Null activeTitle");
            }
            throw new NullPointerException("Null inactiveTitle");
        }
        throw new NullPointerException("Null id");
    }

    public String a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final SpotifyIconV2 d() {
        return this.c;
    }

    public final SpotifyIconV2 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f.equals(bVar.a()) && this.a.equals(bVar.b()) && this.b.equals(bVar.c()) && this.c.equals(bVar.d()) && this.d.equals(bVar.e()) && this.e == bVar.f();
        }
    }

    public final boolean f() {
        return this.e;
    }

    public final defpackage.rkm.b.a g() {
        return new a(this, 0);
    }

    public int hashCode() {
        return ((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterOption{id=");
        sb.append(this.f);
        sb.append(", inactiveTitle=");
        sb.append(this.a);
        sb.append(", activeTitle=");
        sb.append(this.b);
        sb.append(", inactiveIcon=");
        sb.append(this.c);
        sb.append(", activeIcon=");
        sb.append(this.d);
        sb.append(", isActive=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
