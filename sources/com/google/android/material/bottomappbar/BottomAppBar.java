package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.spotify.music.R;
import java.util.ArrayList;

public class BottomAppBar extends Toolbar implements androidx.coordinatorlayout.widget.CoordinatorLayout.a {
    /* access modifiers changed from: private */
    public Animator A;
    /* access modifiers changed from: private */
    public int B;
    /* access modifiers changed from: private */
    public boolean C;
    private AnimatorListenerAdapter D;
    /* access modifiers changed from: 0000 */
    public final fac v;
    final eyp w;
    boolean x;
    private final int y;
    /* access modifiers changed from: private */
    public Animator z;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect a = new Rect();

        public final /* synthetic */ void a(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.a(bottomAppBar);
            FloatingActionButton d = bottomAppBar.m();
            if (d != null) {
                d.clearAnimation();
                d.animate().translationY(bottomAppBar.o()).setInterpolator(eyd.d).setDuration(225);
            }
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.x && super.a(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public final /* synthetic */ void b(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.b(bottomAppBar);
            FloatingActionButton d = bottomAppBar.m();
            if (d != null) {
                d.a(this.a);
                float measuredHeight = (float) (d.getMeasuredHeight() - this.a.height());
                d.clearAnimation();
                d.animate().translationY(((float) (-d.getPaddingBottom())) + measuredHeight).setInterpolator(eyd.c).setDuration(175);
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: private */
        public boolean a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton d = bottomAppBar.m();
            if (d != null) {
                ((d) d.getLayoutParams()).d = 17;
                BottomAppBar.a(bottomAppBar, d);
                Rect rect = this.a;
                rect.set(0, 0, d.getMeasuredWidth(), d.getMeasuredHeight());
                d.b(rect);
                float height = (float) this.a.height();
                if (height != bottomAppBar.w.a) {
                    bottomAppBar.w.a = height;
                    bottomAppBar.v.invalidateSelf();
                }
            }
            if (!BottomAppBar.e(bottomAppBar)) {
                bottomAppBar.r();
            }
            coordinatorLayout.b(bottomAppBar, i);
            return super.a(coordinatorLayout, bottomAppBar, i);
        }
    }

    static class a extends jt {
        public static final Creator<a> CREATOR = new ClassLoaderCreator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        };
        int a;
        boolean b;

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    public final void a(CharSequence charSequence) {
    }

    public final void b(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = true;
        this.D = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                BottomAppBar.a(bottomAppBar, bottomAppBar.C);
                BottomAppBar bottomAppBar2 = BottomAppBar.this;
                BottomAppBar.a(bottomAppBar2, bottomAppBar2.B, BottomAppBar.this.C);
            }
        };
        TypedArray a2 = ezs.a(context, attributeSet, defpackage.eyc.a.k, i, 2132017981, new int[0]);
        ColorStateList a3 = ezv.a(context, a2, defpackage.eyc.a.l);
        float dimensionPixelOffset = (float) a2.getDimensionPixelOffset(defpackage.eyc.a.n, 0);
        float dimensionPixelOffset2 = (float) a2.getDimensionPixelOffset(defpackage.eyc.a.o, 0);
        float dimensionPixelOffset3 = (float) a2.getDimensionPixelOffset(defpackage.eyc.a.p, 0);
        this.B = a2.getInt(defpackage.eyc.a.m, 0);
        this.x = a2.getBoolean(defpackage.eyc.a.q, false);
        a2.recycle();
        this.y = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        this.w = new eyp(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        fae fae = new fae();
        fae.e = this.w;
        this.v = new fac(fae);
        fac fac = this.v;
        fac.a = true;
        fac.invalidateSelf();
        fac fac2 = this.v;
        fac2.c = Style.FILL;
        fac2.invalidateSelf();
        gm.a((Drawable) this.v, a3);
        ip.a((View) this, (Drawable) this.v);
    }

    private float l() {
        return this.w.b;
    }

    /* access modifiers changed from: private */
    public FloatingActionButton m() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).c((View) this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    private boolean n() {
        FloatingActionButton m = m();
        return m != null && m.g().h();
    }

    private float a(boolean z2) {
        FloatingActionButton m = m();
        if (m == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        m.a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) m.getMeasuredHeight();
        }
        float height2 = (float) (m.getHeight() - rect.bottom);
        float f = (-l()) + (height / 2.0f) + height2;
        float height3 = ((float) (m.getHeight() - rect.height())) - ((float) m.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z2) {
            height3 = f;
        }
        return f2 + height3;
    }

    /* access modifiers changed from: private */
    public float o() {
        return a(this.C);
    }

