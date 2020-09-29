package defpackage;

/* renamed from: wyz reason: default package */
public final class wyz {
    private static int a = Integer.getInteger("io.netty.util.internal.shaded.org.jctools.sparse.shift", 0).intValue();
    private static final long b = wyy.b;
    private static final int c = (wzh.b + a);

    public static long a(long j, long j2) {
        return b + ((j & j2) << c);
    }

    public static <E> E[] a(int i) {
        return (Object[]) new Object[((i << a) + (wyy.a << 1))];
    }
}
