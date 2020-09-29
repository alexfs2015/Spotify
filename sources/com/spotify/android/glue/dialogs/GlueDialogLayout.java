package com.spotify.android.glue.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.spotify.music.R;

public class GlueDialogLayout extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private ScrollView i;
    private Button j;
    private Button k;
    private boolean l;
    private final Paint m;

    public GlueDialogLayout(Context context) {
        this(context, null);
    }

    public GlueDialogLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueDialogLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new Paint(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, i2, 0);
        try {
            this.a = obtainStyledAttributes.getDimensionPixelSize(a.h, uts.b(312.0f, getResources()));
            this.b = obtainStyledAttributes.getDimensionPixelSize(a.g, uts.b(520.0f, getResources()));
            this.c = obtainStyledAttributes.getDimensionPixelSize(a.f, uts.b(24.0f, getResources()));
            this.d = obtainStyledAttributes.getDimensionPixelSize(a.j, uts.b(24.0f, getResources()));
            this.e = obtainStyledAttributes.getDimensionPixelSize(a.e, uts.b(48.0f, getResources()));
            this.g = obtainStyledAttributes.getDimensionPixelSize(a.b, uts.b(48.0f, getResources()));
            this.h = obtainStyledAttributes.getDimensionPixelSize(a.c, uts.b(32.0f, getResources()));
            this.f = obtainStyledAttributes.getDimensionPixelSize(a.i, uts.b(40.0f, getResources()));
            int color = obtainStyledAttributes.getColor(a.d, -1);
            Paint paint = this.m;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, color, TileMode.CLAMP);
            paint.setShader(linearGradient);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.i = (ScrollView) findViewById(R.id.content);
        this.j = (Button) findViewById(R.id.button_positive);
        this.k = (Button) findViewById(R.id.button_negative);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        if (!this.l || view != this.i) {
            return super.drawChild(canvas, view, j2);
        }
        super.drawChild(canvas, view, j2);
        canvas.save();
        canvas.translate((float) view.getLeft(), (float) (view.getBottom() - this.e));
        canvas.scale(1.0f, (float) this.e);
        canvas.drawRect(0.0f, 0.0f, (float) view.getMeasuredWidth(), 1.0f, this.m);
        canvas.restore();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int min = Math.min(getResources().getDisplayMetrics().widthPixels - (this.c * 2), this.a);
        ScrollView scrollView = this.i;
        if (scrollView == null || scrollView.getChildAt(0) == null) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
            return;
        }
        int min2 = Math.min(getResources().getDisplayMetrics().heightPixels - (this.d * 2), this.b);
        View childAt = this.i.getChildAt(0);
        childAt.measure(MeasureSpec.makeMeasureSpec((min - this.i.getPaddingLeft()) - this.i.getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = childAt.getMeasuredHeight();
        a(this.j, this.g);
        int i4 = i2;
        int i5 = i3;
        measureChildWithMargins(this.j, i4, 0, i5, 0);
        measureChildWithMargins(this.k, i4, 0, i5, 0);
        int a2 = a(this.k);
        int a3 = a(this.j) + measuredHeight + a2;
        if (a3 <= min2) {
            this.l = false;
            this.i.getLayoutParams().height = measuredHeight;
        } else {
            this.l = true;
            a(this.j, this.h);
            int i6 = a3 - min2;
            int i7 = this.g - this.h;
            this.i.getLayoutParams().height = (min2 - a(this.j)) - a2;
            if (i6 <= i7) {
                LayoutParams layoutParams = this.i.getLayoutParams();
                layoutParams.height -= i7;
            }
            ScrollView scrollView2 = this.i;
            scrollView2.setPadding(scrollView2.getPaddingLeft(), 0, this.i.getPaddingRight(), this.f);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
    }

    private static void a(View view, int i2) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            ((MarginLayoutParams) view.getLayoutParams()).topMargin = i2;
        }
    }

    private static int a(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            measuredHeight += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return measuredHeight;
    }
}
