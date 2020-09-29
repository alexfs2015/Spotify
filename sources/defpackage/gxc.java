package defpackage;

import java.util.IdentityHashMap;

/* renamed from: gxc reason: default package */
public final class gxc {
    final IdentityHashMap<hcm, gxg> a = new IdentityHashMap<>();
    final IdentityHashMap<hcm, hcm> b = new IdentityHashMap<>();
    private final gwm c;

    gxc(gwm gwm) {
        this.c = gwm;
    }

    public final gxg a(hcm hcm) {
        gxg gxg = (gxg) this.a.get(fbp.a(hcm));
        if (gxg != null) {
            return gxg;
        }
        gxg a2 = gxg.a(hcm, this.c);
        this.a.put(hcm, a2);
        this.b.put(a2.a, hcm);
        return a2;
    }

    public final void a() {
        this.a.clear();
        this.b.clear();
    }

    public final hcm b(hcm hcm) {
        return (hcm) this.b.get(fbp.a(hcm));
    }
}
