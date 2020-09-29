package com.spotify.paste.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class BadgedDrawable extends Drawable {
    public static final BadgePosition a = BadgePosition.BOTTOM_RIGHT;
    private final BadgePosition b;
    private final int c;
    private final int d;
    private final Drawable e;
    private final Drawable f;
    private final boolean g;
    private final Rect h;
    private final Matrix i = new Matrix();
    private final Matrix j = new Matrix();

    public enum BadgePosition {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public static final class a {
        public BadgePosition a = BadgedDrawable.a;
        public int b = -1;
        public int c = -1;
        public int d;
        public int e;
        public boolean f;
    }

    public BadgedDrawable(Drawable drawable, Drawable drawable2, a aVar) {
        if (drawable == null) {
            throw new NullPointerException("null drawable");
        } else if (drawable2 == null) {
            throw new NullPointerException("null badge");
        } else if (aVar == null) {
            throw new NullPointerException("null badge params");
        } else if (aVar.a != null) {
            this.e = drawable;
            this.f = drawable2;
            this.b = aVar.a;
            this.d = aVar.e;
            this.c = aVar.d;
            this.h = new Rect(0, 0, a(aVar.b, drawable2.getIntrinsicWidth()), a(aVar.c, drawable2.getIntrinsicHeight()));
            this.g = aVar.f;
        } else {
            throw new NullPointerException("null position");
        }
    }

    private static void a(Drawable drawable, Rect rect, Matrix matrix, boolean z) {
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        matrix.reset();
        if (z || intrinsicHeight < 0 || intrinsicWidth < 0) {
            drawable.setBounds(rect);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            rectF.set(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight);
            rectF2.set(rect);
            if (!rectF.equals(rectF2)) {
                matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
                matrix.mapRect(rectF);
                float max = Math.max(rectF2.width() / rectF.width(), rectF2.height() / rectF.height());
                matrix.postScale(max, max, rectF2.centerX(), rectF2.centerY());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        int i2;
        int i3;
        boolean z = true;
        a(this.e, rect, this.i, !this.g);
        boolean z2 = this.b == BadgePosition.BOTTOM_LEFT || this.b == BadgePosition.TOP_LEFT;
        if (!(this.b == BadgePosition.TOP_LEFT || this.b == BadgePosition.TOP_RIGHT)) {
            z = false;
        }
        Rect rect2 = this.h;
        if (z2) {
            i2 = this.d;
        } else {
            i2 = (rect.right - this.d) - this.h.width();
        }
        if (z) {
            i3 = this.c;
        } else {
            i3 = (rect.bottom - this.c) - this.h.height();
        }
        rect2.offsetTo(i2, i3);
        a(this.f, this.h, this.j, false);
    }

    public final void draw(Canvas canvas) {
        a(canvas, this.e, this.i);
        a(canvas, this.f, this.j);
    }

    private static void a(Canvas canvas, Drawable drawable, Matrix matrix) {
        if (!matrix.isIdentity()) {
            int save = canvas.save();
            canvas.concat(matrix);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        drawable.draw(canvas);
    }

    public final void setAlpha(int i2) {
        this.e.setAlpha(i2);
        this.f.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return resolveOpacity(this.e.getOpacity(), this.f.getOpacity());
    }

    public final int getIntrinsicWidth() {
        if (this.g) {
            return -1;
        }
        return this.e.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        if (this.g) {
            return -1;
        }
        return this.e.getIntrinsicHeight();
    }

    private static int a(int i2, int i3) {
        if (i2 >= 0) {
            return i2;
        }
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException("The drawable has no intrinsic measures, set them manually.");
    }

    public static a a() {
        return new a();
    }
}
