package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xjs reason: default package */
public final class xjs<T> implements defpackage.xii.a<T> {
    private xii<? extends T> a;
    private xii<? extends T> b;

    /* renamed from: xjs$a */
    static final class a<T> extends xio<T> {
        private final xlg a;
        private final xio<? super T> b;

        a(xio<? super T> xio, xlg xlg) {
            this.b = xio;
            this.a = xlg;
        }

        public final void onCompleted() {
            this.b.onCompleted();
        }

        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        public final void onNext(T t) {
            this.b.onNext(t);
            this.a.b(1);
        }

        public final void setProducer(xik xik) {
            this.a.a(xik);
        }
    }

    /* renamed from: xjs$b */
    static final class b<T> extends xio<T> {
        private boolean a = true;
        private final xio<? super T> b;
        private final xom c;
        private final xlg d;
        private final xii<? extends T> e;
        private AtomicInteger f;
        private volatile boolean g;

        b(xio<? super T> xio, xom xom, xlg xlg, xii<? extends T> xii) {
            this.b = xio;
            this.c = xom;
            this.d = xlg;
            this.e = xii;
            this.f = new AtomicInteger();
        }

        /* access modifiers changed from: 0000 */
        public final void a(xii<? extends T> xii) {
            if (this.f.getAndIncrement() == 0) {
                while (!this.b.isUnsubscribed()) {
                    if (!this.g) {
                        if (xii == null) {
                            a aVar = new a(this.b, this.d);
                            this.c.a(aVar);
                            this.g = true;
                            this.e.a((xio<? super T>) aVar);
                        } else {
                            this.g = true;
                            xii.a((xio<? super T>) this);
                            xii = null;
                        }
                    }
                    if (this.f.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public final void onCompleted() {
            if (!this.a) {
                this.b.onCompleted();
                return;
            }
            if (!this.b.isUnsubscribed()) {
                this.g = false;
                a(null);
            }
        }

        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        public final void onNext(T t) {
            this.a = false;
            this.b.onNext(t);
            this.d.b(1);
        }

        public final void setProducer(xik xik) {
            this.d.a(xik);
        }
    }

    public xjs(xii<? extends T> xii, xii<? extends T> xii2) {
        this.a = xii;
        this.b = xii2;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        xom xom = new xom();
        xlg xlg = new xlg();
        b bVar = new b(xio, xom, xlg, this.b);
        xom.a(bVar);
        xio.add(xom);
        xio.setProducer(xlg);
        bVar.a(this.a);
    }
}
