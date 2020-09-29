package defpackage;

import java.util.List;

/* renamed from: mwu reason: default package */
final class mwu extends mxa {
    private final List<mww> a;
    private final List<String> b;

    mwu(List<mww> list, List<String> list2) {
        if (list != null) {
            this.a = list;
            this.b = list2;
            return;
        }
        throw new NullPointerException("Null insertions");
    }

    public final List<mww> a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxa) {
            mxa mxa = (mxa) obj;
            if (this.a.equals(mxa.a())) {
                List<String> list = this.b;
                return list != null ? list.equals(mxa.b()) : mxa.b() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List<String> list = this.b;
        return hashCode ^ (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutations{insertions=");
        sb.append(this.a);
        sb.append(", deleteItemIds=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
