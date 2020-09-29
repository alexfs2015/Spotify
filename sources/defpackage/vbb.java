package defpackage;

/* renamed from: vbb reason: default package */
final class vbb extends vbg {
    private final vbh b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    /* renamed from: vbb$a */
    static final class a implements defpackage.vbg.a {
        private vbh a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        /* synthetic */ a(vbg vbg, byte b2) {
            this(vbg);
        }

        a() {
        }

        private a(vbg vbg) {
            this.a = vbg.a();
            this.b = Boolean.valueOf(vbg.b());
            this.c = Boolean.valueOf(vbg.c());
            this.d = Boolean.valueOf(vbg.d());
        }

        public final defpackage.vbg.a a(vbh vbh) {
            if (vbh != null) {
                this.a = vbh;
                return this;
            }
            throw new NullPointerException("Null topicsState");
        }

        public final defpackage.vbg.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vbg.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vbg.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final vbg a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" topicsState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" hasConnection");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" hasDoneButton");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" hasComeFromTasteOnboarding");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                vbb vbb = new vbb(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), 0);
                return vbb;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ vbb(vbh vbh, boolean z, boolean z2, boolean z3, byte b2) {
        this(vbh, z, z2, z3);
    }

    private vbb(vbh vbh, boolean z, boolean z2, boolean z3) {
        this.b = vbh;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final vbh a() {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopicPickerModel{topicsState=");
        sb.append(this.b);
        sb.append(", hasConnection=");
        sb.append(this.c);
        sb.append(", hasDoneButton=");
        sb.append(this.d);
        sb.append(", hasComeFromTasteOnboarding=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vbg) {
            vbg vbg = (vbg) obj;
            return this.b.equals(vbg.a()) && this.c == vbg.b() && this.d == vbg.c() && this.e == vbg.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.vbg.a e() {
        return new a(this, 0);
    }
}
