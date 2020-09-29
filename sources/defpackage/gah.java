package defpackage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: gah reason: default package */
public final class gah extends b {
    private final int c = 0;
    private final int d = -1;

    public gah(int i, int i2) {
        super(16);
    }

    private static void a(FloatBuffer floatBuffer, int i, float f, float f2) {
        int i2 = i << 2;
        floatBuffer.put(i2, f);
        floatBuffer.put(i2 + 1, f2);
    }

    private static void b(FloatBuffer floatBuffer, int i, float f, float f2) {
        int i2 = (i << 2) + 2;
        floatBuffer.put(i2, f);
        floatBuffer.put(i2 + 1, f2);
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        FloatBuffer c2 = c();
        a(c2, 0, -1.0f, 1.0f);
        b(c2, 0, 0.0f, 0.0f);
        a(c2, 1, -1.0f, -1.0f);
        b(c2, 1, 0.0f, 0.0f);
        a(c2, 2, 1.0f, 1.0f);
        b(c2, 2, 0.0f, 0.0f);
        a(c2, 3, 1.0f, -1.0f);
        b(c2, 3, 0.0f, 0.0f);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(this.c, 2, 4, 0);
        GLES20.glEnableVertexAttribArray(this.c);
        int i = this.d;
        if (i >= 0) {
            a(i, 2, 4, 2);
            GLES20.glEnableVertexAttribArray(this.d);
        }
    }
}
