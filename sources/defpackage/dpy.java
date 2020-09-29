package defpackage;

import android.content.Context;

/* renamed from: dpy reason: default package */
public final class dpy extends a<dqu> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ dpt b;
    private final /* synthetic */ String c;
    private final /* synthetic */ dpw d;

    public dpy(dpw dpw, Context context, dpt dpt, String str) {
        this.d = dpw;
        this.a = context;
        this.b = dpt;
        this.c = str;
        super();
    }

    public final /* synthetic */ Object a() {
        dqu a2 = this.d.c.a(this.a, this.b, this.c, null, 3);
        if (a2 != null) {
            return a2;
        }
        dpw.a(this.a, "search");
        return new dsi();
    }

    public final /* synthetic */ Object a(drg drg) {
        return drg.createSearchAdManager(cbj.a(this.a), this.b, this.c, bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
