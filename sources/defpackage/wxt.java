package defpackage;

/* renamed from: wxt reason: default package */
public final class wxt<T> extends wuh<T> {
    final T b;

    /* renamed from: wxt$a */
    static final class a<T> implements defpackage.wuh.a<T> {
        private final wxd a;
        private final T b;

        public final /* synthetic */ void call(Object obj) {
            wui wui = (wui) obj;
            wui.a(this.a.a(new c(wui, this.b)));
        }

        a(wxd wxd, T t) {
            this.a = wxd;
            this.b = t;
        }
    }

    /* renamed from: wxt$b */
    static final class b<T> implements defpackage.wuh.a<T> {
        private final wug a;
        private final T b;

        public final /* synthetic */ void call(Object obj) {
            wui wui = (wui) obj;
            defpackage.wug.a c = this.a.c();
            wui.a((wuk) c);
            c.a(new c(wui, this.b));
        }

        b(wug wug, T t) {
            this.a = wug;
            this.b = t;
        }
    }

    /* renamed from: wxt$c */
    static final class c<T> implements wum {
        private final wui<? super T> a;
        private final T b;

        c(wui<? super T> wui, T t) {
            this.a = wui;
            this.b = t;
        }

        public final void call() {
            try {
                this.a.a(this.b);
            } catch (Throwable th) {
                this.a.a(th);
            }
        }
    }

    public static <T> wxt<T> a(T t) {
        return new wxt<>(t);
    }

    private wxt(final T t) {
        super(new defpackage.wuh.a<T>() {
            public final /* synthetic */ void call(Object obj) {
                ((wui) obj).a(t);
            }
        });
        this.b = t;
    }

    public final wuh<T> b(wug wug) {
        if (wug instanceof wxd) {
            return a((defpackage.wuh.a<T>) new a<T>((wxd) wug, this.b));
        }
        return a((defpackage.wuh.a<T>) new b<T>(wug, this.b));
    }

    public final <R> wuh<R> e(final wut<? super T, ? extends wuh<? extends R>> wut) {
        return a((defpackage.wuh.a<T>) new defpackage.wuh.a<R>() {
            public final /* synthetic */ void call(Object obj) {
                final wui wui = (wui) obj;
                wuh wuh = (wuh) wut.call(wxt.this.b);
                if (wuh instanceof wxt) {
                    wui.a(((wxt) wuh).b);
                    return;
                }
                AnonymousClass1 r1 = new wui<R>() {
                    public final void a(Throwable th) {
                        wui.a(th);
                    }

                    public final void a(R r) {
                        wui.a(r);
                    }
                };
                wui.a((wuk) r1);
                wuh.a((wui<? super T>) r1);
            }
        });
    }
}
