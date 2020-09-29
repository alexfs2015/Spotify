package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: eji reason: default package */
public final class eji extends eje {
    private final ni a;
    private final Map<nh, Set<a>> b = new HashMap();

    public eji(ni niVar) {
        this.a = niVar;
    }

    public final void a() {
        ni.a(ni.b());
    }

    public final void a(Bundle bundle) {
        for (a a2 : (Set) this.b.get(nh.a(bundle))) {
            this.a.a(a2);
        }
    }

    public final void a(Bundle bundle, int i) {
        nh a2 = nh.a(bundle);
        for (a a3 : (Set) this.b.get(a2)) {
            this.a.a(a2, a3, i);
        }
    }

    public final void a(Bundle bundle, ejh ejh) {
        nh a2 = nh.a(bundle);
        if (!this.b.containsKey(a2)) {
            this.b.put(a2, new HashSet());
        }
        ((Set) this.b.get(a2)).add(new ejj(ejh));
    }

    public final void a(String str) {
        for (f fVar : ni.a()) {
            if (fVar.c.equals(str)) {
                ni.a(fVar);
                return;
            }
        }
    }

    public final Bundle b(String str) {
        for (f fVar : ni.a()) {
            if (fVar.c.equals(str)) {
                return fVar.q;
            }
        }
        return null;
    }

    public final boolean b() {
        return ni.c().c.equals(ni.b().c);
    }

    public final boolean b(Bundle bundle, int i) {
        return ni.a(nh.a(bundle), i);
    }

    public final String c() {
        return ni.c().c;
    }

    public final void d() {
        for (Set<a> it : this.b.values()) {
            for (a a2 : it) {
                this.a.a(a2);
            }
        }
        this.b.clear();
    }
}
