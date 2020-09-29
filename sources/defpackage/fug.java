package defpackage;

/* renamed from: fug reason: default package */
public final class fug {
    static {
        new fuf() {
            public final boolean a(int i) {
                return true;
            }
        };
    }

    public static fuf a(final int... iArr) {
        return new fuf() {
            public final boolean a(int i) {
                for (int i2 : iArr) {
                    if (i2 == i) {
                        return true;
                    }
                }
                return false;
            }
        };
    }
}
