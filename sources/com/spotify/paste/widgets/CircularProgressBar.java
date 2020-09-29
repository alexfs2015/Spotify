package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;

public class CircularProgressBar extends View {
    private boolean a;
    private Paint b;
    private int c;
    private int d;
    private final RectF e;
    private int f;
    private Paint g;
    private int h;
    private float i;
    private Paint j;
    private float k;
    private Paint l;
    private boolean m;
    private final int n;
    private int o;
    private int p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private final RectF v;
    private boolean w;

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteDefaultsCircularProgressBarStyle);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = true;
        this.b = new Paint();
        this.c = 10;
        this.d = 20;
        this.e = new RectF();
        this.i = 0.3f;
        this.j = new Paint();
        this.v = new RectF();
        this.w = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.h, i2, 0);
        this.f = obtainStyledAttributes.getColor(a.n, -16711681);
        c();
        this.h = obtainStyledAttributes.getColor(a.m, -65281);
        b();
        a();
        b(obtainStyledAttributes.getFloat(a.l, 0.0f));
        a(obtainStyledAttributes.getFloat(a.j, 0.0f));
        this.c = (int) obtainStyledAttributes.getDimension(a.o, 10.0f);
        this.w = obtainStyledAttributes.getBoolean(a.p, true);
        this.m = obtainStyledAttributes.getBoolean(a.k, true);
        this.n = obtainStyledAttributes.getInt(a.i, 17);
        obtainStyledAttributes.recycle();
        this.d = this.c << 1;
        a();
        b();
        c();
        this.a = false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.translate(this.q, this.r);
        float f2 = this.i * 360.0f;
        if (!this.u) {
            canvas.drawArc(this.e, 270.0f, -(360.0f - f2), false, this.b);
        }
        canvas.drawArc(this.e, 270.0f, this.u ? 360.0f : f2, false, this.g);
        if (this.m) {
            float f3 = this.k * 360.0f;
            canvas.save();
            canvas2.rotate(f3 - 90.0f);
            float f4 = this.s;
            double d2 = (double) f4;
            int i2 = this.d;
            double d3 = (double) i2;
            Double.isNaN(d3);
            double d4 = (d3 / 2.0d) * 1.4d;
            Double.isNaN(d2);
            float f5 = (float) (d2 + d4);
            float f6 = this.t;
            double d5 = (double) f4;
            double d6 = (double) i2;
            Double.isNaN(d6);
            double d7 = (d6 / 2.0d) * 1.4d;
            Double.isNaN(d5);
            canvas.drawLine(f5, f6, (float) (d5 - d7), f6, this.l);
            canvas.restore();
        }
        if (this.w) {
            canvas.save();
            canvas2.rotate(f2 - 90.0f);
            canvas2.rotate(45.0f, this.s, this.t);
            RectF rectF = this.v;
            float f7 = this.s;
            int i3 = this.d;
            rectF.left = f7 - (((float) i3) / 3.0f);
            rectF.right = f7 + (((float) i3) / 3.0f);
            float f8 = this.t;
            rectF.top = f8 - (((float) i3) / 3.0f);
            rectF.bottom = f8 + (((float) i3) / 3.0f);
            canvas2.drawRect(rectF, this.j);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i3);
        int defaultSize2 = getDefaultSize(getSuggestedMinimumWidth(), i2);
        int min = Math.min(defaultSize2, defaultSize);
        setMeasuredDimension(min, defaultSize);
        float f2 = ((float) min) * 0.5f;
        float f3 = f2 - ((float) this.d);
        float f4 = -f3;
        this.e.set(f4, f4, f3, f3);
        this.s = f3;
        this.t = f3;
        int i4 = defaultSize2 - min;
        int i5 = defaultSize - min;
        int i6 = this.n;
        if (VERSION.SDK_INT >= 17) {
            i6 = Gravity.getAbsoluteGravity(this.n, getLayoutDirection());
        }
        int i7 = i6 & 7;
        if (i7 == 3) {
            this.o = 0;
        } else if (i7 != 5) {
            this.o = i4 / 2;
        } else {
            this.o = i4;
        }
        int i8 = i6 & ContentType.LONG_FORM_ON_DEMAND;
        if (i8 == 48) {
            this.p = 0;
        } else if (i8 != 80) {
            this.p = i5 / 2;
        } else {
            this.p = i5;
        }
        this.q = ((float) this.o) + f2;
        this.r = f2 + ((float) this.p);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            b(bundle.getFloat("progress"));
            a(bundle.getFloat("marker_progress"));
            int i2 = bundle.getInt("progress_color");
            if (i2 != this.f) {
                this.f = i2;
                c();
            }
            int i3 = bundle.getInt("progress_background_color");
            if (i3 != this.h) {
                this.h = i3;
                a();
            }
            super.onRestoreInstanceState(bundle.getParcelable("saved_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_state", super.onSaveInstanceState());
        bundle.putFloat("progress", this.i);
        bundle.putFloat("marker_progress", this.k);
        bundle.putInt("progress_color", this.f);
        bundle.putInt("progress_background_color", this.h);
        return bundle;
    }

    private void a() {
        this.b = new Paint(1);
        this.b.setColor(this.h);
        this.b.setStyle(Style.STROKE);
        this.b.setStrokeWidth((float) this.c);
        invalidate();
    }

    private void b() {
        this.l = new Paint(1);
        this.l.setColor(this.h);
        this.l.setStyle(Style.STROKE);
        this.l.setStrokeWidth(((float) this.c) / 2.0f);
        invalidate();
    }

    private void c() {
        this.g = new Paint(1);
        this.g.setColor(this.f);
        this.g.setStyle(Style.STROKE);
        this.g.setStrokeWidth((float) this.c);
        this.j = new Paint(1);
        this.j.setColor(this.f);
        this.j.setStyle(Style.FILL_AND_STROKE);
        this.j.setStrokeWidth((float) this.c);
        invalidate();
    }

    private void a(float f2) {
        this.m = true;
        this.k = f2;
    }

    private void b(float f2) {
        if (f2 != this.i) {
            if (f2 == 1.0f) {
                this.u = false;
                this.i = 1.0f;
            } else {
                if (f2 >= 1.0f) {
                    this.u = true;
                } else {
                    this.u = false;
                }
                this.i = f2 % 1.0f;
            }
            if (!this.a) {
                invalidate();
            }
        }
    }
}
