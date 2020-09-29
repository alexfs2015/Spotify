package defpackage;

/* renamed from: xly reason: default package */
public final class xly<T> extends xim<T> {
    final T b;

    /* renamed from: xly$a */
    static final class a<T> implements defpackage.xim.a<T> {
        private final xli a;
        private final T b;

        a(xli xli, T t) {
            this.a = xli;
            this.b = t;
        }

        public final /* synthetic */ void call(Object obj) {
            xin xin = (xin) obj;
            xin.a(this.a.a(new c(xin, this.b)));
        }
    }

    /* renamed from: xly$b */
    static final class b<T> implements defpackage.xim.a<T> {
        private final xil a;
        private final T b;

        b(xil xil, T t) {
            this.a = xil;
            this.b = t;
        }

        public final /* synthetic */ void call(Object obj) {
            xin xin = (xin) obj;
            defpackage.xil.a c = this.a.c();
            xin.a((xip) c);
            c.a(new c(xin, this.b));
        }
    }

    /* renamed from: xly$c */
    static final class c<T> implements xir {
        private final xin<? super T> a;
        private final T b;

        c(xin<? super T> xin, T t) {
            this.a = xin;
            this.b = t;
        }

        public final void call() {
            try {
                this.a.a(this.b);
            } catch (Throwable th) {
                this.a.a(th);
            }
        }
    }

    private xly(final T t) {
        super(new defpackage.xim.a<T>() {
            public final /* synthetic */ void call(Object obj) {
                ((xin) obj).a(t);
            }
        });
        this.b = t;
    }

    public static <T> xly<T> a(T t) {
        return new xly<>(t);
    }

    public final xim<T> b(xil xil) {
        return xil instanceof xli ? a((defpackage.xim.a<T>) new a<T>((xli) xil, this.b)) : a((defpackage.xim.a<T>) new b<T>(xil, this.b));
    }

    public final <R> xim<R> e(final xiy<? super T, ? extends xim<? extends R>> xiy) {
        return a((defpackage.xim.a<T>) new defpackage.xim.a<R>() {
            public final /* synthetic */ void call(Object obj) {
                final xin xin = (xin) obj;
                xim xim = (xim) xiy.call(xly.this.b);
                if (xim instanceof xly) {
                    xin.a(((xly) xim).b);
                    return;
                }
                AnonymousClass1 r1 = new xin<R>() {
                    public final void a(R r) {
                        xin.a(r);
                    }

                    public final void a(Throwable th) {
                        xin.a(th);
                    }
                };
                xin.a((xip) r1);
                xim.a((xin<? super T>) r1);
            }
        });
    }
}
