package defpackage;

/* renamed from: vza reason: default package */
abstract class vza extends vzg {
    final vzc a;
    final boolean b;

    /* renamed from: vza$a */
    static final class a implements defpackage.vzg.a {
        private vzc a;
        private Boolean b;

        a() {
        }

        private a(vzg vzg) {
            this.a = vzg.a();
            this.b = Boolean.valueOf(vzg.b());
        }

        /* synthetic */ a(vzg vzg, byte b2) {
            this(vzg);
        }

        public final defpackage.vzg.a a(vzc vzc) {
            if (vzc != null) {
                this.a = vzc;
                return this;
            }
            throw new NullPointerException("Null gender");
        }

        public final defpackage.vzg.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final vzg a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" gender");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" noneBinaryGenderEnabled");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vzb(this.a, this.b.booleanValue());
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    vza(vzc vzc, boolean z) {
        if (vzc != null) {
            this.a = vzc;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null gender");
    }

    public final vzc a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final defpackage.vzg.a c() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vzg) {
            vzg vzg = (vzg) obj;
            return this.a.equals(vzg.a()) && this.b == vzg.b();
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GenderModel{gender=");
        sb.append(this.a);
        sb.append(", noneBinaryGenderEnabled=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
