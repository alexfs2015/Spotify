package defpackage;

import java.util.Iterator;

/* renamed from: wyh reason: default package */
public abstract class wyh<E> extends wyi<E> {
    private static int c = Integer.getInteger("sparse.shift", 0).intValue();
    private static final long d = ((long) (wzh.a.arrayBaseOffset(Object[].class) + (32 << (e - c))));
    private static final int e;
    protected final long a;
    protected final E[] b;

    static {
        int arrayIndexScale = wzh.a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            e = c + 2;
        } else if (8 == arrayIndexScale) {
            e = c + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }

    public wyh(int i) {
        int a2 = wyk.a(i);
        this.a = (long) (a2 - 1);
        this.b = (Object[]) new Object[((a2 << c) + 64)];
    }

    /* access modifiers changed from: protected */
    public final long a(long j) {
        return d + ((j & this.a) << e);
    }

    protected static void a(E[] eArr, long j, E e2) {
        wzh.a.putOrderedObject(eArr, j, e2);
    }

    /* access modifiers changed from: protected */
    public final E b(long j) {
        return a(this.b, j);
    }

    protected static E a(E[] eArr, long j) {
        return wzh.a.getObjectVolatile(eArr, j);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}
