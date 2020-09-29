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

/* renamed from: wbo reason: default package */
public class wbo implements wbf {
    static final wjw a;
    /* access modifiers changed from: private */
    public static final String e = a(a.class);
    /* access modifiers changed from: private */
    public static final String f = a(e.class);
    private static final wia<Map<Class<?>, String>> g = new wia<Map<Class<?>, String>>() {
        public final /* synthetic */ Object a() {
            return new WeakHashMap();
        }
    };
    private static /* synthetic */ boolean p;
    public final wal b;
    /* access modifiers changed from: 0000 */
    public final wan c;
    public final wci d;
    private wal h;
    private final war i;
    private final boolean j = ResourceLeakDetector.a();
    private Map<why, whw> k;
    private defpackage.wby.a l;
    private boolean m = true;
    private c n;
    private boolean o;

    /* renamed from: wbo$a */
    final class a extends wal implements waw, wbc {
        private final defpackage.wan.a e;

        public final void e(wav wav) {
        }

        public final void f(wav wav) {
        }

        public final wat t() {
            return this;
        }

        a(wbo wbo) {
            super(wbo, null, wbo.e, false, true);
            this.e = wbo.c.l();
            p();
        }

        public final void a(wav wav, SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
            this.e.a(socketAddress, socketAddress2, wbi);
        }

        public final void a(wav wav, wbi wbi) {
            this.e.a(wbi);
        }

        public final void b(wav wav, wbi wbi) {
            this.e.b(wbi);
        }

        public final void c(wav wav) {
            this.e.f();
        }

        public final void a(wav wav, Object obj, wbi wbi) {
            this.e.a(obj, wbi);
        }

        public final void d(wav wav) {
            this.e.g();
        }

        public final void a(wav wav, Throwable th) {
            wav.a(th);
        }

        public final void g(wav wav) {
            wbo.this.f();
            wav.e();
        }

        public final void h(wav wav) {
            wav.f();
            if (!wbo.this.c.C()) {
                wbo.this.m();
            }
        }

        public final void a(wav wav) {
            wav.g();
            u();
        }

        public final void b(wav wav) {
            wav.h();
        }

        public final void a(wav wav, Object obj) {
            wav.d(obj);
        }

        public final void i(wav wav) {
            wav.j();
            u();
        }

        private void u() {
            if (wbo.this.c.B().e()) {
                wbo.this.c.j();
            }
        }

        public final void b(wav wav, Object obj) {
            wav.c(obj);
        }

        public final void j(wav wav) {
            wav.l();
        }
    }

    /* renamed from: wbo$b */
    final class b extends c {
        b(wal wal) {
            super(wal);
        }

        public final void run() {
            wbo.this.d(this.a);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            whw d = this.a.d();
            if (d.j()) {
                wbo.this.d(this.a);
                return;
            }
            try {
                d.execute(this);
            } catch (RejectedExecutionException e) {
                if (wbo.a.d()) {
                    wbo.a.b("Can't invoke handlerAdded() as the EventExecutor {} rejected it, removing handler {}.", d, this.a.c, e);
                }
                wbo.c(this.a);
                this.a.d = 3;
            }
        }
    }

    /* renamed from: wbo$c */
    static abstract class c implements Runnable {
        final wal a;
        c b;

        /* access modifiers changed from: 0000 */
        public abstract void a();

        c(wal wal) {
            this.a = wal;
        }
    }

    /* renamed from: wbo$d */
    final class d extends c {
        d(wal wal) {
            super(wal);
        }

        public final void run() {
            wbo.this.e(this.a);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            whw d = this.a.d();
            if (d.j()) {
                wbo.this.e(this.a);
                return;
            }
            try {
                d.execute(this);
            } catch (RejectedExecutionException e) {
                if (wbo.a.d()) {
                    wbo.a.b("Can't invoke handlerRemoved() as the EventExecutor {} rejected it, removing handler {}.", d, this.a.c, e);
                }
                this.a.d = 3;
            }
        }
    }

    /* renamed from: wbo$e */
    final class e extends wal implements waw {
        public final void a(wav wav) {
        }

        public final void b(wav wav) {
        }

        public final void e(wav wav) {
        }

        public final void f(wav wav) {
        }

        public final void g(wav wav) {
        }

        public final void h(wav wav) {
        }

        public final void i(wav wav) {
        }

        public final void j(wav wav) {
        }

        public final wat t() {
            return this;
        }

        e(wbo wbo) {
            super(wbo, null, wbo.f, true, false);
            p();
        }

        public final void b(wav wav, Object obj) {
            whh.a(obj);
        }

        public final void a(wav wav, Throwable th) {
            wbo.b(th);
        }

        public final void a(wav wav, Object obj) {
            wbo.e(obj);
        }
    }

    static {
        Class<wbo> cls = wbo.class;
        p = !cls.desiredAssertionStatus();
        a = wjx.a(cls);
    }

