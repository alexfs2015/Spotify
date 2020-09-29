package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xkv reason: default package */
public final class xkv<T> implements defpackage.xim.a<T> {
    private defpackage.xim.a<T> a;
    private long b;
    private TimeUnit c;
    private xil d;

    /* renamed from: xkv$a */
    static final class a<T> extends xin<T> implements xir {
        private xin<? super T> a;
        private defpackage.xil.a b;
        private long c;
        private TimeUnit d;
        private T e;
        private Throwable f;

        public a(xin<? super T> xin, defpackage.xil.a aVar, long j, TimeUnit timeUnit) {
            this.a = xin;
            this.b = aVar;
            this.c = j;
            this.d = timeUnit;
        }

        public final void a(T t) {
            this.e = t;
            this.b.a(this, this.c, this.d);
        }

        public final void a(Throwable th) {
            this.f = th;
            this.b.a(this, this.c, this.d);
        }

        public final void call() {
            try {
                Throwable th = this.f;
                if (th != null) {
                    this.f = null;
                    this.a.a(th);
                } else {
                    T t = this.e;
                    this.e = null;
                    this.a.a(t);
                }
            } finally {
                this.b.unsubscribe();
            }
        }
    }

    public xkv(defpackage.xim.a<T> aVar, long j, TimeUnit timeUnit, xil xil) {
        this.a = aVar;
        this.d = xil;
        this.b = j;
        this.c = timeUnit;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        defpackage.xil.a c2 = this.d.c();
        a aVar = new a(xin, c2, this.b, this.c);
        xin.a((xip) c2);
        xin.a((xip) aVar);
        this.a.call(aVar);
    }
}
