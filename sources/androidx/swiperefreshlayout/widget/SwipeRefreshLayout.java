package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;

public class SwipeRefreshLayout extends ViewGroup implements id, ih {
    private static final String i = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] y = {16842766};
    private Animation A;
    private Animation B;
    private Animation C;
    private int D;
    private AnimationListener E = new AnimationListener() {
        public final void onAnimationEnd(Animation animation) {
            if (SwipeRefreshLayout.this.a) {
                SwipeRefreshLayout.this.g.setAlpha(255);
                SwipeRefreshLayout.this.g.start();
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                swipeRefreshLayout.b = swipeRefreshLayout.c.getTop();
                return;
            }
            SwipeRefreshLayout.this.a();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    };
    private final Animation F = new Animation() {
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.a((SwipeRefreshLayout.this.d + ((int) (((float) ((SwipeRefreshLayout.this.f - Math.abs(SwipeRefreshLayout.this.e)) - SwipeRefreshLayout.this.d)) * f))) - SwipeRefreshLayout.this.c.getTop());
            SwipeRefreshLayout.this.g.a(1.0f - f);
        }
    };
    private final Animation G = new Animation() {
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.b(f);
        }
    };
    boolean a = false;
    int b;
    qd c;
    protected int d;
    protected int e;
    int f;
    qe g;
    boolean h;
    private View j;
    private int k;
    private float l = -1.0f;
    private float m;
    private final ik n;
    private final ig o;
    private final int[] p = new int[2];
    private final int[] q = new int[2];
    private boolean r;
    private int s;
    private float t;
    private float u;
    private boolean v;
    private int w = -1;
    private final DecelerateInterpolator x;
    private int z = -1;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = ViewConfiguration.get(context).getScaledTouchSlop();
        this.s = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.D = (int) (displayMetrics.density * 40.0f);
        this.c = new qd(getContext(), -328966);
        this.g = new qe(getContext());
        qe qeVar = this.g;
        a aVar = qeVar.a;
        float f2 = qeVar.b.getDisplayMetrics().density;
        aVar.a(2.5f * f2);
        aVar.p = 7.5f * f2;
        aVar.a(0);
        float f3 = 10.0f * f2;
        float f4 = f2 * 5.0f;
        aVar.q = (int) f3;
        aVar.r = (int) f4;
        qeVar.invalidateSelf();
        this.c.setImageDrawable(this.g);
        this.c.setVisibility(8);
        addView(this.c);
        setChildrenDrawingOrderEnabled(true);
        this.f = (int) (displayMetrics.density * 64.0f);
        this.l = (float) this.f;
        this.n = new ik();
        this.o = new ig(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.D;
        this.b = i2;
        this.e = i2;
        b(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private Animation a(final int i2, final int i3) {
        AnonymousClass3 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                qe qeVar = SwipeRefreshLayout.this.g;
                int i = i2;
                qeVar.setAlpha((int) (((float) i) + (((float) (i3 - i)) * f)));
            }
        };
        r0.setDuration(300);
        qd qdVar = this.c;
        qdVar.a = null;
        qdVar.clearAnimation();
        this.c.startAnimation(r0);
        return r0;
    }

    private void a(int i2, AnimationListener animationListener) {
        this.d = i2;
        this.G.reset();
        this.G.setDuration(200);
        this.G.setInterpolator(this.x);
        if (animationListener != null) {
            this.c.a = animationListener;
        }
        this.c.clearAnimation();
        this.c.startAnimation(this.G);
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            this.w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void a(boolean z2, boolean z3) {
        if (!this.a) {
            this.h = true;
            d();
            this.a = true;
            if (this.a) {
                int i2 = this.b;
                AnimationListener animationListener = this.E;
                this.d = i2;
                this.F.reset();
                this.F.setDuration(200);
                this.F.setInterpolator(this.x);
                if (animationListener != null) {
                    this.c.a = animationListener;
                }
                this.c.clearAnimation();
                this.c.startAnimation(this.F);
                return;
            }
            a(this.E);
        }
    }

    private static boolean a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void b() {
        this.B = a(this.g.getAlpha(), 76);
    }

    private void c() {
        this.C = a(this.g.getAlpha(), 255);
    }

    private void c(float f2) {
        this.g.a(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.l));
        double d2 = (double) min;
        Double.isNaN(d2);
        float max = (Math.max((float) (d2 - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float f3 = (float) this.f;
        double max2 = (double) (Math.max(0.0f, Math.min(Math.abs(f2) - this.l, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.e + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        this.c.setScaleX(1.0f);
        this.c.setScaleY(1.0f);
        if (f2 < this.l) {
            if (this.g.getAlpha() > 76 && !a(this.B)) {
                b();
            }
        } else if (this.g.getAlpha() < 255 && !a(this.C)) {
            c();
        }
        this.g.a(0.0f, Math.min(0.8f, max * 0.8f));
        this.g.a(Math.min(1.0f, max));
        this.g.b((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
        a(i2 - this.b);
    }

    private void d() {
        if (this.j == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.c)) {
                    this.j = childAt;
                    return;
                }
            }
        }
    }

    private void d(float f2) {
        if (f2 > this.l) {
            a(true, true);
            return;
        }
        this.a = false;
        this.g.a(0.0f, 0.0f);
        a(this.b, (AnimationListener) new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
                SwipeRefreshLayout.this.a((AnimationListener) null);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.g.a(false);
    }

    private void e(float f2) {
        float f3 = this.u;
        float f4 = f2 - f3;
        int i2 = this.k;
        if (f4 > ((float) i2) && !this.v) {
            this.t = f3 + ((float) i2);
            this.v = true;
            this.g.setAlpha(76);
        }
    }

    private boolean e() {
        View view = this.j;
        if (!(view instanceof ListView)) {
            return view.canScrollVertically(-1);
        }
        ListView listView = (ListView) view;
        if (VERSION.SDK_INT >= 19) {
            return listView.canScrollList(-1);
        }
        if (listView.getChildCount() != 0) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int top = listView.getChildAt(0).getTop();
            if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.c.clearAnimation();
        this.g.stop();
        this.c.setVisibility(8);
        this.c.getBackground().setAlpha(255);
        this.g.setAlpha(255);
        a(this.e - this.b);
        this.b = this.c.getTop();
    }

    /* access modifiers changed from: 0000 */
    public final void a(float f2) {
        this.c.setScaleX(f2);
        this.c.setScaleY(f2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        this.c.bringToFront();
        ip.g((View) this.c, i2);
        this.b = this.c.getTop();
    }

    /* access modifiers changed from: 0000 */
    public final void a(AnimationListener animationListener) {
        this.A = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.a(1.0f - f);
            }
        };
        this.A.setDuration(150);
        qd qdVar = this.c;
        qdVar.a = animationListener;
        qdVar.clearAnimation();
        this.c.startAnimation(this.A);
    }

    /* access modifiers changed from: 0000 */
    public final void b(float f2) {
        int i2 = this.d;
        a((i2 + ((int) (((float) (this.e - i2)) * f2))) - this.c.getTop());
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.o.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.o.a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.o.a(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.o.a(i2, i3, i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.z;
        if (i4 < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        if (i3 >= i4) {
            i3++;
        }
        return i3;
    }

    public int getNestedScrollAxes() {
        return this.n.a();
    }

    public boolean hasNestedScrollingParent() {
        return this.o.a(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.o.a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || e() || this.a || this.r) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.w;
                    if (i2 == -1) {
                        Log.e(i, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    e(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.v = false;
            this.w = -1;
        } else {
            a(this.e - this.c.getTop());
            this.w = motionEvent.getPointerId(0);
            this.v = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.w);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.u = motionEvent.getY(findPointerIndex2);
        }
        return this.v;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.j == null) {
                d();
            }
            View view = this.j;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.c.getMeasuredWidth();
                int measuredHeight2 = this.c.getMeasuredHeight();
                qd qdVar = this.c;
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = i6 - i7;
                int i9 = this.b;
                qdVar.layout(i8, i9, i6 + i7, measuredHeight2 + i9);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.j == null) {
            d();
        }
        View view = this.j;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.c.measure(MeasureSpec.makeMeasureSpec(this.D, 1073741824), MeasureSpec.makeMeasureSpec(this.D, 1073741824));
            this.z = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.c) {
                    this.z = i4;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.m;
            if (f2 > 0.0f) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.m = 0.0f;
                } else {
                    this.m = f2 - f3;
                    iArr[1] = i3;
                }
                c(this.m);
            }
        }
        int[] iArr2 = this.p;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.q);
        int i6 = i5 + this.q[1];
        if (i6 < 0 && !e()) {
            this.m += (float) Math.abs(i6);
            c(this.m);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.n.a(i2, 0);
        startNestedScroll(i2 & 2);
        this.m = 0.0f;
        this.r = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled() && !this.a && (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.n.a(0);
        this.r = false;
        float f2 = this.m;
        if (f2 > 0.0f) {
            d(f2);
            this.m = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || e() || this.a || this.r) {
            return false;
        }
        if (actionMasked == 0) {
            this.w = motionEvent.getPointerId(0);
            this.v = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.w);
            if (findPointerIndex < 0) {
                Log.e(i, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.v) {
                float y2 = (motionEvent.getY(findPointerIndex) - this.t) * 0.5f;
                this.v = false;
                d(y2);
            }
            this.w = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.w);
            if (findPointerIndex2 < 0) {
                Log.e(i, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y3 = motionEvent.getY(findPointerIndex2);
            e(y3);
            if (this.v) {
                float f2 = (y3 - this.t) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                c(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(i, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                a(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (VERSION.SDK_INT >= 21 || !(this.j instanceof AbsListView)) {
            View view = this.j;
            if (view == null || ip.y(view)) {
                super.requestDisallowInterceptTouchEvent(z2);
            }
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            a();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.o.a(z2);
    }

    public boolean startNestedScroll(int i2) {
        return this.o.a(i2, 0);
    }

    public void stopNestedScroll() {
        this.o.b(0);
    }
}
