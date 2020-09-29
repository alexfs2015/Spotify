package defpackage;

import com.google.common.base.Optional;

/* renamed from: sqf reason: default package */
final class sqf extends sqj {
    private final String a;
    private final String b;
    private final Optional<Integer> c;

    sqf(String str, String str2, Optional<Integer> optional) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (optional != null) {
                    this.c = optional;
                    return;
                }
                throw new NullPointerException("Null lastOffset");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null drilldownPath");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Optional<Integer> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sqj) {
            sqj sqj = (sqj) obj;
            return this.a.equals(sqj.a()) && this.b.equals(sqj.b()) && this.c.equals(sqj.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchDrillDownParamsHolder{drilldownPath=");
        sb.append(this.a);
        sb.append(", query=");
        sb.append(this.b);
        sb.append(", lastOffset=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
