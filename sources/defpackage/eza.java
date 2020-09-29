package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: eza reason: default package */
public final class eza implements TypeEvaluator<Matrix> {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Matrix matrix = (Matrix) obj2;
        ((Matrix) obj).getValues(this.a);
        matrix.getValues(this.b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.b;
            float f2 = fArr[i];
            float[] fArr2 = this.a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.c.setValues(this.b);
        return this.c;
    }
}
