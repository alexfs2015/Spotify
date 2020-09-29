package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: vgr reason: default package */
public final class vgr extends Drawable {
    private final Drawable a;
    private final float b;
    private final Paint c = new Paint(1);
    private final Paint d = new Paint(1);
    private ColorStateList e;
    private ColorStateList f;
    private int g = 255;
    private int h;
    private int i;

    public vgr(Drawable drawable, float f2) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            throw new IllegalArgumentException("Drawables without intrinsic size are not supported.");
        }
        this.a = drawable.mutate();
        this.b = f2;
        this.d.setStyle(Style.FILL);
        this.c.setStyle(Style.STROKE);
        this.c.setStrokeWidth(0.0f);
    }

    private void a() {
        this.c.setAlpha((Color.alpha(this.h) * this.g) / 255);
        this.d.setAlpha((Color.alpha(this.i) * this.g) / 255);
    }

    private int b() {
        return (int) (((float) Math.max(this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight())) / this.b);
    }

    public final void a(float f2) {
        if (f2 >= 0.0f) {
            this.c.setStrokeWidth(f2);
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Negative strokeWidth is not supported.");
    }

    public final void a(int i2) {
        this.f = ColorStateList.valueOf(i2);
        this.d.setColor(i2);
        this.i = i2;
        a();
        invalidateSelf();
    }

    public final void a(ColorStateList colorStateList) {
        this.f = colorStateList;
        onStateChange(getState());
        invalidateSelf();
    }

    public final void b(int i2) {
        this.a.setColorFilter(i2, Mode.SRC_ATOP);
        invalidateSelf();
    }

    public final void b(ColorStateList colorStateList) {
        this.e = colorStateList;
        onStateChange(getState());
        invalidateSelf();
    }

    public final void c(int i2) {
        this.e = ColorStateList.valueOf(i2);
        this.c.setColor(i2);
        this.h = i2;
        a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.translate(bounds.exactCenterX(), bounds.exactCenterY());
        float min = (float) Math.min(bounds.width(), bounds.height());
        float strokeWidth = (min / 2.0f) - (this.c.getStrokeWidth() / 2.0f);
        canvas.drawCircle(0.0f, 0.0f, strokeWidth, this.d);
        if (this.c.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(0.0f, 0.0f, strokeWidth, this.c);
        }
        int intrinsicWidth = this.a.getIntrinsicWidth();
        int intrinsicHeight = this.a.getIntrinsicHeight();
        float max = min / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        canvas.scale(max, max);
        float f2 = this.b;
        canvas.scale(f2, f2);
        canvas.translate(((float) (-intrinsicWidth)) / 2.0f, ((float) (-intrinsicHeight)) / 2.0f);
        this.a.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final int getIntrinsicHeight() {
        return b();
    }

    public final int getIntrinsicWidth() {
        return b();
    }

    public final int getOpacity() {
        int alpha = this.d.getAlpha();
        char c2 = alpha == 0 ? 65534 : alpha == 255 ? (char) 65535 : 65533;
        if (c2 == 65535) {
            return -1;
        }
        if (c2 == 65533) {
            return -3;
        }
        return this.a.getOpacity();
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.e;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !this.a.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean state = this.a.isStateful() ? this.a.setState(iArr) | false : false;
        if (this.f != null) {
            int color = this.d.getColor();
            int colorForState = this.f.getColorForState(iArr, color);
            this.d.setColor(colorForState);
            this.i = colorForState;
            state = colorForState != color;
        }
        if (this.e != null) {
            int color2 = this.c.getColor();
            int colorForState2 = this.e.getColorForState(iArr, color2);
            this.c.setColor(colorForState2);
            this.h = colorForState2;
            state |= colorForState2 != color2;
        }
        a();
        if (!state) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i2) {
        this.g = i2;
        a();
        this.a.setAlpha(i2);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
