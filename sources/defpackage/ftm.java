package defpackage;

/* renamed from: ftm reason: default package */
public final class ftm {
    static {
        new ftl() {
            public final boolean a(int i) {
                return true;
            }
        };
    }

    public static ftl a(final int... iArr) {
        return new ftl() {
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
