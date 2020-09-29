package defpackage;

import java.util.IdentityHashMap;

/* renamed from: gvc reason: default package */
public final class gvc {
    final IdentityHashMap<gzt, gvg> a = new IdentityHashMap<>();
    final IdentityHashMap<gzt, gzt> b = new IdentityHashMap<>();
    private final gum c;

    gvc(gum gum) {
        this.c = gum;
    }

    public final void a() {
        this.a.clear();
        this.b.clear();
    }

    public final gvg a(gzt gzt) {
        gvg gvg = (gvg) this.a.get(fay.a(gzt));
        if (gvg != null) {
            return gvg;
        }
        gvg a2 = gvg.a(gzt, this.c);
        this.a.put(gzt, a2);
        this.b.put(a2.a, gzt);
        return a2;
    }

    public final gzt b(gzt gzt) {
        return (gzt) this.b.get(fay.a(gzt));
    }
}
