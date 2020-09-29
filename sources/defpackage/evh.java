package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: evh reason: default package */
public final class evh extends evi {
    long a = l().b();
    long b = this.a;
    final ewv c = new evj(this, this.r);
    final ewv d = new evk(this, this.r);
    final ewv e = new evl(this, this.r);
    private Handler f;

    evh(esp esp) {
        super(esp);
    }

    static /* synthetic */ void a(evh evh) {
        evh.c();
        evh.a(false, false);
        evh.d().a(evh.l().b());
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
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
            eug.a(h().v(), bundle, true);
            if (s().l(f().v())) {
                if (s().c(f().v(), erd.aj)) {
                    if (!z2) {
                        w();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    w();
                }
            }
            if (!s().c(f().v(), erd.aj) || !z2) {
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

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
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

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqw d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ ett e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ erh f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ euj g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ eug h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ erj i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ evh j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void v() {
        synchronized (this) {
            if (this.f == null) {
                this.f = new ekh(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final long w() {
        long b2 = l().b();
        long j = b2 - this.b;
        this.b = b2;
        return j;
    }
}
