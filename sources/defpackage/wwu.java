package defpackage;

import java.util.NoSuchElementException;

/* renamed from: wwu reason: default package */
public final class wwu<T> implements defpackage.wuh.a<T> {
    private defpackage.wud.a<T> a;

    /* renamed from: wwu$a */
    static final class a<T> extends wuj<T> {
        private wui<? super T> a;
        private T b;
        private int c;

        a(wui<? super T> wui) {
            this.a = wui;
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

        public final void onError(Throwable th) {
            if (this.c == 2) {
                wzs.a(th);
                return;
            }
            this.b = null;
            this.a.a(th);
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
    }

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        a aVar = new a(wui);
        wui.a((wuk) aVar);
        this.a.call(aVar);
    }

    public wwu(defpackage.wud.a<T> aVar) {
        this.a = aVar;
    }
}
