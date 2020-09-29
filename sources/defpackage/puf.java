package defpackage;

/* renamed from: puf reason: default package */
final class puf extends puk {
    private final pug a;

    /* renamed from: puf$a */
    public static final class a implements defpackage.puk.a {
        private pug a;

        /* synthetic */ a(puk puk, byte b) {
            this(puk);
        }

        public a() {
        }

        private a(puk puk) {
            this.a = puk.a();
        }

        public final defpackage.puk.a a(pug pug) {
            if (pug != null) {
                this.a = pug;
                return this;
            }
            throw new NullPointerException("Null loadedState");
        }

        public final puk a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" loadedState");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new puf(this.a, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ puf(pug pug, byte b) {
        this(pug);
    }

    private puf(pug pug) {
        this.a = pug;
    }

    public final pug a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RadioHubModel{loadedState=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof puk)) {
            return false;
        }
        return this.a.equals(((puk) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final defpackage.puk.a b() {
        return new a(this, 0);
    }
}
