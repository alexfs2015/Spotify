package defpackage;

import java.util.Map;

/* renamed from: skz reason: default package */
public final class skz extends slk {
    private final String a;
    private final Map<String, String> b;

    public skz(String str, Map<String, String> map) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slk) {
            slk slk = (slk) obj;
            return this.a.equals(slk.a()) && this.b.equals(slk.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchRequestData{searchQuery=");
        sb.append(this.a);
        sb.append(", queryMap=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
