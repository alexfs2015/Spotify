package defpackage;

import io.netty.buffer.PoolArena;
import io.netty.buffer.PoolArena.SizeClass;
import io.netty.util.Recycler;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.util.Queue;

/* renamed from: vzj reason: default package */
public final class vzj {
    private static final wjw e = wjx.a(vzj.class);
    final PoolArena<byte[]> a;
    final PoolArena<ByteBuffer> b;
    final Thread c = Thread.currentThread();
    final Runnable d = new Runnable() {
        public final void run() {
            vzj.this.a();
        }
    };
    private final a<byte[]>[] f;
    private final a<byte[]>[] g;
    private final a<ByteBuffer>[] h;
    private final a<ByteBuffer>[] i;
    private final a<byte[]>[] j;
    private final a<ByteBuffer>[] k;
    private final int l;
    private final int m;
    private final int n;
    private int o;

    /* renamed from: vzj$2 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[SizeClass.values().length];

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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vzj.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: vzj$a */
    public static abstract class a<T> {
        private static final Recycler<C0085a> e = new Recycler<C0085a>() {
            public final /* synthetic */ Object a(io.netty.util.Recycler.b bVar) {
                return new C0085a(bVar);
            }
        };
        public final Queue<C0085a<T>> a = PlatformDependent.c(this.b);
        private final int b;
        private final SizeClass c;
        private int d;

        /* renamed from: vzj$a$a reason: collision with other inner class name */
        public static final class C0085a<T> {
            vzf<T> a;
            long b = -1;
            private io.netty.util.Recycler.b<C0085a<?>> c;

            C0085a(io.netty.util.Recycler.b<C0085a<?>> bVar) {
                this.c = bVar;
            }

            public final void a() {
                this.a = null;
                this.b = -1;
                this.c.a(this);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(vzf<T> vzf, long j, vzk<T> vzk, int i);

        a(int i, SizeClass sizeClass) {
            this.b = wjg.b(i);
            this.c = sizeClass;
        }

        public final boolean a(vzk<T> vzk, int i) {
            C0085a aVar = (C0085a) this.a.poll();
            if (aVar == null) {
                return false;
            }
            a(aVar.a, aVar.b, vzk, i);
            aVar.a();
            this.d++;
            return true;
        }

        /* access modifiers changed from: 0000 */
        public int a(int i) {
            int i2 = 0;
            while (i2 < i) {
                C0085a aVar = (C0085a) this.a.poll();
                if (aVar == null) {
                    break;
                }
                a(aVar);
                i2++;
            }
            return i2;
        }

        public final void a() {
            int i = this.b - this.d;
            this.d = 0;
            if (i > 0) {
                a(i);
            }
        }

        private void a(C0085a aVar) {
            vzf<T> vzf = aVar.a;
            long j = aVar.b;
            aVar.a();
            vzf.a.a(vzf, j, this.c);
        }

        public static C0085a a(vzf<?> vzf, long j) {
            C0085a aVar = (C0085a) e.a();
            aVar.a = vzf;
            aVar.b = j;
            return aVar;
        }
    }

    /* renamed from: vzj$b */
    static final class b<T> extends a<T> {
        b(int i) {
            super(i, SizeClass.Normal);
        }

        /* access modifiers changed from: protected */
        public final void a(vzf<T> vzf, long j, vzk<T> vzk, int i) {
            vzf.a(vzk, j, i);
        }
    }

    /* renamed from: vzj$c */
    static final class c<T> extends a<T> {
        c(int i, SizeClass sizeClass) {
            super(i, sizeClass);
        }

        /* access modifiers changed from: protected */
        public final void a(vzf<T> vzf, long j, vzk<T> vzk, int i) {
            vzf.b(vzk, j, i);
        }
    }

    private static int a(int i2) {
        int i3 = 0;
        while (i2 > 1) {
            i2 >>= 1;
            i3++;
        }
        return i3;
    }

