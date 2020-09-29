package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@cfp
/* renamed from: ceb reason: default package */
public final class ceb extends cmg {
    final cdu a;
    private final cgp b;
    private final clr c;
    private final ced d;
    private final Object e;
    private Future<clq> f;

    public ceb(Context context, bjj bjj, clr clr, dio dio, cdu cdu, dtt dtt) {
        ced ced = new ced(context, bjj, new coc(context), dio, clr, dtt);
        this(clr, cdu, ced);
    }

    private ceb(clr clr, cdu cdu, ced ced) {
        this.e = new Object();
        this.c = clr;
        this.b = clr.b;
        this.a = cdu;
        this.d = ced;
    }

    public final void a() {
        int i;
        clq clq = null;
        try {
            synchronized (this.e) {
                this.f = cms.a((Callable<T>) this.d);
            }
            clq = (clq) this.f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException unused) {
            cpn.a(5);
            this.f.cancel(true);
            i = 2;
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        cmu.a.post(new cec(this, clq != null ? clq : new clq(this.c.a.c, null, null, i, null, null, this.b.k, this.b.j, this.c.a.i, false, null, null, null, null, null, this.b.h, this.c.d, this.b.f, this.c.f, this.b.m, this.b.n, this.c.h, null, null, null, null, this.c.b.D, this.c.b.E, null, null, this.b.L, this.c.i, this.c.b.O, false, this.c.b.Q, null, this.c.b.S, this.c.b.T)));
    }

    public final void s_() {
        synchronized (this.e) {
            if (this.f != null) {
                this.f.cancel(true);
            }
        }
    }
}
