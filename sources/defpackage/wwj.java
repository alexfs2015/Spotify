package defpackage;

/* renamed from: wwj reason: default package */
public final class wwj<T> implements defpackage.wud.a<T> {
    private wug a;
    private wud<T> b;
    private boolean c;

    /* renamed from: wwj$a */
    static final class a<T> extends wuj<T> implements wum {
        final boolean a;
        final defpackage.wug.a b;
        Thread c;
        private wuj<? super T> d;
        private wud<T> e;

        a(wuj<? super T> wuj, boolean z, defpackage.wug.a aVar, wud<T> wud) {
            this.d = wuj;
            this.a = z;
            this.b = aVar;
            this.e = wud;
        }

        public final void onNext(T t) {
            this.d.onNext(t);
        }

        public final void onError(Throwable th) {
            try {
                this.d.onError(th);
            } finally {
                this.b.unsubscribe();
            }
        }

        public final void onCompleted() {
            try {
                this.d.onCompleted();
            } finally {
                this.b.unsubscribe();
            }
        }

        public final void call() {
            wud<T> wud = this.e;
            this.e = null;
            this.c = Thread.currentThread();
            wud.a((wuj<? super T>) this);
        }

        public final void setProducer(final wuf wuf) {
            this.d.setProducer(new wuf() {
                public final void a(final long j) {
                    if (a.this.c == Thread.currentThread() || !a.this.a) {
                        wuf.a(j);
                    } else {
                        a.this.b.a(new wum() {
                            public final void call() {
                                wuf.a(j);
                            }
                        });
                    }
                }
            });
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        defpackage.wug.a c2 = this.a.c();
        a aVar = new a(wuj, this.c, c2, this.b);
        wuj.add(aVar);
        wuj.add(c2);
        c2.a(aVar);
    }

    public wwj(wud<T> wud, wug wug, boolean z) {
        this.a = wug;
        this.b = wud;
        this.c = z;
    }
}
