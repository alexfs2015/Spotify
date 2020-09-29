package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: waj reason: default package */
public final class waj<E> implements kmv<E> {
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
        Thread thread = new Thread(new $$Lambda$waj$EZK4G4JZ2JbS9EIwtGG7mVtwCFo(this, atomicBoolean, knw));
        thread.start();
        return new $$Lambda$waj$SePEyYyO64fGCBKmE6w2Kxh30E(atomicBoolean, thread);
    }
}
