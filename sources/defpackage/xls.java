package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: xls reason: default package */
public final class xls {
    public static void a(CountDownLatch countDownLatch, xip xip) {
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                xip.unsubscribe();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }
}
