package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class FlowableConcatArray<T> extends Flowable<T> {
    private wrf<? extends T>[] b;
    private boolean c = false;

    static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final wrg<? super T> downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final wrf<? extends T>[] sources;
        final AtomicInteger wip = new AtomicInteger();

        ConcatArraySubscriber(wrf<? extends T>[] wrfArr, boolean z, wrg<? super T> wrg) {
            super(false);
            this.downstream = wrg;
            this.sources = wrfArr;
            this.delayError = z;
        }

        public final void a(wrh wrh) {
            b(wrh);
        }

        public final void b_(T t) {
            this.produced++;
            this.downstream.b_(t);
        }

        public final void onError(Throwable th) {
            if (this.delayError) {
                List list = this.errors;
                if (list == null) {
                    list = new ArrayList((this.sources.length - this.index) + 1);
                    this.errors = list;
                }
                list.add(th);
                c();
                return;
            }
            this.downstream.onError(th);
        }

        public final void c() {
            if (this.wip.getAndIncrement() == 0) {
                wrf<? extends T>[] wrfArr = this.sources;
                int length = wrfArr.length;
                int i = this.index;
                while (i != length) {
                    wrf<? extends T> wrf = wrfArr[i];
                    if (wrf == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            List list = this.errors;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.errors = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j = this.produced;
                        if (j != 0) {
                            this.produced = 0;
                            d(j);
                        }
                        wrf.b(this);
                        i++;
                        this.index = i;
                        if (this.wip.decrementAndGet() != 0) {
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 == null) {
                    this.downstream.c();
                } else if (list2.size() == 1) {
                    this.downstream.onError((Throwable) list2.get(0));
                } else {
                    this.downstream.onError(new CompositeException((Iterable<? extends Throwable>) list2));
                }
            }
        }
    }

    public FlowableConcatArray(wrf<? extends T>[] wrfArr, boolean z) {
        this.b = wrfArr;
    }

    public final void a(wrg<? super T> wrg) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.b, this.c, wrg);
        wrg.a(concatArraySubscriber);
        concatArraySubscriber.c();
    }
}
