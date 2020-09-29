package defpackage;

/* renamed from: kne reason: default package */
final class kne<M, E, F> implements kmo<M, E>, b<M, E> {
    private final c<M, E, F> a;
    private final M b;
    private final koe c;
    private kmp<M, E> d;

    kne(c<M, E, F> cVar, M m, koe koe) {
        this.a = (c) koa.a(cVar);
        this.b = koa.a(m);
        this.c = (koe) koa.a(koe);
        b(m);
    }

    public final void a(final M m) {
        this.c.a(new Runnable() {
            public final void run() {
                kne.this.d(m);
            }
        });
    }

    public final synchronized void a(kmm<M, E> kmm) {
        this.d.a((kmm) koa.a(kmm));
    }

    public final void a(kmm<M, E> kmm, M m) {
        a((kmn) koa.a(new knh((kmm) koa.a(kmm)).connect(new knw<E>() {
            public final void accept(E e) {
                kne.this.c(e);
            }
        })), m);
    }

    public final synchronized void a(kmn<M> kmn, M m) {
        if (m == null) {
            m = this.b;
        }
        this.d = new kmq(this, kmn, m);
    }

    public final synchronized boolean a() {
        return this.d.b();
    }

    public final synchronized void b() {
        this.d.c();
    }

    public final synchronized void b(M m) {
        this.d = new kmr(this, m);
    }

    public final synchronized void b(kmn<M> kmn, M m) {
        kms kms = new kms(this, kmn, this.a, m);
        this.d = kms;
        kms.a.a((knw<M>) new knw<M>() {
            public final void accept(M m) {
                kms.this.b.a(m);
            }
        });
    }

    public final synchronized void c() {
        this.d.d();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void c(E e) {
        this.d.a(e);
    }

    public final synchronized void d() {
        this.d.e();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void d(M m) {
        this.d.b(m);
    }

    public final synchronized M e() {
        return this.d.f();
    }
}
