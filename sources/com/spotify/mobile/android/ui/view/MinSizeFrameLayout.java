package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class MinSizeFrameLayout extends FrameLayout {
    private final float a;
    private final float b;

    public MinSizeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MinSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.s);
        this.a = obtainStyledAttributes.getFloat(a.u, 0.0f);
        this.b = obtainStyledAttributes.getFloat(a.t, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = 0;
        int round = (this.a <= 0.0f || MeasureSpec.getMode(i) != Integer.MIN_VALUE) ? 0 : Math.round(this.a * ((float) MeasureSpec.getSize(i)));
        if (this.b > 0.0f && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            i3 = Math.round(this.b * ((float) MeasureSpec.getSize(i2)));
        }
        if (measuredWidth < round || measuredHeight < i3) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(Math.max(measuredWidth, round), 1073741824), MeasureSpec.makeMeasureSpec(Math.max(measuredHeight, i3), 1073741824));
        }
    }
}
