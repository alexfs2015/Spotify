package defpackage;

/* renamed from: xmp reason: default package */
public final class xmp {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public static boolean b(int i) {
        return (i & (i + -1)) == 0;
    }
}
