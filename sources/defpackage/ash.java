package defpackage;

/* renamed from: ash reason: default package */
public final class ash {
    public static final int a = ben.g("RIFF");
    public static final int b = ben.g("WAVE");
    public static final int c = ben.g("fmt ");

    static {
        ben.g("data");
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
        return ben.b(i2);
    }
}
