package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.music.libs.partnerapps.PartnerType;
import java.util.Set;

/* renamed from: obz reason: default package */
public final class obz {
    public static kmw<oca, obx> a(oca oca) {
        return kmw.a(oca.a);
    }

    /* access modifiers changed from: private */
    public static kng<oca, obx> a(d dVar) {
        return kng.a(kmt.a(new a(dVar.a, dVar.b, dVar.c)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(oca oca, e eVar) {
        oca a = oca.c().a(Optional.b(Boolean.valueOf(eVar.a))).a();
        Set a2 = kmt.a(new d(eVar.a));
        if (!eVar.a) {
            a2.add(new e());
        }
        return kng.a(a, a2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(oca oca, g gVar) {
        if (!(!((sex) fbp.a(oca.b().get(gVar.a))).a())) {
            return kng.e();
        }
        return kng.a(kmt.a(new b(gVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(oca oca, h hVar) {
        if (!(!((sex) fbp.a(oca.b().get(hVar.a))).b())) {
            return kng.e();
        }
        return kng.a(kmt.a(new c(hVar.a)));
    }

    public static kng<oca, obx> a(oca oca, oby oby) {
        return (kng) oby.a(new $$Lambda$obz$a0kYRNuxGchIp1VsDWT48DL_QhE(oca), new $$Lambda$obz$hQTUgJigafR6Hlsrgr5pXvY6RaA(oca), new $$Lambda$obz$Y9U7t39KivQos02WMVAqWOozp5c(oca), new $$Lambda$obz$umLvMPLZ_g3Wmt6vNwKH4cN4RdE(oca), new $$Lambda$obz$gxLLaFTUqb2OzRNR0Srbw0TlnLY(oca), new $$Lambda$obz$ZZI1H9VJcqz31nYNZ5JWXJw8zTk(oca), $$Lambda$obz$AK9PnCtX_n9zcceGPlcJDPbVPrY.INSTANCE, new $$Lambda$obz$Ijn6ZpAzbLHgWUGHQ0m90Pq7gdE(oca));
    }

    private static oca a(oca oca, PartnerType partnerType, Optional<Boolean> optional, Optional<Boolean> optional2) {
        a g = ImmutableMap.g();
        fdz R_ = oca.b().keySet().iterator();
        while (R_.hasNext()) {
            PartnerType partnerType2 = (PartnerType) R_.next();
            sex sex = (sex) fbp.a(oca.b().get(partnerType2));
            if (partnerType2 == partnerType) {
                g.b(partnerType2, sex.a(optional, optional2));
            } else {
                g.b(partnerType2, sex);
            }
        }
        return oca.c().a(g.b()).a();
    }
}
