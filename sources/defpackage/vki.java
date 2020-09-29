package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vki reason: default package */
public final class vki {
    public static kjx<vkj, vkg> a(vkj vkj, vkh vkh) {
        return (kjx) vkh.a((gct<a, R_>) new $$Lambda$vki$7bdlqw75yATujrUaNfRVQaBn9MU<a,R_>(vkj), (gct<c, R_>) new $$Lambda$vki$VBMwRiT0ZHYLnYkgaWnrWOC_s0g<c,R_>(vkj), (gct<b, R_>) new $$Lambda$vki$o_9nQIpL_dzKs4J6PY96e3wl5c<b,R_>(vkj));
    }

    private static Date a(int i, int i2, int i3) {
        new jrf();
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(i, i2, i3);
        return instance.getTime();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vkj vkj, b bVar) {
        if (!a(vkj.c(), vkj.b(), vkj.a()).equals(a(bVar.a, bVar.b, bVar.c))) {
            return kjx.e();
        }
        return kjx.b(vkj.a(bVar.d));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vkj vkj, c cVar) {
        if (!vkj.e()) {
            return kjx.a(vkj.a(cVar.a, cVar.b, cVar.c, new b()), kjk.a(new vkg[0]));
        }
        return kjx.a(vkj.a(cVar.a, cVar.b, cVar.c, new d()), kjk.a(vkg.a(cVar.a, cVar.b, cVar.c, false)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vkj vkj, a aVar) {
        HashSet hashSet = new HashSet();
        if (vkj.d() instanceof c) {
            hashSet.add(new a());
        } else if (vkj.d() instanceof b) {
            hashSet.add(vkg.a(vkj.c(), vkj.b(), vkj.a(), true));
        }
        if (vkj.e()) {
            return kjx.a((Set<? extends F>) hashSet);
        }
        return kjx.a(vkj.f().a(true).a(), hashSet);
    }
}
