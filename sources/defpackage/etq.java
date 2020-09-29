package defpackage;

import android.os.Bundle;

/* renamed from: etq reason: default package */
final class etq implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ eto b;
    private final /* synthetic */ eto c;
    private final /* synthetic */ etp d;

    etq(etp etp, boolean z, eto eto, eto eto2) {
        this.d = etp;
        this.a = z;
        this.b = eto;
        this.c = eto2;
    }

    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.d.s().l(this.d.f().v())) {
            z = this.a && this.d.a != null;
            if (z) {
                etp etp = this.d;
                etp.a(etp, etp.a, true);
            }
        } else {
            if (this.a && this.d.a != null) {
                etp etp2 = this.d;
                etp.a(etp2, etp2.a, true);
            }
            z = false;
        }
        eto eto = this.b;
        if (eto == null || eto.c != this.c.c || !evm.c(this.b.b, this.c.b) || !evm.c(this.b.a, this.c.a)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            etp.a(this.c, bundle, true);
            eto eto2 = this.b;
            if (eto2 != null) {
                if (eto2.a != null) {
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
            etc e = this.d.e();
            e.c();
            e.a("auto", "_vs", e.l().a(), bundle);
        }
        etp etp3 = this.d;
        etp3.a = this.c;
        etp3.g().a(this.c);
    }
}
