package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class FlowableElementAtSingle<T> extends Single<T> implements FuseToFlowable<T> {
    private Flowable<T> a;
    private long b;
    private T c = null;

    static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        private SingleObserver<? super T> a;
        private long b;
        private T c;
        private wrh d;
        private long e;
        private boolean f;

        ElementAtSubscriber(SingleObserver<? super T> singleObserver, long j, T t) {
            this.a = singleObserver;
            this.b = j;
            this.c = t;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.d, wrh)) {
                this.d = wrh;
                this.a.onSubscribe(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            if (!this.f) {
                long j = this.e;
                if (j == this.b) {
                    this.f = true;
                    this.d.a();
                    this.d = SubscriptionHelper.CANCELLED;
                    this.a.c_(t);
                    return;
                }
                this.e = j + 1;
            }
        }

        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.a(th);
                return;
            }
            this.f = true;
            this.d = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }

        public final void c() {
            this.d = SubscriptionHelper.CANCELLED;
            if (!this.f) {
                this.f = true;
                T t = this.c;
                if (t != null) {
                    this.a.c_(t);
                    return;
                }
                this.a.onError(new NoSuchElementException());
            }
        }

        public final void bf_() {
            this.d.a();
            this.d = SubscriptionHelper.CANCELLED;
        }

        public final boolean b() {
            return this.d == SubscriptionHelper.CANCELLED;
        }
    }

    public FlowableElementAtSingle(Flowable<T> flowable, long j, T t) {
        this.a = flowable;
        this.b = j;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.a.a((FlowableSubscriber<? super T>) new ElementAtSubscriber<Object>(singleObserver, this.b, this.c));
    }

    public final Flowable<T> be_() {
        FlowableElementAt flowableElementAt = new FlowableElementAt(this.a, this.b, this.c, true);
        return RxJavaPlugins.a((Flowable<T>) flowableElementAt);
    }
}
