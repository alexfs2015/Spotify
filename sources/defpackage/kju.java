package defpackage;

import com.spotify.mobius.ConnectionException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: kju reason: default package */
public final class kju<M, E, F> implements kkf {
    /* access modifiers changed from: 0000 */
    public final List<kkn<M>> a = new CopyOnWriteArrayList();
    public volatile M b;
    private final kjs<E> c;
    private final kjs<F> d;
    /* access modifiers changed from: private */
    public final kjl<M, E, F> e;
    /* access modifiers changed from: private */
    public final kje<F> f;
    private final kkf g;
    private volatile boolean h;

    /* renamed from: kju$a */
    public interface a<M, E, F> extends c<M, E, F> {
        a<M, E, F> a(kjm<E> kjm);

        a<M, E, F> a(kjm<E> kjm, kjm<E>... kjmArr);

        a<M, E, F> a(kjo<M, F> kjo);

        a<M, E, F> a(d<M, E, F> dVar);

        a<M, E, F> a(kkp<kkv> kkp);

        a<M, E, F> b(kkp<kkv> kkp);
    }

    /* renamed from: kju$b */
    public interface b<M, E> {
        void a(kjd<M, E> kjd);

        boolean a();

        void b();

        void c();

        void d();

        M e();
    }

    /* renamed from: kju$c */
    public interface c<M, E, F> {
        kju<M, E, F> a(M m);
    }

    /* renamed from: kju$d */
    public interface d<M, E, F> {
        void a(M m);

        void a(M m, E e);

        void a(M m, E e, Throwable th);

        void a(M m, E e, kjx<M, F> kjx);

        void a(M m, Throwable th);

        void a(M m, kjn<M, F> kjn);
    }

    static <M, E, F> kju<M, E, F> a(kjw<M, E, F> kjw, kjd<F, E> kjd, kjm<E> kjm, kkv kkv, kkv kkv2) {
        kju kju = new kju(new a((kjw) kkr.a(kjw)), (kjd) kkr.a(kjd), (kjm) kkr.a(kjm), (kkv) kkr.a(kkv), (kkv) kkr.a(kkv2));
        return kju;
    }

    private kju(a<M, E, F> aVar, kjd<F, E> kjd, kjm<E> kjm, kkv kkv, kkv kkv2) {
        AnonymousClass1 r0 = new kkn<E>() {
            public final void accept(E e) {
                kju.this.e.a(e);
            }
        };
        AnonymousClass2 r1 = new kkn<F>() {
            public final void accept(F f) {
                try {
                    kju.this.f.accept(f);
                } catch (Throwable th) {
                    throw new ConnectionException(f, th);
                }
            }
        };
        AnonymousClass3 r2 = new kkn<M>() {
            public final void accept(M m) {
                kju.this.b = m;
                for (kkn accept : kju.this.a) {
                    accept.accept(m);
                }
            }
        };
        this.c = new kjs<>(kkv, r0);
        this.d = new kjs<>(kkv2, r1);
        this.e = new kjl<>(aVar.a, (kkn) kkr.a(this.d), (kkn) kkr.a(r2));
        AnonymousClass4 r5 = new kkn<E>() {
            public final void accept(E e) {
                kju.this.a(e);
            }
        };
        this.f = kjd.connect(r5);
        this.g = kjm.subscribe(r5);
        kkv.a(new Runnable() {
            public final void run() {
                kju.this.e.a();
            }
        });
    }

    public final void a(E e2) {
        if (!this.h) {
            this.c.accept(kkr.a(e2));
            return;
        }
        throw new IllegalStateException("This loop has already been disposed. You cannot dispatch events after disposal");
    }

    public final kkf a(final kkn<M> kkn) {
        if (!this.h) {
            this.a.add(kkr.a(kkn));
            M m = this.b;
            if (m != null) {
                kkn.accept(m);
            }
            return new kkf() {
                public final void dispose() {
                    kju.this.a.remove(kkn);
                }
            };
        }
        throw new IllegalStateException("This loop has already been disposed. You cannot observe a disposed loop");
    }

    public final synchronized void dispose() {
        this.a.clear();
        this.c.a = true;
        this.d.a = true;
        this.g.dispose();
        this.f.dispose();
        this.c.dispose();
        this.d.dispose();
        this.h = true;
    }
}
