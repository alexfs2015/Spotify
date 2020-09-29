package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: kuf reason: default package */
public final class kuf extends kue {
    private final String a;
    private final Map<String, String> b;
    private final List<String> c;

    public kuf(String str, Map<String, String> map, List<String> list) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kue) {
            kue kue = (kue) obj;
            if (this.a.equals(kue.a())) {
                Map<String, String> map = this.b;
                if (map != null ? map.equals(kue.b()) : kue.b() == null) {
                    if (this.c.equals(kue.c())) {
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
}
