package defpackage;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@cey
/* renamed from: dur reason: default package */
public final class dur extends dvf implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static final String[] a = {"2011", "1009", "3010"};
    private final Object b = new Object();
    private final FrameLayout c;
    private FrameLayout d;
    private View e;
    private final boolean f;
    private Map<String, WeakReference<View>> g = Collections.synchronizedMap(new HashMap());
    private View h;
    private duc i;
    private boolean j = false;
    private Point k = new Point();
    private Point l = new Point();
    private WeakReference<dld> m = new WeakReference<>(null);

    public dur(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.c = frameLayout;
        this.d = frameLayout2;
        bjl.A();
        cqk.a((View) this.c, (OnGlobalLayoutListener) this);
        bjl.A();
        cqk.a((View) this.c, (OnScrollChangedListener) this);
        this.c.setOnTouchListener(this);
        this.c.setOnClickListener(this);
        if (frameLayout2 != null && bzo.g()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        dsp.a(this.c.getContext());
        this.f = ((Boolean) dpn.f().a(dsp.cg)).booleanValue();
    }

    private final int a(int i2) {
        dpn.a();
        return col.b(this.i.m(), i2);
    }

    private final void a(View view) {
        duc duc = this.i;
        if (duc != null) {
            if (duc instanceof dub) {
                duc = ((dub) duc).f();
            }
            if (duc != null) {
                duc.c(view);
            }
        }
    }

    private final void b() {
        synchronized (this.b) {
            if (!this.f && this.j) {
                int measuredWidth = this.c.getMeasuredWidth();
                int measuredHeight = this.c.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.d == null)) {
                    this.d.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.j = false;
                }
            }
        }
    }

    public final car a(String str) {
        synchronized (this.b) {
            View view = null;
            if (this.g == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.g.get(str);
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            car a2 = cas.a(view);
            return a2;
        }
    }

    public final void a() {
        synchronized (this.b) {
            if (this.d != null) {
                this.d.removeAllViews();
            }
            this.d = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.e = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r4, defpackage.car r5) {
        /*
            r3 = this;
            java.lang.Object r5 = defpackage.cas.a(r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r3.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.g     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000f:
            if (r5 != 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r3.g     // Catch:{ all -> 0x0040 }
            r5.remove(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.g     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0040 }
            r2.<init>(r5)     // Catch:{ all -> 0x0040 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "1098"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "3011"
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r5.setOnTouchListener(r3)     // Catch:{ all -> 0x0040 }
            r4 = 1
            r5.setClickable(r4)     // Catch:{ all -> 0x0040 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dur.a(java.lang.String, car):void");
    }

    public final void b(car car) {
        this.i.a((View) cas.a(car));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
            duc r1 = r8.i     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x0009:
            duc r1 = r8.i     // Catch:{ all -> 0x008e }
            r1.c()     // Catch:{ all -> 0x008e }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r8.k     // Catch:{ all -> 0x008e }
            int r2 = r2.x     // Catch:{ all -> 0x008e }
            int r2 = r8.a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r8.k     // Catch:{ all -> 0x008e }
            int r2 = r2.y     // Catch:{ all -> 0x008e }
            int r2 = r8.a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r8.l     // Catch:{ all -> 0x008e }
            int r2 = r2.x     // Catch:{ all -> 0x008e }
            int r2 = r8.a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r8.l     // Catch:{ all -> 0x008e }
            int r2 = r2.y     // Catch:{ all -> 0x008e }
            int r2 = r8.a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            android.view.View r1 = r8.h     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            android.view.View r1 = r8.h     // Catch:{ all -> 0x008e }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            duc r1 = r8.i     // Catch:{ all -> 0x008e }
            boolean r1 = r1 instanceof defpackage.dub     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x007a
            duc r1 = r8.i     // Catch:{ all -> 0x008e }
            dub r1 = (defpackage.dub) r1     // Catch:{ all -> 0x008e }
            duc r1 = r1.f()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            duc r1 = r8.i     // Catch:{ all -> 0x008e }
            dub r1 = (defpackage.dub) r1     // Catch:{ all -> 0x008e }
            duc r2 = r1.f()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r7 = r8.c     // Catch:{ all -> 0x008e }
        L_0x0075:
            r3 = r9
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x007a:
            duc r2 = r8.i     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r7 = r8.c     // Catch:{ all -> 0x008e }
            goto L_0x0075
        L_0x0083:
            duc r1 = r8.i     // Catch:{ all -> 0x008e }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r8.g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r3 = r8.c     // Catch:{ all -> 0x008e }
            r1.a(r9, r2, r5, r3)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            goto L_0x0092
        L_0x0091:
            throw r9
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dur.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.b) {
            b();
            if (this.i != null) {
                this.i.c(this.c, this.g);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.b) {
            if (this.i != null) {
                this.i.c(this.c, this.g);
            }
            b();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.b) {
            if (this.i == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.c.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.k = point;
            if (motionEvent.getAction() == 0) {
                this.l = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.i.a(obtain);
            obtain.recycle();
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x024e, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x020e A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0117 A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0160 A[Catch:{ Exception -> 0x0191 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.car r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.b
            monitor-enter(r0)
            r1 = 0
            r12.a(r1)     // Catch:{ all -> 0x0252 }
            java.lang.Object r13 = defpackage.cas.a(r13)     // Catch:{ all -> 0x0252 }
            boolean r2 = r13 instanceof defpackage.duh     // Catch:{ all -> 0x0252 }
            r3 = 5
            if (r2 != 0) goto L_0x0015
            defpackage.cow.a(r3)     // Catch:{ all -> 0x0252 }
            monitor-exit(r0)     // Catch:{ all -> 0x0252 }
            return
        L_0x0015:
            boolean r2 = r12.f     // Catch:{ all -> 0x0252 }
            r4 = 0
            if (r2 != 0) goto L_0x002d
            android.widget.FrameLayout r2 = r12.d     // Catch:{ all -> 0x0252 }
            if (r2 == 0) goto L_0x002d
            android.widget.FrameLayout r2 = r12.d     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0252 }
            r5.<init>(r4, r4)     // Catch:{ all -> 0x0252 }
            r2.setLayoutParams(r5)     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r2 = r12.c     // Catch:{ all -> 0x0252 }
            r2.requestLayout()     // Catch:{ all -> 0x0252 }
        L_0x002d:
            r2 = 1
            r12.j = r2     // Catch:{ all -> 0x0252 }
            duh r13 = (defpackage.duh) r13     // Catch:{ all -> 0x0252 }
            duc r5 = r12.i     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x0051
            dsf<java.lang.Boolean> r5 = defpackage.dsp.bX     // Catch:{ all -> 0x0252 }
            dsn r6 = defpackage.dpn.f()     // Catch:{ all -> 0x0252 }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ all -> 0x0252 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0252 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x0051
            duc r5 = r12.i     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r6 = r12.c     // Catch:{ all -> 0x0252 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r7 = r12.g     // Catch:{ all -> 0x0252 }
            r5.b(r6, r7)     // Catch:{ all -> 0x0252 }
        L_0x0051:
            duc r5 = r12.i     // Catch:{ all -> 0x0252 }
            boolean r5 = r5 instanceof defpackage.duh     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x0089
            duc r5 = r12.i     // Catch:{ all -> 0x0252 }
            duh r5 = (defpackage.duh) r5     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x0089
            android.content.Context r6 = r5.b     // Catch:{ all -> 0x0252 }
            if (r6 == 0) goto L_0x0089
            ckp r6 = defpackage.bjl.B()     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r7 = r12.c     // Catch:{ all -> 0x0252 }
            android.content.Context r7 = r7.getContext()     // Catch:{ all -> 0x0252 }
            boolean r6 = r6.c(r7)     // Catch:{ all -> 0x0252 }
            if (r6 == 0) goto L_0x0089
            cko r5 = r5.n()     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x007a
            r5.a(r4)     // Catch:{ all -> 0x0252 }
        L_0x007a:
            java.lang.ref.WeakReference<dld> r6 = r12.m     // Catch:{ all -> 0x0252 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0252 }
            dld r6 = (defpackage.dld) r6     // Catch:{ all -> 0x0252 }
            if (r6 == 0) goto L_0x0089
            if (r5 == 0) goto L_0x0089
            r6.b(r5)     // Catch:{ all -> 0x0252 }
        L_0x0089:
            duc r5 = r12.i     // Catch:{ all -> 0x0252 }
            boolean r5 = r5 instanceof defpackage.dub     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x00a1
            duc r5 = r12.i     // Catch:{ all -> 0x0252 }
            dub r5 = (defpackage.dub) r5     // Catch:{ all -> 0x0252 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x00a1
            duc r5 = r12.i     // Catch:{ all -> 0x0252 }
            dub r5 = (defpackage.dub) r5     // Catch:{ all -> 0x0252 }
            r5.a(r13)     // Catch:{ all -> 0x0252 }
            goto L_0x00ad
        L_0x00a1:
            r12.i = r13     // Catch:{ all -> 0x0252 }
            boolean r5 = r13 instanceof defpackage.dub     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x00ad
            r5 = r13
            dub r5 = (defpackage.dub) r5     // Catch:{ all -> 0x0252 }
            r5.a(r1)     // Catch:{ all -> 0x0252 }
        L_0x00ad:
            android.widget.FrameLayout r5 = r12.d     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x00b3
            monitor-exit(r0)     // Catch:{ all -> 0x0252 }
            return
        L_0x00b3:
            dsf<java.lang.Boolean> r5 = defpackage.dsp.bX     // Catch:{ all -> 0x0252 }
            dsn r6 = defpackage.dpn.f()     // Catch:{ all -> 0x0252 }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ all -> 0x0252 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0252 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x00ca
            android.widget.FrameLayout r5 = r12.d     // Catch:{ all -> 0x0252 }
            r5.setClickable(r4)     // Catch:{ all -> 0x0252 }
        L_0x00ca:
            android.widget.FrameLayout r5 = r12.d     // Catch:{ all -> 0x0252 }
            r5.removeAllViews()     // Catch:{ all -> 0x0252 }
            boolean r5 = r13.a()     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x0105
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r12.g     // Catch:{ all -> 0x0252 }
            if (r6 == 0) goto L_0x00fd
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x0252 }
            java.lang.String r8 = "1098"
            r7[r4] = r8     // Catch:{ all -> 0x0252 }
            java.lang.String r8 = "3011"
            r7[r2] = r8     // Catch:{ all -> 0x0252 }
            r8 = 0
        L_0x00e5:
            if (r8 >= r6) goto L_0x00fd
            r9 = r7[r8]     // Catch:{ all -> 0x0252 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r10 = r12.g     // Catch:{ all -> 0x0252 }
            java.lang.Object r9 = r10.get(r9)     // Catch:{ all -> 0x0252 }
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9     // Catch:{ all -> 0x0252 }
            if (r9 == 0) goto L_0x00fa
            java.lang.Object r6 = r9.get()     // Catch:{ all -> 0x0252 }
            android.view.View r6 = (android.view.View) r6     // Catch:{ all -> 0x0252 }
            goto L_0x00fe
        L_0x00fa:
            int r8 = r8 + 1
            goto L_0x00e5
        L_0x00fd:
            r6 = r1
        L_0x00fe:
            boolean r7 = r6 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0252 }
            if (r7 == 0) goto L_0x0105
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x0252 }
            goto L_0x0106
        L_0x0105:
            r6 = r1
        L_0x0106:
            if (r5 == 0) goto L_0x010b
            if (r6 == 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r2 = 0
        L_0x010c:
            android.view.View r5 = r13.a(r12, r2)     // Catch:{ all -> 0x0252 }
            r12.h = r5     // Catch:{ all -> 0x0252 }
            android.view.View r5 = r12.h     // Catch:{ all -> 0x0252 }
            r11 = -1
            if (r5 == 0) goto L_0x0151
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r12.g     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x0129
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r12.g     // Catch:{ all -> 0x0252 }
            java.lang.String r7 = "1007"
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0252 }
            android.view.View r9 = r12.h     // Catch:{ all -> 0x0252 }
            r8.<init>(r9)     // Catch:{ all -> 0x0252 }
            r5.put(r7, r8)     // Catch:{ all -> 0x0252 }
        L_0x0129:
            if (r2 == 0) goto L_0x0134
            r6.removeAllViews()     // Catch:{ all -> 0x0252 }
            android.view.View r2 = r12.h     // Catch:{ all -> 0x0252 }
            r6.addView(r2)     // Catch:{ all -> 0x0252 }
            goto L_0x0151
        L_0x0134:
            android.content.Context r2 = r13.b     // Catch:{ all -> 0x0252 }
            com.google.android.gms.ads.formats.AdChoicesView r5 = new com.google.android.gms.ads.formats.AdChoicesView     // Catch:{ all -> 0x0252 }
            r5.<init>(r2)     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0252 }
            r2.<init>(r11, r11)     // Catch:{ all -> 0x0252 }
            r5.setLayoutParams(r2)     // Catch:{ all -> 0x0252 }
            android.view.View r2 = r12.h     // Catch:{ all -> 0x0252 }
            r5.addView(r2)     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r2 = r12.d     // Catch:{ all -> 0x0252 }
            if (r2 == 0) goto L_0x0151
            android.widget.FrameLayout r2 = r12.d     // Catch:{ all -> 0x0252 }
            r2.addView(r5)     // Catch:{ all -> 0x0252 }
        L_0x0151:
            android.widget.FrameLayout r6 = r12.c     // Catch:{ all -> 0x0252 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r7 = r12.g     // Catch:{ all -> 0x0252 }
            r8 = 0
            r5 = r13
            r9 = r12
            r10 = r12
            r5.a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0252 }
            boolean r2 = r12.f     // Catch:{ all -> 0x0252 }
            if (r2 == 0) goto L_0x018c
            android.view.View r2 = r12.e     // Catch:{ all -> 0x0252 }
            if (r2 != 0) goto L_0x017b
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r5 = r12.c     // Catch:{ all -> 0x0252 }
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x0252 }
            r2.<init>(r5)     // Catch:{ all -> 0x0252 }
            r12.e = r2     // Catch:{ all -> 0x0252 }
            android.view.View r2 = r12.e     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0252 }
            r5.<init>(r11, r4)     // Catch:{ all -> 0x0252 }
            r2.setLayoutParams(r5)     // Catch:{ all -> 0x0252 }
        L_0x017b:
            android.widget.FrameLayout r2 = r12.c     // Catch:{ all -> 0x0252 }
            android.view.View r5 = r12.e     // Catch:{ all -> 0x0252 }
            android.view.ViewParent r5 = r5.getParent()     // Catch:{ all -> 0x0252 }
            if (r2 == r5) goto L_0x018c
            android.widget.FrameLayout r2 = r12.c     // Catch:{ all -> 0x0252 }
            android.view.View r5 = r12.e     // Catch:{ all -> 0x0252 }
            r2.addView(r5)     // Catch:{ all -> 0x0252 }
        L_0x018c:
            csr r2 = r13.g()     // Catch:{ Exception -> 0x0191 }
            goto L_0x01a5
        L_0x0191:
            r2 = move-exception
            defpackage.bjl.g()     // Catch:{ all -> 0x0252 }
            boolean r5 = defpackage.cmj.e()     // Catch:{ all -> 0x0252 }
            if (r5 == 0) goto L_0x019f
            defpackage.cow.a(r3)     // Catch:{ all -> 0x0252 }
            goto L_0x01a4
        L_0x019f:
            java.lang.String r3 = "Error obtaining overlay."
            defpackage.clu.a(r3, r2)     // Catch:{ all -> 0x0252 }
        L_0x01a4:
            r2 = r1
        L_0x01a5:
            if (r2 == 0) goto L_0x01b4
            android.widget.FrameLayout r3 = r12.d     // Catch:{ all -> 0x0252 }
            if (r3 == 0) goto L_0x01b4
            android.widget.FrameLayout r3 = r12.d     // Catch:{ all -> 0x0252 }
            android.view.View r2 = r2.o()     // Catch:{ all -> 0x0252 }
            r3.addView(r2)     // Catch:{ all -> 0x0252 }
        L_0x01b4:
            java.lang.Object r2 = r12.b     // Catch:{ all -> 0x0252 }
            monitor-enter(r2)     // Catch:{ all -> 0x0252 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r12.g     // Catch:{ all -> 0x024f }
            r13.a(r3)     // Catch:{ all -> 0x024f }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r12.g     // Catch:{ all -> 0x024f }
            if (r3 == 0) goto L_0x01db
            java.lang.String[] r3 = a     // Catch:{ all -> 0x024f }
        L_0x01c2:
            r5 = 3
            if (r4 >= r5) goto L_0x01db
            r5 = r3[r4]     // Catch:{ all -> 0x024f }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r12.g     // Catch:{ all -> 0x024f }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x024f }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ all -> 0x024f }
            if (r5 == 0) goto L_0x01d8
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x024f }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x024f }
            goto L_0x01db
        L_0x01d8:
            int r4 = r4 + 1
            goto L_0x01c2
        L_0x01db:
            boolean r3 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x024f }
            if (r3 != 0) goto L_0x01e4
            r13.i()     // Catch:{ all -> 0x024f }
        L_0x01e2:
            monitor-exit(r2)     // Catch:{ all -> 0x024f }
            goto L_0x01f5
        L_0x01e4:
            dus r3 = new dus     // Catch:{ all -> 0x024f }
            r3.<init>(r12, r1)     // Catch:{ all -> 0x024f }
            boolean r4 = r13 instanceof defpackage.dub     // Catch:{ all -> 0x024f }
            if (r4 == 0) goto L_0x01f1
            r13.b(r1, r3)     // Catch:{ all -> 0x024f }
            goto L_0x01e2
        L_0x01f1:
            r13.a(r1, r3)     // Catch:{ all -> 0x024f }
            goto L_0x01e2
        L_0x01f5:
            android.widget.FrameLayout r1 = r12.c     // Catch:{ all -> 0x0252 }
            due r13 = r13.a     // Catch:{ all -> 0x0252 }
            r13.b(r1)     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r13 = r12.c     // Catch:{ all -> 0x0252 }
            r12.a(r13)     // Catch:{ all -> 0x0252 }
            duc r13 = r12.i     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r1 = r12.c     // Catch:{ all -> 0x0252 }
            r13.b(r1)     // Catch:{ all -> 0x0252 }
            duc r13 = r12.i     // Catch:{ all -> 0x0252 }
            boolean r13 = r13 instanceof defpackage.duh     // Catch:{ all -> 0x0252 }
            if (r13 == 0) goto L_0x024d
            duc r13 = r12.i     // Catch:{ all -> 0x0252 }
            duh r13 = (defpackage.duh) r13     // Catch:{ all -> 0x0252 }
            if (r13 == 0) goto L_0x024d
            android.content.Context r1 = r13.b     // Catch:{ all -> 0x0252 }
            if (r1 == 0) goto L_0x024d
            ckp r1 = defpackage.bjl.B()     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r2 = r12.c     // Catch:{ all -> 0x0252 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0252 }
            boolean r1 = r1.c(r2)     // Catch:{ all -> 0x0252 }
            if (r1 == 0) goto L_0x024d
            java.lang.ref.WeakReference<dld> r1 = r12.m     // Catch:{ all -> 0x0252 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0252 }
            dld r1 = (defpackage.dld) r1     // Catch:{ all -> 0x0252 }
            if (r1 != 0) goto L_0x0246
            dld r1 = new dld     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r2 = r12.c     // Catch:{ all -> 0x0252 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0252 }
            android.widget.FrameLayout r3 = r12.c     // Catch:{ all -> 0x0252 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0252 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0252 }
            r2.<init>(r1)     // Catch:{ all -> 0x0252 }
            r12.m = r2     // Catch:{ all -> 0x0252 }
        L_0x0246:
            cko r13 = r13.n()     // Catch:{ all -> 0x0252 }
            r1.a(r13)     // Catch:{ all -> 0x0252 }
        L_0x024d:
            monitor-exit(r0)     // Catch:{ all -> 0x0252 }
            return
        L_0x024f:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x024f }
            throw r13     // Catch:{ all -> 0x0252 }
        L_0x0252:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0252 }
            goto L_0x0256
        L_0x0255:
            throw r13
        L_0x0256:
            goto L_0x0255
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dur.a(car):void");
    }

    public final void a(car car, int i2) {
        if (bjl.B().c(this.c.getContext())) {
            WeakReference<dld> weakReference = this.m;
            if (weakReference != null) {
                dld dld = (dld) weakReference.get();
                if (dld != null) {
                    dld.a(4);
                }
            }
        }
        b();
    }
}
