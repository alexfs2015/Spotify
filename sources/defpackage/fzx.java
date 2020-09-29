package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fzx reason: default package */
public final class fzx extends ReplacementSpan {
    private final int a;
    private final Paint b;
    private final Drawable c;
    private final Rect d;

    public fzx(Context context, int i) {
        this(context, R.attr.pasteTextStyleLabel, i);
    }

    private fzx(Context context, int i, int i2) {
        this.d = new Rect();
        this.a = i2;
        TextView textView = (TextView) gat.a(context, TextView.class, null, i);
        this.b = textView.getPaint();
        this.c = textView.getBackground();
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        float f2 = f;
        canvas.save();
        Paint paint2 = paint;
        paint2.getTextBounds("X", 0, 1, this.d);
        CharSequence charSequence2 = charSequence;
        float measureText = this.b.measureText(charSequence, i, i2) + ((float) (this.a * 2));
        canvas.translate(0.0f, -this.b.descent());
        canvas.translate(0.0f, (((float) ((int) (this.b.descent() - this.b.ascent()))) - ((float) this.d.height())) / 2.0f);
        float f3 = (float) i4;
        RectF rectF = new RectF(f2, this.b.ascent() + f3, measureText + f2, this.b.descent() + f3);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
            this.c.draw(canvas);
        }
        canvas.translate((float) this.a, 0.0f);
        canvas.drawText(charSequence, i, i2, f, f3, this.b);
        canvas.restore();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            FontMetrics fontMetrics = paint.getFontMetrics();
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        return (int) (this.b.measureText(charSequence, i, i2) + ((float) (this.a << 1)));
    }
}
