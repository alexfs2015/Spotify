package defpackage;

/* renamed from: pxl reason: default package */
final class pxl extends pxp {
    private final pxq a;
    private final pxq b;
    private final pxq c;

    /* renamed from: pxl$a */
    static final class a extends defpackage.pxp.a {
        private pxq a;
        private pxq b;
        private pxq c;

        a() {
        }

        private a(pxp pxp) {
            this.a = pxp.a();
            this.b = pxp.b();
            this.c = pxp.c();
        }

        /* synthetic */ a(pxp pxp, byte b2) {
            this(pxp);
        }

        public final defpackage.pxp.a a(pxq pxq) {
            if (pxq != null) {
                this.a = pxq;
                return this;
            }
            throw new NullPointerException("Null bannerDisplayStatus");
        }

        public final pxp a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" bannerDisplayStatus");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" noteDisplayStatus");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" cardDisplayStatus");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new pxl(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.pxp.a b(pxq pxq) {
            if (pxq != null) {
                this.b = pxq;
                return this;
            }
            throw new NullPointerException("Null noteDisplayStatus");
        }

        public final defpackage.pxp.a c(pxq pxq) {
            if (pxq != null) {
                this.c = pxq;
                return this;
            }
            throw new NullPointerException("Null cardDisplayStatus");
        }
    }

    private pxl(pxq pxq, pxq pxq2, pxq pxq3) {
        this.a = pxq;
        this.b = pxq2;
        this.c = pxq3;
    }

    /* synthetic */ pxl(pxq pxq, pxq pxq2, pxq pxq3, byte b2) {
        this(pxq, pxq2, pxq3);
    }

    public final pxq a() {
        return this.a;
    }

    public final pxq b() {
        return this.b;
    }

    public final pxq c() {
        return this.c;
    }

    public final defpackage.pxp.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxp) {
            pxp pxp = (pxp) obj;
            return this.a.equals(pxp.a()) && this.b.equals(pxp.b()) && this.c.equals(pxp.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayControllerModel{bannerDisplayStatus=");
        sb.append(this.a);
        sb.append(", noteDisplayStatus=");
        sb.append(this.b);
        sb.append(", cardDisplayStatus=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
