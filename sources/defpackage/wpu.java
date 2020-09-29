package defpackage;

import io.netty.channel.ChannelPipelineException;
import io.netty.util.ResourceLeakDetector;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: wpu reason: default package */
public class wpu implements wpl {
    static final wyc a;
    /* access modifiers changed from: private */
    public static final String e = a(a.class);
    /* access modifiers changed from: private */
    public static final String f = a(e.class);
    private static final wwg<Map<Class<?>, String>> g = new wwg<Map<Class<?>, String>>() {
        public final /* synthetic */ Object a() {
            return new WeakHashMap();
        }
    };
    private static /* synthetic */ boolean p;
    public final wor b;
    /* access modifiers changed from: 0000 */
    public final wot c;
    public final wqo d;
    private wor h;
    private final wox i;
    private final boolean j = ResourceLeakDetector.a();
    private Map<wwe, wwc> k;
    private defpackage.wqe.a l;
    private boolean m = true;
    private c n;
    private boolean o;

    /* renamed from: wpu$a */
    final class a extends wor implements wpc, wpi {
        private final defpackage.wot.a e;

        a(wpu wpu) {
            super(wpu, null, wpu.e, false, true);
            this.e = wpu.c.l();
            p();
        }

        private void u() {
            if (wpu.this.c.B().e()) {
                wpu.this.c.j();
            }
        }

        public final void a(wpb wpb) {
            wpb.g();
            u();
        }

        public final void a(wpb wpb, Object obj) {
            wpb.d(obj);
        }

        public final void a(wpb wpb, Object obj, wpo wpo) {
            this.e.a(obj, wpo);
        }

        public final void a(wpb wpb, Throwable th) {
            wpb.a(th);
        }

        public final void a(wpb wpb, SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
            this.e.a(socketAddress, socketAddress2, wpo);
        }

        public final void a(wpb wpb, wpo wpo) {
            this.e.a(wpo);
        }

        public final void b(wpb wpb) {
            wpb.h();
        }

        public final void b(wpb wpb, Object obj) {
            wpb.c(obj);
        }

        public final void b(wpb wpb, wpo wpo) {
            this.e.b(wpo);
        }

        public final void c(wpb wpb) {
            this.e.f();
        }

        public final void d(wpb wpb) {
            this.e.g();
        }

        public final void e(wpb wpb) {
        }

        public final void f(wpb wpb) {
        }

        public final void g(wpb wpb) {
            wpu.this.f();
            wpb.e();
        }

        public final void h(wpb wpb) {
            wpb.f();
            if (!wpu.this.c.C()) {
                wpu.this.m();
            }
        }

        public final void i(wpb wpb) {
            wpb.j();
            u();
        }

        public final void j(wpb wpb) {
            wpb.l();
        }

        public final woz t() {
            return this;
        }
    }

    /* renamed from: wpu$b */
    final class b extends c {
        b(wor wor) {
            super(wor);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            wwc d = this.a.d();
            if (d.j()) {
                wpu.this.d(this.a);
                return;
            }
            try {
                d.execute(this);
            } catch (RejectedExecutionException e) {
                if (wpu.a.d()) {
                    wpu.a.b("Can't invoke handlerAdded() as the EventExecutor {} rejected it, removing handler {}.", d, this.a.c, e);
                }
                wpu.c(this.a);
                this.a.d = 3;
            }
        }

        public final void run() {
            wpu.this.d(this.a);
        }
    }

    /* renamed from: wpu$c */
    static abstract class c implements Runnable {
        final wor a;
        c b;

        c(wor wor) {
            this.a = wor;
        }

        /* access modifiers changed from: 0000 */
        public abstract void a();
    }

    /* renamed from: wpu$d */
    final class d extends c {
        d(wor wor) {
            super(wor);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            wwc d = this.a.d();
            if (d.j()) {
                wpu.this.e(this.a);
                return;
            }
            try {
                d.execute(this);
            } catch (RejectedExecutionException e) {
                if (wpu.a.d()) {
                    wpu.a.b("Can't invoke handlerRemoved() as the EventExecutor {} rejected it, removing handler {}.", d, this.a.c, e);
                }
                this.a.d = 3;
            }
        }

