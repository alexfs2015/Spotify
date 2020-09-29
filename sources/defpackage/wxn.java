package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: wxn reason: default package */
public final class wxn {
    public static void a(CountDownLatch countDownLatch, wuk wuk) {
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                wuk.unsubscribe();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }
}
