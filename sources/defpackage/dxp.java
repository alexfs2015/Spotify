package defpackage;

import android.os.Bundle;

/* renamed from: dxp reason: default package */
final class dxp implements a {
    final /* synthetic */ dxn a;
    private final /* synthetic */ cqc b;
    private final /* synthetic */ dxh c;

    dxp(dxn dxn, cqc cqc, dxh dxh) {
        this.a = dxn;
        this.b = cqc;
        this.c = dxh;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        synchronized (this.a.c) {
            if (!this.a.b) {
                this.a.b = true;
                dxg dxg = this.a.a;
                if (dxg != null) {
                    this.b.a(new dxr(this.b, cmb.a((Runnable) new dxq(this, dxg, this.b, this.c))), cpx.b);
                }
            }
        }
    }
}
