package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kmu reason: default package */
final class kmu<M, E, F> {
    private final knf<M, E, F> a;
    private final knw<F> b;
    private final knw<M> c;
    private final List<E> d = new ArrayList();
    private boolean e = false;

    /* renamed from: kmu$a */
    static class a<M, E, F> {
        final knf<M, E, F> a;

        a(knf<M, E, F> knf) {
            this.a = (knf) koa.a(knf);
        }
    }

    kmu(knf<M, E, F> knf, knw<F> knw, knw<M> knw2) {
        this.a = (knf) koa.a(knf);
        this.b = (knw) koa.a(knw);
        this.c = (knw) koa.a(knw2);
    }

    private void a(Iterable<F> iterable) {
        for (F accept : iterable) {
            this.b.accept(accept);
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        if (!this.e) {
            kmw a2 = this.a.a();
            b(a2.a());
            a((Iterable<F>) a2.b());
            this.e = true;
            for (E a3 : this.d) {
                a(a3);
            }
        } else {
            throw new IllegalStateException("already initialised");
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(E e2) {
        if (!this.e) {
            this.d.add(e2);
            return;
        }
        kng a2 = this.a.a(e2);
        AnonymousClass1 r0 = new knw<M>() {
            public final void accept(M m) {
                kmu.this.b(m);
            }
        };
        koa.a(r0);
        if (a2.c()) {
            r0.accept(a2.d());
        }
        a((Iterable<F>) a2.b());
    }

    /* access modifiers changed from: 0000 */
    public void b(M m) {
        this.c.accept(m);
    }
}
