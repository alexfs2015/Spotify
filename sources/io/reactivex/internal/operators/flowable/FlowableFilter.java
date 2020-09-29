package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;

public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {
    private Predicate<? super T> c;

    static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        private Predicate<? super T> f;

        FilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(conditionalSubscriber);
            this.f = predicate;
        }

        public final void b_(T t) {
            if (!b(t)) {
                this.b.a(1);
            }
        }

        public final boolean b(T t) {
            if (this.d) {
                return false;
            }
            if (this.e != 0) {
                return this.a.b(null);
            }
            try {
                if (!this.f.test(t) || !this.a.b(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        public final int a(int i) {
            return b(i);
        }

        public final T bc_() {
            QueueSubscription queueSubscription = this.c;
            Predicate<? super T> predicate = this.f;
            while (true) {
                T bc_ = queueSubscription.bc_();
                if (bc_ == null) {
                    return null;
                }
                if (predicate.test(bc_)) {
                    return bc_;
                }
                if (this.e == 2) {
                    queueSubscription.a(1);
                }
            }
        }
    }

    static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        private Predicate<? super T> f;

        FilterSubscriber(wrg<? super T> wrg, Predicate<? super T> predicate) {
            super(wrg);
            this.f = predicate;
        }

        public final void b_(T t) {
            if (!b(t)) {
                this.b.a(1);
            }
        }

        public final boolean b(T t) {
            if (this.d) {
                return false;
            }
            if (this.e != 0) {
                this.a.b_(null);
                return true;
            }
            try {
                boolean test = this.f.test(t);
                if (test) {
                    this.a.b_(t);
                }
                return test;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        public final int a(int i) {
            return b(i);
        }

        public final T bc_() {
            QueueSubscription queueSubscription = this.c;
            Predicate<? super T> predicate = this.f;
            while (true) {
                T bc_ = queueSubscription.bc_();
                if (bc_ == null) {
                    return null;
                }
                if (predicate.test(bc_)) {
                    return bc_;
                }
                if (this.e == 2) {
                    queueSubscription.a(1);
                }
            }
        }
    }

    public FlowableFilter(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.c = predicate;
    }

    public final void a(wrg<? super T> wrg) {
        if (wrg instanceof ConditionalSubscriber) {
            this.b.a((FlowableSubscriber<? super T>) new FilterConditionalSubscriber<Object>((ConditionalSubscriber) wrg, this.c));
        } else {
            this.b.a((FlowableSubscriber<? super T>) new FilterSubscriber<Object>(wrg, this.c));
        }
    }
}
