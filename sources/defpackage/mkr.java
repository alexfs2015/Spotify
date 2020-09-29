package defpackage;

/* renamed from: mkr reason: default package */
final class mkr extends mkv {
    private final mkw a;

    /* renamed from: mkr$a */
    public static final class a implements defpackage.mkv.a {
        private mkw a;

        /* synthetic */ a(mkv mkv, byte b) {
            this(mkv);
        }

        public a() {
        }

        private a(mkv mkv) {
            this.a = mkv.a();
        }

        public final defpackage.mkv.a a(mkw mkw) {
            if (mkw != null) {
                this.a = mkw;
                return this;
            }
            throw new NullPointerException("Null loadedState");
        }

        public final mkv a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" loadedState");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new mkr(this.a, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ mkr(mkw mkw, byte b) {
        this(mkw);
    }

    private mkr(mkw mkw) {
        this.a = mkw;
    }

    public final mkw a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyMixHubModel{loadedState=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mkv)) {
            return false;
        }
        return this.a.equals(((mkv) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final defpackage.mkv.a b() {
        return new a(this, 0);
    }
}
