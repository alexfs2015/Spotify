package defpackage;

/* renamed from: wyk reason: default package */
public final class wyk {
    public static boolean b(int i) {
        return (i & (i + -1)) == 0;
    }

    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
