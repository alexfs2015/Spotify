package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: vyr reason: default package */
public final class vyr {
    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(f fVar, vys vys, String str, c cVar) {
        if (fVar.b) {
            return kng.a(vys.a(vyt.c(str)), kmt.a(vyp.b(cVar.a), new b()));
        }
        return kng.a(vys.a(vyt.c(str)), kmt.a(vyp.b(cVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vys vys, String str, b bVar) {
        if (bVar.a != 20) {
            return kng.b(vys.a(vyt.a(str, bVar.a)));
        }
        return kng.a(vys.a(vyt.a(str, bVar.a)), kmt.a(vyp.a(str)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vys vys, d dVar) {
        String str = dVar.a;
        if (!(!vys.f().equals(str))) {
            return kng.e();
        }
        vyt vyt = fbo.a(str) ? new a() : vyv.a(str) ? vyt.a(str) : vyt.a(str, 130);
        return kng.b(vys.a(vyt));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vys vys, e eVar) {
        HashSet hashSet = new HashSet();
        if (vys.a() instanceof d) {
            hashSet.add(new b());
        } else if (vys.a() instanceof c) {
            hashSet.add(vyp.a(vys.f(), true));
        } else if ((vys.a() instanceof b) && ((b) vys.a()).a == 20) {
            hashSet.add(vyp.a(vys.f()));
        }
        return vys.c() ? kng.a((Set<? extends F>) hashSet) : kng.a(vys.d().b(true).a(), hashSet);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vys vys, f fVar) {
        String str = (String) fVar.a.a((gee<c, R_>) $$Lambda$_FGnMBvhecmSQ2fw2Svq6WAcHs.INSTANCE, (gee<b, R_>) $$Lambda$SEQEQ8jyl7nCHTYEG0OePjfOG7o.INSTANCE, (gee<a, R_>) $$Lambda$U9yA_HL71rXJ7fzlJev6VbehWOM.INSTANCE);
        return vys.f().equals(str) ^ true ? kng.e() : (kng) fVar.a.a((gee<c, R_>) new $$Lambda$vyr$ZZvq4dSEgWANT2_yLYTIFbOJKcg<c,R_>(fVar, vys, str), (gee<b, R_>) new $$Lambda$vyr$DA_w1tzZQ2Q2ShhPlWuyA6kFnI<b,R_>(vys, str), (gee<a, R_>) $$Lambda$vyr$94zBKtpgsyX0t8A0nX9SPoxqyrw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vys vys, g gVar) {
        if ((!vys.f().equals(gVar.a)) || !(vys.a() instanceof c)) {
            return kng.e();
        }
        return kng.a(vys.a(vyt.b(gVar.a)), kmt.a(vyp.a(gVar.a, false)));
    }

    public static kng<vys, vyp> a(vys vys, vyq vyq) {
        return (kng) vyq.a((gee<b, R_>) $$Lambda$vyr$gTt5PBEKVcFM239R6eHG6xASUkk.INSTANCE, (gee<c, R_>) new $$Lambda$vyr$RQvABfy7Ir3l5JkBfhfmzymTu1A<c,R_>(vys), (gee<a, R_>) $$Lambda$vyr$Q0vSQi8_LlHBhhNqcTO6Jplbs_c.INSTANCE, (gee<d, R_>) new $$Lambda$vyr$l0Shh8iGFeuham8CrthTtp4FT8<d,R_>(vys), (gee<g, R_>) new $$Lambda$vyr$jdYb7NiVUVxZa4fz8Ko6CoHZU<g,R_>(vys), (gee<f, R_>) new $$Lambda$vyr$HnHyiwvvuU0qRsB7tPyZ93p91j8<f,R_>(vys), (gee<e, R_>) new $$Lambda$vyr$ADC0kqHIVg6ha7JCa6iWyDTtvhc<e,R_>(vys), (gee<h, R_>) new $$Lambda$vyr$pxpGvJrUB5uUdCBquo9T7Kg3gfQ<h,R_>(vys));
    }
}
