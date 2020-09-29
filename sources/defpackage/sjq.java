package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: sjq reason: default package */
public final class sjq implements sjj {
    private final FrameLayout a;
    private final sjo b;
    private final sjs c;
    private final sjh d;
    private final sjk e;
    private final String f;
    private final sjx g;
    private sjg h;

    public sjq(vti<View> vti, sjs sjs, sjh sjh, sjk sjk, sjx sjx, String str, sjo sjo) {
        this.c = sjs;
        this.d = sjh;
        this.e = sjk;
        this.g = sjx;
        this.b = sjo;
        this.f = str;
        this.a = (FrameLayout) vti.get();
    }

    public final void a(View view, View view2) {
        if (this.h == null) {
            sjs sjs = this.c;
            int a2 = sjs.b.a();
            if ((sjs.a.a() && a2 <= 0) || (sjs.a.b() && a2 < 3)) {
                sjh sjh = this.d;
                sjo sjo = this.b;
                sjg sjg = new sjg(sjh.a);
                sjg.a = view;
                sjg.b = view2;
                sjg.setOnClickListener(sjo);
                sjg.setVisibility(8);
                this.h = sjg;
                this.a.addView(this.h);
                sjk sjk = this.e;
                sjk.b.a().a(sjk.a, sjk.a() + 1).b();
                this.h.a();
                this.g.b(this.f, "popup");
            }
        }
    }
}
