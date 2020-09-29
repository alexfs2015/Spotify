package defpackage;

import io.netty.buffer.PoolArena;
import io.netty.buffer.PoolArena.b;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: vzl reason: default package */
public class vzl extends vyn {
    public static final vzl b = new vzl(PlatformDependent.g());
    private static final wjw c = wjx.a(vzl.class);
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h = wjo.a("io.netty.allocator.tinyCacheSize", 512);
    private static final int i = wjo.a("io.netty.allocator.smallCacheSize", 256);
    private static final int j = wjo.a("io.netty.allocator.normalCacheSize", 64);
    /* access modifiers changed from: private */
    public static final int k = wjo.a("io.netty.allocator.maxCachedBufferCapacity", 32768);
    /* access modifiers changed from: private */
    public static final int l = wjo.a("io.netty.allocator.cacheTrimInterval", 8192);
    /* access modifiers changed from: private */
    public final PoolArena<byte[]>[] m;
    /* access modifiers changed from: private */
    public final PoolArena<ByteBuffer>[] n;
    /* access modifiers changed from: private */
    public final int o;
    /* access modifiers changed from: private */
    public final int p;
    /* access modifiers changed from: private */
    public final int q;
    private final List<Object> r;
    private final List<Object> s;
    private final a t;

    /* renamed from: vzl$a */
    final class a extends wia<vzj> {
        a() {
        }

        public final /* synthetic */ void a(Object obj) {
            vzj vzj = (vzj) obj;
            whm.b(vzj.c, vzj.d);
            vzj.a();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public synchronized vzj a() {
            vzj vzj;
            vzj = new vzj(a((PoolArena<T>[]) vzl.this.m), a((PoolArena<T>[]) vzl.this.n), vzl.this.o, vzl.this.p, vzl.this.q, vzl.k, vzl.l);
            return vzj;
        }

        private static <T> PoolArena<T> a(PoolArena<T>[] poolArenaArr) {
            if (poolArenaArr == null || poolArenaArr.length == 0) {
                return null;
            }
            PoolArena<T> poolArena = poolArenaArr[0];
            for (int i = 1; i < poolArenaArr.length; i++) {
                PoolArena<T> poolArena2 = poolArenaArr[i];
                if (poolArena2.f.get() < poolArena.f.get()) {
                    poolArena = poolArena2;
                }
            }
            return poolArena;
        }
    }

    static {
        Object obj;
        int a2 = wjo.a("io.netty.allocator.pageSize", 8192);
        Object th = null;
        try {
            h(a2);
            obj = null;
        } catch (Throwable th2) {
            obj = th2;
            a2 = 8192;
        }
        f = a2;
        int i2 = 11;
        int a3 = wjo.a("io.netty.allocator.maxOrder", 11);
        try {
            e(f, a3);
            i2 = a3;
        } catch (Throwable th3) {
            th = th3;
        }
        g = i2;
        Runtime runtime = Runtime.getRuntime();
        long availableProcessors = (long) (runtime.availableProcessors() << 1);
        long j2 = (long) (f << g);
        d = Math.max(0, wjo.a("io.netty.allocator.numHeapArenas", (int) Math.min(availableProcessors, ((runtime.maxMemory() / j2) / 2) / 3)));
        e = Math.max(0, wjo.a("io.netty.allocator.numDirectArenas", (int) Math.min(availableProcessors, ((PlatformDependent.h() / j2) / 2) / 3)));
        if (c.b()) {
            c.b("-Dio.netty.allocator.numHeapArenas: {}", (Object) Integer.valueOf(d));
            c.b("-Dio.netty.allocator.numDirectArenas: {}", (Object) Integer.valueOf(e));
            String str = "-Dio.netty.allocator.pageSize: {}";
            if (obj == null) {
                c.b(str, (Object) Integer.valueOf(f));
            } else {
                c.b(str, Integer.valueOf(f), obj);
            }
            String str2 = "-Dio.netty.allocator.maxOrder: {}";
            if (th == null) {
                c.b(str2, (Object) Integer.valueOf(g));
            } else {
                c.b(str2, Integer.valueOf(g), th);
            }
            c.b("-Dio.netty.allocator.chunkSize: {}", (Object) Integer.valueOf(f << g));
            c.b("-Dio.netty.allocator.tinyCacheSize: {}", (Object) Integer.valueOf(h));
            c.b("-Dio.netty.allocator.smallCacheSize: {}", (Object) Integer.valueOf(i));
            c.b("-Dio.netty.allocator.normalCacheSize: {}", (Object) Integer.valueOf(j));
            c.b("-Dio.netty.allocator.maxCachedBufferCapacity: {}", (Object) Integer.valueOf(k));
            c.b("-Dio.netty.allocator.cacheTrimInterval: {}", (Object) Integer.valueOf(l));
        }
    }

