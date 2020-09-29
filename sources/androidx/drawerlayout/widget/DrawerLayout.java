package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;

public class DrawerLayout extends ViewGroup {
    static final int[] a = {16842931};
    static final boolean b = (VERSION.SDK_INT >= 19);
    private static final int[] f = {16843828};
    private static final boolean g;
    private float A;
    private Drawable B;
    private Drawable C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private final ArrayList<View> I;
    private Rect J;
    private Matrix K;
    boolean c;
    Object d;
    boolean e;
    private final b h;
    private float i;
    private int j;
    private int k;
    private float l;
    private Paint m;
    private final jw n;
    private final jw o;
    private final f p;
    private final f q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private float z;

    public static class LayoutParams extends MarginLayoutParams {
        public int a = 0;
        float b;
        boolean c;
        int d;

        public LayoutParams(int i, int i2) {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.a);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = layoutParams.a;
        }
    }

    class a extends ht {
        private final Rect c = new Rect();

        a() {
        }

        public final void a(View view, ja jaVar) {
            if (DrawerLayout.b) {
                super.a(view, jaVar);
            } else {
                ja a = ja.a(jaVar);
                super.a(view, a);
                jaVar.b(view);
                ViewParent g = ip.g(view);
                if (g instanceof View) {
                    jaVar.d((View) g);
                }
                Rect rect = this.c;
                a.a(rect);
                jaVar.b(rect);
                a.c(rect);
                jaVar.d(rect);
                jaVar.d(a.b());
                jaVar.a(a.a.getPackageName());
                jaVar.b(a.a.getClassName());
                jaVar.e(a.a.getContentDescription());
                jaVar.i(a.a.isEnabled());
                jaVar.g(a.a.isClickable());
                jaVar.b(a.a.isFocusable());
                jaVar.c(a.a.isFocused());
                jaVar.e(a.c());
                jaVar.f(a.a.isSelected());
                jaVar.h(a.a.isLongClickable());
                jaVar.a(a.a.getActions());
                a.a.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.e(childAt)) {
                        jaVar.c(childAt);
                    }
                }
            }
            jaVar.b((CharSequence) DrawerLayout.class.getName());
            jaVar.b(false);
            jaVar.c(false);
            jaVar.b(defpackage.ja.a.a);
            jaVar.b(defpackage.ja.a.b);
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View a = DrawerLayout.this.a();
            if (a != null) {
                int a2 = hx.a(DrawerLayout.this.c(a), ip.f(DrawerLayout.this));
            }
            return true;
        }

        public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.b || DrawerLayout.e(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }
    }

    static final class b extends ht {
        b() {
        }

        public final void a(View view, ja jaVar) {
            super.a(view, jaVar);
            if (!DrawerLayout.e(view)) {
                jaVar.d((View) null);
            }
        }
    }

    public interface c {
    }

    public static class d extends jt {
        public static final Creator<d> CREATOR = new ClassLoaderCreator<d>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }
        };
        int a = 0;
        int b;
        int e;
        int f;
        int g;

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    public static abstract class e implements c {
    }

    class f extends defpackage.jw.a {
        final int a;
        jw b;
        private final Runnable d = new Runnable() {
            public final void run() {
                int i;
                View view;
                f fVar = f.this;
                int i2 = fVar.b.h;
                boolean z = fVar.a == 3;
                if (z) {
                    view = DrawerLayout.this.a(3);
                    i = (view != null ? -view.getWidth() : 0) + i2;
                } else {
                    view = DrawerLayout.this.a(5);
                    i = DrawerLayout.this.getWidth() - i2;
                }
                if (view == null) {
                    return;
                }
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.a(view) == 0) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    fVar.b.a(view, i, view.getTop());
                    layoutParams.c = true;
                    DrawerLayout.this.invalidate();
                    fVar.d();
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (!drawerLayout.c) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            drawerLayout.getChildAt(i3).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        drawerLayout.c = true;
                    }
                }
            }
        };

        f(int i) {
            this.a = i;
        }

        public final int a(View view) {
            if (DrawerLayout.d(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public final void a() {
            DrawerLayout.this.postDelayed(this.d, 160);
        }

        public final void a(int i) {
            DrawerLayout.this.a(i, this.b.j);
        }

        public final void a(int i, int i2) {
            View a2 = (i & 1) == 1 ? DrawerLayout.this.a(3) : DrawerLayout.this.a(5);
            if (a2 != null && DrawerLayout.this.a(a2) == 0) {
                this.b.a(a2, i2);
            }
        }

        public final void a(View view, float f, float f2) {
            int i;
            float b2 = DrawerLayout.b(view);
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && b2 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && b2 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.a(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public final void a(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).c = false;
            d();
        }

        public final void a(View view, int i, int i2, int i3) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.a(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.a(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public final boolean b(View view, int i) {
            return DrawerLayout.d(view) && DrawerLayout.this.a(view, this.a) && DrawerLayout.this.a(view) == 0;
        }

        public final int c(View view, int i) {
            if (DrawerLayout.this.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        public final void c() {
            DrawerLayout.this.removeCallbacks(this.d);
        }

        public final int d(View view, int i) {
            return view.getTop();
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            int i = 3;
            if (this.a == 3) {
                i = 5;
            }
            View a2 = DrawerLayout.this.a(i);
            if (a2 != null) {
                DrawerLayout.this.a(a2, true);
            }
        }
    }

    static {
        boolean z2 = true;
        if (VERSION.SDK_INT < 21) {
            z2 = false;
        }
        g = z2;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new b();
        this.k = -1728053248;
        this.m = new Paint();
        this.t = true;
        this.u = 3;
        this.v = 3;
        this.w = 3;
        this.x = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.j = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.p = new f(3);
        this.q = new f(5);
        this.n = jw.a((ViewGroup) this, 1.0f, (defpackage.jw.a) this.p);
        jw jwVar = this.n;
        jwVar.i = 1;
        jwVar.g = f3;
        this.p.b = jwVar;
        this.o = jw.a((ViewGroup) this, 1.0f, (defpackage.jw.a) this.q);
        jw jwVar2 = this.o;
        jwVar2.i = 2;
        jwVar2.g = f3;
        this.q.b = jwVar2;
        setFocusableInTouchMode(true);
        ip.b((View) this, 1);
        ip.a((View) this, (ht) new a());
        setMotionEventSplittingEnabled(false);
        if (ip.t(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        DrawerLayout drawerLayout = (DrawerLayout) view;
                        boolean z = true;
                        boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
                        drawerLayout.d = windowInsets;
                        drawerLayout.e = z2;
                        if (z2 || drawerLayout.getBackground() != null) {
                            z = false;
                        }
                        drawerLayout.setWillNotDraw(z);
                        drawerLayout.requestLayout();
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f);
                try {
                    this.B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.B = null;
            }
        }
        this.i = f2 * 10.0f;
        this.I = new ArrayList<>();
    }

    private void a(int i2, int i3) {
        int a2 = hx.a(i3, ip.f(this));
        if (i3 == 3) {
            this.u = i2;
        } else if (i3 == 5) {
            this.v = i2;
        } else if (i3 == 8388611) {
            this.w = i2;
        } else if (i3 == 8388613) {
            this.x = i2;
        }
        if (i2 != 0) {
            (a2 == 3 ? this.n : this.o).a();
        }
        if (i2 == 1) {
            View a3 = a(a2);
            if (a3 != null) {
                a(a3, true);
            }
        } else if (i2 == 2) {
            View a4 = a(a2);
            if (a4 != null) {
                c(a4, true);
            }
        }
    }

    private void a(boolean z2) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (d(childAt) && (!z2 || layoutParams.c)) {
                z3 |= a(childAt, 3) ? this.n.a(childAt, -childAt.getWidth(), childAt.getTop()) : this.o.a(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        this.p.c();
        this.q.c();
        if (z3) {
            invalidate();
        }
    }

    static float b(View view) {
        return ((LayoutParams) view.getLayoutParams()).b;
    }

    private View b() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    private static String b(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private void b(View view, float f2) {
        float width = (float) view.getWidth();
        int i2 = (int) (width * f2);
        int b2 = i2 - ((int) (b(view) * width));
        if (!a(view, 3)) {
            b2 = -b2;
        }
        view.offsetLeftAndRight(b2);
        a(view, f2);
    }

    private void b(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z2 || d(childAt)) && (!z2 || childAt != view)) {
                ip.b(childAt, 4);
            } else {
                ip.b(childAt, 1);
            }
        }
    }

    private void c(View view, boolean z2) {
        if (d(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.t) {
                layoutParams.b = 1.0f;
                layoutParams.d = 1;
                b(view, true);
            } else {
                layoutParams.d |= 2;
                if (a(view, 3)) {
                    this.n.a(view, 0, view.getTop());
                } else {
                    this.o.a(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    static boolean d(View view) {
        int a2 = hx.a(((LayoutParams) view.getLayoutParams()).a, ip.f(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    static boolean e(View view) {
        return (ip.e(view) == 4 || ip.e(view) == 2) ? false : true;
    }

    private static boolean f(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    private boolean g(View view) {
        if (d(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean h(View view) {
        if (d(view)) {
            return ((LayoutParams) view.getLayoutParams()).b > 0.0f;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public final int a(View view) {
        if (d(view)) {
            int i2 = ((LayoutParams) view.getLayoutParams()).a;
            int f2 = ip.f(this);
            if (i2 == 3) {
                int i3 = this.u;
                if (i3 != 3) {
                    return i3;
                }
                int i4 = f2 == 0 ? this.w : this.x;
                if (i4 != 3) {
                    return i4;
                }
            } else if (i2 == 5) {
                int i5 = this.v;
                if (i5 != 3) {
                    return i5;
                }
                int i6 = f2 == 0 ? this.x : this.w;
                if (i6 != 3) {
                    return i6;
                }
            } else if (i2 == 8388611) {
                int i7 = this.w;
                if (i7 != 3) {
                    return i7;
                }
                int i8 = f2 == 0 ? this.u : this.v;
                if (i8 != 3) {
                    return i8;
                }
            } else if (i2 == 8388613) {
                int i9 = this.x;
                if (i9 != 3) {
                    return i9;
                }
                int i10 = f2 == 0 ? this.v : this.u;
                if (i10 != 3) {
                    return i10;
                }
            }
            return 0;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public final View a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (d(childAt) && h(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final View a(int i2) {
        int a2 = hx.a(i2, ip.f(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((c(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, View view) {
        int i3 = this.n.a;
        int i4 = this.o.a;
        int i5 = 2;
        if (i3 == 1 || i4 == 1) {
            i5 = 1;
        } else if (!(i3 == 2 || i4 == 2)) {
            i5 = 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.b == 0.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.d & 1) == 1) {
                    layoutParams2.d = 0;
                    b(view, false);
                    if (hasWindowFocus()) {
                        View rootView = getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            } else if (layoutParams.b == 1.0f) {
                LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams3.d & 1) == 0) {
                    layoutParams3.d = 1;
                    b(view, true);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i5 != this.r) {
            this.r = i5;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 != layoutParams.b) {
            layoutParams.b = f2;
        }
    }

    public final void a(View view, boolean z2) {
        if (d(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.t) {
                layoutParams.b = 0.0f;
                layoutParams.d = 0;
            } else if (z2) {
                layoutParams.d |= 4;
                if (a(view, 3)) {
                    this.n.a(view, -view.getWidth(), view.getTop());
                } else {
                    this.o.a(view, getWidth(), view.getTop());
                }
            } else {
                b(view, 0.0f);
                a(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(View view, int i2) {
        return (c(view) & i2) == i2;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!d(childAt)) {
                    this.I.add(childAt);
                } else if (g(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.I.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = (View) this.I.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.I.clear();
        }
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (b() != null || d(view)) {
            ip.b(view, 4);
        } else {
            ip.b(view, 1);
        }
        if (!b) {
            ip.a(view, (ht) this.h);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int c(View view) {
        return hx.a(((LayoutParams) view.getLayoutParams()).a, ip.f(this));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i2).getLayoutParams()).b);
        }
        this.l = f2;
        boolean a2 = this.n.a(true);
        boolean a3 = this.o.a(true);
        if (a2 || a3) {
            ip.d(this);
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z2;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.l <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                if (this.J == null) {
                    this.J = new Rect();
                }
                childAt.getHitRect(this.J);
                if (this.J.contains((int) x2, (int) y2) && !f(childAt)) {
                    if (!childAt.getMatrix().isIdentity()) {
                        float scrollX = (float) (getScrollX() - childAt.getLeft());
                        float scrollY = (float) (getScrollY() - childAt.getTop());
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(scrollX, scrollY);
                        Matrix matrix = childAt.getMatrix();
                        if (!matrix.isIdentity()) {
                            if (this.K == null) {
                                this.K = new Matrix();
                            }
                            matrix.invert(this.K);
                            obtain.transform(this.K);
                        }
                        z2 = childAt.dispatchGenericMotionEvent(obtain);
                        obtain.recycle();
                    } else {
                        float scrollX2 = (float) (getScrollX() - childAt.getLeft());
                        float scrollY2 = (float) (getScrollY() - childAt.getTop());
                        motionEvent.offsetLocation(scrollX2, scrollY2);
                        z2 = childAt.dispatchGenericMotionEvent(motionEvent);
                        motionEvent.offsetLocation(-scrollX2, -scrollY2);
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int i2;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean f2 = f(view);
        int width = getWidth();
        int save = canvas.save();
        int i3 = 0;
        if (f2) {
            int childCount = getChildCount();
            i2 = width;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != view2 && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && d(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i4) {
                                i4 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < i2) {
                                i2 = left;
                            }
                        }
                    }
                }
            }
            canvas2.clipRect(i4, 0, i2, getHeight());
            i3 = i4;
        } else {
            i2 = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas2.restoreToCount(save);
        float f3 = this.l;
        if (f3 > 0.0f && f2) {
            int i6 = this.k;
            this.m.setColor((i6 & 16777215) | (((int) (((float) ((-16777216 & i6) >>> 24)) * f3)) << 24));
            canvas.drawRect((float) i3, 0.0f, (float) i2, (float) getHeight(), this.m);
        } else if (this.C != null && a(view2, 3)) {
            int intrinsicWidth = this.C.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.n.h), 1.0f));
            this.C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.C.setAlpha((int) (max * 255.0f));
            this.C.draw(canvas2);
        } else if (this.D != null && a(view2, 5)) {
            int intrinsicWidth2 = this.D.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.o.h), 1.0f));
            this.D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.D.setAlpha((int) (max2 * 255.0f));
            this.D.draw(canvas2);
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.e
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.B
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.d
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.B
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.B
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055 A[LOOP:0: B:8:0x0024->B:17:0x0055, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0053 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            jw r1 = r8.n
            boolean r1 = r1.a(r9)
            jw r2 = r8.o
            boolean r2 = r2.a(r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x006f
            if (r0 == r2) goto L_0x0066
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x0066
            goto L_0x006d
        L_0x001e:
            jw r9 = r8.n
            float[] r0 = r9.c
            int r0 = r0.length
            r4 = 0
        L_0x0024:
            if (r4 >= r0) goto L_0x0058
            boolean r5 = r9.a(r4)
            if (r5 == 0) goto L_0x0050
            float[] r5 = r9.e
            r5 = r5[r4]
            float[] r6 = r9.c
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f
            r6 = r6[r4]
            float[] r7 = r9.d
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r5 = r5 + r6
            int r6 = r9.b
            int r7 = r9.b
            int r6 = r6 * r7
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            if (r5 == 0) goto L_0x0055
            r9 = 1
            goto L_0x0059
        L_0x0055:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0058:
            r9 = 0
        L_0x0059:
            if (r9 == 0) goto L_0x006d
            androidx.drawerlayout.widget.DrawerLayout$f r9 = r8.p
            r9.c()
            androidx.drawerlayout.widget.DrawerLayout$f r9 = r8.q
            r9.c()
            goto L_0x006d
        L_0x0066:
            r8.a(r2)
            r8.y = r3
            r8.c = r3
        L_0x006d:
            r9 = 0
            goto L_0x0099
        L_0x006f:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.z = r0
            r8.A = r9
            float r4 = r8.l
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0094
            jw r4 = r8.n
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.b(r0, r9)
            if (r9 == 0) goto L_0x0094
            boolean r9 = f(r9)
            if (r9 == 0) goto L_0x0094
            r9 = 1
            goto L_0x0095
        L_0x0094:
            r9 = 0
        L_0x0095:
            r8.y = r3
            r8.c = r3
        L_0x0099:
            if (r1 != 0) goto L_0x00c0
            if (r9 != 0) goto L_0x00c0
            int r9 = r8.getChildCount()
            r0 = 0
        L_0x00a2:
            if (r0 >= r9) goto L_0x00b7
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            boolean r1 = r1.c
            if (r1 == 0) goto L_0x00b4
            r9 = 1
            goto L_0x00b8
        L_0x00b4:
            int r0 = r0 + 1
            goto L_0x00a2
        L_0x00b7:
            r9 = 0
        L_0x00b8:
            if (r9 != 0) goto L_0x00c0
            boolean r9 = r8.c
            if (r9 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            return r3
        L_0x00c0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (a() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View a2 = a();
        if (a2 != null && a(a2) == 0) {
            a(false);
        }
        return a2 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        this.s = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (layoutParams.b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i9 = i7 - ((int) (layoutParams.b * f4));
                        f2 = ((float) (i7 - i9)) / f4;
                        i6 = i9;
                    }
                    boolean z3 = f2 != layoutParams.b;
                    int i10 = layoutParams.a & ContentType.LONG_FORM_ON_DEMAND;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        if (i12 < layoutParams.topMargin) {
                            i12 = layoutParams.topMargin;
                        } else if (i12 + measuredHeight > i11 - layoutParams.bottomMargin) {
                            i12 = (i11 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        childAt.layout(i6, layoutParams.topMargin, measuredWidth + i6, layoutParams.topMargin + measuredHeight);
                    } else {
                        int i13 = i5 - i3;
                        childAt.layout(i6, (i13 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i13 - layoutParams.bottomMargin);
                    }
                    if (z3) {
                        a(childAt, f2);
                    }
                    int i14 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i14) {
                        childAt.setVisibility(i14);
                    }
                }
            }
        }
        this.s = false;
        this.t = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.d != null && ip.t(this);
        int f2 = ip.f(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int a2 = hx.a(layoutParams.a, f2);
                    if (ip.t(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.d;
                            if (a2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.d;
                        if (a2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (f(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (d(childAt)) {
                    if (g) {
                        float o2 = ip.o(childAt);
                        float f3 = this.i;
                        if (o2 != f3) {
                            ip.e(childAt, f3);
                        }
                    }
                    int c2 = c(childAt) & 7;
                    boolean z5 = c2 == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i2, this.j + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i3, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i5++;
                        i4 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        sb.append(b(c2));
                        sb.append(" but this DrawerLayout");
                        sb.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i5);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i6 = i2;
            int i7 = i3;
            i5++;
            i4 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.d);
        if (dVar.a != 0) {
            View a2 = a(dVar.a);
            if (a2 != null) {
                c(a2, true);
            }
        }
        if (dVar.b != 3) {
            a(dVar.b, 3);
        }
        if (dVar.e != 3) {
            a(dVar.e, 5);
        }
        if (dVar.f != 3) {
            a(dVar.f, 8388611);
        }
        if (dVar.g != 3) {
            a(dVar.g, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (!g) {
            ip.f(this);
            this.C = null;
            ip.f(this);
            this.D = null;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            boolean z2 = true;
            boolean z3 = layoutParams.d == 1;
            if (layoutParams.d != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                dVar.a = layoutParams.a;
            } else {
                i2++;
            }
        }
        dVar.b = this.u;
        dVar.e = this.v;
        dVar.f = this.w;
        dVar.g = this.x;
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        this.n.b(motionEvent);
        this.o.b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.z = x2;
            this.A = y2;
            this.y = false;
            this.c = false;
        } else if (action == 1) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            View b2 = this.n.b((int) x3, (int) y3);
            if (b2 != null && f(b2)) {
                float f2 = x3 - this.z;
                float f3 = y3 - this.A;
                int i2 = this.n.b;
                if ((f2 * f2) + (f3 * f3) < ((float) (i2 * i2))) {
                    View b3 = b();
                    if (!(b3 == null || a(b3) == 2)) {
                        z2 = false;
                        a(z2);
                        this.y = false;
                    }
                }
            }
            z2 = true;
            a(z2);
            this.y = false;
        } else if (action == 3) {
            a(true);
            this.y = false;
            this.c = false;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        this.y = z2;
        if (z2) {
            a(true);
        }
    }

    public void requestLayout() {
        if (!this.s) {
            super.requestLayout();
        }
    }
}
