package defpackage;

import io.netty.util.DefaultAttributeMap;
import io.netty.util.Recycler;
import io.netty.util.internal.PlatformDependent;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: wal reason: default package */
public abstract class wal extends DefaultAttributeMap implements wav, whl {
    private static final wjw e;
    private static final AtomicIntegerFieldUpdater<wal> f;
    private static /* synthetic */ boolean p;
    volatile wal a;
    volatile wal b;
    final String c;
    volatile int d = 0;
    private final boolean g;
    private final boolean h;
    /* access modifiers changed from: private */
    public final wbo i;
    private final boolean j;
    private whw k;
    private Runnable l;
    private Runnable m;
    private Runnable n;
    private Runnable o;

    /* renamed from: wal$a */
    static abstract class a implements Runnable {
        private static final boolean a = wjo.a("io.netty.transport.estimateSizeOnSubmit", true);
        private static final int b = wjo.a("io.netty.transport.writeTaskSizeOverhead", 48);
        private final io.netty.util.Recycler.b<a> c;
        private wal d;
        private Object e;
        private wbi f;
        private int g;

        /* synthetic */ a(io.netty.util.Recycler.b bVar, byte b2) {
            this(bVar);
        }

        private a(io.netty.util.Recycler.b<? extends a> bVar) {
            this.c = bVar;
        }

        protected static void a(a aVar, wal wal, Object obj, wbi wbi) {
            aVar.d = wal;
            aVar.e = obj;
            aVar.f = wbi;
            if (a) {
                wbb b2 = wal.a().l().b();
                if (b2 != null) {
                    aVar.g = wal.i.e().a(obj) + b;
                    b2.a((long) aVar.g, true);
                } else {
                    aVar.g = 0;
                }
            } else {
                aVar.g = 0;
            }
        }

        public final void run() {
            try {
                wbb b2 = this.d.a().l().b();
                if (a && b2 != null) {
                    b2.a((long) this.g, true, true);
                }
                a(this.d, this.e, this.f);
            } finally {
                this.d = null;
                this.e = null;
                this.f = null;
                this.c.a(this);
            }
        }

        /* access modifiers changed from: protected */
        public void a(wal wal, Object obj, wbi wbi) {
            wal.b(obj, wbi);
        }
    }

    /* renamed from: wal$b */
    static final class b extends a {
        private static final Recycler<b> a = new Recycler<b>() {
            public final /* synthetic */ Object a(io.netty.util.Recycler.b bVar) {
                return new b(bVar, 0);
            }
        };

        /* synthetic */ b(io.netty.util.Recycler.b bVar, byte b) {
            this(bVar);
        }

        private b(io.netty.util.Recycler.b<b> bVar) {
            super(bVar, 0);
        }

        public final void a(wal wal, Object obj, wbi wbi) {
            super.a(wal, obj, wbi);
            wal.B();
        }

        static /* synthetic */ b b(wal wal, Object obj, wbi wbi) {
            b bVar = (b) a.a();
            a(bVar, wal, obj, wbi);
            return bVar;
        }
    }

    /* renamed from: wal$c */
    static final class c extends a implements a {
        private static final Recycler<c> a = new Recycler<c>() {
            public final /* synthetic */ Object a(io.netty.util.Recycler.b bVar) {
                return new c(bVar, 0);
            }
        };

        /* synthetic */ c(io.netty.util.Recycler.b bVar, byte b) {
            this(bVar);
        }

        private c(io.netty.util.Recycler.b<c> bVar) {
            super(bVar, 0);
        }

        static /* synthetic */ c b(wal wal, Object obj, wbi wbi) {
            c cVar = (c) a.a();
            a(cVar, wal, obj, wbi);
            return cVar;
        }
    }

    static {
        Class<wal> cls = wal.class;
        p = !cls.desiredAssertionStatus();
        e = wjx.a(cls);
        AtomicIntegerFieldUpdater<wal> b2 = PlatformDependent.b(cls, "handlerState");
        if (b2 == null) {
            b2 = AtomicIntegerFieldUpdater.newUpdater(cls, "d");
        }
        f = b2;
    }

    wal(wbo wbo, whw whw, String str, boolean z, boolean z2) {
        boolean z3 = false;
        this.c = (String) wjk.a(str, "name");
        this.i = wbo;
        this.k = whw;
        this.g = z;
        this.h = z2;
        if (whw == null || (whw instanceof wij)) {
            z3 = true;
        }
        this.j = z3;
    }

    public final wan a() {
        return this.i.c;
    }

