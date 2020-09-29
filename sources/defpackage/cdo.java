package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

@cfp
/* renamed from: cdo reason: default package */
public abstract class cdo implements cnm<Void>, cuq {
    protected final Context a;
    protected final cti b;
    protected cgp c;
    AtomicBoolean d = new AtomicBoolean(true);
    private final cdu e;
    private final clr f;
    private Runnable g;
    private final Object h = new Object();

    protected cdo(Context context, clr clr, cti cti, cdu cdu) {
        this.a = context;
        this.f = clr;
        this.c = this.f.b;
        this.b = cti;
        this.e = cdu;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(int i) {
        int i2 = i;
        if (i2 != -2) {
            this.c = new cgp(i2, this.c.j);
        }
        this.b.r();
        cdu cdu = this.e;
        cgl cgl = this.f.a;
        clq clq = r1;
        cdu cdu2 = cdu;
        clq clq2 = new clq(cgl.c, this.b, this.c.c, i, this.c.e, this.c.i, this.c.k, this.c.j, cgl.i, this.c.g, null, null, null, null, null, this.c.h, this.f.d, this.c.f, this.f.f, this.c.m, this.c.n, this.f.h, null, this.c.A, this.c.B, this.c.C, this.c.D, this.c.E, null, this.c.H, this.c.L, this.f.i, this.f.b.O, this.f.j, this.f.b.Q, this.c.R, this.f.b.S, this.f.b.T);
        cdu2.b(clq);
    }

    public final void a(boolean z) {
        cpn.a(3);
        int i = 0;
        if (this.d.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            a(i);
            cmu.a.removeCallbacks(this.g);
        }
    }

    public void b() {
        if (this.d.getAndSet(false)) {
            this.b.stopLoading();
            bkc.g();
            cna.a(this.b);
            a(-1);
            cmu.a.removeCallbacks(this.g);
        }
    }

    public final /* synthetic */ Object c() {
        bxo.b("Webview render task needs to be called on UI thread.");
        this.g = new cdp(this);
        cmu.a.postDelayed(this.g, ((Long) dqe.f().a(dtg.bz)).longValue());
        a();
        return null;
    }
}
