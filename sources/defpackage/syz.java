package defpackage;

/* renamed from: syz reason: default package */
final class syz extends szk {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;
    private final boolean h;
    private final String i;

    /* renamed from: syz$a */
    static final class a extends defpackage.szk.a {
        private String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private Integer e;
        private Integer f;
        private Boolean g;
        private String h;

        a() {
        }

        public final defpackage.szk.a a(int i) {
            this.e = Integer.valueOf(0);
            return this;
        }

        public final defpackage.szk.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.szk.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final szk a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
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
                sb3.append(" clearBackstack");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" crossfade");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" customEnterAnimation");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" customExitAnimation");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" popCurrent");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" popToTag");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                syz syz = new syz(this.a, this.b, null, this.c.booleanValue(), this.d.booleanValue(), this.e.intValue(), this.f.intValue(), this.g.booleanValue(), this.h, 0);
                return syz;
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }

        public final defpackage.szk.a b(int i) {
            this.f = Integer.valueOf(0);
            return this;
        }

        public final defpackage.szk.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.szk.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.szk.a c(String str) {
            this.h = str;
            return this;
        }

        public final defpackage.szk.a c(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }
    }

    private syz(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3, boolean z3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = i3;
        this.h = z3;
        this.i = str4;
    }

    /* synthetic */ syz(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3, boolean z3, String str4, byte b2) {
        this(str, str2, str3, z, z2, i2, i3, z3, str4);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof szk) {
            szk szk = (szk) obj;
            if (this.a.equals(szk.a()) && this.b.equals(szk.b())) {
                String str = this.c;
                if (str != null ? str.equals(szk.c()) : szk.c() == null) {
                    return this.d == szk.d() && this.e == szk.e() && this.f == szk.f() && this.g == szk.g() && this.h == szk.h() && this.i.equals(szk.i());
                }
            }
        }
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 1231;
        int hashCode2 = (((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003;
        if (!this.h) {
            i2 = 1237;
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.i.hashCode();
    }

    public final String i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationIntent{uri=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", clearBackstack=");
        sb.append(this.d);
        sb.append(", crossfade=");
        sb.append(this.e);
        sb.append(", customEnterAnimation=");
        sb.append(this.f);
        sb.append(", customExitAnimation=");
        sb.append(this.g);
        sb.append(", popCurrent=");
        sb.append(this.h);
        sb.append(", popToTag=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
