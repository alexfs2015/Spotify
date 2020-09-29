package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cfp
/* renamed from: css reason: default package */
public final class css implements Iterable<csq> {
    public final List<csq> a = new ArrayList();

    public static boolean a(csh csh) {
        csq b = b(csh);
        if (b == null) {
            return false;
        }
        b.b.a();
        return true;
    }

    static csq b(csh csh) {
        Iterator it = bkc.z().iterator();
        while (it.hasNext()) {
            csq csq = (csq) it.next();
            if (csq.a == csh) {
                return csq;
            }
        }
        return null;
    }

    public final Iterator<csq> iterator() {
        return this.a.iterator();
    }
}
