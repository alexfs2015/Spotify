package defpackage;

import java.io.PrintStream;

/* renamed from: wzs reason: default package */
public final class wzs {
    private static volatile wun<Throwable> a = new wun<Throwable>() {
        public final /* synthetic */ void call(Object obj) {
            Throwable th = (Throwable) obj;
            wzv.a().b();
        }
    };
    private static volatile wut<a, a> b = new wut<a, a>() {
        public final /* synthetic */ Object call(Object obj) {
            a aVar = (a) obj;
            wzv.a().c();
            return wzt.a(aVar);
        }
    };
    private static volatile wut<a, a> c = new wut<a, a>() {
        public final /* synthetic */ Object call(Object obj) {
            a aVar = (a) obj;
            wzv.a().d();
            return wzx.a(aVar);
        }
    };
    private static volatile wut<a, a> d = new wut<a, a>() {
        public final /* synthetic */ Object call(Object obj) {
            a aVar = (a) obj;
            wzv.a().e();
            return wzq.a(aVar);
        }
    };
    private static volatile wuu<wud, a, a> e = new wuu<wud, a, a>() {
        public final /* synthetic */ Object call(Object obj, Object obj2) {
            wud wud = (wud) obj;
            a aVar = (a) obj2;
            wzv.a().c();
            return wzt.b(aVar);
        }
    };
    private static volatile wuu<wuh, a, a> f = new wuu<wuh, a, a>() {
        public final /* synthetic */ Object call(Object obj, Object obj2) {
            wuh wuh = (wuh) obj;
            a aVar = (a) obj2;
            if (wzv.a().d() == wzy.a()) {
                return aVar;
            }
            return new wwu(wzx.a((a<T>) new wxa<T>(aVar)));
        }
    };
    private static volatile wuu<wub, a, a> g = new wuu<wub, a, a>() {
        public final /* synthetic */ Object call(Object obj, Object obj2) {
            wub wub = (wub) obj;
            a aVar = (a) obj2;
            wzv.a().e();
            return wzq.b(aVar);
        }
    };
    private static volatile wut<wum, wum> h = new wut<wum, wum>() {
        public final /* synthetic */ Object call(Object obj) {
            wum wum = (wum) obj;
            wzv.a().f();
            return wzw.a(wum);
        }
    };
    private static volatile wut<wuk, wuk> i = new wut<wuk, wuk>() {
        public final /* synthetic */ Object call(Object obj) {
            wuk wuk = (wuk) obj;
            wzv.a().c();
            return wzt.a(wuk);
        }
    };
    private static volatile wut<wuk, wuk> j = new wut<wuk, wuk>() {
        public final /* synthetic */ Object call(Object obj) {
            wuk wuk = (wuk) obj;
            wzv.a().d();
            return wzx.a(wuk);
        }
    };
    private static volatile wut<Throwable, Throwable> k = new wut<Throwable, Throwable>() {
        public final /* synthetic */ Object call(Object obj) {
            Throwable th = (Throwable) obj;
            wzv.a().c();
            return wzt.a(th);
        }
    };
    private static volatile wut<Throwable, Throwable> l = new wut<Throwable, Throwable>() {
        public final /* synthetic */ Object call(Object obj) {
            Throwable th = (Throwable) obj;
            wzv.a().d();
            return wzx.a(th);
        }
    };
    private static volatile wut<Throwable, Throwable> m = new wut<Throwable, Throwable>() {
        public final /* synthetic */ Object call(Object obj) {
            Throwable th = (Throwable) obj;
            wzv.a().e();
            return wzq.a(th);
        }
    };
    private static volatile wut<b, b> n = new wut<b, b>() {
        public final /* synthetic */ Object call(Object obj) {
            b bVar = (b) obj;
            wzv.a().c();
            return wzt.a(bVar);
        }
    };
    private static volatile wut<b, b> o = new wut<b, b>() {
        public final /* synthetic */ Object call(Object obj) {
            b bVar = (b) obj;
            wzv.a().d();
            return wzx.a(bVar);
        }
    };
    private static volatile wut<b, b> p = new wut<b, b>() {
        public final /* synthetic */ Object call(Object obj) {
            b bVar = (b) obj;
            wzv.a().e();
            return wzq.a(bVar);
        }
    };

    public static wug a(wug wug) {
        return wug;
    }

    public static void a(Throwable th) {
        wun<Throwable> wun = a;
        if (wun != null) {
            try {
                wun.call(th);
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

    private static void e(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static <T> a<T> a(a<T> aVar) {
        wut<a, a> wut = b;
        return wut != null ? (a) wut.call(aVar) : aVar;
    }

    public static <T> a<T> a(a<T> aVar) {
        wut<a, a> wut = c;
        return wut != null ? (a) wut.call(aVar) : aVar;
    }

    public static a a(a aVar) {
        wut<a, a> wut = d;
        return wut != null ? (a) wut.call(aVar) : aVar;
    }

    public static wum a(wum wum) {
        wut<wum, wum> wut = h;
        return wut != null ? (wum) wut.call(wum) : wum;
    }

    public static <T> a<T> a(wud<T> wud, a<T> aVar) {
        wuu<wud, a, a> wuu = e;
        return wuu != null ? (a) wuu.call(wud, aVar) : aVar;
    }

    public static wuk a(wuk wuk) {
        wut<wuk, wuk> wut = i;
        return wut != null ? (wuk) wut.call(wuk) : wuk;
    }

    public static Throwable b(Throwable th) {
        wut<Throwable, Throwable> wut = k;
        return wut != null ? (Throwable) wut.call(th) : th;
    }

    public static <T, R> b<R, T> a(b<R, T> bVar) {
        wut<b, b> wut = n;
        return wut != null ? (b) wut.call(bVar) : bVar;
    }

    public static <T> a<T> a(wuh<T> wuh, a<T> aVar) {
        wuu<wuh, a, a> wuu = f;
        return wuu != null ? (a) wuu.call(wuh, aVar) : aVar;
    }

    public static wuk b(wuk wuk) {
        wut<wuk, wuk> wut = j;
        return wut != null ? (wuk) wut.call(wuk) : wuk;
    }

    public static Throwable c(Throwable th) {
        wut<Throwable, Throwable> wut = l;
        return wut != null ? (Throwable) wut.call(th) : th;
    }

    public static <T, R> b<R, T> b(b<R, T> bVar) {
        wut<b, b> wut = o;
        return wut != null ? (b) wut.call(bVar) : bVar;
    }

    public static <T> a a(wub wub, a aVar) {
        wuu<wub, a, a> wuu = g;
        return wuu != null ? (a) wuu.call(wub, aVar) : aVar;
    }

    public static Throwable d(Throwable th) {
        wut<Throwable, Throwable> wut = m;
        return wut != null ? (Throwable) wut.call(th) : th;
    }
}
