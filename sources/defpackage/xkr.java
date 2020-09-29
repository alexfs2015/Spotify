package defpackage;

/* renamed from: xkr reason: default package */
public final class xkr<T, E> implements b<T, T> {
    private final xii<? extends E> a;

    public xkr(xii<? extends E> xii) {
        this.a = xii;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        xnt xnt = new xnt(xio, false);
        final AnonymousClass1 r2 = new xio<T>(xnt, false, xnt) {
            private /* synthetic */ xio a;

            {
                this.a = r4;
            }

            public final void onCompleted() {
                try {
                    this.a.onCompleted();
                } finally {
                    this.a.unsubscribe();
                }
            }

            public final void onError(Throwable th) {
                try {
                    this.a.onError(th);
                } finally {
                    this.a.unsubscribe();
                }
            }

            public final void onNext(T t) {
                this.a.onNext(t);
            }
        };
        AnonymousClass2 r1 = new xio<E>() {
            public final void onCompleted() {
                r2.onCompleted();
            }

            public final void onError(Throwable th) {
                r2.onError(th);
            }

            public final void onNext(E e) {
                onCompleted();
            }

            public final void onStart() {
                request(Long.MAX_VALUE);
            }
        };
        xnt.add(r2);
        xnt.add(r1);
        xio.add(xnt);
        this.a.a((xio<? super T>) r1);
        return r2;
    }
}
