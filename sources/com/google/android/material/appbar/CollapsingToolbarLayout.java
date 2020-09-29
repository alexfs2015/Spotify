package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout.b;
import com.moat.analytics.mobile.R;

public class CollapsingToolbarLayout extends FrameLayout {
    final faa a;
    Drawable b;
    int c;
    iw d;
    private boolean e;
    private int f;
    private Toolbar g;
    private View h;
    private View i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Rect n;
    private boolean o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private ValueAnimator t;
    private long u;
    private int v;
    private b w;

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        int a = 0;
        float b = 0.5f;

        public LayoutParams(int i, int i2) {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyt.a.aO);
            this.a = obtainStyledAttributes.getInt(defpackage.eyt.a.aP, 0);
            this.b = obtainStyledAttributes.getFloat(defpackage.eyt.a.aQ, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class a implements b {
        a() {
        }

        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.c = i;
            int b = collapsingToolbarLayout.d != null ? CollapsingToolbarLayout.this.d.b() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                eze a2 = CollapsingToolbarLayout.a(childAt);
                int i3 = layoutParams.a;
                if (i3 == 1) {
                    a2.a(gw.a(-i, 0, CollapsingToolbarLayout.this.b(childAt)));
                } else if (i3 == 2) {
                    a2.a(Math.round(((float) (-i)) * layoutParams.b));
                }
            }
            CollapsingToolbarLayout.this.a();
            if (CollapsingToolbarLayout.this.b != null && b > 0) {
                ip.d(CollapsingToolbarLayout.this);
            }
            CollapsingToolbarLayout.this.a.a(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - ip.m(CollapsingToolbarLayout.this)) - b)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z = true;
        this.e = true;
        this.n = new Rect();
        this.v = -1;
        this.a = new faa(this);
        this.a.a(eyu.e);
        TypedArray a2 = faj.a(context, attributeSet, defpackage.eyt.a.ax, i2, 2132017905, new int[0]);
        this.a.a(a2.getInt(defpackage.eyt.a.aB, 8388691));
        this.a.b(a2.getInt(defpackage.eyt.a.ay, 8388627));
        int dimensionPixelSize = a2.getDimensionPixelSize(defpackage.eyt.a.aC, 0);
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        if (a2.hasValue(defpackage.eyt.a.aF)) {
            this.j = a2.getDimensionPixelSize(defpackage.eyt.a.aF, 0);
        }
        if (a2.hasValue(defpackage.eyt.a.aE)) {
            this.l = a2.getDimensionPixelSize(defpackage.eyt.a.aE, 0);
        }
        if (a2.hasValue(defpackage.eyt.a.aG)) {
            this.k = a2.getDimensionPixelSize(defpackage.eyt.a.aG, 0);
        }
        if (a2.hasValue(defpackage.eyt.a.aD)) {
            this.m = a2.getDimensionPixelSize(defpackage.eyt.a.aD, 0);
        }
        this.o = a2.getBoolean(defpackage.eyt.a.aM, true);
        a(a2.getText(defpackage.eyt.a.aL));
        this.a.d(2132017597);
        this.a.c((int) R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (a2.hasValue(defpackage.eyt.a.aH)) {
            this.a.d(a2.getResourceId(defpackage.eyt.a.aH, 0));
        }
        if (a2.hasValue(defpackage.eyt.a.az)) {
            this.a.c(a2.getResourceId(defpackage.eyt.a.az, 0));
        }
        this.v = a2.getDimensionPixelSize(defpackage.eyt.a.aJ, -1);
        this.u = (long) a2.getInt(defpackage.eyt.a.aI, 600);
        Drawable drawable = a2.getDrawable(defpackage.eyt.a.aA);
        Drawable drawable2 = this.q;
        Drawable drawable3 = null;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.q = drawable != null ? drawable.mutate() : null;
            Drawable drawable4 = this.q;
            if (drawable4 != null) {
                drawable4.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            ip.d(this);
        }
        Drawable drawable5 = a2.getDrawable(defpackage.eyt.a.aK);
        Drawable drawable6 = this.b;
        if (drawable6 != drawable5) {
            if (drawable6 != null) {
                drawable6.setCallback(null);
            }
            if (drawable5 != null) {
                drawable3 = drawable5.mutate();
            }
            this.b = drawable3;
            Drawable drawable7 = this.b;
            if (drawable7 != null) {
                if (drawable7.isStateful()) {
                    this.b.setState(getDrawableState());
                }
                gm.b(this.b, ip.f(this));
                Drawable drawable8 = this.b;
                if (getVisibility() != 0) {
                    z = false;
                }
                drawable8.setVisible(z, false);
                this.b.setCallback(this);
                this.b.setAlpha(this.r);
            }
            ip.d(this);
        }
        this.f = a2.getResourceId(defpackage.eyt.a.aN, -1);
        a2.recycle();
        setWillNotDraw(false);
        ip.a((View) this, (il) new il() {
            public final iw onApplyWindowInsets(View view, iw iwVar) {
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                iw iwVar2 = ip.t(collapsingToolbarLayout) ? iwVar : null;
                if (!hn.a(collapsingToolbarLayout.d, iwVar2)) {
                    collapsingToolbarLayout.d = iwVar2;
                    collapsingToolbarLayout.requestLayout();
                }
                return iwVar.f();
            }
        });
    }

    static eze a(View view) {
        eze eze = (eze) view.getTag(com.spotify.music.R.id.view_offset_helper);
        if (eze != null) {
            return eze;
        }
        eze eze2 = new eze(view);
        view.setTag(com.spotify.music.R.id.view_offset_helper, eze2);
        return eze2;
    }

    private void a(CharSequence charSequence) {
        this.a.a(charSequence);
        g();
    }

