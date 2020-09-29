package defpackage;

import java.util.List;

/* renamed from: nlf reason: default package */
final class nlf extends nlh {
    private final List<nlg> a;

    /* renamed from: nlf$a */
    public static final class a implements defpackage.nlh.a {
        public List<nlg> a;

        public final nlh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" faces");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new nlf(this.a, 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ nlf(List list, byte b) {
        this(list);
    }

    private nlf(List<nlg> list) {
        this.a = list;
    }

    public final List<nlg> a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FacePile{faces=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nlh)) {
            return false;
        }
        return this.a.equals(((nlh) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
