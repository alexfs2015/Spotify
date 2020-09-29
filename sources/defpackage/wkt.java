package defpackage;

/* renamed from: wkt reason: default package */
public final class wkt {
    private static int a = Integer.getInteger("io.netty.util.internal.shaded.org.jctools.sparse.shift", 0).intValue();
    private static final long b = wks.b;
    private static final int c = (wlb.b + a);

    public static <E> E[] a(int i) {
        return (Object[]) new Object[((i << a) + (wks.a << 1))];
    }

    public static long a(long j, long j2) {
        return b + ((j & j2) << c);
    }
}
