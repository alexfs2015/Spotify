package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {
    protected final wrg<? super R> a;
    protected wrh b;
    protected QueueSubscription<T> c;
    protected boolean d;
    protected int e;

    public BasicFuseableSubscriber(wrg<? super R> wrg) {
        this.a = wrg;
    }

    public final void a(wrh wrh) {
        if (SubscriptionHelper.a(this.b, wrh)) {
            this.b = wrh;
            if (wrh instanceof QueueSubscription) {
                this.c = (QueueSubscription) wrh;
            }
            this.a.a(this);
        }
    }

    public void onError(Throwable th) {
        if (this.d) {
            RxJavaPlugins.a(th);
            return;
        }
        this.d = true;
        this.a.onError(th);
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        Exceptions.b(th);
        this.b.a();
        onError(th);
    }

    public void c() {
        if (!this.d) {
            this.d = true;
            this.a.c();
        }
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

    public final void a(long j) {
        this.b.a(j);
    }

    public final void a() {
        this.b.a();
    }

    public final boolean d() {
        return this.c.d();
    }

    public void e() {
        this.c.e();
    }

    public final boolean a(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
