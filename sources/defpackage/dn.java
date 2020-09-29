package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: dn reason: default package */
final class dn extends Drawable {
    float a;
    float b;
    boolean c = false;
    boolean d = true;
    private final Paint e;
    private final RectF f;
    private final Rect g;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private Mode k = Mode.SRC_IN;

    public final int getOpacity() {
        return -3;
    }

    dn(ColorStateList colorStateList, float f2) {
        this.a = f2;
        this.e = new Paint(5);
        a(colorStateList);
        this.f = new RectF();
        this.g = new Rect();
    }

    /* access modifiers changed from: 0000 */
    public void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.e.setColor(this.h.getColorForState(getState(), this.h.getDefaultColor()));
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.e;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.f;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.g.set(rect);
        if (this.c) {
            float a2 = C0091do.a(this.b, this.a, this.d);
            this.g.inset((int) Math.ceil((double) C0091do.b(this.b, this.a, this.d)), (int) Math.ceil((double) a2));
            this.f.set(this.g);
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.g, this.a);
    }

    public final void setAlpha(int i2) {
        this.e.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.e.getColor();
        if (z) {
            this.e.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 != null) {
            Mode mode = this.k;
            if (mode != null) {
                this.i = a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.h;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
