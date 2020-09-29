package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.shapes.RectShape;

/* renamed from: jsv reason: default package */
public final class jsv extends PaintDrawable {
    public jsv(final int[] iArr, final float[] fArr) {
        AnonymousClass1 r0 = new ShaderFactory() {
            public final Shader resize(int i, int i2) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, iArr, fArr, TileMode.REPEAT);
                return linearGradient;
            }
        };
        setShape(new RectShape());
        setShaderFactory(r0);
    }
}
