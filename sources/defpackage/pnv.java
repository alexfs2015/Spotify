package defpackage;

/* renamed from: pnv reason: default package */
abstract class pnv extends poc {
    final boolean a;
    final pod b;

    /* renamed from: pnv$a */
    static final class a implements defpackage.poc.a {
        private Boolean a;
        private pod b;

        /* synthetic */ a(poc poc, byte b2) {
            this(poc);
        }

        a() {
        }

        private a(poc poc) {
            this.a = Boolean.valueOf(poc.a());
            this.b = poc.b();
        }

        public final defpackage.poc.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.poc.a a(pod pod) {
            this.b = pod;
            return this;
        }

        public final poc a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isSnackBarDisplaying");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new pnx(this.a.booleanValue(), this.b);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    pnv(boolean z, pod pod) {
        this.a = z;
        this.b = pod;
    }

    public final boolean a() {
        return this.a;
    }

    public final pod b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerModel{isSnackBarDisplaying=");
        sb.append(this.a);
        sb.append(", bannerPresentationModel=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof poc) {
            poc poc = (poc) obj;
            if (this.a == poc.a()) {
                pod pod = this.b;
                return pod != null ? pod.equals(poc.b()) : poc.b() == null;
            }
        }
    }

    public int hashCode() {
        int i = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        pod pod = this.b;
        return i ^ (pod == null ? 0 : pod.hashCode());
    }

    public final defpackage.poc.a c() {
        return new a(this, 0);
    }
}
