package defpackage;

/* renamed from: knh reason: default package */
final class knh<F, E> implements kmm<F, E> {
    private final kmm<F, E> a;

    /* renamed from: knh$a */
    static class a<E> implements kmn<E> {
        private final knw<E> a;
        private boolean b;

        private a(knw<E> knw) {
            this.a = knw;
        }

        /* synthetic */ a(knw knw, byte b2) {
            this(knw);
        }

        public final synchronized void accept(E e) {
            if (!this.b) {
                this.a.accept(e);
            }
        }

        public final synchronized void dispose() {
            this.b = true;
        }
    }

    /* renamed from: knh$b */
    static class b<F> implements kmn<F> {
        private final kmn<F> a;
        private boolean b;

        private b(kmn<F> kmn) {
            this.a = kmn;
        }

        /* synthetic */ b(kmn kmn, byte b2) {
            this(kmn);
        }

        public final synchronized void accept(F f) {
            if (!this.b) {
                this.a.accept(f);
            }
        }

        public final synchronized void dispose() {
            this.b = true;
            this.a.dispose();
        }
    }

    knh(kmm<F, E> kmm) {
        this.a = (kmm) koa.a(kmm);
    }

    public final kmn<F> connect(knw<E> knw) {
        a aVar = new a((knw) koa.a(knw), 0);
        final b bVar = new b((kmn) koa.a(this.a.connect(aVar)), 0);
        final kno a2 = knn.a(aVar, bVar);
        return new kmn<F>() {
            public final synchronized void accept(F f) {
                bVar.accept(f);
            }

            public final synchronized void dispose() {
                a2.dispose();
            }
        };
    }
}
