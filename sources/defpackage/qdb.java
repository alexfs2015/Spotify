package defpackage;

/* renamed from: qdb reason: default package */
final class qdb extends qdg {
    private final qdc a;

    /* renamed from: qdb$a */
    public static final class a implements defpackage.qdg.a {
        private qdc a;

        public a() {
        }

        private a(qdg qdg) {
            this.a = qdg.a();
        }

        /* synthetic */ a(qdg qdg, byte b) {
            this(qdg);
        }

        public final defpackage.qdg.a a(qdc qdc) {
            if (qdc != null) {
                this.a = qdc;
                return this;
            }
            throw new NullPointerException("Null loadedState");
        }

        public final qdg a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" loadedState");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new qdb(this.a, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private qdb(qdc qdc) {
        this.a = qdc;
    }

    /* synthetic */ qdb(qdc qdc, byte b) {
        this(qdc);
    }

    public final qdc a() {
        return this.a;
    }

    public final defpackage.qdg.a b() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qdg)) {
            return false;
        }
        return this.a.equals(((qdg) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RadioHubModel{loadedState=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
