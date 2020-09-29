package defpackage;

import java.util.List;

/* renamed from: nqv reason: default package */
final class nqv extends nqx {
    private final List<nqw> a;

    /* renamed from: nqv$a */
    public static final class a implements defpackage.nqx.a {
        public List<nqw> a;

        public final nqx a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" faces");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new nqv(this.a, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private nqv(List<nqw> list) {
        this.a = list;
    }

    /* synthetic */ nqv(List list, byte b) {
        this(list);
    }

    public final List<nqw> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nqx)) {
            return false;
        }
        return this.a.equals(((nqx) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FacePile{faces=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
