package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView.ScaleType;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.List;

@androidx.coordinatorlayout.widget.CoordinatorLayout.b(a = Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton implements ezt, io, jp {
    boolean a;
    final Rect b;
    public final ezv c;
    private ColorStateList e;
    private Mode f;
    private ColorStateList g;
    private Mode h;
    private int i;
    private ColorStateList j;
    private int k;
    private int l;
    /* access modifiers changed from: private */
    public int m;
    private int n;
    private final Rect o;
    private final bs p;
    private ezw q;

    public static class BaseBehavior<T extends FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyt.a.bf);
            this.b = obtainStyledAttributes.getBoolean(defpackage.eyt.a.bg, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof d) {
                return ((d) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((d) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            fab.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.e()) {
                floatingActionButton.b(null, false);
            } else {
                floatingActionButton.a((a) null, false);
            }
            return true;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((d) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.b(null, false);
            } else {
                floatingActionButton.a((a) null, false);
            }
            return true;
        }

        public void a(d dVar) {
            if (dVar.h == 0) {
                dVar.h = 80;
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List b2 = coordinatorLayout.b((View) floatingActionButton);
            int size = b2.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) b2.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.b(floatingActionButton, i);
            Rect rect = floatingActionButton.b;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                d dVar = (d) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= dVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= dVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    ip.g((View) floatingActionButton, i2);
                }
                if (i4 != 0) {
                    ip.h(floatingActionButton, i4);
                }
            }
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.b;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (a(view)) {
                b(view, floatingActionButton);
            }
            return false;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final /* bridge */ /* synthetic */ void a(d dVar) {
            super.a(dVar);
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.a(coordinatorLayout, floatingActionButton, i);
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.a(coordinatorLayout, floatingActionButton, rect);
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.b(coordinatorLayout, floatingActionButton, view);
        }
    }

    public static abstract class a {
    }

    class b implements faq {
        b() {
        }

        public final float a() {
            return ((float) FloatingActionButton.this.f()) / 2.0f;
        }

        public final void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.b.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.m, i2 + FloatingActionButton.this.m, i3 + FloatingActionButton.this.m, i4 + FloatingActionButton.this.m);
        }

        public final void a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        public final boolean b() {
            return FloatingActionButton.this.a;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = new Rect();
        this.o = new Rect();
        TypedArray a2 = faj.a(context, attributeSet, defpackage.eyt.a.aR, i2, 2132017906, new int[0]);
        this.e = fam.a(context, a2, defpackage.eyt.a.aS);
        this.f = fak.a(a2.getInt(defpackage.eyt.a.aT, -1), null);
        this.j = fam.a(context, a2, defpackage.eyt.a.bc);
        this.k = a2.getInt(defpackage.eyt.a.aX, -1);
        this.l = a2.getDimensionPixelSize(defpackage.eyt.a.aW, 0);
        this.i = a2.getDimensionPixelSize(defpackage.eyt.a.aU, 0);
        float dimension = a2.getDimension(defpackage.eyt.a.aV, 0.0f);
        float dimension2 = a2.getDimension(defpackage.eyt.a.aZ, 0.0f);
        float dimension3 = a2.getDimension(defpackage.eyt.a.bb, 0.0f);
        this.a = a2.getBoolean(defpackage.eyt.a.be, false);
        this.n = a2.getDimensionPixelSize(defpackage.eyt.a.ba, 0);
        ezb a3 = ezb.a(context, a2, defpackage.eyt.a.bd);
        ezb a4 = ezb.a(context, a2, defpackage.eyt.a.aY);
        a2.recycle();
        this.p = new bs(this);
        this.p.a(attributeSet, i2);
        this.c = new ezv(this);
        g().a(this.e, this.f, this.j, this.i);
        ezw g2 = g();
        if (g2.n != dimension) {
            g2.n = dimension;
            g2.a(g2.n, g2.o, g2.p);
        }
        ezw g3 = g();
        if (g3.o != dimension2) {
            g3.o = dimension2;
            g3.a(g3.n, g3.o, g3.p);
        }
        ezw g4 = g();
        if (g4.p != dimension3) {
            g4.p = dimension3;
            g4.a(g4.n, g4.o, g4.p);
        }
        ezw g5 = g();
        int i3 = this.n;
        if (g5.q != i3) {
            g5.q = i3;
            g5.a();
        }
        g().d = a3;
        g().e = a4;
        setScaleType(ScaleType.MATRIX);
    }

    private int a(int i2) {
        while (true) {
            int i3 = this.l;
            if (i3 != 0) {
                return i3;
            }
            Resources resources = getResources();
            if (i2 != -1) {
                return i2 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
            }
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                return a(1);
            }
            i2 = 0;
        }
    }

    private static int a(int i2, int i3) {
        int mode = MeasureSpec.getMode(i3);
        int size = MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private d a(final a aVar) {
        if (aVar == null) {
            return null;
        }
        return new d() {
        };
    }

    private void h() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.g;
            if (colorStateList == null) {
                gm.e(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.h;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(bq.a(colorForState, mode));
        }
    }

    private ezw i() {
        return VERSION.SDK_INT >= 21 ? new ezx(this, new b()) : new ezw(this, new b());
    }

    public final ColorStateList U_() {
        return this.g;
    }

    public final void a(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public final void a(Mode mode) {
        setBackgroundTintMode(mode);
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar, boolean z) {
        ezb ezb;
        ezw g2 = g();
        d a2 = a(aVar);
        if (!g2.h()) {
            if (g2.c != null) {
                g2.c.cancel();
            }
            if (g2.i()) {
                if (g2.z.getVisibility() != 0) {
                    g2.z.setAlpha(0.0f);
                    g2.z.setScaleY(0.0f);
                    g2.z.setScaleX(0.0f);
                    g2.a(0.0f);
                }
                if (g2.d != null) {
                    ezb = g2.d;
                } else {
                    if (g2.f == null) {
                        g2.f = ezb.a(g2.z.getContext(), (int) R.animator.design_fab_show_motion_spec);
                    }
                    ezb = g2.f;
                }
                AnimatorSet a3 = g2.a(ezb, 1.0f, 1.0f, 1.0f);
                a3.addListener(new AnimatorListenerAdapter(false, a2) {
                    private /* synthetic */ boolean a;
                    private /* synthetic */ d b;

                    {
                        this.a = r2;
                        this.b = r3;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        ezw ezw = ezw.this;
                        ezw.b = 0;
                        ezw.c = null;
                    }

                    public final void onAnimationStart(Animator animator) {
                        ezw.this.z.a(0, this.a);
                        ezw ezw = ezw.this;
                        ezw.b = 2;
                        ezw.c = animator;
                    }
                });
                if (g2.r != null) {
                    Iterator it = g2.r.iterator();
                    while (it.hasNext()) {
                        a3.addListener((AnimatorListener) it.next());
                    }
                }
                a3.start();
                return;
            }
            g2.z.a(0, false);
            g2.z.setAlpha(1.0f);
            g2.z.setScaleY(1.0f);
            g2.z.setScaleX(1.0f);
            g2.a(1.0f);
        }
    }

    @Deprecated
    public final boolean a(Rect rect) {
        if (!ip.B(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        b(rect);
        return true;
    }

    public final Mode b() {
        return getBackgroundTintMode();
    }

    public final void b(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            h();
        }
    }

    public final void b(Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            h();
        }
    }

    public void b(Rect rect) {
        rect.left += this.b.left;
        rect.top += this.b.top;
        rect.right -= this.b.right;
        rect.bottom -= this.b.bottom;
    }

    /* access modifiers changed from: 0000 */
    public final void b(a aVar, boolean z) {
        ezb ezb;
        ezw g2 = g();
        d a2 = a(aVar);
        boolean z2 = true;
        if (g2.z.getVisibility() != 0 ? g2.b == 2 : g2.b != 1) {
            z2 = false;
        }
        if (!z2) {
            if (g2.c != null) {
                g2.c.cancel();
            }
            if (g2.i()) {
                if (g2.e != null) {
                    ezb = g2.e;
                } else {
                    if (g2.g == null) {
                        g2.g = ezb.a(g2.z.getContext(), (int) R.animator.design_fab_hide_motion_spec);
                    }
                    ezb = g2.g;
                }
                AnimatorSet a3 = g2.a(ezb, 0.0f, 0.0f, 0.0f);
                a3.addListener(new AnimatorListenerAdapter(false, a2) {
                    private boolean a;
                    private /* synthetic */ boolean b;
                    private /* synthetic */ d c;

                    {
                        this.b = r2;
                        this.c = r3;
                    }

                    public final void onAnimationCancel(Animator animator) {
                        this.a = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        ezw ezw = ezw.this;
                        ezw.b = 0;
                        ezw.c = null;
                        if (!this.a) {
                            ezw.z.a(this.b ? 8 : 4, this.b);
                        }
                    }

                    public final void onAnimationStart(Animator animator) {
                        ezw.this.z.a(0, this.b);
                        ezw ezw = ezw.this;
                        ezw.b = 1;
                        ezw.c = animator;
                        this.a = false;
                    }
                });
                if (g2.s != null) {
                    Iterator it = g2.s.iterator();
                    while (it.hasNext()) {
                        a3.addListener((AnimatorListener) it.next());
                    }
                }
                a3.start();
                return;
            }
            g2.z.a(4, false);
        }
    }

    public final ColorStateList b_() {
        return getBackgroundTintList();
    }

    public final Mode d() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        g().a(getDrawableState());
    }

    public final boolean e() {
        return this.c.b;
    }

    /* access modifiers changed from: 0000 */
    public final int f() {
        return a(this.k);
    }

    public ezw g() {
        if (this.q == null) {
            this.q = i();
        }
        return this.q;
    }

    public ColorStateList getBackgroundTintList() {
        return this.e;
    }

    public Mode getBackgroundTintMode() {
        return this.f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        g().b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ezw g2 = g();
        if (g2.d()) {
            if (g2.B == null) {
                g2.B = new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        ezw ezw = ezw.this;
                        float rotation = ezw.z.getRotation();
                        if (ezw.i != rotation) {
                            ezw.i = rotation;
                            if (VERSION.SDK_INT == 19) {
                                if (ezw.i % 90.0f != 0.0f) {
                                    if (ezw.z.getLayerType() != 1) {
                                        ezw.z.setLayerType(1, null);
                                    }
                                } else if (ezw.z.getLayerType() != 0) {
                                    ezw.z.setLayerType(0, null);
                                }
                            }
                            if (ezw.h != null) {
                                fap fap = ezw.h;
                                float f = -ezw.i;
                                if (fap.d != f) {
                                    fap.d = f;
                                    fap.invalidateSelf();
                                }
                            }
                            if (ezw.l != null) {
                                ezy ezy = ezw.l;
                                float f2 = -ezw.i;
                                if (f2 != ezy.b) {
                                    ezy.b = f2;
                                    ezy.invalidateSelf();
                                }
                            }
                        }
                        return true;
                    }
                };
            }
            g2.z.getViewTreeObserver().addOnPreDrawListener(g2.B);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ezw g2 = g();
        if (g2.B != null) {
            g2.z.getViewTreeObserver().removeOnPreDrawListener(g2.B);
            g2.B = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int f2 = f();
        this.m = (f2 - this.n) / 2;
        g().c();
        int min = Math.min(a(f2, i2), a(f2, i3));
        setMeasuredDimension(this.b.left + min + this.b.right, min + this.b.top + this.b.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fay)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fay fay = (fay) parcelable;
        super.onRestoreInstanceState(fay.d);
        ezv ezv = this.c;
        Bundle bundle = (Bundle) fay.a.get("expandableWidgetHelper");
        ezv.b = bundle.getBoolean("expanded", false);
        ezv.c = bundle.getInt("expandedComponentIdHint", 0);
        if (ezv.b) {
            ViewParent parent = ezv.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).a(ezv.a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        fay fay = new fay(super.onSaveInstanceState());
        dv<String, Bundle> dvVar = fay.a;
        ezv ezv = this.c;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", ezv.b);
        bundle.putInt("expandedComponentIdHint", ezv.c);
        dvVar.put("expandableWidgetHelper", bundle);
        return fay;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !a(this.o) || this.o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i2) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i2) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            ezw g2 = g();
            if (g2.j != null) {
                gm.a(g2.j, colorStateList);
            }
            if (g2.l != null) {
                g2.l.a(colorStateList);
            }
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            ezw g2 = g();
            if (g2.j != null) {
                gm.a(g2.j, mode);
            }
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        g().a();
    }

    public void setImageResource(int i2) {
        this.p.a(i2);
    }
}
