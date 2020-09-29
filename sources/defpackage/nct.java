package defpackage;

/* renamed from: nct reason: default package */
final class nct extends ncv {
    private final uyr a;
    private final int b;

    /* renamed from: nct$a */
    public static final class a implements defpackage.ncv.a {
        private uyr a;
        private Integer b;

        public final defpackage.ncv.a a(uyr uyr) {
            if (uyr != null) {
                this.a = uyr;
                return this;
            }
            throw new NullPointerException("Null artist");
        }

        public final defpackage.ncv.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final ncv a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" artist");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" index");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new nct(this.a, this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ nct(uyr uyr, int i, byte b2) {
        this(uyr, i);
    }

    private nct(uyr uyr, int i) {
        this.a = uyr;
        this.b = i;
    }

    public final uyr a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuArtist{artist=");
        sb.append(this.a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ncv) {
            ncv ncv = (ncv) obj;
            return this.a.equals(ncv.a()) && this.b == ncv.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
