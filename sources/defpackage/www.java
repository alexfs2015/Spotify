package defpackage;

/* renamed from: www reason: default package */
public final class www<T> implements defpackage.wuh.a<T> {
    private defpackage.wuh.a<T> a;
    private wug b;

    /* renamed from: www$a */
    static final class a<T> extends wui<T> implements wum {
        private wui<? super T> a;
        private defpackage.wug.a b;
        private T c;
        private Throwable d;

        public a(wui<? super T> wui, defpackage.wug.a aVar) {
            this.a = wui;
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

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        defpackage.wug.a c = this.b.c();
        a aVar = new a(wui, c);
        wui.a((wuk) c);
        wui.a((wuk) aVar);
        this.a.call(aVar);
    }

    public www(defpackage.wuh.a<T> aVar, wug wug) {
        this.a = aVar;
        this.b = wug;
    }
}
