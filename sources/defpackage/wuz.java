package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wuz reason: default package */
public final class wuz {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static long a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, a(j2, j)));
        return j2;
    }

    public static long b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder("More produced than requested: ");
                sb.append(j3);
                throw new IllegalStateException(sb.toString());
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    public static boolean a(long j) {
        if (j >= 0) {
            return j != 0;
        }
        StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
