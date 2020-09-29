package defpackage;

import android.view.animation.Interpolator;

/* renamed from: kv reason: default package */
abstract class kv implements Interpolator {
    private final float[] a;
    private final float b = (1.0f / ((float) (this.a.length - 1)));

    protected kv(float[] fArr) {
        this.a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.b;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
