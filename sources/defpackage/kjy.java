package defpackage;

/* renamed from: kjy reason: default package */
final class kjy<F, E> implements kjd<F, E> {
    private final kjd<F, E> a;

    /* renamed from: kjy$a */
    static class a<E> implements kje<E> {
        private final kkn<E> a;
        private boolean b;

        /* synthetic */ a(kkn kkn, byte b2) {
            this(kkn);
        }

        private a(kkn<E> kkn) {
            this.a = kkn;
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

    /* renamed from: kjy$b */
    static class b<F> implements kje<F> {
        private final kje<F> a;
        private boolean b;

        /* synthetic */ b(kje kje, byte b2) {
            this(kje);
        }

        private b(kje<F> kje) {
            this.a = kje;
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

    kjy(kjd<F, E> kjd) {
        this.a = (kjd) kkr.a(kjd);
    }

    public final kje<F> connect(kkn<E> kkn) {
        a aVar = new a((kkn) kkr.a(kkn), 0);
        final b bVar = new b((kje) kkr.a(this.a.connect(aVar)), 0);
        final kkf a2 = kke.a(aVar, bVar);
        return new kje<F>() {
            public final synchronized void accept(F f) {
                bVar.accept(f);
            }

            public final synchronized void dispose() {
                a2.dispose();
            }
        };
    }
}
