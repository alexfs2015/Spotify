package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: qh reason: default package */
public final class qh implements TypeEvaluator<float[]> {
    private float[] a;

    public qh(float[] fArr) {
        this.a = fArr;
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
