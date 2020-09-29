package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    OverScroller a;
    private Runnable b;
    private boolean c;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    class a implements Runnable {
        private final CoordinatorLayout a;
        private final V b;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        public final void run() {
            if (!(this.b == null || HeaderBehavior.this.a == null)) {
                if (HeaderBehavior.this.a.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.a_(this.a, this.b, headerBehavior.a.getCurrY());
                    ip.a((View) this.b, (Runnable) this);
                    return;
                }
                HeaderBehavior.this.b(this.a, this.b);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: 0000 */
    public boolean c(V v) {
        return false;
    }

    public HeaderBehavior() {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.c
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x005e
            r5 = -1
            if (r0 == r2) goto L_0x004f
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x004f
            goto L_0x0081
        L_0x002f:
            int r6 = r4.d
            if (r6 == r5) goto L_0x0081
            int r6 = r7.findPointerIndex(r6)
            if (r6 == r5) goto L_0x0081
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.e
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f
            if (r6 <= r0) goto L_0x0081
            r4.c = r2
            r4.e = r5
            goto L_0x0081
        L_0x004f:
            r4.c = r3
            r4.d = r5
            android.view.VelocityTracker r5 = r4.g
            if (r5 == 0) goto L_0x0081
            r5.recycle()
            r5 = 0
            r4.g = r5
            goto L_0x0081
        L_0x005e:
            r4.c = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.c(r6)
            if (r2 == 0) goto L_0x0081
            boolean r5 = r5.a(r6, r0, r1)
            if (r5 == 0) goto L_0x0081
            r4.e = r1
            int r5 = r7.getPointerId(r3)
            r4.d = r5
            r4.c()
        L_0x0081:
            android.view.VelocityTracker r5 = r4.g
            if (r5 == 0) goto L_0x0088
            r5.addMovement(r7)
        L_0x0088:
            boolean r5 = r4.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 != 3) goto L_0x00f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            int r0 = r6.f
            if (r0 >= 0) goto L_0x001a
            android.content.Context r0 = r20.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f = r0
        L_0x001a:
            int r0 = r22.getActionMasked()
            r8 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00d7
            r4 = 0
            r5 = -1
            if (r0 == r8) goto L_0x0068
            r9 = 2
            if (r0 == r9) goto L_0x002e
            r1 = 3
            if (r0 == r1) goto L_0x00c9
            goto L_0x00f8
        L_0x002e:
            int r0 = r6.d
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r5) goto L_0x0037
            return r3
        L_0x0037:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.e
            int r3 = r3 - r0
            boolean r4 = r6.c
            if (r4 != 0) goto L_0x0052
            int r4 = java.lang.Math.abs(r3)
            int r5 = r6.f
            if (r4 <= r5) goto L_0x0052
            r6.c = r8
            if (r3 <= 0) goto L_0x0051
            int r3 = r3 - r5
            goto L_0x0052
        L_0x0051:
            int r3 = r3 + r5
        L_0x0052:
            boolean r4 = r6.c
            if (r4 == 0) goto L_0x00f8
            r6.e = r0
            int r4 = r6.b(r2)
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r0.b(r1, r2, r3, r4, r5)
            goto L_0x00f8
        L_0x0068:
            android.view.VelocityTracker r0 = r6.g
            if (r0 == 0) goto L_0x00c9
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.g
            r9 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r9)
            android.view.VelocityTracker r0 = r6.g
            int r9 = r6.d
            float r0 = r0.getYVelocity(r9)
            int r9 = r6.a(r2)
            int r9 = -r9
            java.lang.Runnable r10 = r6.b
            if (r10 == 0) goto L_0x008c
            r2.removeCallbacks(r10)
            r6.b = r4
        L_0x008c:
            android.widget.OverScroller r10 = r6.a
            if (r10 != 0) goto L_0x009b
            android.widget.OverScroller r10 = new android.widget.OverScroller
            android.content.Context r11 = r21.getContext()
            r10.<init>(r11)
            r6.a = r10
        L_0x009b:
            android.widget.OverScroller r10 = r6.a
            r11 = 0
            int r12 = r19.b()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r18 = 0
            r17 = r9
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.a
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00c6
            com.google.android.material.appbar.HeaderBehavior$a r0 = new com.google.android.material.appbar.HeaderBehavior$a
            r0.<init>(r1, r2)
            r6.b = r0
            java.lang.Runnable r0 = r6.b
            defpackage.ip.a(r2, r0)
            goto L_0x00c9
        L_0x00c6:
            r19.b(r20, r21)
        L_0x00c9:
            r6.c = r3
            r6.d = r5
            android.view.VelocityTracker r0 = r6.g
            if (r0 == 0) goto L_0x00f8
            r0.recycle()
            r6.g = r4
            goto L_0x00f8
        L_0x00d7:
            float r0 = r22.getX()
            int r0 = (int) r0
            float r4 = r22.getY()
            int r4 = (int) r4
            boolean r0 = r1.a(r2, r0, r4)
            if (r0 == 0) goto L_0x0100
            boolean r0 = r6.c(r2)
            if (r0 == 0) goto L_0x0100
            r6.e = r4
            int r0 = r7.getPointerId(r3)
            r6.d = r0
            r19.c()
        L_0x00f8:
            android.view.VelocityTracker r0 = r6.g
            if (r0 == 0) goto L_0x00ff
            r0.addMovement(r7)
        L_0x00ff:
            return r8
        L_0x0100:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    public final int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    public int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b2 = b();
        if (i2 != 0 && b2 >= i2 && b2 <= i3) {
            int a2 = gw.a(i, i2, i3);
            if (b2 != a2) {
                b(a2);
                return b2 - a2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return b();
    }

    /* access modifiers changed from: 0000 */
    public final int b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return a(coordinatorLayout, v, a() - i, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    public int b(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: 0000 */
    public int a(V v) {
        return v.getHeight();
    }

    private void c() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }
}
