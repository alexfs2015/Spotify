package defpackage;

/* renamed from: xji reason: default package */
public final class xji<T, U> implements a<T> {
    final xii<? extends T> a;
    private xii<U> b;

    public xji(xii<? extends T> xii, xii<U> xii2) {
        this.a = xii;
        this.b = xii2;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        final xom xom = new xom();
        xio.add(xom);
        final xio a2 = xnu.a(xio);
        AnonymousClass1 r1 = new xio<U>() {
            private boolean a;

            public final void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    xom.a(xon.b());
                    xji.this.a.a(a2);
                }
            }

            public final void onError(Throwable th) {
                if (this.a) {
                    xnx.a(th);
                    return;
                }
                this.a = true;
                a2.onError(th);
            }

            public final void onNext(U u) {
                onCompleted();
            }
        };
        xom.a(r1);
        this.b.a((xio<? super T>) r1);
    }
}
