package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wwq reason: default package */
public final class wwq<T> implements defpackage.wuh.a<T> {
    private defpackage.wuh.a<T> a;
    private long b;
    private TimeUnit c;
    private wug d;

    /* renamed from: wwq$a */
    static final class a<T> extends wui<T> implements wum {
        private wui<? super T> a;
        private defpackage.wug.a b;
        private long c;
        private TimeUnit d;
        private T e;
        private Throwable f;

        public a(wui<? super T> wui, defpackage.wug.a aVar, long j, TimeUnit timeUnit) {
            this.a = wui;
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

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        defpackage.wug.a c2 = this.d.c();
        a aVar = new a(wui, c2, this.b, this.c);
        wui.a((wuk) c2);
        wui.a((wuk) aVar);
        this.a.call(aVar);
    }

    public wwq(defpackage.wuh.a<T> aVar, long j, TimeUnit timeUnit, wug wug) {
        this.a = aVar;
        this.d = wug;
        this.b = j;
        this.c = timeUnit;
    }
}
