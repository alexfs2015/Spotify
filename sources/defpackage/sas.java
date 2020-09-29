package defpackage;

import java.util.Map;

/* renamed from: sas reason: default package */
public final class sas extends sbd {
    private final String a;
    private final Map<String, String> b;

    public sas(String str, Map<String, String> map) {
        if (str != null) {
            this.a = str;
            if (map != null) {
                this.b = map;
                return;
            }
            throw new NullPointerException("Null queryMap");
        }
        throw new NullPointerException("Null searchQuery");
    }

    public final String a() {
        return this.a;
    }

    public final Map<String, String> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchRequestData{searchQuery=");
        sb.append(this.a);
        sb.append(", queryMap=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbd) {
            sbd sbd = (sbd) obj;
            return this.a.equals(sbd.a()) && this.b.equals(sbd.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
