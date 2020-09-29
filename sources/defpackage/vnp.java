package defpackage;

/* renamed from: vnp reason: default package */
final class vnp extends vnu {
    private final vnv b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    /* renamed from: vnp$a */
    static final class a implements defpackage.vnu.a {
        private vnv a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        a() {
        }

        private a(vnu vnu) {
            this.a = vnu.a();
            this.b = Boolean.valueOf(vnu.b());
            this.c = Boolean.valueOf(vnu.c());
            this.d = Boolean.valueOf(vnu.d());
        }

        /* synthetic */ a(vnu vnu, byte b2) {
            this(vnu);
        }

        public final defpackage.vnu.a a(vnv vnv) {
            if (vnv != null) {
                this.a = vnv;
                return this;
            }
            throw new NullPointerException("Null topicsState");
        }

        public final defpackage.vnu.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final vnu a() {
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
                vnp vnp = new vnp(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), 0);
                return vnp;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.vnu.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vnu.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    private vnp(vnv vnv, boolean z, boolean z2, boolean z3) {
        this.b = vnv;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    /* synthetic */ vnp(vnv vnv, boolean z, boolean z2, boolean z3, byte b2) {
        this(vnv, z, z2, z3);
    }

    public final vnv a() {
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

    public final defpackage.vnu.a e() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vnu) {
            vnu vnu = (vnu) obj;
            return this.b.equals(vnu.a()) && this.c == vnu.b() && this.d == vnu.c() && this.e == vnu.d();
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
}
