package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: dpk reason: default package */
final class dpk extends a<dve> {
    private final /* synthetic */ FrameLayout a;
    private final /* synthetic */ FrameLayout b;
    private final /* synthetic */ Context c;
    private final /* synthetic */ dpf d;

    dpk(dpf dpf, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.d = dpf;
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = context;
        super();
    }

    public final /* synthetic */ Object a() {
        dve a2 = this.d.f.a(this.c, this.a, this.b);
        if (a2 != null) {
            return a2;
        }
        dpf.a(this.c, "native_ad_view_delegate");
        return new drt();
    }

    public final /* synthetic */ Object a(dqp dqp) {
        return dqp.createNativeAdViewDelegate(cas.a(this.a), cas.a(this.b));
    }
}
