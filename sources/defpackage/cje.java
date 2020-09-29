package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import java.util.concurrent.Future;

@cey
/* renamed from: cje reason: default package */
public final class cje extends clp implements cjj, cjm, cjr {
    public final String a;
    final Context b;
    final String c;
    final eby d;
    volatile bfr e;
    private final cla f;
    private final cjs g;
    private final cjm h;
    private final Object i;
    private final long k;
    private int l = 0;
    private int m = 3;
    private cjh n;
    private Future o;

    public cje(Context context, String str, String str2, eby eby, cla cla, cjs cjs, cjm cjm, long j) {
        this.b = context;
        this.a = str;
        this.c = str2;
        this.d = eby;
        this.f = cla;
        this.g = cjs;
        this.i = new Object();
        this.h = cjm;
        this.k = j;
    }

    private final boolean a(long j) {
        int i2;
        long b2 = this.k - (bjl.l().b() - j);
        if (b2 <= 0) {
            i2 = 4;
        } else {
            try {
                this.i.wait(b2);
                return true;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i2 = 5;
            }
        }
        this.m = i2;
        return false;
    }

    public final void a(int i2) {
        synchronized (this.i) {
            this.l = 2;
            this.m = i2;
            this.i.notify();
        }
    }

    public final void a(Bundle bundle) {
        bfr bfr = this.e;
        if (bfr != null) {
            bfr.a(bundle);
        }
    }

    public final void a(String str) {
        synchronized (this.i) {
            this.l = 1;
            this.i.notify();
        }
    }

    public final Future d() {
        Future future = this.o;
        if (future != null) {
            return future;
        }
        cpr cpr = (cpr) c();
        this.o = cpr;
        return cpr;
    }

    public final cjh e() {
        cjh cjh;
        synchronized (this.i) {
            cjh = this.n;
        }
        return cjh;
    }

    public final void g() {
        a(0);
    }

    public final void s_() {
    }

    public final void a() {
        Handler handler;
        Runnable cjg;
        cjs cjs = this.g;
        if (cjs != null && cjs.b != null && this.g.a != null) {
            cjl cjl = this.g.b;
            cjl.b = null;
            cjl.a = this;
            cjl.c = this;
            doy doy = this.f.a.c;
            ecs ecs = this.g.a;
            try {
                if (ecs.g()) {
                    handler = col.a;
                    cjg = new cjf(this, doy, ecs);
                } else {
                    handler = col.a;
                    cjg = new cjg(this, ecs, doy, cjl);
                }
                handler.post(cjg);
            } catch (RemoteException unused) {
                cow.a(5);
                a(0);
            }
            long b2 = bjl.l().b();
            while (true) {
                synchronized (this.i) {
                    if (this.l != 0) {
                        cji cji = new cji();
                        cji.d = bjl.l().b() - b2;
                        cji.c = 1 == this.l ? 6 : this.m;
                        cji.a = this.a;
                        cji.b = this.d.d;
                        this.n = cji.a();
                    } else if (!a(b2)) {
                        cji cji2 = new cji();
                        cji2.c = this.m;
                        cji2.d = bjl.l().b() - b2;
                        cji2.a = this.a;
                        cji2.b = this.d.d;
                        this.n = cji2.a();
                    }
                }
            }
            cjl.b = null;
            cjl.a = null;
            if (this.l == 1) {
                this.h.a(this.a);
            } else {
                this.h.a(this.m);
            }
        }
    }

    public final void f() {
        a(this.f.a.c, this.g.a);
    }

    /* access modifiers changed from: 0000 */
    public final void a(doy doy, ecs ecs) {
        this.g.b.b = this;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                ecs.a(doy, this.c, this.d.a);
            } else {
                ecs.a(doy, this.c);
            }
        } catch (RemoteException unused) {
            cow.a(5);
            a(0);
        }
    }
}
