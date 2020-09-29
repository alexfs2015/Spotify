package defpackage;

import android.app.Activity;

/* renamed from: dpm reason: default package */
public final class dpm extends a<cci> {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ dpf b;

    public dpm(dpf dpf, Activity activity) {
        this.b = dpf;
        this.a = activity;
        super();
    }

    public final /* synthetic */ Object a() {
        cci a2 = this.b.h.a(this.a);
        if (a2 != null) {
            return a2;
        }
        dpf.a(this.a, "ad_overlay");
        return null;
    }

    public final /* synthetic */ Object a(dqp dqp) {
        return dqp.createAdOverlay(cas.a(this.a));
    }
}
