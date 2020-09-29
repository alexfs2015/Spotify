package defpackage;

/* renamed from: xko reason: default package */
public final class xko<T> implements defpackage.xii.a<T> {
    private xil a;
    private xii<T> b;
    private boolean c;

    /* renamed from: xko$a */
    static final class a<T> extends xio<T> implements xir {
        final boolean a;
        final defpackage.xil.a b;
        Thread c;
        private xio<? super T> d;
        private xii<T> e;

        a(xio<? super T> xio, boolean z, defpackage.xil.a aVar, xii<T> xii) {
            this.d = xio;
            this.a = z;
            this.b = aVar;
            this.e = xii;
        }

        public final void call() {
            xii<T> xii = this.e;
            this.e = null;
            this.c = Thread.currentThread();
            xii.a((xio<? super T>) this);
        }

        public final void onCompleted() {
            try {
                this.d.onCompleted();
            } finally {
                this.b.unsubscribe();
            }
        }

        public final void onError(Throwable th) {
            try {
                this.d.onError(th);
            } finally {
                this.b.unsubscribe();
            }
        }

        public final void onNext(T t) {
            this.d.onNext(t);
        }

        public final void setProducer(final xik xik) {
            this.d.setProducer(new xik() {
                public final void a(final long j) {
                    if (a.this.c == Thread.currentThread() || !a.this.a) {
                        xik.a(j);
                    } else {
                        a.this.b.a(new xir() {
                            public final void call() {
                                xik.a(j);
                            }
                        });
                    }
                }
            });
        }
    }

    public xko(xii<T> xii, xil xil, boolean z) {
        this.a = xil;
        this.b = xii;
        this.c = z;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        defpackage.xil.a c2 = this.a.c();
        a aVar = new a(xio, this.c, c2, this.b);
        xio.add(aVar);
        xio.add(c2);
        c2.a(aVar);
    }
}
