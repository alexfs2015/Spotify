package defpackage;

import rx.exceptions.OnErrorThrowable;

/* renamed from: wwy reason: default package */
public final class wwy<T, R> implements defpackage.wuh.a<R> {
    private wuh<T> a;
    private wut<? super T, ? extends R> b;

    /* renamed from: wwy$a */
    static final class a<T, R> extends wui<T> {
        private wui<? super R> a;
        private wut<? super T, ? extends R> b;
        private boolean c;

        public a(wui<? super R> wui, wut<? super T, ? extends R> wut) {
            this.a = wui;
            this.b = wut;
        }

        public final void a(T t) {
            try {
                this.a.a(this.b.call(t));
            } catch (Throwable th) {
                wul.b(th);
                unsubscribe();
                a(OnErrorThrowable.a(th, t));
            }
        }

        public final void a(Throwable th) {
            if (this.c) {
                wzs.a(th);
                return;
            }
            this.c = true;
            this.a.a(th);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        a aVar = new a(wui, this.b);
        wui.a((wuk) aVar);
        this.a.a((wui<? super T>) aVar);
    }

    public wwy(wuh<T> wuh, wut<? super T, ? extends R> wut) {
        this.a = wuh;
        this.b = wut;
    }
}
