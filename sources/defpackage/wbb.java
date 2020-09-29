package defpackage;

import io.netty.channel.AbstractChannel;
import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: wbb reason: default package */
public final class wbb {
    public static final wia<ByteBuffer[]> a = new wia<ByteBuffer[]>() {
        public final /* bridge */ /* synthetic */ Object a() {
            return new ByteBuffer[1024];
        }
    };
    private static final wjw i;
    private static final AtomicLongFieldUpdater<wbb> l;
    private static final AtomicIntegerFieldUpdater<wbb> n;
    private static /* synthetic */ boolean p;
    public a b;
    public a c;
    public a d;
    public int e;
    public int f;
    public long g;
    public volatile int h;
    private final wan j;
    private boolean k;
    private volatile long m;
    private volatile Runnable o;

    /* renamed from: wbb$a */
    public static final class a {
        private static final Recycler<a> k = new Recycler<a>() {
            public final /* synthetic */ Object a(b bVar) {
                return new a(bVar, 0);
            }
        };
        public a a;
        public Object b;
        public ByteBuffer[] c;
        public ByteBuffer d;
        public wbi e;
        public long f;
        public long g;
        public int h;
        public int i;
        public boolean j;
        private final b<a> l;

        /* synthetic */ a(b bVar, byte b2) {
            this(bVar);
        }

        private a(b<a> bVar) {
            this.i = -1;
            this.l = bVar;
        }

        public static a a(Object obj, int i2, long j2, wbi wbi) {
            a aVar = (a) k.a();
            aVar.b = obj;
            aVar.h = i2;
            aVar.g = j2;
            aVar.e = wbi;
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.a = null;
            this.c = null;
            this.d = null;
            this.b = null;
            this.e = null;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = -1;
            this.j = false;
            this.l.a(this);
        }

        /* access modifiers changed from: 0000 */
        public final a b() {
            a aVar = this.a;
            a();
            return aVar;
        }
    }

    static {
        Class<wbb> cls = wbb.class;
        p = !cls.desiredAssertionStatus();
        i = wjx.a(cls);
        AtomicIntegerFieldUpdater<wbb> b2 = PlatformDependent.b(cls, "unwritable");
        if (b2 == null) {
            b2 = AtomicIntegerFieldUpdater.newUpdater(cls, "h");
        }
        n = b2;
        AtomicLongFieldUpdater<wbb> c2 = PlatformDependent.c(cls, "totalPendingSize");
        if (c2 == null) {
            c2 = AtomicLongFieldUpdater.newUpdater(cls, "m");
        }
        l = c2;
    }

    public wbb(AbstractChannel abstractChannel) {
        this.j = abstractChannel;
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j2) {
        a(j2, true);
    }

