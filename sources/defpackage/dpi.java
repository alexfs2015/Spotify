package defpackage;

import android.content.Context;

/* renamed from: dpi reason: default package */
final class dpi extends a<dqd> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ dpc b;
    private final /* synthetic */ String c;
    private final /* synthetic */ ecp d;
    private final /* synthetic */ dpf e;

    dpi(dpf dpf, Context context, dpc dpc, String str, ecp ecp) {
        this.e = dpf;
        this.a = context;
        this.b = dpc;
        this.c = str;
        this.d = ecp;
        super();
    }

    public final /* synthetic */ Object a() {
        dqd a2 = this.e.c.a(this.a, this.b, this.c, this.d, 2);
        if (a2 != null) {
            return a2;
        }
        dpf.a(this.a, "interstitial");
        return new drr();
    }

    public final /* synthetic */ Object a(dqp dqp) {
        return dqp.createInterstitialAdManager(cas.a(this.a), this.b, this.c, this.d, brz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
