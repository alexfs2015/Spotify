package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;

public final class OperatorZip<R> implements b<R, wud<?>[]> {
    private wux<? extends R> a;

    static final class Zip<R> extends AtomicLong {
        private static int a = 0;
        private static final long serialVersionUID = 5995274816189928317L;
        final wue<? super R> child;
        final xag childSubscription = new xag();
        int emitted;
        AtomicLong requested;
        volatile Object[] subscribers;
        private final wux<? extends R> zipFunction;

        final class a extends wuj {
            final wxs a = wxs.b();

            a() {
            }

            public final void onStart() {
                request((long) wxs.b);
            }

            public final void a(long j) {
                request(j);
            }

            public final void onCompleted() {
                wxs wxs = this.a;
                if (wxs.a == null) {
                    wxs.a = NotificationLite.a();
                }
                Zip.this.a();
            }

            public final void onError(Throwable th) {
                Zip.this.child.onError(th);
            }

            public final void onNext(Object obj) {
                try {
                    this.a.a(obj);
                } catch (MissingBackpressureException e) {
                    onError(e);
                }
                Zip.this.a();
            }
        }

        static {
            double d = (double) wxs.b;
            Double.isNaN(d);
            a = (int) (d * 0.7d);
        }

        public Zip(wuj<? super R> wuj, wux<? extends R> wux) {
            this.child = wuj;
            this.zipFunction = wux;
            wuj.add(this.childSubscription);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            Object[] objArr = this.subscribers;
            if (objArr != null && getAndIncrement() == 0) {
                int length = objArr.length;
                wue<? super R> wue = this.child;
                AtomicLong atomicLong = this.requested;
                while (true) {
                    Object[] objArr2 = new Object[length];
                    boolean z = true;
                    for (int i = 0; i < length; i++) {
                        Object e = ((a) objArr[i]).a.e();
                        if (e == null) {
                            z = false;
                        } else if (wxs.b(e)) {
                            wue.onCompleted();
                            this.childSubscription.unsubscribe();
                            return;
                        } else {
                            objArr2[i] = wxs.c(e);
                        }
                    }
                    if (z && atomicLong.get() > 0) {
                        try {
                            wue.onNext(this.zipFunction.a(objArr2));
                            atomicLong.decrementAndGet();
                            this.emitted++;
                            for (Object obj : objArr) {
                                wxs wxs = ((a) obj).a;
                                wxs.d();
                                if (wxs.b(wxs.e())) {
                                    wue.onCompleted();
                                    this.childSubscription.unsubscribe();
                                    return;
                                }
                            }
                            if (this.emitted > a) {
                                for (Object obj2 : objArr) {
                                    ((a) obj2).a((long) this.emitted);
                                }
                                this.emitted = 0;
                            }
                        } catch (Throwable th) {
                            wul.a(th, wue, objArr2);
                            return;
                        }
                    } else if (decrementAndGet() <= 0) {
                        break;
                    }
                }
            }
        }
    }

    static final class ZipProducer<R> extends AtomicLong implements wuf {
        private static final long serialVersionUID = -1216676403723546796L;
        final Zip<R> zipper;

        public ZipProducer(Zip<R> zip) {
            this.zipper = zip;
        }

        public final void a(long j) {
            wuz.a((AtomicLong) this, j);
            this.zipper.a();
        }
    }

    final class a extends wuj<wud[]> {
        private wuj<? super R> a;
        private Zip<R> b;
        private ZipProducer<R> c;
        private boolean d;

        public final /* synthetic */ void onNext(Object obj) {
            wud[] wudArr = (wud[]) obj;
            if (wudArr == null || wudArr.length == 0) {
                this.a.onCompleted();
                return;
            }
            this.d = true;
            Zip<R> zip = this.b;
            ZipProducer<R> zipProducer = this.c;
            Object[] objArr = new Object[wudArr.length];
            for (int i = 0; i < wudArr.length; i++) {
                a aVar = new a();
                objArr[i] = aVar;
                zip.childSubscription.a((wuk) aVar);
            }
            zip.requested = zipProducer;
            zip.subscribers = objArr;
            for (int i2 = 0; i2 < wudArr.length; i2++) {
                wudArr[i2].a((wuj<? super T>) (a) objArr[i2]);
            }
        }

        public a(wuj<? super R> wuj, Zip<R> zip, ZipProducer<R> zipProducer) {
            this.a = wuj;
            this.b = zip;
            this.c = zipProducer;
        }

        public final void onCompleted() {
            if (!this.d) {
                this.a.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        Zip zip = new Zip(wuj, this.a);
        ZipProducer zipProducer = new ZipProducer(zip);
        a aVar = new a(wuj, zip, zipProducer);
        wuj.add(aVar);
        wuj.setProducer(zipProducer);
        return aVar;
    }

    public OperatorZip(wuu wuu) {
        this.a = wuy.a(wuu);
    }
}
