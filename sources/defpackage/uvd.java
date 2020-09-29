package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: uvd reason: default package */
public final class uvd extends Drawable {
    private final Drawable a;
    private final float b;
    private final int c;

    public uvd(Drawable drawable, float f) {
        this(drawable, f, 0);
    }

    public uvd(Drawable drawable, float f, int i) {
        this.a = drawable;
        this.b = f;
        this.c = i;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            throw new IllegalArgumentException("drawable must have an intrinsic size");
        }
        Drawable drawable2 = this.a;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.a.getIntrinsicHeight());
    }

    public final void draw(Canvas canvas) {
        int i = this.c;
        if (i != 0) {
            canvas.drawColor(i);
        }
        Rect bounds = getBounds();
        float intrinsicWidth = (float) this.a.getIntrinsicWidth();
        float intrinsicHeight = (float) this.a.getIntrinsicHeight();
        int save = canvas.save();
        canvas.translate(bounds.exactCenterX(), bounds.exactCenterY());
        float min = ((float) Math.min(bounds.width(), bounds.height())) / Math.max(intrinsicWidth, intrinsicHeight);
        canvas.scale(min, min);
        float f = this.b;
        canvas.scale(f, f);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        this.a.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final boolean isStateful() {
        return this.a.isStateful();
    }

    public final boolean setState(int[] iArr) {
        return this.a.setState(iArr);
    }

    public final int[] getState() {
        return this.a.getState();
    }

    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        return this.a.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    public final int getIntrinsicWidth() {
        return (int) (((float) this.a.getIntrinsicWidth()) / this.b);
    }

    public final int getIntrinsicHeight() {
        return (int) (((float) this.a.getIntrinsicHeight()) / this.b);
    }

    public final int getMinimumWidth() {
        return (int) (((float) this.a.getMinimumWidth()) / this.b);
    }

    public final int getMinimumHeight() {
        return (int) (((float) this.a.getMinimumHeight()) / this.b);
    }
}
