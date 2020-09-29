package defpackage;

/* renamed from: pop reason: default package */
final class pop extends pot {
    private final pou a;
    private final pou b;
    private final pou c;

    /* renamed from: pop$a */
    static final class a extends defpackage.pot.a {
        private pou a;
        private pou b;
        private pou c;

        /* synthetic */ a(pot pot, byte b2) {
            this(pot);
        }

        a() {
        }

        private a(pot pot) {
            this.a = pot.a();
            this.b = pot.b();
            this.c = pot.c();
        }

        public final defpackage.pot.a a(pou pou) {
            if (pou != null) {
                this.a = pou;
                return this;
            }
            throw new NullPointerException("Null bannerDisplayStatus");
        }

        public final defpackage.pot.a b(pou pou) {
            if (pou != null) {
                this.b = pou;
                return this;
            }
            throw new NullPointerException("Null noteDisplayStatus");
        }

        public final defpackage.pot.a c(pou pou) {
            if (pou != null) {
                this.c = pou;
                return this;
            }
            throw new NullPointerException("Null cardDisplayStatus");
        }

        public final pot a() {
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
                return new pop(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ pop(pou pou, pou pou2, pou pou3, byte b2) {
        this(pou, pou2, pou3);
    }

    private pop(pou pou, pou pou2, pou pou3) {
        this.a = pou;
        this.b = pou2;
        this.c = pou3;
    }

    public final pou a() {
        return this.a;
    }

    public final pou b() {
        return this.b;
    }

    public final pou c() {
        return this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pot) {
            pot pot = (pot) obj;
            return this.a.equals(pot.a()) && this.b.equals(pot.b()) && this.c.equals(pot.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final defpackage.pot.a d() {
        return new a(this, 0);
    }
}
