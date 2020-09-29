package defpackage;

import android.content.Context;
import android.view.View;

@cfp
/* renamed from: bkl reason: default package */
public abstract class bkl extends bkg implements bil, ccw {
    private boolean j;

    public bkl(Context context, dpt dpt, String str, edg edg, cpp cpp, bkz bkz) {
        super(context, dpt, str, edg, cpp, bkz);
    }

    /* access modifiers changed from: protected */
    public final boolean M() {
        return (this.e.k == null || this.e.k.b == null || !this.e.k.b.Q) ? false : true;
    }

    public final void N() {
        w();
    }

    public final void O() {
        u();
    }

    /* access modifiers changed from: protected */
    public cti a(clr clr, bla bla, clb clb) {
        clr clr2 = clr;
        View nextView = this.e.f.getNextView();
        if (nextView instanceof cti) {
            ((cti) nextView).destroy();
        }
        if (nextView != null) {
            this.e.f.removeView(nextView);
        }
        bkc.f();
        cti a = ctp.a(this.e.c, cuv.a(this.e.i), this.e.i.a, false, false, this.e.d, this.e.e, this.a, this, this.i, clr2.i);
        if (this.e.i.g == null) {
            a(a.o());
        }
        a.x().a(this, this, this, this, this, false, null, bla, this, clb);
        a(a);
        a.a(clr2.a.v);
        return a;
    }

    /* access modifiers changed from: protected */
    public void a(clr clr, dtt dtt) {
        if (clr.e != -2) {
            cmu.a.post(new bkn(this, clr));
            return;
        }
        if (clr.d != null) {
            this.e.i = clr.d;
        }
        if (!clr.b.g || clr.b.z) {
            cmu.a.post(new bko(this, clr, this.i.c.a(this.e.c, this.e.e, clr.b), dtt));
            return;
        }
        this.e.I = 0;
        bkd bkd = this.e;
        bkc.d();
        bkd.h = cdt.a(this.e.c, this, clr, this.e.d, null, this.o, this, dtt);
    }

    /* access modifiers changed from: protected */
    public final void a(cti cti) {
        cti.a("/trackActiveViewUnit", (bhc<? super cti>) new bkm<Object>(this));
    }

    public final void a(dty dty) {
        bxo.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.e.B = dty;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(defpackage.clq r3, defpackage.clq r4) {
        /*
            r2 = this;
            bkd r0 = r2.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0018
            bkd r0 = r2.e
            bke r0 = r0.f
            if (r0 == 0) goto L_0x0018
            bkd r0 = r2.e
            bke r0 = r0.f
            cnn r0 = r0.a
            java.lang.String r1 = r4.A
            r0.b = r1
        L_0x0018:
            cti r0 = r4.b     // Catch:{ RuntimeException -> 0x004c }
            if (r0 == 0) goto L_0x004f
            boolean r0 = r4.n     // Catch:{ RuntimeException -> 0x004c }
            if (r0 != 0) goto L_0x004f
            boolean r0 = r4.M     // Catch:{ RuntimeException -> 0x004c }
            if (r0 == 0) goto L_0x004f
            dsw<java.lang.Boolean> r0 = defpackage.dtg.dj     // Catch:{ RuntimeException -> 0x004c }
            dte r1 = defpackage.dqe.f()     // Catch:{ RuntimeException -> 0x004c }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ RuntimeException -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ RuntimeException -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ RuntimeException -> 0x004c }
            if (r0 == 0) goto L_0x004f
            dpp r0 = r4.a     // Catch:{ RuntimeException -> 0x004c }
            android.os.Bundle r0 = r0.c     // Catch:{ RuntimeException -> 0x004c }
            java.lang.String r1 = "sdk_less_server_data"
            boolean r0 = r0.containsKey(r1)     // Catch:{ RuntimeException -> 0x004c }
            if (r0 != 0) goto L_0x004f
            cti r0 = r4.b     // Catch:{ all -> 0x0048 }
            r0.N()     // Catch:{ all -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            defpackage.cml.a()     // Catch:{ RuntimeException -> 0x004c }
            goto L_0x004f
        L_0x004c:
            defpackage.cml.a()
        L_0x004f:
            boolean r3 = super.a(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkl.a(clq, clq):boolean");
    }

    /* access modifiers changed from: 0000 */
    public final void b(cti cti) {
        if (this.e.j != null) {
            this.g.a(this.e.i, this.e.j, cti.o(), cti);
            this.j = false;
            return;
        }
        this.j = true;
        cpn.a(5);
    }

    public final void b_(View view) {
        this.e.H = view;
        b(new clq(this.e.k));
    }

    public final void v_() {
        e();
    }

    public final void w_() {
        aa();
        n();
    }

    /* access modifiers changed from: protected */
    public void x() {
        super.x();
        if (this.j) {
            if (((Boolean) dqe.f().a(dtg.ce)).booleanValue()) {
                b(this.e.j.b);
            }
        }
    }
}
