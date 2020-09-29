package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

@cfp
/* renamed from: ciw reason: default package */
public final class ciw {
    private static final edf d = new edf();
    final Map<String, ckj> a = new HashMap();
    final bgi b;
    final cdu c;
    private final edg e;
    private final bkd f;
    private final ckb g;

    public ciw(bkd bkd, edg edg, ckb ckb, bgi bgi, cdu cdu) {
        this.f = bkd;
        this.e = edg;
        this.g = ckb;
        this.b = bgi;
        this.c = cdu;
    }

    public static boolean b() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ckj a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, ckj> r0 = r4.a
            java.lang.Object r0 = r0.get(r5)
            ckj r0 = (defpackage.ckj) r0
            if (r0 != 0) goto L_0x0044
            edg r1 = r4.e     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002a }
            if (r2 == 0) goto L_0x0016
            edf r1 = d     // Catch:{ Exception -> 0x002a }
        L_0x0016:
            ckj r2 = new ckj     // Catch:{ Exception -> 0x002a }
            edj r1 = r1.a(r5)     // Catch:{ Exception -> 0x002a }
            ckb r3 = r4.g     // Catch:{ Exception -> 0x002a }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002a }
            java.util.Map<java.lang.String, ckj> r0 = r4.a     // Catch:{ Exception -> 0x0028 }
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
            defpackage.cpn.a(r5)
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciw.a(java.lang.String):ckj");
    }

    public final cko a(cko cko) {
        if (!(this.f.j == null || this.f.j.r == null || TextUtils.isEmpty(this.f.j.r.k))) {
            cko = new cko(this.f.j.r.k, this.f.j.r.l);
        }
        if (!(this.f.j == null || this.f.j.o == null)) {
            bkc.x();
            ecz.a(this.f.c, this.f.e.a, this.f.j.o.m, this.f.E, cko);
        }
        return cko;
    }

    public final void a() {
        bkd bkd = this.f;
        bkd.I = 0;
        bkc.d();
        cke cke = new cke(this.f.c, this.f.k, this);
        String valueOf = String.valueOf(cke.getClass().getName());
        String str = "AdRenderer: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cpn.a(3);
        cke.c();
        bkd.h = cke;
    }

    public final void a(Context context) {
        for (ckj ckj : this.a.values()) {
            try {
                ckj.a.a(cbj.a(context));
            } catch (RemoteException e2) {
                cml.a("Unable to call Adapter.onContextChanged.", e2);
            }
        }
    }

    public final void a(boolean z) {
        ckj a2 = a(this.f.j.q);
        if (!(a2 == null || a2.a == null)) {
            try {
                a2.a.a(z);
                a2.a.f();
            } catch (RemoteException e2) {
                cml.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void c() {
        if (this.f.j != null && this.f.j.o != null) {
            bkc.x();
            ecz.a(this.f.c, this.f.e.a, this.f.j, this.f.b, false, this.f.j.o.l);
        }
    }

    public final void d() {
        if (this.f.j != null && this.f.j.o != null) {
            bkc.x();
            ecz.a(this.f.c, this.f.e.a, this.f.j, this.f.b, false, this.f.j.o.n);
        }
    }
}
