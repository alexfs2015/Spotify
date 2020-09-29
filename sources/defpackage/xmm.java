package defpackage;

import java.util.Iterator;

/* renamed from: xmm reason: default package */
public abstract class xmm<E> extends xmn<E> {
    private static int c = Integer.getInteger("sparse.shift", 0).intValue();
    private static final long d = ((long) (xnm.a.arrayBaseOffset(Object[].class) + (32 << (e - c))));
    private static final int e;
    protected final long a;
    protected final E[] b;

    static {
        int arrayIndexScale = xnm.a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            e = c + 2;
        } else if (8 == arrayIndexScale) {
            e = c + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }

    public xmm(int i) {
        int a2 = xmp.a(i);
        this.a = (long) (a2 - 1);
        this.b = (Object[]) new Object[((a2 << c) + 64)];
    }

    protected static E a(E[] eArr, long j) {
        return xnm.a.getObjectVolatile(eArr, j);
    }

    protected static void a(E[] eArr, long j, E e2) {
        xnm.a.putOrderedObject(eArr, j, e2);
    }

    /* access modifiers changed from: protected */
    public final long a(long j) {
        return d + ((j & this.a) << e);
    }

    /* access modifiers changed from: protected */
    public final E b(long j) {
        return a(this.b, j);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
