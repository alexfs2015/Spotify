package defpackage;

import java.util.List;

/* renamed from: mwv reason: default package */
final class mwv extends mxb {
    private final String a;
    private final String b;
    private final List<mwo> c;

    mwv(String str, String str2, List<mwo> list) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (list != null) {
                    this.c = list;
                    return;
                }
                throw new NullPointerException("Null artists");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null uri");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<mwo> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxb) {
            mxb mxb = (mxb) obj;
            return this.a.equals(mxb.a()) && this.b.equals(mxb.b()) && this.c.equals(mxb.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackData{uri=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", artists=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
