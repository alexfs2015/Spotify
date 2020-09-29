package defpackage;

/* renamed from: wzh reason: default package */
public final class wzh {
    public static final long a = ((long) wzg.a.arrayBaseOffset(Object[].class));
    public static final int b;

    static {
        int arrayIndexScale = wzg.a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            b = 2;
        } else if (8 == arrayIndexScale) {
            b = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }

    public static <E> E a(E[] eArr, long j) {
        return wzg.a.getObjectVolatile(eArr, j);
    }

    public static <E> void a(E[] eArr, long j, E e) {
        wzg.a.putObject(eArr, j, null);
    }

    public static <E> void b(E[] eArr, long j, E e) {
        wzg.a.putOrderedObject(eArr, j, e);
    }
}
