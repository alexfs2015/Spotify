package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: euq reason: default package */
public final class euq extends eur {
    long a = l().b();
    long b = this.a;
    final ewe c = new eus(this, this.r);
    final ewe d = new eut(this, this.r);
    final ewe e = new euu(this, this.r);
    private Handler f;

    euq(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void v() {
        synchronized (this) {
            if (this.f == null) {
                this.f = new ejq(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j) {
        c();
        v();
        a(j, false);
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j, boolean z) {
        c();
        v();
        this.c.c();
        this.d.c();
        if (s().h(f().v()) || s().i(f().v())) {
            this.e.c();
        }
        if (r().a(j)) {
            r().n.a(true);
            r().p.a(0);
        }
        if (r().n.a()) {
            b(j);
            return;
        }
        this.d.a(Math.max(0, 3600000 - r().p.a()));
        if (z && s().k(f().v())) {
            r().o.a(j);
            if (s().h(f().v()) || s().i(f().v())) {
                this.e.c();
                this.e.a(r().m.a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(long j) {
        c();
        q().k.a("Session started, time", Long.valueOf(l().b()));
        Long l = null;
        Long valueOf = s().h(f().v()) ? Long.valueOf(j / 1000) : null;
        if (s().i(f().v())) {
            l = Long.valueOf(-1);
        }
        long j2 = j;
        e().a("auto", "_sid", (Object) valueOf, j2);
        e().a("auto", "_sno", (Object) l, j2);
        r().n.a(false);
        Bundle bundle = new Bundle();
        if (s().h(f().v())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        e().a("auto", "_s", j, bundle);
        r().o.a(j);
    }

    /* access modifiers changed from: 0000 */
    public final long w() {
        long b2 = l().b();
        long j = b2 - this.b;
        this.b = b2;
        return j;
    }

    public final boolean a(boolean z, boolean z2) {
        c();
        D();
        long b2 = l().b();
        r().o.a(l().a());
        long j = b2 - this.a;
        if (z || j >= 1000) {
            r().p.a(j);
            q().k.a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            etp.a(h().v(), bundle, true);
            if (s().l(f().v())) {
                if (s().c(f().v(), eqm.aj)) {
                    if (!z2) {
                        w();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    w();
                }
            }
            if (!s().c(f().v(), eqm.aj) || !z2) {
                e().a("auto", "_e", bundle);
            }
            this.a = b2;
            this.d.c();
            this.d.a(Math.max(0, 3600000 - r().p.a()));
            return true;
        }
        q().k.a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqf d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ etc e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ eqq f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ ets g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ etp h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ eqs i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ euq j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }

    static /* synthetic */ void a(euq euq) {
        euq.c();
        euq.a(false, false);
        euq.d().a(euq.l().b());
    }
}
