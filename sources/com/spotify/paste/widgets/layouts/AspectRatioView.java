package com.spotify.paste.widgets.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

public class AspectRatioView extends ViewGroup {
    public float a = 1.0f;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public AspectRatioView(Context context) {
        super(context);
        setWillNotDraw(true);
    }

    public AspectRatioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
        this.a = obtainStyledAttributes.getFraction(a.d, 1, 1, this.a);
        this.b = obtainStyledAttributes.getBoolean(a.c, this.b);
        this.c = obtainStyledAttributes.getBoolean(a.b, this.c);
        this.d = obtainStyledAttributes.getBoolean(a.g, this.d);
        this.e = obtainStyledAttributes.getDimensionPixelSize(a.f, this.e);
        this.f = obtainStyledAttributes.getDimensionPixelSize(a.e, this.f);
        obtainStyledAttributes.recycle();
    }

    private static boolean a(int i) {
        return i >= 0;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("AspectRatioView can host only one direct child.");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("AspectRatioView can host only one direct child.");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("AspectRatioView can host only one direct child.");
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("AspectRatioView can host only one direct child.");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            android.view.View r1 = r10.getChildAt(r0)
            r2 = 1
            if (r1 == 0) goto L_0x0067
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto L_0x0067
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r3 = r1.width
            boolean r3 = a(r3)
            if (r3 == 0) goto L_0x002b
            int r3 = r1.height
            boolean r3 = a(r3)
            if (r3 != 0) goto L_0x0023
            goto L_0x002b
        L_0x0023:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Child supplied to AspectRatioView cannot have both dimensions set to exact"
            r11.<init>(r12)
            throw r11
        L_0x002b:
            int r3 = r1.width
            boolean r3 = a(r3)
            if (r3 == 0) goto L_0x0048
            boolean r3 = defpackage.jum.a(r11)
            if (r3 != 0) goto L_0x0040
            int r1 = r1.width
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            goto L_0x0069
        L_0x0040:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Both child and AspectRatioView have exact width dimension."
            r11.<init>(r12)
            throw r11
        L_0x0048:
            int r3 = r1.height
            boolean r3 = a(r3)
            if (r3 == 0) goto L_0x0067
            boolean r3 = defpackage.jum.a(r12)
            if (r3 != 0) goto L_0x005f
            int r1 = r1.height
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            r3 = r1
            r1 = 0
            goto L_0x006a
        L_0x005f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Both child and AspectRatioView have exact height dimension."
            r11.<init>(r12)
            throw r11
        L_0x0067:
            r1 = 0
            r2 = 0
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r2 != 0) goto L_0x007c
            int r1 = r10.getSuggestedMinimumWidth()
            int r1 = getDefaultSize(r1, r11)
            int r3 = r10.getSuggestedMinimumHeight()
            int r3 = getDefaultSize(r3, r12)
        L_0x007c:
            if (r1 != 0) goto L_0x008b
            if (r3 != 0) goto L_0x008b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "With both width and height set to zero, it is impossible to calculate and enforce aspect ratio."
            com.spotify.base.java.logging.Logger.d(r1, r0)
            super.onMeasure(r11, r12)
            return
        L_0x008b:
            int r4 = r10.getPaddingLeft()
            int r5 = r10.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r10.getPaddingTop()
            int r6 = r10.getPaddingBottom()
            int r5 = r5 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0101
            boolean r7 = defpackage.jum.a(r12)
            if (r7 == 0) goto L_0x00a8
            goto L_0x0101
        L_0x00a8:
            if (r3 == 0) goto L_0x00f1
            boolean r7 = defpackage.jum.a(r11)
            if (r7 == 0) goto L_0x00b1
            goto L_0x00f1
        L_0x00b1:
            float r7 = r10.a
            float r8 = (float) r1
            float r9 = (float) r3
            float r8 = r8 / r9
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d5
            boolean r11 = r10.d
            if (r11 == 0) goto L_0x00c8
            int r11 = android.view.View.MeasureSpec.getMode(r12)
            if (r11 != r6) goto L_0x00c8
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0111
        L_0x00c8:
            int r11 = r10.e
            int r11 = r1 - r11
            float r11 = (float) r11
            float r12 = r10.a
            float r11 = r11 / r12
            int r3 = java.lang.Math.round(r11)
            goto L_0x0111
        L_0x00d5:
            boolean r12 = r10.d
            if (r12 == 0) goto L_0x00e3
            int r11 = android.view.View.MeasureSpec.getMode(r11)
            if (r11 != r6) goto L_0x00e3
            boolean r11 = r10.b
            if (r11 != 0) goto L_0x0111
        L_0x00e3:
            int r11 = r10.f
            int r11 = r3 - r11
            float r11 = (float) r11
            float r12 = r10.a
            float r11 = r11 * r12
            int r1 = java.lang.Math.round(r11)
            goto L_0x0111
        L_0x00f1:
            float r11 = (float) r1
            float r12 = r10.a
            float r11 = r11 / r12
            int r11 = java.lang.Math.round(r11)
            int r12 = r10.f
            int r11 = r11 + r12
            int r3 = java.lang.Math.max(r3, r11)
            goto L_0x0111
        L_0x0101:
            float r11 = (float) r3
            float r12 = r10.a
            float r11 = r11 * r12
            int r11 = java.lang.Math.round(r11)
            int r12 = r10.e
            int r11 = r11 + r12
            int r1 = java.lang.Math.max(r1, r11)
        L_0x0111:
            if (r2 == 0) goto L_0x0115
            int r1 = r1 + r4
            int r3 = r3 + r5
        L_0x0115:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            r10.setMeasuredDimension(r11, r12)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r11 = java.lang.Math.max(r0, r11)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            int r12 = java.lang.Math.max(r0, r12)
            r10.measureChildren(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.widgets.layouts.AspectRatioView.onMeasure(int, int):void");
    }
}