    private int c(int i) {
        int i2 = 1;
        boolean z2 = ip.f(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.y;
        if (z2) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    private float p() {
        return (float) c(this.B);
    }

    private ActionMenuView q() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void a(ActionMenuView actionMenuView, int i, boolean z2) {
        boolean z3 = ip.f(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof LayoutParams) && (((LayoutParams) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                i2 = Math.max(i2, z3 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z2) ? 0.0f : (float) (i2 - (z3 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        Animator animator = this.z;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.A;
        if (animator2 != null) {
            animator2.cancel();
        }
        r();
    }

    /* access modifiers changed from: private */
    public void r() {
        this.w.c = p();
        FloatingActionButton m = m();
        this.v.a((!this.C || !n()) ? 0.0f : 1.0f);
        if (m != null) {
            m.setTranslationY(o());
            m.setTranslationX(p());
        }
        ActionMenuView q = q();
        if (q != null) {
            q.setAlpha(1.0f);
            if (!n()) {
                a(q, 0, false);
                return;
            }
            a(q, this.B, this.C);
        }
    }

    public final androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<BottomAppBar> a() {
        return new Behavior();
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.a = this.B;
        aVar.b = this.C;
        return aVar;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.d);
        this.B = aVar.a;
        this.C = aVar.b;
    }

    static /* synthetic */ void a(BottomAppBar bottomAppBar, boolean z2) {
        if (ip.B(bottomAppBar)) {
            Animator animator = bottomAppBar.z;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            boolean z3 = z2 && bottomAppBar.n();
            if (z3) {
                bottomAppBar.w.c = bottomAppBar.p();
            }
            float[] fArr = new float[2];
            fArr[0] = bottomAppBar.v.b;
            fArr[1] = z3 ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomAppBar.this.v.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat.setDuration(300);
            arrayList.add(ofFloat);
            FloatingActionButton m = bottomAppBar.m();
            if (m != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m, "translationY", new float[]{bottomAppBar.a(z2)});
                ofFloat2.setDuration(300);
                arrayList.add(ofFloat2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            bottomAppBar.z = animatorSet;
            bottomAppBar.z.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.z = null;
                }
            });
            bottomAppBar.z.start();
        }
    }

    static /* synthetic */ void a(BottomAppBar bottomAppBar, final int i, final boolean z2) {
        if (ip.B(bottomAppBar)) {
            Animator animator = bottomAppBar.A;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!bottomAppBar.n()) {
                i = 0;
                z2 = false;
            }
            final ActionMenuView q = bottomAppBar.q();
            if (q != null) {
                String str = "alpha";
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q, str, new float[]{1.0f});
                if ((bottomAppBar.C || (z2 && bottomAppBar.n())) && (bottomAppBar.B == 1 || i == 1)) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(q, str, new float[]{0.0f});
                    ofFloat2.addListener(new AnimatorListenerAdapter() {
                        private boolean a;

                        public final void onAnimationCancel(Animator animator) {
                            this.a = true;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!this.a) {
                                BottomAppBar.this.a(q, i, z2);
                            }
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150);
                    animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                    arrayList.add(animatorSet);
                } else if (q.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            bottomAppBar.A = animatorSet2;
            bottomAppBar.A.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.A = null;
                }
            });
            bottomAppBar.A.start();
        }
    }

    static /* synthetic */ void a(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.D;
        ezf g = floatingActionButton.g();
        if (g.s != null) {
            g.s.remove(animatorListenerAdapter);
        }
        AnimatorListenerAdapter animatorListenerAdapter2 = bottomAppBar.D;
        ezf g2 = floatingActionButton.g();
        if (g2.r != null) {
            g2.r.remove(animatorListenerAdapter2);
        }
        AnimatorListenerAdapter animatorListenerAdapter3 = bottomAppBar.D;
        ezf g3 = floatingActionButton.g();
        if (g3.s == null) {
            g3.s = new ArrayList<>();
        }
        g3.s.add(animatorListenerAdapter3);
        AnimatorListenerAdapter animatorListenerAdapter4 = bottomAppBar.D;
        ezf g4 = floatingActionButton.g();
        if (g4.r == null) {
            g4.r = new ArrayList<>();
        }
        g4.r.add(animatorListenerAdapter4);
    }

    static /* synthetic */ boolean e(BottomAppBar bottomAppBar) {
        Animator animator = bottomAppBar.z;
        if (animator == null || !animator.isRunning()) {
            Animator animator2 = bottomAppBar.A;
            if (animator2 == null || !animator2.isRunning()) {
                return false;
            }
        }
        return true;
    }
}
