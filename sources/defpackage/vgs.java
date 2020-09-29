package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: vgs reason: default package */
public final class vgs extends Drawable implements Animatable, Runnable {
    private long a;
    private long b = 500;
    private Drawable c;
    private Drawable d;
    private ColorFilter e;

    private void a(Canvas canvas, Drawable drawable) {
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int save = canvas.save();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        float f = (float) intrinsicWidth;
        float f2 = (float) intrinsicHeight;
        float width = f / f2 < ((float) bounds.width()) / ((float) bounds.height()) ? ((float) bounds.width()) / f : ((float) bounds.height()) / f2;
        canvas.translate((float) bounds.centerX(), (float) bounds.centerY());
        canvas.scale(width, width);
        canvas.translate(((float) (-intrinsicWidth)) / 2.0f, ((float) (-intrinsicHeight)) / 2.0f);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final void a(Drawable drawable, boolean z) {
        stop();
        this.c = this.d;
        this.d = drawable;
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            this.d.setBounds(0, 0, drawable3.getIntrinsicWidth(), this.d.getIntrinsicHeight());
            this.d.setColorFilter(this.e);
        }
        if (z) {
            start();
            return;
        }
        setLevel(255);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        int level = getLevel();
        if (isRunning()) {
            Drawable drawable = this.c;
            if (drawable != null) {
                if (this.d == null) {
                    drawable.setAlpha(255 - level);
                }
                a(canvas, this.c);
            }
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setAlpha(level);
            a(canvas, this.d);
        }
        canvas.restoreToCount(save);
        if (level == 255) {
            stop();
        }
    }

    public final int getOpacity() {
        Drawable drawable = this.c;
        int i = -2;
        int opacity = drawable != null ? drawable.getOpacity() : -2;
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            i = drawable2.getOpacity();
        }
        return resolveOpacity(opacity, i);
    }

    public final boolean isRunning() {
        return this.a > 0;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return true;
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        setLevel((int) ((Math.min(uptimeMillis - this.a, this.b) * 255) / this.b));
        invalidateSelf();
        scheduleSelf(this, uptimeMillis + 16);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e = colorFilter;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            unscheduleSelf(this);
        } else if (visible || z2) {
            this.a = 0;
            scheduleSelf(this, SystemClock.uptimeMillis());
        }
        return visible;
    }

    public final void start() {
        if (!isRunning()) {
            this.a = SystemClock.uptimeMillis();
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAlpha(255);
            }
            scheduleSelf(this, this.a);
        }
    }

    public final void stop() {
        if (isRunning()) {
            this.a = 0;
            unscheduleSelf(this);
        }
    }
}
