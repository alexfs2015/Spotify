package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pqg reason: default package */
public final class pqg {
    public static kjx<pqh, pqe> a(pqh pqh, pqf pqf) {
        return (kjx) pqf.a(new $$Lambda$pqg$gnAo8yv0ZxsmPzRsdvo4OKkSm_E(pqh), new $$Lambda$pqg$QQQKouhYRD2gdypX030zuZLOJQ(pqh), new $$Lambda$pqg$RzZDyJE6boL_uTpNevXsjJ4YnU(pqh), new $$Lambda$pqg$51SLbpFeV_1t1e_OVdiSkBLGu0(pqh), new $$Lambda$pqg$xDEQIAtC2vlFtKSVO6kc0Oiws(pqh), new $$Lambda$pqg$rO1zKmQ7wLWluJjUxV9t35_I6E(pqh), new $$Lambda$pqg$Svqh37Kzj27UbFoaQtJ5q4RbcQU(pqh), new $$Lambda$pqg$gIgn2B3juhM_vvYM0KBaHfHGLEc(pqh));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pqh pqh, c cVar) {
        if (!pqh.b().containsKey(cVar.a)) {
            return kjx.e();
        }
        HashMap a = Maps.a((Map<? extends K, ? extends V>) pqh.b());
        a.remove(cVar.a);
        return kjx.b(pqh.d().a(ImmutableMap.g().a((Map<? extends K, ? extends V>) a).b()).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pqh pqh, d dVar) {
        String str = dVar.a;
        String str2 = dVar.b;
        HashMap a = Maps.a((Map<? extends K, ? extends V>) pqh.b());
        a.put(str, str2);
        return kjx.b(pqh.d().a(ImmutableMap.g().a((Map<? extends K, ? extends V>) a).b()).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pqh pqh, h hVar) {
        String str = hVar.b;
        if (fax.a(str)) {
            return kjx.b(pqh.a("Oops! You didn't enter a creative Id!"));
        }
        return kjx.a(pqh.a((pqd) new a()), kjk.a(new a(hVar.a, (String) pqh.b().get(hVar.a), str)));
    }
}
