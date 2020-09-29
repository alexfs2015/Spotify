package defpackage;

import io.netty.util.DefaultAttributeMap;
import io.netty.util.Recycler;
import io.netty.util.internal.PlatformDependent;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: wor reason: default package */
public abstract class wor extends DefaultAttributeMap implements wpb, wvr {
    private static final wyc e;
    private static final AtomicIntegerFieldUpdater<wor> f;
    private static /* synthetic */ boolean p;
    volatile wor a;
    volatile wor b;
    final String c;
    volatile int d = 0;
    private final boolean g;
    private final boolean h;
    /* access modifiers changed from: private */
    public final wpu i;
    private final boolean j;
    private wwc k;
    private Runnable l;
    private Runnable m;
    private Runnable n;
    private Runnable o;

    /* renamed from: wor$a */
    static abstract class a implements Runnable {
        private static final boolean a = wxu.a("io.netty.transport.estimateSizeOnSubmit", true);
        private static final int b = wxu.a("io.netty.transport.writeTaskSizeOverhead", 48);
        private final io.netty.util.Recycler.b<a> c;
        private wor d;
        private Object e;
        private wpo f;
        private int g;

        private a(io.netty.util.Recycler.b<? extends a> bVar) {
            this.c = bVar;
        }

        /* synthetic */ a(io.netty.util.Recycler.b bVar, byte b2) {
            this(bVar);
        }

        protected static void a(a aVar, wor wor, Object obj, wpo wpo) {
            aVar.d = wor;
            aVar.e = obj;
            aVar.f = wpo;
            if (a) {
                wph b2 = wor.a().l().b();
                if (b2 != null) {
                    aVar.g = wor.i.e().a(obj) + b;
                    b2.a((long) aVar.g, true);
                } else {
                    aVar.g = 0;
                }
            } else {
                aVar.g = 0;
            }
        }

        /* access modifiers changed from: protected */
        public void a(wor wor, Object obj, wpo wpo) {
            wor.b(obj, wpo);
        }

        public final void run() {
            try {
                wph b2 = this.d.a().l().b();
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
    }

    /* renamed from: wor$b */
    static final class b extends a {
        private static final Recycler<b> a = new Recycler<b>() {
            public final /* synthetic */ Object a(io.netty.util.Recycler.b bVar) {
                return new b(bVar, 0);
            }
        };

        private b(io.netty.util.Recycler.b<b> bVar) {
            super(bVar, 0);
        }

        /* synthetic */ b(io.netty.util.Recycler.b bVar, byte b) {
            this(bVar);
        }

        static /* synthetic */ b b(wor wor, Object obj, wpo wpo) {
            b bVar = (b) a.a();
            a(bVar, wor, obj, wpo);
            return bVar;
        }

        public final void a(wor wor, Object obj, wpo wpo) {
            super.a(wor, obj, wpo);
            wor.B();
        }
    }

    /* renamed from: wor$c */
    static final class c extends a implements a {
        private static final Recycler<c> a = new Recycler<c>() {
            public final /* synthetic */ Object a(io.netty.util.Recycler.b bVar) {
                return new c(bVar, 0);
            }
        };

        private c(io.netty.util.Recycler.b<c> bVar) {
            super(bVar, 0);
        }

        /* synthetic */ c(io.netty.util.Recycler.b bVar, byte b) {
            this(bVar);
        }

        static /* synthetic */ c b(wor wor, Object obj, wpo wpo) {
            c cVar = (c) a.a();
            a(cVar, wor, obj, wpo);
            return cVar;
        }
    }

    static {
        Class<wor> cls = wor.class;
        p = !cls.desiredAssertionStatus();
        e = wyd.a(cls);
        AtomicIntegerFieldUpdater<wor> b2 = PlatformDependent.b(cls, "handlerState");
        if (b2 == null) {
            b2 = AtomicIntegerFieldUpdater.newUpdater(cls, "d");
        }
        f = b2;
    }

    wor(wpu wpu, wwc wwc, String str, boolean z, boolean z2) {
        boolean z3 = false;
        this.c = (String) wxq.a(str, "name");
        this.i = wpu;
        this.k = wwc;
        this.g = z;
        this.h = z2;
        if (wwc == null || (wwc instanceof wwp)) {
            z3 = true;
        }
        this.j = z3;
    }

    /* access modifiers changed from: private */
    public void A() {
        if (F()) {
            try {
                ((wpi) t()).c(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            m();
        }
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
            ((wpi) t()).d(this);
        } catch (Throwable th) {
            c(th);
        }
    }

    private wor D() {
        wor wor = this;
        do {
            wor = wor.a;
        } while (!wor.g);
        return wor;
    }

    private wor E() {
        wor wor = this;
        do {
            wor = wor.b;
        } while (!wor.h);
        return wor;
    }

    private boolean F() {
        int i2 = this.d;
        return i2 == 2 || (!this.j && i2 == 1);
    }

    private void a(Object obj, boolean z, wpo wpo) {
        wor E = E();
        Object a2 = this.i.a(obj, E);
        wwc d2 = E.d();
        if (!d2.j()) {
            a(d2, z ? b.b(E, a2, wpo) : c.b(E, a2, wpo), wpo, a2);
        } else if (z) {
            E.e(a2, wpo);
        } else {
            E.b(a2, wpo);
        }
    }

    private static void a(Throwable th, wpo wpo) {
        if (!(wpo instanceof wqo)) {
            wxs.a((wws<?>) wpo, th, e);
        }
    }

    static void a(wor wor) {
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.u();
        } else {
            d2.execute(new Runnable(wor) {
                private /* synthetic */ wor a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.u();
                }
            });
        }
    }

