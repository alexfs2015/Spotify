package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: mdn reason: default package */
final class mdn implements a {
    private final mdh a;
    private final mdb b;
    private final heg c;
    private final mdl d;
    private final xag e = new xag();
    private b f;

    public mdn(mdh mdh, mdb mdb, heg heg, mdl mdl) {
        this.a = mdh;
        this.b = mdb;
        this.c = heg;
        this.d = mdl;
    }

    public final void a(b bVar) {
        this.f = bVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.d.a();
        }
    }

    public final void a() {
        this.a.a("impression");
        this.f.l();
        this.e.a(this.b.a().a(vun.a(this.c.c())).a((wun<? super T>) new $$Lambda$mdn$rcCndg3Hs3DC1dq9KaQkLHLX_QE<Object>(this), (wun<Throwable>) new $$Lambda$mdn$sBVyvomAJho8P_9NRmqZloBODG8<Throwable>(this)));
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
}
