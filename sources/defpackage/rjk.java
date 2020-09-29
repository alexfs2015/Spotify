package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: rjk reason: default package */
public final class rjk extends Drawable {
    private final int a;
    private int b;
    private final Paint c = new Paint(1);
    private final RectF d = new RectF();

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public rjk(Resources resources, int i) {
        this.a = resources.getDimensionPixelSize(i);
        this.b = -14211289;
    }

    public final void draw(Canvas canvas) {
        this.c.setColor(this.b);
        this.d.set(0.0f, 0.0f, (float) getBounds().width(), (float) getBounds().height());
        RectF rectF = this.d;
        int i = this.a;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.c);
    }
}
