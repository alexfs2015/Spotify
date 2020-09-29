package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

public abstract class BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {
    protected final ConditionalSubscriber<? super R> a;
    protected xfm b;
    protected QueueSubscription<T> c;
    protected boolean d;
    protected int e;

    public BasicFuseableConditionalSubscriber(ConditionalSubscriber<? super R> conditionalSubscriber) {
        this.a = conditionalSubscriber;
    }

    public final void a() {
        this.b.a();
    }

    public final void a(long j) {
        this.b.a(j);
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        Exceptions.b(th);
        this.b.a();
        onError(th);
    }

    public final void a(xfm xfm) {
        if (SubscriptionHelper.a(this.b, xfm)) {
            this.b = xfm;
            if (xfm instanceof QueueSubscription) {
                this.c = (QueueSubscription) xfm;
            }
            this.a.a(this);
        }
    }

    public final boolean a(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    public final int b(int i) {
        QueueSubscription<T> queueSubscription = this.c;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int a2 = queueSubscription.a(i);
        if (a2 != 0) {
            this.e = a2;
        }
        return a2;
    }

    public void c() {
        if (!this.d) {
            this.d = true;
            this.a.c();
        }
    }

    public final boolean d() {
        return this.c.d();
    }

    public final void e() {
        this.c.e();
    }

    public void onError(Throwable th) {
        if (this.d) {
            RxJavaPlugins.a(th);
            return;
        }
        this.d = true;
        this.a.onError(th);
    }
}
