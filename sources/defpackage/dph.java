package defpackage;

import android.content.Context;

/* renamed from: dph reason: default package */
public final class dph extends a<dqd> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ dpc b;
    private final /* synthetic */ String c;
    private final /* synthetic */ dpf d;

    public dph(dpf dpf, Context context, dpc dpc, String str) {
        this.d = dpf;
        this.a = context;
        this.b = dpc;
        this.c = str;
        super();
    }

    public final /* synthetic */ Object a() {
        dqd a2 = this.d.c.a(this.a, this.b, this.c, null, 3);
        if (a2 != null) {
            return a2;
        }
        dpf.a(this.a, "search");
        return new drr();
    }

    public final /* synthetic */ Object a(dqp dqp) {
        return dqp.createSearchAdManager(cas.a(this.a), this.b, this.c, brz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
