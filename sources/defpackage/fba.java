package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: fba reason: default package */
public final class fba extends GradientDrawable {
    private final Paint a = new Paint(1);
    private final RectF b;
    private int c;

    public fba() {
        this.a.setStyle(Style.FILL_AND_STROKE);
        this.a.setColor(-1);
        this.a.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.b = new RectF();
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f != this.b.left || f2 != this.b.top || f3 != this.b.right || f4 != this.b.bottom) {
            this.b.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public final void a(RectF rectF) {
        a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean a() {
        return !this.b.isEmpty();
    }

    public final void draw(Canvas canvas) {
        Callback callback = getCallback();
        if (callback instanceof View) {
            ((View) callback).setLayerType(2, null);
        } else if (VERSION.SDK_INT >= 21) {
            this.c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            this.c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.b, this.a);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.c);
        }
    }
}