        public final void run() {
            wpu.this.e(this.a);
        }
    }

    /* renamed from: wpu$e */
    final class e extends wor implements wpc {
        e(wpu wpu) {
            super(wpu, null, wpu.f, true, false);
            p();
        }

        public final void a(wpb wpb) {
        }

        public final void a(wpb wpb, Object obj) {
            wpu.e(obj);
        }

        public final void a(wpb wpb, Throwable th) {
            wpu.b(th);
        }

        public final void b(wpb wpb) {
        }

        public final void b(wpb wpb, Object obj) {
            wvn.a(obj);
        }

        public final void e(wpb wpb) {
        }

        public final void f(wpb wpb) {
        }

        public final void g(wpb wpb) {
        }

        public final void h(wpb wpb) {
        }

        public final void i(wpb wpb) {
        }

        public final void j(wpb wpb) {
        }

        public final woz t() {
            return this;
        }
    }

    static {
        Class<wpu> cls = wpu.class;
        p = !cls.desiredAssertionStatus();
        a = wyd.a(cls);
    }

    public wpu(wot wot) {
        this.c = (wot) wxq.a(wot, "channel");
        this.i = new wqn(wot, null);
        this.d = new wqo(wot, true);
        this.b = new e(this);
        this.h = new a(this);
        wor wor = this.h;
        wor wor2 = this.b;
        wor.a = wor2;
        wor2.b = wor;
    }

    private static String a(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        sb.append(wxt.a(cls));
        sb.append("#0");
        return sb.toString();
    }

    private String a(String str, woz woz) {
        if (str == null) {
            return c(woz);
        }
        a(str);
        return str;
    }

    private wor a(wwe wwe, String str, woz woz) {
        wwc wwc;
        if (wwe == null) {
            wwc = null;
        } else {
            Boolean bool = (Boolean) this.c.B().a(wpg.t);
            if (bool == null || bool.booleanValue()) {
                Map map = this.k;
                if (map == null) {
                    map = new IdentityHashMap(4);
                    this.k = map;
                }
                wwc wwc2 = (wwc) map.get(wwe);
                if (wwc2 == null) {
                    wwc2 = wwe.b();
                    map.put(wwe, wwc2);
                }
                wwc = wwc2;
            } else {
                wwc = wwe.b();
            }
        }
        return new wpt(this, wwc, str, woz);
    }

