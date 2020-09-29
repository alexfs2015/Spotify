package defpackage;

/* renamed from: wwx reason: default package */
public final class wwx<T> implements defpackage.wuh.a<T> {
    private defpackage.wuh.a<T> a;
    private wut<Throwable, ? extends T> b;

    /* renamed from: wwx$a */
    static final class a<T> extends wui<T> {
        private wui<? super T> a;
        private wut<Throwable, ? extends T> b;

        public a(wui<? super T> wui, wut<Throwable, ? extends T> wut) {
            this.a = wui;
            this.b = wut;
        }

        public final void a(T t) {
            this.a.a(t);
        }

        public final void a(Throwable th) {
            try {
                this.a.a(this.b.call(th));
            } catch (Throwable th2) {
                wul.b(th2);
                this.a.a(th2);
            }
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wui wui = (wui) obj;
        a aVar = new a(wui, this.b);
        wui.a((wuk) aVar);
        this.a.call(aVar);
    }

    public wwx(defpackage.wuh.a<T> aVar, wut<Throwable, ? extends T> wut) {
        this.a = aVar;
        this.b = wut;
    }
}
