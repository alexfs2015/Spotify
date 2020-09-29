package defpackage;

/* renamed from: abs reason: default package */
public final class abs {
    private static float a(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static int a(float f, int i, int i2) {
        float f2 = ((float) (i >>> 24)) / 255.0f;
        float f3 = ((float) ((i >> 8) & 255)) / 255.0f;
        float f4 = ((float) (i & 255)) / 255.0f;
        float f5 = ((float) (i2 >>> 24)) / 255.0f;
        float f6 = ((float) ((i2 >> 16) & 255)) / 255.0f;
        float f7 = ((float) ((i2 >> 8) & 255)) / 255.0f;
        float f8 = ((float) (i2 & 255)) / 255.0f;
        float b = b(((float) ((i >> 16) & 255)) / 255.0f);
        float b2 = b(f3);
        float b3 = b(f4);
        float b4 = b(f6);
        float b5 = b2 + ((b(f7) - b2) * f);
        float b6 = b3 + (f * (b(f8) - b3));
        float f9 = (f2 + ((f5 - f2) * f)) * 255.0f;
        return (Math.round(a(b + ((b4 - b) * f)) * 255.0f) << 16) | (Math.round(f9) << 24) | (Math.round(a(b5) * 255.0f) << 8) | Math.round(a(b6) * 255.0f);
    }
}
