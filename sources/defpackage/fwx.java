package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: fwx reason: default package */
public final class fwx extends Drawable implements fww {
    public boolean a;
    private Drawable b;
    private Drawable c;

    static {
        new Property<fwx, Float>(Float.class, "fraction") {
            public final /* synthetic */ Object get(Object obj) {
                return Float.valueOf(((float) ((fwx) obj).getLevel()) / 255.0f);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                ((fwx) obj).a(((Float) obj2).floatValue());
            }
        };
    }

    private void a(Canvas canvas, Drawable drawable) {
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int save = canvas.save();
        if (intrinsicWidth < 0 || intrinsicHeight < 0) {
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        float f = (float) intrinsicWidth;
        float f2 = (float) intrinsicHeight;
        float width = f / f2 < ((float) bounds.width()) / ((float) bounds.height()) ? ((float) bounds.width()) / f : ((float) bounds.height()) / f2;
        float f3 = 0.0f;
        canvas.translate((float) bounds.centerX(), this.a ? 0.0f : (float) bounds.centerY());
        canvas.scale(width, width);
        float f4 = ((float) (-intrinsicWidth)) / 2.0f;
        if (!this.a) {
            f3 = ((float) (-intrinsicHeight)) / 2.0f;
        }
        canvas.translate(f4, f3);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final void a(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            setLevel((int) (f * 255.0f));
            invalidateSelf();
        }
    }

    public final void a(int i, float f) {
        a(f);
    }

    public final void a(Drawable drawable, Drawable drawable2) {
        this.b = drawable;
        this.c = drawable2;
        Drawable drawable3 = this.b;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
            Drawable drawable4 = this.b;
            drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), this.b.getIntrinsicHeight());
        }
        Drawable drawable5 = this.c;
        if (drawable5 != null) {
            drawable5.setBounds(0, 0, drawable5.getIntrinsicWidth(), this.c.getIntrinsicHeight());
        }
        setLevel(0);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        int level = getLevel();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(255 - level);
            a(canvas, this.b);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setAlpha(level);
            a(canvas, this.c);
        }
        canvas.restoreToCount(save);
    }

    public final int getOpacity() {
        Drawable drawable = this.b;
        int i = -2;
        int opacity = drawable != null ? drawable.getOpacity() : -2;
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            i = drawable2.getOpacity();
        }
        return resolveOpacity(opacity, i);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }
}
