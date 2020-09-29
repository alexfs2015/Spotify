package defpackage;

import android.text.TextPaint;

/* renamed from: vgg reason: default package */
public final class vgg {
    public static int a(TextPaint textPaint, int i) {
        float[] fArr = new float[10];
        textPaint.getTextWidths("0123456789", fArr);
        float f = 0.0f;
        for (int i2 = 0; i2 < 10; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
            }
        }
        return (int) ((f * ((float) i)) + 0.5f);
    }
}
