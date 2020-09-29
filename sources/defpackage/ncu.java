package defpackage;

/* renamed from: ncu reason: default package */
final class ncu extends ncw {
    private final uzc a;
    private final int b;

    /* renamed from: ncu$a */
    public static final class a implements defpackage.ncw.a {
        private uzc a;
        private Integer b;

        public final defpackage.ncw.a a(uzc uzc) {
            if (uzc != null) {
                this.a = uzc;
                return this;
            }
            throw new NullPointerException("Null track");
        }

        public final defpackage.ncw.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final ncw a() {
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
                return new ncu(this.a, this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ ncu(uzc uzc, int i, byte b2) {
        this(uzc, i);
    }

    private ncu(uzc uzc, int i) {
        this.a = uzc;
        this.b = i;
    }

    public final uzc a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuTrack{track=");
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
        if (obj instanceof ncw) {
            ncw ncw = (ncw) obj;
            return this.a.equals(ncw.a()) && this.b == ncw.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
