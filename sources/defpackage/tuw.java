package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tuw reason: default package */
public final class tuw extends a {
    private final uyt a;
    private List<Object> b = new ArrayList(0);
    private List<Object> c = new ArrayList(0);

    public tuw(uyt uyt) {
        this.a = uyt;
    }

    public final void a(List<Object> list, List<Object> list2) {
        if (list != null) {
            this.c = list;
        }
        this.b = list2;
    }

    public final int a() {
        return this.c.size();
    }

    public final int b() {
        return this.b.size();
    }

    public final boolean a(int i, int i2) {
        Object obj = this.c.get(i);
        Object obj2 = this.b.get(i2);
        if ((obj instanceof uys) && (obj2 instanceof uys)) {
            uys uys = (uys) obj;
            uys uys2 = (uys) obj2;
            if (uys.isHeader() && uys.getHeader() != null) {
                return uys.getHeader().equals(uys2.getHeader());
            }
            if (uys2.isHeader()) {
                return false;
            }
            return uys.getUri().equals(uys2.getUri());
        } else if (obj == obj2) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean b(int i, int i2) {
        Object obj = this.c.get(i);
        Object obj2 = this.b.get(i2);
        if (!(obj instanceof uys) || !(obj2 instanceof uys)) {
            return false;
        }
        uys uys = (uys) obj;
        uys uys2 = (uys) obj2;
        if (uys.isHeader() && uys.getHeader() != null) {
            return uys.getHeader().equals(uys2.getHeader());
        }
        if (uys2.isHeader()) {
            return false;
        }
        return this.a.a(uys, uys2);
    }
}