    private void a(boolean z) {
        int i2 = 0;
        boolean z2 = ip.B(this) && !isInEditMode();
        if (this.s != z) {
            int i3 = 255;
            if (z2) {
                if (!z) {
                    i3 = 0;
                }
                b();
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator == null) {
                    this.t = new ValueAnimator();
                    this.t.setDuration(this.u);
                    this.t.setInterpolator(i3 > this.r ? eyu.c : eyu.d);
                    this.t.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            CollapsingToolbarLayout.this.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.t.cancel();
                }
                this.t.setIntValues(new int[]{this.r, i3});
                this.t.start();
            } else {
                if (z) {
                    i2 = 255;
                }
                a(i2);
            }
            this.s = z;
        }
    }

    private void b() {
        if (this.e) {
            Toolbar toolbar = null;
            this.g = null;
            this.h = null;
            int i2 = this.f;
            if (i2 != -1) {
                this.g = (Toolbar) findViewById(i2);
                Toolbar toolbar2 = this.g;
                if (toolbar2 != null) {
                    this.h = c(toolbar2);
                }
            }
            if (this.g == null) {
                int childCount = getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i3);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i3++;
                }
                this.g = toolbar;
            }
            c();
            this.e = false;
        }
    }

    private View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private void c() {
        if (!this.o) {
            View view = this.i;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.i);
                }
            }
        }
        if (this.o && this.g != null) {
            if (this.i == null) {
                this.i = new View(getContext());
            }
            if (this.i.getParent() == null) {
                this.g.addView(this.i, -1, -1);
            }
        }
    }

    private static int d(View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private CharSequence d() {
        if (this.o) {
            return this.a.f;
        }
        return null;
    }

    private int e() {
        int i2 = this.v;
        if (i2 >= 0) {
            return i2;
        }
        iw iwVar = this.d;
        int b2 = iwVar != null ? iwVar.b() : 0;
        int m2 = ip.m(this);
        return m2 > 0 ? Math.min((m2 << 1) + b2, getHeight()) : getHeight() / 3;
    }

    private static LayoutParams f() {
        return new LayoutParams(-1, -1);
    }

    private void g() {
        setContentDescription(d());
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.q != null || this.b != null) {
            a(getHeight() + this.c < e());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (i2 != this.r) {
            if (this.q != null) {
                Toolbar toolbar = this.g;
                if (toolbar != null) {
                    ip.d(toolbar);
                }
            }
            this.r = i2;
            ip.d(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int b(View view) {
        return ((getHeight() - a(view).a) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        b();
        if (this.g == null) {
            Drawable drawable = this.q;
            if (drawable != null && this.r > 0) {
                drawable.mutate().setAlpha(this.r);
                this.q.draw(canvas);
            }
        }
        if (this.o && this.p) {
            this.a.a(canvas);
        }
        if (this.b != null && this.r > 0) {
            iw iwVar = this.d;
            int b2 = iwVar != null ? iwVar.b() : 0;
            if (b2 > 0) {
                this.b.setBounds(0, -this.c, getWidth(), b2 - this.c);
                this.b.mutate().setAlpha(this.r);
                this.b.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        if (this.q != null && this.r > 0) {
            View view2 = this.h;
            if (view2 == null || view2 == this ? view == this.g : view == view2) {
                this.q.mutate().setAlpha(this.r);
                this.q.draw(canvas);
                z = true;
                return !super.drawChild(canvas, view, j2) || z;
            }
        }
        z = false;
        if (!super.drawChild(canvas, view, j2)) {
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (this.a.a(drawableState) || z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            ip.b((View) this, ip.t((View) parent));
            if (this.w == null) {
                this.w = new a();
            }
            ((AppBarLayout) parent).a(this.w);
            ip.s(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        b bVar = this.w;
        if (bVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).b(bVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        iw iwVar = this.d;
        if (iwVar != null) {
            int b2 = iwVar.b();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!ip.t(childAt) && childAt.getTop() < b2) {
                    ip.g(childAt, b2);
                }
            }
        }
        if (this.o) {
            View view = this.i;
            if (view != null) {
                boolean z2 = true;
                this.p = ip.E(view) && this.i.getVisibility() == 0;
                if (this.p) {
                    if (ip.f(this) != 1) {
                        z2 = false;
                    }
                    View view2 = this.h;
                    if (view2 == null) {
                        view2 = this.g;
                    }
                    int b3 = b(view2);
                    fab.a((ViewGroup) this, this.i, this.n);
                    this.a.b(this.n.left + (z2 ? this.g.j : this.g.i), this.n.top + b3 + this.g.k, this.n.right + (z2 ? this.g.i : this.g.j), (this.n.bottom + b3) - this.g.l);
                    this.a.a(z2 ? this.l : this.j, this.n.top + this.k, (i4 - i2) - (z2 ? this.j : this.l), (i5 - i3) - this.m);
                    this.a.b();
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            a(getChildAt(i7)).a();
        }
        if (this.g != null) {
            if (this.o && TextUtils.isEmpty(this.a.f)) {
                a(this.g.n);
            }
            View view3 = this.h;
            if (view3 == null || view3 == this) {
                setMinimumHeight(d(this.g));
            } else {
                setMinimumHeight(d(view3));
            }
        }
        a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        b();
        super.onMeasure(i2, i3);
        int mode = MeasureSpec.getMode(i3);
        iw iwVar = this.d;
        int b2 = iwVar != null ? iwVar.b() : 0;
        if (mode == 0 && b2 > 0) {
            super.onMeasure(i2, MeasureSpec.makeMeasureSpec(getMeasuredHeight() + b2, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.b;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.b.setVisible(z, false);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.b;
    }
}
