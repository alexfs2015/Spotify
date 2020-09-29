package defpackage;

import android.os.Bundle;

/* renamed from: euh reason: default package */
final class euh implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ euf b;
    private final /* synthetic */ euf c;
    private final /* synthetic */ eug d;

    euh(eug eug, boolean z, euf euf, euf euf2) {
        this.d = eug;
        this.a = z;
        this.b = euf;
        this.c = euf2;
    }

    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.d.s().l(this.d.f().v())) {
            z = this.a && this.d.a != null;
            if (z) {
                eug eug = this.d;
                eug.a(eug, eug.a, true);
            }
        } else {
            if (this.a && this.d.a != null) {
                eug eug2 = this.d;
                eug.a(eug2, eug2.a, true);
            }
            z = false;
        }
        euf euf = this.b;
        if (euf == null || euf.c != this.c.c || !ewd.c(this.b.b, this.c.b) || !ewd.c(this.b.a, this.c.a)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            eug.a(this.c, bundle, true);
            euf euf2 = this.b;
            if (euf2 != null) {
                if (euf2.a != null) {
                    bundle.putString("_pn", this.b.a);
                }
                bundle.putString("_pc", this.b.b);
                bundle.putLong("_pi", this.b.c);
            }
            if (this.d.s().l(this.d.f().v()) && z) {
                long w = this.d.j().w();
                if (w > 0) {
                    this.d.o().a(bundle, w);
                }
            }
            ett e = this.d.e();
            e.c();
            e.a("auto", "_vs", e.l().a(), bundle);
        }
        eug eug3 = this.d;
        eug3.a = this.c;
        eug3.g().a(this.c);
    }
}
