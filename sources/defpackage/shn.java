package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: shn reason: default package */
final class shn extends CharacterStyle implements UpdateAppearance {
    private static final int[] a = {-391417, -13310, -1024, -16334786, -16744961, -4977209};
    private static final Shader b;
    private final Matrix c = new Matrix();
    private long d;

    shn() {
    }

    static {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, a, null, TileMode.MIRROR);
        b = linearGradient;
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (this.d == 0) {
            this.d = SystemClock.uptimeMillis();
        }
        float uptimeMillis = (float) (SystemClock.uptimeMillis() - this.d);
        this.c.reset();
        this.c.postScale(100.0f, 1.0f);
        this.c.postTranslate(uptimeMillis * 0.1f, 0.0f);
        b.setLocalMatrix(this.c);
        textPaint.setShader(b);
    }
}
