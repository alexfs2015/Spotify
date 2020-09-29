package defpackage;

import com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: idz reason: default package */
public final class idz {
    public static kmw<MarqueeTriggerModel, idw> a(MarqueeTriggerModel marqueeTriggerModel) {
        return kmw.a(marqueeTriggerModel, kmt.a(new idw[0]));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MarqueeTriggerModel marqueeTriggerModel, c cVar) {
        AdSlotEvent adSlotEvent = cVar.a;
        if (!a(marqueeTriggerModel.a())) {
            return kng.e();
        }
        return kng.a(kmt.a(new b(adSlotEvent)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MarqueeTriggerModel marqueeTriggerModel, e eVar) {
        ido ido = eVar.a;
        String a = marqueeTriggerModel.a();
        if (!marqueeTriggerModel.b() && a(a)) {
            return kng.a(kmt.a(new e(ido)));
        } else if (!marqueeTriggerModel.b()) {
            return kng.e();
        } else {
            return kng.a(kmt.a(new d(ido.a())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MarqueeTriggerModel marqueeTriggerModel, g gVar) {
        MarqueeTriggerModel a = marqueeTriggerModel.c().a(gVar.a).a();
        if (a(a.a())) {
            return kng.a(a, kmt.a(new f(a.a())));
        }
        return kng.a(a, kmt.a(new a()));
    }

    public static kng<MarqueeTriggerModel, idw> a(MarqueeTriggerModel marqueeTriggerModel, idy idy) {
        return (kng) idy.a(new $$Lambda$idz$gg4V2AXJj9Td4G2piSq4lG_qzBI(marqueeTriggerModel), new $$Lambda$idz$2cKSp9pJ8A4HKzpFhjftjU6ZBoc(marqueeTriggerModel), $$Lambda$idz$R47YuJiJLfu258EjZwMS4teTI.INSTANCE, new $$Lambda$idz$ndRY79PPoF2chokg7wqEv7FlE(marqueeTriggerModel), new $$Lambda$idz$6MOH2d6vdMT5qS_4CnYLaAkMC88(marqueeTriggerModel), new $$Lambda$idz$pp7MMyldEJy0bvyPr5a8TsCcpWE(idy), $$Lambda$idz$9bN5l9QYsfwIgpXpi1Huid4eVck.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static kng<MarqueeTriggerModel, idw> a(idy idy) {
        return kng.a(kmt.a(idw.a(((b) idy).a)));
    }

    private static boolean a(String str) {
        return str.equalsIgnoreCase(ViewUris.d.toString()) || str.equalsIgnoreCase(ViewUris.s.toString()) || str.equalsIgnoreCase(ViewUris.e.toString());
    }
}
