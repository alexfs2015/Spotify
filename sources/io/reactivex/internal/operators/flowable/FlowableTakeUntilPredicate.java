package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableTakeUntilPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    private Predicate<? super T> c;

    static final class InnerSubscriber<T> implements FlowableSubscriber<T>, xfm {
        private xfl<? super T> a;
        private Predicate<? super T> b;
        private xfm c;
        private boolean d;

        InnerSubscriber(xfl<? super T> xfl, Predicate<? super T> predicate) {
            this.a = xfl;
            this.b = predicate;
        }

        public final void a() {
            this.c.a();
        }

        public final void a(long j) {
            this.c.a(j);
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.c, xfm)) {
                this.c = xfm;
                this.a.a(this);
            }
        }

        public final void b_(T t) {
            if (!this.d) {
                this.a.b_(t);
                try {
                    if (this.b.test(t)) {
                        this.d = true;
                        this.c.a();
                        this.a.c();
                    }
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.c.a();
                    onError(th);
                }
            }
        }

        public final void c() {
            if (!this.d) {
                this.d = true;
                this.a.c();
            }
        }

        public final void onError(Throwable th) {
            if (!this.d) {
                this.d = true;
                this.a.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }
    }

    public FlowableTakeUntilPredicate(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.c = predicate;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new InnerSubscriber<Object>(xfl, this.c));
    }
}
