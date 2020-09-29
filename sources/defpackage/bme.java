package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: bme reason: default package */
public final class bme extends ma<Void> implements bsz {
    private Semaphore i = new Semaphore(0);
    private Set<bsh> j;

    public bme(Context context, Set<bsh> set) {
        super(context);
        this.j = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final Void d() {
        int i2 = 0;
        for (bsh a : this.j) {
            if (a.a((bsz) this)) {
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
