package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;

public final class FlowableMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    private Function<? super T, ? extends U> c;

    static final class MapConditionalSubscriber<T, U> extends BasicFuseableConditionalSubscriber<T, U> {
        private Function<? super T, ? extends U> f;

        MapConditionalSubscriber(ConditionalSubscriber<? super U> conditionalSubscriber, Function<? super T, ? extends U> function) {
            super(conditionalSubscriber);
            this.f = function;
        }

        public final void b_(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.b_(null);
                    return;
                }
                try {
                    this.a.b_(ObjectHelper.a(this.f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        public final boolean b(T t) {
            if (this.d) {
                return false;
            }
            try {
                return this.a.b(ObjectHelper.a(this.f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        public final int a(int i) {
            return b(i);
        }

        public final U bc_() {
            Object bc_ = this.c.bc_();
            if (bc_ != null) {
                return ObjectHelper.a(this.f.apply(bc_), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    static final class MapSubscriber<T, U> extends BasicFuseableSubscriber<T, U> {
        private Function<? super T, ? extends U> f;

        MapSubscriber(wrg<? super U> wrg, Function<? super T, ? extends U> function) {
            super(wrg);
            this.f = function;
        }

        public final void b_(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.b_(null);
                    return;
                }
                try {
                    this.a.b_(ObjectHelper.a(this.f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        public final int a(int i) {
            return b(i);
        }

        public final U bc_() {
            Object bc_ = this.c.bc_();
            if (bc_ != null) {
                return ObjectHelper.a(this.f.apply(bc_), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public FlowableMap(Flowable<T> flowable, Function<? super T, ? extends U> function) {
        super(flowable);
        this.c = function;
    }

    public final void a(wrg<? super U> wrg) {
        if (wrg instanceof ConditionalSubscriber) {
            this.b.a((FlowableSubscriber<? super T>) new MapConditionalSubscriber<Object>((ConditionalSubscriber) wrg, this.c));
        } else {
            this.b.a((FlowableSubscriber<? super T>) new MapSubscriber<Object>(wrg, this.c));
        }
    }
}
