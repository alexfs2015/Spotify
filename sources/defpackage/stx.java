package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: stx reason: default package */
public final class stx implements stq {
    private final FrameLayout a;
    private final stv b;
    private final stz c;
    private final sto d;
    private final str e;
    private final String f;
    private final sue g;
    private stn h;

    public stx(who<View> who, stz stz, sto sto, str str, sue sue, String str2, stv stv) {
        this.c = stz;
        this.d = sto;
        this.e = str;
        this.g = sue;
        this.b = stv;
        this.f = str2;
        this.a = (FrameLayout) who.get();
    }

    public final void a(View view, View view2) {
        if (this.h == null) {
            stz stz = this.c;
            int a2 = stz.b.a();
            if ((stz.a.a() && a2 <= 0) || (stz.a.b() && a2 < 3)) {
                sto sto = this.d;
                stv stv = this.b;
                stn stn = new stn(sto.a);
                stn.a = view;
                stn.b = view2;
                stn.setOnClickListener(stv);
                stn.setVisibility(8);
                this.h = stn;
                this.a.addView(this.h);
                str str = this.e;
                str.b.a().a(str.a, str.a() + 1).b();
                this.h.a();
                this.g.b(this.f, "popup");
            }
        }
    }
}
