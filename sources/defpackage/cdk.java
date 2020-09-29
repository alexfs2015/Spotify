package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@cey
/* renamed from: cdk reason: default package */
public final class cdk extends clp {
    final cdd a;
    private final cfy b;
    private final cla c;
    private final cdm d;
    private final Object e;
    private Future<ckz> f;

    public cdk(Context context, bis bis, cla cla, dhx dhx, cdd cdd, dtc dtc) {
        cdm cdm = new cdm(context, bis, new cnl(context), dhx, cla, dtc);
        this(cla, cdd, cdm);
    }

    private cdk(cla cla, cdd cdd, cdm cdm) {
        this.e = new Object();
        this.c = cla;
        this.b = cla.b;
        this.a = cdd;
        this.d = cdm;
    }

    public final void s_() {
        synchronized (this.e) {
            if (this.f != null) {
                this.f.cancel(true);
            }
        }
    }

    public final void a() {
        int i;
        ckz ckz = null;
        try {
            synchronized (this.e) {
                this.f = cmb.a((Callable<T>) this.d);
            }
            ckz = (ckz) this.f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException unused) {
            cow.a(5);
            this.f.cancel(true);
            i = 2;
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        cmd.a.post(new cdl(this, ckz != null ? ckz : new ckz(this.c.a.c, null, null, i, null, null, this.b.k, this.b.j, this.c.a.i, false, null, null, null, null, null, this.b.h, this.c.d, this.b.f, this.c.f, this.b.m, this.b.n, this.c.h, null, null, null, null, this.c.b.D, this.c.b.E, null, null, this.b.L, this.c.i, this.c.b.O, false, this.c.b.Q, null, this.c.b.S, this.c.b.T)));
    }
}
