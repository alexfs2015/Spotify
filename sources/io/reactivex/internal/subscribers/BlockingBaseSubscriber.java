package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    T a;
    Throwable b;
    xfm c;
    private volatile boolean d;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                BlockingHelper.a();
                await();
            } catch (InterruptedException e) {
                xfm xfm = this.c;
                this.c = SubscriptionHelper.CANCELLED;
                if (xfm != null) {
                    xfm.a();
                }
                throw ExceptionHelper.a((Throwable) e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw ExceptionHelper.a(th);
    }

    public final void a(xfm xfm) {
        if (SubscriptionHelper.a(this.c, xfm)) {
            this.c = xfm;
            boolean z = this.d;
            xfm.a(Long.MAX_VALUE);
            boolean z2 = this.d;
        }
    }

    public final void c() {
        countDown();
    }
}
