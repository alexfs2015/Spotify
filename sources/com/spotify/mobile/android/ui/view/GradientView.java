package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.View;

public class GradientView extends View {
    private GradientDrawable a;
    private final int[] b;
    private Orientation c;

    public GradientView(Context context) {
        super(context);
        this.c = Orientation.LEFT_RIGHT;
        this.b = new int[]{-16777216, -1};
        ip.a((View) this, (Drawable) null);
    }

    public GradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o);
            this.b = new int[]{obtainStyledAttributes.getColor(a.p, -16777216), obtainStyledAttributes.getColor(a.q, -1)};
            i = (int) obtainStyledAttributes.getFloat(a.r, 0.0f);
            obtainStyledAttributes.recycle();
        } else {
            this.b = new int[]{-16777216, -1};
        }
        int i2 = i / 90;
        if (i2 == 0) {
            this.c = Orientation.LEFT_RIGHT;
        } else if (i2 == 1) {
            this.c = Orientation.BOTTOM_TOP;
        } else if (i2 == 2) {
            this.c = Orientation.RIGHT_LEFT;
        } else if (i2 != 3) {
            this.c = Orientation.LEFT_RIGHT;
        } else {
            this.c = Orientation.TOP_BOTTOM;
        }
        this.a = null;
        ip.a((View) this, (Drawable) null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.a == null) {
            this.a = new GradientDrawable(this.c, this.b);
        }
        this.a.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a == null) {
            this.a = new GradientDrawable(this.c, this.b);
        }
        this.a.setBounds(0, 0, i3 - i, i4 - i2);
        super.onLayout(z, i, i2, i3, i4);
    }
}
