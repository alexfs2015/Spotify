package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: bmv reason: default package */
public final class bmv extends mf<Void> implements btq {
    private Semaphore i = new Semaphore(0);
    private Set<bsy> j;

    public bmv(Context context, Set<bsy> set) {
        super(context);
        this.j = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final Void d() {
        int i2 = 0;
        for (bsy a : this.j) {
            if (a.a((btq) this)) {
                i2++;
            }
        }
        try {
            this.i.tryAcquire(i2, 5, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        return null;
    }

    public final void f() {
        this.i.drainPermits();
        h();
    }

    public final void j() {
        this.i.release();
    }
}
