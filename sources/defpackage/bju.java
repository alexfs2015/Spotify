package defpackage;

import android.content.Context;
import android.view.View;

@cey
/* renamed from: bju reason: default package */
public abstract class bju extends bjp implements bhu, ccf {
    private boolean j;

    public bju(Context context, dpc dpc, String str, ecp ecp, coy coy, bki bki) {
        super(context, dpc, str, ecp, coy, bki);
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
    public csr a(cla cla, bkj bkj, ckk ckk) {
        cla cla2 = cla;
        View nextView = this.e.f.getNextView();
        if (nextView instanceof csr) {
            ((csr) nextView).destroy();
        }
        if (nextView != null) {
            this.e.f.removeView(nextView);
        }
        bjl.f();
        csr a = csy.a(this.e.c, cue.a(this.e.i), this.e.i.a, false, false, this.e.d, this.e.e, this.a, this, this.i, cla2.i);
        if (this.e.i.g == null) {
            a(a.o());
        }
        a.x().a(this, this, this, this, this, false, null, bkj, this, ckk);
        a(a);
        a.a(cla2.a.v);
        return a;
    }

    /* access modifiers changed from: protected */
    public void a(cla cla, dtc dtc) {
        if (cla.e != -2) {
            cmd.a.post(new bjw(this, cla));
            return;
        }
        if (cla.d != null) {
            this.e.i = cla.d;
        }
        if (!cla.b.g || cla.b.z) {
            cmd.a.post(new bjx(this, cla, this.i.c.a(this.e.c, this.e.e, cla.b), dtc));
            return;
        }
        this.e.I = 0;
        bjm bjm = this.e;
        bjl.d();
        bjm.h = cdc.a(this.e.c, this, cla, this.e.d, null, this.o, this, dtc);
    }

    /* access modifiers changed from: protected */
    public final void a(csr csr) {
        csr.a("/trackActiveViewUnit", (bgl<? super csr>) new bjv<Object>(this));
    }

    public final void a(dth dth) {
        bwx.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.e.B = dth;
    }

    public final void b_(View view) {
        this.e.H = view;
        b(new ckz(this.e.k));
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
            if (((Boolean) dpn.f().a(dsp.ce)).booleanValue()) {
                b(this.e.j.b);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(csr csr) {
        if (this.e.j != null) {
            this.g.a(this.e.i, this.e.j, csr.o(), csr);
            this.j = false;
            return;
        }
        this.j = true;
        cow.a(5);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(defpackage.ckz r3, defpackage.ckz r4) {
        /*
            r2 = this;
            bjm r0 = r2.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0018
            bjm r0 = r2.e
            bjn r0 = r0.f
            if (r0 == 0) goto L_0x0018
            bjm r0 = r2.e
            bjn r0 = r0.f
            cmw r0 = r0.a
            java.lang.String r1 = r4.A
            r0.b = r1
        L_0x0018:
            csr r0 = r4.b     // Catch:{ RuntimeException -> 0x004c }
            if (r0 == 0) goto L_0x004f
            boolean r0 = r4.n     // Catch:{ RuntimeException -> 0x004c }
            if (r0 != 0) goto L_0x004f
            boolean r0 = r4.M     // Catch:{ RuntimeException -> 0x004c }
            if (r0 == 0) goto L_0x004f
            dsf<java.lang.Boolean> r0 = defpackage.dsp.dj     // Catch:{ RuntimeException -> 0x004c }
            dsn r1 = defpackage.dpn.f()     // Catch:{ RuntimeException -> 0x004c }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ RuntimeException -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ RuntimeException -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ RuntimeException -> 0x004c }
            if (r0 == 0) goto L_0x004f
            doy r0 = r4.a     // Catch:{ RuntimeException -> 0x004c }
            android.os.Bundle r0 = r0.c     // Catch:{ RuntimeException -> 0x004c }
            java.lang.String r1 = "sdk_less_server_data"
            boolean r0 = r0.containsKey(r1)     // Catch:{ RuntimeException -> 0x004c }
            if (r0 != 0) goto L_0x004f
            csr r0 = r4.b     // Catch:{ all -> 0x0048 }
            r0.N()     // Catch:{ all -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            defpackage.clu.a()     // Catch:{ RuntimeException -> 0x004c }
            goto L_0x004f
        L_0x004c:
            defpackage.clu.a()
        L_0x004f:
            boolean r3 = super.a(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bju.a(ckz, ckz):boolean");
    }
}
