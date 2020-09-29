package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vnd reason: default package */
public final class vnd<E> implements kjm<E> {
    private final BlockingQueue<E> a = new LinkedBlockingQueue();

    public final kkf subscribe(kkn<E> kkn) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Thread thread = new Thread(new $$Lambda$vnd$JepWpGgHwaznNkNxqmb139VgjWk(this, atomicBoolean, kkn));
        thread.start();
        return new $$Lambda$vnd$aB_S1DXkkdUxycTdA0TZgRwrBuQ(atomicBoolean, thread);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AtomicBoolean atomicBoolean, kkn kkn) {
        while (atomicBoolean.get()) {
            try {
                Object take = this.a.take();
                if (atomicBoolean.get()) {
                    kkn.accept(take);
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, Thread thread) {
        atomicBoolean.set(false);
        thread.interrupt();
    }

    public final synchronized void a(E e) {
        if (!this.a.offer(e)) {
            Logger.e("Failed to add the event to the queue", new Object[0]);
        }
    }
}
