package defpackage;

import java.util.NoSuchElementException;

/* renamed from: xkz reason: default package */
public final class xkz<T> implements defpackage.xim.a<T> {
    private defpackage.xii.a<T> a;

    /* renamed from: xkz$a */
    static final class a<T> extends xio<T> {
        private xin<? super T> a;
        private T b;
        private int c;

        a(xin<? super T> xin) {
            this.a = xin;
        }

        public final void onCompleted() {
            int i = this.c;
            if (i == 0) {
                this.a.a((Throwable) new NoSuchElementException());
                return;
            }
            if (i == 1) {
                this.c = 2;
                T t = this.b;
                this.b = null;
                this.a.a(t);
            }
        }

        public final void onError(Throwable th) {
            if (this.c == 2) {
                xnx.a(th);
                return;
            }
            this.b = null;
            this.a.a(th);
        }

        public final void onNext(T t) {
            int i = this.c;
            if (i == 0) {
                this.c = 1;
                this.b = t;
                return;
            }
            if (i == 1) {
                this.c = 2;
                this.a.a((Throwable) new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public xkz(defpackage.xii.a<T> aVar) {
        this.a = aVar;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        a aVar = new a(xin);
        xin.a((xip) aVar);
        this.a.call(aVar);
    }
}
