package defpackage;

import android.content.Context;

/* renamed from: dqa reason: default package */
public final class dqa extends a<dqp> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ edg c;
    private final /* synthetic */ dpw d;

    public dqa(dpw dpw, Context context, String str, edg edg) {
        this.d = dpw;
        this.a = context;
        this.b = str;
        this.c = edg;
        super();
    }

    public final /* synthetic */ Object a() {
        dqp a2 = this.d.d.a(this.a, this.b, this.c);
        if (a2 != null) {
            return a2;
        }
        dpw.a(this.a, "native_ad");
        return new dsf();
    }

    public final /* synthetic */ Object a(drg drg) {
        return drg.createAdLoaderBuilder(cbj.a(this.a), this.b, this.c, bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
