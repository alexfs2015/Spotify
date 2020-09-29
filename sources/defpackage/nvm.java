package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.util.Set;

/* renamed from: nvm reason: default package */
public final class nvm {
    public static kjn<nvn, nvk> a(nvn nvn) {
        return kjn.a(nvn.a);
    }

    public static kjx<nvn, nvk> a(nvn nvn, nvl nvl) {
        return (kjx) nvl.a(new $$Lambda$nvm$hVc9775XQZuDWV2fV67fewg3aM(nvn), new $$Lambda$nvm$qdCd42gMScsDSmnimlLzDJe9KgQ(nvn), new $$Lambda$nvm$jHRRiSJ9WeojmQAStASJXXIM4ZM(nvn), new $$Lambda$nvm$xMV2nv0epuIZDDFa9rJ90aOZrQ(nvn), new $$Lambda$nvm$TgU99s26QJBnlhIOazqCIdPZDP8(nvn), new $$Lambda$nvm$gzlPS2erIjjDi9e8rabDR8blmgQ(nvn), $$Lambda$nvm$31W3MjO1f48eEvqDbOSvcr93hsU.INSTANCE, new $$Lambda$nvm$OVPJG2WIcS6KHqTP7I4frTvGiT4(nvn));
    }

    private static nvn a(nvn nvn, PartnerType partnerType, Optional<Boolean> optional, Optional<Boolean> optional2) {
        a g = ImmutableMap.g();
        fdh R_ = nvn.b().keySet().iterator();
        while (R_.hasNext()) {
            PartnerType partnerType2 = (PartnerType) R_.next();
            rvn rvn = (rvn) fay.a(nvn.b().get(partnerType2));
            if (partnerType2 == partnerType) {
                g.b(partnerType2, rvn.a(optional, optional2));
            } else {
                g.b(partnerType2, rvn);
            }
        }
        return nvn.c().a(g.b()).a();
    }

    /* access modifiers changed from: private */
    public static kjx<nvn, nvk> a(d dVar) {
        return kjx.a(kjk.a(new a(dVar.a, dVar.b, dVar.c)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(nvn nvn, h hVar) {
        if (!(!((rvn) fay.a(nvn.b().get(hVar.a))).b())) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new c(hVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(nvn nvn, g gVar) {
        if (!(!((rvn) fay.a(nvn.b().get(gVar.a))).a())) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new b(gVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(nvn nvn, e eVar) {
        nvn a = nvn.c().a(Optional.b(Boolean.valueOf(eVar.a))).a();
        Set a2 = kjk.a(new d(eVar.a));
        if (!eVar.a) {
            a2.add(new e());
        }
        return kjx.a(a, a2);
    }
}
