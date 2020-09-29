package defpackage;

import android.opengl.Matrix;

/* renamed from: fzm reason: default package */
public final class fzm {
    public final float[] a = new float[16];
    public final float b;
    public final float c;
    private final float d;

    public fzm(int i, int i2) {
        this.c = (float) Math.min(i, i2);
        float f = (float) i;
        float f2 = this.c;
        this.d = f / f2;
        this.b = ((float) i2) / f2;
        Matrix.orthoM(this.a, 0, 0.0f, this.d, 0.0f, this.b, -1.0f, 1.0f);
    }
}
