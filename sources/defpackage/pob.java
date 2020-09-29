package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import java.util.Map;

/* renamed from: pob reason: default package */
public final class pob {
    public static kjx<poc, pnz> a(poc poc, poa poa) {
        return (kjx) poa.a(new $$Lambda$pob$yWlHfFXSFtIIl_7QmkCyAj00R8(poc), new $$Lambda$pob$RQ0tSEygczXLcSIumbxYoEULhN0(poc), new $$Lambda$pob$s4LjXx1it7EnOiTNcWuaQWhd8(poc), new $$Lambda$pob$orxZcGHfvZacDaLhnHWxgYJCtX4(poc), new $$Lambda$pob$NR2wB2T2IxrcMjBiakuKZPvex3A(poc), new $$Lambda$pob$JZ8r3_1UQTLnc_ygvMsretAEk58(poc), new $$Lambda$pob$lHZu1NLSsG1CRQwW8r2OgDTYc(poc), new $$Lambda$pob$zubJRGVxfEz21jEyOI3MbJ3zyMU(poc));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(poc poc, c cVar) {
        pod b = poc.b();
        if (b == null) {
            return kjx.e();
        }
        return kjx.a(poc.a((pod) null), kjk.a(pnz.a(b.b(), b.a(), "banner-inflation-error"), new f()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(poc poc, h hVar) {
        pod b = poc.b();
        if (b == null) {
            return kjx.e();
        }
        BannerMessage a = b.a();
        e eVar = new e(a.getId(), a.getUuid(), hVar.a, hVar.b, hVar.c);
        return kjx.a(kjk.a(eVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(poc poc, e eVar) {
        pod b = poc.b();
        if (b == null || b.c()) {
            return kjx.e();
        }
        pod a = b.e().a(true).a();
        return kjx.a(poc.a(a), kjk.a(new b((String) fay.a(a.a().getImpressionUrl()), (String) fay.a(a.a().getUuid())), new d((String) fay.a(a.a().getId()), a.b(), a.d())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(poc poc, a aVar) {
        pod b = poc.b();
        if (b == null) {
            return kjx.e();
        }
        String str = aVar.a;
        Map clickActions = b.a().getClickActions();
        if (clickActions == null || str.isEmpty()) {
            return kjx.a(poc.a((pod) null), kjk.a(new f()));
        }
        QuicksilverClickAction quicksilverClickAction = (QuicksilverClickAction) clickActions.get(str);
        if (quicksilverClickAction == null) {
            return kjx.a(poc.a((pod) null), kjk.a(new f()));
        } else if (!quicksilverClickAction.getShouldDismiss().booleanValue()) {
            return kjx.a(kjk.a(pnz.a(quicksilverClickAction, (String) fay.a(b.a().getUuid()))));
        } else {
            return kjx.a(poc.a((pod) null), kjk.a(pnz.a(quicksilverClickAction, (String) fay.a(b.a().getUuid())), new f()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(poc poc, d dVar) {
        if (!poc.a() && poc.b() == null) {
            return kjx.b(poc.a(pod.a(dVar.b, dVar.a, dVar.c).a()));
        }
        return kjx.a(kjk.a(pnz.a(dVar.a, dVar.b, "banner-already-showing")));
    }
}
