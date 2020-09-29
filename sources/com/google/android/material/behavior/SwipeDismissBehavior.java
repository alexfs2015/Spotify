package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {
    jw a;
    public a b;
    public int c = 2;
    float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    private boolean g;
    private float h = 0.0f;
    private final defpackage.jw.a i = new defpackage.jw.a() {
        private int a;
        private int b = -1;

        public final boolean b(View view, int i) {
            return this.b == -1 && SwipeDismissBehavior.this.a(view);
        }

        public final void a(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public final void a(int i) {
            if (SwipeDismissBehavior.this.b != null) {
                SwipeDismissBehavior.this.b.a(i);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
            if (java.lang.Math.abs(r7.getLeft() - r6.a) >= java.lang.Math.round(((float) r7.getWidth()) * r6.c.d)) goto L_0x005f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008c A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r9 = -1
                r6.b = r9
                int r9 = r7.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0043
                int r3 = defpackage.ip.f(r7)
                if (r3 != r2) goto L_0x0016
                r3 = 1
                goto L_0x0017
            L_0x0016:
                r3 = 0
            L_0x0017:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.c
                r5 = 2
                if (r4 != r5) goto L_0x001f
                goto L_0x005f
            L_0x001f:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.c
                if (r4 != 0) goto L_0x0031
                if (r3 == 0) goto L_0x002c
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0061
                goto L_0x005f
            L_0x002c:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0061
                goto L_0x005f
            L_0x0031:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.c
                if (r4 != r2) goto L_0x0061
                if (r3 == 0) goto L_0x003e
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0061
                goto L_0x005f
            L_0x003e:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0061
                goto L_0x005f
            L_0x0043:
                int r8 = r7.getLeft()
                int r0 = r6.a
                int r8 = r8 - r0
                int r0 = r7.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.d
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r0) goto L_0x0061
            L_0x005f:
                r8 = 1
                goto L_0x0062
            L_0x0061:
                r8 = 0
            L_0x0062:
                if (r8 == 0) goto L_0x0071
                int r8 = r7.getLeft()
                int r0 = r6.a
                if (r8 >= r0) goto L_0x006e
                int r0 = r0 - r9
                goto L_0x006f
            L_0x006e:
                int r0 = r0 + r9
            L_0x006f:
                r1 = 1
                goto L_0x0073
            L_0x0071:
                int r0 = r6.a
            L_0x0073:
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                jw r8 = r8.a
                int r9 = r7.getTop()
                boolean r8 = r8.a(r0, r9)
                if (r8 == 0) goto L_0x008c
                com.google.android.material.behavior.SwipeDismissBehavior$b r8 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.<init>(r7, r1)
                defpackage.ip.a(r7, r8)
                return
            L_0x008c:
                if (r1 == 0) goto L_0x009b
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$a r8 = r8.b
                if (r8 == 0) goto L_0x009b
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$a r8 = r8.b
                r8.a(r7)
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass1.a(android.view.View, float, float):void");
        }

        public final int a(View view) {
            return view.getWidth();
        }

        public final int c(View view, int i) {
            int i2;
            int i3;
            int width;
            boolean z = ip.f(view) == 1;
            if (SwipeDismissBehavior.this.c != 0) {
                if (SwipeDismissBehavior.this.c != 1) {
                    i3 = this.a - view.getWidth();
                    i2 = view.getWidth() + this.a;
                } else if (z) {
                    i3 = this.a;
                    width = view.getWidth();
                } else {
                    i3 = this.a - view.getWidth();
                    i2 = this.a;
                }
                return SwipeDismissBehavior.a(i3, i, i2);
            } else if (z) {
                i3 = this.a - view.getWidth();
                i2 = this.a;
                return SwipeDismissBehavior.a(i3, i, i2);
            } else {
                i3 = this.a;
                width = view.getWidth();
            }
            i2 = width + i3;
            return SwipeDismissBehavior.a(i3, i, i2);
        }

        public final int d(View view, int i) {
            return view.getTop();
        }

        public final void a(View view, int i, int i2, int i3) {
            float width = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.e);
            float width2 = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f), 1.0f));
            }
        }
    };

    public interface a {
        void a(int i);

        void a(View view);
    }

    class b implements Runnable {
        private final View a;
        private final boolean b;

        b(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        public final void run() {
            if (SwipeDismissBehavior.this.a == null || !SwipeDismissBehavior.this.a.a(true)) {
                if (this.b && SwipeDismissBehavior.this.b != null) {
                    SwipeDismissBehavior.this.b.a(this.a);
                }
                return;
            }
            ip.a(this.a, (Runnable) this);
        }
    }

    static float b(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public boolean a(View view) {
        return true;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = coordinatorLayout.a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.g;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = jw.a((ViewGroup) coordinatorLayout, this.i);
        }
        return this.a.a(motionEvent);
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        jw jwVar = this.a;
        if (jwVar == null) {
            return false;
        }
        jwVar.b(motionEvent);
        return true;
    }

    public static float a(float f2, float f3, float f4) {
        return Math.min(Math.max(0.0f, f3), 1.0f);
    }

    static int a(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }
}
