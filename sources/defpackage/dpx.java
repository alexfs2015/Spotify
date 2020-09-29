package defpackage;

import android.content.Context;

/* renamed from: dpx reason: default package */
public final class dpx extends a<dqu> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ dpt b;
    private final /* synthetic */ String c;
    private final /* synthetic */ edg d;
    private final /* synthetic */ dpw e;

    public dpx(dpw dpw, Context context, dpt dpt, String str, edg edg) {
        this.e = dpw;
        this.a = context;
        this.b = dpt;
        this.c = str;
        this.d = edg;
        super();
    }

    public final /* synthetic */ Object a() {
        dqu a2 = this.e.c.a(this.a, this.b, this.c, this.d, 1);
        if (a2 != null) {
            return a2;
        }
        dpw.a(this.a, "banner");
        return new dsi();
    }

    public final /* synthetic */ Object a(drg drg) {
        return drg.createBannerAdManager(cbj.a(this.a), this.b, this.c, this.d, bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
