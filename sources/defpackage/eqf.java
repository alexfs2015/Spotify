package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* renamed from: eqf reason: default package */
public final class eqf extends ett {
    final Map<String, Long> a = new dp();
    final Map<String, Integer> b = new dp();
    long c;

    public eqf(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j, eto eto) {
        if (eto == null) {
            q().k.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            q().k.a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            etp.a(eto, bundle, true);
            e().a("am", "_xa", bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, long j, eto eto) {
        if (eto == null) {
            q().k.a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            q().k.a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            etp.a(eto, bundle, true);
            e().a("am", "_xu", bundle);
        }
    }

    public final void a(long j) {
        eto v = h().v();
        for (String str : this.a.keySet()) {
            a(str, j - ((Long) this.a.get(str)).longValue(), v);
        }
        if (!this.a.isEmpty()) {
            a(j - this.c, v);
        }
        b(j);
    }

    /* access modifiers changed from: 0000 */
    public final void b(long j) {
        for (String put : this.a.keySet()) {
            this.a.put(put, Long.valueOf(j));
        }
        if (!this.a.isEmpty()) {
            this.c = j;
        }
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
}
