package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: vgv reason: default package */
public final class vgv extends ImageSpan {
    public vgv(Drawable drawable) {
        super(drawable);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        float f2 = paint.getFontMetrics().ascent;
        float f3 = paint.getFontMetrics().descent;
        canvas.translate(f, ((((float) i4) + f3) - ((f3 - f2) / 2.0f)) - (intrinsicHeight / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Drawable drawable = getDrawable();
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.ascent + ((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2);
            int i4 = ((-drawable.getBounds().height()) / 2) + i3;
            int height = (drawable.getBounds().height() / 2) + i3;
            int min = Math.min(fontMetricsInt2.ascent, i4);
            int max = Math.max(fontMetricsInt2.descent, height);
            fontMetricsInt.ascent = min;
            fontMetricsInt.descent = max;
            fontMetricsInt.top = min;
            fontMetricsInt.bottom = max;
        }
        return bounds.right;
    }
}
