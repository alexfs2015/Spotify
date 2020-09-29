package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class DraggableViewOffsetBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private boolean a;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    public DraggableViewOffsetBehavior() {
    }

    public DraggableViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void b() {
        this.a = false;
        this.d = -1;
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.g = null;
        }
    }

    private void c() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f2);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0 != 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
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
            boolean r0 = r4.a
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            if (r0 == 0) goto L_0x0052
            if (r0 == r2) goto L_0x004e
            if (r0 == r1) goto L_0x002d
            r5 = 3
            if (r0 == r5) goto L_0x004e
            goto L_0x0076
        L_0x002d:
            int r5 = r4.d
            r6 = -1
            if (r5 == r6) goto L_0x0076
            int r5 = r7.findPointerIndex(r5)
            if (r5 == r6) goto L_0x0076
            float r5 = r7.getY(r5)
            int r5 = (int) r5
            int r6 = r4.e
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f
            if (r6 <= r0) goto L_0x0076
            r4.a = r2
            r4.e = r5
            goto L_0x0076
        L_0x004e:
            r4.b()
            goto L_0x0076
        L_0x0052:
            r0 = 0
            r4.a = r0
            float r1 = r7.getX()
            int r1 = (int) r1
            float r2 = r7.getY()
            int r2 = (int) r2
            boolean r3 = r4.b(r5, r6)
            if (r3 == 0) goto L_0x0076
            boolean r5 = r5.a(r6, r1, r2)
            if (r5 == 0) goto L_0x0076
            r4.e = r2
            int r5 = r7.getPointerId(r0)
            r4.d = r5
            r4.c()
        L_0x0076:
            android.view.VelocityTracker r5 = r4.g
            if (r5 == 0) goto L_0x007d
            r5.addMovement(r7)
        L_0x007d:
            boolean r5 = r4.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    public boolean b(CoordinatorLayout coordinatorLayout, V v) {
        return true;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int y = (int) motionEvent.getY();
            if (!coordinatorLayout.a((View) v, (int) motionEvent.getX(), y) || !b(coordinatorLayout, v)) {
                return false;
            }
            this.e = y;
            this.d = motionEvent.getPointerId(0);
            c();
        } else if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
                this.g.computeCurrentVelocity(1000);
                a(coordinatorLayout, v, -e(coordinatorLayout, v), 0, this.g.getYVelocity(this.d));
            }
            b();
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.d);
            if (findPointerIndex == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int i = this.e - y2;
            if (!this.a) {
                int abs = Math.abs(i);
                int i2 = this.f;
                if (abs > i2) {
                    this.a = true;
                    i = i > 0 ? i - i2 : i + i2;
                }
            }
            int i3 = i;
            if (this.a) {
                this.e = y2;
                a(coordinatorLayout, v, i3, c(coordinatorLayout, v), d(coordinatorLayout, v));
            }
        } else if (actionMasked == 3) {
            b();
        }
        VelocityTracker velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public int c(CoordinatorLayout coordinatorLayout, V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: protected */
    public int d(CoordinatorLayout coordinatorLayout, V v) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int e(CoordinatorLayout coordinatorLayout, V v) {
        return v.getHeight();
    }
}
