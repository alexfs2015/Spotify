package io.netty.util.internal;

import java.lang.Thread.UncaughtExceptionHandler;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class ThreadLocalRandom extends Random {
    /* access modifiers changed from: private */
    public static final wyc a = wyd.a(ThreadLocalRandom.class);
    private static final AtomicLong b = new AtomicLong();
    private static volatile long c = 0;
    private static final Thread d;
    /* access modifiers changed from: private */
    public static final BlockingQueue<Long> e;
    private static final long f;
    /* access modifiers changed from: private */
    public static volatile long g = 0;
    private static final long serialVersionUID = -5851777807851030925L;
    boolean initialized = true;
    private long pad0;
    private long pad1;
    private long pad2;
    private long pad3;
    private long pad4;
    private long pad5;
    private long pad6;
    private long pad7;
    private long rnd;

    static {
        long longValue = ((Long) AccessController.doPrivileged(new PrivilegedAction<Long>() {
            public final /* synthetic */ Object run() {
                return Long.getLong("io.netty.initialSeedUniquifier", ThreadLocalRandom.f);
            }
        })).longValue();
        c = longValue;
        if (longValue != f) {
            d = null;
            e = null;
            f = f;
        } else if (((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
            public final /* synthetic */ Object run() {
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            }
        })).booleanValue()) {
            e = new LinkedBlockingQueue();
            f = System.nanoTime();
            AnonymousClass3 r0 = new Thread("initialSeedUniquifierGenerator") {
                public final void run() {
                    byte[] generateSeed = new SecureRandom().generateSeed(8);
                    ThreadLocalRandom.g = System.nanoTime();
                    ThreadLocalRandom.e.add(Long.valueOf((((long) generateSeed[7]) & 255) | ((((long) generateSeed[0]) & 255) << 56) | ((((long) generateSeed[1]) & 255) << 48) | ((((long) generateSeed[2]) & 255) << 40) | ((((long) generateSeed[3]) & 255) << 32) | ((((long) generateSeed[4]) & 255) << 24) | ((((long) generateSeed[5]) & 255) << 16) | ((((long) generateSeed[6]) & 255) << 8)));
                }
            };
            d = r0;
            r0.setDaemon(true);
            d.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    ThreadLocalRandom.a.b("An exception has been raised by {}", thread.getName(), th);
                }
            });
            d.start();
        } else {
            c = b(System.currentTimeMillis()) ^ b(System.nanoTime());
            d = null;
            e = null;
            f = f;
        }
    }

    ThreadLocalRandom() {
        super(e());
    }

    public static ThreadLocalRandom a() {
        wxi b2 = wxi.b();
        ThreadLocalRandom threadLocalRandom = b2.h;
        if (threadLocalRandom != null) {
            return threadLocalRandom;
        }
        ThreadLocalRandom threadLocalRandom2 = new ThreadLocalRandom();
        b2.h = threadLocalRandom2;
        return threadLocalRandom2;
    }

    private static long b(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        d.interrupt();
        a.c("Failed to generate a seed from SecureRandom within {} seconds. Not enough entropy?", (java.lang.Object) java.lang.Long.valueOf(3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long d() {
        /*
            long r0 = c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.Class<io.netty.util.internal.ThreadLocalRandom> r0 = io.netty.util.internal.ThreadLocalRandom.class
            monitor-enter(r0)
            long r4 = c     // Catch:{ all -> 0x008e }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return r4
        L_0x0014:
            long r6 = f     // Catch:{ all -> 0x008e }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            r8 = 3
            long r10 = r1.toNanos(r8)     // Catch:{ all -> 0x008e }
            long r6 = r6 + r10
            r1 = 0
        L_0x0020:
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x008e }
            long r10 = r6 - r10
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x0033
            java.util.concurrent.BlockingQueue<java.lang.Long> r12 = e     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Object r12 = r12.poll()     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x003d
        L_0x0033:
            java.util.concurrent.BlockingQueue<java.lang.Long> r12 = e     // Catch:{ InterruptedException -> 0x0059 }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Object r12 = r12.poll(r10, r13)     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ InterruptedException -> 0x0059 }
        L_0x003d:
            if (r12 == 0) goto L_0x0044
            long r4 = r12.longValue()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0061
        L_0x0044:
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x0020
            java.lang.Thread r6 = d     // Catch:{ all -> 0x008e }
            r6.interrupt()     // Catch:{ all -> 0x008e }
            wyc r6 = a     // Catch:{ all -> 0x008e }
            java.lang.String r7 = "Failed to generate a seed from SecureRandom within {} seconds. Not enough entropy?"
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x008e }
            r6.c(r7, r8)     // Catch:{ all -> 0x008e }
            goto L_0x0061
        L_0x0059:
            r1 = 1
            wyc r6 = a     // Catch:{ all -> 0x008e }
            java.lang.String r7 = "Failed to generate a seed from SecureRandom due to an InterruptedException."
            r6.d(r7)     // Catch:{ all -> 0x008e }
        L_0x0061:
            r6 = 3627065505421648153(0x3255ecdc33bae119, double:3.253008663204319E-66)
            long r4 = r4 ^ r6
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x008e }
            long r6 = java.lang.Long.reverse(r6)     // Catch:{ all -> 0x008e }
            long r4 = r4 ^ r6
            c = r4     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0080
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008e }
            r1.interrupt()     // Catch:{ all -> 0x008e }
            java.lang.Thread r1 = d     // Catch:{ all -> 0x008e }
            r1.interrupt()     // Catch:{ all -> 0x008e }
        L_0x0080:
            long r6 = g     // Catch:{ all -> 0x008e }
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x008c
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x008e }
            g = r1     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return r4
        L_0x008e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            goto L_0x0092
        L_0x0091:
            throw r1
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.ThreadLocalRandom.d():long");
    }

    private static long e() {
        long j;
        long d2;
        long j2;
        do {
            j = b.get();
            d2 = j != f ? j : d();
            j2 = 181783497276652981L * d2;
        } while (!b.compareAndSet(j, j2));
        if (j == f && a.b()) {
            if (g != f) {
                a.b(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x (took %d ms)", new Object[]{Long.valueOf(d2), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(g - f))}));
            } else {
                a.b(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x", new Object[]{Long.valueOf(d2)}));
            }
        }
        return System.nanoTime() ^ j2;
    }

    /* access modifiers changed from: protected */
    public final int next(int i) {
        this.rnd = ((this.rnd * 25214903917L) + 11) & 281474976710655L;
        return (int) (this.rnd >>> (48 - i));
    }

    public final void setSeed(long j) {
        if (!this.initialized) {
            this.rnd = (j ^ 25214903917L) & 281474976710655L;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
