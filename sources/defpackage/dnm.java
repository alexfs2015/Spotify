package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;

/* renamed from: dnm reason: default package */
final class dnm implements a {
    private final /* synthetic */ dnj a;

    dnm(dnj dnj) {
        this.a = dnj;
    }

    public final void a(int i) {
        synchronized (this.a.b) {
            this.a.d = null;
            this.a.b.notifyAll();
        }
    }

    public final void a(Bundle bundle) {
        synchronized (this.a.b) {
            try {
                if (this.a.c != null) {
                    this.a.d = this.a.c.s();
                }
            } catch (DeadObjectException e) {
                cml.a("Unable to obtain a cache service instance.", e);
                dnj.a(this.a);
            }
            this.a.b.notifyAll();
        }
    }
}
