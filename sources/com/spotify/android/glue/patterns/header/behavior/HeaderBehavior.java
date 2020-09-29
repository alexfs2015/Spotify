package com.spotify.android.glue.patterns.header.behavior;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Scroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import defpackage.fwq;
import java.lang.ref.WeakReference;

public abstract class HeaderBehavior<T extends View & fwq> extends DraggableViewOffsetBehavior<T> {
    int a;
    private final fvt d = new fvt();
    private ValueAnimator e;
    private float f = -2.14748365E9f;
    private int g;
    private boolean h;

    public HeaderBehavior() {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(CoordinatorLayout coordinatorLayout, T t, int i, float f2) {
        if (!((GlueHeaderLayout) coordinatorLayout).d) {
            a(coordinatorLayout, f2);
            ((fww) t).a(i, f2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, ValueAnimator valueAnimator) {
        c(coordinatorLayout, view, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    private void a(CoordinatorLayout coordinatorLayout, fwq fwq) {
        c();
        f(coordinatorLayout, (View) fwq);
        this.e.setIntValues(new int[]{super.a(), -fwq.a()});
        this.e.start();
    }

    private int b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
        int a2 = vge.a(i2, i3, i);
        if (((GlueHeaderLayout) coordinatorLayout).d) {
            this.h = a2 > 0;
        }
        if (b(coordinatorLayout, t, i)) {
            return 0;
        }
        int a3 = super.a();
        super.b(a2);
        d(coordinatorLayout, t, a2);
        coordinatorLayout.a((View) t);
        return a3 - a2;
    }

    private static void b(T t, int i) {
        if (t instanceof fxn) {
            ((fxn) t).c(i);
        }
    }

    private void b(CoordinatorLayout coordinatorLayout, fwq fwq) {
        c();
        f(coordinatorLayout, (View) fwq);
        this.e.setIntValues(new int[]{super.a(), 0});
        this.e.start();
    }

    private boolean b() {
        return super.a() <= (-this.g) - this.a;
    }

    private boolean b(CoordinatorLayout coordinatorLayout, T t, int i) {
        int c = c(coordinatorLayout, t);
        int d2 = d(coordinatorLayout, t);
        int a2 = super.a();
        return a2 < c || a2 > d2 || a2 == vge.a(c, d2, i);
    }

    private void c() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
    }

    /* access modifiers changed from: private */
    public void c(CoordinatorLayout coordinatorLayout, T t, int i) {
        b(coordinatorLayout, t, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private void d(CoordinatorLayout coordinatorLayout, T t, int i) {
        t.setAlpha(1.0f);
        fwq fwq = (fwq) t;
        int min = Math.min(-i, fwq.a());
        a(coordinatorLayout, t, min, ((float) min) / ((float) fwq.a()));
    }

    private void f(CoordinatorLayout coordinatorLayout, T t) {
        this.e = new ValueAnimator();
        this.e.setInterpolator(fvr.a);
        this.e.addUpdateListener(new AnimatorUpdateListener(coordinatorLayout, t) {
            private final /* synthetic */ CoordinatorLayout f$1;
            private final /* synthetic */ View f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HeaderBehavior.this.a(this.f$1, this.f$2, valueAnimator);
            }
        });
    }

    public final /* bridge */ /* synthetic */ int a() {
        return super.a();
    }

    /* access modifiers changed from: protected */
    public final int a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
        return b(coordinatorLayout, t, super.a() - i, i2, i3);
    }

    public final Parcelable a(CoordinatorLayout coordinatorLayout, T t) {
        if (!((GlueHeaderLayout) coordinatorLayout).d) {
            this.h = b();
        }
        return fvs.a(super.a(coordinatorLayout, t), super.a(), (float) ((fwq) t).a(), this.h);
    }

    /* access modifiers changed from: protected */
    public void a(CoordinatorLayout coordinatorLayout, float f2) {
    }

    public final void a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
        if (parcelable instanceof fvs) {
            fvs fvs = (fvs) parcelable;
            super.a(coordinatorLayout, t, fvs.getSuperState());
            this.h = fvs.b;
            this.f = fvs.b ? 1.0f : fvs.a;
            return;
        }
        this.f = -2.14748365E9f;
        super.a(coordinatorLayout, t, parcelable);
    }

    public final void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
        if (i4 < 0) {
            a(coordinatorLayout, t, i4, c(coordinatorLayout, t), d(coordinatorLayout, t));
        }
        boolean z = false;
        boolean z2 = i4 < 0;
        boolean z3 = i4 > 0;
        boolean b = b(coordinatorLayout, t, super.a() - i4);
        if ((z2 && b) || z3) {
            ip.f(view, 1);
        }
        if (((GlueHeaderLayout) coordinatorLayout).d) {
            if (i4 >= 0) {
                z = true;
            }
            this.h = z;
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
        if (i2 >= 0 || !b()) {
            iArr[1] = a(coordinatorLayout, t, i2, c(coordinatorLayout, t), d(coordinatorLayout, t));
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, fwq fwq, boolean z) {
        if (super.a() > (-fwq.a()) - this.a) {
            if (z) {
                a(coordinatorLayout, fwq);
                return;
            }
            c();
            c(coordinatorLayout, (View) fwq, (-fwq.a()) - this.a);
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, T t, int i) {
        boolean a2 = super.a(coordinatorLayout, t, i);
        fwq fwq = (fwq) t;
        this.b.a(-fwq.a(), 0);
        if (this.f != -2.14748365E9f) {
            this.b.a((int) (((float) ((-fwq.a()) - this.a)) * this.f));
        }
        d(coordinatorLayout, t, super.a());
        this.g = fwq.a();
        return a2;
    }

    /* access modifiers changed from: protected */
    public final boolean a(final CoordinatorLayout coordinatorLayout, final T t, int i, int i2, float f2) {
        fvt fvt = this.d;
        int a2 = super.a();
        AnonymousClass1 r9 = new b() {
            public final void a(int i) {
                HeaderBehavior.this.c(coordinatorLayout, t, i);
            }

            public final void b(int i) {
                if (!HeaderBehavior.a(coordinatorLayout)) {
                    fvv.a(coordinatorLayout).a(i);
                }
            }
        };
        fvt.a();
        if (fvt.b == null) {
            fvt.b = new Scroller(t.getContext(), fvr.a);
        }
        fvt.b.fling(0, a2, 0, Math.round(f2), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (fvt.b.computeScrollOffset()) {
            a aVar = new a(t, i, 0, r9);
            fvt.a = aVar;
            ip.a((View) t, fvt.a);
            fvt.c = new WeakReference<>(t);
            return true;
        }
        fvt.a = null;
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
        View a2 = ((GlueHeaderLayout) coordinatorLayout).a();
        if (a2 != null) {
            coordinatorLayout.a(a2, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            b(t, a2.getMeasuredHeight() / 2);
        }
        if (a2 != null) {
            this.a = a2.getMeasuredHeight() / 2;
        } else {
            b(t, 0);
            this.a = 0;
        }
        return false;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, T t, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d.a();
        }
        return super.a(coordinatorLayout, t, motionEvent);
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
        this.f = -2.14748365E9f;
        return (i & 2) != 0;
    }

    public final void b(CoordinatorLayout coordinatorLayout, fwq fwq, boolean z) {
        if (super.a() < 0) {
            if (z) {
                b(coordinatorLayout, fwq);
                return;
            }
            c();
            c(coordinatorLayout, (View) fwq, 0);
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(int i) {
        return super.b(i);
    }

    /* access modifiers changed from: 0000 */
    public boolean b(CoordinatorLayout coordinatorLayout, T t) {
        return !b() && fvv.a(coordinatorLayout).a();
    }

    public final /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.b(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    public final int c(CoordinatorLayout coordinatorLayout, T t) {
        if (((GlueHeaderLayout) coordinatorLayout).d) {
            return 0;
        }
        return (-((fwq) t).a()) - this.a;
    }

    /* access modifiers changed from: protected */
    public int d(CoordinatorLayout coordinatorLayout, T t) {
        if (this.b == null) {
            return super.d(coordinatorLayout, t);
        }
        this.b.a(-((fwq) t).a(), 0);
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int e(CoordinatorLayout coordinatorLayout, T t) {
        return ((GlueHeaderLayout) coordinatorLayout).d ? t.getMeasuredHeight() - coordinatorLayout.getMeasuredHeight() : ((fwq) t).a() + this.a;
    }
}
