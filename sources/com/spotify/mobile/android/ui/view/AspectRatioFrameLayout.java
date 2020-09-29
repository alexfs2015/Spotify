package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;

public class AspectRatioFrameLayout extends FrameLayout {
    private float a = 1.0f;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public AspectRatioFrameLayout(Context context) {
        super(context);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == a.d) {
                this.a = obtainStyledAttributes.getFloat(index, this.a);
            } else if (index == a.c) {
                this.b = obtainStyledAttributes.getBoolean(index, this.b);
            } else if (index == a.b) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == a.g) {
                this.d = obtainStyledAttributes.getBoolean(index, this.d);
            } else if (index == a.f) {
                this.e = obtainStyledAttributes.getDimensionPixelSize(index, this.e);
            } else if (index == a.e) {
                this.f = obtainStyledAttributes.getDimensionPixelSize(index, this.f);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
        if (defaultSize == 0 && defaultSize2 == 0) {
            String str = "risi sel n Wpoo cttewtttctoa stht.resdteicono s c uloizirbd,ea t eieob psgdaaa iihht h fne  aml";
            Logger.d("With both width and height set to zero, it is impossible to calculate and enforce aspect ratio.", new Object[0]);
            super.onMeasure(i, i2);
            return;
        }
        if (defaultSize == 0) {
            defaultSize = Math.round(((float) defaultSize2) * this.a) + this.e;
        } else if (defaultSize2 == 0) {
            defaultSize2 = Math.round(((float) defaultSize) / this.a) + this.f;
        } else if (this.a > ((float) defaultSize) / ((float) defaultSize2)) {
            if (!this.d || MeasureSpec.getMode(i2) != 1073741824 || !this.c) {
                defaultSize2 = Math.round(((float) (defaultSize - this.e)) / this.a);
            }
        } else if (!this.d || MeasureSpec.getMode(i) != 1073741824 || !this.b) {
            defaultSize = Math.round(((float) (defaultSize2 - this.f)) * this.a);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
    }
}
