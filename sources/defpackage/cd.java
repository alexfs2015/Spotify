package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: cd reason: default package */
public abstract class cd implements OnAttachStateChangeListener, OnTouchListener {
    final View a;
    private final float b;
    private final int c;
    private final int d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private int h;
    private final int[] i = new int[2];

    /* renamed from: cd$a */
    class a implements Runnable {
        a() {
        }

        public final void run() {
            ViewParent parent = cd.this.a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: cd$b */
    class b implements Runnable {
        b() {
        }

        public final void run() {
            cd.this.d();
        }
    }

    public cd(View view) {
        this.a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.c = ViewConfiguration.getTapTimeout();
        this.d = (this.c + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void e() {
        Runnable runnable = this.f;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            this.a.removeCallbacks(runnable2);
        }
    }

    public abstract bg a();

    /* access modifiers changed from: protected */
    public boolean b() {
        bg a2 = a();
        if (a2 != null && !a2.e()) {
            a2.d_();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        bg a2 = a();
        if (a2 != null && a2.e()) {
            a2.d();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        e();
        View view = this.a;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.g = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r4 != 3) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.g
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x0071
            android.view.View r3 = r11.a
            bg r4 = r11.a()
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.e()
            if (r5 != 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            android.widget.ListView r4 = r4.g()
            cb r4 = (defpackage.cb) r4
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x0061
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.i
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.i
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.h
            boolean r3 = r4.a(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r1) goto L_0x005a
            if (r13 == r0) goto L_0x005a
            r13 = 1
            goto L_0x005b
        L_0x005a:
            r13 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x0061
            r13 = 1
            goto L_0x0062
        L_0x0061:
            r13 = 0
        L_0x0062:
            if (r13 != 0) goto L_0x006e
            boolean r13 = r11.c()
            if (r13 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r13 = 0
            goto L_0x0125
        L_0x006e:
            r13 = 1
            goto L_0x0125
        L_0x0071:
            android.view.View r3 = r11.a
            boolean r4 = r3.isEnabled()
            if (r4 == 0) goto L_0x0102
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d6
            if (r4 == r1) goto L_0x00d2
            r5 = 2
            if (r4 == r5) goto L_0x0088
            if (r4 == r0) goto L_0x00d2
            goto L_0x0102
        L_0x0088:
            int r0 = r11.h
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0102
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.b
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c3
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c3
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c3
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c3
            r13 = 1
            goto L_0x00c4
        L_0x00c3:
            r13 = 0
        L_0x00c4:
            if (r13 != 0) goto L_0x0102
            r11.e()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            r13 = 1
            goto L_0x0103
        L_0x00d2:
            r11.e()
            goto L_0x0102
        L_0x00d6:
            int r13 = r13.getPointerId(r2)
            r11.h = r13
            java.lang.Runnable r13 = r11.e
            if (r13 != 0) goto L_0x00e7
            cd$a r13 = new cd$a
            r13.<init>()
            r11.e = r13
        L_0x00e7:
            java.lang.Runnable r13 = r11.e
            int r0 = r11.c
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.f
            if (r13 != 0) goto L_0x00fa
            cd$b r13 = new cd$b
            r13.<init>()
            r11.f = r13
        L_0x00fa:
            java.lang.Runnable r13 = r11.f
            int r0 = r11.d
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
        L_0x0102:
            r13 = 0
        L_0x0103:
            if (r13 == 0) goto L_0x010d
            boolean r13 = r11.b()
            if (r13 == 0) goto L_0x010d
            r13 = 1
            goto L_0x010e
        L_0x010d:
            r13 = 0
        L_0x010e:
            if (r13 == 0) goto L_0x0125
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.a
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0125:
            r11.g = r13
            if (r13 != 0) goto L_0x012d
            if (r12 == 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            return r2
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        Runnable runnable = this.e;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }
}
