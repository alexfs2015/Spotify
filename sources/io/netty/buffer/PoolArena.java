package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class PoolArena<T> {
    private static /* synthetic */ boolean B = (!PoolArena.class.desiredAssertionStatus());
    static final boolean a = PlatformDependent.e();
    private final wxk A = PlatformDependent.k();
    public final wnr b;
    public final int c;
    public final int d;
    public final int e;
    public final AtomicInteger f = new AtomicInteger();
    private final int g;
    private int h;
    private int i;
    private final wno<T>[] j;
    private final wno<T>[] k;
    private final wnm<T> l;
    private final wnm<T> m;
    private final wnm<T> n;
    private final wnm<T> o;
    private final wnm<T> p;
    private final wnm<T> q;
    private final List<wnn> r;
    private long s;
    private final wxk t = PlatformDependent.k();
    private final wxk u = PlatformDependent.k();
    private final wxk v = PlatformDependent.k();
    private final wxk w = PlatformDependent.k();
    private long x;
    private long y;
    private long z;

    /* renamed from: io.netty.buffer.PoolArena$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[SizeClass.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                io.netty.buffer.PoolArena$SizeClass[] r0 = io.netty.buffer.PoolArena.SizeClass.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.netty.buffer.PoolArena$SizeClass r1 = io.netty.buffer.PoolArena.SizeClass.Normal     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.netty.buffer.PoolArena$SizeClass r1 = io.netty.buffer.PoolArena.SizeClass.Small     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.netty.buffer.PoolArena$SizeClass r1 = io.netty.buffer.PoolArena.SizeClass.Tiny     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.buffer.PoolArena.AnonymousClass1.<clinit>():void");
        }
    }

    public enum SizeClass {
        Tiny,
        Small,
        Normal
    }

    public static final class a extends PoolArena<ByteBuffer> {
        public a(wnr wnr, int i, int i2, int i3, int i4) {
            super(wnr, i, i2, i3, i4);
        }

        private static ByteBuffer f(int i) {
            return PlatformDependent.l() ? PlatformDependent.a(i) : ByteBuffer.allocateDirect(i);
        }

        /* access modifiers changed from: protected */
        public final wnl<ByteBuffer> a(int i, int i2, int i3, int i4) {
            wnl wnl = new wnl(this, f(i4), i, i2, i3, i4);
            return wnl;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void a(Object obj, int i, Object obj2, int i2, int i3) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            ByteBuffer byteBuffer2 = (ByteBuffer) obj2;
            if (i3 != 0) {
                if (a) {
                    PlatformDependent.a(PlatformDependent.b(byteBuffer) + ((long) i), PlatformDependent.b(byteBuffer2) + ((long) i2), (long) i3);
                    return;
                }
                ByteBuffer duplicate = byteBuffer.duplicate();
                ByteBuffer duplicate2 = byteBuffer2.duplicate();
                duplicate.position(i).limit(i + i3);
                duplicate2.position(i2);
                duplicate2.put(duplicate);
            }
        }

        /* access modifiers changed from: protected */
        public final void a(wnl<ByteBuffer> wnl) {
            if (PlatformDependent.l()) {
                PlatformDependent.c((ByteBuffer) wnl.b);
            } else {
                PlatformDependent.a((ByteBuffer) wnl.b);
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            return true;
        }

        /* access modifiers changed from: protected */
        public final wnl<ByteBuffer> d(int i) {
            return new wnl<>(this, f(i), i);
        }

        /* access modifiers changed from: protected */
        public final wnq<ByteBuffer> e(int i) {
            return a ? wnv.F(i) : wns.F(i);
        }
    }

    public static final class b extends PoolArena<byte[]> {
        public b(wnr wnr, int i, int i2, int i3, int i4) {
            super(wnr, i, i2, i3, i4);
        }

        /* access modifiers changed from: protected */
        public final wnl<byte[]> a(int i, int i2, int i3, int i4) {
            wnl wnl = new wnl(this, new byte[i4], i, i2, i3, i4);
            return wnl;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void a(Object obj, int i, Object obj2, int i2, int i3) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (i3 != 0) {
                System.arraycopy(bArr, i, bArr2, i2, i3);
            }
        }

        /* access modifiers changed from: protected */
        public final void a(wnl<byte[]> wnl) {
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            return false;
        }

        /* access modifiers changed from: protected */
        public final wnl<byte[]> d(int i) {
            return new wnl<>(this, new byte[i], i);
        }

        /* access modifiers changed from: protected */
        public final wnq<byte[]> e(int i) {
            return a ? wnw.G(i) : wnt.F(i);
        }
    }

    protected PoolArena(wnr wnr, int i2, int i3, int i4, int i5) {
        this.b = wnr;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        this.d = i5;
        this.i = (i2 - 1) ^ -1;
        this.j = new wno[32];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            wno<T>[] wnoArr = this.j;
            if (i7 >= wnoArr.length) {
                break;
            }
            wnoArr[i7] = f(i2);
            i7++;
        }
        this.e = i4 - 9;
        this.k = new wno[this.e];
        while (true) {
            wno<T>[] wnoArr2 = this.k;
            if (i6 < wnoArr2.length) {
                wnoArr2[i6] = f(i2);
                i6++;
            } else {
                this.q = new wnm<>(null, 100, Integer.MAX_VALUE, i5);
                this.p = new wnm<>(this.q, 75, 100, i5);
                this.l = new wnm<>(this.p, 50, 100, i5);
                this.m = new wnm<>(this.l, 25, 75, i5);
                this.n = new wnm<>(this.m, 1, 50, i5);
                this.o = new wnm<>(this.n, Integer.MIN_VALUE, 25, i5);
                this.q.a(this.p);
                this.p.a(this.l);
                this.l.a(this.m);
                this.m.a(this.n);
                this.n.a(null);
                wnm<T> wnm = this.o;
                wnm.a(wnm);
                ArrayList arrayList = new ArrayList(6);
                arrayList.add(this.o);
                arrayList.add(this.n);
                arrayList.add(this.m);
                arrayList.add(this.l);
                arrayList.add(this.p);
                arrayList.add(this.q);
                this.r = Collections.unmodifiableList(arrayList);
                return;
            }
        }
    }

    public static int a(int i2) {
        return i2 >>> 4;
    }

    private static void a(StringBuilder sb, wno<?>[] wnoArr) {
        for (int i2 = 0; i2 < wnoArr.length; i2++) {
            wno<T> wno = wnoArr[i2];
            if (wno.d != wno) {
                sb.append(wxt.a);
                sb.append(i2);
                sb.append(": ");
                wno<T> wno2 = wno.d;
                do {
                    sb.append(wno2);
                    wno2 = wno2.d;
                } while (wno2 != wno);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.wnp r8, defpackage.wnq<T> r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.i(r10)
            boolean r1 = r7.g(r0)
            if (r1 == 0) goto L_0x0074
            boolean r1 = h(r0)
            if (r1 == 0) goto L_0x001c
            boolean r8 = r8.a(r7, r9, r10, r0)
            if (r8 == 0) goto L_0x0017
            return
        L_0x0017:
            int r8 = r0 >>> 4
            wno<T>[] r2 = r7.j
            goto L_0x0029
        L_0x001c:
            boolean r8 = r8.b(r7, r9, r10, r0)
            if (r8 == 0) goto L_0x0023
            return
        L_0x0023:
            int r8 = b(r0)
            wno<T>[] r2 = r7.k
        L_0x0029:
            r2 = r2[r8]
            monitor-enter(r2)
            wno<T> r8 = r2.d     // Catch:{ all -> 0x0071 }
            if (r8 == r2) goto L_0x006c
            boolean r3 = B     // Catch:{ all -> 0x0071 }
            if (r3 != 0) goto L_0x0043
            boolean r3 = r8.e     // Catch:{ all -> 0x0071 }
            if (r3 == 0) goto L_0x003d
            int r3 = r8.f     // Catch:{ all -> 0x0071 }
            if (r3 != r0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x0071 }
            r8.<init>()     // Catch:{ all -> 0x0071 }
            throw r8     // Catch:{ all -> 0x0071 }
        L_0x0043:
            long r3 = r8.a()     // Catch:{ all -> 0x0071 }
            boolean r0 = B     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0058
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x0071 }
            r8.<init>()     // Catch:{ all -> 0x0071 }
            throw r8     // Catch:{ all -> 0x0071 }
        L_0x0058:
            wnl<T> r8 = r8.a     // Catch:{ all -> 0x0071 }
            r8.b(r9, r3, r10)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0065
            wxk r8 = r7.t     // Catch:{ all -> 0x0071 }
            r8.a()     // Catch:{ all -> 0x0071 }
            goto L_0x006a
        L_0x0065:
            wxk r8 = r7.u     // Catch:{ all -> 0x0071 }
            r8.a()     // Catch:{ all -> 0x0071 }
        L_0x006a:
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            return
        L_0x006c:
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            r7.a(r9, r10, r0)
            return
        L_0x0071:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            throw r8
        L_0x0074:
            int r1 = r7.d
            if (r0 > r1) goto L_0x0083
            boolean r8 = r8.c(r7, r9, r10, r0)
            if (r8 == 0) goto L_0x007f
            return
        L_0x007f:
            r7.a(r9, r10, r0)
            return
        L_0x0083:
            r7.a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.buffer.PoolArena.a(wnp, wnq, int):void");
    }

    private void a(wnq<T> wnq, int i2) {
        wnl d2 = d(i2);
        this.w.a((long) d2.d);
        wnq.a(d2, i2);
        this.v.a();
    }

    private synchronized void a(wnq<T> wnq, int i2, int i3) {
        if (!this.l.a(wnq, i2, i3) && !this.m.a(wnq, i2, i3) && !this.n.a(wnq, i2, i3) && !this.o.a(wnq, i2, i3)) {
            if (!this.p.a(wnq, i2, i3)) {
                wnl a2 = a(this.c, this.g, this.h, this.d);
                long a3 = a2.a(i3);
                this.s++;
                if (!B) {
                    if (a3 <= 0) {
                        throw new AssertionError();
                    }
                }
                a2.a(wnq, a3, i2);
                this.o.a(a2);
                return;
            }
        }
        this.s++;
    }

    private void a(wnm<T>... wnmArr) {
        for (int i2 = 0; i2 < 6; i2++) {
            wnmArr[i2].a(this);
        }
    }

    private static void a(wno<?>[] wnoArr) {
        for (wno<?> c2 : wnoArr) {
            c2.c();
        }
    }

    public static int b(int i2) {
        int i3 = i2 >>> 10;
        int i4 = 0;
        while (i3 != 0) {
            i3 >>>= 1;
            i4++;
        }
        return i4;
    }

    private static wno<T> f(int i2) {
        wno<T> wno = new wno<>(i2);
        wno.c = wno;
        wno.d = wno;
        return wno;
    }

    private boolean g(int i2) {
        return (i2 & this.i) == 0;
    }

    private static boolean h(int i2) {
        return (i2 & -512) == 0;
    }

    private int i(int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder("capacity: ");
            sb.append(i2);
            sb.append(" (expected: 0+)");
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= this.d) {
            return i2;
        } else {
            if (h(i2)) {
                return (i2 & 15) == 0 ? i2 : (i2 & -16) + 16;
            }
            int i3 = i2 - 1;
            int i4 = i3 | (i3 >>> 1);
            int i5 = i4 | (i4 >>> 2);
            int i6 = i5 | (i5 >>> 4);
            int i7 = i6 | (i6 >>> 8);
            int i8 = (i7 | (i7 >>> 16)) + 1;
            if (i8 < 0) {
                i8 >>>= 1;
            }
            return i8;
        }
    }

    /* access modifiers changed from: protected */
    public abstract wnl<T> a(int i2, int i3, int i4, int i5);

    public final wnq<T> a(wnp wnp, int i2, int i3) {
        wnq<T> e2 = e(i3);
        a(wnp, e2, i2);
        return e2;
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t2, int i2, T t3, int i3, int i4);

    public abstract void a(wnl<T> wnl);

    public final void a(wnl<T> wnl, long j2, int i2, wnp wnp) {
        defpackage.wnp.a aVar;
        boolean z2;
        if (wnl.c) {
            int i3 = wnl.d;
            a(wnl);
            this.w.a((long) (-i3));
            this.A.a();
            return;
        }
        SizeClass sizeClass = !g(i2) ? SizeClass.Normal : h(i2) ? SizeClass.Tiny : SizeClass.Small;
        if (wnp != null) {
            int i4 = AnonymousClass2.a[sizeClass.ordinal()];
            if (i4 == 1) {
                aVar = wnp.c(this, i2);
            } else if (i4 == 2) {
                aVar = wnp.b(this, i2);
            } else if (i4 == 3) {
                aVar = wnp.a(this, i2);
            } else {
                throw new Error();
            }
            if (aVar == null) {
                z2 = false;
            } else {
                C0088a a2 = defpackage.wnp.a.a(wnl, j2);
                z2 = aVar.a.offer(a2);
                if (!z2) {
                    a2.a();
                }
            }
            if (z2) {
                return;
            }
        }
        a(wnl, j2, sizeClass);
    }

    public final void a(wnl<T> wnl, long j2, SizeClass sizeClass) {
        boolean z2;
        synchronized (this) {
            int i2 = AnonymousClass1.a[sizeClass.ordinal()];
            z2 = true;
            if (i2 == 1) {
                this.z++;
            } else if (i2 == 2) {
                this.y++;
            } else if (i2 == 3) {
                this.x++;
            } else {
                throw new Error();
            }
            if (wnl.e.a(wnl, j2)) {
                z2 = false;
            }
        }
        if (z2) {
            a(wnl);
        }
    }

    public final void a(wnq<T> wnq, int i2, boolean z2) {
        wnq<T> wnq2 = wnq;
        int i3 = i2;
        if (i3 < 0 || i3 > wnq.b()) {
            StringBuilder sb = new StringBuilder("newCapacity: ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = wnq2.j;
        if (i4 != i3) {
            wnl<T> wnl = wnq2.e;
            long j2 = wnq2.g;
            T t2 = wnq2.h;
            int i5 = wnq2.i;
            int i6 = wnq2.k;
            int c2 = wnq.c();
            int d2 = wnq.d();
            a(this.b.c(), wnq, i3);
            if (i3 > i4) {
                a(t2, i5, wnq2.h, wnq2.i, i4);
            } else if (i3 < i4) {
                if (c2 < i3) {
                    if (d2 > i3) {
                        d2 = i3;
                    }
                    a(t2, i5 + c2, wnq2.h, wnq2.i + c2, d2 - c2);
                } else {
                    c2 = i3;
                    d2 = c2;
                }
            }
            wnq.a(c2, d2);
            a(wnl, j2, i6, wnq2.l);
        }
    }

    public abstract boolean a();

    public final wno<T> c(int i2) {
        wno<T>[] wnoArr;
        int i3;
        if (h(i2)) {
            int i4 = i2 >>> 4;
            i3 = i4;
            wnoArr = this.j;
        } else {
            i3 = 0;
            int i5 = i2 >>> 10;
            while (i5 != 0) {
                i5 >>>= 1;
                i3++;
            }
            wnoArr = this.k;
        }
        return wnoArr[i3];
    }

    /* access modifiers changed from: protected */
    public abstract wnl<T> d(int i2);

    /* access modifiers changed from: protected */
    public abstract wnq<T> e(int i2);

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            super.finalize();
        } finally {
            a((wno<?>[]) this.k);
            a((wno<?>[]) this.j);
            a((wnm<T>[]) new wnm[]{this.o, this.n, this.m, this.l, this.p, this.q});
        }
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder("Chunk(s) at 0~25%:");
        sb.append(wxt.a);
        sb.append(this.o);
        sb.append(wxt.a);
        sb.append("Chunk(s) at 0~50%:");
        sb.append(wxt.a);
        sb.append(this.n);
        sb.append(wxt.a);
        sb.append("Chunk(s) at 25~75%:");
        sb.append(wxt.a);
        sb.append(this.m);
        sb.append(wxt.a);
        sb.append("Chunk(s) at 50~100%:");
        sb.append(wxt.a);
        sb.append(this.l);
        sb.append(wxt.a);
        sb.append("Chunk(s) at 75~100%:");
        sb.append(wxt.a);
        sb.append(this.p);
        sb.append(wxt.a);
        sb.append("Chunk(s) at 100%:");
        sb.append(wxt.a);
        sb.append(this.q);
        sb.append(wxt.a);
        sb.append("tiny subpages:");
        a(sb, (wno<?>[]) this.j);
        sb.append(wxt.a);
        sb.append("small subpages:");
        a(sb, (wno<?>[]) this.k);
        sb.append(wxt.a);
        return sb.toString();
    }
}
