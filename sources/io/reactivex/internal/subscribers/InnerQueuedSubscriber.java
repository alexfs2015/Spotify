package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class InnerQueuedSubscriber<T> extends AtomicReference<xfm> implements FlowableSubscriber<T>, xfm {
    private static final long serialVersionUID = 22876611072430776L;
    public volatile boolean done;
    int fusionMode;
    final int limit;
    final InnerQueuedSubscriberSupport<T> parent;
    final int prefetch;
    long produced;
    public volatile SimpleQueue<T> queue;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public final void a() {
        SubscriptionHelper.a((AtomicReference<xfm>) this);
    }

    public final void a(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= ((long) this.limit)) {
                this.produced = 0;
                ((xfm) get()).a(j2);
                return;
            }
            this.produced = j2;
        }
    }

    public final void a(xfm xfm) {
        if (SubscriptionHelper.a((AtomicReference<xfm>) this, xfm)) {
            if (xfm instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) xfm;
                int a = queueSubscription.a(3);
                if (a == 1) {
                    this.fusionMode = a;
                    this.queue = queueSubscription;
                    this.done = true;
                    this.parent.a(this);
                    return;
                } else if (a == 2) {
                    this.fusionMode = a;
                    this.queue = queueSubscription;
                    QueueDrainHelper.a(xfm, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.a(this.prefetch);
            QueueDrainHelper.a(xfm, this.prefetch);
        }
    }

    public final void b() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j == ((long) this.limit)) {
                this.produced = 0;
                ((xfm) get()).a(j);
                return;
            }
            this.produced = j;
        }
    }

    public final void b_(T t) {
        if (this.fusionMode == 0) {
            this.parent.a(this, t);
        } else {
            this.parent.b();
        }
    }

    public final void c() {
        this.parent.a(this);
    }

    public final void onError(Throwable th) {
        this.parent.a(this, th);
    }
}
