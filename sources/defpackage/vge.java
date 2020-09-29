package defpackage;

/* renamed from: vge reason: default package */
public final class vge {
    public static float a(float f, float f2, float f3) {
        if (f > f2) {
            float f4 = f2;
            f2 = f;
            f = f4;
        }
        return f3 <= f ? f : f3 >= f2 ? f2 : f3;
    }

    public static float a(float f, float f2, float f3, float f4, float f5) {
        return c(f3, f4, b(f, f2, f5));
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i, Math.min(i3, i2));
    }

    public static float b(float f, float f2, float f3) {
        float f4 = f2 - f;
        if (f4 == 0.0f) {
            f4 = 1.0f / f2;
        }
        return (f3 - f) / f4;
    }

    public static float c(float f, float f2, float f3) {
        return (f * (1.0f - f3)) + (f2 * f3);
    }
}
