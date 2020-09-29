package defpackage;

/* renamed from: nii reason: default package */
final class nii extends nik {
    private final vku a;
    private final int b;

    /* renamed from: nii$a */
    public static final class a implements defpackage.nik.a {
        private vku a;
        private Integer b;

        public final defpackage.nik.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.nik.a a(vku vku) {
            if (vku != null) {
                this.a = vku;
                return this;
            }
            throw new NullPointerException("Null artist");
        }

        public final nik a() {
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
                return new nii(this.a, this.b.intValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private nii(vku vku, int i) {
        this.a = vku;
        this.b = i;
    }

    /* synthetic */ nii(vku vku, int i, byte b2) {
        this(vku, i);
    }

    public final vku a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nik) {
            nik nik = (nik) obj;
            return this.a.equals(nik.a()) && this.b == nik.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuArtist{artist=");
        sb.append(this.a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
