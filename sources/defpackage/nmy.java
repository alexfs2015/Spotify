package defpackage;

import java.util.List;

/* renamed from: nmy reason: default package */
final class nmy extends nnd {
    private final uzb a;
    private final List<nnc> b;

    /* renamed from: nmy$a */
    static final class a implements defpackage.nnd.a {
        private uzb a;
        private List<nnc> b;

        a() {
        }

        public final defpackage.nnd.a a(uzb uzb) {
            if (uzb != null) {
                this.a = uzb;
                return this;
            }
            throw new NullPointerException("Null playlistItem");
        }

        public final defpackage.nnd.a a(List<nnc> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null affinityUsers");
        }

        public final nnd a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playlistItem");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" affinityUsers");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new nmy(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ nmy(uzb uzb, List list, byte b2) {
        this(uzb, list);
    }

    private nmy(uzb uzb, List<nnc> list) {
        this.a = uzb;
        this.b = list;
    }

    public final uzb a() {
        return this.a;
    }

    public final List<nnc> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeMixPlaylistItem{playlistItem=");
        sb.append(this.a);
        sb.append(", affinityUsers=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nnd) {
            nnd nnd = (nnd) obj;
            return this.a.equals(nnd.a()) && this.b.equals(nnd.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