    static void a(wor wor, final Object obj) {
        wxq.a(obj, "event");
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.e(obj);
        } else {
            d2.execute(new Runnable(wor) {
                private /* synthetic */ wor a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.e(obj);
                }
            });
        }
    }

    static void a(wor wor, final Throwable th) {
        wxq.a(th, "cause");
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.b(th);
            return;
        }
        try {
            d2.execute(new Runnable(wor) {
                private /* synthetic */ wor a;

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

    private static void a(wwc wwc, Runnable runnable, wpo wpo, Object obj) {
        try {
            wwc.execute(runnable);
        } catch (Throwable th) {
            if (obj != null) {
                wvn.a(obj);
            }
            throw th;
        }
    }

    private boolean a(wpo wpo, boolean z) {
        if (wpo == null) {
            throw new NullPointerException("promise");
        } else if (wpo.isDone()) {
            if (wpo.isCancelled()) {
                return false;
            }
            StringBuilder sb = new StringBuilder("promise already done: ");
            sb.append(wpo);
            throw new IllegalArgumentException(sb.toString());
        } else if (wpo.e() != a()) {
            throw new IllegalArgumentException(String.format("promise.channel does not match: %s (expected: %s)", new Object[]{wpo.e(), a()}));
        } else if (wpo.getClass() == wpv.class) {
            return true;
        } else {
            if (!z && (wpo instanceof wqo)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(wxt.a(wqo.class));
                sb2.append(" not allowed for this operation");
                throw new IllegalArgumentException(sb2.toString());
            } else if (!(wpo instanceof io.netty.channel.AbstractChannel.b)) {
                return true;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(wxt.a(io.netty.channel.AbstractChannel.b.class));
                sb3.append(" not allowed in a pipeline");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(Object obj, wpo wpo) {
        if (F()) {
            c(obj, wpo);
        } else {
            a(obj, wpo);
        }
    }

    /* access modifiers changed from: private */
    public void b(Throwable th) {
        if (F()) {
            try {
                t().a(this, th);
            } catch (Throwable th2) {
                if (e.b()) {
                    e.b("An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:", wxv.a(th2), th);
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

    /* access modifiers changed from: private */
    public void b(SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
        if (F()) {
            try {
                ((wpi) t()).a(this, socketAddress, socketAddress2, wpo);
            } catch (Throwable th) {
                a(th, wpo);
            }
        } else {
            a(socketAddress, socketAddress2, wpo);
        }
    }

    static void b(wor wor) {
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.v();
        } else {
            d2.execute(new Runnable(wor) {
                private /* synthetic */ wor a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.v();
                }
            });
        }
    }

    static void b(wor wor, Object obj) {
        final Object a2 = wor.i.a(wxq.a(obj, "msg"), wor);
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.f(a2);
        } else {
            d2.execute(new Runnable(wor) {
                private /* synthetic */ wor a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.f(a2);
                }
            });
        }
    }

    private void c(Object obj, wpo wpo) {
        try {
            ((wpi) t()).a(this, obj, wpo);
        } catch (Throwable th) {
            a(th, wpo);
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

    static void c(wor wor) {
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.w();
        } else {
            d2.execute(new Runnable(wor) {
                private /* synthetic */ wor a;

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
    public void c(wpo wpo) {
        if (F()) {
            try {
                ((wpi) t()).a(this, wpo);
            } catch (Throwable th) {
                a(th, wpo);
            }
        } else {
            a(wpo);
        }
    }

    private wox d(Object obj, wpo wpo) {
        if (obj == null) {
            throw new NullPointerException("msg");
        } else if (!a(wpo, true)) {
            wvn.a(obj);
            return wpo;
        } else {
            a(obj, true, wpo);
            return wpo;
        }
    }

    static void d(wor wor) {
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.x();
        } else {
            d2.execute(new Runnable(wor) {
                private /* synthetic */ wor a;

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
    public void d(wpo wpo) {
        if (F()) {
            try {
                ((wpi) t()).b(this, wpo);
            } catch (Throwable th) {
                a(th, wpo);
            }
        } else {
            b(wpo);
        }
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

    /* access modifiers changed from: private */
    public void e(Object obj) {
        if (F()) {
            try {
                ((wpc) t()).b(this, obj);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            c(obj);
        }
    }

    private void e(Object obj, wpo wpo) {
        if (F()) {
            c(obj, wpo);
            C();
            return;
        }
        d(obj, wpo);
    }

    static void e(wor wor) {
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.y();
            return;
        }
        Runnable runnable = wor.l;
        if (runnable == null) {
            runnable = new Runnable(wor) {
                private /* synthetic */ wor a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.y();
                }
            };
            wor.l = runnable;
        }
        d2.execute(runnable);
    }

    /* access modifiers changed from: private */
    public void f(Object obj) {
        if (F()) {
            try {
                ((wpc) t()).a((wpb) this, obj);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            d(obj);
        }
    }

    static void f(wor wor) {
        wwc d2 = wor.d();
        if (d2.j()) {
            wor.z();
            return;
        }
        Runnable runnable = wor.n;
        if (runnable == null) {
            runnable = new Runnable(wor) {
                private /* synthetic */ wor a;

                {
                    this.a = r1;
                }

                public final void run() {
                    this.a.z();
                }
            };
            wor.n = runnable;
        }
        d2.execute(runnable);
    }

    /* access modifiers changed from: private */
    public void u() {
        if (F()) {
            try {
                ((wpc) t()).g(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            e();
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        if (F()) {
            try {
                ((wpc) t()).h(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            f();
        }
    }

    /* access modifiers changed from: private */
    public void w() {
        if (F()) {
            try {
                ((wpc) t()).a(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            g();
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        if (F()) {
            try {
                ((wpc) t()).b(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            h();
        }
    }

    /* access modifiers changed from: private */
    public void y() {
        if (F()) {
            try {
                ((wpc) t()).i(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            j();
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        if (F()) {
            try {
                ((wpc) t()).j(this);
            } catch (Throwable th) {
                c(th);
            }
        } else {
            l();
        }
    }

    public final wot a() {
        return this.i.c;
    }

    public final wox a(Object obj) {
        return a(obj, k());
    }

    public final wox a(Object obj, wpo wpo) {
        if (obj != null) {
            try {
                if (!a(wpo, true)) {
                    wvn.a(obj);
                    return wpo;
                }
                a(obj, false, wpo);
                return wpo;
            } catch (RuntimeException e2) {
                wvn.a(obj);
                throw e2;
            }
        } else {
            throw new NullPointerException("msg");
        }
    }

    public final wox a(SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
        if (socketAddress == null) {
            throw new NullPointerException("remoteAddress");
        } else if (!a(wpo, false)) {
            return wpo;
        } else {
            final wor E = E();
            wwc d2 = E.d();
            if (d2.j()) {
                E.b(socketAddress, socketAddress2, wpo);
            } else {
                final SocketAddress socketAddress3 = socketAddress;
                final SocketAddress socketAddress4 = socketAddress2;
                final wpo wpo2 = wpo;
                AnonymousClass2 r1 = new Runnable() {
                    public final void run() {
                        E.b(socketAddress3, socketAddress4, wpo2);
                    }
                };
                a(d2, (Runnable) r1, wpo, (Object) null);
            }
            return wpo;
        }
    }

    public final wox a(SocketAddress socketAddress, wpo wpo) {
        return a(socketAddress, (SocketAddress) null, wpo);
    }

    public final wox a(final wpo wpo) {
        if (!a(wpo, false)) {
            return wpo;
        }
        final wor E = E();
        wwc d2 = E.d();
        if (!d2.j()) {
            a(d2, (Runnable) new Runnable() {
                public final void run() {
                    if (!wor.this.a().E().a) {
                        E.d(wpo);
                    } else {
                        E.c(wpo);
                    }
                }
            }, wpo, (Object) null);
        } else if (!a().E().a) {
            E.d(wpo);
        } else {
            E.c(wpo);
        }
        return wpo;
    }

    public final wpb a(Throwable th) {
        a(this.a, th);
        return this;
    }

    public final <T> wvd<T> a(wve<T> wve) {
        return a().a(wve);
    }

    public final wox b(Object obj) {
        return d(obj, k());
    }

    public final wox b(final wpo wpo) {
        if (!a(wpo, false)) {
            return wpo;
        }
        final wor E = E();
        wwc d2 = E.d();
        if (d2.j()) {
            E.d(wpo);
        } else {
            a(d2, (Runnable) new Runnable() {
                public final void run() {
                    E.d(wpo);
                }
            }, wpo, (Object) null);
        }
        return wpo;
    }

    public final wpl b() {
        return this.i;
    }

    public final wnc c() {
        return a().B().c();
    }

    public final wpb c(Object obj) {
        a(D(), obj);
        return this;
    }

    public final wpb d(Object obj) {
        b(D(), obj);
        return this;
    }

    public final wwc d() {
        wwc wwc = this.k;
        return wwc == null ? a().e() : wwc;
    }

    public final wpb e() {
        a(D());
        return this;
    }

    public final wpb f() {
        b(D());
        return this;
    }

    public final wpb g() {
        c(D());
        return this;
    }

    public final wpb h() {
        d(D());
        return this;
    }

    public final wox i() {
        return b(k());
    }

    public final wpb j() {
        e(D());
        return this;
    }

    public final wpo k() {
        return new wpv(a(), d());
    }

    public final wpb l() {
        f(D());
        return this;
    }

    public final wpb m() {
        final wor E = E();
        wwc d2 = E.d();
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

    public final wpo n() {
        return a().n();
    }

    public final wpb o() {
        final wor E = E();
        wwc d2 = E.d();
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

    public final boolean r() {
        return this.d == 3;
    }

    public final String s() {
        StringBuilder sb = new StringBuilder("'");
        sb.append(this.c);
        sb.append("' will handle the message from this point.");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wxt.a(wpb.class));
        sb.append('(');
        sb.append(this.c);
        sb.append(", ");
        sb.append(a());
        sb.append(')');
        return sb.toString();
    }
}
