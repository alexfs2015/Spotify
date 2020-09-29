package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.FloatBuffer;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: fzs reason: default package */
public final class fzs extends b {
    private static final float[] c = {-0.03f, 0.0f, -0.03f, 1.0f, 0.03f, 0.0f, 0.03f, 1.0f, -0.03f, 0.0f, -0.03f, 0.4f, 0.03f, 0.0f, 0.03f, 0.4f, -0.03f, 0.0f, -0.03f, 0.4f, 0.03f, 0.0f, 0.03f, 0.4f, -0.03f, 0.0f, -0.03f, 0.4f, 0.03f, 0.0f, 0.03f, 0.4f};
    private static final int d = 32;
    private static final int e;
    private static final int f;
    private static final int g;
    private final Random h = new SecureRandom();
    private final int i = 0;
    private final int j = 1;
    private final int k = 2;

    static {
        int i2 = d + 0;
        e = i2;
        f = i2;
        g = i2 + 1;
    }

    public final void b() {
        a(this.i, 2, 0, 0, 0);
        a(this.j, 1, 3, f, 1);
        a(this.k, 2, 3, g, 1);
    }

    private static void a(int i2, int i3, int i4, int i5, int i6) {
        a(i2, i3, i4, i5);
        GLES20.glEnableVertexAttribArray(i2);
        GLES30.glVertexAttribDivisor(i2, i6);
    }

    private void a(FloatBuffer floatBuffer, float[] fArr, float f2, int i2) {
        boolean z = true;
        fay.b(floatBuffer.capacity() == d + (i2 * 3));
        floatBuffer.position(0);
        floatBuffer.put(fArr, 0, fArr.length);
        fay.b(floatBuffer.position() == fArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            floatBuffer.put(this.h.nextFloat() * f2);
            float d2 = d() * 30.0f;
            float d3 = d() * 30.0f;
            if (Math.abs(d2) < 0.01f) {
                while (Math.abs(d3) < 0.01f) {
                    d3 = d() * 30.0f;
                }
            }
            floatBuffer.put(d2);
            floatBuffer.put(d3);
        }
        if (floatBuffer.position() != floatBuffer.capacity()) {
            z = false;
        }
        fay.b(z);
    }

    private float d() {
        return (this.h.nextFloat() * 2.0f) - 1.0f;
    }

    public fzs(int i2, int i3, int i4, float f2, int i5) {
        super(d + 192);
        a(c(), c, 0.25f, 64);
    }
}
