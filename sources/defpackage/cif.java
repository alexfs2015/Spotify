package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

@cey
/* renamed from: cif reason: default package */
public final class cif {
    private static final eco d = new eco();
    final Map<String, cjs> a = new HashMap();
    final bfr b;
    final cdd c;
    private final ecp e;
    private final bjm f;
    private final cjk g;

    public cif(bjm bjm, ecp ecp, cjk cjk, bfr bfr, cdd cdd) {
        this.f = bjm;
        this.e = ecp;
        this.g = cjk;
        this.b = bfr;
        this.c = cdd;
    }

    public static boolean b() {
        return true;
    }

    public final cjx a(cjx cjx) {
        if (!(this.f.j == null || this.f.j.r == null || TextUtils.isEmpty(this.f.j.r.k))) {
            cjx = new cjx(this.f.j.r.k, this.f.j.r.l);
        }
        if (!(this.f.j == null || this.f.j.o == null)) {
            bjl.x();
            eci.a(this.f.c, this.f.e.a, this.f.j.o.m, this.f.E, cjx);
        }
        return cjx;
    }

    public final void c() {
        if (this.f.j != null && this.f.j.o != null) {
            bjl.x();
            eci.a(this.f.c, this.f.e.a, this.f.j, this.f.b, false, this.f.j.o.l);
        }
    }

    public final void d() {
        if (this.f.j != null && this.f.j.o != null) {
            bjl.x();
            eci.a(this.f.c, this.f.e.a, this.f.j, this.f.b, false, this.f.j.o.n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cjs a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, cjs> r0 = r4.a
            java.lang.Object r0 = r0.get(r5)
            cjs r0 = (defpackage.cjs) r0
            if (r0 != 0) goto L_0x0044
            ecp r1 = r4.e     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002a }
            if (r2 == 0) goto L_0x0016
            eco r1 = d     // Catch:{ Exception -> 0x002a }
        L_0x0016:
            cjs r2 = new cjs     // Catch:{ Exception -> 0x002a }
            ecs r1 = r1.a(r5)     // Catch:{ Exception -> 0x002a }
            cjk r3 = r4.g     // Catch:{ Exception -> 0x002a }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002a }
            java.util.Map<java.lang.String, cjs> r0 = r4.a     // Catch:{ Exception -> 0x0028 }
            r0.put(r5, r2)     // Catch:{ Exception -> 0x0028 }
            r0 = r2
            goto L_0x0044
        L_0x0028:
            r0 = r2
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            java.lang.String r1 = "Fail to instantiate adapter "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r2 = r5.length()
            if (r2 == 0) goto L_0x003b
            r1.concat(r5)
            goto L_0x0040
        L_0x003b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0040:
            r5 = 5
            defpackage.cow.a(r5)
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cif.a(java.lang.String):cjs");
    }

    public final void a() {
        bjm bjm = this.f;
        bjm.I = 0;
        bjl.d();
        cjn cjn = new cjn(this.f.c, this.f.k, this);
        String valueOf = String.valueOf(cjn.getClass().getName());
        String str = "AdRenderer: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cow.a(3);
        cjn.c();
        bjm.h = cjn;
    }

    public final void a(boolean z) {
        cjs a2 = a(this.f.j.q);
        if (!(a2 == null || a2.a == null)) {
            try {
                a2.a.a(z);
                a2.a.f();
            } catch (RemoteException e2) {
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void a(Context context) {
        for (cjs cjs : this.a.values()) {
            try {
                cjs.a.a(cas.a(context));
            } catch (RemoteException e2) {
                clu.a("Unable to call Adapter.onContextChanged.", e2);
            }
        }
    }
}
