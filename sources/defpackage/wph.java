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

/* renamed from: wph reason: default package */
public final class wph {
    public static final wwg<ByteBuffer[]> a = new wwg<ByteBuffer[]>() {
        public final /* bridge */ /* synthetic */ Object a() {
            return new ByteBuffer[1024];
        }
    };
    private static final wyc i;
    private static final AtomicLongFieldUpdater<wph> l;
    private static final AtomicIntegerFieldUpdater<wph> n;
    private static /* synthetic */ boolean p;
    public a b;
    public a c;
    public a d;
    public int e;
    public int f;
    public long g;
    public volatile int h;
    private final wot j;
    private boolean k;
    private volatile long m;
    private volatile Runnable o;

    /* renamed from: wph$a */
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
        public wpo e;
        public long f;
        public long g;
        public int h;
        public int i;
        public boolean j;
        private final b<a> l;

        private a(b<a> bVar) {
            this.i = -1;
            this.l = bVar;
        }

        /* synthetic */ a(b bVar, byte b2) {
            this(bVar);
        }

        public static a a(Object obj, int i2, long j2, wpo wpo) {
            a aVar = (a) k.a();
            aVar.b = obj;
            aVar.h = i2;
            aVar.g = j2;
            aVar.e = wpo;
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
        Class<wph> cls = wph.class;
        p = !cls.desiredAssertionStatus();
        i = wyd.a(cls);
        AtomicIntegerFieldUpdater<wph> b2 = PlatformDependent.b(cls, "unwritable");
        if (b2 == null) {
            b2 = AtomicIntegerFieldUpdater.newUpdater(cls, "h");
        }
        n = b2;
        AtomicLongFieldUpdater<wph> c2 = PlatformDependent.c(cls, "totalPendingSize");
        if (c2 == null) {
            c2 = AtomicLongFieldUpdater.newUpdater(cls, "m");
        }
        l = c2;
    }

    public wph(AbstractChannel abstractChannel) {
        this.j = abstractChannel;
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

    public static long a(Object obj) {
        if (obj instanceof wnb) {
            return (long) ((wnb) obj).g();
        }
        if (obj instanceof wqc) {
            return ((wqc) obj).b();
        }
        if (obj instanceof wnd) {
            return (long) ((wnd) obj).a().g();
        }
        return -1;
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

    private static void a(wpo wpo, Throwable th) {
        if (!(wpo instanceof wqo)) {
            wxs.a((wws<?>) wpo, th, i);
        }
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

    private boolean b(Throwable th, boolean z) {
        a aVar = this.b;
        if (aVar == null) {
            d();
            return false;
        }
        Object obj = aVar.b;
        wpo wpo = aVar.e;
        int i2 = aVar.h;
        a(aVar);
        if (!aVar.j) {
            wvn.b(obj);
            a(wpo, th);
            a((long) i2, false, z);
        }
        aVar.a();
        return true;
    }

    private void c(boolean z) {
        final wpl c2 = this.j.c();
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

    private void d() {
        int i2 = this.f;
        if (i2 > 0) {
            this.f = 0;
            Arrays.fill((Object[]) a.a(wxi.b()), 0, i2, null);
        }
    }

    public final Object a() {
        a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
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

    public void a(long j2, boolean z, boolean z2) {
        if (j2 != 0) {
            long addAndGet = l.addAndGet(this, -j2);
            if (z2 && addAndGet < ((long) this.j.B().h())) {
                a(z);
            }
        }
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
                    wph.this.a(closedChannelException);
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
                        wvn.b(aVar.b);
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

    /* access modifiers changed from: 0000 */
    public final void b(long j2) {
        a(j2, true, true);
    }

    public final boolean b() {
        a aVar = this.b;
        if (aVar == null) {
            d();
            return false;
        }
        Object obj = aVar.b;
        wpo wpo = aVar.e;
        int i2 = aVar.h;
        a(aVar);
        if (!aVar.j) {
            wvn.b(obj);
            if (!(wpo instanceof wqo)) {
                wxs.a((wws<? super V>) wpo, null, i);
            }
            a((long) i2, false, true);
        }
        aVar.a();
        return true;
    }

    public final void c(long j2) {
        a aVar = this.b;
        if (!p && aVar == null) {
            throw new AssertionError();
        } else if (aVar.e instanceof wpn) {
            aVar.f += j2;
        }
    }

    public final boolean c() {
        return this.e == 0;
    }

    public final void d(long j2) {
        while (true) {
            Object a2 = a();
            if (a2 instanceof wnb) {
                wnb wnb = (wnb) a2;
                int c2 = wnb.c();
                long d2 = (long) (wnb.d() - c2);
                if (d2 <= j2) {
                    if (j2 != 0) {
                        c(d2);
                        j2 -= d2;
                    }
                    b();
                } else if (j2 != 0) {
                    wnb.a(c2 + ((int) j2));
                    c(j2);
                }
            } else if (!p && j2 != 0) {
                throw new AssertionError();
            }
        }
        d();
    }
}
