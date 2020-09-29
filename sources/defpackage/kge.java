package defpackage;

/* renamed from: kge reason: default package */
abstract class kge extends kgl {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;

    /* renamed from: kge$a */
    static final class a implements defpackage.kgl.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;

        a() {
        }

        public final defpackage.kgl.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null year");
        }

        public final defpackage.kgl.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null topSongLabel");
        }

        public final defpackage.kgl.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null topSong");
        }

        public final defpackage.kgl.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null topSongImageUrl");
        }

        public final defpackage.kgl.a e(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null topArtistLabel");
        }

        public final defpackage.kgl.a f(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null topArtist");
        }

        public final defpackage.kgl.a g(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null topArtistImageUrl");
        }

        public final defpackage.kgl.a h(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }

        public final kgl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" year");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" topSongLabel");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" topSong");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" topSongImageUrl");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" topArtistLabel");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" topArtist");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" topArtistImageUrl");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" previewUrl");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                kgg kgg = new kgg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                return kgg;
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }
    }

    kge(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        if (str5 != null) {
                            this.e = str5;
                            if (str6 != null) {
                                this.f = str6;
                                if (str7 != null) {
                                    this.g = str7;
                                    if (str8 != null) {
                                        this.h = str8;
                                        return;
                                    }
                                    throw new NullPointerException("Null previewUrl");
                                }
                                throw new NullPointerException("Null topArtistImageUrl");
                            }
                            throw new NullPointerException("Null topArtist");
                        }
                        throw new NullPointerException("Null topArtistLabel");
                    }
                    throw new NullPointerException("Null topSongImageUrl");
                }
                throw new NullPointerException("Null topSong");
            }
            throw new NullPointerException("Null topSongLabel");
        }
        throw new NullPointerException("Null year");
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

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Year{year=");
        sb.append(this.a);
        sb.append(", topSongLabel=");
        sb.append(this.b);
        sb.append(", topSong=");
        sb.append(this.c);
        sb.append(", topSongImageUrl=");
        sb.append(this.d);
        sb.append(", topArtistLabel=");
        sb.append(this.e);
        sb.append(", topArtist=");
        sb.append(this.f);
        sb.append(", topArtistImageUrl=");
        sb.append(this.g);
        sb.append(", previewUrl=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kgl) {
            kgl kgl = (kgl) obj;
            return this.a.equals(kgl.a()) && this.b.equals(kgl.b()) && this.c.equals(kgl.c()) && this.d.equals(kgl.d()) && this.e.equals(kgl.e()) && this.f.equals(kgl.f()) && this.g.equals(kgl.g()) && this.h.equals(kgl.h());
        }
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }
}
