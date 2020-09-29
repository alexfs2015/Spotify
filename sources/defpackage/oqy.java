package defpackage;

/* renamed from: oqy reason: default package */
final class oqy extends defpackage.orh.a {
    private final ojc a;
    private final ojb b;

    /* renamed from: oqy$a */
    static final class a implements C0072a {
        private ojc a;
        private ojb b;

        a() {
        }

        public final C0072a a(ojc ojc) {
            if (ojc != null) {
                this.a = ojc;
                return this;
            }
            throw new NullPointerException("Null playlistMetadata");
        }

        public final C0072a a(ojb ojb) {
            if (ojb != null) {
                this.b = ojb;
                return this;
            }
            throw new NullPointerException("Null playlistItems");
        }

        public final defpackage.orh.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playlistMetadata");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playlistItems");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new oqy(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ oqy(ojc ojc, ojb ojb, byte b2) {
        this(ojc, ojb);
    }

    private oqy(ojc ojc, ojb ojb) {
        this.a = ojc;
        this.b = ojb;
    }

    public final ojc a() {
        return this.a;
    }

    public final ojb b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{playlistMetadata=");
        sb.append(this.a);
        sb.append(", playlistItems=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.orh.a) {
            defpackage.orh.a aVar = (defpackage.orh.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