    public final wbf b() {
        return this.i;
    }

    public final vyw c() {
        return a().B().c();
    }

    public final whw d() {
        whw whw = this.k;
        return whw == null ? a().e() : whw;
    }

    public final wav e() {
        a(D());
        return this;
    }

    static void a(wal wal) {
        whw d2 = wal.d();
        if (d2.j()) {
            wal.u();
        } else {
            d2.execute(new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.u();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        if (F()) {
            try {
                ((waw) t()).g(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            e();
        }
    }

    public final wav f() {
        b(D());
        return this;
    }

    static void b(wal wal) {
        whw d2 = wal.d();
        if (d2.j()) {
            wal.v();
        } else {
            d2.execute(new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.v();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        if (F()) {
            try {
                ((waw) t()).h(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            f();
        }
    }

    public final wav g() {
        c(D());
        return this;
    }

    static void c(wal wal) {
        whw d2 = wal.d();
        if (d2.j()) {
            wal.w();
        } else {
            d2.execute(new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.w();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void w() {
        if (F()) {
            try {
                ((waw) t()).a(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            g();
        }
    }

    public final wav h() {
        d(D());
        return this;
    }

    static void d(wal wal) {
        whw d2 = wal.d();
        if (d2.j()) {
            wal.x();
        } else {
            d2.execute(new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.x();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        if (F()) {
            try {
                ((waw) t()).b(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            h();
        }
    }

    public final wav a(Throwable th) {
        a(this.a, th);
        return this;
    }

    static void a(wal wal, final Throwable th) {
        wjk.a(th, "cause");
        whw d2 = wal.d();
        if (d2.j()) {
            wal.b(th);
            return;
        }
        try {
            d2.execute(new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.b(th);
                }
            });
        } catch (Throwable th2) {
            if (e.d()) {
                e.d("Failed to submit an exceptionCaught() event.", th2);
                e.d("The exceptionCaught() event that was failed to submit was:", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(Throwable th) {
        if (F()) {
            try {
                t().a(this, th);
            } catch (Throwable th2) {
                if (e.b()) {
                    e.b("An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:", wjp.a(th2), th);
                } else {
                    if (e.d()) {
                        e.c("An exception '{}' [enable DEBUG level for full stacktrace] was thrown by a user handler's exceptionCaught() method while handling the following exception:", th2, th);
                    }
                }
            }
        } else {
            a(th);
        }
    }

    public final wav c(Object obj) {
        a(D(), obj);
        return this;
    }

    static void a(wal wal, final Object obj) {
        wjk.a(obj, "event");
        whw d2 = wal.d();
        if (d2.j()) {
            wal.e(obj);
        } else {
            d2.execute(new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.e(obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void e(Object obj) {
        if (F()) {
            try {
                ((waw) t()).b(this, obj);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            c(obj);
        }
    }

    public final wav d(Object obj) {
        b(D(), obj);
        return this;
    }

    static void b(wal wal, Object obj) {
        final Object a2 = wal.i.a(wjk.a(obj, "msg"), wal);
        whw d2 = wal.d();
        if (d2.j()) {
            wal.f(a2);
        } else {
            d2.execute(new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.f(a2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void f(Object obj) {
        if (F()) {
            try {
                ((waw) t()).a((wav) this, obj);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            d(obj);
        }
    }

    public final wav j() {
        e(D());
        return this;
    }

    static void e(wal wal) {
        whw d2 = wal.d();
        if (d2.j()) {
            wal.y();
            return;
        }
        Runnable runnable = wal.l;
        if (runnable == null) {
            runnable = new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.y();
                }
            };
            wal.l = runnable;
        }
        d2.execute(runnable);
    }

    /* access modifiers changed from: private */
    public void y() {
        if (F()) {
            try {
                ((waw) t()).i(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            j();
        }
    }

    public final wav l() {
        f(D());
        return this;
    }

    static void f(wal wal) {
        whw d2 = wal.d();
        if (d2.j()) {
            wal.z();
            return;
        }
        Runnable runnable = wal.n;
        if (runnable == null) {
            runnable = new Runnable(wal) {
                private /* synthetic */ wal a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.z();
                }
            };
            wal.n = runnable;
        }
        d2.execute(runnable);
    }

    /* access modifiers changed from: private */
    public void z() {
        if (F()) {
            try {
                ((waw) t()).j(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            l();
        }
    }

    public final war i() {
        return b(k());
    }

    public final war a(SocketAddress socketAddress, wbi wbi) {
        return a(socketAddress, (SocketAddress) null, wbi);
    }

    public final war a(SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
        if (socketAddress == null) {
            throw new NullPointerException("remoteAddress");
        } else if (!a(wbi, false)) {
            return wbi;
        } else {
            final wal E = E();
            whw d2 = E.d();
            if (d2.j()) {
                E.b(socketAddress, socketAddress2, wbi);
            } else {
                final SocketAddress socketAddress3 = socketAddress;
                final SocketAddress socketAddress4 = socketAddress2;
                final wbi wbi2 = wbi;
                AnonymousClass2 r1 = new Runnable() {
                    public final void run() {
                        E.b(socketAddress3, socketAddress4, wbi2);
                    }
                };
                a(d2, (Runnable) r1, wbi, (Object) null);
            }
            return wbi;
        }
    }

    /* access modifiers changed from: private */
    public void b(SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
        if (F()) {
            try {
                ((wbc) t()).a(this, socketAddress, socketAddress2, wbi);
            } catch (Throwable th) {
                a(th, wbi);
            }
        } else {
            a(socketAddress, socketAddress2, wbi);
        }
    }

    public final war a(final wbi wbi) {
        if (!a(wbi, false)) {
            return wbi;
        }
        final wal E = E();
        whw d2 = E.d();
        if (!d2.j()) {
            a(d2, (Runnable) new Runnable() {
                public final void run() {
                    if (!wal.this.a().E().a) {
                        E.d(wbi);
                    } else {
                        E.c(wbi);
                    }
                }
            }, wbi, (Object) null);
        } else if (!a().E().a) {
            E.d(wbi);
        } else {
            E.c(wbi);
        }
        return wbi;
    }

    /* access modifiers changed from: private */
    public void c(wbi wbi) {
        if (F()) {
            try {
                ((wbc) t()).a(this, wbi);
            } catch (Throwable th) {
                a(th, wbi);
            }
        } else {
            a(wbi);
        }
    }

    public final war b(final wbi wbi) {
        if (!a(wbi, false)) {
            return wbi;
        }
        final wal E = E();
        whw d2 = E.d();
        if (d2.j()) {
            E.d(wbi);
        } else {
            a(d2, (Runnable) new Runnable() {
                public final void run() {
                    E.d(wbi);
                }
            }, wbi, (Object) null);
        }
        return wbi;
    }

    /* access modifiers changed from: private */
    public void d(wbi wbi) {
        if (F()) {
            try {
                ((wbc) t()).b(this, wbi);
            } catch (Throwable th) {
                a(th, wbi);
            }
        } else {
            b(wbi);
        }
    }

    public final wav m() {
        final wal E = E();
        whw d2 = E.d();
        if (d2.j()) {
            E.A();
        } else {
            Runnable runnable = E.m;
            if (runnable == null) {
                runnable = new Runnable() {
                    public final void run() {
                        E.A();
                    }
                };
                E.m = runnable;
            }
            d2.execute(runnable);
        }
        return this;
    }

    /* access modifiers changed from: private */
    public void A() {
        if (F()) {
            try {
                ((wbc) t()).c(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            m();
        }
    }

    public final war a(Object obj) {
        return a(obj, k());
    }

    public final war a(Object obj, wbi wbi) {
        if (obj != null) {
            try {
                if (!a(wbi, true)) {
                    whh.a(obj);
                    return wbi;
                }
                a(obj, false, wbi);
                return wbi;
            } catch (RuntimeException e2) {
                whh.a(obj);
                throw e2;
            }
        } else {
            throw new NullPointerException("msg");
        }
    }

    /* access modifiers changed from: private */
    public void b(Object obj, wbi wbi) {
        if (F()) {
            c(obj, wbi);
        } else {
            a(obj, wbi);
        }
    }

    private void c(Object obj, wbi wbi) {
        try {
            ((wbc) t()).a(this, obj, wbi);
        } catch (Throwable th) {
            a(th, wbi);
        }
    }

    public final wav o() {
        final wal E = E();
        whw d2 = E.d();
        if (d2.j()) {
            E.B();
        } else {
            Runnable runnable = E.o;
            if (runnable == null) {
                runnable = new Runnable() {
                    public final void run() {
                        E.B();
                    }
                };
                E.o = runnable;
            }
            a(d2, runnable, a().n(), (Object) null);
        }
        return this;
    }

    /* access modifiers changed from: private */
    public void B() {
        if (F()) {
            C();
        } else {
            o();
        }
    }

    private void C() {
        try {
            ((wbc) t()).d(this);
        } catch (Throwable th) {
            c(th);
        }
    }

    private war d(Object obj, wbi wbi) {
        if (obj == null) {
            throw new NullPointerException("msg");
        } else if (!a(wbi, true)) {
            whh.a(obj);
            return wbi;
        } else {
            a(obj, true, wbi);
            return wbi;
        }
    }

    private void e(Object obj, wbi wbi) {
        if (F()) {
            c(obj, wbi);
            C();
            return;
        }
        d(obj, wbi);
    }

    private void a(Object obj, boolean z, wbi wbi) {
        Runnable runnable;
        wal E = E();
        Object a2 = this.i.a(obj, E);
        whw d2 = E.d();
        if (!d2.j()) {
            if (z) {
                runnable = b.b(E, a2, wbi);
            } else {
                runnable = c.b(E, a2, wbi);
            }
            a(d2, runnable, wbi, a2);
        } else if (z) {
            E.e(a2, wbi);
        } else {
            E.b(a2, wbi);
        }
    }

    public final war b(Object obj) {
        return d(obj, k());
    }

    private static void a(Throwable th, wbi wbi) {
        if (!(wbi instanceof wci)) {
            wjm.a((wim<?>) wbi, th, e);
        }
    }

    private void c(Throwable th) {
        if (d(th)) {
            if (e.d()) {
                e.d("An exception was thrown by a user handler while handling an exceptionCaught event", th);
            }
            return;
        }
        b(th);
    }

    private static boolean d(Throwable th) {
        do {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (stackTraceElement == null) {
                        break;
                    }
                    if ("exceptionCaught".equals(stackTraceElement.getMethodName())) {
                        return true;
                    }
                }
            }
            th = th.getCause();
        } while (th != null);
        return false;
    }

    public final wbi k() {
        return new wbp(a(), d());
    }

    private boolean a(wbi wbi, boolean z) {
        if (wbi == null) {
            throw new NullPointerException("promise");
        } else if (wbi.isDone()) {
            if (wbi.isCancelled()) {
                return false;
            }
            StringBuilder sb = new StringBuilder("promise already done: ");
            sb.append(wbi);
            throw new IllegalArgumentException(sb.toString());
        } else if (wbi.e() != a()) {
            throw new IllegalArgumentException(String.format("promise.channel does not match: %s (expected: %s)", new Object[]{wbi.e(), a()}));
        } else if (wbi.getClass() == wbp.class) {
            return true;
        } else {
            if (!z && (wbi instanceof wci)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(wjn.a(wci.class));
                sb2.append(" not allowed for this operation");
                throw new IllegalArgumentException(sb2.toString());
            } else if (!(wbi instanceof io.netty.channel.AbstractChannel.b)) {
                return true;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(wjn.a(io.netty.channel.AbstractChannel.b.class));
                sb3.append(" not allowed in a pipeline");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
    }

    private wal D() {
        wal wal = this;
        do {
            wal = wal.a;
        } while (!wal.g);
        return wal;
    }

    private wal E() {
        wal wal = this;
        do {
            wal = wal.b;
        } while (!wal.h);
        return wal;
    }

    public final wbi n() {
        return a().n();
    }

    /* access modifiers changed from: 0000 */
    public final void p() {
        int i2;
        do {
            i2 = this.d;
            if (i2 == 3) {
                return;
            }
        } while (!f.compareAndSet(this, i2, 2));
    }

    /* access modifiers changed from: 0000 */
    public final void q() {
        boolean compareAndSet = f.compareAndSet(this, 0, 1);
        if (!p && !compareAndSet) {
            throw new AssertionError();
        }
    }

    private boolean F() {
        int i2 = this.d;
        if (i2 == 2 || (!this.j && i2 == 1)) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        return this.d == 3;
    }

    public final <T> wgx<T> a(wgy<T> wgy) {
        return a().a(wgy);
    }

    private static void a(whw whw, Runnable runnable, wbi wbi, Object obj) {
        try {
            whw.execute(runnable);
        } catch (Throwable th) {
            if (obj != null) {
                whh.a(obj);
            }
            throw th;
        }
    }

    public final String s() {
        StringBuilder sb = new StringBuilder("'");
        sb.append(this.c);
        sb.append("' will handle the message from this point.");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a(wav.class));
        sb.append('(');
        sb.append(this.c);
        sb.append(", ");
        sb.append(a());
        sb.append(')');
        return sb.toString();
    }
}
