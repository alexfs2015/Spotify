package io.netty.util.internal.chmv8;

import java.util.Random;
import sun.misc.Unsafe;

abstract class Striped64 extends Number {
    static final ThreadLocal<int[]> a = new ThreadLocal<>();
    static final Random b = new Random();
    static final int c = Runtime.getRuntime().availableProcessors();
    private static final Unsafe g;
    private static final long h;
    private static final long i;
    volatile transient a[] d;
    volatile transient long e;
    volatile transient int f;

    static final class a {
        private static final Unsafe b;
        private static final long c;
        volatile long a;

        a(long j) {
            this.a = j;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(long j, long j2) {
            return b.compareAndSwapLong(this, c, j, j2);
        }

        static {
            try {
                b = Striped64.a();
                c = b.objectFieldOffset(a.class.getDeclaredField("value"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract long a(long j, long j2);

    static {
        try {
            g = a();
            Class<Striped64> cls = Striped64.class;
            h = g.objectFieldOffset(cls.getDeclaredField("base"));
            i = g.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    Striped64() {
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(long j, long j2) {
        return g.compareAndSwapLong(this, h, j, j2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return g.compareAndSwapInt(this, i, 0, 1);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new io.netty.util.internal.chmv8.Striped64.AnonymousClass1());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe a() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            io.netty.util.internal.chmv8.Striped64$1 r0 = new io.netty.util.internal.chmv8.Striped64$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.Striped64.a():sun.misc.Unsafe");
    }
}
