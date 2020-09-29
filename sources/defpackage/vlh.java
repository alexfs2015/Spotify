package defpackage;

/* renamed from: vlh reason: default package */
abstract class vlh extends vlm {
    final vln a;
    final boolean b;
    final boolean c;

    /* renamed from: vlh$a */
    static final class a extends defpackage.vlm.a {
        private vln a;
        private Boolean b;
        private Boolean c;

        /* synthetic */ a(vlm vlm, byte b2) {
            this(vlm);
        }

        a() {
        }

        private a(vlm vlm) {
            this.a = vlm.a();
            this.b = Boolean.valueOf(vlm.b());
            this.c = Boolean.valueOf(vlm.c());
        }

        public final defpackage.vlm.a a(vln vln) {
            if (vln != null) {
                this.a = vln;
                return this;
            }
            throw new NullPointerException("Null emailState");
        }

        public final defpackage.vlm.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vlm.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final vlm a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" emailState");
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
                sb3.append(" useHints");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new vli(this.a, this.b.booleanValue(), this.c.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    vlh(vln vln, boolean z, boolean z2) {
        if (vln != null) {
            this.a = vln;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null emailState");
    }

    public final vln a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EmailModel{emailState=");
        sb.append(this.a);
        sb.append(", hasConnection=");
        sb.append(this.b);
        sb.append(", useHints=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlm) {
            vlm vlm = (vlm) obj;
            return this.a.equals(vlm.a()) && this.b == vlm.b() && this.c == vlm.c();
        }
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final defpackage.vlm.a d() {
        return new a(this, 0);
    }
}
