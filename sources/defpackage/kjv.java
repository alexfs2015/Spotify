package defpackage;

/* renamed from: kjv reason: default package */
final class kjv<M, E, F> implements kjf<M, E>, b<M, E> {
    private final c<M, E, F> a;
    private final M b;
    private final kkv c;
    private kjg<M, E> d;

    kjv(c<M, E, F> cVar, M m, kkv kkv) {
        this.a = (c) kkr.a(cVar);
        this.b = kkr.a(m);
        this.c = (kkv) kkr.a(kkv);
        b(m);
    }

    public final synchronized boolean a() {
        return this.d.b();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void c(E e) {
        this.d.a(e);
    }

    /* access modifiers changed from: 0000 */
    public synchronized void d(M m) {
        this.d.b(m);
    }

    public final synchronized void a(kjd<M, E> kjd) {
        this.d.a((kjd) kkr.a(kjd));
    }

    public final synchronized void b() {
        this.d.c();
    }

    public final synchronized void c() {
        this.d.d();
    }

    public final synchronized void d() {
        this.d.e();
    }

    public final synchronized M e() {
        return this.d.f();
    }

    public final void a(final M m) {
        this.c.a(new Runnable() {
            public final void run() {
                kjv.this.d(m);
            }
        });
    }

    public final synchronized void b(M m) {
        this.d = new kji(this, m);
    }

    public final synchronized void a(kje<M> kje, M m) {
        if (m == null) {
            m = this.b;
        }
        this.d = new kjh(this, kje, m);
    }

    public final void a(kjd<M, E> kjd, M m) {
        a((kje) kkr.a(new kjy((kjd) kkr.a(kjd)).connect(new kkn<E>() {
            public final void accept(E e) {
                kjv.this.c(e);
            }
        })), m);
    }

    public final synchronized void b(kje<M> kje, M m) {
        kjj kjj = new kjj(this, kje, this.a, m);
        this.d = kjj;
        kjj.a.a((kkn<M>) new kkn<M>() {
            public final void accept(M m) {
                kjj.this.b.a(m);
            }
        });
    }
}
