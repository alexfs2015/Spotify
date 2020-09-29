package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: jqf reason: default package */
public final class jqf extends Drawable {
    private final Paint a = new Paint(1);
    private final Paint b = new Paint(1);

    public final int getOpacity() {
        return -3;
    }

    public jqf(int i, int i2, int i3) {
        this.a.setColor(i);
        this.a.setStyle(Style.FILL);
        this.b.setColor(i2);
        this.b.setStyle(Style.STROKE);
        this.b.setStrokeWidth((float) i3);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = ((float) (bounds.left + bounds.right)) / 2.0f;
        float f2 = ((float) (bounds.top + bounds.bottom)) / 2.0f;
        float f3 = ((float) (bounds.right - bounds.left)) / 2.0f;
        canvas.drawCircle(f, f2, f3, this.a);
        canvas.drawCircle(f, f2, f3, this.b);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
