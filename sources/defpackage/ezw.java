package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: ezw reason: default package */
public final class ezw {
    public final ColorStateList a;
    public final int b;
    boolean c = false;
    Typeface d;
    private float e;
    private ColorStateList f;
    private ColorStateList g;
    private int h;
    private String i;
    private boolean j;
    private ColorStateList k;
    private float l;
    private float m;
    private float n;
    private final int o;

    public ezw(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, a.cH);
        this.e = obtainStyledAttributes.getDimension(a.cI, 0.0f);
        this.a = ezv.a(context, obtainStyledAttributes, a.cL);
        this.f = ezv.a(context, obtainStyledAttributes, a.cM);
        this.g = ezv.a(context, obtainStyledAttributes, a.cN);
        this.b = obtainStyledAttributes.getInt(a.cK, 0);
        this.h = obtainStyledAttributes.getInt(a.cJ, 1);
        int i3 = a.cT;
        int i4 = a.cS;
        if (!obtainStyledAttributes.hasValue(i3)) {
            i3 = i4;
        }
        this.o = obtainStyledAttributes.getResourceId(i3, 0);
        this.i = obtainStyledAttributes.getString(i3);
        this.j = obtainStyledAttributes.getBoolean(a.cU, false);
        this.k = ezv.a(context, obtainStyledAttributes, a.cO);
        this.l = obtainStyledAttributes.getFloat(a.cP, 0.0f);
        this.m = obtainStyledAttributes.getFloat(a.cQ, 0.0f);
        this.n = obtainStyledAttributes.getFloat(a.cR, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void c(Context context, final TextPaint textPaint, final a aVar) {
        if (this.c) {
            a(textPaint, this.d);
            return;
        }
        a();
        if (context.isRestricted()) {
            this.c = true;
            a(textPaint, this.d);
            return;
        }
        try {
            int i2 = this.o;
            AnonymousClass1 r4 = new a() {
                public final void a(Typeface typeface) {
                    ezw ezw = ezw.this;
                    ezw.d = Typeface.create(typeface, ezw.b);
                    ezw.this.a(textPaint, typeface);
                    ezw.this.c = true;
                    aVar.a(typeface);
                }

                public final void a(int i) {
                    ezw.this.a();
                    ezw.this.c = true;
                    aVar.a(i);
                }
            };
            hr.a(r4);
            if (context.isRestricted()) {
                r4.a(-4, (Handler) null);
                return;
            }
            gb.a(context, i2, new TypedValue(), 0, r4, null, false);
        } catch (NotFoundException | UnsupportedOperationException unused) {
        } catch (Exception unused2) {
            new StringBuilder("Error loading font ").append(this.i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (this.d == null) {
            this.d = Typeface.create(this.i, this.b);
        }
        if (this.d == null) {
            int i2 = this.h;
            if (i2 == 1) {
                this.d = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.d = Typeface.SERIF;
            } else if (i2 != 3) {
                this.d = Typeface.DEFAULT;
            } else {
                this.d = Typeface.MONOSPACE;
            }
            Typeface typeface = this.d;
            if (typeface != null) {
                this.d = Typeface.create(typeface, this.b);
            }
        }
    }

    public final void a(Context context, TextPaint textPaint, a aVar) {
        b(context, textPaint, aVar);
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.a.getDefaultColor()) : -16777216);
        float f2 = this.n;
        float f3 = this.l;
        float f4 = this.m;
        ColorStateList colorStateList2 = this.k;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.k.getDefaultColor()) : 0);
    }

    public final void b(Context context, TextPaint textPaint, a aVar) {
        c(context, textPaint, aVar);
        if (!this.c) {
            a(textPaint, this.d);
        }
    }

    public final void a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.b;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.e);
    }
}
