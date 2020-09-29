package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: sas reason: default package */
public final class sas implements saq {
    private final Map<String, hcs> a = new HashMap(30);
    private final List<String> b = new ArrayList(30);

    public final hcs a(String str) {
        jtr.b("Not called on main looper");
        fbp.a(str);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                it.remove();
            }
        }
        return (hcs) this.a.remove(str);
    }

    public final void a(String str, hcs hcs) {
        jtr.b("Not called on main looper");
        fbp.a(hcs);
        fbp.a(str);
        if (this.a.size() >= 30) {
            this.a.remove((String) this.b.remove(0));
        }
        this.a.put(str, hcs);
        this.b.add(str);
    }
}
