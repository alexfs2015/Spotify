package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: kxo reason: default package */
public final class kxo extends kxn {
    private final String a;
    private final Map<String, String> b;
    private final List<String> c;

    public kxo(String str, Map<String, String> map, List<String> list) {
        if (str != null) {
            this.a = str;
            this.b = map;
            if (list != null) {
                this.c = list;
                return;
            }
            throw new NullPointerException("Null authmethods");
        }
        throw new NullPointerException("Null authid");
    }

    public final String a() {
        return this.a;
    }

    public final Map<String, String> b() {
        return this.b;
    }

    public final List<String> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxn) {
            kxn kxn = (kxn) obj;
            if (this.a.equals(kxn.a())) {
                Map<String, String> map = this.b;
                if (map != null ? map.equals(kxn.b()) : kxn.b() == null) {
                    if (this.c.equals(kxn.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Map<String, String> map = this.b;
        return ((hashCode ^ (map == null ? 0 : map.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthDetails{authid=");
        sb.append(this.a);
        sb.append(", extras=");
        sb.append(this.b);
        sb.append(", authmethods=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
