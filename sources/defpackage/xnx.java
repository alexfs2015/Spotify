package defpackage;

import java.io.PrintStream;

/* renamed from: xnx reason: default package */
public final class xnx {
    private static volatile xis<Throwable> a = new xis<Throwable>() {
        public final /* synthetic */ void call(Object obj) {
            Throwable th = (Throwable) obj;
            xoa.a().b();
        }
    };
    private static volatile xiy<a, a> b = new xiy<a, a>() {
        public final /* synthetic */ Object call(Object obj) {
            a aVar = (a) obj;
            xoa.a().c();
            return xny.a(aVar);
        }
    };
    private static volatile xiy<a, a> c = new xiy<a, a>() {
        public final /* synthetic */ Object call(Object obj) {
            a aVar = (a) obj;
            xoa.a().d();
            return xoc.a(aVar);
        }
    };
    private static volatile xiy<a, a> d = new xiy<a, a>() {
        public final /* synthetic */ Object call(Object obj) {
            a aVar = (a) obj;
            xoa.a().e();
            return xnv.a(aVar);
        }
    };
    private static volatile xiz<xii, a, a> e = new xiz<xii, a, a>() {
        public final /* synthetic */ Object call(Object obj, Object obj2) {
            xii xii = (xii) obj;
            a aVar = (a) obj2;
            xoa.a().c();
            return xny.b(aVar);
        }
    };
    private static volatile xiz<xim, a, a> f = new xiz<xim, a, a>() {
        public final /* synthetic */ Object call(Object obj, Object obj2) {
            xim xim = (xim) obj;
            a aVar = (a) obj2;
            return xoa.a().d() == xod.a() ? aVar : new xkz(xoc.a((a<T>) new xlf<T>(aVar)));
        }
    };
    private static volatile xiz<xig, a, a> g = new xiz<xig, a, a>() {
        public final /* synthetic */ Object call(Object obj, Object obj2) {
            xig xig = (xig) obj;
            a aVar = (a) obj2;
            xoa.a().e();
            return xnv.b(aVar);
        }
    };
    private static volatile xiy<xir, xir> h = new xiy<xir, xir>() {
        public final /* synthetic */ Object call(Object obj) {
            xir xir = (xir) obj;
            xoa.a().f();
            return xob.a(xir);
        }
    };
    private static volatile xiy<xip, xip> i = new xiy<xip, xip>() {
        public final /* synthetic */ Object call(Object obj) {
            xip xip = (xip) obj;
            xoa.a().c();
            return xny.a(xip);
        }
    };
    private static volatile xiy<xip, xip> j = new xiy<xip, xip>() {
        public final /* synthetic */ Object call(Object obj) {
            xip xip = (xip) obj;
            xoa.a().d();
            return xoc.a(xip);
        }
    };
    private static volatile xiy<Throwable, Throwable> k = new xiy<Throwable, Throwable>() {
        public final /* synthetic */ Object call(Object obj) {
            Throwable th = (Throwable) obj;
            xoa.a().c();
            return xny.a(th);
        }
    };
    private static volatile xiy<Throwable, Throwable> l = new xiy<Throwable, Throwable>() {
        public final /* synthetic */ Object call(Object obj) {
            Throwable th = (Throwable) obj;
            xoa.a().d();
            return xoc.a(th);
        }
    };
    private static volatile xiy<Throwable, Throwable> m = new xiy<Throwable, Throwable>() {
        public final /* synthetic */ Object call(Object obj) {
            Throwable th = (Throwable) obj;
            xoa.a().e();
            return xnv.a(th);
        }
    };
    private static volatile xiy<b, b> n = new xiy<b, b>() {
        public final /* synthetic */ Object call(Object obj) {
            b bVar = (b) obj;
            xoa.a().c();
            return xny.a(bVar);
        }
    };
    private static volatile xiy<b, b> o = new xiy<b, b>() {
        public final /* synthetic */ Object call(Object obj) {
            b bVar = (b) obj;
            xoa.a().d();
            return xoc.a(bVar);
        }
    };
    private static volatile xiy<b, b> p = new xiy<b, b>() {
        public final /* synthetic */ Object call(Object obj) {
            b bVar = (b) obj;
            xoa.a().e();
            return xnv.a(bVar);
        }
    };

    public static a a(a aVar) {
        xiy<a, a> xiy = d;
        return xiy != null ? (a) xiy.call(aVar) : aVar;
    }

    public static <T> a a(xig xig, a aVar) {
        xiz<xig, a, a> xiz = g;
        return xiz != null ? (a) xiz.call(xig, aVar) : aVar;
    }

    public static <T> a<T> a(a<T> aVar) {
        xiy<a, a> xiy = b;
        return xiy != null ? (a) xiy.call(aVar) : aVar;
    }

    public static <T> a<T> a(xii<T> xii, a<T> aVar) {
        xiz<xii, a, a> xiz = e;
        return xiz != null ? (a) xiz.call(xii, aVar) : aVar;
    }

    public static <T, R> b<R, T> a(b<R, T> bVar) {
        xiy<b, b> xiy = n;
        return xiy != null ? (b) xiy.call(bVar) : bVar;
    }

    public static xil a(xil xil) {
        return xil;
    }

    public static <T> a<T> a(a<T> aVar) {
        xiy<a, a> xiy = c;
        return xiy != null ? (a) xiy.call(aVar) : aVar;
    }

    public static <T> a<T> a(xim<T> xim, a<T> aVar) {
        xiz<xim, a, a> xiz = f;
        return xiz != null ? (a) xiz.call(xim, aVar) : aVar;
    }

    public static xip a(xip xip) {
        xiy<xip, xip> xiy = i;
        return xiy != null ? (xip) xiy.call(xip) : xip;
    }

    public static xir a(xir xir) {
        xiy<xir, xir> xiy = h;
        return xiy != null ? (xir) xiy.call(xir) : xir;
    }

    public static void a(Throwable th) {
        xis<Throwable> xis = a;
        if (xis != null) {
            try {
                xis.call(th);
                return;
            } catch (Throwable th2) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder("The onError handler threw an Exception. It shouldn't. => ");
                sb.append(th2.getMessage());
                printStream.println(sb.toString());
                th2.printStackTrace();
                e(th2);
            }
        }
        e(th);
    }

    public static Throwable b(Throwable th) {
        xiy<Throwable, Throwable> xiy = k;
        return xiy != null ? (Throwable) xiy.call(th) : th;
    }

    public static <T, R> b<R, T> b(b<R, T> bVar) {
        xiy<b, b> xiy = o;
        return xiy != null ? (b) xiy.call(bVar) : bVar;
    }

    public static xip b(xip xip) {
        xiy<xip, xip> xiy = j;
        return xiy != null ? (xip) xiy.call(xip) : xip;
    }

    public static Throwable c(Throwable th) {
        xiy<Throwable, Throwable> xiy = l;
        return xiy != null ? (Throwable) xiy.call(th) : th;
    }

    public static Throwable d(Throwable th) {
        xiy<Throwable, Throwable> xiy = m;
        return xiy != null ? (Throwable) xiy.call(th) : th;
    }

    private static void e(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
