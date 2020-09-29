package defpackage;

import android.os.Bundle;

/* renamed from: dyg reason: default package */
final class dyg implements a {
    final /* synthetic */ dye a;
    private final /* synthetic */ cqt b;
    private final /* synthetic */ dxy c;

    dyg(dye dye, cqt cqt, dxy dxy) {
        this.a = dye;
        this.b = cqt;
        this.c = dxy;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        synchronized (this.a.c) {
            if (!this.a.b) {
                this.a.b = true;
                dxx dxx = this.a.a;
                if (dxx != null) {
                    this.b.a(new dyi(this.b, cms.a((Runnable) new dyh(this, dxx, this.b, this.c))), cqo.b);
                }
            }
        }
    }
}