    vzj(PoolArena<byte[]> poolArena, PoolArena<ByteBuffer> poolArena2, int i2, int i3, int i4, int i5, int i6) {
        if (i5 < 0) {
            StringBuilder sb = new StringBuilder("maxCachedBufferCapacity: ");
            sb.append(i5);
            sb.append(" (expected: >= 0)");
            throw new IllegalArgumentException(sb.toString());
        } else if (i6 > 0) {
            this.n = i6;
            this.a = poolArena;
            this.b = poolArena2;
            if (poolArena2 != null) {
                this.h = a(i2, 32, SizeClass.Tiny);
                this.i = a(i3, poolArena2.e, SizeClass.Small);
                this.l = a(poolArena2.c);
                this.k = a(i4, i5, poolArena2);
                poolArena2.f.getAndIncrement();
            } else {
                this.h = null;
                this.i = null;
                this.k = null;
                this.l = -1;
            }
            if (poolArena != null) {
                this.f = a(i2, 32, SizeClass.Tiny);
                this.g = a(i3, poolArena.e, SizeClass.Small);
                this.m = a(poolArena.c);
                this.j = a(i4, i5, poolArena);
                poolArena.f.getAndIncrement();
            } else {
                this.f = null;
                this.g = null;
                this.j = null;
                this.m = -1;
            }
            whm.a(this.c, this.d);
        } else {
            StringBuilder sb2 = new StringBuilder("freeSweepAllocationThreshold: ");
            sb2.append(i6);
            sb2.append(" (expected: > 0)");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static <T> a<T>[] a(int i2, int i3, SizeClass sizeClass) {
        if (i2 <= 0) {
            return null;
        }
        a<T>[] aVarArr = new a[i3];
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            aVarArr[i4] = new c(i2, sizeClass);
        }
        return aVarArr;
    }

    private static <T> a<T>[] a(int i2, int i3, PoolArena<T> poolArena) {
        if (i2 <= 0) {
            return null;
        }
        int max = Math.max(1, a(Math.min(poolArena.d, i3) / poolArena.c) + 1);
        a<T>[] aVarArr = new a[max];
        for (int i4 = 0; i4 < max; i4++) {
            aVarArr[i4] = new b(i2);
        }
        return aVarArr;
    }

    public final boolean a(PoolArena<?> poolArena, vzk<?> vzk, int i2, int i3) {
        return a(a(poolArena, i3), (vzk) vzk, i2);
    }

    public final boolean b(PoolArena<?> poolArena, vzk<?> vzk, int i2, int i3) {
        return a(b(poolArena, i3), (vzk) vzk, i2);
    }

    public final boolean c(PoolArena<?> poolArena, vzk<?> vzk, int i2, int i3) {
        return a(c(poolArena, i3), (vzk) vzk, i2);
    }

    private boolean a(a<?> aVar, vzk vzk, int i2) {
        if (aVar == null) {
            return false;
        }
        boolean a2 = aVar.a(vzk, i2);
        int i3 = this.o + 1;
        this.o = i3;
        if (i3 >= this.n) {
            this.o = 0;
            b();
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        int a2 = a((a<?>[]) this.h) + a((a<?>[]) this.i) + a((a<?>[]) this.k) + a((a<?>[]) this.f) + a((a<?>[]) this.g) + a((a<?>[]) this.j);
        if (a2 > 0 && e.b()) {
            e.b("Freed {} thread-local buffer(s) from thread: {}", Integer.valueOf(a2), this.c.getName());
        }
        PoolArena<ByteBuffer> poolArena = this.b;
        if (poolArena != null) {
            poolArena.f.getAndDecrement();
        }
        PoolArena<byte[]> poolArena2 = this.a;
        if (poolArena2 != null) {
            poolArena2.f.getAndDecrement();
        }
    }

    private static int a(a<?>[] aVarArr) {
        if (aVarArr == null) {
            return 0;
        }
        int i2 = 0;
        for (a<?> a2 : aVarArr) {
            i2 += a(a2);
        }
        return i2;
    }

    private void b() {
        b((a<?>[]) this.h);
        b((a<?>[]) this.i);
        b((a<?>[]) this.k);
        b((a<?>[]) this.f);
        b((a<?>[]) this.g);
        b((a<?>[]) this.j);
    }

    private static void b(a<?>[] aVarArr) {
        if (aVarArr != null) {
            for (a<?> b2 : aVarArr) {
                b(b2);
            }
        }
    }

    private static void b(a<?> aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public a<?> a(PoolArena<?> poolArena, int i2) {
        int a2 = PoolArena.a(i2);
        if (poolArena.a()) {
            return a((a<T>[]) this.h, a2);
        }
        return a((a<T>[]) this.f, a2);
    }

    public a<?> b(PoolArena<?> poolArena, int i2) {
        int b2 = PoolArena.b(i2);
        if (poolArena.a()) {
            return a((a<T>[]) this.i, b2);
        }
        return a((a<T>[]) this.g, b2);
    }

    public a<?> c(PoolArena<?> poolArena, int i2) {
        if (poolArena.a()) {
            return a((a<T>[]) this.k, a(i2 >> this.l));
        }
        return a((a<T>[]) this.j, a(i2 >> this.m));
    }

    private static <T> a<T> a(a<T>[] aVarArr, int i2) {
        if (aVarArr == null || i2 > aVarArr.length - 1) {
            return null;
        }
        return aVarArr[i2];
    }

    private static int a(a<?> aVar) {
        if (aVar == null) {
            return 0;
        }
        return aVar.a(Integer.MAX_VALUE);
    }
}
