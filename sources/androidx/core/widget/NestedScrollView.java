package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements C0095if, ij {
    private static final a x = new a();
    private static final int[] y = {16843130};
    private final ig A;
    private float B;
    public b a;
    private long b;
    private final Rect c;
    private OverScroller d;
    private EdgeEffect e;
    private EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private c w;
    private final ik z;

    static class a extends ht {
        a() {
        }

        public final void a(View view, ja jaVar) {
            super.a(view, jaVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            jaVar.b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int a = nestedScrollView.a();
                if (a > 0) {
                    jaVar.j(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        jaVar.a(8192);
                    }
                    if (nestedScrollView.getScrollY() < a) {
                        jaVar.a(4096);
                    }
                }
            }
        }

        public final boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.a());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(0, max);
                return true;
            }
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.a() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            int scrollX = nestedScrollView.getScrollX();
            if (VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollX(scrollX);
            }
            int a = nestedScrollView.a();
            if (VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollY(a);
            }
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView);
    }

    static class c extends BaseSavedState {
        public static final Creator<c> CREATOR = new Creator<c>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }
        };
        public int a;

        c(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.a);
            sb.append("}");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i2, 0);
        a(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.z = new ik();
        this.A = new ig(this);
        setNestedScrollingEnabled(true);
        ip.a((View) this, (ht) x);
    }

    private int a(Rect rect) {
        int i2 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            i2 = Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i4) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top < scrollY && rect.bottom < i4) {
            i2 = Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return i2;
    }

    private View a(boolean z2, int i2, int i3) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.A.a(0, i3, 0, i5, iArr, i6, iArr2);
    }

    private void a(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A.a(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(i2);
            this.r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean a(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View a2 = a(z3, i3, i4);
        if (a2 == null) {
            a2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            g(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        }
        if (a2 != findFocus()) {
            a2.requestFocus(i2);
        }
        return z2;
    }

    private boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i10 = i5 + i3;
        int i11 = i7 + 0;
        if (i4 <= 0 && i4 >= 0) {
            z2 = false;
        } else {
            i4 = 0;
            z2 = true;
        }
        if (i10 > i11) {
            i10 = i11;
            z3 = true;
        } else if (i10 < 0) {
            z3 = true;
            i10 = 0;
        } else {
            z3 = false;
        }
        if (z3 && !c(1)) {
            this.d.springBack(i4, i10, 0, 0, 0, a());
        }
        onOverScrolled(i4, i10, z2, z3);
        return z2 || z3;
    }

    private boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.A.a(i2, i3, iArr, iArr2, i4);
    }

    private boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private boolean a(View view, int i2, int i3) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i2 >= getScrollY() && this.c.top - i2 <= getScrollY() + i3;
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    private int b() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    private static int b(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private void b(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int a2 = a(this.c);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    private void b(boolean z2) {
        if (z2) {
            b(2, 1);
        } else {
            a(1);
        }
        this.v = getScrollY();
        ip.d(this);
    }

    private boolean b(int i2, int i3) {
        return this.A.a(i2, i3);
    }

    private void c(int i2, int i3) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY);
                b(false);
            } else {
                if (!this.d.isFinished()) {
                    f();
                }
                scrollBy(i2, i3);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean c() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private boolean c(int i2) {
        return this.A.a(i2);
    }

    private void d() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    private boolean d(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.c.top + height > bottom) {
                    this.c.top = bottom - height;
                }
            }
        } else {
            this.c.top = getScrollY() - height;
            if (this.c.top < 0) {
                this.c.top = 0;
            }
        }
        Rect rect = this.c;
        rect.bottom = rect.top + height;
        return a(i2, this.c.top, this.c.bottom);
    }

    private void e() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    private boolean e(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z2) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.c.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.c;
                rect2.top = rect2.bottom - height;
            }
        }
        return a(i2, this.c.top, this.c.bottom);
    }

    private void f() {
        this.d.abortAnimation();
        a(1);
    }

    private boolean f(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int b2 = b();
        if (findNextFocus == null || !a(findNextFocus, b2, getHeight())) {
            if (i2 == 33 && getScrollY() < b2) {
                b2 = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                b2 = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), b2);
            }
            if (b2 == 0) {
                return false;
            }
            if (i2 != 130) {
                b2 = -b2;
            }
            g(b2);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            g(a(this.c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private void g() {
        this.k = false;
        e();
        a(0);
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f.onRelease();
        }
    }

    private void g(int i2) {
        if (i2 != 0) {
            if (this.n) {
                c(0, i2);
                return;
            }
            scrollBy(0, i2);
        }
    }

    private void h() {
        if (getOverScrollMode() == 2) {
            this.e = null;
            this.f = null;
        } else if (this.e == null) {
            Context context = getContext();
            this.e = new EdgeEffect(context);
            this.f = new EdgeEffect(context);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public final void a(int i2) {
        this.A.b(i2);
    }

    public final void a(int i2, int i3) {
        c(0 - getScrollX(), i3 - getScrollY());
    }

    public final void a(View view, int i2) {
        this.z.a(i2);
        a(i2);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(i5, i6, (int[]) null);
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(i5, i6, iArr);
    }

    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        a(i2, i3, iArr, (int[]) null, i4);
    }

    public final void a(boolean z2) {
        if (z2 != this.m) {
            this.m = z2;
            requestLayout();
        }
    }

    public final boolean a(KeyEvent keyEvent) {
        this.c.setEmpty();
        boolean z2 = false;
        int i2 = 130;
        if (!c()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130))) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z2 = !keyEvent.isAltPressed() ? f(33) : e(33);
            } else if (keyCode == 20) {
                z2 = !keyEvent.isAltPressed() ? f(130) : e(130);
            } else if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i2 = 33;
                }
                d(i2);
            }
        }
        return z2;
    }

    public final boolean a(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(int i2) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            b(true);
        }
    }

    public final void b(View view, View view2, int i2, int i3) {
        this.z.a(i2, i3);
        b(2, i3);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.d.isFinished()) {
            this.d.computeScrollOffset();
            int currY = this.d.getCurrY();
            int i2 = currY - this.v;
            this.v = currY;
            int[] iArr = this.t;
            boolean z2 = false;
            iArr[1] = 0;
            a(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.t[1];
            int a2 = a();
            if (i3 != 0) {
                int scrollY = getScrollY();
                a(0, i3, getScrollX(), scrollY, 0, a2, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.t;
                iArr2[1] = 0;
                a(0, scrollY2, 0, i4, this.s, 1, iArr2);
                i3 = i4 - this.t[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && a2 > 0)) {
                    z2 = true;
                }
                if (z2) {
                    h();
                    if (i3 < 0) {
                        if (this.e.isFinished()) {
                            this.e.onAbsorb((int) this.d.getCurrVelocity());
                        }
                    } else if (this.f.isFinished()) {
                        this.f.onAbsorb((int) this.d.getCurrVelocity());
                    }
                }
                f();
            }
            if (!this.d.isFinished()) {
                ip.d(this);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.A.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.A.a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.A.a(i2, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.e != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.e.setSize(width, height);
                if (this.e.draw(canvas)) {
                    ip.d(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(a(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i3 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f.setSize(width2, height2);
                if (this.f.draw(canvas)) {
                    ip.d(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getNestedScrollAxes() {
        return this.z.a();
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return c(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A.a;
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                if (this.B == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int i2 = (int) (axisValue * this.B);
                int a2 = a();
                int scrollY = getScrollY();
                int i3 = scrollY - i2;
                if (i3 < 0) {
                    i3 = 0;
                } else if (i3 > a2) {
                    i3 = a2;
                }
                if (i3 != scrollY) {
                    super.scrollTo(getScrollX(), i3);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r11.k
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x009e
            r4 = -1
            if (r0 == r2) goto L_0x0079
            if (r0 == r1) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0079
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0107
        L_0x001f:
            r11.a(r12)
            goto L_0x0107
        L_0x0024:
            int r0 = r11.r
            if (r0 == r4) goto L_0x0107
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x0048
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r12.<init>(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0107
        L_0x0048:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.o
            if (r4 <= r5) goto L_0x0107
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x0107
            r11.k = r2
            r11.g = r0
            r11.d()
            android.view.VelocityTracker r0 = r11.l
            r0.addMovement(r12)
            r11.u = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0107
            r12.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0107
        L_0x0079:
            r11.k = r3
            r11.r = r4
            r11.e()
            android.widget.OverScroller r4 = r11.d
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.a()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x009a
            defpackage.ip.d(r11)
        L_0x009a:
            r11.a(r3)
            goto L_0x0107
        L_0x009e:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00d2
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00d2
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00d2
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00d2
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00d2
            r4 = 1
            goto L_0x00d3
        L_0x00d2:
            r4 = 0
        L_0x00d3:
            if (r4 != 0) goto L_0x00db
            r11.k = r3
            r11.e()
            goto L_0x0107
        L_0x00db:
            r11.g = r0
            int r0 = r12.getPointerId(r3)
            r11.r = r0
            android.view.VelocityTracker r0 = r11.l
            if (r0 != 0) goto L_0x00ee
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.l = r0
            goto L_0x00f1
        L_0x00ee:
            r0.clear()
        L_0x00f1:
            android.view.VelocityTracker r0 = r11.l
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.d
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.d
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.k = r12
            r11.b(r1, r3)
        L_0x0107:
            boolean r12 = r11.k
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.h = false;
        View view = this.j;
        if (view != null && a(view, (View) this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.a);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b2 = b(scrollY, paddingTop, i6);
            if (b2 != scrollY) {
                scrollTo(getScrollX(), b2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.m && MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        b((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && !a(findNextFocus)) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.w = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.a = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            g(a(this.c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        a(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        d();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(yVelocity) > this.p) {
                    int i2 = -yVelocity;
                    float f2 = (float) i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        b(i2);
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    ip.d(this);
                }
                this.r = -1;
                g();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.r);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder("Invalid pointerId=");
                    sb.append(this.r);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.g - y2;
                    if (a(0, i3, this.t, this.s, 0)) {
                        i3 -= this.t[1];
                        this.u += this.s[1];
                    }
                    if (!this.k && Math.abs(i3) > this.o) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        i3 = i3 > 0 ? i3 - this.o : i3 + this.o;
                    }
                    int i4 = i3;
                    if (this.k) {
                        this.g = y2 - this.s[1];
                        int scrollY = getScrollY();
                        int a2 = a();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && a2 > 0);
                        int i5 = a2;
                        if (a(0, i4, 0, getScrollY(), 0, a2, 0, 0) && !c(0)) {
                            this.l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int i6 = i4 - scrollY2;
                        int[] iArr = this.t;
                        iArr[1] = 0;
                        a(0, scrollY2, 0, i6, this.s, 0, iArr);
                        int i7 = this.g;
                        int[] iArr2 = this.s;
                        this.g = i7 - iArr2[1];
                        this.u += iArr2[1];
                        if (z2) {
                            int i8 = i4 - this.t[1];
                            h();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                ji.a(this.e, ((float) i8) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f.isFinished()) {
                                    this.f.onRelease();
                                }
                            } else if (i9 > i5) {
                                ji.a(this.f, ((float) i8) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.e.isFinished()) {
                                    this.e.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.e;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f.isFinished())) {
                                ip.d(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.k && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    ip.d(this);
                }
                this.r = -1;
                g();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.g = (int) motionEvent2.getY(actionIndex);
                this.r = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                a(motionEvent);
                this.g = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.d.isFinished();
            this.k = z3;
            if (z3) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (!this.d.isFinished()) {
                f();
            }
            this.g = (int) motionEvent.getY();
            this.r = motionEvent2.getPointerId(0);
            b(2, 0);
        }
        VelocityTracker velocityTracker2 = this.l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.h) {
            b(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a2 = a(rect);
        boolean z3 = a2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, a2);
            } else {
                c(0, a2);
            }
        }
        return z3;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            e();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int b2 = b(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int b3 = b(i3, height, height2);
            if (b2 != getScrollX() || b3 != getScrollY()) {
                super.scrollTo(b2, b3);
            }
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.A.a(z2);
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return b(i2, 0);
    }

    public void stopNestedScroll() {
        a(0);
    }
}
