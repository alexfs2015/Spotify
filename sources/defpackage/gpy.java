package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gpy reason: default package */
public final class gpy<E> implements kmv<E> {
    private final BlockingQueue<E> a = new LinkedBlockingQueue();

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, Thread thread) {
        atomicBoolean.set(false);
        thread.interrupt();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AtomicBoolean atomicBoolean, knw knw) {
        while (atomicBoolean.get()) {
            try {
                Object take = this.a.take();
                if (atomicBoolean.get()) {
                    knw.accept(take);
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public final synchronized void a(E e) {
        if (!this.a.offer(e)) {
            Logger.e("Failed to add the event to the queue", new Object[0]);
        }
    }

    public final kno subscribe(knw<E> knw) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Thread thread = new Thread(new $$Lambda$gpy$M6r3kkZTuz6Da1HFRl9I_2QtwZE(this, atomicBoolean, knw));
        thread.start();
        return new $$Lambda$gpy$MVBHzilvRdQQrt15tQd36nzT0ik(atomicBoolean, thread);
    }
}
