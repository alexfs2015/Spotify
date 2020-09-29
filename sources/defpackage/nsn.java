package defpackage;

import java.util.List;

/* renamed from: nsn reason: default package */
final class nsn extends nss {
    private final vle a;
    private final List<nsr> b;

    /* renamed from: nsn$a */
    static final class a implements defpackage.nss.a {
        private vle a;
        private List<nsr> b;

        a() {
        }

        public final defpackage.nss.a a(List<nsr> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null affinityUsers");
        }

        public final defpackage.nss.a a(vle vle) {
            if (vle != null) {
                this.a = vle;
                return this;
            }
            throw new NullPointerException("Null playlistItem");
        }

        public final nss a() {
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
                return new nsn(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private nsn(vle vle, List<nsr> list) {
        this.a = vle;
        this.b = list;
    }

    /* synthetic */ nsn(vle vle, List list, byte b2) {
        this(vle, list);
    }

    public final vle a() {
        return this.a;
    }

    public final List<nsr> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nss) {
            nss nss = (nss) obj;
            return this.a.equals(nss.a()) && this.b.equals(nss.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeMixPlaylistItem{playlistItem=");
        sb.append(this.a);
        sb.append(", affinityUsers=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
