package defpackage;

/* renamed from: uqn reason: default package */
abstract class uqn extends uqu {
    final boolean a;
    final boolean b;
    final int c;
    private final int e;

    /* renamed from: uqn$a */
    static final class a extends defpackage.uqu.a {
        private Boolean a;
        private Boolean b;
        private Integer c;
        private Integer d;

        /* synthetic */ a(uqu uqu, byte b2) {
            this(uqu);
        }

        a() {
        }

        private a(uqu uqu) {
            this.a = Boolean.valueOf(uqu.a());
            this.b = Boolean.valueOf(uqu.b());
            this.c = Integer.valueOf(uqu.c());
            this.d = Integer.valueOf(uqu.d());
        }

        public final defpackage.uqu.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uqu.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.uqu.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.uqu.a b(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public final uqu a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" tabsCollapseLocked");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" pageSwipeLocked");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" maxTabsOffset");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" tabsOffset");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new uqo(this.a.booleanValue(), this.b.booleanValue(), this.c.intValue(), this.d.intValue());
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    uqn(boolean z, boolean z2, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.e = i;
        this.c = i2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public int c() {
        return this.e;
    }

    public final int d() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("YourLibraryState{tabsCollapseLocked=");
        sb.append(this.a);
        sb.append(", pageSwipeLocked=");
        sb.append(this.b);
        sb.append(", maxTabsOffset=");
        sb.append(this.e);
        sb.append(", tabsOffset=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqu) {
            uqu uqu = (uqu) obj;
            return this.a == uqu.a() && this.b == uqu.b() && this.e == uqu.c() && this.c == uqu.d();
        }
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return ((((i2 ^ i) * 1000003) ^ this.e) * 1000003) ^ this.c;
    }

    public final defpackage.uqu.a e() {
        return new a(this, 0);
    }
}
