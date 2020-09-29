package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import java.util.concurrent.Future;

@cfp
/* renamed from: cjv reason: default package */
public final class cjv extends cmg implements cka, ckd, cki {
    public final String a;
    final Context b;
    final String c;
    final ecp d;
    volatile bgi e;
    private final clr f;
    private final ckj g;
    private final ckd h;
    private final Object i;
    private final long k;
    private int l = 0;
    private int m = 3;
    private cjy n;
    private Future o;

    public cjv(Context context, String str, String str2, ecp ecp, clr clr, ckj ckj, ckd ckd, long j) {
        this.b = context;
        this.a = str;
        this.c = str2;
        this.d = ecp;
        this.f = clr;
        this.g = ckj;
        this.i = new Object();
        this.h = ckd;
        this.k = j;
    }

    private final boolean a(long j) {
        int i2;
        long b2 = this.k - (bkc.l().b() - j);
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

    public final void a() {
        Handler handler;
        Runnable cjx;
        ckj ckj = this.g;
        if (ckj != null && ckj.b != null && this.g.a != null) {
            ckc ckc = this.g.b;
            ckc.b = null;
            ckc.a = this;
            ckc.c = this;
            dpp dpp = this.f.a.c;
            edj edj = this.g.a;
            try {
                if (edj.g()) {
                    handler = cpc.a;
                    cjx = new cjw(this, dpp, edj);
                } else {
                    handler = cpc.a;
                    cjx = new cjx(this, edj, dpp, ckc);
                }
                handler.post(cjx);
            } catch (RemoteException unused) {
                cpn.a(5);
                a(0);
            }
            long b2 = bkc.l().b();
            while (true) {
                synchronized (this.i) {
                    if (this.l != 0) {
                        cjz cjz = new cjz();
                        cjz.d = bkc.l().b() - b2;
                        cjz.c = 1 == this.l ? 6 : this.m;
                        cjz.a = this.a;
                        cjz.b = this.d.d;
                        this.n = cjz.a();
                    } else if (!a(b2)) {
                        cjz cjz2 = new cjz();
                        cjz2.c = this.m;
                        cjz2.d = bkc.l().b() - b2;
                        cjz2.a = this.a;
                        cjz2.b = this.d.d;
                        this.n = cjz2.a();
                    }
                }
            }
            ckc.b = null;
            ckc.a = null;
            if (this.l == 1) {
                this.h.a(this.a);
            } else {
                this.h.a(this.m);
            }
        }
    }

    public final void a(int i2) {
        synchronized (this.i) {
            this.l = 2;
            this.m = i2;
            this.i.notify();
        }
    }

    public final void a(Bundle bundle) {
        bgi bgi = this.e;
        if (bgi != null) {
            bgi.a(bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(dpp dpp, edj edj) {
        this.g.b.b = this;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                edj.a(dpp, this.c, this.d.a);
            } else {
                edj.a(dpp, this.c);
            }
        } catch (RemoteException unused) {
            cpn.a(5);
            a(0);
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
        cqi cqi = (cqi) c();
        this.o = cqi;
        return cqi;
    }

    public final cjy e() {
        cjy cjy;
        synchronized (this.i) {
            cjy = this.n;
        }
        return cjy;
    }

    public final void f() {
        a(this.f.a.c, this.g.a);
    }

    public final void g() {
        a(0);
    }

    public final void s_() {
    }
}