    public vzl() {
        this(false);
    }

    private vzl(boolean z) {
        this(z, d, e, f, g);
    }

    private vzl(boolean z, int i2, int i3, int i4, int i5) {
        this(z, i2, i3, i4, i5, h, i, j);
    }

    private vzl(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i2;
        int i10 = i3;
        super(z);
        this.t = new a();
        this.o = i6;
        this.p = i7;
        this.q = i8;
        int e2 = e(i4, i5);
        String str = " (expected: >= 0)";
        if (i9 < 0) {
            StringBuilder sb = new StringBuilder("nHeapArena: ");
            sb.append(i9);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (i10 >= 0) {
            int h2 = h(i4);
            if (i9 > 0) {
                this.m = new PoolArena[i9];
                ArrayList arrayList = new ArrayList(this.m.length);
                for (int i11 = 0; i11 < this.m.length; i11++) {
                    b bVar = new b(this, i4, i5, h2, e2);
                    this.m[i11] = bVar;
                    arrayList.add(bVar);
                }
                this.r = Collections.unmodifiableList(arrayList);
            } else {
                this.m = null;
                this.r = Collections.emptyList();
            }
            if (i10 > 0) {
                this.n = new PoolArena[i10];
                ArrayList arrayList2 = new ArrayList(this.n.length);
                for (int i12 = 0; i12 < this.n.length; i12++) {
                    io.netty.buffer.PoolArena.a aVar = new io.netty.buffer.PoolArena.a(this, i4, i5, h2, e2);
                    this.n[i12] = aVar;
                    arrayList2.add(aVar);
                }
                this.s = Collections.unmodifiableList(arrayList2);
                return;
            }
            this.n = null;
            this.s = Collections.emptyList();
        } else {
            StringBuilder sb2 = new StringBuilder("nDirectArea: ");
            sb2.append(i10);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static int h(int i2) {
        String str = "pageSize: ";
        if (i2 < 4096) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(i2);
            sb.append(" (expected: 4096");
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } else if (((i2 - 1) & i2) == 0) {
            return 31 - Integer.numberOfLeadingZeros(i2);
        } else {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(i2);
            sb2.append(" (expected: power of 2)");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static int e(int i2, int i3) {
        if (i3 <= 14) {
            int i4 = i2;
            int i5 = i3;
            while (i5 > 0) {
                if (i4 <= 536870912) {
                    i4 <<= 1;
                    i5--;
                } else {
                    throw new IllegalArgumentException(String.format("pageSize (%d) << maxOrder (%d) must not exceed %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(1073741824)}));
                }
            }
            return i4;
        }
        StringBuilder sb = new StringBuilder("maxOrder: ");
        sb.append(i3);
        sb.append(" (expected: 0-14)");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final vyv b(int i2, int i3) {
        vyv vyv;
        vzj vzj = (vzj) this.t.a(wjc.b());
        PoolArena<byte[]> poolArena = vzj.a;
        if (poolArena != null) {
            vyv = poolArena.a(vzj, i2, i3);
        } else {
            vyv = new waa((vyw) this, i2, i3);
        }
        return a(vyv);
    }

    /* access modifiers changed from: protected */
    public final vyv c(int i2, int i3) {
        vyv vyv;
        vzj vzj = (vzj) this.t.a(wjc.b());
        PoolArena<ByteBuffer> poolArena = vzj.b;
        if (poolArena != null) {
            vyv = poolArena.a(vzj, i2, i3);
        } else if (PlatformDependent.e()) {
            vyv = wag.a((vyw) this, i2, i3);
        } else {
            vyv = new vzy((vyw) this, i2, i3);
        }
        return a(vyv);
    }

    public final boolean b() {
        return this.n != null;
    }

    public final vzj c() {
        return (vzj) this.t.a(wjc.b());
    }
}
