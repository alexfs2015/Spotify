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
    private final eyv a;
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
        TypedArray a2 = ezs.a(context, attributeSet, a.bo, i2, 2132017986, new int[0]);
        this.b = a2.getDimensionPixelSize(a.by, 0);
        this.c = ezt.a(a2.getInt(a.bB, -1), Mode.SRC_IN);
        this.e = ezv.a(getContext(), a2, a.bA);
        this.f = ezv.b(getContext(), a2, a.bw);
        this.i = a2.getInteger(a.bx, 1);
        this.g = a2.getDimensionPixelSize(a.bz, 0);
        this.a = new eyv(this);
        eyv eyv = this.a;
        eyv.c = a2.getDimensionPixelOffset(a.bp, 0);
        eyv.d = a2.getDimensionPixelOffset(a.bq, 0);
        eyv.e = a2.getDimensionPixelOffset(a.br, 0);
        eyv.f = a2.getDimensionPixelOffset(a.bs, 0);
        eyv.g = a2.getDimensionPixelSize(a.bv, 0);
        eyv.h = a2.getDimensionPixelSize(a.bE, 0);
        eyv.i = ezt.a(a2.getInt(a.bu, -1), Mode.SRC_IN);
        eyv.j = ezv.a(eyv.b.getContext(), a2, a.bt);
        eyv.k = ezv.a(eyv.b.getContext(), a2, a.bD);
        eyv.l = ezv.a(eyv.b.getContext(), a2, a.bC);
        eyv.m.setStyle(Style.STROKE);
        eyv.m.setStrokeWidth((float) eyv.h);
        eyv.m.setColor(eyv.k != null ? eyv.k.getColorForState(eyv.b.getDrawableState(), 0) : 0);
        int i3 = ip.i(eyv.b);
        int paddingTop = eyv.b.getPaddingTop();
        int j = ip.j(eyv.b);
        int paddingBottom = eyv.b.getPaddingBottom();
        MaterialButton materialButton = eyv.b;
        if (eyv.a) {
            eyv.t = new GradientDrawable();
            eyv.t.setCornerRadius(((float) eyv.g) + 1.0E-5f);
            eyv.t.setColor(-1);
            eyv.a();
            eyv.u = new GradientDrawable();
            eyv.u.setCornerRadius(((float) eyv.g) + 1.0E-5f);
            eyv.u.setColor(0);
            eyv.u.setStroke(eyv.h, eyv.k);
            InsetDrawable a3 = eyv.a(new LayerDrawable(new Drawable[]{eyv.t, eyv.u}));
            eyv.v = new GradientDrawable();
            eyv.v.setCornerRadius(((float) eyv.g) + 1.0E-5f);
            eyv.v.setColor(-1);
            drawable = new eyu(ezx.a(eyv.l), a3, eyv.v);
        } else {
            eyv.p = new GradientDrawable();
            eyv.p.setCornerRadius(((float) eyv.g) + 1.0E-5f);
            eyv.p.setColor(-1);
            eyv.q = gm.f(eyv.p);
            gm.a(eyv.q, eyv.j);
            if (eyv.i != null) {
                gm.a(eyv.q, eyv.i);
            }
            eyv.r = new GradientDrawable();
            eyv.r.setCornerRadius(((float) eyv.g) + 1.0E-5f);
            eyv.r.setColor(-1);
            eyv.s = gm.f(eyv.r);
            gm.a(eyv.s, eyv.l);
            drawable = eyv.a(new LayerDrawable(new Drawable[]{eyv.q, eyv.s}));
        }
        super.setBackgroundDrawable(drawable);
        ip.b(eyv.b, i3 + eyv.c, paddingTop + eyv.e, j + eyv.d, paddingBottom + eyv.f);
        a2.recycle();
        setCompoundDrawablePadding(this.b);
        c();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT < 21 && d()) {
            eyv eyv = this.a;
            if (canvas != null && eyv.k != null && eyv.h > 0) {
                eyv.n.set(eyv.b.getBackground().getBounds());
                eyv.o.set(((float) eyv.n.left) + (((float) eyv.h) / 2.0f) + ((float) eyv.c), ((float) eyv.n.top) + (((float) eyv.h) / 2.0f) + ((float) eyv.e), (((float) eyv.n.right) - (((float) eyv.h) / 2.0f)) - ((float) eyv.d), (((float) eyv.n.bottom) - (((float) eyv.h) / 2.0f)) - ((float) eyv.f));
                float f2 = ((float) eyv.g) - (((float) eyv.h) / 2.0f);
                canvas.drawRoundRect(eyv.o, f2, f2, eyv.m);
            }
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (d()) {
            eyv eyv = this.a;
            if (eyv.j != colorStateList) {
                eyv.j = colorStateList;
                if (eyv.a) {
                    eyv.a();
                } else if (eyv.q != null) {
                    gm.a(eyv.q, eyv.j);
                }
            }
            return;
        }
        super.a(colorStateList);
    }

    public final ColorStateList b_() {
        if (d()) {
            return this.a.j;
        }
        return super.b_();
    }

    public final void a(Mode mode) {
        if (d()) {
            eyv eyv = this.a;
            if (eyv.i != mode) {
                eyv.i = mode;
                if (eyv.a) {
                    eyv.a();
                } else if (!(eyv.q == null || eyv.i == null)) {
                    gm.a(eyv.q, eyv.i);
                }
            }
            return;
        }
        super.a(mode);
    }

    public final Mode aA_() {
        if (d()) {
            return this.a.i;
        }
        return super.aA_();
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        a(colorStateList);
    }

    public ColorStateList getBackgroundTintList() {
        return b_();
    }

    public void setBackgroundTintMode(Mode mode) {
        a(mode);
    }

    public Mode getBackgroundTintMode() {
        return aA_();
    }

    public void setBackgroundColor(int i2) {
        if (d()) {
            eyv eyv = this.a;
            if (!eyv.a || eyv.t == null) {
                if (!eyv.a && eyv.p != null) {
                    eyv.p.setColor(i2);
                }
                return;
            }
            eyv.t.setColor(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? ab.b(getContext(), i2) : null);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (d()) {
            if (drawable != getBackground()) {
                eyv eyv = this.a;
                eyv.w = true;
                eyv.b.a(eyv.j);
                eyv.b.a(eyv.i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (VERSION.SDK_INT == 21) {
            eyv eyv = this.a;
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            if (eyv.v != null) {
                eyv.v.setBounds(eyv.c, eyv.e, i7 - eyv.d, i6 - eyv.f);
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
}
