package defpackage;

/* renamed from: xlc reason: default package */
public final class xlc<T> implements defpackage.xim.a<T> {
    private defpackage.xim.a<T> a;
    private xiy<Throwable, ? extends T> b;

    /* renamed from: xlc$a */
    static final class a<T> extends xin<T> {
        private xin<? super T> a;
        private xiy<Throwable, ? extends T> b;

        public a(xin<? super T> xin, xiy<Throwable, ? extends T> xiy) {
            this.a = xin;
            this.b = xiy;
        }

        public final void a(T t) {
            this.a.a(t);
        }

        public final void a(Throwable th) {
            try {
                this.a.a(this.b.call(th));
            } catch (Throwable th2) {
                xiq.b(th2);
                this.a.a(th2);
            }
        }
    }

    public xlc(defpackage.xim.a<T> aVar, xiy<Throwable, ? extends T> xiy) {
        this.a = aVar;
        this.b = xiy;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        a aVar = new a(xin, this.b);
        xin.a((xip) aVar);
        this.a.call(aVar);
    }
}
