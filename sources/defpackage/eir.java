package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: eir reason: default package */
public final class eir extends ein {
    private final nd a;
    private final Map<nc, Set<a>> b = new HashMap();

    public eir(nd ndVar) {
        this.a = ndVar;
    }

    public final void a(Bundle bundle, eiq eiq) {
        nc a2 = nc.a(bundle);
        if (!this.b.containsKey(a2)) {
            this.b.put(a2, new HashSet());
        }
        ((Set) this.b.get(a2)).add(new eis(eiq));
    }

    public final void d() {
        for (Set<a> it : this.b.values()) {
            for (a a2 : it) {
                this.a.a(a2);
            }
        }
        this.b.clear();
    }

    public final void a(Bundle bundle, int i) {
        nc a2 = nc.a(bundle);
        for (a a3 : (Set) this.b.get(a2)) {
            this.a.a(a2, a3, i);
        }
    }

    public final void a(Bundle bundle) {
        for (a a2 : (Set) this.b.get(nc.a(bundle))) {
            this.a.a(a2);
        }
    }

    public final boolean b(Bundle bundle, int i) {
        return nd.a(nc.a(bundle), i);
    }

    public final void a(String str) {
        for (f fVar : nd.a()) {
            if (fVar.c.equals(str)) {
                nd.a(fVar);
                return;
            }
        }
    }

    public final void a() {
        nd.a(nd.b());
    }

    public final boolean b() {
        return nd.c().c.equals(nd.b().c);
    }

    public final Bundle b(String str) {
        for (f fVar : nd.a()) {
            if (fVar.c.equals(str)) {
                return fVar.q;
            }
        }
        return null;
    }

    public final String c() {
        return nd.c().c;
    }
}
