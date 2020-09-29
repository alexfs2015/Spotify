package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.MissingBackpressureException;

public final class PublishSubject<T> extends xoi<T, T> {
    private PublishSubjectState<T> a;

    static final class PublishSubjectProducer<T> extends AtomicLong implements xij<T>, xik, xip {
        private static final long serialVersionUID = 6451806817170721536L;
        final xio<? super T> actual;
        final PublishSubjectState<T> parent;
        long produced;

        public PublishSubjectProducer(PublishSubjectState<T> publishSubjectState, xio<? super T> xio) {
            this.parent = publishSubjectState;
            this.actual = xio;
        }

        public final void a(long j) {
            long j2;
            if (xje.a(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, xje.a(j2, j)));
            }
        }

        public final boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public final void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.actual.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.actual.onError(th);
            }
        }

        public final void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                long j2 = this.produced;
                if (j != j2) {
                    this.produced = j2 + 1;
                    this.actual.onNext(t);
                    return;
                }
                unsubscribe();
                this.actual.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
            }
        }

        public final void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.a(this);
            }
        }
    }

    static final class PublishSubjectState<T> extends AtomicReference<PublishSubjectProducer<T>[]> implements a<T>, xij<T> {
        private static PublishSubjectProducer[] a = new PublishSubjectProducer[0];
        private static PublishSubjectProducer[] b = new PublishSubjectProducer[0];
        private static final long serialVersionUID = -7568940796666027140L;
        Throwable error;

        public PublishSubjectState() {
            lazySet(a);
        }

        /* access modifiers changed from: 0000 */
        public final void a(PublishSubjectProducer<T> publishSubjectProducer) {
            PublishSubjectProducer<T>[] publishSubjectProducerArr;
            PublishSubjectProducer[] publishSubjectProducerArr2;
            do {
                publishSubjectProducerArr = (PublishSubjectProducer[]) get();
                if (publishSubjectProducerArr != b && publishSubjectProducerArr != a) {
                    int length = publishSubjectProducerArr.length;
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (publishSubjectProducerArr[i2] == publishSubjectProducer) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            publishSubjectProducerArr2 = a;
                        } else {
                            PublishSubjectProducer[] publishSubjectProducerArr3 = new PublishSubjectProducer[(length - 1)];
                            System.arraycopy(publishSubjectProducerArr, 0, publishSubjectProducerArr3, 0, i);
                            System.arraycopy(publishSubjectProducerArr, i + 1, publishSubjectProducerArr3, i, (length - i) - 1);
                            publishSubjectProducerArr2 = publishSubjectProducerArr3;
                        }
                    } else {
                        return;
                    }
                }
            } while (!compareAndSet(publishSubjectProducerArr, publishSubjectProducerArr2));
        }

        public final /* synthetic */ void call(Object obj) {
            boolean z;
            xio xio = (xio) obj;
            PublishSubjectProducer publishSubjectProducer = new PublishSubjectProducer(this, xio);
            xio.add(publishSubjectProducer);
            xio.setProducer(publishSubjectProducer);
            while (true) {
                PublishSubjectProducer[] publishSubjectProducerArr = (PublishSubjectProducer[]) get();
                z = false;
                if (publishSubjectProducerArr != b) {
                    int length = publishSubjectProducerArr.length;
                    PublishSubjectProducer[] publishSubjectProducerArr2 = new PublishSubjectProducer[(length + 1)];
                    System.arraycopy(publishSubjectProducerArr, 0, publishSubjectProducerArr2, 0, length);
                    publishSubjectProducerArr2[length] = publishSubjectProducer;
                    if (compareAndSet(publishSubjectProducerArr, publishSubjectProducerArr2)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                Throwable th = this.error;
                if (th != null) {
                    xio.onError(th);
                    return;
                }
                xio.onCompleted();
            } else if (publishSubjectProducer.isUnsubscribed()) {
                a(publishSubjectProducer);
            }
        }

        public final void onCompleted() {
            for (PublishSubjectProducer onCompleted : (PublishSubjectProducer[]) getAndSet(b)) {
                onCompleted.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            this.error = th;
            ArrayList arrayList = null;
            for (PublishSubjectProducer onError : (PublishSubjectProducer[]) getAndSet(b)) {
                try {
                    onError.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th2);
                }
            }
            xiq.a((List<? extends Throwable>) arrayList);
        }

        public final void onNext(T t) {
            for (PublishSubjectProducer onNext : (PublishSubjectProducer[]) get()) {
                onNext.onNext(t);
            }
        }
    }

    private PublishSubject(PublishSubjectState<T> publishSubjectState) {
        super(publishSubjectState);
        this.a = publishSubjectState;
    }

    public static <T> PublishSubject<T> e() {
        return new PublishSubject<>(new PublishSubjectState());
    }

    public final void onCompleted() {
        this.a.onCompleted();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    public final void onNext(T t) {
        this.a.onNext(t);
    }
}
