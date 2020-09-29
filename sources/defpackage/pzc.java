package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pzc reason: default package */
public final class pzc {
    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pzd pzd, c cVar) {
        if (!pzd.b().containsKey(cVar.a)) {
            return kng.e();
        }
        HashMap a = Maps.a((Map<? extends K, ? extends V>) pzd.b());
        a.remove(cVar.a);
        return kng.b(pzd.d().a(ImmutableMap.g().a((Map<? extends K, ? extends V>) a).b()).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pzd pzd, d dVar) {
        String str = dVar.a;
        String str2 = dVar.b;
        HashMap a = Maps.a((Map<? extends K, ? extends V>) pzd.b());
        a.put(str, str2);
        return kng.b(pzd.d().a(ImmutableMap.g().a((Map<? extends K, ? extends V>) a).b()).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pzd pzd, h hVar) {
        String str = hVar.b;
        if (fbo.a(str)) {
            return kng.b(pzd.a("Oops! You didn't enter a creative Id!"));
        }
        return kng.a(pzd.a((pyz) new a()), kmt.a(new a(hVar.a, (String) pzd.b().get(hVar.a), str)));
    }

    public static kng<pzd, pza> a(pzd pzd, pzb pzb) {
        return (kng) pzb.a(new $$Lambda$pzc$lEDDuSdN0JU6hO91lPTzINDfdag(pzd), new $$Lambda$pzc$1zDWawgdcMu9fX5c94d7aHqSkE(pzd), new $$Lambda$pzc$Of4cpCUmXWXJ0jkEqMIxLC8oyQ(pzd), new $$Lambda$pzc$k0NwQl_pmRZGg6cupKWPVsqMAXE(pzd), new $$Lambda$pzc$VPjDai5oJ7774QrcBDhUXWtJ5g(pzd), new $$Lambda$pzc$sw_kwwnS4PXaoBuUsXxUYGht4(pzd), new $$Lambda$pzc$NTysKXh2JhBsq_Fd3o5EhP2LKrM(pzd), new $$Lambda$pzc$_uR0ee3Zf1qG87kA4QUMS5OCiUk(pzd));
    }
}
