package defpackage;

/* renamed from: ryy reason: default package */
public final class ryy extends mp {
    private final gmk e;

    public ryy(gmk gmk, float f) {
        super(2, 30, a(Float.valueOf(f)));
        this.e = gmk;
    }

    static int a(Float f) {
        return Math.round(f.floatValue() * 30.0f);
    }

    public final void b(int i) {
        this.e.a(Float.valueOf(((float) i) / 30.0f));
        a(i);
    }

    public final void c(int i) {
        int i2 = this.c;
        if (i == -1) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            b(i3);
        } else if (i == 1) {
            int i4 = i2 + 1;
            int i5 = 30;
            if (i4 <= 30) {
                i5 = i4;
            }
            b(i5);
        }
    }
}
