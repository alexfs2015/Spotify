package defpackage;

import rx.exceptions.CompositeException;
import rx.exceptions.OnErrorThrowable;

/* renamed from: wwr reason: default package */
public final class wwr<T> implements defpackage.wuh.a<T> {
    private wuh<T> a;
    private wun<? super T> b;
    private wun<Throwable> c;

    /* renamed from: wwr$a */
    static final class a<T> extends wui<T> {
        private wui<? super T> a;
        private wun<? super T> b;
        private wun<Throwable> c;

        a(wui<? super T> wui, wun<? super T> wun, wun<Throwable> wun2) {
            this.a = wui;
            this.b = wun;
            this.c = wun2;
        }

        public final void a(T t) {
            try {
                this.b.call(t);
                this.a.a(t);
            } catch (Throwable th) {
                wul.b(th);
                a(OnErrorThrowable.a(th, t));
            }
        }

        public final void a(Throwable th) {
            try {
                this.c.call(th);
                this.a.a(th);
            } catch (Throwable th2) {
                wul.b(th2);
                this.a.a((Throwable) new CompositeException(th, th2));
            }
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        a aVar = new a(wui, this.b, this.c);
        wui.a((wuk) aVar);
        this.a.a((wui<? super T>) aVar);
    }

    public wwr(wuh<T> wuh, wun<? super T> wun, wun<Throwable> wun2) {
        this.a = wuh;
        this.b = wun;
        this.c = wun2;
    }
}
