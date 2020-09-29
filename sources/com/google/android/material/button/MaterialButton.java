package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.spotify.music.R;

public class MaterialButton extends AppCompatButton {
    private final ezm a;
    private int b;
    private Mode c;
    private ColorStateList e;
    private Drawable f;
    private int g;
    private int h;
    private int i;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        Drawable drawable;
        super(context, attributeSet, i2);
        TypedArray a2 = faj.a(context, attributeSet, a.bo, i2, 2132017989, new int[0]);
        this.b = a2.getDimensionPixelSize(a.by, 0);
        this.c = fak.a(a2.getInt(a.bB, -1), Mode.SRC_IN);
        this.e = fam.a(getContext(), a2, a.bA);
        this.f = fam.b(getContext(), a2, a.bw);
        this.i = a2.getInteger(a.bx, 1);
        this.g = a2.getDimensionPixelSize(a.bz, 0);
        this.a = new ezm(this);
        ezm ezm = this.a;
        ezm.c = a2.getDimensionPixelOffset(a.bp, 0);
        ezm.d = a2.getDimensionPixelOffset(a.bq, 0);
        ezm.e = a2.getDimensionPixelOffset(a.br, 0);
        ezm.f = a2.getDimensionPixelOffset(a.bs, 0);
        ezm.g = a2.getDimensionPixelSize(a.bv, 0);
        ezm.h = a2.getDimensionPixelSize(a.bE, 0);
        ezm.i = fak.a(a2.getInt(a.bu, -1), Mode.SRC_IN);
        ezm.j = fam.a(ezm.b.getContext(), a2, a.bt);
        ezm.k = fam.a(ezm.b.getContext(), a2, a.bD);
        ezm.l = fam.a(ezm.b.getContext(), a2, a.bC);
        ezm.m.setStyle(Style.STROKE);
        ezm.m.setStrokeWidth((float) ezm.h);
        ezm.m.setColor(ezm.k != null ? ezm.k.getColorForState(ezm.b.getDrawableState(), 0) : 0);
        int i3 = ip.i(ezm.b);
        int paddingTop = ezm.b.getPaddingTop();
        int j = ip.j(ezm.b);
        int paddingBottom = ezm.b.getPaddingBottom();
        MaterialButton materialButton = ezm.b;
        if (ezm.a) {
            ezm.t = new GradientDrawable();
            ezm.t.setCornerRadius(((float) ezm.g) + 1.0E-5f);
            ezm.t.setColor(-1);
            ezm.a();
            ezm.u = new GradientDrawable();
            ezm.u.setCornerRadius(((float) ezm.g) + 1.0E-5f);
            ezm.u.setColor(0);
            ezm.u.setStroke(ezm.h, ezm.k);
            InsetDrawable a3 = ezm.a(new LayerDrawable(new Drawable[]{ezm.t, ezm.u}));
            ezm.v = new GradientDrawable();
            ezm.v.setCornerRadius(((float) ezm.g) + 1.0E-5f);
            ezm.v.setColor(-1);
            drawable = new ezl(fao.a(ezm.l), a3, ezm.v);
        } else {
            ezm.p = new GradientDrawable();
            ezm.p.setCornerRadius(((float) ezm.g) + 1.0E-5f);
            ezm.p.setColor(-1);
            ezm.q = gm.f(ezm.p);
            gm.a(ezm.q, ezm.j);
            if (ezm.i != null) {
                gm.a(ezm.q, ezm.i);
            }
            ezm.r = new GradientDrawable();
            ezm.r.setCornerRadius(((float) ezm.g) + 1.0E-5f);
            ezm.r.setColor(-1);
            ezm.s = gm.f(ezm.r);
            gm.a(ezm.s, ezm.l);
            drawable = ezm.a(new LayerDrawable(new Drawable[]{ezm.q, ezm.s}));
        }
        super.setBackgroundDrawable(drawable);
        ip.b(ezm.b, i3 + ezm.c, paddingTop + ezm.e, j + ezm.d, paddingBottom + ezm.f);
        a2.recycle();
        setCompoundDrawablePadding(this.b);
        c();
    }

    private void c() {
        Drawable drawable = this.f;
        if (drawable != null) {
            this.f = drawable.mutate();
            gm.a(this.f, this.e);
            Mode mode = this.c;
            if (mode != null) {
                gm.a(this.f, mode);
            }
            int i2 = this.g;
            if (i2 == 0) {
                i2 = this.f.getIntrinsicWidth();
            }
            int i3 = this.g;
            if (i3 == 0) {
                i3 = this.f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f;
            int i4 = this.h;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        jm.a(this, this.f, null, null, null);
    }

    private boolean d() {
        return !this.a.w;
    }

    public final void a(ColorStateList colorStateList) {
        if (d()) {
            ezm ezm = this.a;
            if (ezm.j != colorStateList) {
                ezm.j = colorStateList;
                if (ezm.a) {
                    ezm.a();
                } else if (ezm.q != null) {
                    gm.a(ezm.q, ezm.j);
                }
            }
            return;
        }
        super.a(colorStateList);
    }

    public final void a(Mode mode) {
        if (d()) {
            ezm ezm = this.a;
            if (ezm.i != mode) {
                ezm.i = mode;
                if (ezm.a) {
                    ezm.a();
                } else if (!(ezm.q == null || ezm.i == null)) {
                    gm.a(ezm.q, ezm.i);
                }
            }
            return;
        }
        super.a(mode);
    }

    public final Mode b() {
        return d() ? this.a.i : super.b();
    }

    public final ColorStateList b_() {
        return d() ? this.a.j : super.b_();
    }

    public ColorStateList getBackgroundTintList() {
        return b_();
    }

    public Mode getBackgroundTintMode() {
        return b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT < 21 && d()) {
            ezm ezm = this.a;
            if (canvas != null && ezm.k != null && ezm.h > 0) {
                ezm.n.set(ezm.b.getBackground().getBounds());
                ezm.o.set(((float) ezm.n.left) + (((float) ezm.h) / 2.0f) + ((float) ezm.c), ((float) ezm.n.top) + (((float) ezm.h) / 2.0f) + ((float) ezm.e), (((float) ezm.n.right) - (((float) ezm.h) / 2.0f)) - ((float) ezm.d), (((float) ezm.n.bottom) - (((float) ezm.h) / 2.0f)) - ((float) ezm.f));
                float f2 = ((float) ezm.g) - (((float) ezm.h) / 2.0f);
                canvas.drawRoundRect(ezm.o, f2, f2, ezm.m);
            }
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (VERSION.SDK_INT == 21) {
            ezm ezm = this.a;
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            if (ezm.v != null) {
                ezm.v.setBounds(ezm.c, ezm.e, i7 - ezm.d, i6 - ezm.f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f != null && this.i == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i4 = this.g;
            if (i4 == 0) {
                i4 = this.f.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - ip.j(this)) - i4) - this.b) - ip.i(this)) / 2;
            boolean z = true;
            if (ip.f(this) != 1) {
                z = false;
            }
            if (z) {
                measuredWidth = -measuredWidth;
            }
            if (this.h != measuredWidth) {
                this.h = measuredWidth;
                c();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (d()) {
            ezm ezm = this.a;
            if (!ezm.a || ezm.t == null) {
                if (!ezm.a && ezm.p != null) {
                    ezm.p.setColor(i2);
                }
                return;
            }
            ezm.t.setColor(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (d()) {
            if (drawable != getBackground()) {
                ezm ezm = this.a;
                ezm.w = true;
                ezm.b.a(ezm.j);
                ezm.b.a(ezm.i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? ab.b(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        a(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        a(mode);
    }
}
