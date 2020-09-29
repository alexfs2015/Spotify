package defpackage;

import com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ibn reason: default package */
public final class ibn {
    public static kjn<MarqueeTriggerModel, ibk> a(MarqueeTriggerModel marqueeTriggerModel) {
        return kjn.a(marqueeTriggerModel, kjk.a(new ibk[0]));
    }

    public static kjx<MarqueeTriggerModel, ibk> a(MarqueeTriggerModel marqueeTriggerModel, ibm ibm) {
        return (kjx) ibm.a(new $$Lambda$ibn$o3Ee5GaXLWxTkNBlLL6lsabNzk(marqueeTriggerModel), new $$Lambda$ibn$i5aRwVtCnOxLPyIzq4O0S_ZM7Ec(marqueeTriggerModel), $$Lambda$ibn$hCGsqXkpi42KDsfqBwwWKzYj7o.INSTANCE, new $$Lambda$ibn$EDMRP55BLHhemM4YJVHrYdy1iIQ(marqueeTriggerModel), new $$Lambda$ibn$QRWWnVXlRcIE1LfYiyAX4zvqXZM(marqueeTriggerModel), new $$Lambda$ibn$YyGqNM7Cq5XGvmyQWjCF_05E1EA(ibm), $$Lambda$ibn$x5CuRq49MqPr23vJuWDXzFQnqDI.INSTANCE);
    }

    private static boolean a(String str) {
        return str.equalsIgnoreCase(ViewUris.e.toString()) || str.equalsIgnoreCase(ViewUris.t.toString()) || str.equalsIgnoreCase(ViewUris.f.toString());
    }

    /* access modifiers changed from: private */
    public static kjx<MarqueeTriggerModel, ibk> a(ibm ibm) {
        return kjx.a(kjk.a(ibk.a(((b) ibm).a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MarqueeTriggerModel marqueeTriggerModel, e eVar) {
        ibc ibc = eVar.a;
        String a = marqueeTriggerModel.a();
        if (!marqueeTriggerModel.b() && a(a)) {
            return kjx.a(kjk.a(new e(ibc)));
        } else if (!marqueeTriggerModel.b()) {
            return kjx.e();
        } else {
            return kjx.a(kjk.a(new d(ibc.a())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MarqueeTriggerModel marqueeTriggerModel, c cVar) {
        AdSlotEvent adSlotEvent = cVar.a;
        if (!a(marqueeTriggerModel.a())) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new b(adSlotEvent)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MarqueeTriggerModel marqueeTriggerModel, g gVar) {
        MarqueeTriggerModel a = marqueeTriggerModel.c().a(gVar.a).a();
        if (a(a.a())) {
            return kjx.a(a, kjk.a(new f(a.a())));
        }
        return kjx.a(a, kjk.a(new a()));
    }
}
