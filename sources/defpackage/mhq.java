package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: mhq reason: default package */
final class mhq implements a {
    private final mhk a;
    private final mhe b;
    private final hhc c;
    private final mho d;
    private final xok e = new xok();
    private b f;

    public mhq(mhk mhk, mhe mhe, hhc hhc, mho mho) {
        this.a = mhk;
        this.b = mhe;
        this.c = hhc;
        this.d = mho;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f.m();
        } else {
            this.f.k();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Cannot detect churn locked state!", new Object[0]);
        this.f.k();
    }

    public final void a() {
        this.a.a("impression");
        this.f.l();
        this.e.a(this.b.a().a(wit.a(this.c.c())).a((xis<? super T>) new $$Lambda$mhq$ghNg7RDc7k3akaBytAh077ADbb8<Object>(this), (xis<Throwable>) new $$Lambda$mhq$Pzb9UzxwYL3MD5bsEvMgDigoc<Throwable>(this)));
    }

    public final void a(int i, Intent intent) {
        if (i != -1) {
            this.f.k();
            return;
        }
        if ("cls_unlocked".equals(intent != null ? intent.getStringExtra("reason") : null)) {
            this.b.b();
            this.f.m();
            return;
        }
        this.f.k();
    }

    public final void a(b bVar) {
        this.f = bVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.d.a();
        }
    }

    public final void b() {
        this.e.unsubscribe();
    }

    public final void c() {
        this.a.a("update-payment-click");
        this.f.l();
        this.f.a("https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_update_payment&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls");
    }

    public final void d() {
        this.a.a("downgrade-click");
        this.f.l();
        this.f.b("https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_cancel_subscription&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls");
    }

    public final void e() {
        this.a.a("back-click");
        this.f.n();
    }
}
