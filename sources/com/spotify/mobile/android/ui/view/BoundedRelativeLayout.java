package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;

public class BoundedRelativeLayout extends RelativeLayout {
    private final int a;
    private final int b;

    public BoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundedRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.h);
        this.a = obtainStyledAttributes.getDimensionPixelSize(a.j, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(a.i, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int i3 = this.a;
        if (i3 > 0 && size > i3) {
            i = MeasureSpec.makeMeasureSpec(this.a, MeasureSpec.getMode(i));
        }
        int size2 = MeasureSpec.getSize(i2);
        int i4 = this.b;
        if (i4 > 0 && size2 > i4) {
            i2 = MeasureSpec.makeMeasureSpec(this.b, MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
