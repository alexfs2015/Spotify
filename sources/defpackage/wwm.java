package defpackage;

/* renamed from: wwm reason: default package */
public final class wwm<T, E> implements b<T, T> {
    private final wud<? extends E> a;

    public final /* synthetic */ Object call(Object obj) {
        wuj wuj = (wuj) obj;
        wzo wzo = new wzo(wuj, false);
        final AnonymousClass1 r2 = new wuj<T>(wzo, false, wzo) {
            private /* synthetic */ wuj a;

            {
                this.a = r4;
            }

            public final void onNext(T t) {
                this.a.onNext(t);
            }

            public final void onError(Throwable th) {
                try {
                    this.a.onError(th);
                } finally {
                    this.a.unsubscribe();
                }
            }

            public final void onCompleted() {
                try {
                    this.a.onCompleted();
                } finally {
                    this.a.unsubscribe();
                }
            }
        };
        AnonymousClass2 r1 = new wuj<E>() {
            public final void onStart() {
                request(Long.MAX_VALUE);
            }

            public final void onCompleted() {
                r2.onCompleted();
            }

            public final void onError(Throwable th) {
                r2.onError(th);
            }

            public final void onNext(E e) {
                onCompleted();
            }
        };
        wzo.add(r2);
        wzo.add(r1);
        wuj.add(wzo);
        this.a.a((wuj<? super T>) r1);
        return r2;
    }

    public wwm(wud<? extends E> wud) {
        this.a = wud;
    }
}
