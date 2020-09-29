package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import com.spotify.music.R;

public class ActionBarOverlayLayout extends ViewGroup implements by, ih, ii, ij {
    private static int[] A = {R.attr.actionBarSize, 16842841};
    private final ik B;
    ActionBarContainer a;
    public boolean b;
    public boolean c;
    boolean d;
    ViewPropertyAnimator e;
    final AnimatorListenerAdapter f;
    private int g;
    private int h;
    private ContentFrameLayout i;
    private bz j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private a w;
    private OverScroller x;
    private final Runnable y;
    private final Runnable z;

    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -1);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface a {
        void a(int i);

        void g(boolean z);

        void h();

        void i();

        void j();
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.f = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.e = null;
                actionBarOverlayLayout.d = false;
            }

            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.e = null;
                actionBarOverlayLayout.d = false;
            }
        };
        this.y = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.a();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.e = actionBarOverlayLayout.a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f);
            }
        };
        this.z = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.a();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.e = actionBarOverlayLayout.a.animate().translationY((float) (-ActionBarOverlayLayout.this.a.getHeight())).setListener(ActionBarOverlayLayout.this.f);
            }
        };
        a(context);
        this.B = new ik();
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A);
        boolean z2 = false;
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.k = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.k == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.l = z2;
        this.x = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public final void a(a aVar) {
        this.w = aVar;
        if (getWindowToken() != null) {
            this.w.a(this.h);
            int i2 = this.o;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                ip.s(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        ip.s(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        i();
        int i3 = this.o ^ i2;
        this.o = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        a aVar = this.w;
        if (aVar != null) {
            aVar.g(!z2);
            if (z3 || !z2) {
                this.w.h();
            } else {
                this.w.i();
            }
        }
        if ((i3 & 256) != 0 && this.w != null) {
            ip.s(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.h = i2;
        a aVar = this.w;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    private static boolean a(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.leftMargin != rect.left) {
            layoutParams.leftMargin = rect.left;
            z6 = true;
        } else {
            z6 = false;
        }
        if (layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z6 = true;
        }
        if (layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z6 = true;
        }
        if (!z4 || layoutParams.bottomMargin == rect.bottom) {
            return z6;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        i();
        ip.r(this);
        boolean a2 = a((View) this.a, rect, true, true, false, true);
        this.s.set(rect);
        cv.a(this, this.s, this.p);
        if (!this.t.equals(this.s)) {
            this.t.set(this.s);
            a2 = true;
        }
        if (!this.q.equals(this.p)) {
            this.q.set(this.p);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        i();
        measureChildWithMargins(this.a, i2, 0, i3, 0);
        LayoutParams layoutParams = (LayoutParams) this.a.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.a.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.a.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.a.getMeasuredState());
        boolean z2 = (ip.r(this) & 256) != 0;
        if (z2) {
            i4 = this.g;
            if (this.c && this.a.a != null) {
                i4 += this.g;
            }
        } else if (this.a.getVisibility() != 8) {
            i4 = this.a.getMeasuredHeight();
        }
        this.r.set(this.p);
        this.u.set(this.s);
        if (this.b || z2) {
            this.u.top += i4;
            Rect rect = this.u;
            rect.bottom = rect.bottom;
        } else {
            this.r.top += i4;
            Rect rect2 = this.r;
            rect2.bottom = rect2.bottom;
        }
        a((View) this.i, this.r, true, true, true, true);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            this.i.a(this.u);
        }
        measureChildWithMargins(this.i, i2, 0, i3, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.i.getLayoutParams();
        int max3 = Math.max(max, this.i.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.i.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i7 = layoutParams.leftMargin + paddingLeft;
                int i8 = layoutParams.topMargin + paddingTop;
                childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i8);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.k != null && !this.l) {
            int bottom = this.a.getVisibility() == 0 ? (int) (((float) this.a.getBottom()) + this.a.getTranslationY() + 0.5f) : 0;
            this.k.setBounds(0, bottom, getWidth(), this.k.getIntrinsicHeight() + bottom);
            this.k.draw(canvas);
        }
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(view, i2, i3, i4, i5, i6);
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public final void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public final void a(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.a.getVisibility() != 0) {
            return false;
        }
        return this.m;
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        int i3 = 0;
        this.B.a(i2, 0);
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer != null) {
            i3 = -((int) actionBarContainer.getTranslationY());
        }
        this.n = i3;
        a();
        a aVar = this.w;
        if (aVar != null) {
            aVar.j();
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        this.n += i3;
        b(this.n);
    }

    public void onStopNestedScroll(View view) {
        if (this.m && !this.d) {
            if (this.n <= this.a.getHeight()) {
                a();
                postDelayed(this.y, 600);
                return;
            }
            a();
            postDelayed(this.z, 600);
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.m || !z2) {
            return false;
        }
        this.x.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.x.getFinalY() > this.a.getHeight()) {
            z3 = true;
        }
        if (z3) {
            a();
            this.z.run();
        } else {
            a();
            this.y.run();
        }
        this.d = true;
        return true;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    private void i() {
        if (this.i == null) {
            this.i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.a = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.j = a(findViewById(R.id.action_bar));
        }
    }

    private static bz a(View view) {
        if (view instanceof bz) {
            return (bz) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).i();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public final void a(boolean z2) {
        if (z2 != this.m) {
            this.m = z2;
            if (!z2) {
                a();
                b(0);
            }
        }
    }

    private void b(int i2) {
        a();
        this.a.setTranslationY((float) (-Math.max(0, Math.min(i2, this.a.getHeight()))));
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void a(Callback callback) {
        i();
        this.j.a(callback);
    }

    public final void a(CharSequence charSequence) {
        i();
        this.j.a(charSequence);
    }

    public final void a(int i2) {
        i();
        if (i2 != 2 && i2 != 5 && i2 == 109) {
            boolean z2 = true;
            this.b = true;
            if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                z2 = false;
            }
            this.l = z2;
        }
    }

    public final boolean b() {
        i();
        return this.j.e();
    }

    public final boolean c() {
        i();
        return this.j.f();
    }

    public final boolean d() {
        i();
        return this.j.g();
    }

    public final boolean e() {
        i();
        return this.j.h();
    }

    public final boolean f() {
        i();
        return this.j.i();
    }

    public final void g() {
        i();
        this.j.j();
    }

    public final void a(Menu menu, defpackage.bd.a aVar) {
        i();
        this.j.a(menu, aVar);
    }

    public final void h() {
        i();
        this.j.k();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
