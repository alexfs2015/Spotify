package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

@cey
/* renamed from: ccx reason: default package */
public abstract class ccx implements cmv<Void>, ctz {
    protected final Context a;
    protected final csr b;
    protected cfy c;
    AtomicBoolean d = new AtomicBoolean(true);
    private final cdd e;
    private final cla f;
    private Runnable g;
    private final Object h = new Object();

    protected ccx(Context context, cla cla, csr csr, cdd cdd) {
        this.a = context;
        this.f = cla;
        this.c = this.f.b;
        this.b = csr;
        this.e = cdd;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(int i) {
        int i2 = i;
        if (i2 != -2) {
            this.c = new cfy(i2, this.c.j);
        }
        this.b.r();
        cdd cdd = this.e;
        cfu cfu = this.f.a;
        ckz ckz = r1;
        cdd cdd2 = cdd;
        ckz ckz2 = new ckz(cfu.c, this.b, this.c.c, i, this.c.e, this.c.i, this.c.k, this.c.j, cfu.i, this.c.g, null, null, null, null, null, this.c.h, this.f.d, this.c.f, this.f.f, this.c.m, this.c.n, this.f.h, null, this.c.A, this.c.B, this.c.C, this.c.D, this.c.E, null, this.c.H, this.c.L, this.f.i, this.f.b.O, this.f.j, this.f.b.Q, this.c.R, this.f.b.S, this.f.b.T);
        cdd2.b(ckz);
    }

    public void b() {
        if (this.d.getAndSet(false)) {
            this.b.stopLoading();
            bjl.g();
            cmj.a(this.b);
            a(-1);
            cmd.a.removeCallbacks(this.g);
        }
    }

    public final /* synthetic */ Object c() {
        bwx.b("Webview render task needs to be called on UI thread.");
        this.g = new ccy(this);
        cmd.a.postDelayed(this.g, ((Long) dpn.f().a(dsp.bz)).longValue());
        a();
        return null;
    }

    public final void a(boolean z) {
        cow.a(3);
        int i = 0;
        if (this.d.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            a(i);
            cmd.a.removeCallbacks(this.g);
        }
    }
}