    public wbo(wan wan) {
        this.c = (wan) wjk.a(wan, "channel");
        this.i = new wch(wan, null);
        this.d = new wci(wan, true);
        this.b = new e(this);
        this.h = new a(this);
        wal wal = this.h;
        wal wal2 = this.b;
        wal.a = wal2;
        wal2.b = wal;
    }

    public final defpackage.wby.a e() {
        if (this.l == null) {
            this.l = this.c.B().i().a();
        }
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public final Object a(Object obj, wal wal) {
        return this.j ? whh.a(obj, wal) : obj;
    }

    private wal a(why why, String str, wat wat) {
        whw whw;
        if (why == null) {
            whw = null;
        } else {
            Boolean bool = (Boolean) this.c.B().a(wba.t);
            if (bool == null || bool.booleanValue()) {
                Map map = this.k;
                if (map == null) {
                    map = new IdentityHashMap(4);
                    this.k = map;
                }
                whw whw2 = (whw) map.get(why);
                if (whw2 == null) {
                    whw2 = why.b();
                    map.put(why, whw2);
                }
                whw = whw2;
            } else {
                whw = why.b();
            }
        }
        return new wbn(this, whw, str, wat);
    }

    private wbf b(why why, String str, wat wat) {
        synchronized (this) {
            d(wat);
            final wal a2 = a(why, a((String) null, wat), wat);
            wal wal = this.h.a;
            a2.b = this.h;
            a2.a = wal;
            this.h.a = a2;
            wal.b = a2;
            if (!this.o) {
                a2.q();
                b(a2, true);
                return this;
            }
            whw d2 = a2.d();
            if (!d2.j()) {
                a2.q();
                d2.execute(new Runnable() {
                    public final void run() {
                        wbo.this.d(a2);
                    }
                });
                return this;
            }
            d(a2);
            return this;
        }
    }

    private wbf c(why why, String str, wat wat) {
        synchronized (this) {
            d(wat);
            final wal a2 = a(why, a((String) null, wat), wat);
            wal wal = this.b.b;
            a2.b = wal;
            a2.a = this.b;
            wal.a = a2;
            this.b.b = a2;
            if (!this.o) {
                a2.q();
                b(a2, true);
                return this;
            }
            whw d2 = a2.d();
            if (!d2.j()) {
                a2.q();
                d2.execute(new Runnable() {
                    public final void run() {
                        wbo.this.d(a2);
                    }
                });
                return this;
            }
            d(a2);
            return this;
        }
    }

    private String a(String str, wat wat) {
        if (str == null) {
            return c(wat);
        }
        a(str);
        return str;
    }

    private String c(wat wat) {
        Map map = (Map) g.a(wjc.b());
        Class cls = wat.getClass();
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

    private static String a(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a(cls));
        sb.append("#0");
        return sb.toString();
    }

    private wal b(final wal wal) {
        if (p || !(wal == this.h || wal == this.b)) {
            synchronized (this) {
                c(wal);
                if (!this.o) {
                    b(wal, false);
                    return wal;
                }
                whw d2 = wal.d();
                if (!d2.j()) {
                    d2.execute(new Runnable() {
                        public final void run() {
                            wbo.this.e(wal);
                        }
                    });
                    return wal;
                }
                e(wal);
                return wal;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public static void c(wal wal) {
        wal wal2 = wal.b;
        wal wal3 = wal.a;
        wal2.a = wal3;
        wal3.b = wal2;
    }

    private static void d(wat wat) {
        if (wat instanceof wau) {
            wau wau = (wau) wat;
            if (wau.a() || !wau.a) {
                wau.a = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(wau.getClass().getName());
            sb.append(" is not a @Sharable handler, so can't be added or removed multiple times.");
            throw new ChannelPipelineException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public void d(wal wal) {
        boolean z;
        try {
            wal.t().e(wal);
            wal.p();
            return;
        } catch (Throwable th) {
            wal.d = 3;
            throw th;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(wal.t().getClass().getName());
            sb.append(".handlerAdded() has thrown an exception; removed.");
            a((Throwable) new ChannelPipelineException(sb.toString(), th));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wal.t().getClass().getName());
        sb2.append(".handlerAdded() has thrown an exception; also failed to remove.");
        a((Throwable) new ChannelPipelineException(sb2.toString(), th));
    }

    /* access modifiers changed from: private */
    public void e(wal wal) {
        try {
            wal.t().f(wal);
            wal.d = 3;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(wal.t().getClass().getName());
            sb.append(".handlerRemoved() has thrown an exception.");
            a((Throwable) new ChannelPipelineException(sb.toString(), th));
        }
    }

    public final void f() {
        if (!p && !this.c.e().j()) {
            throw new AssertionError();
        } else if (this.m) {
            this.m = false;
            o();
        }
    }

    public final wav b(wat wat) {
        if (wat != null) {
            for (wal wal = this.h.a; wal != null; wal = wal.a) {
                if (wal.t() == wat) {
                    return wal;
                }
            }
            return null;
        }
        throw new NullPointerException("handler");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a((Object) this));
        sb.append('{');
        wal wal = this.h.a;
        while (wal != this.b) {
            sb.append('(');
            sb.append(wal.c);
            sb.append(" = ");
            sb.append(wal.t().getClass().getName());
            sb.append(')');
            wal = wal.a;
            if (wal == this.b) {
                break;
            }
            sb.append(", ");
        }
        sb.append('}');
        return sb.toString();
    }

    public final wbf a() {
        wal.a(this.h);
        return this;
    }

    public final wbf g() {
        wal.b(this.h);
        return this;
    }

    /* access modifiers changed from: private */
    public synchronized void m() {
        a(this.h.a, false);
    }

    /* access modifiers changed from: private */
    public void a(final wal wal, boolean z) {
        Thread currentThread = Thread.currentThread();
        wal wal2 = this.b;
        while (wal != wal2) {
            whw d2 = wal.d();
            if (z || d2.a(currentThread)) {
                wal = wal.a;
                z = false;
            } else {
                d2.execute(new Runnable() {
                    public final void run() {
                        wbo.this.a(wal, true);
                    }
                });
                return;
            }
        }
        a(currentThread, wal2.b, z);
    }

    /* access modifiers changed from: private */
    public void a(Thread thread, final wal wal, boolean z) {
        wal wal2 = this.h;
        while (wal != wal2) {
            whw d2 = wal.d();
            if (z || d2.a(thread)) {
                synchronized (this) {
                    c(wal);
                }
                e(wal);
                wal = wal.b;
                z = false;
            } else {
                d2.execute(new Runnable() {
                    public final void run() {
                        wbo.this.a(Thread.currentThread(), wal, true);
                    }
                });
                return;
            }
        }
    }

    public final wbf b() {
        wal.c(this.h);
        return this;
    }

    public final wbf h() {
        wal.d(this.h);
        return this;
    }

    public final wbf a(Throwable th) {
        wal.a(this.h, th);
        return this;
    }

    public final wbf c(Object obj) {
        wal.a(this.h, obj);
        return this;
    }

    public final wbf d(Object obj) {
        wal.b(this.h, obj);
        return this;
    }

    public final wbf c() {
        wal.e(this.h);
        return this;
    }

    public final wbf d() {
        wal.f(this.h);
        return this;
    }

    public final war i() {
        return this.b.i();
    }

    public final war a(SocketAddress socketAddress, wbi wbi) {
        return this.b.a(socketAddress, (SocketAddress) null, wbi);
    }

    public final war a(SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
        return this.b.a(socketAddress, socketAddress2, wbi);
    }

    public final war a(wbi wbi) {
        return this.b.a(wbi);
    }

    public final war b(wbi wbi) {
        return this.b.b(wbi);
    }

    public final war a(Object obj) {
        return this.b.a(obj);
    }

    public final war a(Object obj, wbi wbi) {
        return this.b.a(obj, wbi);
    }

    public final war b(Object obj) {
        return this.b.b(obj);
    }

    public final wbi k() {
        return new wbp(this.c);
    }

    public final wbi n() {
        return this.d;
    }

    private void a(String str) {
        if (b(str) != null) {
            StringBuilder sb = new StringBuilder("Duplicate handler name: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private wal b(String str) {
        for (wal wal = this.h.a; wal != this.b; wal = wal.a) {
            if (wal.c.equals(str)) {
                return wal;
            }
        }
        return null;
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

    private void b(wal wal, boolean z) {
        if (p || !this.o) {
            c bVar = z ? new b(wal) : new d(wal);
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

    protected static void b(Throwable th) {
        try {
            a.d("An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.", th);
        } finally {
            whh.a(th);
        }
    }

    protected static void e(Object obj) {
        try {
            a.b("Discarded inbound message {} that reached at the tail of the pipeline. Please check your pipeline configuration.", obj);
        } finally {
            whh.a(obj);
        }
    }

    public final wbf a(wat... watArr) {
        if (watArr != null) {
            if (!(watArr.length == 0 || watArr[0] == null)) {
                int i2 = 1;
                while (i2 < watArr.length && watArr[i2] != null) {
                    i2++;
                }
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    b(null, null, watArr[i3]);
                }
            }
            return this;
        }
        throw new NullPointerException("handlers");
    }

    public final wbf b(wat... watArr) {
        if (watArr != null) {
            for (wat wat : watArr) {
                if (wat == null) {
                    break;
                }
                c(null, null, wat);
            }
            return this;
        }
        throw new NullPointerException("handlers");
    }

    public final wbf a(wat wat) {
        wal wal = (wal) b(wat);
        if (wal != null) {
            b(wal);
            return this;
        }
        throw new NoSuchElementException(wat.getClass().getName());
    }

    public final Iterator<Entry<String, wat>> iterator() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (wal wal = this.h.a; wal != this.b; wal = wal.a) {
            linkedHashMap.put(wal.c, wal.t());
        }
        return linkedHashMap.entrySet().iterator();
    }
}
