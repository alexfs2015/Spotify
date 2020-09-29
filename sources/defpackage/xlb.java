package defpackage;

/* renamed from: xlb reason: default package */
public final class xlb<T> implements defpackage.xim.a<T> {
    private defpackage.xim.a<T> a;
    private xil b;

    /* renamed from: xlb$a */
    static final class a<T> extends xin<T> implements xir {
        private xin<? super T> a;
        private defpackage.xil.a b;
        private T c;
        private Throwable d;

        public a(xin<? super T> xin, defpackage.xil.a aVar) {
            this.a = xin;
            this.b = aVar;
        }

        public final void a(T t) {
            this.c = t;
            this.b.a(this);
        }

        public final void a(Throwable th) {
            this.d = th;
            this.b.a(this);
        }

        public final void call() {
            try {
                Throwable th = this.d;
                if (th != null) {
                    this.d = null;
                    this.a.a(th);
                } else {
                    T t = this.c;
                    this.c = null;
                    this.a.a(t);
                }
            } finally {
                this.b.unsubscribe();
            }
        }
    }

    public xlb(defpackage.xim.a<T> aVar, xil xil) {
        this.a = aVar;
        this.b = xil;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        defpackage.xil.a c = this.b.c();
        a aVar = new a(xin, c);
        xin.a((xip) c);
        xin.a((xip) aVar);
        this.a.call(aVar);
    }
}
