package com.spotify.music.podcast.ui.topic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.List;

public class OverFlowLayout extends ViewGroup {
    private final List<Integer> a = new ArrayList(3);
    private final List<Integer> b = new ArrayList(3);
    private int c;
    private int d;

    public OverFlowLayout(Context context) {
        super(context);
    }

    public OverFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (vgi.a((View) this)) {
                i5 = i3 - ((Integer) this.a.get(i7)).intValue();
                i6 = i5 - childAt.getMeasuredWidth();
            } else {
                i6 = ((Integer) this.a.get(i7)).intValue() + i;
                i5 = childAt.getMeasuredWidth() + i6;
            }
            int intValue = ((Integer) this.b.get(i7)).intValue();
            childAt.layout(i6, intValue, i5, childAt.getMeasuredHeight() + intValue);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(makeMeasureSpec, makeMeasureSpec);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (measuredHeight > this.c) {
                this.c = measuredHeight;
            }
        }
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.d = 0;
        int childCount2 = getChildCount();
        int i4 = paddingLeft;
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt2 = getChildAt(i5);
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) childAt2.getLayoutParams();
            int measuredWidth = childAt2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            if (measuredWidth + i4 > size) {
                this.d++;
                i4 = paddingLeft;
            }
            this.a.add(Integer.valueOf(i4));
            i4 += measuredWidth;
            this.b.add(Integer.valueOf((this.c * this.d) + paddingTop));
        }
        this.d++;
        super.onMeasure(i, MeasureSpec.makeMeasureSpec((this.c * this.d) + getPaddingTop() + getPaddingBottom(), 1073741824));
    }
}