    public void a(long j2, boolean z) {
        if (j2 != 0 && l.addAndGet(this, j2) > ((long) this.j.B().g())) {
            b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(long j2) {
        a(j2, true, true);
    }

    public void a(long j2, boolean z, boolean z2) {
        if (j2 != 0) {
            long addAndGet = l.addAndGet(this, -j2);
            if (z2 && addAndGet < ((long) this.j.B().h())) {
                a(z);
            }
        }
    }

    public static long a(Object obj) {
        if (obj instanceof vyv) {
            return (long) ((vyv) obj).g();
        }
        if (obj instanceof wbw) {
            return ((wbw) obj).b();
        }
        if (obj instanceof vyx) {
            return (long) ((vyx) obj).a().g();
        }
        return -1;
    }

    public final Object a() {
        a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    public final void c(long j2) {
        a aVar = this.b;
        if (!p && aVar == null) {
            throw new AssertionError();
        } else if (aVar.e instanceof wbh) {
            aVar.f += j2;
        }
    }

    public final boolean b() {
        a aVar = this.b;
        if (aVar == null) {
            d();
            return false;
        }
        Object obj = aVar.b;
        wbi wbi = aVar.e;
        int i2 = aVar.h;
        a(aVar);
        if (!aVar.j) {
            whh.b(obj);
            if (!(wbi instanceof wci)) {
                wjm.a((wim<? super V>) wbi, null, i);
            }
            a((long) i2, false, true);
        }
        aVar.a();
        return true;
    }

    private boolean b(Throwable th, boolean z) {
        a aVar = this.b;
        if (aVar == null) {
            d();
            return false;
        }
        Object obj = aVar.b;
        wbi wbi = aVar.e;
        int i2 = aVar.h;
        a(aVar);
        if (!aVar.j) {
            whh.b(obj);
            a(wbi, th);
            a((long) i2, false, z);
        }
        aVar.a();
        return true;
    }

    private void a(a aVar) {
        int i2 = this.e - 1;
        this.e = i2;
        if (i2 == 0) {
            this.b = null;
            if (aVar == this.d) {
                this.d = null;
                this.c = null;
            }
        } else {
            this.b = aVar.a;
        }
    }

    public final void d(long j2) {
        while (true) {
            Object a2 = a();
            if (a2 instanceof vyv) {
                vyv vyv = (vyv) a2;
                int c2 = vyv.c();
                long d2 = (long) (vyv.d() - c2);
                if (d2 <= j2) {
                    if (j2 != 0) {
                        c(d2);
                        j2 -= d2;
                    }
                    b();
                } else if (j2 != 0) {
                    vyv.a(c2 + ((int) j2));
                    c(j2);
                }
            } else if (!p && j2 != 0) {
                throw new AssertionError();
            }
        }
        d();
    }

    private void d() {
        int i2 = this.f;
        if (i2 > 0) {
            this.f = 0;
            Arrays.fill((Object[]) a.a(wjc.b()), 0, i2, null);
        }
    }

    public static int a(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2, int i2) {
        int length = byteBufferArr.length;
        int i3 = 0;
        while (i3 < length) {
            ByteBuffer byteBuffer = byteBufferArr[i3];
            if (byteBuffer == null) {
                break;
            }
            int i4 = i2 + 1;
            byteBufferArr2[i2] = byteBuffer;
            i3++;
            i2 = i4;
        }
        return i2;
    }

    private void a(boolean z) {
        int i2;
        int i3;
        do {
            i2 = this.h;
            i3 = i2 & -2;
        } while (!n.compareAndSet(this, i2, i3));
        if (i2 != 0 && i3 == 0) {
            c(z);
        }
    }

    private void b(boolean z) {
        int i2;
        int i3;
        do {
            i2 = this.h;
            i3 = i2 | 1;
        } while (!n.compareAndSet(this, i2, i3));
        if (i2 == 0 && i3 != 0) {
            c(z);
        }
    }

    private void c(boolean z) {
        final wbf c2 = this.j.c();
        if (z) {
            Runnable runnable = this.o;
            if (runnable == null) {
                runnable = new Runnable() {
                    public final void run() {
                        c2.d();
                    }
                };
                this.o = runnable;
            }
            this.j.e().execute(runnable);
            return;
        }
        c2.d();
    }

    public final boolean c() {
        return this.e == 0;
    }

    public final void a(Throwable th, boolean z) {
        if (!this.k) {
            try {
                this.k = true;
                do {
                } while (b(th, z));
            } finally {
                this.k = false;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(final ClosedChannelException closedChannelException) {
        if (this.k) {
            this.j.e().execute(new Runnable() {
                public final void run() {
                    wbb.this.a(closedChannelException);
                }
            });
            return;
        }
        this.k = true;
        if (this.j.C()) {
            throw new IllegalStateException("close() must be invoked after the channel is closed.");
        } else if (c()) {
            try {
                for (a aVar = this.c; aVar != null; aVar = aVar.b()) {
                    l.addAndGet(this, (long) (-aVar.h));
                    if (!aVar.j) {
                        whh.b(aVar.b);
                        a(aVar.e, (Throwable) closedChannelException);
                    }
                }
                this.k = false;
                d();
            } catch (Throwable th) {
                this.k = false;
                throw th;
            }
        } else {
            throw new IllegalStateException("close() must be invoked after all flushed writes are handled.");
        }
    }

    private static void a(wbi wbi, Throwable th) {
        if (!(wbi instanceof wci)) {
            wjm.a((wim<?>) wbi, th, i);
        }
    }
}
