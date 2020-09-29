package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: dqb reason: default package */
final class dqb extends a<dvv> {
    private final /* synthetic */ FrameLayout a;
    private final /* synthetic */ FrameLayout b;
    private final /* synthetic */ Context c;
    private final /* synthetic */ dpw d;

    dqb(dpw dpw, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.d = dpw;
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = context;
        super();
    }

    public final /* synthetic */ Object a() {
        dvv a2 = this.d.f.a(this.c, this.a, this.b);
        if (a2 != null) {
            return a2;
        }
        dpw.a(this.c, "native_ad_view_delegate");
        return new dsk();
    }

    public final /* synthetic */ Object a(drg drg) {
        return drg.createNativeAdViewDelegate(cbj.a(this.a), cbj.a(this.b));
    }
}
