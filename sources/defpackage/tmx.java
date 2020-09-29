package defpackage;

/* renamed from: tmx reason: default package */
public final class tmx {
    public static int a(boolean z, boolean z2, int i, int i2) {
        if (z || i2 == 0) {
            return 2;
        }
        return (i2 < 0 || (!z2 && i - i2 <= 0)) ? 0 : 1;
    }
}
