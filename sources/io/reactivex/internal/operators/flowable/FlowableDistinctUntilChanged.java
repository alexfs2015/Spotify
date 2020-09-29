package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;

public final class FlowableDistinctUntilChanged<T, K> extends AbstractFlowableWithUpstream<T, T> {
    private Function<? super T, K> c;
    private BiPredicate<? super K, ? super K> d;

    static final class DistinctUntilChangedConditionalSubscriber<T, K> extends BasicFuseableConditionalSubscriber<T, T> {
        private Function<? super T, K> f;
        private BiPredicate<? super K, ? super K> g;
        private K h;
        private boolean i;

        DistinctUntilChangedConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.f = function;
            this.g = biPredicate;
        }

        public final int a(int i2) {
            return b(i2);
        }

        public final boolean b(T t) {
            if (this.d) {
                return false;
            }
            if (this.e != 0) {
                return this.a.b(t);
            }
            try {
                K apply = this.f.apply(t);
                if (this.i) {
                    boolean test = this.g.test(this.h, apply);
                    this.h = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.i = true;
                    this.h = apply;
                }
                this.a.b_(t);
                return true;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        public final void b_(T t) {
            if (!b(t)) {
                this.b.a(1);
            }
        }

        public final T ba_() {
            while (true) {
                T ba_ = this.c.ba_();
                if (ba_ == null) {
                    return null;
                }
                K apply = this.f.apply(ba_);
                if (!this.i) {
                    this.i = true;
                    this.h = apply;
                    return ba_;
                } else if (!this.g.test(this.h, apply)) {
                    this.h = apply;
                    return ba_;
                } else {
                    this.h = apply;
                    if (this.e != 1) {
                        this.b.a(1);
                    }
                }
            }
        }
    }

    static final class DistinctUntilChangedSubscriber<T, K> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        private Function<? super T, K> f;
        private BiPredicate<? super K, ? super K> g;
        private K h;
        private boolean i;

        DistinctUntilChangedSubscriber(xfl<? super T> xfl, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(xfl);
            this.f = function;
            this.g = biPredicate;
        }

        public final int a(int i2) {
            return b(i2);
        }

        public final boolean b(T t) {
            if (this.d) {
                return false;
            }
            if (this.e != 0) {
                this.a.b_(t);
                return true;
            }
            try {
                K apply = this.f.apply(t);
                if (this.i) {
                    boolean test = this.g.test(this.h, apply);
                    this.h = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.i = true;
                    this.h = apply;
                }
                this.a.b_(t);
                return true;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        public final void b_(T t) {
            if (!b(t)) {
                this.b.a(1);
            }
        }

        public final T ba_() {
            while (true) {
                T ba_ = this.c.ba_();
                if (ba_ == null) {
                    return null;
                }
                K apply = this.f.apply(ba_);
                if (!this.i) {
                    this.i = true;
                    this.h = apply;
                    return ba_;
                } else if (!this.g.test(this.h, apply)) {
                    this.h = apply;
                    return ba_;
                } else {
                    this.h = apply;
                    if (this.e != 1) {
                        this.b.a(1);
                    }
                }
            }
        }
    }

    public FlowableDistinctUntilChanged(Flowable<T> flowable, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(flowable);
        this.c = function;
        this.d = biPredicate;
    }

    public final void a(xfl<? super T> xfl) {
        if (xfl instanceof ConditionalSubscriber) {
            this.b.a((FlowableSubscriber<? super T>) new DistinctUntilChangedConditionalSubscriber<Object>((ConditionalSubscriber) xfl, this.c, this.d));
            return;
        }
        this.b.a((FlowableSubscriber<? super T>) new DistinctUntilChangedSubscriber<Object>(xfl, this.c, this.d));
    }
}
