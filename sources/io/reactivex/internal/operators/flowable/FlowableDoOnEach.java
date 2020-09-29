package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {
    private Consumer<? super T> c;
    private Consumer<? super Throwable> d;
    private Action e;
    private Action f;

    static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        private Consumer<? super T> f;
        private Consumer<? super Throwable> g;
        private Action h;
        private Action i;

        DoOnEachConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f = consumer;
            this.g = consumer2;
            this.h = action;
            this.i = action2;
        }

        public final void b_(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.b_(null);
                    return;
                }
                try {
                    this.f.accept(t);
                    this.a.b_(t);
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
                this.f.accept(t);
                return this.a.b(t);
            } catch (Throwable th) {
                a(th);
                return false;
            }
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.a(th);
                return;
            }
            boolean z = true;
            this.d = true;
            try {
                this.g.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.a.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.a.onError(th);
            }
            try {
                this.i.run();
            } catch (Throwable th3) {
                Exceptions.b(th3);
                RxJavaPlugins.a(th3);
            }
        }

        public final void c() {
            if (!this.d) {
                try {
                    this.h.run();
                    this.d = true;
                    this.a.c();
                    try {
                        this.i.run();
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        RxJavaPlugins.a(th);
                    }
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        public final int a(int i2) {
            return b(i2);
        }

        public final T bc_() {
            try {
                T bc_ = this.c.bc_();
                if (bc_ != null) {
                    try {
                        this.f.accept(bc_);
                        this.i.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.e == 1) {
                    this.h.run();
                    this.i.run();
                }
                return bc_;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }
    }

    static final class DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        private Consumer<? super T> f;
        private Consumer<? super Throwable> g;
        private Action h;
        private Action i;

        DoOnEachSubscriber(wrg<? super T> wrg, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(wrg);
            this.f = consumer;
            this.g = consumer2;
            this.h = action;
            this.i = action2;
        }

        public final void b_(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.b_(null);
                    return;
                }
                try {
                    this.f.accept(t);
                    this.a.b_(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.a(th);
                return;
            }
            boolean z = true;
            this.d = true;
            try {
                this.g.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.a.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.a.onError(th);
            }
            try {
                this.i.run();
            } catch (Throwable th3) {
                Exceptions.b(th3);
                RxJavaPlugins.a(th3);
            }
        }

        public final void c() {
            if (!this.d) {
                try {
                    this.h.run();
                    this.d = true;
                    this.a.c();
                    try {
                        this.i.run();
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        RxJavaPlugins.a(th);
                    }
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        public final int a(int i2) {
            return b(i2);
        }

        public final T bc_() {
            try {
                T bc_ = this.c.bc_();
                if (bc_ != null) {
                    try {
                        this.f.accept(bc_);
                        this.i.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.e == 1) {
                    this.h.run();
                    this.i.run();
                }
                return bc_;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }
    }

    public FlowableDoOnEach(Flowable<T> flowable, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(flowable);
        this.c = consumer;
        this.d = consumer2;
        this.e = action;
        this.f = action2;
    }

    public final void a(wrg<? super T> wrg) {
        if (wrg instanceof ConditionalSubscriber) {
            Flowable flowable = this.b;
            DoOnEachConditionalSubscriber doOnEachConditionalSubscriber = new DoOnEachConditionalSubscriber((ConditionalSubscriber) wrg, this.c, this.d, this.e, this.f);
            flowable.a((FlowableSubscriber<? super T>) doOnEachConditionalSubscriber);
            return;
        }
        Flowable flowable2 = this.b;
        DoOnEachSubscriber doOnEachSubscriber = new DoOnEachSubscriber(wrg, this.c, this.d, this.e, this.f);
        flowable2.a((FlowableSubscriber<? super T>) doOnEachSubscriber);
    }
}
