package defpackage;

import java.util.Iterator;

/* renamed from: wzb reason: default package */
public final class wzb<E> extends wzd<E> {
    private static int g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final long h;
    private static final long i;
    private static final long j = ((long) wzh.a.arrayBaseOffset(Object[].class));
    private static final int k;
    private static final Object l = new Object();

    static {
        int arrayIndexScale = wzh.a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            k = 2;
        } else if (8 == arrayIndexScale) {
            k = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        try {
            h = wzh.a.objectFieldOffset(wzg.class.getDeclaredField("producerIndex"));
            try {
                i = wzh.a.objectFieldOffset(wzd.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e) {
                InternalError internalError = new InternalError();
                internalError.initCause(e);
                throw internalError;
            }
        } catch (NoSuchFieldException e2) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e2);
            throw internalError2;
        }
    }

    public wzb(int i2) {
        int a = wyk.a(i2);
        long j2 = (long) (a - 1);
        Object[] objArr = new Object[(a + 1)];
        this.f = objArr;
        this.e = j2;
        this.c = Math.min(a / 4, g);
        this.b = objArr;
        this.a = j2;
        this.d = j2 - 1;
        a(0);
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final boolean offer(E e) {
        E e2 = e;
        if (e2 != null) {
            Object[] objArr = this.f;
            long j2 = this.producerIndex;
            long j3 = this.e;
            long c = c(j2 & j3);
            if (j2 < this.d) {
                return a(objArr, e, j2, c);
            }
            long j4 = ((long) this.c) + j2;
            if (a(objArr, c(j4 & j3)) == null) {
                this.d = j4 - 1;
                return a(objArr, e, j2, c);
            }
            long j5 = j2 + 1;
            if (a(objArr, c(j5 & j3)) != null) {
                return a(objArr, e, j2, c);
            }
            Object[] objArr2 = new Object[objArr.length];
            this.f = objArr2;
            this.d = (j2 + j3) - 1;
            a(objArr2, c, e2);
            a(objArr, c((long) (objArr.length - 1)), objArr2);
            a(objArr, c, l);
            a(j5);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    private boolean a(E[] eArr, E e, long j2, long j3) {
        a(eArr, j3, e);
        a(j2 + 1);
        return true;
    }

    private static E[] a(E[] eArr) {
        return (Object[]) a(eArr, c((long) (eArr.length - 1)));
    }

    public final E poll() {
        Object[] objArr = this.b;
        long j2 = this.consumerIndex;
        long j3 = this.a & j2;
        long c = c(j3);
        E a = a(objArr, c);
        boolean z = a == l;
        if (a != null && !z) {
            a(objArr, c, null);
            b(j2 + 1);
            return a;
        } else if (!z) {
            return null;
        } else {
            Object[] a2 = a((E[]) objArr);
            this.b = a2;
            long c2 = c(j3);
            E a3 = a(a2, c2);
            if (a3 == null) {
                return null;
            }
            a(a2, c2, null);
            b(j2 + 1);
            return a3;
        }
    }

    public final E peek() {
        Object[] objArr = this.b;
        long j2 = this.consumerIndex & this.a;
        E a = a(objArr, c(j2));
        if (a != l) {
            return a;
        }
        Object[] a2 = a((E[]) objArr);
        this.b = a2;
        return a(a2, c(j2));
    }

    public final int size() {
        long a = a();
        while (true) {
            long longVolatile = wzh.a.getLongVolatile(this, h);
            long a2 = a();
            if (a == a2) {
                return (int) (longVolatile - a2);
            }
            a = a2;
        }
    }

    private long a() {
        return wzh.a.getLongVolatile(this, i);
    }

    private void a(long j2) {
        wzh.a.putOrderedLong(this, h, j2);
    }

    private void b(long j2) {
        wzh.a.putOrderedLong(this, i, j2);
    }

    private static long c(long j2) {
        return j + (j2 << k);
    }

    private static void a(Object[] objArr, long j2, Object obj) {
        wzh.a.putOrderedObject(objArr, j2, obj);
    }

    private static <E> Object a(E[] eArr, long j2) {
        return wzh.a.getObjectVolatile(eArr, j2);
    }
}
