package defpackage;

import android.graphics.Matrix;

/* renamed from: tru reason: default package */
public final class tru {
    public static Matrix a(float f, float f2, float f3, float f4) {
        float f5;
        float max = Math.max(f3 / f, f4 / f2);
        float f6 = f * max;
        float f7 = f2 * max;
        float f8 = 0.0f;
        if (f6 > f3) {
            f8 = (f3 - f6) / 2.0f;
        } else if (f7 > f4) {
            f5 = (f4 - f7) / 2.0f;
            Matrix matrix = new Matrix();
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(f8, f5);
            return matrix;
        }
        f5 = 0.0f;
        Matrix matrix2 = new Matrix();
        matrix2.reset();
        matrix2.postScale(max, max);
        matrix2.postTranslate(f8, f5);
        return matrix2;
    }
}
