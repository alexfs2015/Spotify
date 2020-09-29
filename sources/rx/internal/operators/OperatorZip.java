package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;

public final class OperatorZip<R> implements b<R, xii<?>[]> {
    private xjc<? extends R> a;

    static final class Zip<R> extends AtomicLong {
        private static int a = 0;
        private static final long serialVersionUID = 5995274816189928317L;
        final xij<? super R> child;
        final xok childSubscription = new xok();
        int emitted;
        AtomicLong requested;
        volatile Object[] subscribers;
        private final xjc<? extends R> zipFunction;

        final class a extends xio {
            final xlx a = xlx.b();

            a() {
            }

            public final void a(long j) {
                request(j);
            }

            public final void onCompleted() {
                xlx xlx = this.a;
                if (xlx.a == null) {
                    xlx.a = NotificationLite.a();
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

            public final void onStart() {
                request((long) xlx.b);
            }
        }

        static {
            double d = (double) xlx.b;
            Double.isNaN(d);
            a = (int) (d * 0.7d);
        }

        public Zip(xio<? super R> xio, xjc<? extends R> xjc) {
            this.child = xio;
            this.zipFunction = xjc;
            xio.add(this.childSubscription);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            Object[] objArr = this.subscribers;
            if (objArr != null && getAndIncrement() == 0) {
                int length = objArr.length;
                xij<? super R> xij = this.child;
                AtomicLong atomicLong = this.requested;
                while (true) {
                    Object[] objArr2 = new Object[length];
                    boolean z = true;
                    for (int i = 0; i < length; i++) {
                        Object e = ((a) objArr[i]).a.e();
                        if (e == null) {
                            z = false;
                        } else if (xlx.b(e)) {
                            xij.onCompleted();
                            this.childSubscription.unsubscribe();
                            return;
                        } else {
                            objArr2[i] = xlx.c(e);
                        }
                    }
                    if (z && atomicLong.get() > 0) {
                        try {
                            xij.onNext(this.zipFunction.a(objArr2));
                            atomicLong.decrementAndGet();
                            this.emitted++;
                            for (Object obj : objArr) {
                                xlx xlx = ((a) obj).a;
                                xlx.d();
                                if (xlx.b(xlx.e())) {
                                    xij.onCompleted();
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
                            xiq.a(th, xij, objArr2);
                            return;
                        }
                    } else if (decrementAndGet() <= 0) {
                        break;
                    }
                }
            }
        }
    }

    static final class ZipProducer<R> extends AtomicLong implements xik {
        private static final long serialVersionUID = -1216676403723546796L;
        final Zip<R> zipper;

        public ZipProducer(Zip<R> zip) {
            this.zipper = zip;
        }

        public final void a(long j) {
            xje.a((AtomicLong) this, j);
            this.zipper.a();
        }
    }

    final class a extends xio<xii[]> {
        private xio<? super R> a;
        private Zip<R> b;
        private ZipProducer<R> c;
        private boolean d;

        public a(xio<? super R> xio, Zip<R> zip, ZipProducer<R> zipProducer) {
            this.a = xio;
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

        public final /* synthetic */ void onNext(Object obj) {
            xii[] xiiArr = (xii[]) obj;
            if (xiiArr == null || xiiArr.length == 0) {
                this.a.onCompleted();
                return;
            }
            this.d = true;
            Zip<R> zip = this.b;
            ZipProducer<R> zipProducer = this.c;
            Object[] objArr = new Object[xiiArr.length];
            for (int i = 0; i < xiiArr.length; i++) {
                a aVar = new a();
                objArr[i] = aVar;
                zip.childSubscription.a((xip) aVar);
            }
            zip.requested = zipProducer;
            zip.subscribers = objArr;
            for (int i2 = 0; i2 < xiiArr.length; i2++) {
                xiiArr[i2].a((xio<? super T>) (a) objArr[i2]);
            }
        }
    }

    public OperatorZip(xiz xiz) {
        this.a = xjd.a(xiz);
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        Zip zip = new Zip(xio, this.a);
        ZipProducer zipProducer = new ZipProducer(zip);
        a aVar = new a(xio, zip, zipProducer);
        xio.add(aVar);
        xio.setProducer(zipProducer);
        return aVar;
    }
}
