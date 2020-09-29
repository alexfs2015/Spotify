package defpackage;

/* renamed from: pwr reason: default package */
abstract class pwr extends pwy {
    final boolean a;
    final pwz b;

    /* renamed from: pwr$a */
    static final class a implements defpackage.pwy.a {
        private Boolean a;
        private pwz b;

        a() {
        }

        private a(pwy pwy) {
            this.a = Boolean.valueOf(pwy.a());
            this.b = pwy.b();
        }

        /* synthetic */ a(pwy pwy, byte b2) {
            this(pwy);
        }

        public final defpackage.pwy.a a(pwz pwz) {
            this.b = pwz;
            return this;
        }

        public final defpackage.pwy.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final pwy a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isSnackBarDisplaying");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new pwt(this.a.booleanValue(), this.b);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    pwr(boolean z, pwz pwz) {
        this.a = z;
        this.b = pwz;
    }

    public final boolean a() {
        return this.a;
    }

    public final pwz b() {
        return this.b;
    }

    public final defpackage.pwy.a c() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pwy) {
            pwy pwy = (pwy) obj;
            if (this.a == pwy.a()) {
                pwz pwz = this.b;
                return pwz != null ? pwz.equals(pwy.b()) : pwy.b() == null;
            }
        }
    }

    public int hashCode() {
        int i = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        pwz pwz = this.b;
        return i ^ (pwz == null ? 0 : pwz.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerModel{isSnackBarDisplaying=");
        sb.append(this.a);
        sb.append(", bannerPresentationModel=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
