package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {
    private Action c;

    static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final ConditionalSubscriber<? super T> downstream;
        final Action onFinally;
        QueueSubscription<T> qs;
        boolean syncFused;
        xfm upstream;

        DoFinallyConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.downstream = conditionalSubscriber;
            this.onFinally = action;
        }

        private void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.a(th);
                }
            }
        }

        public final int a(int i) {
            QueueSubscription<T> queueSubscription = this.qs;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int a = queueSubscription.a(i);
            if (a != 0) {
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.syncFused = z;
            }
            return a;
        }

        public final void a() {
            this.upstream.a();
            b();
        }

        public final void a(long j) {
            this.upstream.a(j);
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                if (xfm instanceof QueueSubscription) {
                    this.qs = (QueueSubscription) xfm;
                }
                this.downstream.a(this);
            }
        }

        public final boolean b(T t) {
            return this.downstream.b(t);
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final T ba_() {
            T ba_ = this.qs.ba_();
            if (ba_ == null && this.syncFused) {
                b();
            }
            return ba_;
        }

        public final void c() {
            this.downstream.c();
            b();
        }

        public final boolean d() {
            return this.qs.d();
        }

        public final void e() {
            this.qs.e();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            b();
        }
    }

    static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final xfl<? super T> downstream;
        final Action onFinally;
        QueueSubscription<T> qs;
        boolean syncFused;
        xfm upstream;

        DoFinallySubscriber(xfl<? super T> xfl, Action action) {
            this.downstream = xfl;
            this.onFinally = action;
        }

        private void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.a(th);
                }
            }
        }

        public final int a(int i) {
            QueueSubscription<T> queueSubscription = this.qs;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int a = queueSubscription.a(i);
            if (a != 0) {
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.syncFused = z;
            }
            return a;
        }

        public final void a() {
            this.upstream.a();
            b();
        }

        public final void a(long j) {
            this.upstream.a(j);
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                if (xfm instanceof QueueSubscription) {
                    this.qs = (QueueSubscription) xfm;
                }
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final T ba_() {
            T ba_ = this.qs.ba_();
            if (ba_ == null && this.syncFused) {
                b();
            }
            return ba_;
        }

        public final void c() {
            this.downstream.c();
            b();
        }

        public final boolean d() {
            return this.qs.d();
        }

        public final void e() {
            this.qs.e();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            b();
        }
    }

    public FlowableDoFinally(Flowable<T> flowable, Action action) {
        super(flowable);
        this.c = action;
    }

    public final void a(xfl<? super T> xfl) {
        if (xfl instanceof ConditionalSubscriber) {
            this.b.a((FlowableSubscriber<? super T>) new DoFinallyConditionalSubscriber<Object>((ConditionalSubscriber) xfl, this.c));
        } else {
            this.b.a((FlowableSubscriber<? super T>) new DoFinallySubscriber<Object>(xfl, this.c));
        }
    }
}
