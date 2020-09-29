package defpackage;

import java.util.List;

/* renamed from: mws reason: default package */
final class mws extends mwy {
    private final String a;
    private final List<mwo> b;

    mws(String str, List<mwo> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null sectionTitle");
    }

    public final String a() {
        return this.a;
    }

    public final List<mwo> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwy) {
            mwy mwy = (mwy) obj;
            return this.a.equals(mwy.a()) && this.b.equals(mwy.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRecsData{sectionTitle=");
        sb.append(this.a);
        sb.append(", artists=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
