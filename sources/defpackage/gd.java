package defpackage;

import android.graphics.Color;

/* renamed from: gd reason: default package */
public final class gd {
    private static final ThreadLocal<double[]> a = new ThreadLocal<>();

    private static float a(float f, float f2, float f3) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f3 ? f3 : f;
    }

    public static int a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, a(Color.red(i), alpha2, Color.red(i2), alpha, i3), a(Color.green(i), alpha2, Color.green(i2), alpha, i3), a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static double b(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = a(i, i2);
            }
            double a2 = a(i) + 0.05d;
            double a3 = a(i2) + 0.05d;
            return Math.max(a2, a3) / Math.min(a2, a3);
        }
        StringBuilder sb = new StringBuilder("background can not be translucent: #");
        sb.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(sb.toString());
    }

    public static int a(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (b(c(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (b(c(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        StringBuilder sb = new StringBuilder("background can not be translucent: #");
        sb.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(sb.toString());
    }

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f2 = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : ((f3 - f4) / f6) + 4.0f;
            f = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = a(f8, 0.0f, 360.0f);
        fArr[1] = a(f, 0.0f, 1.0f);
        fArr[2] = a(f7, 0.0f, 1.0f);
    }

    public static void a(int i, float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static int c(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int b(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    public static double a(int i) {
        double d;
        double d2;
        double d3;
        double d4;
        double[] dArr = (double[]) a.get();
        if (dArr == null) {
            dArr = new double[3];
            a.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d5 = (double) red;
            Double.isNaN(d5);
            double d6 = d5 / 255.0d;
            if (d6 < 0.04045d) {
                d = d6 / 12.92d;
            } else {
                d = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            double d7 = (double) green;
            Double.isNaN(d7);
            double d8 = d7 / 255.0d;
            if (d8 < 0.04045d) {
                d3 = d8 / 12.92d;
                d2 = 2.4d;
            } else {
                d2 = 2.4d;
                d3 = Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
            }
            double d9 = (double) blue;
            Double.isNaN(d9);
            double d10 = d9 / 255.0d;
            if (d10 < 0.04045d) {
                d4 = d10 / 12.92d;
            } else {
                d4 = Math.pow((d10 + 0.055d) / 1.055d, d2);
            }
            dArr[0] = ((0.4124d * d) + (0.3576d * d3) + (0.1805d * d4)) * 100.0d;
            dArr[1] = ((0.2126d * d) + (0.7152d * d3) + (0.0722d * d4)) * 100.0d;
            dArr[2] = ((d * 0.0193d) + (d3 * 0.1192d) + (d4 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
}