    private void a(String str) {
        if (b(str) != null) {
            StringBuilder sb = new StringBuilder("Duplicate handler name: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public void a(Thread thread, final wor wor, boolean z) {
        wor wor2 = this.h;
        while (wor != wor2) {
            wwc d2 = wor.d();
            if (z || d2.a(thread)) {
                synchronized (this) {
                    c(wor);
                }
                e(wor);
                wor = wor.b;
                z = false;
            } else {
                d2.execute(new Runnable() {
                    public final void run() {
                        wpu.this.a(Thread.currentThread(), wor, true);
                    }
                });
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(final wor wor, boolean z) {
        Thread currentThread = Thread.currentThread();
        wor wor2 = this.b;
        while (wor != wor2) {
            wwc d2 = wor.d();
            if (z || d2.a(currentThread)) {
                wor = wor.a;
                z = false;
            } else {
                d2.execute(new Runnable() {
                    public final void run() {
                        wpu.this.a(wor, true);
                    }
                });
                return;
            }
        }
        a(currentThread, wor2.b, z);
    }

    private wor b(String str) {
        for (wor wor = this.h.a; wor != this.b; wor = wor.a) {
            if (wor.c.equals(str)) {
                return wor;
            }
        }
        return null;
    }

    private wor b(final wor wor) {
        if (p || !(wor == this.h || wor == this.b)) {
            synchronized (this) {
                c(wor);
                if (!this.o) {
                    b(wor, false);
                    return wor;
                }
                wwc d2 = wor.d();
                if (!d2.j()) {
                    d2.execute(new Runnable() {
                        public final void run() {
                            wpu.this.e(wor);
                        }
                    });
                    return wor;
                }
                e(wor);
                return wor;
            }
        }
        throw new AssertionError();
    }

    private wpl b(wwe wwe, String str, woz woz) {
        synchronized (this) {
            d(woz);
            final wor a2 = a(wwe, a((String) null, woz), woz);
            wor wor = this.h.a;
            a2.b = this.h;
            a2.a = wor;
            this.h.a = a2;
            wor.b = a2;
            if (!this.o) {
                a2.q();
                b(a2, true);
                return this;
            }
            wwc d2 = a2.d();
            if (!d2.j()) {
                a2.q();
                d2.execute(new Runnable() {
                    public final void run() {
                        wpu.this.d(a2);
                    }
                });
                return this;
            }
            d(a2);
            return this;
        }
    }

    protected static void b(Throwable th) {
        try {
            a.d("An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.", th);
        } finally {
            wvn.a(th);
        }
    }

    private void b(wor wor, boolean z) {
        if (p || !this.o) {
            c bVar = z ? new b(wor) : new d(wor);
            c cVar = this.n;
            if (cVar == null) {
                this.n = bVar;
                return;
            }
            while (cVar.b != null) {
                cVar = cVar.b;
            }
            cVar.b = bVar;
            return;
        }
        throw new AssertionError();
    }

    private String c(woz woz) {
        Map map = (Map) g.a(wxi.b());
        Class cls = woz.getClass();
        String str = (String) map.get(cls);
        if (str == null) {
            str = a(cls);
            map.put(cls, str);
        }
        if (b(str) != null) {
            int i2 = 1;
            String substring = str.substring(0, str.length() - 1);
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append(i2);
                str = sb.toString();
                if (b(str) == null) {
                    break;
                }
                i2++;
            }
        }
        return str;
    }

    private wpl c(wwe wwe, String str, woz woz) {
        synchronized (this) {
            d(woz);
            final wor a2 = a(wwe, a((String) null, woz), woz);
            wor wor = this.b.b;
            a2.b = wor;
            a2.a = this.b;
            wor.a = a2;
            this.b.b = a2;
            if (!this.o) {
                a2.q();
                b(a2, true);
                return this;
            }
            wwc d2 = a2.d();
            if (!d2.j()) {
                a2.q();
                d2.execute(new Runnable() {
                    public final void run() {
                        wpu.this.d(a2);
                    }
                });
                return this;
            }
            d(a2);
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static void c(wor wor) {
        wor wor2 = wor.b;
        wor wor3 = wor.a;
        wor2.a = wor3;
        wor3.b = wor2;
    }

    /* access modifiers changed from: private */
    public void d(wor wor) {
        boolean z;
        try {
            wor.t().e(wor);
            wor.p();
            return;
        } catch (Throwable th) {
            wor.d = 3;
            throw th;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(wor.t().getClass().getName());
            sb.append(".handlerAdded() has thrown an exception; removed.");
            a((Throwable) new ChannelPipelineException(sb.toString(), th));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wor.t().getClass().getName());
        sb2.append(".handlerAdded() has thrown an exception; also failed to remove.");
        a((Throwable) new ChannelPipelineException(sb2.toString(), th));
    }

    private static void d(woz woz) {
        if (woz instanceof wpa) {
            wpa wpa = (wpa) woz;
            if (wpa.a() || !wpa.a) {
                wpa.a = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(wpa.getClass().getName());
            sb.append(" is not a @Sharable handler, so can't be added or removed multiple times.");
            throw new ChannelPipelineException(sb.toString());
        }
    }

    protected static void e(Object obj) {
        try {
            a.b("Discarded inbound message {} that reached at the tail of the pipeline. Please check your pipeline configuration.", obj);
        } finally {
            wvn.a(obj);
        }
    }

    /* access modifiers changed from: private */
    public void e(wor wor) {
        try {
            wor.t().f(wor);
            wor.d = 3;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(wor.t().getClass().getName());
            sb.append(".handlerRemoved() has thrown an exception.");
            a((Throwable) new ChannelPipelineException(sb.toString(), th));
        }
    }

    /* access modifiers changed from: private */
    public synchronized void m() {
        a(this.h.a, false);
    }

    private void o() {
        c cVar;
        synchronized (this) {
            if (!p) {
                if (this.o) {
                    throw new AssertionError();
                }
            }
            this.o = true;
            this.n = null;
        }
        for (cVar = this.n; cVar != null; cVar = cVar.b) {
            cVar.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final Object a(Object obj, wor wor) {
        return this.j ? wvn.a(obj, wor) : obj;
    }

    public final wox a(Object obj) {
        return this.b.a(obj);
    }

    public final wox a(Object obj, wpo wpo) {
        return this.b.a(obj, wpo);
    }

    public final wox a(SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
        return this.b.a(socketAddress, socketAddress2, wpo);
    }

    public final wox a(SocketAddress socketAddress, wpo wpo) {
        return this.b.a(socketAddress, (SocketAddress) null, wpo);
    }

    public final wox a(wpo wpo) {
        return this.b.a(wpo);
    }

    public final wpl a() {
        wor.a(this.h);
        return this;
    }

    public final wpl a(Throwable th) {
        wor.a(this.h, th);
        return this;
    }

    public final wpl a(woz woz) {
        wor wor = (wor) b(woz);
        if (wor != null) {
            b(wor);
            return this;
        }
        throw new NoSuchElementException(woz.getClass().getName());
    }

    public final wpl a(woz... wozArr) {
        if (wozArr != null) {
            if (!(wozArr.length == 0 || wozArr[0] == null)) {
                int i2 = 1;
                while (i2 < wozArr.length && wozArr[i2] != null) {
                    i2++;
                }
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    b(null, null, wozArr[i3]);
                }
            }
            return this;
        }
        throw new NullPointerException("handlers");
    }

    public final wox b(Object obj) {
        return this.b.b(obj);
    }

    public final wox b(wpo wpo) {
        return this.b.b(wpo);
    }

    public final wpb b(woz woz) {
        if (woz != null) {
            for (wor wor = this.h.a; wor != null; wor = wor.a) {
                if (wor.t() == woz) {
                    return wor;
                }
            }
            return null;
        }
        throw new NullPointerException("handler");
    }

    public final wpl b() {
        wor.c(this.h);
        return this;
    }

    public final wpl b(woz... wozArr) {
        if (wozArr != null) {
            for (woz woz : wozArr) {
                if (woz == null) {
                    break;
                }
                c(null, null, woz);
            }
            return this;
        }
        throw new NullPointerException("handlers");
    }

    public final wpl c() {
        wor.e(this.h);
        return this;
    }

    public final wpl c(Object obj) {
        wor.a(this.h, obj);
        return this;
    }

    public final wpl d() {
        wor.f(this.h);
        return this;
    }

    public final wpl d(Object obj) {
        wor.b(this.h, obj);
        return this;
    }

    public final defpackage.wqe.a e() {
        if (this.l == null) {
            this.l = this.c.B().i().a();
        }
        return this.l;
    }

    public final void f() {
        if (!p && !this.c.e().j()) {
            throw new AssertionError();
        } else if (this.m) {
            this.m = false;
            o();
        }
    }

    public final wpl g() {
        wor.b(this.h);
        return this;
    }

    public final wpl h() {
        wor.d(this.h);
        return this;
    }

    public final wox i() {
        return this.b.i();
    }

    public final Iterator<Entry<String, woz>> iterator() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (wor wor = this.h.a; wor != this.b; wor = wor.a) {
            linkedHashMap.put(wor.c, wor.t());
        }
        return linkedHashMap.entrySet().iterator();
    }

    public final wpo k() {
        return new wpv(this.c);
    }

    public final wpo n() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wxt.a((Object) this));
        sb.append('{');
        wor wor = this.h.a;
        while (wor != this.b) {
            sb.append('(');
            sb.append(wor.c);
            sb.append(" = ");
            sb.append(wor.t().getClass().getName());
            sb.append(')');
            wor = wor.a;
            if (wor == this.b) {
                break;
            }
            sb.append(", ");
        }
        sb.append('}');
        return sb.toString();
    }
}
