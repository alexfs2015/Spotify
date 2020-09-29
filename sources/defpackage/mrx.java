package defpackage;

import java.util.List;

/* renamed from: mrx reason: default package */
final class mrx extends msc {
    private final String a;
    private final String b;
    private final List<mrr> c;

    mrx(String str, String str2, List<mrr> list) {
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

    public final List<mrr> c() {
        return this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof msc) {
            msc msc = (msc) obj;
            return this.a.equals(msc.a()) && this.b.equals(msc.b()) && this.c.equals(msc.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
