package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kjl reason: default package */
final class kjl<M, E, F> {
    private final kjw<M, E, F> a;
    private final kkn<F> b;
    private final kkn<M> c;
    private final List<E> d = new ArrayList();
    private boolean e = false;

    /* renamed from: kjl$a */
    static class a<M, E, F> {
        final kjw<M, E, F> a;

        a(kjw<M, E, F> kjw) {
            this.a = (kjw) kkr.a(kjw);
        }
    }

    kjl(kjw<M, E, F> kjw, kkn<F> kkn, kkn<M> kkn2) {
        this.a = (kjw) kkr.a(kjw);
        this.b = (kkn) kkr.a(kkn);
        this.c = (kkn) kkr.a(kkn2);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        if (!this.e) {
            kjn a2 = this.a.a();
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
        kjx a2 = this.a.a(e2);
        AnonymousClass1 r0 = new kkn<M>() {
            public final void accept(M m) {
                kjl.this.b(m);
            }
        };
        kkr.a(r0);
        if (a2.c()) {
            r0.accept(a2.d());
        }
        a((Iterable<F>) a2.b());
    }

    /* access modifiers changed from: 0000 */
    public void b(M m) {
        this.c.accept(m);
    }

    private void a(Iterable<F> iterable) {
        for (F accept : iterable) {
            this.b.accept(accept);
        }
    }
}
