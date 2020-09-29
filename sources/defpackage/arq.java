package defpackage;

/* renamed from: arq reason: default package */
public final class arq {
    public static final int a = bdw.g("RIFF");
    public static final int b = bdw.g("WAVE");
    public static final int c = bdw.g("fmt ");

    static {
        bdw.g("data");
    }

    public static int a(int i, int i2) {
        if (i != 1) {
            if (i == 3) {
                return i2 == 32 ? 4 : 0;
            }
            if (i != 65534) {
                if (i != 6) {
                    return i != 7 ? 0 : 268435456;
                }
                return 536870912;
            }
        }
        return bdw.b(i2);
    }
}
