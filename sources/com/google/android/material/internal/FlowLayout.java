package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class FlowLayout extends ViewGroup {
    protected int a;
    protected int b;
    protected boolean c;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.bh, 0, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(a.bj, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(a.bi, 0);
        obtainStyledAttributes.recycle();
    }

    private static int a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (ip.f(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        i5 = ia.a(marginLayoutParams);
                        i6 = ia.b(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.c && measuredWidth > i7) {
                        i9 = paddingTop + this.a;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                    } else {
                        childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    }
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.b;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingRight = i5 - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i9 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() > paddingRight && !this.c) {
                    i6 = this.a + paddingTop;
                    i9 = getPaddingLeft();
                }
                int measuredWidth = i9 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingTop = measuredHeight;
                paddingLeft = i9 + i4 + i3 + childAt.getMeasuredWidth() + this.b;
            } else {
                int i10 = i;
                int i11 = i2;
                int i12 = paddingLeft;
            }
        }
        setMeasuredDimension(a(size, mode, i7), a(size2, mode2, paddingTop));
    }
}
