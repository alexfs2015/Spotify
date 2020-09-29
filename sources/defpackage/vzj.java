package defpackage;

/* renamed from: vzj reason: default package */
abstract class vzj extends vzo {
    final vzp a;
    final boolean b;
    final boolean c;

    /* renamed from: vzj$a */
    static final class a implements defpackage.vzo.a {
        private vzp a;
        private Boolean b;
        private Boolean c;

        a() {
        }

        private a(vzo vzo) {
            this.a = vzo.a();
            this.b = Boolean.valueOf(vzo.b());
            this.c = Boolean.valueOf(vzo.c());
        }

        /* synthetic */ a(vzo vzo, byte b2) {
            this(vzo);
        }

        public final defpackage.vzo.a a(vzp vzp) {
            if (vzp != null) {
                this.a = vzp;
                return this;
            }
            throw new NullPointerException("Null nameState");
        }

        public final defpackage.vzo.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final vzo a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" nameState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" isLoading");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" requiresMarketingOptInText");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new vzk(this.a, this.b.booleanValue(), this.c.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.vzo.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    vzj(vzp vzp, boolean z, boolean z2) {
        if (vzp != null) {
            this.a = vzp;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null nameState");
    }

    public final vzp a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final defpackage.vzo.a d() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vzo) {
            vzo vzo = (vzo) obj;
            return this.a.equals(vzo.a()) && this.b == vzo.b() && this.c == vzo.c();
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

    public String toString() {
        StringBuilder sb = new StringBuilder("NameModel{nameState=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", requiresMarketingOptInText=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
