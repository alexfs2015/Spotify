package defpackage;

import android.graphics.Color;

/* renamed from: vgp reason: default package */
public final class vgp {
    public static int a(int i, float f) {
        return gd.a(Color.argb(102, 0, 0, 0), i);
    }

    public static vgo a(final int i) {
        return new vgo() {
            public final int interpolate(float f) {
                return i;
            }
        };
    }

    public static vgo a(int i, int i2) {
        return new vgn(i, i2);
    }

    private static float b(int i) {
        float f = ((float) i) / 255.0f;
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        double d = (double) f;
        Double.isNaN(d);
        return (float) Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float b(int i, int i2) {
        float c = (c(i) + 0.05f) / (c(i2) + 0.05f);
        return c < 1.0f ? 1.0f / c : c;
    }

    private static float c(int i) {
        return (b((i >> 16) & 255) * 0.2126f) + (b((i >> 8) & 255) * 0.7152f) + (b(i & 255) * 0.0722f);
    }
}
