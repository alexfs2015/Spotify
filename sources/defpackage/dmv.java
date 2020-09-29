package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;

/* renamed from: dmv reason: default package */
final class dmv implements a {
    private final /* synthetic */ dms a;

    dmv(dms dms) {
        this.a = dms;
    }

    public final void a(Bundle bundle) {
        synchronized (this.a.b) {
            try {
                if (this.a.c != null) {
                    this.a.d = this.a.c.s();
                }
            } catch (DeadObjectException e) {
                clu.a("Unable to obtain a cache service instance.", e);
                dms.a(this.a);
            }
            this.a.b.notifyAll();
        }
    }

    public final void a(int i) {
        synchronized (this.a.b) {
            this.a.d = null;
            this.a.b.notifyAll();
        }
    }
}
