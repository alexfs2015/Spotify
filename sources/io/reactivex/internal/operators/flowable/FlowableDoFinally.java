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
        wrh upstream;

        DoFinallyConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.downstream = conditionalSubscriber;
            this.onFinally = action;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                if (wrh instanceof QueueSubscription) {
                    this.qs = (QueueSubscription) wrh;
                }
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final boolean b(T t) {
            return this.downstream.b(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            b();
        }

        public final void c() {
            this.downstream.c();
            b();
        }

        public final void a() {
            this.upstream.a();
            b();
        }

        public final void a(long j) {
            this.upstream.a(j);
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

        public final void e() {
            this.qs.e();
        }

        public final boolean d() {
            return this.qs.d();
        }

        public final T bc_() {
            T bc_ = this.qs.bc_();
            if (bc_ == null && this.syncFused) {
                b();
            }
            return bc_;
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
    }

    static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final wrg<? super T> downstream;
        final Action onFinally;
        QueueSubscription<T> qs;
        boolean syncFused;
        wrh upstream;

        DoFinallySubscriber(wrg<? super T> wrg, Action action) {
            this.downstream = wrg;
            this.onFinally = action;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                if (wrh instanceof QueueSubscription) {
                    this.qs = (QueueSubscription) wrh;
                }
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            b();
        }

        public final void c() {
            this.downstream.c();
            b();
        }

        public final void a() {
            this.upstream.a();
            b();
        }

        public final void a(long j) {
            this.upstream.a(j);
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

        public final void e() {
            this.qs.e();
        }

        public final boolean d() {
            return this.qs.d();
        }

        public final T bc_() {
            T bc_ = this.qs.bc_();
            if (bc_ == null && this.syncFused) {
                b();
            }
            return bc_;
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
    }

    public FlowableDoFinally(Flowable<T> flowable, Action action) {
        super(flowable);
        this.c = action;
    }

    public final void a(wrg<? super T> wrg) {
        if (wrg instanceof ConditionalSubscriber) {
            this.b.a((FlowableSubscriber<? super T>) new DoFinallyConditionalSubscriber<Object>((ConditionalSubscriber) wrg, this.c));
        } else {
            this.b.a((FlowableSubscriber<? super T>) new DoFinallySubscriber<Object>(wrg, this.c));
        }
    }
}
