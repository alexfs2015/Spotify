package defpackage;

/* renamed from: oye reason: default package */
final class oye extends defpackage.oyn.a {
    private final oqg a;
    private final oqf b;

    /* renamed from: oye$a */
    static final class a implements C0073a {
        private oqg a;
        private oqf b;

        a() {
        }

        public final C0073a a(oqf oqf) {
            if (oqf != null) {
                this.b = oqf;
                return this;
            }
            throw new NullPointerException("Null playlistItems");
        }

        public final C0073a a(oqg oqg) {
            if (oqg != null) {
                this.a = oqg;
                return this;
            }
            throw new NullPointerException("Null playlistMetadata");
        }

        public final defpackage.oyn.a a() {
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
                return new oye(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private oye(oqg oqg, oqf oqf) {
        this.a = oqg;
        this.b = oqf;
    }

    /* synthetic */ oye(oqg oqg, oqf oqf, byte b2) {
        this(oqg, oqf);
    }

    public final oqg a() {
        return this.a;
    }

    public final oqf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.oyn.a) {
            defpackage.oyn.a aVar = (defpackage.oyn.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{playlistMetadata=");
        sb.append(this.a);
        sb.append(", playlistItems=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
