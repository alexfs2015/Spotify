package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: srt reason: default package */
final class srt extends CharacterStyle implements UpdateAppearance {
    private final int a;
    private long b;
    private final float c;

    public srt(Context context, int i) {
        this.c = (float) vfj.b(3.8f, context.getResources());
        this.a = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (this.b == 0) {
            this.b = SystemClock.uptimeMillis();
        }
        float uptimeMillis = (float) (SystemClock.uptimeMillis() - this.b);
        float f = ((float) this.a) * 100.0f;
        if (uptimeMillis > f) {
            double d = (double) this.c;
            double sin = Math.sin((double) ((uptimeMillis * 0.005f) + f)) + 1.0d;
            Double.isNaN(d);
            textPaint.baselineShift = (int) (-((float) ((d * sin) / 2.0d)));
            return;
        }
        textPaint.baselineShift = 0;
    }
}
