package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {
    int a;
    int b;
    int c;
    public boolean d;
    public int e = 4;
    jw f;
    int g;
    WeakReference<V> h;
    WeakReference<View> i;
    public a j;
    int k;
    boolean l;
    /* access modifiers changed from: private */
    public boolean m = true;
    private float n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    private VelocityTracker w;
    private int x;
    private Map<View, Integer> y;
    private final defpackage.jw.a z = new defpackage.jw.a() {
        public final boolean b(View view, int i) {
            if (BottomSheetBehavior.this.e == 1 || BottomSheetBehavior.this.l) {
                return false;
            }
            if (BottomSheetBehavior.this.e == 3 && BottomSheetBehavior.this.k == i) {
                View view2 = (View) BottomSheetBehavior.this.i.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return BottomSheetBehavior.this.h != null && BottomSheetBehavior.this.h.get() == view;
        }

        public final void a(View view, int i, int i2, int i3) {
            BottomSheetBehavior.this.d(i2);
        }

        public final void a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.c(1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0029
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.m
                if (r9 == 0) goto L_0x0018
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.a
            L_0x0015:
                r2 = 3
                goto L_0x00ce
            L_0x0018:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.b
                if (r9 <= r10) goto L_0x0015
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.b
            L_0x0026:
                r2 = 6
                goto L_0x00ce
            L_0x0029:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r5.d
                if (r5 == 0) goto L_0x0054
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r5.a(r8, r10)
                if (r5 == 0) goto L_0x0054
                int r5 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.c
                if (r5 > r6) goto L_0x004d
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0054
            L_0x004d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.g
                r2 = 5
                goto L_0x00ce
            L_0x0054:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x006a
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0065
                goto L_0x006a
            L_0x0065:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.c
                goto L_0x00ce
            L_0x006a:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.m
                if (r10 == 0) goto L_0x0095
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.a
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.c
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x0090
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.a
                goto L_0x0015
            L_0x0090:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.c
                goto L_0x00ce
            L_0x0095:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.b
                if (r9 >= r10) goto L_0x00af
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.c
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00a9
                goto L_0x0015
            L_0x00a9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.b
                goto L_0x0026
            L_0x00af:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.b
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.c
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ca
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.b
                goto L_0x0026
            L_0x00ca:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.c
            L_0x00ce:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                jw r9 = r9.f
                int r10 = r8.getLeft()
                boolean r9 = r9.a(r10, r0)
                if (r9 == 0) goto L_0x00ed
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10 = 2
                r9.c(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior$c r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                defpackage.ip.a(r8, r9)
                return
            L_0x00ed:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8.c(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass2.a(android.view.View, float, float):void");
        }

        public final int d(View view, int i) {
            return gw.a(i, BottomSheetBehavior.this.c(), BottomSheetBehavior.this.d ? BottomSheetBehavior.this.g : BottomSheetBehavior.this.c);
        }

        public final int c(View view, int i) {
            return view.getLeft();
        }

        public final int b() {
            if (BottomSheetBehavior.this.d) {
                return BottomSheetBehavior.this.g;
            }
            return BottomSheetBehavior.this.c;
        }
    };

    public static abstract class a {
        public abstract void a(float f);

        public abstract void a(int i);
    }

    public static class b extends jt {
        public static final Creator<b> CREATOR = new ClassLoaderCreator<b>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }
        };
        final int a;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
        }

        public b(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    class c implements Runnable {
        private final View a;
        private final int b;

        c(View view, int i) {
            this.a = view;
            this.b = i;
        }

        public final void run() {
            if (BottomSheetBehavior.this.f == null || !BottomSheetBehavior.this.f.a(true)) {
                BottomSheetBehavior.this.c(this.b);
            } else {
                ip.a(this.a, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyc.a.C);
        TypedValue peekValue = obtainStyledAttributes.peekValue(defpackage.eyc.a.F);
        if (peekValue == null || peekValue.data != -1) {
            e(obtainStyledAttributes.getDimensionPixelSize(defpackage.eyc.a.F, -1));
        } else {
            e(peekValue.data);
        }
        this.d = obtainStyledAttributes.getBoolean(defpackage.eyc.a.E, false);
        boolean z2 = obtainStyledAttributes.getBoolean(defpackage.eyc.a.D, true);
        if (this.m != z2) {
            this.m = z2;
            if (this.h != null) {
                a();
            }
            c((!this.m || this.e != 6) ? this.e : 3);
        }
        this.s = obtainStyledAttributes.getBoolean(defpackage.eyc.a.G, false);
        obtainStyledAttributes.recycle();
        this.n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new b(super.a(coordinatorLayout, v2), this.e);
    }

    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.a(coordinatorLayout, v2, bVar.d);
        if (bVar.a == 1 || bVar.a == 2) {
            this.e = 4;
        } else {
            this.e = bVar.a;
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        if (ip.t(coordinatorLayout) && !ip.t(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.b(v2, i2);
        this.g = coordinatorLayout.getHeight();
        if (this.p) {
            if (this.q == 0) {
                this.q = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            this.r = Math.max(this.q, this.g - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.r = this.o;
        }
        this.a = Math.max(0, this.g - v2.getHeight());
        this.b = this.g / 2;
        a();
        int i3 = this.e;
        if (i3 == 3) {
            ip.f((View) v2, c());
        } else if (i3 == 6) {
            ip.f((View) v2, this.b);
        } else if (!this.d || i3 != 5) {
            int i4 = this.e;
            if (i4 == 4) {
                ip.f((View) v2, this.c);
            } else if (i4 == 1 || i4 == 2) {
                ip.f((View) v2, top - v2.getTop());
            }
        } else {
            ip.f((View) v2, this.g);
        }
        if (this.f == null) {
            this.f = jw.a((ViewGroup) coordinatorLayout, this.z);
        }
        this.h = new WeakReference<>(v2);
        this.i = new WeakReference<>(b((View) v2));
        return true;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            this.t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            b();
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.x = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.i;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && coordinatorLayout.a(view2, x2, this.x)) {
                this.k = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.l = true;
            }
            this.t = this.k == -1 && !coordinatorLayout.a((View) v2, x2, this.x);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.l = false;
            this.k = -1;
            if (this.t) {
                this.t = false;
                return false;
            }
        }
        if (!this.t) {
            jw jwVar = this.f;
            if (jwVar != null && jwVar.a(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.i;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.t && this.e != 1 && !coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f != null && Math.abs(((float) this.x) - motionEvent.getY()) > ((float) this.f.b);
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.e == 1 && actionMasked == 0) {
            return true;
        }
        jw jwVar = this.f;
        if (jwVar != null) {
            jwVar.b(motionEvent);
        }
        if (actionMasked == 0) {
            b();
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        if (actionMasked == 2 && !this.t && Math.abs(((float) this.x) - motionEvent.getY()) > ((float) this.f.b)) {
            this.f.a((View) v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.t) {
            return true;
        }
        return false;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.u = 0;
        this.v = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1 && view == ((View) this.i.get())) {
            int top = v2.getTop();
            int i5 = top - i3;
            if (i3 > 0) {
                if (i5 < c()) {
                    iArr[1] = top - c();
                    ip.f((View) v2, -iArr[1]);
                    c(3);
                } else {
                    iArr[1] = i3;
                    ip.f((View) v2, -i3);
                    c(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.c;
                if (i5 <= i6 || this.d) {
                    iArr[1] = i3;
                    ip.f((View) v2, -i3);
                    c(1);
                } else {
                    iArr[1] = top - i6;
                    ip.f((View) v2, -iArr[1]);
                    c(4);
                }
            }
            d(v2.getTop());
            this.u = i3;
            this.v = true;
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4;
        float f2;
        int i5 = 3;
        if (v2.getTop() == c()) {
            c(3);
            return;
        }
        if (view == this.i.get() && this.v) {
            if (this.u > 0) {
                i3 = c();
            } else {
                if (this.d) {
                    VelocityTracker velocityTracker = this.w;
                    if (velocityTracker == null) {
                        f2 = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.n);
                        f2 = this.w.getYVelocity(this.k);
                    }
                    if (a((View) v2, f2)) {
                        i3 = this.g;
                        i5 = 5;
                    }
                }
                if (this.u == 0) {
                    int top = v2.getTop();
                    if (!this.m) {
                        int i6 = this.b;
                        if (top < i6) {
                            if (top < Math.abs(top - this.c)) {
                                i3 = 0;
                            } else {
                                i3 = this.b;
                            }
                        } else if (Math.abs(top - i6) < Math.abs(top - this.c)) {
                            i3 = this.b;
                        } else {
                            i4 = this.c;
                        }
                        i5 = 6;
                    } else if (Math.abs(top - this.a) < Math.abs(top - this.c)) {
                        i3 = this.a;
                    } else {
                        i4 = this.c;
                    }
                } else {
                    i4 = this.c;
                }
                i5 = 4;
            }
            if (this.f.a((View) v2, v2.getLeft(), i3)) {
                c(2);
                ip.a((View) v2, (Runnable) new c(v2, i5));
            } else {
                c(i5);
            }
            this.v = false;
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        return view == this.i.get() && (this.e != 3 || super.a(coordinatorLayout, v2, view, f2, f3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.p
            if (r4 != 0) goto L_0x0015
            r3.p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.o = r1
            int r1 = r3.g
            int r1 = r1 - r4
            r3.c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.e
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.h
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e(int):void");
    }

    public final void b(final int i2) {
        if (i2 != this.e) {
            WeakReference<V> weakReference = this.h;
            if (weakReference == null) {
                if (i2 == 4 || i2 == 3 || i2 == 6 || (this.d && i2 == 5)) {
                    this.e = i2;
                }
                return;
            }
            final View view = (View) weakReference.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !ip.E(view)) {
                    b(view, i2);
                } else {
                    view.post(new Runnable() {
                        public final void run() {
                            BottomSheetBehavior.this.b(view, i2);
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i2) {
        if (this.e != i2) {
            this.e = i2;
            if (i2 == 6 || i2 == 3) {
                a(true);
            } else if (i2 == 5 || i2 == 4) {
                a(false);
            }
            if (((View) this.h.get()) != null) {
                a aVar = this.j;
                if (aVar != null) {
                    aVar.a(i2);
                }
            }
        }
    }

    private void a() {
        if (this.m) {
            this.c = Math.max(this.g - this.r, this.a);
        } else {
            this.c = this.g - this.r;
        }
    }

    private void b() {
        this.k = -1;
        VelocityTracker velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.w = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(View view, float f2) {
        if (this.s) {
            return true;
        }
        if (view.getTop() >= this.c && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.c)) / ((float) this.o) > 0.5f) {
            return true;
        }
        return false;
    }

    private View b(View view) {
        if (ip.y(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View b2 = b(viewGroup.getChildAt(i2));
                if (b2 != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int c() {
        if (this.m) {
            return this.a;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final void b(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.c;
        } else if (i2 == 6) {
            int i4 = this.b;
            if (this.m) {
                int i5 = this.a;
                if (i4 <= i5) {
                    i3 = i5;
                    i2 = 3;
                }
            }
            i3 = i4;
        } else if (i2 == 3) {
            i3 = c();
        } else if (!this.d || i2 != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i3 = this.g;
        }
        if (this.f.a(view, view.getLeft(), i3)) {
            c(2);
            ip.a(view, (Runnable) new c(view, i2));
            return;
        }
        c(i2);
    }

    /* access modifiers changed from: 0000 */
    public final void d(int i2) {
        if (((View) this.h.get()) != null) {
            a aVar = this.j;
            if (aVar != null) {
                int i3 = this.c;
                if (i2 > i3) {
                    aVar.a(((float) (i3 - i2)) / ((float) (this.g - i3)));
                    return;
                }
                aVar.a(((float) (i3 - i2)) / ((float) (i3 - c())));
            }
        }
    }

    public static <V extends View> BottomSheetBehavior<V> a(V v2) {
        LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof d) {
            Behavior behavior = ((d) layoutParams).a;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void a(boolean z2) {
        WeakReference<V> weakReference = this.h;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z2) {
                    if (this.y == null) {
                        this.y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.h.get()) {
                        if (!z2) {
                            Map<View, Integer> map = this.y;
                            if (map != null && map.containsKey(childAt)) {
                                ip.b(childAt, ((Integer) this.y.get(childAt)).intValue());
                            }
                        } else {
                            if (VERSION.SDK_INT >= 16) {
                                this.y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            ip.b(childAt, 4);
                        }
                    }
                }
                if (!z2) {
                    this.y = null;
                }
            }
        }
    }
}
