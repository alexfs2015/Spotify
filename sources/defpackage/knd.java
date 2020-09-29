package defpackage;

import com.spotify.mobius.ConnectionException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: knd reason: default package */
public final class knd<M, E, F> implements kno {
    /* access modifiers changed from: 0000 */
    public final List<knw<M>> a = new CopyOnWriteArrayList();
    public volatile M b;
    private final knb<E> c;
    private final knb<F> d;
    /* access modifiers changed from: private */
    public final kmu<M, E, F> e;
    /* access modifiers changed from: private */
    public final kmn<F> f;
    private final kno g;
    private volatile boolean h;

    /* renamed from: knd$a */
    public interface a<M, E, F> extends c<M, E, F> {
        a<M, E, F> a(kmv<E> kmv);

        a<M, E, F> a(kmv<E> kmv, kmv<E>... kmvArr);

        a<M, E, F> a(kmx<M, F> kmx);

        a<M, E, F> a(d<M, E, F> dVar);

        a<M, E, F> a(kny<koe> kny);

        a<M, E, F> b(kny<koe> kny);
    }

    /* renamed from: knd$b */
    public interface b<M, E> {
        void a(kmm<M, E> kmm);

        boolean a();

        void b();

        void c();

        void d();

        M e();
    }

    /* renamed from: knd$c */
    public interface c<M, E, F> {
        knd<M, E, F> a(M m);
    }

    /* renamed from: knd$d */
    public interface d<M, E, F> {
        void a(M m);

        void a(M m, E e);

        void a(M m, E e, Throwable th);

        void a(M m, E e, kng<M, F> kng);

        void a(M m, Throwable th);

        void a(M m, kmw<M, F> kmw);
    }

    private knd(a<M, E, F> aVar, kmm<F, E> kmm, kmv<E> kmv, koe koe, koe koe2) {
        AnonymousClass1 r0 = new knw<E>() {
            public final void accept(E e) {
                knd.this.e.a(e);
            }
        };
        AnonymousClass2 r1 = new knw<F>() {
            public final void accept(F f) {
                try {
                    knd.this.f.accept(f);
                } catch (Throwable th) {
                    throw new ConnectionException(f, th);
                }
            }
        };
        AnonymousClass3 r2 = new knw<M>() {
            public final void accept(M m) {
                knd.this.b = m;
                for (knw accept : knd.this.a) {
                    accept.accept(m);
                }
            }
        };
        this.c = new knb<>(koe, r0);
        this.d = new knb<>(koe2, r1);
        this.e = new kmu<>(aVar.a, (knw) koa.a(this.d), (knw) koa.a(r2));
        AnonymousClass4 r5 = new knw<E>() {
            public final void accept(E e) {
                knd.this.a(e);
            }
        };
        this.f = kmm.connect(r5);
        this.g = kmv.subscribe(r5);
        koe.a(new Runnable() {
            public final void run() {
                knd.this.e.a();
            }
        });
    }

    static <M, E, F> knd<M, E, F> a(knf<M, E, F> knf, kmm<F, E> kmm, kmv<E> kmv, koe koe, koe koe2) {
        knd knd = new knd(new a((knf) koa.a(knf)), (kmm) koa.a(kmm), (kmv) koa.a(kmv), (koe) koa.a(koe), (koe) koa.a(koe2));
        return knd;
    }

    public final kno a(final knw<M> knw) {
        if (!this.h) {
            this.a.add(koa.a(knw));
            M m = this.b;
            if (m != null) {
                knw.accept(m);
            }
            return new kno() {
                public final void dispose() {
                    knd.this.a.remove(knw);
                }
            };
        }
        throw new IllegalStateException("This loop has already been disposed. You cannot observe a disposed loop");
    }

    public final void a(E e2) {
        if (!this.h) {
            this.c.accept(koa.a(e2));
            return;
        }
        throw new IllegalStateException("This loop has already been disposed. You cannot dispatch events after disposal");
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
