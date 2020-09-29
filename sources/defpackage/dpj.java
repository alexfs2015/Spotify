package defpackage;

import android.content.Context;

/* renamed from: dpj reason: default package */
public final class dpj extends a<dpy> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ ecp c;
    private final /* synthetic */ dpf d;

    public dpj(dpf dpf, Context context, String str, ecp ecp) {
        this.d = dpf;
        this.a = context;
        this.b = str;
        this.c = ecp;
        super();
    }

    public final /* synthetic */ Object a() {
        dpy a2 = this.d.d.a(this.a, this.b, this.c);
        if (a2 != null) {
            return a2;
        }
        dpf.a(this.a, "native_ad");
        return new dro();
    }

    public final /* synthetic */ Object a(dqp dqp) {
        return dqp.createAdLoaderBuilder(cas.a(this.a), this.b, this.c, brz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
