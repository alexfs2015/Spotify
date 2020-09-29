package defpackage;

import java.io.PrintStream;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: kjt reason: default package */
public final class kjt {
    private static final kjo<?, ?> a = new kjo<Object, Object>() {
        public final kjn<Object, Object> init(Object obj) {
            return kjn.a(obj);
        }
    };
    private static final kjm<?> b = new kjm<Object>() {
        public final kkf subscribe(kkn<Object> kkn) {
            return new kkf() {
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

        public final void a(Object obj, Object obj2, kjx<Object, Object> kjx) {
        }

        public final void a(Object obj, kjn<Object, Object> kjn) {
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
    };

    /* renamed from: kjt$a */
    static final class a<M, E, F> implements defpackage.kju.a<M, E, F> {
        /* access modifiers changed from: private */
        public static final C0045a a = new C0045a(0);
        private final kjz<M, E, F> b;
        private final kjd<F, E> c;
        private final kjo<M, F> d;
        private final kjm<E> e;
        private final kkp<kkv> f;
        private final kkp<kkv> g;
        private final d<M, E, F> h;

        /* renamed from: kjt$a$a reason: collision with other inner class name */
        static class C0045a implements ThreadFactory {
            private static final AtomicLong a = new AtomicLong(0);

            private C0045a() {
            }

            /* synthetic */ C0045a(byte b) {
                this();
            }

            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread((Runnable) kkr.a(runnable));
                newThread.setName(String.format(Locale.ENGLISH, "mobius-thread-%d", new Object[]{Long.valueOf(a.incrementAndGet())}));
                return newThread;
            }
        }

        /* synthetic */ a(kjz kjz, kjd kjd, kjo kjo, kjm kjm, d dVar, kkp kkp, kkp kkp2, byte b2) {
            this(kjz, kjd, kjo, kjm, dVar, kkp, kkp2);
        }

        private a(kjz<M, E, F> kjz, kjd<F, E> kjd, kjo<M, F> kjo, kjm<E> kjm, d<M, E, F> dVar, kkp<kkv> kkp, kkp<kkv> kkp2) {
            this.b = (kjz) kkr.a(kjz);
            this.c = (kjd) kkr.a(kjd);
            this.d = (kjo) kkr.a(kjo);
            this.e = (kjm) kkr.a(kjm);
            this.f = (kkp) kkr.a(kkp);
            this.g = (kkp) kkr.a(kkp2);
            this.h = (d) kkr.a(dVar);
        }

        public final defpackage.kju.a<M, E, F> a(kjo<M, F> kjo) {
            a aVar = new a(this.b, this.c, kjo, this.e, this.h, this.f, this.g);
            return aVar;
        }

        public final defpackage.kju.a<M, E, F> a(kjm<E> kjm) {
            a aVar = new a(this.b, this.c, this.d, kjm, this.h, this.f, this.g);
            return aVar;
        }

        public final defpackage.kju.a<M, E, F> a(kjm<E> kjm, kjm<E>... kjmArr) {
            a aVar = new a(this.b, this.c, this.d, kjr.a(kjm, kjmArr), this.h, this.f, this.g);
            return aVar;
        }

        public final defpackage.kju.a<M, E, F> a(d<M, E, F> dVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, dVar, this.f, this.g);
            return aVar;
        }

        public final defpackage.kju.a<M, E, F> a(kkp<kkv> kkp) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.h, kkp, this.g);
            return aVar;
        }

        public final defpackage.kju.a<M, E, F> b(kkp<kkv> kkp) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.h, this.f, kkp);
            return aVar;
        }

        public final kju<M, E, F> a(M m) {
            return kju.a(new kjw(new kjp(this.d, this.h), new kjq(this.b, this.h), kkr.a(m)), this.c, this.e, (kkv) kkr.a(this.f.get()), (kkv) kkr.a(this.g.get()));
        }
    }

    public static <M, E, F> defpackage.kju.a<M, E, F> a(kjz<M, E, F> kjz, kjd<F, E> kjd) {
        a aVar = new a(kjz, kjd, a, b, c, new kkp<kkv>() {
            public final /* synthetic */ Object get() {
                return kkw.a(Executors.newSingleThreadExecutor(a.a));
            }
        }, new kkp<kkv>() {
            public final /* synthetic */ Object get() {
                return kkw.a(Executors.newCachedThreadPool(a.a));
            }
        }, 0);
        return aVar;
    }

    public static <M, E, F> b<M, E> a(c<M, E, F> cVar, M m) {
        return new kjv(cVar, m, new kku());
    }

    public static <M, E, F> b<M, E> a(c<M, E, F> cVar, M m, kkv kkv) {
        return new kjv(cVar, m, kkv);
    }
}
