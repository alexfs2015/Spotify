package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: vll reason: default package */
public final class vll {
    public static kjx<vlm, vlj> a(vlm vlm, vlk vlk) {
        return (kjx) vlk.a((gct<b, R_>) $$Lambda$vll$UhcYxOkxkxtv5ldn3axl81CO2yE.INSTANCE, (gct<c, R_>) new $$Lambda$vll$pTcEMvHvbO1YqFeRV0tdQdJzMDc<c,R_>(vlm), (gct<a, R_>) $$Lambda$vll$i_77ZPuUKtcVkjzI7bs_CjGoLRs.INSTANCE, (gct<d, R_>) new $$Lambda$vll$CGVJvXoJhWvFGkjox4Zc2Ix0U<d,R_>(vlm), (gct<g, R_>) new $$Lambda$vll$NOFMF6TCZ9e9DUs7kssB574hhGs<g,R_>(vlm), (gct<f, R_>) new $$Lambda$vll$ICL2fOdnHANtVuHxKlkIqBl6sls<f,R_>(vlm), (gct<e, R_>) new $$Lambda$vll$4FYoVbtQZaF7DAOAq6t4MuwxDHM<e,R_>(vlm), (gct<h, R_>) new $$Lambda$vll$XhewC8XHKY2xS4Tgh9aMiuQ7zCk<h,R_>(vlm));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vlm vlm, String str, b bVar) {
        if (bVar.a != 20) {
            return kjx.b(vlm.a(vln.a(str, bVar.a)));
        }
        return kjx.a(vlm.a(vln.a(str, bVar.a)), kjk.a(vlj.a(str)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(f fVar, vlm vlm, String str, c cVar) {
        if (fVar.b) {
            return kjx.a(vlm.a(vln.c(str)), kjk.a(vlj.b(cVar.a), new b()));
        }
        return kjx.a(vlm.a(vln.c(str)), kjk.a(vlj.b(cVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vlm vlm, e eVar) {
        HashSet hashSet = new HashSet();
        if (vlm.a() instanceof d) {
            hashSet.add(new b());
        } else if (vlm.a() instanceof c) {
            hashSet.add(vlj.a(vlm.f(), true));
        } else if ((vlm.a() instanceof b) && ((b) vlm.a()).a == 20) {
            hashSet.add(vlj.a(vlm.f()));
        }
        if (vlm.c()) {
            return kjx.a((Set<? extends F>) hashSet);
        }
        return kjx.a(vlm.d().b(true).a(), hashSet);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vlm vlm, f fVar) {
        String str = (String) fVar.a.a((gct<c, R_>) $$Lambda$F70qJQn_JKrlqHU_RGVUoJyz7u0.INSTANCE, (gct<b, R_>) $$Lambda$37SWbG6c4oYWFJaQDiBqxswR8.INSTANCE, (gct<a, R_>) $$Lambda$USIY6ePjTFNBYd1dOzFtnIuunSQ.INSTANCE);
        if (!vlm.f().equals(str)) {
            return kjx.e();
        }
        return (kjx) fVar.a.a((gct<c, R_>) new $$Lambda$vll$6nUcJYPVAJ0uUlip2UPyhmO43E<c,R_>(fVar, vlm, str), (gct<b, R_>) new $$Lambda$vll$_zV7RmENniPte4MC0X4fkQ_cQgg<b,R_>(vlm, str), (gct<a, R_>) $$Lambda$vll$AOnm1nonrlD3g3UrKtIFzDLPAIg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vlm vlm, g gVar) {
        if ((!vlm.f().equals(gVar.a)) || !(vlm.a() instanceof c)) {
            return kjx.e();
        }
        return kjx.a(vlm.a(vln.b(gVar.a)), kjk.a(vlj.a(gVar.a, false)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vlm vlm, d dVar) {
        vln vln;
        String str = dVar.a;
        if (!(!vlm.f().equals(str))) {
            return kjx.e();
        }
        if (fax.a(str)) {
            vln = new a();
        } else if (vlp.a(str)) {
            vln = vln.a(str);
        } else {
            vln = vln.a(str, 130);
        }
        return kjx.b(vlm.a(vln));
    }
}
