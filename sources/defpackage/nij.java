package defpackage;

/* renamed from: nij reason: default package */
final class nij extends nil {
    private final vlf a;
    private final int b;

    /* renamed from: nij$a */
    public static final class a implements defpackage.nil.a {
        private vlf a;
        private Integer b;

        public final defpackage.nil.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.nil.a a(vlf vlf) {
            if (vlf != null) {
                this.a = vlf;
                return this;
            }
            throw new NullPointerException("Null track");
        }

        public final nil a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" track");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" index");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new nij(this.a, this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private nij(vlf vlf, int i) {
        this.a = vlf;
        this.b = i;
    }

    /* synthetic */ nij(vlf vlf, int i, byte b2) {
        this(vlf, i);
    }

    public final vlf a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nil) {
            nil nil = (nil) obj;
            return this.a.equals(nil.a()) && this.b == nil.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuTrack{track=");
        sb.append(this.a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
