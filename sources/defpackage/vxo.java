package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vxo reason: default package */
public final class vxo {
    private static Date a(int i, int i2, int i3) {
        new jtp();
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(i, i2, i3);
        return instance.getTime();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vxp vxp, a aVar) {
        HashSet hashSet = new HashSet();
        if (vxp.d() instanceof c) {
            hashSet.add(new a());
        } else if (vxp.d() instanceof b) {
            hashSet.add(vxm.a(vxp.c(), vxp.b(), vxp.a(), true));
        }
        return vxp.e() ? kng.a((Set<? extends F>) hashSet) : kng.a(vxp.f().a(true).a(), hashSet);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vxp vxp, b bVar) {
        return !a(vxp.c(), vxp.b(), vxp.a()).equals(a(bVar.a, bVar.b, bVar.c)) ? kng.e() : kng.b(vxp.a(bVar.d));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vxp vxp, c cVar) {
        if (!vxp.e()) {
            return kng.a(vxp.a(cVar.a, cVar.b, cVar.c, new b()), kmt.a(new vxm[0]));
        }
        return kng.a(vxp.a(cVar.a, cVar.b, cVar.c, new d()), kmt.a(vxm.a(cVar.a, cVar.b, cVar.c, false)));
    }

    public static kng<vxp, vxm> a(vxp vxp, vxn vxn) {
        return (kng) vxn.a((gee<a, R_>) new $$Lambda$vxo$rx7HFkkCcSn5XwJMRxYXSVzmPJw<a,R_>(vxp), (gee<c, R_>) new $$Lambda$vxo$nP6gU6DaCkmwm2xJ0prKa2Qrle4<c,R_>(vxp), (gee<b, R_>) new $$Lambda$vxo$lg1jUfsxRirgdLDEofwo3mpE4XM<b,R_>(vxp));
    }
}
