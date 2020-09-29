package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: rrl reason: default package */
public final class rrl implements rrj {
    private final Map<String, gzz> a = new HashMap(30);
    private final List<String> b = new ArrayList(30);

    public final void a(String str, gzz gzz) {
        jrh.b("Not called on main looper");
        fay.a(gzz);
        fay.a(str);
        if (this.a.size() >= 30) {
            this.a.remove((String) this.b.remove(0));
        }
        this.a.put(str, gzz);
        this.b.add(str);
    }

    public final gzz a(String str) {
        jrh.b("Not called on main looper");
        fay.a(str);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                it.remove();
            }
        }
        return (gzz) this.a.remove(str);
    }
}
