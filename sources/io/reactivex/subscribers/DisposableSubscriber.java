package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    private AtomicReference<xfm> a = new AtomicReference<>();

    public final void a(xfm xfm) {
        if (EndConsumerHelper.a(this.a, xfm, getClass())) {
            ((xfm) this.a.get()).a(Long.MAX_VALUE);
        }
    }

    public final boolean b() {
        return this.a.get() == SubscriptionHelper.CANCELLED;
    }

    public final void bd_() {
        SubscriptionHelper.a(this.a);
    }
}
