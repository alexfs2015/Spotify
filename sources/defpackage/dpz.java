package defpackage;

import android.content.Context;

/* renamed from: dpz reason: default package */
final class dpz extends a<dqu> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ dpt b;
    private final /* synthetic */ String c;
    private final /* synthetic */ edg d;
    private final /* synthetic */ dpw e;

    dpz(dpw dpw, Context context, dpt dpt, String str, edg edg) {
        this.e = dpw;
        this.a = context;
        this.b = dpt;
        this.c = str;
        this.d = edg;
        super();
    }

    public final /* synthetic */ Object a() {
        dqu a2 = this.e.c.a(this.a, this.b, this.c, this.d, 2);
        if (a2 != null) {
            return a2;
        }
        dpw.a(this.a, "interstitial");
        return new dsi();
    }

    public final /* synthetic */ Object a(drg drg) {
        return drg.createInterstitialAdManager(cbj.a(this.a), this.b, this.c, this.d, bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
