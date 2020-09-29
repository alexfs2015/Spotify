package defpackage;

import android.app.Activity;

/* renamed from: dqd reason: default package */
public final class dqd extends a<ccz> {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ dpw b;

    public dqd(dpw dpw, Activity activity) {
        this.b = dpw;
        this.a = activity;
        super();
    }

    public final /* synthetic */ Object a() {
        ccz a2 = this.b.h.a(this.a);
        if (a2 != null) {
            return a2;
        }
        dpw.a(this.a, "ad_overlay");
        return null;
    }

    public final /* synthetic */ Object a(drg drg) {
        return drg.createAdOverlay(cbj.a(this.a));
    }
}
