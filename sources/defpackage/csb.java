package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cey
/* renamed from: csb reason: default package */
public final class csb implements Iterable<crz> {
    public final List<crz> a = new ArrayList();

    public static boolean a(crq crq) {
        crz b = b(crq);
        if (b == null) {
            return false;
        }
        b.b.a();
        return true;
    }

    static crz b(crq crq) {
        Iterator it = bjl.z().iterator();
        while (it.hasNext()) {
            crz crz = (crz) it.next();
            if (crz.a == crq) {
                return crz;
            }
        }
        return null;
    }

    public final Iterator<crz> iterator() {
        return this.a.iterator();
    }
}
