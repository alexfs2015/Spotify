package defpackage;

/* renamed from: mpk reason: default package */
final class mpk extends mpo {
    private final mpp a;

    /* renamed from: mpk$a */
    public static final class a implements defpackage.mpo.a {
        private mpp a;

        public a() {
        }

        private a(mpo mpo) {
            this.a = mpo.a();
        }

        /* synthetic */ a(mpo mpo, byte b) {
            this(mpo);
        }

        public final defpackage.mpo.a a(mpp mpp) {
            if (mpp != null) {
                this.a = mpp;
                return this;
            }
            throw new NullPointerException("Null loadedState");
        }

        public final mpo a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" loadedState");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new mpk(this.a, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private mpk(mpp mpp) {
        this.a = mpp;
    }

    /* synthetic */ mpk(mpp mpp, byte b) {
        this(mpp);
    }

    public final mpp a() {
        return this.a;
    }

    public final defpackage.mpo.a b() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mpo)) {
            return false;
        }
        return this.a.equals(((mpo) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyMixHubModel{loadedState=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
