package defpackage;

/* renamed from: khu reason: default package */
abstract class khu extends khw {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final boolean i;

    /* renamed from: khu$a */
    static final class a implements defpackage.khw.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private Boolean i;

        a() {
        }

        public final defpackage.khw.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null template");
        }

        public final defpackage.khw.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.khw.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null caption");
        }

        public final defpackage.khw.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null imageOne");
        }

        public final defpackage.khw.a e(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null imageTwo");
        }

        public final defpackage.khw.a f(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null imageThree");
        }

        public final defpackage.khw.a g(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null imageFour");
        }

        public final defpackage.khw.a h(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null previewUrl");
        }

        public final defpackage.khw.a a(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final khw a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" template");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" title");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" caption");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" imageOne");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" imageTwo");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" imageThree");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" imageFour");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" previewUrl");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" isLastSeason");
                str = sb9.toString();
            }
            if (str.isEmpty()) {
                khv khv = new khv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i.booleanValue());
                return khv;
            }
            StringBuilder sb10 = new StringBuilder("Missing required properties:");
            sb10.append(str);
            throw new IllegalStateException(sb10.toString());
        }
    }

    khu(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
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
                                        this.i = z;
                                        return;
                                    }
                                    throw new NullPointerException("Null previewUrl");
                                }
                                throw new NullPointerException("Null imageFour");
                            }
                            throw new NullPointerException("Null imageThree");
                        }
                        throw new NullPointerException("Null imageTwo");
                    }
                    throw new NullPointerException("Null imageOne");
                }
                throw new NullPointerException("Null caption");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null template");
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

    public final boolean i() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Season{template=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", caption=");
        sb.append(this.c);
        sb.append(", imageOne=");
        sb.append(this.d);
        sb.append(", imageTwo=");
        sb.append(this.e);
        sb.append(", imageThree=");
        sb.append(this.f);
        sb.append(", imageFour=");
        sb.append(this.g);
        sb.append(", previewUrl=");
        sb.append(this.h);
        sb.append(", isLastSeason=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khw) {
            khw khw = (khw) obj;
            return this.a.equals(khw.a()) && this.b.equals(khw.b()) && this.c.equals(khw.c()) && this.d.equals(khw.d()) && this.e.equals(khw.e()) && this.f.equals(khw.f()) && this.g.equals(khw.g()) && this.h.equals(khw.h()) && this.i == khw.i();
        }
    }

    public int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237);
    }
}
