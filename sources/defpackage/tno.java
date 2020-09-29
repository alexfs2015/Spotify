package defpackage;

/* renamed from: tno reason: default package */
public final class tno implements c {
    private final gvs a;
    private final gwd b;
    private final hgz c;
    private final uix d;
    private xip e = xnu.a(xnp.a());

    public tno(gvs gvs, gwd gwd, hgz hgz, uix uix) {
        this.a = gvs;
        this.b = gwd;
        this.c = hgz;
        this.d = uix;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (!this.a.b() || !bool.booleanValue()) {
            if (this.a.b()) {
                this.a.b(false);
            }
            return;
        }
        this.b.a(true);
    }

    public final void ai_() {
        this.e = uix.a(this.c).a((xis<? super T>) new $$Lambda$tno$1ZDpCrHx5qtiRw88lGt6fMRWJwg<Object>(this), (xis<Throwable>) $$Lambda$tno$p_vbgoB_yv08QGqc8m0rzD4Y2No.INSTANCE);
    }

    public final void aj_() {
        if (!this.e.isUnsubscribed()) {
            this.e.unsubscribe();
        }
    }

    public final String c() {
        return "DriverDistractionAlwaysOn";
    }
}
