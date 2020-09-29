package defpackage;

import java.io.PrintStream;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: knc reason: default package */
public final class knc {
    private static final kmx<?, ?> a = new kmx<Object, Object>() {
        public final kmw<Object, Object> init(Object obj) {
            return kmw.a(obj);
        }
    };
    private static final kmv<?> b = new kmv<Object>() {
        public final kno subscribe(knw<Object> knw) {
            return new kno() {
                public final void dispose() {
                }
            };
        }
    };
    private static final d<?, ?, ?> c = new d<Object, Object, Object>() {
        public final void a(Object obj) {
        }

        public final void a(Object obj, Object obj2) {
        }

        public final void a(Object obj, Object obj2, Throwable th) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder("error updating model: '");
            sb.append(obj);
            sb.append("' with event: '");
            sb.append(obj2);
            sb.append("' - ");
            sb.append(th);
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
        }

        public final void a(Object obj, Object obj2, kng<Object, Object> kng) {
        }

        public final void a(Object obj, Throwable th) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder("error initialising from model: '");
            sb.append(obj);
            sb.append("' - ");
            sb.append(th);
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
        }

        public final void a(Object obj, kmw<Object, Object> kmw) {
        }
    };

    /* renamed from: knc$a */
    static final class a<M, E, F> implements defpackage.knd.a<M, E, F> {
        /* access modifiers changed from: private */
        public static final C0046a a = new C0046a(0);
        private final kni<M, E, F> b;
        private final kmm<F, E> c;
        private final kmx<M, F> d;
        private final kmv<E> e;
        private final kny<koe> f;
        private final kny<koe> g;
        private final d<M, E, F> h;

        /* renamed from: knc$a$a reason: collision with other inner class name */
        static class C0046a implements ThreadFactory {
            private static final AtomicLong a = new AtomicLong(0);

            private C0046a() {
            }

            /* synthetic */ C0046a(byte b) {
                this();
            }

            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread((Runnable) koa.a(runnable));
                newThread.setName(String.format(Locale.ENGLISH, "mobius-thread-%d", new Object[]{Long.valueOf(a.incrementAndGet())}));
                return newThread;
            }
        }

        private a(kni<M, E, F> kni, kmm<F, E> kmm, kmx<M, F> kmx, kmv<E> kmv, d<M, E, F> dVar, kny<koe> kny, kny<koe> kny2) {
            this.b = (kni) koa.a(kni);
            this.c = (kmm) koa.a(kmm);
            this.d = (kmx) koa.a(kmx);
            this.e = (kmv) koa.a(kmv);
            this.f = (kny) koa.a(kny);
            this.g = (kny) koa.a(kny2);
            this.h = (d) koa.a(dVar);
        }

        /* synthetic */ a(kni kni, kmm kmm, kmx kmx, kmv kmv, d dVar, kny kny, kny kny2, byte b2) {
            this(kni, kmm, kmx, kmv, dVar, kny, kny2);
        }

        public final defpackage.knd.a<M, E, F> a(kmv<E> kmv) {
            a aVar = new a(this.b, this.c, this.d, kmv, this.h, this.f, this.g);
            return aVar;
        }

        public final defpackage.knd.a<M, E, F> a(kmv<E> kmv, kmv<E>... kmvArr) {
            a aVar = new a(this.b, this.c, this.d, kna.a(kmv, kmvArr), this.h, this.f, this.g);
            return aVar;
        }

        public final defpackage.knd.a<M, E, F> a(kmx<M, F> kmx) {
            a aVar = new a(this.b, this.c, kmx, this.e, this.h, this.f, this.g);
            return aVar;
        }

        public final defpackage.knd.a<M, E, F> a(d<M, E, F> dVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, dVar, this.f, this.g);
            return aVar;
        }

        public final defpackage.knd.a<M, E, F> a(kny<koe> kny) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.h, kny, this.g);
            return aVar;
        }

        public final knd<M, E, F> a(M m) {
            return knd.a(new knf(new kmy(this.d, this.h), new kmz(this.b, this.h), koa.a(m)), this.c, this.e, (koe) koa.a(this.f.get()), (koe) koa.a(this.g.get()));
        }

        public final defpackage.knd.a<M, E, F> b(kny<koe> kny) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.h, this.f, kny);
            return aVar;
        }
    }

    public static <M, E, F> defpackage.knd.a<M, E, F> a(kni<M, E, F> kni, kmm<F, E> kmm) {
        a aVar = new a(kni, kmm, a, b, c, new kny<koe>() {
            public final /* synthetic */ Object get() {
                return kof.a(Executors.newSingleThreadExecutor(a.a));
            }
        }, new kny<koe>() {
            public final /* synthetic */ Object get() {
                return kof.a(Executors.newCachedThreadPool(a.a));
            }
        }, 0);
        return aVar;
    }

    public static <M, E, F> b<M, E> a(c<M, E, F> cVar, M m) {
        return new kne(cVar, m, kof.a());
    }

    public static <M, E, F> b<M, E> a(c<M, E, F> cVar, M m, koe koe) {
        return new kne(cVar, m, koe);
    }
}
