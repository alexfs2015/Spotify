package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.comscore.streaming.ContentType;

public class LinearLayoutCompat extends ViewGroup {
    private int a;
    private int b;
    private int c;
    private int d;
    private float e;
    boolean f;
    int g;
    Drawable h;
    int i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public static class LayoutParams extends MarginLayoutParams {
        public float g;
        public int h;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.h = -1;
            this.g = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.bd);
            this.g = obtainStyledAttributes.getFloat(a.bf, 0.0f);
            this.h = obtainStyledAttributes.getInt(a.be, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.h = -1;
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z = true;
        this.f = true;
        this.a = -1;
        this.b = 0;
        this.g = 8388659;
        cp a2 = cp.a(context, attributeSet, a.aT, i2, 0);
        int a3 = a2.a(a.aV, -1);
        if (a3 >= 0) {
            c(a3);
        }
        int a4 = a2.a(a.aU, -1);
        if (a4 >= 0 && this.g != a4) {
            if ((8388615 & a4) == 0) {
                a4 |= 8388611;
            }
            if ((a4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                a4 |= 48;
            }
            this.g = a4;
            requestLayout();
        }
        boolean a5 = a2.a(a.aW, true);
        if (!a5) {
            this.f = a5;
        }
        this.e = a2.a(a.aY, -1.0f);
        this.a = a2.a(a.aX, -1);
        this.j = a2.a(a.bb, false);
        Drawable a6 = a2.a(a.aZ);
        if (a6 != this.h) {
            this.h = a6;
            if (a6 != null) {
                this.i = a6.getIntrinsicWidth();
                this.m = a6.getIntrinsicHeight();
            } else {
                this.i = 0;
                this.m = 0;
            }
            if (a6 != null) {
                z = false;
            }
            setWillNotDraw(z);
            requestLayout();
        }
        this.n = a2.a(a.bc, 0);
        this.o = a2.e(a.ba, 0);
        a2.a.recycle();
    }

    private void a(int i2, int i3) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i5 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i3, 0);
                    layoutParams.height = i5;
                }
            }
        }
    }

    private void a(Canvas canvas, int i2) {
        this.h.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.h.draw(canvas);
    }

    private void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x038d, code lost:
        if (r7 < 0) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0229, code lost:
        if (r13[3] != -1) goto L_0x022d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r37, int r38) {
        /*
            r36 = this;
            r6 = r36
            r7 = r38
            r8 = 0
            r6.d = r8
            int r9 = r36.getChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r37)
            int r11 = android.view.View.MeasureSpec.getMode(r38)
            int[] r0 = r6.k
            r12 = 4
            if (r0 == 0) goto L_0x001c
            int[] r0 = r6.l
            if (r0 != 0) goto L_0x0024
        L_0x001c:
            int[] r0 = new int[r12]
            r6.k = r0
            int[] r0 = new int[r12]
            r6.l = r0
        L_0x0024:
            int[] r13 = r6.k
            int[] r14 = r6.l
            r15 = 3
            r5 = -1
            r13[r15] = r5
            r16 = 2
            r13[r16] = r5
            r17 = 1
            r13[r17] = r5
            r13[r8] = r5
            r14[r15] = r5
            r14[r16] = r5
            r14[r17] = r5
            r14[r8] = r5
            boolean r4 = r6.f
            boolean r3 = r6.j
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 != r2) goto L_0x0049
            r18 = 1
            goto L_0x004b
        L_0x0049:
            r18 = 0
        L_0x004b:
            r19 = 0
            r0 = 0
            r1 = 0
            r12 = 0
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 1
            r26 = 0
        L_0x005d:
            r5 = 8
            if (r1 >= r9) goto L_0x01f7
            android.view.View r8 = r6.getChildAt(r1)
            if (r8 != 0) goto L_0x0078
            int r5 = r6.d
            r6.d = r5
            r32 = r1
            r35 = r3
            r28 = r4
            r29 = r10
            r1 = 1073741824(0x40000000, float:2.0)
            r4 = -1
            goto L_0x01e6
        L_0x0078:
            int r2 = r8.getVisibility()
            if (r2 == r5) goto L_0x01cf
            boolean r2 = r6.b(r1)
            if (r2 == 0) goto L_0x008b
            int r2 = r6.d
            int r5 = r6.i
            int r2 = r2 + r5
            r6.d = r2
        L_0x008b:
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r5 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r2 = r5.g
            float r31 = r0 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 != r2) goto L_0x00e7
            int r0 = r5.width
            if (r0 != 0) goto L_0x00e7
            float r0 = r5.g
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e7
            if (r18 == 0) goto L_0x00b3
            int r0 = r6.d
            int r2 = r5.leftMargin
            r32 = r1
            int r1 = r5.rightMargin
            int r2 = r2 + r1
            int r0 = r0 + r2
            r6.d = r0
            goto L_0x00c3
        L_0x00b3:
            r32 = r1
            int r0 = r6.d
            int r1 = r5.leftMargin
            int r1 = r1 + r0
            int r2 = r5.rightMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.d = r0
        L_0x00c3:
            if (r4 == 0) goto L_0x00d8
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r35 = r3
            r28 = r4
            r7 = r5
            r29 = r10
            r27 = -2
            goto L_0x0153
        L_0x00d8:
            r35 = r3
            r28 = r4
            r7 = r5
            r29 = r10
            r1 = 1073741824(0x40000000, float:2.0)
            r22 = 1
            r27 = -2
            goto L_0x0155
        L_0x00e7:
            r32 = r1
            int r0 = r5.width
            if (r0 != 0) goto L_0x00f8
            float r0 = r5.g
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f8
            r2 = -2
            r5.width = r2
            r1 = 0
            goto L_0x00fb
        L_0x00f8:
            r2 = -2
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fb:
            int r0 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
            int r0 = r6.d
            r28 = r0
            goto L_0x0106
        L_0x0104:
            r28 = 0
        L_0x0106:
            r33 = 0
            r0 = r36
            r34 = r1
            r1 = r8
            r30 = -2
            r2 = r37
            r35 = r3
            r3 = r28
            r28 = r4
            r4 = r38
            r7 = r5
            r29 = r10
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = -2
            r5 = r33
            r0.a(r1, r2, r3, r4, r5)
            r0 = r34
            if (r0 == r10) goto L_0x012b
            r7.width = r0
        L_0x012b:
            int r0 = r8.getMeasuredWidth()
            if (r18 == 0) goto L_0x013d
            int r1 = r6.d
            int r2 = r7.leftMargin
            int r2 = r2 + r0
            int r3 = r7.rightMargin
            int r2 = r2 + r3
            int r1 = r1 + r2
            r6.d = r1
            goto L_0x014d
        L_0x013d:
            int r1 = r6.d
            int r2 = r1 + r0
            int r3 = r7.leftMargin
            int r2 = r2 + r3
            int r3 = r7.rightMargin
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.d = r1
        L_0x014d:
            if (r35 == 0) goto L_0x0153
            int r12 = java.lang.Math.max(r0, r12)
        L_0x0153:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0155:
            if (r11 == r1) goto L_0x0160
            int r0 = r7.height
            r4 = -1
            if (r0 != r4) goto L_0x0161
            r0 = 1
            r26 = 1
            goto L_0x0162
        L_0x0160:
            r4 = -1
        L_0x0161:
            r0 = 0
        L_0x0162:
            int r2 = r7.topMargin
            int r3 = r7.bottomMargin
            int r2 = r2 + r3
            int r3 = r8.getMeasuredHeight()
            int r3 = r3 + r2
            int r5 = r8.getMeasuredState()
            r10 = r24
            int r24 = android.view.View.combineMeasuredStates(r10, r5)
            if (r28 == 0) goto L_0x01a1
            int r5 = r8.getBaseline()
            if (r5 == r4) goto L_0x01a1
            int r8 = r7.h
            if (r8 >= 0) goto L_0x0185
            int r8 = r6.g
            goto L_0x0187
        L_0x0185:
            int r8 = r7.h
        L_0x0187:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r10 = 4
            int r8 = r8 >> r10
            r8 = r8 & -2
            int r8 = r8 >> 1
            r10 = r13[r8]
            int r10 = java.lang.Math.max(r10, r5)
            r13[r8] = r10
            r10 = r14[r8]
            int r5 = r3 - r5
            int r5 = java.lang.Math.max(r10, r5)
            r14[r8] = r5
        L_0x01a1:
            int r15 = java.lang.Math.max(r15, r3)
            if (r25 == 0) goto L_0x01ae
            int r5 = r7.height
            if (r5 != r4) goto L_0x01ae
            r25 = 1
            goto L_0x01b0
        L_0x01ae:
            r25 = 0
        L_0x01b0:
            float r5 = r7.g
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x01c3
            if (r0 == 0) goto L_0x01b9
            goto L_0x01ba
        L_0x01b9:
            r2 = r3
        L_0x01ba:
            r8 = r21
            int r21 = java.lang.Math.max(r8, r2)
            r8 = r21
            goto L_0x01e2
        L_0x01c3:
            r8 = r21
            if (r0 == 0) goto L_0x01c8
            r3 = r2
        L_0x01c8:
            r2 = r20
            int r20 = java.lang.Math.max(r2, r3)
            goto L_0x01e2
        L_0x01cf:
            r32 = r1
            r35 = r3
            r28 = r4
            r29 = r10
            r2 = r20
            r8 = r21
            r10 = r24
            r1 = 1073741824(0x40000000, float:2.0)
            r4 = -1
            r31 = r0
        L_0x01e2:
            r21 = r8
            r0 = r31
        L_0x01e6:
            int r2 = r32 + 1
            r7 = r38
            r1 = r2
            r4 = r28
            r10 = r29
            r3 = r35
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r8 = 0
            goto L_0x005d
        L_0x01f7:
            r35 = r3
            r28 = r4
            r29 = r10
            r2 = r20
            r8 = r21
            r1 = 1073741824(0x40000000, float:2.0)
            r4 = -1
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = -2
            int r3 = r6.d
            if (r3 <= 0) goto L_0x0219
            boolean r3 = r6.b(r9)
            if (r3 == 0) goto L_0x0219
            int r3 = r6.d
            int r7 = r6.i
            int r3 = r3 + r7
            r6.d = r3
        L_0x0219:
            r3 = r13[r17]
            if (r3 != r4) goto L_0x022c
            r3 = 0
            r7 = r13[r3]
            if (r7 != r4) goto L_0x022c
            r3 = r13[r16]
            if (r3 != r4) goto L_0x022c
            r3 = 3
            r7 = r13[r3]
            if (r7 == r4) goto L_0x025c
            goto L_0x022d
        L_0x022c:
            r3 = 3
        L_0x022d:
            r7 = r13[r3]
            r20 = 0
            r4 = r13[r20]
            r1 = r13[r17]
            r5 = r13[r16]
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = java.lang.Math.max(r4, r1)
            int r1 = java.lang.Math.max(r7, r1)
            r4 = r14[r3]
            r3 = r14[r20]
            r5 = r14[r17]
            r7 = r14[r16]
            int r5 = java.lang.Math.max(r5, r7)
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = java.lang.Math.max(r4, r3)
            int r1 = r1 + r3
            int r15 = java.lang.Math.max(r15, r1)
        L_0x025c:
            r1 = r29
            if (r35 == 0) goto L_0x02a5
            if (r1 == r10) goto L_0x0264
            if (r1 != 0) goto L_0x02a5
        L_0x0264:
            r3 = 0
            r6.d = r3
            r3 = 0
        L_0x0268:
            if (r3 >= r9) goto L_0x02a5
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 != 0) goto L_0x0275
            int r4 = r6.d
            r6.d = r4
            goto L_0x02a2
        L_0x0275:
            int r5 = r4.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x027e
            goto L_0x02a2
        L_0x027e:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            if (r18 == 0) goto L_0x0292
            int r5 = r6.d
            int r7 = r4.leftMargin
            int r7 = r7 + r12
            int r4 = r4.rightMargin
            int r7 = r7 + r4
            int r5 = r5 + r7
            r6.d = r5
            goto L_0x02a2
        L_0x0292:
            int r5 = r6.d
            int r7 = r5 + r12
            int r10 = r4.leftMargin
            int r7 = r7 + r10
            int r4 = r4.rightMargin
            int r7 = r7 + r4
            int r4 = java.lang.Math.max(r5, r7)
            r6.d = r4
        L_0x02a2:
            int r3 = r3 + 1
            goto L_0x0268
        L_0x02a5:
            int r3 = r6.d
            int r4 = r36.getPaddingLeft()
            int r5 = r36.getPaddingRight()
            int r4 = r4 + r5
            int r3 = r3 + r4
            r6.d = r3
            int r3 = r6.d
            int r4 = r36.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r3, r4)
            r7 = r37
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.d
            int r4 = r4 - r5
            if (r22 != 0) goto L_0x0316
            if (r4 == 0) goto L_0x02d4
            int r10 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r10 <= 0) goto L_0x02d4
            goto L_0x0316
        L_0x02d4:
            int r0 = java.lang.Math.max(r2, r8)
            if (r35 == 0) goto L_0x030f
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x030f
            r1 = 0
        L_0x02df:
            if (r1 >= r9) goto L_0x030f
            android.view.View r2 = r6.getChildAt(r1)
            if (r2 == 0) goto L_0x030c
            int r4 = r2.getVisibility()
            r8 = 8
            if (r4 == r8) goto L_0x030c
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            float r4 = r4.g
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x030c
            r4 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r4)
            int r10 = r2.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r4)
            r2.measure(r8, r10)
        L_0x030c:
            int r1 = r1 + 1
            goto L_0x02df
        L_0x030f:
            r4 = r38
            r22 = r9
            r2 = 0
            goto L_0x04aa
        L_0x0316:
            float r8 = r6.e
            int r10 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r10 <= 0) goto L_0x031d
            r0 = r8
        L_0x031d:
            r8 = 3
            r10 = -1
            r13[r8] = r10
            r13[r16] = r10
            r13[r17] = r10
            r12 = 0
            r13[r12] = r10
            r14[r8] = r10
            r14[r16] = r10
            r14[r17] = r10
            r14[r12] = r10
            r6.d = r12
            r12 = r2
            r10 = r24
            r8 = -1
            r2 = r0
            r0 = 0
        L_0x0338:
            if (r0 >= r9) goto L_0x044e
            android.view.View r15 = r6.getChildAt(r0)
            if (r15 == 0) goto L_0x0437
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 == r7) goto L_0x0437
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r7 = r5.g
            int r22 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r22 <= 0) goto L_0x03a7
            r22 = r9
            float r9 = (float) r4
            float r9 = r9 * r7
            float r9 = r9 / r2
            int r9 = (int) r9
            float r2 = r2 - r7
            int r4 = r4 - r9
            int r7 = r36.getPaddingTop()
            int r24 = r36.getPaddingBottom()
            int r7 = r7 + r24
            r24 = r2
            int r2 = r5.topMargin
            int r7 = r7 + r2
            int r2 = r5.bottomMargin
            int r7 = r7 + r2
            int r2 = r5.height
            r29 = r4
            r4 = r38
            int r2 = getChildMeasureSpec(r4, r7, r2)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0388
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x0382
            goto L_0x0388
        L_0x0382:
            if (r9 <= 0) goto L_0x0386
            r7 = r9
            goto L_0x0390
        L_0x0386:
            r7 = 0
            goto L_0x0390
        L_0x0388:
            int r7 = r15.getMeasuredWidth()
            int r7 = r7 + r9
            if (r7 >= 0) goto L_0x0390
            goto L_0x0386
        L_0x0390:
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r15.measure(r7, r2)
            int r2 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r7
            int r10 = android.view.View.combineMeasuredStates(r10, r2)
            r2 = r24
            goto L_0x03ae
        L_0x03a7:
            r7 = r4
            r22 = r9
            r4 = r38
            r29 = r7
        L_0x03ae:
            if (r18 == 0) goto L_0x03c2
            int r7 = r6.d
            int r9 = r15.getMeasuredWidth()
            r24 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r7 = r7 + r9
            r6.d = r7
            goto L_0x03d7
        L_0x03c2:
            r24 = r1
            int r1 = r6.d
            int r7 = r15.getMeasuredWidth()
            int r7 = r7 + r1
            int r9 = r5.leftMargin
            int r7 = r7 + r9
            int r9 = r5.rightMargin
            int r7 = r7 + r9
            int r1 = java.lang.Math.max(r1, r7)
            r6.d = r1
        L_0x03d7:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x03e2
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x03e2
            r1 = 1
            goto L_0x03e3
        L_0x03e2:
            r1 = 0
        L_0x03e3:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r8 = java.lang.Math.max(r8, r9)
            if (r1 == 0) goto L_0x03f4
            goto L_0x03f5
        L_0x03f4:
            r7 = r9
        L_0x03f5:
            int r1 = java.lang.Math.max(r12, r7)
            if (r25 == 0) goto L_0x0402
            int r7 = r5.height
            r12 = -1
            if (r7 != r12) goto L_0x0403
            r7 = 1
            goto L_0x0404
        L_0x0402:
            r12 = -1
        L_0x0403:
            r7 = 0
        L_0x0404:
            if (r28 == 0) goto L_0x0431
            int r15 = r15.getBaseline()
            if (r15 == r12) goto L_0x0431
            int r12 = r5.h
            if (r12 >= 0) goto L_0x0413
            int r5 = r6.g
            goto L_0x0415
        L_0x0413:
            int r5 = r5.h
        L_0x0415:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r23 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r12 = r13[r5]
            int r12 = java.lang.Math.max(r12, r15)
            r13[r5] = r12
            r12 = r14[r5]
            int r9 = r9 - r15
            int r9 = java.lang.Math.max(r12, r9)
            r14[r5] = r9
            goto L_0x0433
        L_0x0431:
            r23 = 4
        L_0x0433:
            r12 = r1
            r25 = r7
            goto L_0x0442
        L_0x0437:
            r24 = r1
            r7 = r4
            r22 = r9
            r23 = 4
            r4 = r38
            r29 = r7
        L_0x0442:
            int r0 = r0 + 1
            r7 = r37
            r9 = r22
            r1 = r24
            r4 = r29
            goto L_0x0338
        L_0x044e:
            r4 = r38
            r22 = r9
            int r0 = r6.d
            int r1 = r36.getPaddingLeft()
            int r2 = r36.getPaddingRight()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r6.d = r0
            r0 = r13[r17]
            r1 = -1
            if (r0 != r1) goto L_0x0477
            r0 = 0
            r2 = r13[r0]
            if (r2 != r1) goto L_0x0477
            r0 = r13[r16]
            if (r0 != r1) goto L_0x0477
            r0 = 3
            r2 = r13[r0]
            if (r2 == r1) goto L_0x0474
            goto L_0x0478
        L_0x0474:
            r15 = r8
            r2 = 0
            goto L_0x04a7
        L_0x0477:
            r0 = 3
        L_0x0478:
            r1 = r13[r0]
            r2 = 0
            r5 = r13[r2]
            r7 = r13[r17]
            r9 = r13[r16]
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r1 = java.lang.Math.max(r1, r5)
            r0 = r14[r0]
            r5 = r14[r2]
            r7 = r14[r17]
            r9 = r14[r16]
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r0 = java.lang.Math.max(r0, r5)
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r8, r1)
            r15 = r0
        L_0x04a7:
            r24 = r10
            r0 = r12
        L_0x04aa:
            if (r25 != 0) goto L_0x04b1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x04b1
            r15 = r0
        L_0x04b1:
            int r0 = r36.getPaddingTop()
            int r1 = r36.getPaddingBottom()
            int r0 = r0 + r1
            int r15 = r15 + r0
            int r0 = r36.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r15, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r24 & r1
            r1 = r1 | r3
            int r3 = r24 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r3)
            r6.setMeasuredDimension(r1, r0)
            if (r26 == 0) goto L_0x0519
            int r0 = r36.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = r22
            r9 = 0
        L_0x04e0:
            if (r9 >= r8) goto L_0x0519
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r5 = 8
            if (r0 == r5) goto L_0x0513
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            int r0 = r10.height
            r4 = -1
            if (r0 != r4) goto L_0x0513
            int r11 = r10.width
            int r0 = r1.getMeasuredWidth()
            r10.width = r0
            r3 = 0
            r12 = 0
            r0 = r36
            r2 = r37
            r13 = -1
            r4 = r7
            r14 = 8
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.width = r11
            goto L_0x0516
        L_0x0513:
            r13 = -1
            r14 = 8
        L_0x0516:
            int r9 = r9 + 1
            goto L_0x04e0
        L_0x0519:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.b(int, int):void");
    }

    private void b(Canvas canvas, int i2) {
        this.h.setBounds(i2, getPaddingTop() + this.o, this.i + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.h.draw(canvas);
    }

    private static void b(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return (this.n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) != 0) {
            int i3 = i2 - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                } else if (getChildAt(i3).getVisibility() != 8) {
                    z = true;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return z;
    }

    public final void c(int i2) {
        if (this.c != i2) {
            this.c = i2;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public LayoutParams generateDefaultLayoutParams() {
        int i2 = this.c;
        if (i2 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        if (this.a < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.a;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.b;
                if (this.c == 1) {
                    int i4 = this.g & ContentType.LONG_FORM_ON_DEMAND;
                    if (i4 != 48) {
                        if (i4 == 16) {
                            i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.d) / 2;
                        } else if (i4 == 80) {
                            i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.d;
                        }
                    }
                }
                return i3 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.a == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.h != null) {
            int i5 = 0;
            if (this.c == 1) {
                int childCount = getChildCount();
                while (i5 < childCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !b(i5))) {
                        a(canvas, (childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin) - this.m);
                    }
                    i5++;
                }
                if (b(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.m : childAt2.getBottom() + ((LayoutParams) childAt2.getLayoutParams()).bottomMargin);
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean a2 = cv.a(this);
            while (i5 < childCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !b(i5))) {
                    LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                    b(canvas, a2 ? childAt3.getRight() + layoutParams.rightMargin : (childAt3.getLeft() - layoutParams.leftMargin) - this.i);
                }
                i5++;
            }
            if (b(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                    if (a2) {
                        i4 = childAt4.getLeft() - layoutParams2.leftMargin;
                        i3 = this.i;
                    } else {
                        i2 = childAt4.getRight() + layoutParams2.rightMargin;
                        b(canvas, i2);
                    }
                } else if (a2) {
                    i2 = getPaddingLeft();
                    b(canvas, i2);
                } else {
                    i4 = getWidth() - getPaddingRight();
                    i3 = this.i;
                }
                i2 = i4 - i3;
                b(canvas, i2);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0197  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.c
            r2 = 8
            r3 = 80
            r4 = 16
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
            r9 = 1
            if (r1 != r9) goto L_0x00ac
            int r1 = r22.getPaddingLeft()
            int r10 = r26 - r24
            int r11 = r22.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r22.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r22.getChildCount()
            int r13 = r0.g
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r4) goto L_0x0042
            if (r14 == r3) goto L_0x0036
            int r3 = r22.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r3 = r22.getPaddingTop()
            int r3 = r3 + r27
            int r3 = r3 - r25
            int r4 = r0.d
            int r3 = r3 - r4
            goto L_0x004d
        L_0x0042:
            int r3 = r22.getPaddingTop()
            int r4 = r27 - r25
            int r13 = r0.d
            int r4 = r4 - r13
            int r4 = r4 / r8
            int r3 = r3 + r4
        L_0x004d:
            r7 = 0
        L_0x004e:
            if (r7 >= r12) goto L_0x00ab
            android.view.View r4 = r0.getChildAt(r7)
            if (r4 != 0) goto L_0x0057
            goto L_0x00a5
        L_0x0057:
            int r13 = r4.getVisibility()
            if (r13 == r2) goto L_0x00a5
            int r13 = r4.getMeasuredWidth()
            int r14 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r15 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r15
            int r2 = r15.h
            if (r2 >= 0) goto L_0x0070
            r2 = r6
        L_0x0070:
            int r8 = defpackage.ip.f(r22)
            int r2 = defpackage.hx.a(r2, r8)
            r2 = r2 & 7
            if (r2 == r9) goto L_0x0087
            if (r2 == r5) goto L_0x0082
            int r2 = r15.leftMargin
            int r2 = r2 + r1
            goto L_0x0092
        L_0x0082:
            int r2 = r11 - r13
            int r8 = r15.rightMargin
            goto L_0x0091
        L_0x0087:
            int r2 = r10 - r13
            r8 = 2
            int r2 = r2 / r8
            int r2 = r2 + r1
            int r8 = r15.leftMargin
            int r2 = r2 + r8
            int r8 = r15.rightMargin
        L_0x0091:
            int r2 = r2 - r8
        L_0x0092:
            boolean r8 = r0.b(r7)
            if (r8 == 0) goto L_0x009b
            int r8 = r0.m
            int r3 = r3 + r8
        L_0x009b:
            int r8 = r15.topMargin
            int r3 = r3 + r8
            b(r4, r2, r3, r13, r14)
            int r2 = r15.bottomMargin
            int r14 = r14 + r2
            int r3 = r3 + r14
        L_0x00a5:
            int r7 = r7 + 1
            r2 = 8
            r8 = 2
            goto L_0x004e
        L_0x00ab:
            return
        L_0x00ac:
            boolean r1 = defpackage.cv.a(r22)
            int r2 = r22.getPaddingTop()
            int r8 = r27 - r25
            int r10 = r22.getPaddingBottom()
            int r10 = r8 - r10
            int r8 = r8 - r2
            int r11 = r22.getPaddingBottom()
            int r8 = r8 - r11
            int r11 = r22.getChildCount()
            int r12 = r0.g
            r6 = r6 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.f
            int[] r14 = r0.k
            int[] r15 = r0.l
            int r7 = defpackage.ip.f(r22)
            int r6 = defpackage.hx.a(r6, r7)
            if (r6 == r9) goto L_0x00ee
            if (r6 == r5) goto L_0x00e2
            int r5 = r22.getPaddingLeft()
            goto L_0x00fa
        L_0x00e2:
            int r5 = r22.getPaddingLeft()
            int r5 = r5 + r26
            int r5 = r5 - r24
            int r6 = r0.d
            int r5 = r5 - r6
            goto L_0x00fa
        L_0x00ee:
            int r5 = r22.getPaddingLeft()
            int r6 = r26 - r24
            int r7 = r0.d
            int r6 = r6 - r7
            r7 = 2
            int r6 = r6 / r7
            int r5 = r5 + r6
        L_0x00fa:
            if (r1 == 0) goto L_0x0100
            int r7 = r11 + -1
            r1 = -1
            goto L_0x0102
        L_0x0100:
            r1 = 1
            r7 = 0
        L_0x0102:
            r16 = r5
            r5 = 0
        L_0x0105:
            if (r5 >= r11) goto L_0x01c5
            int r17 = r1 * r5
            int r9 = r7 + r17
            android.view.View r3 = r0.getChildAt(r9)
            if (r3 != 0) goto L_0x0113
            goto L_0x01a9
        L_0x0113:
            int r4 = r3.getVisibility()
            r6 = 8
            if (r4 == r6) goto L_0x01a9
            int r4 = r3.getMeasuredWidth()
            int r6 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r3.getLayoutParams()
            r25 = r1
            r1 = r19
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            r26 = r7
            if (r13 == 0) goto L_0x013d
            int r7 = r1.height
            r27 = r11
            r11 = -1
            if (r7 == r11) goto L_0x013f
            int r7 = r3.getBaseline()
            goto L_0x0140
        L_0x013d:
            r27 = r11
        L_0x013f:
            r7 = -1
        L_0x0140:
            int r11 = r1.h
            if (r11 >= 0) goto L_0x0145
            r11 = r12
        L_0x0145:
            r11 = r11 & 112(0x70, float:1.57E-43)
            r19 = r12
            r12 = 16
            if (r11 == r12) goto L_0x0183
            r12 = 48
            if (r11 == r12) goto L_0x0172
            r12 = 80
            if (r11 == r12) goto L_0x015a
            r7 = r2
            r12 = -1
        L_0x0157:
            r18 = 1
            goto L_0x0191
        L_0x015a:
            int r11 = r10 - r6
            int r12 = r1.bottomMargin
            int r11 = r11 - r12
            r12 = -1
            if (r7 == r12) goto L_0x0170
            int r20 = r3.getMeasuredHeight()
            int r20 = r20 - r7
            r7 = 2
            r21 = r15[r7]
            int r21 = r21 - r20
            int r7 = r11 - r21
            goto L_0x0157
        L_0x0170:
            r7 = r11
            goto L_0x0157
        L_0x0172:
            r12 = -1
            int r11 = r1.topMargin
            int r11 = r11 + r2
            r18 = 1
            if (r7 == r12) goto L_0x0181
            r20 = r14[r18]
            int r20 = r20 - r7
            int r7 = r11 + r20
            goto L_0x0191
        L_0x0181:
            r7 = r11
            goto L_0x0191
        L_0x0183:
            r12 = -1
            r18 = 1
            int r7 = r8 - r6
            r11 = 2
            int r7 = r7 / r11
            int r7 = r7 + r2
            int r11 = r1.topMargin
            int r7 = r7 + r11
            int r11 = r1.bottomMargin
            int r7 = r7 - r11
        L_0x0191:
            boolean r9 = r0.b(r9)
            if (r9 == 0) goto L_0x019b
            int r9 = r0.i
            int r16 = r16 + r9
        L_0x019b:
            int r9 = r1.leftMargin
            int r9 = r16 + r9
            b(r3, r9, r7, r4, r6)
            int r1 = r1.rightMargin
            int r4 = r4 + r1
            int r9 = r9 + r4
            r16 = r9
            goto L_0x01b4
        L_0x01a9:
            r25 = r1
            r26 = r7
            r27 = r11
            r19 = r12
            r12 = -1
            r18 = 1
        L_0x01b4:
            int r5 = r5 + 1
            r1 = r25
            r7 = r26
            r11 = r27
            r12 = r19
            r3 = 80
            r4 = 16
            r9 = 1
            goto L_0x0105
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r30, int r31) {
        /*
            r29 = this;
            r6 = r29
            r7 = r30
            r8 = r31
            int r0 = r6.c
            r9 = 1
            if (r0 != r9) goto L_0x0357
            r10 = 0
            r6.d = r10
            int r11 = r29.getChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r30)
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = r6.a
            boolean r15 = r6.j
            r16 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r9 = 0
            r17 = 0
            r18 = 1
            r19 = 0
        L_0x002d:
            r10 = 8
            r20 = r3
            if (r5 >= r11) goto L_0x0179
            android.view.View r21 = r6.getChildAt(r5)
            if (r21 != 0) goto L_0x0046
            int r3 = r6.d
            r6.d = r3
            r22 = r11
            r3 = r20
            r11 = r5
            r20 = r13
            goto L_0x016d
        L_0x0046:
            int r3 = r21.getVisibility()
            if (r3 == r10) goto L_0x015c
            boolean r3 = r6.b(r5)
            if (r3 == 0) goto L_0x0059
            int r3 = r6.d
            int r10 = r6.m
            int r3 = r3 + r10
            r6.d = r3
        L_0x0059:
            android.view.ViewGroup$LayoutParams r3 = r21.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            float r3 = r10.g
            float r23 = r0 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r13 != r3) goto L_0x0091
            int r0 = r10.height
            if (r0 != 0) goto L_0x0091
            float r0 = r10.g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            int r0 = r6.d
            int r3 = r10.topMargin
            int r3 = r3 + r0
            r24 = r1
            int r1 = r10.bottomMargin
            int r3 = r3 + r1
            int r0 = java.lang.Math.max(r0, r3)
            r6.d = r0
            r28 = r4
            r22 = r11
            r8 = r20
            r27 = r24
            r17 = 1
            r11 = r5
            r20 = r13
            goto L_0x00f1
        L_0x0091:
            r24 = r1
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a2
            float r0 = r10.g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a2
            r0 = -2
            r10.height = r0
            r3 = 0
            goto L_0x00a4
        L_0x00a2:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a4:
            r25 = 0
            int r0 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00af
            int r0 = r6.d
            r26 = r0
            goto L_0x00b1
        L_0x00af:
            r26 = 0
        L_0x00b1:
            r0 = r29
            r27 = r24
            r1 = r21
            r7 = r2
            r2 = r30
            r22 = r11
            r8 = r20
            r11 = 1073741824(0x40000000, float:2.0)
            r20 = r13
            r13 = r3
            r3 = r25
            r28 = r4
            r4 = r31
            r11 = r5
            r5 = r26
            r0.a(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x00d5
            r10.height = r13
        L_0x00d5:
            int r0 = r21.getMeasuredHeight()
            int r1 = r6.d
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.d = r1
            if (r15 == 0) goto L_0x00f0
            int r2 = java.lang.Math.max(r0, r7)
            goto L_0x00f1
        L_0x00f0:
            r2 = r7
        L_0x00f1:
            if (r14 < 0) goto L_0x00fb
            int r5 = r11 + 1
            if (r14 != r5) goto L_0x00fb
            int r0 = r6.d
            r6.b = r0
        L_0x00fb:
            if (r11 >= r14) goto L_0x010c
            float r0 = r10.g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0104
            goto L_0x010c
        L_0x0104:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x010c:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0119
            int r0 = r10.width
            r1 = -1
            if (r0 != r1) goto L_0x0119
            r0 = 1
            r19 = 1
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            int r1 = r10.leftMargin
            int r3 = r10.rightMargin
            int r1 = r1 + r3
            int r3 = r21.getMeasuredWidth()
            int r3 = r3 + r1
            r4 = r27
            int r4 = java.lang.Math.max(r4, r3)
            int r5 = r21.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r9, r5)
            if (r18 == 0) goto L_0x013c
            int r5 = r10.width
            r7 = -1
            if (r5 != r7) goto L_0x013c
            r18 = 1
            goto L_0x013e
        L_0x013c:
            r18 = 0
        L_0x013e:
            float r5 = r10.g
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0150
            if (r0 == 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r1 = r3
        L_0x0148:
            r5 = r28
            int r0 = java.lang.Math.max(r5, r1)
            r5 = r0
            goto L_0x0168
        L_0x0150:
            r5 = r28
            if (r0 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r1 = r3
        L_0x0156:
            int r3 = java.lang.Math.max(r8, r1)
            r8 = r3
            goto L_0x0168
        L_0x015c:
            r7 = r2
            r22 = r11
            r8 = r20
            r11 = r5
            r20 = r13
            r5 = r4
            r4 = r1
            r23 = r0
        L_0x0168:
            r1 = r4
            r4 = r5
            r3 = r8
            r0 = r23
        L_0x016d:
            int r5 = r11 + 1
            r7 = r30
            r8 = r31
            r13 = r20
            r11 = r22
            goto L_0x002d
        L_0x0179:
            r7 = r2
            r5 = r4
            r22 = r11
            r8 = r20
            r4 = r1
            r20 = r13
            int r1 = r6.d
            if (r1 <= 0) goto L_0x0196
            r1 = r22
            boolean r2 = r6.b(r1)
            if (r2 == 0) goto L_0x0198
            int r2 = r6.d
            int r3 = r6.m
            int r2 = r2 + r3
            r6.d = r2
            goto L_0x0198
        L_0x0196:
            r1 = r22
        L_0x0198:
            r2 = r20
            if (r15 == 0) goto L_0x01d5
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x01a2
            if (r2 != 0) goto L_0x01d5
        L_0x01a2:
            r3 = 0
            r6.d = r3
            r3 = 0
        L_0x01a6:
            if (r3 >= r1) goto L_0x01d5
            android.view.View r11 = r6.getChildAt(r3)
            if (r11 != 0) goto L_0x01b3
            int r11 = r6.d
            r6.d = r11
            goto L_0x01d0
        L_0x01b3:
            int r13 = r11.getVisibility()
            if (r13 != r10) goto L_0x01ba
            goto L_0x01d0
        L_0x01ba:
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r13 = r6.d
            int r14 = r13 + r7
            int r10 = r11.topMargin
            int r14 = r14 + r10
            int r10 = r11.bottomMargin
            int r14 = r14 + r10
            int r10 = java.lang.Math.max(r13, r14)
            r6.d = r10
        L_0x01d0:
            int r3 = r3 + 1
            r10 = 8
            goto L_0x01a6
        L_0x01d5:
            int r3 = r6.d
            int r10 = r29.getPaddingTop()
            int r11 = r29.getPaddingBottom()
            int r10 = r10 + r11
            int r3 = r3 + r10
            r6.d = r3
            int r3 = r6.d
            int r10 = r29.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r3, r10)
            r10 = r8
            r11 = 0
            r8 = r31
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r3
            int r13 = r6.d
            int r11 = r11 - r13
            if (r17 != 0) goto L_0x0245
            if (r11 == 0) goto L_0x0205
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x0205
            goto L_0x0245
        L_0x0205:
            int r0 = java.lang.Math.max(r10, r5)
            if (r15 == 0) goto L_0x0240
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x0240
            r2 = 0
        L_0x0210:
            if (r2 >= r1) goto L_0x0240
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 == 0) goto L_0x023d
            int r10 = r5.getVisibility()
            r11 = 8
            if (r10 == r11) goto L_0x023d
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            float r10 = r10.g
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x023d
            int r10 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
            r5.measure(r10, r13)
        L_0x023d:
            int r2 = r2 + 1
            goto L_0x0210
        L_0x0240:
            r11 = r30
            r2 = r4
            goto L_0x0330
        L_0x0245:
            float r5 = r6.e
            int r7 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x024c
            r0 = r5
        L_0x024c:
            r5 = 0
            r6.d = r5
            r7 = r0
            r0 = 0
        L_0x0251:
            if (r0 >= r1) goto L_0x031e
            android.view.View r13 = r6.getChildAt(r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 == r15) goto L_0x030e
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            float r5 = r14.g
            int r17 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r17 <= 0) goto L_0x02bd
            float r15 = (float) r11
            float r15 = r15 * r5
            float r15 = r15 / r7
            int r15 = (int) r15
            float r7 = r7 - r5
            int r11 = r11 - r15
            int r5 = r29.getPaddingLeft()
            int r17 = r29.getPaddingRight()
            int r5 = r5 + r17
            r17 = r7
            int r7 = r14.leftMargin
            int r5 = r5 + r7
            int r7 = r14.rightMargin
            int r5 = r5 + r7
            int r7 = r14.width
            r20 = r11
            r11 = r30
            int r5 = getChildMeasureSpec(r11, r5, r7)
            int r7 = r14.height
            if (r7 != 0) goto L_0x029e
            r7 = 1073741824(0x40000000, float:2.0)
            if (r2 == r7) goto L_0x0297
            goto L_0x029e
        L_0x0297:
            r7 = 1073741824(0x40000000, float:2.0)
            if (r15 <= 0) goto L_0x029c
            goto L_0x02a9
        L_0x029c:
            r15 = 0
            goto L_0x02a9
        L_0x029e:
            int r7 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            if (r7 >= 0) goto L_0x02a6
            r7 = 0
        L_0x02a6:
            r15 = r7
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x02a9:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            r13.measure(r5, r15)
            int r5 = r13.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r5)
            r5 = r20
            goto L_0x02c2
        L_0x02bd:
            r5 = r11
            r11 = r30
            r17 = r7
        L_0x02c2:
            int r7 = r14.leftMargin
            int r15 = r14.rightMargin
            int r7 = r7 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r7
            int r4 = java.lang.Math.max(r4, r15)
            r20 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x02df
            int r2 = r14.width
            r21 = r4
            r4 = -1
            if (r2 != r4) goto L_0x02e2
            r2 = 1
            goto L_0x02e3
        L_0x02df:
            r21 = r4
            r4 = -1
        L_0x02e2:
            r2 = 0
        L_0x02e3:
            if (r2 == 0) goto L_0x02e6
            r15 = r7
        L_0x02e6:
            int r2 = java.lang.Math.max(r10, r15)
            if (r18 == 0) goto L_0x02f2
            int r7 = r14.width
            if (r7 != r4) goto L_0x02f2
            r7 = 1
            goto L_0x02f3
        L_0x02f2:
            r7 = 0
        L_0x02f3:
            int r10 = r6.d
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r10
            int r15 = r14.topMargin
            int r13 = r13 + r15
            int r14 = r14.bottomMargin
            int r13 = r13 + r14
            int r10 = java.lang.Math.max(r10, r13)
            r6.d = r10
            r10 = r2
            r18 = r7
            r7 = r17
            r2 = r21
            goto L_0x0315
        L_0x030e:
            r20 = r2
            r2 = r4
            r5 = r11
            r4 = -1
            r11 = r30
        L_0x0315:
            int r0 = r0 + 1
            r4 = r2
            r11 = r5
            r2 = r20
            r5 = 0
            goto L_0x0251
        L_0x031e:
            r11 = r30
            r2 = r4
            int r0 = r6.d
            int r4 = r29.getPaddingTop()
            int r5 = r29.getPaddingBottom()
            int r4 = r4 + r5
            int r0 = r0 + r4
            r6.d = r0
            r0 = r10
        L_0x0330:
            if (r18 != 0) goto L_0x0337
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x0337
            goto L_0x0338
        L_0x0337:
            r0 = r2
        L_0x0338:
            int r2 = r29.getPaddingLeft()
            int r4 = r29.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            int r2 = r29.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r9)
            r6.setMeasuredDimension(r0, r3)
            if (r19 == 0) goto L_0x0356
            r6.a(r1, r8)
        L_0x0356:
            return
        L_0x0357:
            r11 = r7
            r29.b(r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
