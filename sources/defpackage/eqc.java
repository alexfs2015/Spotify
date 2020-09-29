package defpackage;

/* renamed from: eqc reason: default package */
public final class eqc {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final String[] c = new String[0];
    public static final byte[] d = new byte[0];

    public static final int a(eps eps, int i) {
        int i2 = eps.i();
        eps.b(i);
        int i3 = 1;
        while (eps.a() == i) {
            eps.b(i);
            i3++;
        }
        eps.a(i2, i);
        return i3;
    }
}
