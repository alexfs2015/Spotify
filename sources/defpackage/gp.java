package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: gp reason: default package */
class gp extends Drawable implements Callback, gn, go {
    static final Mode a = Mode.SRC_IN;
    Drawable b;
    private int c;
    private Mode d;
    private boolean e;
    private gr f;
    private boolean g;

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    gp(gr grVar, Resources resources) {
        this.f = grVar;
        gr grVar2 = this.f;
        if (grVar2 != null && grVar2.b != null) {
            a(this.f.b.newDrawable(resources));
        }
    }

    gp(Drawable drawable) {
        this.f = c();
        a(drawable);
    }

    public void jumpToCurrentState() {
        this.b.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.b.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.b.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        gr grVar = this.f;
        return changingConfigurations | (grVar != null ? grVar.getChangingConfigurations() : 0) | this.b.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.b.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (b()) {
            gr grVar = this.f;
            if (grVar != null) {
                colorStateList = grVar.c;
                return (colorStateList == null && colorStateList.isStateful()) || this.b.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.b.setState(iArr);
    }

    public int[] getState() {
        return this.b.getState();
    }

    public Drawable getCurrent() {
        return this.b.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.b.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.b.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.b.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.b.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.b.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.b.getPadding(rect);
    }

    public void setAutoMirrored(boolean z) {
        this.b.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.b.isAutoMirrored();
    }

    public ConstantState getConstantState() {
        gr grVar = this.f;
        if (grVar != null) {
            if (grVar.b != null) {
                this.f.a = getChangingConfigurations();
                return this.f;
            }
        }
        return null;
    }

    public Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.f = c();
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.mutate();
            }
            gr grVar = this.f;
            if (grVar != null) {
                Drawable drawable2 = this.b;
                grVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    private gr c() {
        return new gr(this.f);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.b.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f.c = colorStateList;
        a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f.d = mode;
        a(getState());
    }

    private boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        ColorStateList colorStateList = this.f.c;
        Mode mode = this.f.d;
        if (colorStateList == null || mode == null) {
            this.e = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.e && colorForState == this.c && mode == this.d)) {
                setColorFilter(colorForState, mode);
                this.c = colorForState;
                this.d = mode;
                this.e = true;
                return true;
            }
        }
        return false;
    }

    public final Drawable a() {
        return this.b;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            gr grVar = this.f;
            if (grVar != null) {
                grVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
