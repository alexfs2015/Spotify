package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableFromIterable<T> extends Flowable<T> {
    private Iterable<? extends T> b;

    static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> it;
        boolean once;

        BaseRangeSubscription(Iterator<? extends T> it2) {
            this.it = it2;
        }

        public final int a(int i) {
            return i & 1;
        }

        public final void a() {
            this.cancelled = true;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j) && BackpressureHelper.a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    b();
                    return;
                }
                b(j);
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract void b();

        /* access modifiers changed from: 0000 */
        public abstract void b(long j);

        public final T ba_() {
            Iterator<? extends T> it2 = this.it;
            if (it2 == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it2.hasNext()) {
                return null;
            }
            return ObjectHelper.a(this.it.next(), "Iterator.next() returned a null value");
        }

        public final boolean d() {
            Iterator<? extends T> it2 = this.it;
            return it2 == null || !it2.hasNext();
        }

        public final void e() {
            this.it = null;
        }
    }

    static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final ConditionalSubscriber<? super T> downstream;

        IteratorConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it) {
            super(it);
            this.downstream = conditionalSubscriber;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            Iterator it = this.it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    Object next = it.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        conditionalSubscriber.b(next);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        conditionalSubscriber.c();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            Iterator it = this.it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object next = it.next();
                            if (!this.cancelled) {
                                if (next == null) {
                                    conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean b = conditionalSubscriber.b(next);
                                if (!this.cancelled) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.cancelled) {
                                                conditionalSubscriber.c();
                                            }
                                            return;
                                        } else if (b) {
                                            j3++;
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.b(th);
                                        conditionalSubscriber.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            conditionalSubscriber.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final xfl<? super T> downstream;

        IteratorSubscription(xfl<? super T> xfl, Iterator<? extends T> it) {
            super(it);
            this.downstream = xfl;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            Iterator it = this.it;
            xfl<? super T> xfl = this.downstream;
            while (!this.cancelled) {
                try {
                    Object next = it.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            xfl.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        xfl.b_(next);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        xfl.c();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                xfl.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    xfl.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            Iterator it = this.it;
            xfl<? super T> xfl = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object next = it.next();
                            if (!this.cancelled) {
                                if (next == null) {
                                    xfl.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                xfl.b_(next);
                                if (!this.cancelled) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.cancelled) {
                                                xfl.c();
                                            }
                                            return;
                                        }
                                        j3++;
                                    } catch (Throwable th) {
                                        Exceptions.b(th);
                                        xfl.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            xfl.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.b = iterable;
    }

    public static <T> void a(xfl<? super T> xfl, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.a(xfl);
            } else if (xfl instanceof ConditionalSubscriber) {
                xfl.a(new IteratorConditionalSubscription((ConditionalSubscriber) xfl, it));
            } else {
                xfl.a(new IteratorSubscription(xfl, it));
            }
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, xfl);
        }
    }

    public final void a(xfl<? super T> xfl) {
        try {
            a(xfl, this.b.iterator());
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, xfl);
        }
    }
}
