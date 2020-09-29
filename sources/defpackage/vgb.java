package defpackage;

/* renamed from: vgb reason: default package */
public final class vgb {
    public static int a(int i, int i2, int i3, int i4, int i5) {
        return a(i, 3, i3, i4, i5, 1.0f);
    }

    public static int a(int i, int i2, int i3, int i4, int i5, float f) {
        float f2 = (float) i;
        float f3 = f2 / ((float) (((int) (((float) (i3 - i4)) * f)) + i5));
        float f4 = (float) ((int) f3);
        float f5 = f3 - f4;
        if (f5 < 0.2f) {
            f3 = f4 + 0.2f;
        } else if (f5 > 0.8f) {
            f3 = ((float) ((int) (f3 + 1.0f))) + 0.2f;
        }
        return ((int) (((float) (((int) (f2 / Math.max(f3, ((float) (i2 - 1)) + 0.2f))) - i5)) * (1.0f / f))) + i4;
    }
}
