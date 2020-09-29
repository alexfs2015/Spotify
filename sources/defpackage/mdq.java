package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: mdq reason: default package */
public final class mdq implements a {
    private final mdb a;
    private final mdo b;
    private final heg c;
    private final mdh d;
    private final mdl e;
    private final xag f = new xag();
    private b g;

    public mdq(mdb mdb, mdo mdo, heg heg, mdh mdh, mdl mdl) {
        this.a = mdb;
        this.b = mdo;
        this.c = heg;
        this.d = mdh;
        this.e = mdl;
    }

    public final void a(b bVar) {
        this.g = bVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a();
        }
    }

    public final void a() {
        this.d.a("impression");
        this.g.l();
        this.f.a(this.a.a().a(vun.a(this.c.c())).a((wun<? super T>) new $$Lambda$mdq$1Xh2U4sWh1HyOTMJsHF_aR1fXLs<Object>(this), (wun<Throwable>) new $$Lambda$mdq$giycDesZuIDN6j5fPUTTCo3XLs<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.g.k();
        } else {
            this.g.m();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th, "Cannot detect churn locked state!", new Object[0]);
        this.g.k();
    }

    public final void b() {
        this.f.unsubscribe();
    }

    public final void c() {
        this.d.a("update-payment-click");
        this.g.l();
        this.g.a("https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_update_payment&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls_modal");
    }

    public final void d() {
        this.d.a("downgrade-click");
        this.g.l();
        this.f.a(this.b.a().a(vun.a(this.c.c())).a((wun<? super T>) new $$Lambda$mdq$sgQs1bF3XY_dEh3TULBvg4oS5Mg<Object>(this), (wun<Throwable>) new $$Lambda$mdq$5Ossk2O97Yc2oyDiNHaRsvqlgQ<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.b();
            this.g.m();
            return;
        }
        this.g.k();
        this.g.q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Cannot unlock user from churn locked state", new Object[0]);
        this.g.k();
        this.g.q();
    }

    public final void e() {
        this.d.a("back-click");
        this.g.n();
    }

    public final void a(int i, Intent intent) {
        if ("cls_unlocked".equals(intent != null ? intent.getStringExtra("reason") : null)) {
            this.a.b();
            this.g.m();
            return;
        }
        this.g.k();
    }
}
