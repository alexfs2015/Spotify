package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: mht reason: default package */
public final class mht implements a {
    private final mhe a;
    private final mhr b;
    private final hhc c;
    private final mhk d;
    private final mho e;
    private final xok f = new xok();
    private b g;

    public mht(mhe mhe, mhr mhr, hhc hhc, mhk mhk, mho mho) {
        this.a = mhe;
        this.b = mhr;
        this.c = hhc;
        this.d = mhk;
        this.e = mho;
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

    public final void a() {
        this.d.a("impression");
        this.g.l();
        this.f.a(this.a.a().a(wit.a(this.c.c())).a((xis<? super T>) new $$Lambda$mht$6VqIZxRCCI2shN0RJw0XCj1DPTo<Object>(this), (xis<Throwable>) new $$Lambda$mht$y2QgJXjdSCOr0JtQDdoa9gaJc<Throwable>(this)));
    }

    public final void a(int i, Intent intent) {
        if ("cls_unlocked".equals(intent != null ? intent.getStringExtra("reason") : null)) {
            this.a.b();
            this.g.m();
            return;
        }
        this.g.k();
    }

    public final void a(b bVar) {
        this.g = bVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a();
        }
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
        this.f.a(this.b.a().a(wit.a(this.c.c())).a((xis<? super T>) new $$Lambda$mht$laUtwmD4TWETchh644XND3LxR6k<Object>(this), (xis<Throwable>) new $$Lambda$mht$an_Jk29gaRdTwHRBAjD6pd5d0<Throwable>(this)));
    }

    public final void e() {
        this.d.a("back-click");
        this.g.n();
    }
}
