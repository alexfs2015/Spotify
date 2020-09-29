package defpackage;

/* renamed from: ezu reason: default package */
public final class ezu {
    public static float a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    private static float b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    public static boolean b(float f, float f2, float f3) {
        return f + 1.0E-4f >= f2;
    }

    private static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    public static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        return b(a(f, f2, 0.0f, 0.0f), a(f, f2, f5, 0.0f), a(f, f2, f5, f6), a(f, f2, 0.0f, f6));
    }
}
