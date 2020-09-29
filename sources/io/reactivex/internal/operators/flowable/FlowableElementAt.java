package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class FlowableElementAt<T> extends AbstractFlowableWithUpstream<T, T> {
    private long c;
    private T d;
    private boolean e = true;

    static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;
        xfm upstream;

        ElementAtSubscriber(xfl<? super T> xfl, long j, T t, boolean z) {
            super(xfl);
            this.index = j;
            this.defaultValue = t;
            this.errorOnFewer = z;
        }

        public final void a() {
            super.a();
            this.upstream.a();
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                this.downstream.a(this);
                xfm.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            if (!this.done) {
                long j = this.count;
                if (j == this.index) {
                    this.done = true;
                    this.upstream.a();
                    b(t);
                    return;
                }
                this.count = j + 1;
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                T t = this.defaultValue;
                if (t != null) {
                    b(t);
                } else if (this.errorOnFewer) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.c();
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }
    }

    public FlowableElementAt(Flowable<T> flowable, long j, T t, boolean z) {
        super(flowable);
        this.c = j;
        this.d = t;
    }

    public final void a(xfl<? super T> xfl) {
        Flowable flowable = this.b;
        ElementAtSubscriber elementAtSubscriber = new ElementAtSubscriber(xfl, this.c, this.d, this.e);
        flowable.a((FlowableSubscriber<? super T>) elementAtSubscriber);
    }
}
