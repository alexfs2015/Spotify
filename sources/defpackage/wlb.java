package defpackage;

/* renamed from: wlb reason: default package */
public final class wlb {
    public static final long a = ((long) wla.a.arrayBaseOffset(Object[].class));
    public static final int b;

    static {
        int arrayIndexScale = wla.a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            b = 2;
        } else if (8 == arrayIndexScale) {
            b = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }

    public static <E> void a(E[] eArr, long j, E e) {
        wla.a.putObject(eArr, j, null);
    }

    public static <E> void b(E[] eArr, long j, E e) {
        wla.a.putOrderedObject(eArr, j, e);
    }

    public static <E> E a(E[] eArr, long j) {
        return wla.a.getObjectVolatile(eArr, j);
    }
}
