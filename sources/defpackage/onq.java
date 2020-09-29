package defpackage;

/* renamed from: onq reason: default package */
final class onq extends ood {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    /* renamed from: onq$a */
    static final class a implements defpackage.ood.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;

        a() {
        }

        private a(ood ood) {
            this.a = Boolean.valueOf(ood.a());
            this.b = Boolean.valueOf(ood.b());
            this.c = Boolean.valueOf(ood.c());
            this.d = Boolean.valueOf(ood.d());
            this.e = Boolean.valueOf(ood.e());
            this.f = Boolean.valueOf(ood.f());
            this.g = Boolean.valueOf(ood.g());
            this.h = Boolean.valueOf(ood.h());
            this.i = Boolean.valueOf(ood.i());
        }

        /* synthetic */ a(ood ood, byte b2) {
            this(ood);
        }

        public final defpackage.ood.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ood a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playAndEditButton");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" addSongsButton");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" downloadToggleSpacing");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" downloadToggle");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" filterAndSort");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" trackCloud");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" trackList");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" playlistExtender");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" moreLikeThis");
                str = sb9.toString();
            }
            if (str.isEmpty()) {
                onq onq = new onq(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), 0);
                return onq;
            }
            StringBuilder sb10 = new StringBuilder("Missing required properties:");
            sb10.append(str);
            throw new IllegalStateException(sb10.toString());
        }

        public final defpackage.ood.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ood.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ood.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ood.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ood.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ood.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ood.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ood.a i(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }
    }

    private onq(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
    }

    /* synthetic */ onq(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, byte b2) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9);
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

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ood) {
            ood ood = (ood) obj;
            return this.b == ood.a() && this.c == ood.b() && this.d == ood.c() && this.e == ood.d() && this.f == ood.e() && this.g == ood.f() && this.h == ood.g() && this.i == ood.h() && this.j == ood.i();
        }
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003;
        if (!this.j) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    public final boolean i() {
        return this.j;
    }

    public final defpackage.ood.a j() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComponentConfiguration{playAndEditButton=");
        sb.append(this.b);
        sb.append(", addSongsButton=");
        sb.append(this.c);
        sb.append(", downloadToggleSpacing=");
        sb.append(this.d);
        sb.append(", downloadToggle=");
        sb.append(this.e);
        sb.append(", filterAndSort=");
        sb.append(this.f);
        sb.append(", trackCloud=");
        sb.append(this.g);
        sb.append(", trackList=");
        sb.append(this.h);
        sb.append(", playlistExtender=");
        sb.append(this.i);
        sb.append(", moreLikeThis=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }
}
