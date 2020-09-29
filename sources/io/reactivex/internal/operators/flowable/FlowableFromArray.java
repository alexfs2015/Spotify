package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableFromArray<T> extends Flowable<T> {
    private T[] b;

    static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super T> downstream;

        ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.downstream = conditionalSubscriber;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            Object[] objArr = this.array;
            int length = objArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            int i = this.index;
            while (i != length) {
                if (!this.cancelled) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        StringBuilder sb = new StringBuilder("The element at index ");
                        sb.append(i);
                        sb.append(" is null");
                        conditionalSubscriber.onError(new NullPointerException(sb.toString()));
                        return;
                    }
                    conditionalSubscriber.b(obj);
                    i++;
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                conditionalSubscriber.c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            Object[] objArr = this.array;
            int length = objArr.length;
            int i = this.index;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i == length) {
                        if (i == length) {
                            if (!this.cancelled) {
                                conditionalSubscriber.c();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.index = i;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            StringBuilder sb = new StringBuilder("The element at index ");
                            sb.append(i);
                            sb.append(" is null");
                            conditionalSubscriber.onError(new NullPointerException(sb.toString()));
                            return;
                        }
                        if (conditionalSubscriber.b(obj)) {
                            j3++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final xfl<? super T> downstream;

        ArraySubscription(xfl<? super T> xfl, T[] tArr) {
            super(tArr);
            this.downstream = xfl;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            Object[] objArr = this.array;
            int length = objArr.length;
            xfl<? super T> xfl = this.downstream;
            int i = this.index;
            while (i != length) {
                if (!this.cancelled) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        StringBuilder sb = new StringBuilder("The element at index ");
                        sb.append(i);
                        sb.append(" is null");
                        xfl.onError(new NullPointerException(sb.toString()));
                        return;
                    }
                    xfl.b_(obj);
                    i++;
                } else {
                    return;
                }
            }
            if (!this.cancelled) {
                xfl.c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            Object[] objArr = this.array;
            int length = objArr.length;
            int i = this.index;
            xfl<? super T> xfl = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i == length) {
                        if (i == length) {
                            if (!this.cancelled) {
                                xfl.c();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.index = i;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            StringBuilder sb = new StringBuilder("The element at index ");
                            sb.append(i);
                            sb.append(" is null");
                            xfl.onError(new NullPointerException(sb.toString()));
                            return;
                        }
                        xfl.b_(obj);
                        j3++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        BaseArraySubscription(T[] tArr) {
            this.array = tArr;
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
            int i = this.index;
            T[] tArr = this.array;
            if (i == tArr.length) {
                return null;
            }
            this.index = i + 1;
            return ObjectHelper.a(tArr[i], "array element is null");
        }

        public final boolean d() {
            return this.index == this.array.length;
        }

        public final void e() {
            this.index = this.array.length;
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.b = tArr;
    }

    public final void a(xfl<? super T> xfl) {
        if (xfl instanceof ConditionalSubscriber) {
            xfl.a(new ArrayConditionalSubscription((ConditionalSubscriber) xfl, this.b));
        } else {
            xfl.a(new ArraySubscription(xfl, this.b));
        }
    }
}
