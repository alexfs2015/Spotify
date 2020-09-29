package defpackage;

import java.util.Iterator;

/* renamed from: wyr reason: default package */
public final class wyr<E> extends wyt<E> {
    private static final long j;
    private static final long k;
    private static final long l;
    private static final Object m = new Object();

    static {
        try {
            j = wzg.a.objectFieldOffset(wyx.class.getDeclaredField("i"));
            try {
                k = wzg.a.objectFieldOffset(wyt.class.getDeclaredField("h"));
                try {
                    l = wzg.a.objectFieldOffset(wys.class.getDeclaredField("d"));
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    public wyr(int i, int i2, boolean z) {
        if (i2 < 4) {
            throw new IllegalArgumentException("Max capacity must be 4 or more");
        } else if (wzf.a(1024) < wzf.a(i2)) {
            int a = wzf.a(1024);
            long j2 = (long) ((a - 1) << 1);
            Object[] objArr = new Object[(a + 1)];
            this.c = objArr;
            this.b = j2;
            this.g = objArr;
            this.f = j2;
            this.a = ((long) wzf.a(i2)) << 1;
            this.e = true;
            c(j2);
        } else {
            throw new IllegalArgumentException("Initial capacity cannot exceed maximum capacity(both rounded up to a power of 2)");
        }
    }

    private long a() {
        return wzg.a.getLongVolatile(this, j);
    }

    private static long a(long j2) {
        return a(j2 + 2, Long.MAX_VALUE);
    }

    private static long a(long j2, long j3) {
        return wzh.a + ((j2 & j3) << (wzh.b - 1));
    }

    private E[] a(E[] eArr, long j2) {
        long a = a(j2);
        E[] eArr2 = (Object[]) wzh.a(eArr, a);
        wzh.b(eArr, a, null);
        return eArr2;
    }

    private long b() {
        return wzg.a.getLongVolatile(this, k);
    }

    private long b(E[] eArr, long j2) {
        this.g = eArr;
        this.f = (long) ((eArr.length - 2) << 1);
        return a(j2, this.f);
    }

    private void b(long j2) {
        wzg.a.putOrderedLong(this, k, j2);
    }

    private boolean b(long j2, long j3) {
        return wzg.a.compareAndSwapLong(this, j, j2, j3);
    }

    private void c(long j2) {
        wzg.a.putOrderedLong(this, l, j2);
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean offer(E r23) {
        /*
            r22 = this;
            r8 = r22
            r9 = r23
            if (r9 == 0) goto L_0x00f1
        L_0x0006:
            long r4 = r8.d
            long r10 = r22.a()
            r0 = 1
            long r2 = r10 & r0
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0006
            long r12 = r8.b
            java.lang.Object[] r14 = r8.c
            r15 = 2
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x00dd
            long r2 = r22.b()
            long r6 = r8.a
            boolean r0 = r8.e
            if (r0 != 0) goto L_0x0030
            long r0 = r12 + r15
            int r18 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r18 != 0) goto L_0x0030
            r0 = r6
            goto L_0x0031
        L_0x0030:
            r0 = r12
        L_0x0031:
            long r18 = r2 + r0
            r1 = 3
            r20 = 0
            r0 = 2
            int r21 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r21 <= 0) goto L_0x0052
            sun.misc.Unsafe r2 = defpackage.wzg.a
            long r6 = l
            r3 = 2
            r0 = r2
            r2 = 3
            r1 = r22
            r15 = 2
            r2 = r6
            r15 = 1
            r6 = r18
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x0050
            goto L_0x0066
        L_0x0050:
            r0 = 0
            goto L_0x0067
        L_0x0052:
            r15 = 1
            long r0 = r10 - r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x005b
            r0 = 2
            goto L_0x0067
        L_0x005b:
            r0 = 1
            long r0 = r0 + r10
            boolean r0 = r8.b(r10, r0)
            if (r0 == 0) goto L_0x0066
            r0 = 3
            goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            if (r0 == 0) goto L_0x00de
            if (r0 == r15) goto L_0x0006
            r1 = 2
            if (r0 == r1) goto L_0x00dc
            r1 = 3
            if (r0 == r1) goto L_0x0072
            goto L_0x00de
        L_0x0072:
            long r0 = r8.h
            long r2 = r8.a
            boolean r4 = r8.e
            if (r4 == 0) goto L_0x007d
            int r4 = r14.length
            r5 = 2
            goto L_0x0089
        L_0x007d:
            int r4 = r14.length
            int r4 = r4 - r15
            long r4 = (long) r4
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x00d6
            int r4 = r14.length
            r5 = 2
            int r4 = r4 * 2
            int r4 = r4 - r15
        L_0x0089:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r8.c = r6
            int r4 = r4 - r5
            int r4 = r4 << r15
            long r4 = (long) r4
            r8.b = r4
            long r4 = a(r10, r12)
            r16 = r4
            long r4 = r8.b
            long r4 = a(r10, r4)
            defpackage.wzh.b(r6, r4, r9)
            long r4 = a(r12)
            defpackage.wzh.b(r14, r4, r6)
            long r0 = r10 - r0
            long r2 = r2 - r0
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d0
            long r0 = java.lang.Math.min(r12, r2)
            long r0 = r0 + r10
            r8.c(r0)
            java.lang.Object r0 = m
            r1 = r16
            defpackage.wzh.b(r14, r1, r0)
            r0 = 2
            long r4 = r10 + r0
            sun.misc.Unsafe r0 = defpackage.wzg.a
            long r2 = j
            r1 = r22
            r0.putOrderedLong(r1, r2, r4)
            return r15
        L_0x00d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00dc:
            return r20
        L_0x00dd:
            r15 = 1
        L_0x00de:
            r0 = 2
            long r0 = r0 + r10
            boolean r0 = r8.b(r10, r0)
            if (r0 != 0) goto L_0x00e9
            goto L_0x0006
        L_0x00e9:
            long r0 = a(r10, r12)
            defpackage.wzh.b(r14, r0, r9)
            return r15
        L_0x00f1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            goto L_0x00f8
        L_0x00f7:
            throw r0
        L_0x00f8:
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyr.offer(java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E peek() {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.g
            long r1 = r11.h
            long r3 = r11.f
            long r5 = a(r1, r3)
            java.lang.Object r7 = defpackage.wzh.a(r0, r5)
            if (r7 != 0) goto L_0x001e
            long r8 = r11.a()
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x001e
        L_0x0018:
            java.lang.Object r7 = defpackage.wzh.a(r0, r5)
            if (r7 == 0) goto L_0x0018
        L_0x001e:
            java.lang.Object r5 = m
            if (r7 != r5) goto L_0x0039
            java.lang.Object[] r0 = r11.a((E[]) r0, r3)
            long r1 = r11.b((E[]) r0, r1)
            java.lang.Object r0 = defpackage.wzh.a(r0, r1)
            if (r0 == 0) goto L_0x0031
            return r0
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "new buffer must have at least one element"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyr.peek():java.lang.Object");
    }

    public final E poll() {
        Object[] objArr = this.g;
        long j2 = this.h;
        long j3 = this.f;
        long a = a(j2, j3);
        E a2 = wzh.a(objArr, a);
        if (a2 == null) {
            if (j2 == a()) {
                return null;
            }
            do {
                a2 = wzh.a(objArr, a);
            } while (a2 == null);
        }
        if (a2 == m) {
            Object[] a3 = a((E[]) objArr, j3);
            long b = b((E[]) a3, j2);
            E a4 = wzh.a(a3, b);
            if (a4 != null) {
                wzh.b(a3, b, null);
                b(j2 + 2);
                return a4;
            }
            throw new IllegalStateException("new buffer must have at least one element");
        }
        wzh.b(objArr, a, null);
        b(j2 + 2);
        return a2;
    }

    public final int size() {
        long b = b();
        while (true) {
            long a = a();
            long b2 = b();
            if (b == b2) {
                return ((int) (a - b2)) >> 1;
            }
            b = b2;
        }
    }
}
