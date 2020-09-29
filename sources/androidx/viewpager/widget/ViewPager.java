package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.comscore.streaming.ContentType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] a = {16842931};
    private static final i ad = new i();
    private static final Comparator<b> g = new Comparator<b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((b) obj).b - ((b) obj2).b;
        }
    };
    private static final Interpolator h = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K = -1;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private EdgeEffect Q;
    private EdgeEffect R;
    private boolean S = true;
    private boolean T = false;
    private boolean U;
    private int V;
    private List<e> W;
    private e aa;
    private List<d> ab;
    private ArrayList<View> ac;
    private final Runnable ae = new Runnable() {
        public final void run() {
            ViewPager.this.a(0);
            ViewPager.this.b();
        }
    };
    private int af = 0;
    public sa b;
    public int c;
    public int d = 1;
    public e e;
    private int f;
    private final ArrayList<b> i = new ArrayList<>();
    private final b j = new b();
    private final Rect k = new Rect();
    private int l = -1;
    private Parcelable m = null;
    private ClassLoader n = null;
    private Scroller o;
    private boolean p;
    private f q;
    private int r;
    private int s;
    private int t;
    private float u = -3.4028235E38f;
    private float v = Float.MAX_VALUE;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
    }

    static class b {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b() {
        }
    }

    class c extends ht {
        c() {
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.b != null) {
                accessibilityEvent.setItemCount(ViewPager.this.b.b());
                accessibilityEvent.setFromIndex(ViewPager.this.c);
                accessibilityEvent.setToIndex(ViewPager.this.c);
            }
        }

        public final void a(View view, ja jaVar) {
            super.a(view, jaVar);
            jaVar.b((CharSequence) ViewPager.class.getName());
            jaVar.j(a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                jaVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                jaVar.a(8192);
            }
        }

        public final boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.b(viewPager.c - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.b(viewPager2.c + 1);
                return true;
            }
        }

        private boolean a() {
            return ViewPager.this.b != null && ViewPager.this.b.b() > 1;
        }
    }

    public interface d {
        void a(ViewPager viewPager, sa saVar, sa saVar2);
    }

    public interface e {
        void a(int i);

        void a(int i, float f, int i2);

        void b(int i);
    }

    class f extends DataSetObserver {
        f() {
        }

        public final void onChanged() {
            ViewPager.this.a();
        }

        public final void onInvalidated() {
            ViewPager.this.a();
        }
    }

    public static class g extends jt {
        public static final Creator<g> CREATOR = new ClassLoaderCreator<g>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new g[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }
        };
        int a;
        Parcelable b;
        ClassLoader e;

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.a);
            sb.append("}");
            return sb.toString();
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }
    }

    public static class h implements e {
        public final void a(int i) {
        }

        public final void a(int i, float f, int i2) {
        }

        public void b(int i) {
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            if (layoutParams.a == layoutParams2.a) {
                i = layoutParams.e - layoutParams2.e;
            } else if (!layoutParams.a) {
                return -1;
            } else {
                i = 1;
            }
            return i;
        }
    }

    public ViewPager(Context context) {
        super(context);
        c();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    private void c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.o = new Scroller(context, h);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.F = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f2);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new EdgeEffect(context);
        this.R = new EdgeEffect(context);
        this.O = (int) (25.0f * f2);
        this.P = (int) (2.0f * f2);
        this.D = (int) (f2 * 16.0f);
        ip.a((View) this, (ht) new c());
        if (ip.e(this) == 0) {
            ip.b((View) this, 1);
        }
        ip.a((View) this, (il) new il() {
            private final Rect a = new Rect();

            public final iw onApplyWindowInsets(View view, iw iwVar) {
                iw a2 = ip.a(view, iwVar);
                if (a2.e()) {
                    return a2;
                }
                Rect rect = this.a;
                rect.left = a2.a();
                rect.top = a2.b();
                rect.right = a2.c();
                rect.bottom = a2.d();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    iw b2 = ip.b(ViewPager.this.getChildAt(i), a2);
                    rect.left = Math.min(b2.a(), rect.left);
                    rect.top = Math.min(b2.b(), rect.top);
                    rect.right = Math.min(b2.c(), rect.right);
                    rect.bottom = Math.min(b2.d(), rect.bottom);
                }
                return a2.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.ae);
        Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            this.o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (this.af != i2) {
            this.af = i2;
            e eVar = this.e;
            if (eVar != null) {
                eVar.a(i2);
            }
            List<e> list = this.W;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    e eVar2 = (e) this.W.get(i3);
                    if (eVar2 != null) {
                        eVar2.a(i2);
                    }
                }
            }
            e eVar3 = this.aa;
            if (eVar3 != null) {
                eVar3.a(i2);
            }
        }
    }

    public final void a(sa saVar) {
        sa saVar2 = this.b;
        if (saVar2 != null) {
            saVar2.c(null);
            this.b.a((ViewGroup) this);
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                b bVar = (b) this.i.get(i2);
                this.b.a(this, bVar.b, bVar.a);
            }
            this.b.b((ViewGroup) this);
            this.i.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        sa saVar3 = this.b;
        this.b = saVar;
        this.f = 0;
        if (this.b != null) {
            if (this.q == null) {
                this.q = new f();
            }
            this.b.c(this.q);
            this.A = false;
            boolean z2 = this.S;
            this.S = true;
            this.f = this.b.b();
            if (this.l >= 0) {
                this.b.a(this.m, this.n);
                a(this.l, false, true);
                this.l = -1;
                this.m = null;
                this.n = null;
            } else if (!z2) {
                b();
            } else {
                requestLayout();
            }
        }
        List<d> list = this.ab;
        if (list != null && !list.isEmpty()) {
            int size = this.ab.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((d) this.ab.get(i4)).a(this, saVar3, saVar);
            }
        }
    }

    public final void a(d dVar) {
        if (this.ab == null) {
            this.ab = new ArrayList();
        }
        this.ab.add(dVar);
    }

    public final void b(d dVar) {
        List<d> list = this.ab;
        if (list != null) {
            list.remove(dVar);
        }
    }

    private int d() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final void b(int i2) {
        this.A = false;
        a(i2, !this.S, false);
    }

    public final void a(int i2, boolean z2) {
        this.A = false;
        a(i2, z2, false);
    }

    private void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        sa saVar = this.b;
        if (saVar == null || saVar.b() <= 0) {
            c(false);
        } else if (z3 || this.c != i2 || this.i.size() == 0) {
            boolean z4 = true;
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.b.b()) {
                i2 = this.b.b() - 1;
            }
            int i4 = this.d;
            int i5 = this.c;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.i.size(); i6++) {
                    ((b) this.i.get(i6)).c = true;
                }
            }
            if (this.c == i2) {
                z4 = false;
            }
            if (this.S) {
                this.c = i2;
                if (z4) {
                    g(i2);
                }
                requestLayout();
                return;
            }
            d(i2);
            a(i2, z2, i3, z4);
        } else {
            c(false);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        b e2 = e(i2);
        int d2 = e2 != null ? (int) (((float) d()) * Math.max(this.u, Math.min(e2.e, this.v))) : 0;
        if (z2) {
            a(d2, 0, i3);
            if (z3) {
                g(i2);
            }
        } else {
            if (z3) {
                g(i2);
            }
            a(false);
            scrollTo(d2, 0);
            f(d2);
        }
    }

    public final void a(e eVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(eVar);
    }

    public final void b(e eVar) {
        List<e> list = this.W;
        if (list != null) {
            list.remove(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        return ((LayoutParams) ((View) this.ac.get(i3)).getLayoutParams()).f;
    }

    /* access modifiers changed from: 0000 */
    public final e c(e eVar) {
        e eVar2 = this.aa;
        this.aa = eVar;
        return eVar2;
    }

    public final void c(int i2) {
        int i3 = this.r;
        this.r = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    private static float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private void a(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            c(false);
            return;
        }
        Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            i5 = this.p ? this.o.getCurrX() : this.o.getStartX();
            this.o.abortAnimation();
            c(false);
        } else {
            i5 = getScrollX();
        }
        int i7 = i5;
        int scrollY = getScrollY();
        int i8 = i2 - i7;
        int i9 = 0 - scrollY;
        if (i8 == 0 && i9 == 0) {
            a(false);
            b();
            a(0);
            return;
        }
        c(true);
        a(2);
        int d2 = d();
        int i10 = d2 / 2;
        float f2 = (float) d2;
        float f3 = (float) i10;
        float a2 = f3 + (a(Math.min(1.0f, (((float) Math.abs(i8)) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        if (abs > 0) {
            i6 = Math.round(Math.abs(a2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i6 = (int) (((((float) Math.abs(i8)) / ((f2 * this.b.l_(this.c)) + ((float) this.r))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i6, 600);
        this.p = false;
        this.o.startScroll(i7, scrollY, i8, i9, min);
        ip.d(this);
    }

    private b a(int i2, int i3) {
        b bVar = new b();
        bVar.b = i2;
        bVar.a = this.b.a((ViewGroup) this, i2);
        bVar.d = this.b.l_(i2);
        if (i3 < 0 || i3 >= this.i.size()) {
            this.i.add(bVar);
        } else {
            this.i.add(i3, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int b2 = this.b.b();
        this.f = b2;
        boolean z2 = this.i.size() < (this.d << 1) + 1 && this.i.size() < b2;
        int i2 = this.c;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.i.size()) {
            b bVar = (b) this.i.get(i3);
            int a2 = this.b.a(bVar.a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.i.remove(i3);
                    i3--;
                    if (!z3) {
                        this.b.a((ViewGroup) this);
                        z3 = true;
                    }
                    this.b.a(this, bVar.b, bVar.a);
                    if (this.c == bVar.b) {
                        i2 = Math.max(0, Math.min(this.c, b2 - 1));
                    }
                } else if (bVar.b != a2) {
                    if (bVar.b == this.c) {
                        i2 = a2;
                    }
                    bVar.b = a2;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.b.b((ViewGroup) this);
        }
        Collections.sort(this.i, g);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    public final void b() {
        d(this.c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r8.b == r0.c) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.c
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$b r2 = r0.e(r2)
            r0.c = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            sa r1 = r0.b
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            boolean r1 = r0.A
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0021
            return
        L_0x0021:
            sa r1 = r0.b
            r1.a(r0)
            int r1 = r0.d
            int r4 = r0.c
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            sa r6 = r0.b
            int r6 = r6.b()
            int r7 = r6 + -1
            int r8 = r0.c
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f
            if (r6 != r7) goto L_0x0209
            r7 = 0
        L_0x0044:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r8 = r0.i
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0064
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r8 = r0.i
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$b r8 = (androidx.viewpager.widget.ViewPager.b) r8
            int r9 = r8.b
            int r10 = r0.c
            if (r9 < r10) goto L_0x0061
            int r9 = r8.b
            int r10 = r0.c
            if (r9 != r10) goto L_0x0064
            goto L_0x0065
        L_0x0061:
            int r7 = r7 + 1
            goto L_0x0044
        L_0x0064:
            r8 = 0
        L_0x0065:
            if (r8 != 0) goto L_0x006f
            if (r6 <= 0) goto L_0x006f
            int r8 = r0.c
            androidx.viewpager.widget.ViewPager$b r8 = r0.a(r8, r7)
        L_0x006f:
            r9 = 0
            if (r8 == 0) goto L_0x019a
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x007f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r11 = r0.i
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$b r11 = (androidx.viewpager.widget.ViewPager.b) r11
            goto L_0x0080
        L_0x007f:
            r11 = 0
        L_0x0080:
            int r12 = r17.d()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008a
            r3 = 0
            goto L_0x0097
        L_0x008a:
            float r14 = r8.d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x0097:
            int r14 = r0.c
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = 0
        L_0x009e:
            if (r14 < 0) goto L_0x00fd
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r14 >= r4) goto L_0x00cb
            if (r11 == 0) goto L_0x00fd
            int r5 = r11.b
            if (r14 != r5) goto L_0x00f9
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            r5.remove(r15)
            sa r5 = r0.b
            java.lang.Object r11 = r11.a
            r5.a(r0, r14, r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$b r5 = (androidx.viewpager.widget.ViewPager.b) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.b
            if (r14 != r5) goto L_0x00e1
            float r5 = r11.d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$b r5 = (androidx.viewpager.widget.ViewPager.b) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r15 + 1
            androidx.viewpager.widget.ViewPager$b r5 = r0.a(r14, r5)
            float r5 = r5.d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$b r5 = (androidx.viewpager.widget.ViewPager.b) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x009e
        L_0x00fd:
            float r3 = r8.d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x018e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$b r5 = (androidx.viewpager.widget.ViewPager.b) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r7 = 0
            goto L_0x0123
        L_0x011b:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x0123:
            int r11 = r0.c
        L_0x0125:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x018e
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x0158
            if (r11 <= r1) goto L_0x0158
            if (r5 == 0) goto L_0x018e
            int r12 = r5.b
            if (r11 != r12) goto L_0x018d
            boolean r12 = r5.c
            if (r12 != 0) goto L_0x018d
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r12 = r0.i
            r12.remove(r4)
            sa r12 = r0.b
            java.lang.Object r5 = r5.a
            r12.a(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0156
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$b r5 = (androidx.viewpager.widget.ViewPager.b) r5
            goto L_0x018d
        L_0x0156:
            r5 = 0
            goto L_0x018d
        L_0x0158:
            if (r5 == 0) goto L_0x0174
            int r12 = r5.b
            if (r11 != r12) goto L_0x0174
            float r5 = r5.d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0156
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$b r5 = (androidx.viewpager.widget.ViewPager.b) r5
            goto L_0x018d
        L_0x0174:
            androidx.viewpager.widget.ViewPager$b r5 = r0.a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0156
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$b> r5 = r0.i
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$b r5 = (androidx.viewpager.widget.ViewPager.b) r5
        L_0x018d:
            goto L_0x0125
        L_0x018e:
            r0.a(r8, r10, r2)
            sa r1 = r0.b
            int r2 = r0.c
            java.lang.Object r3 = r8.a
            r1.b(r0, r2, r3)
        L_0x019a:
            sa r1 = r0.b
            r1.b(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a4:
            if (r2 >= r1) goto L_0x01cd
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            r4.f = r2
            boolean r5 = r4.a
            if (r5 != 0) goto L_0x01ca
            float r5 = r4.c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ca
            androidx.viewpager.widget.ViewPager$b r3 = r0.a(r3)
            if (r3 == 0) goto L_0x01ca
            float r5 = r3.d
            r4.c = r5
            int r3 = r3.b
            r4.e = r3
        L_0x01ca:
            int r2 = r2 + 1
            goto L_0x01a4
        L_0x01cd:
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0208
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01de
            androidx.viewpager.widget.ViewPager$b r3 = r0.b(r1)
            goto L_0x01df
        L_0x01de:
            r3 = 0
        L_0x01df:
            if (r3 == 0) goto L_0x01e7
            int r1 = r3.b
            int r2 = r0.c
            if (r1 == r2) goto L_0x0208
        L_0x01e7:
            r1 = 0
        L_0x01e8:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x0208
            android.view.View r2 = r0.getChildAt(r1)
            androidx.viewpager.widget.ViewPager$b r3 = r0.a(r2)
            if (r3 == 0) goto L_0x0205
            int r3 = r3.b
            int r4 = r0.c
            if (r3 != r4) goto L_0x0205
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 != 0) goto L_0x0208
        L_0x0205:
            int r1 = r1 + 1
            goto L_0x01e8
        L_0x0208:
            return
        L_0x0209:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0216 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0216 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0216 }
            goto L_0x021e
        L_0x0216:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x021e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.f
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            sa r1 = r0.b
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x025f
        L_0x025e:
            throw r2
        L_0x025f:
            goto L_0x025e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):void");
    }

    private void a(b bVar, int i2, b bVar2) {
        b bVar3;
        b bVar4;
        int b2 = this.b.b();
        int d2 = d();
        float f2 = d2 > 0 ? ((float) this.r) / ((float) d2) : 0.0f;
        if (bVar2 != null) {
            int i3 = bVar2.b;
            if (i3 < bVar.b) {
                float f3 = bVar2.e + bVar2.d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bVar.b && i5 < this.i.size()) {
                    Object obj = this.i.get(i5);
                    while (true) {
                        bVar4 = (b) obj;
                        if (i4 > bVar4.b && i5 < this.i.size() - 1) {
                            i5++;
                            obj = this.i.get(i5);
                        }
                    }
                    while (i4 < bVar4.b) {
                        f3 += this.b.l_(i4) + f2;
                        i4++;
                    }
                    bVar4.e = f3;
                    f3 += bVar4.d + f2;
                    i4++;
                }
            } else if (i3 > bVar.b) {
                int size = this.i.size() - 1;
                float f4 = bVar2.e;
                while (true) {
                    i3--;
                    if (i3 < bVar.b || size < 0) {
                        break;
                    }
                    Object obj2 = this.i.get(size);
                    while (true) {
                        bVar3 = (b) obj2;
                        if (i3 < bVar3.b && size > 0) {
                            size--;
                            obj2 = this.i.get(size);
                        }
                    }
                    while (i3 > bVar3.b) {
                        f4 -= this.b.l_(i3) + f2;
                        i3--;
                    }
                    f4 -= bVar3.d + f2;
                    bVar3.e = f4;
                }
            }
        }
        int size2 = this.i.size();
        float f5 = bVar.e;
        int i6 = bVar.b - 1;
        this.u = bVar.b == 0 ? bVar.e : -3.4028235E38f;
        int i7 = b2 - 1;
        this.v = bVar.b == i7 ? (bVar.e + bVar.d) - 1.0f : Float.MAX_VALUE;
        int i8 = i2 - 1;
        while (i8 >= 0) {
            b bVar5 = (b) this.i.get(i8);
            while (i6 > bVar5.b) {
                f5 -= this.b.l_(i6) + f2;
                i6--;
            }
            f5 -= bVar5.d + f2;
            bVar5.e = f5;
            if (bVar5.b == 0) {
                this.u = f5;
            }
            i8--;
            i6--;
        }
        float f6 = bVar.e + bVar.d + f2;
        int i9 = bVar.b + 1;
        int i10 = i2 + 1;
        while (i10 < size2) {
            b bVar6 = (b) this.i.get(i10);
            while (i9 < bVar6.b) {
                f6 += this.b.l_(i9) + f2;
                i9++;
            }
            if (bVar6.b == i7) {
                this.v = (bVar6.d + f6) - 1.0f;
            }
            bVar6.e = f6;
            f6 += bVar6.d + f2;
            i10++;
            i9++;
        }
        this.T = false;
    }

    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.a = this.c;
        sa saVar = this.b;
        if (saVar != null) {
            gVar.b = saVar.a();
        }
        return gVar;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.d);
        sa saVar = this.b;
        if (saVar != null) {
            saVar.a(gVar.b, gVar.e);
            a(gVar.a, false, true);
            return;
        }
        this.l = gVar.a;
        this.m = gVar.b;
        this.n = gVar.e;
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.a |= view.getClass().getAnnotation(a.class) != null;
        if (!this.y) {
            super.addView(view, i2, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.a) {
            layoutParams2.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void removeView(View view) {
        if (this.y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private b a(View view) {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            b bVar = (b) this.i.get(i2);
            if (this.b.a(view, bVar.a)) {
                return bVar;
            }
        }
        return null;
    }

    private b b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    private b e(int i2) {
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            b bVar = (b) this.i.get(i3);
            if (bVar.b == i2) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            int r2 = getDefaultSize(r1, r2)
            r3 = r18
            int r3 = getDefaultSize(r1, r3)
            r0.setMeasuredDimension(r2, r3)
            int r2 = r16.getMeasuredWidth()
            int r3 = r2 / 10
            int r4 = r0.D
            int r3 = java.lang.Math.min(r3, r4)
            r0.E = r3
            int r3 = r16.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r16.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r16.getMeasuredHeight()
            int r4 = r16.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r16.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r16.getChildCount()
            r5 = r3
            r3 = r2
            r2 = 0
        L_0x003f:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r4) goto L_0x00c7
            android.view.View r9 = r0.getChildAt(r2)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto L_0x00c2
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r6 = (androidx.viewpager.widget.ViewPager.LayoutParams) r6
            if (r6 == 0) goto L_0x00c2
            boolean r10 = r6.a
            if (r10 == 0) goto L_0x00c2
            int r10 = r6.b
            r10 = r10 & 7
            int r11 = r6.b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x006f
            r12 = 80
            if (r11 != r12) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r11 = 0
            goto L_0x0070
        L_0x006f:
            r11 = 1
        L_0x0070:
            r12 = 3
            if (r10 == r12) goto L_0x0078
            r12 = 5
            if (r10 != r12) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x007f
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0084
        L_0x007f:
            if (r7 == 0) goto L_0x0084
            r12 = 1073741824(0x40000000, float:2.0)
            goto L_0x0086
        L_0x0084:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0086:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L_0x0098
            int r10 = r6.width
            if (r10 == r14) goto L_0x0094
            int r10 = r6.width
            r13 = r10
            goto L_0x0095
        L_0x0094:
            r13 = r3
        L_0x0095:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0099
        L_0x0098:
            r13 = r3
        L_0x0099:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a6
            int r1 = r6.height
            if (r1 == r14) goto L_0x00a4
            int r1 = r6.height
            goto L_0x00a8
        L_0x00a4:
            r1 = r5
            goto L_0x00a8
        L_0x00a6:
            r1 = r5
            r8 = r12
        L_0x00a8:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r11 == 0) goto L_0x00bb
            int r1 = r9.getMeasuredHeight()
            int r5 = r5 - r1
            goto L_0x00c2
        L_0x00bb:
            if (r7 == 0) goto L_0x00c2
            int r1 = r9.getMeasuredWidth()
            int r3 = r3 - r1
        L_0x00c2:
            int r2 = r2 + 1
            r1 = 0
            goto L_0x003f
        L_0x00c7:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.w = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.x = r1
            r0.y = r7
            r16.b()
            r1 = 0
            r0.y = r1
            int r2 = r16.getChildCount()
        L_0x00df:
            if (r1 >= r2) goto L_0x0109
            android.view.View r4 = r0.getChildAt(r1)
            int r5 = r4.getVisibility()
            if (r5 == r6) goto L_0x0106
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r5 = (androidx.viewpager.widget.ViewPager.LayoutParams) r5
            if (r5 == 0) goto L_0x00f7
            boolean r7 = r5.a
            if (r7 != 0) goto L_0x0106
        L_0x00f7:
            float r7 = (float) r3
            float r5 = r5.c
            float r7 = r7 * r5
            int r5 = (int) r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r7 = r0.x
            r4.measure(r5, r7)
        L_0x0106:
            int r1 = r1 + 1
            goto L_0x00df
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.r;
            a(i2, i4, i6, i6);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.i.isEmpty()) {
            b e2 = e(this.c);
            int min = (int) ((e2 != null ? Math.min(e2.e, this.v) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.o.isFinished()) {
            this.o.setFinalX(this.c * d());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        int childCount = getChildCount();
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i10 = paddingBottom;
        int i11 = 0;
        int i12 = paddingTop;
        int i13 = paddingLeft;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    int i15 = layoutParams.b & 7;
                    int i16 = layoutParams.b & ContentType.LONG_FORM_ON_DEMAND;
                    if (i15 == 1) {
                        i6 = Math.max((i8 - childAt.getMeasuredWidth()) / 2, i13);
                    } else if (i15 == 3) {
                        i6 = i13;
                        i13 = childAt.getMeasuredWidth() + i13;
                    } else if (i15 != 5) {
                        i6 = i13;
                    } else {
                        i6 = (i8 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i16 == 16) {
                        i7 = Math.max((i9 - childAt.getMeasuredHeight()) / 2, i12);
                    } else if (i16 == 48) {
                        i7 = i12;
                        i12 = childAt.getMeasuredHeight() + i12;
                    } else if (i16 != 80) {
                        i7 = i12;
                    } else {
                        i7 = (i9 - i10) - childAt.getMeasuredHeight();
                        i10 += childAt.getMeasuredHeight();
                    }
                    int i17 = i6 + scrollX;
                    childAt.layout(i17, i7, childAt.getMeasuredWidth() + i17, i7 + childAt.getMeasuredHeight());
                    i11++;
                }
            }
        }
        int i18 = (i8 - i13) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.a) {
                    b a2 = a(childAt2);
                    if (a2 != null) {
                        float f2 = (float) i18;
                        int i20 = ((int) (a2.e * f2)) + i13;
                        if (layoutParams2.d) {
                            layoutParams2.d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams2.c), 1073741824), MeasureSpec.makeMeasureSpec((i9 - i12) - i10, 1073741824));
                        }
                        childAt2.layout(i20, i12, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + i12);
                    }
                }
            }
        }
        this.s = i12;
        this.t = i9 - i10;
        this.V = i11;
        if (this.S) {
            z3 = false;
            a(this.c, false, 0, false);
        } else {
            z3 = false;
        }
        this.S = z3;
    }

    public void computeScroll() {
        this.p = true;
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.o.getCurrX();
        int currY = this.o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!f(currX)) {
                this.o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ip.d(this);
    }

    private boolean f(int i2) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.i.size() != 0) {
            b f2 = f();
            int d2 = d();
            int i3 = this.r;
            int i4 = d2 + i3;
            float f3 = (float) d2;
            float f4 = ((float) i3) / f3;
            int i5 = f2.b;
            float f5 = ((((float) i2) / f3) - f2.e) / (f2.d + f4);
            int i6 = (int) (((float) i4) * f5);
            this.U = false;
            a(i5, f5, i6);
            if (this.U) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.S) {
            return false;
        } else {
            this.U = false;
            a(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.V
            r1 = 1
            if (r0 <= 0) goto L_0x0069
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L_0x001a:
            if (r6 >= r5) goto L_0x0069
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r8 = (androidx.viewpager.widget.ViewPager.LayoutParams) r8
            boolean r9 = r8.a
            if (r9 == 0) goto L_0x0066
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L_0x004b
            r9 = 3
            if (r8 == r9) goto L_0x0045
            r9 = 5
            if (r8 == r9) goto L_0x0038
            r8 = r2
            goto L_0x005a
        L_0x0038:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
            goto L_0x0057
        L_0x0045:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005a
        L_0x004b:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L_0x0057:
            r10 = r8
            r8 = r2
            r2 = r10
        L_0x005a:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0065
            r7.offsetLeftAndRight(r2)
        L_0x0065:
            r2 = r8
        L_0x0066:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0069:
            r11.b(r12, r13, r14)
            r11.U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int, float, int):void");
    }

    private void b(int i2, float f2, int i3) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.a(i2, f2, i3);
        }
        List<e> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar2 = (e) this.W.get(i4);
                if (eVar2 != null) {
                    eVar2.a(i2, f2, i3);
                }
            }
        }
        e eVar3 = this.aa;
        if (eVar3 != null) {
            eVar3.a(i2, f2, i3);
        }
    }

    private void g(int i2) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.b(i2);
        }
        List<e> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = (e) this.W.get(i3);
                if (eVar2 != null) {
                    eVar2.b(i2);
                }
            }
        }
        e eVar3 = this.aa;
        if (eVar3 != null) {
            eVar3.b(i2);
        }
    }

    private void a(boolean z2) {
        boolean z3 = this.af == 2;
        if (z3) {
            c(false);
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.o.getCurrX();
                int currY = this.o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        f(currX);
                    }
                }
            }
        }
        this.A = false;
        boolean z4 = z3;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            b bVar = (b) this.i.get(i2);
            if (bVar.c) {
                bVar.c = false;
                z4 = true;
            }
        }
        if (z4) {
            if (z2) {
                ip.a((View) this, this.ae);
                return;
            }
            this.ae.run();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            e();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.I = x2;
            this.G = x2;
            float y2 = motionEvent.getY();
            this.J = y2;
            this.H = y2;
            this.K = motionEvent2.getPointerId(0);
            this.C = false;
            this.p = true;
            this.o.computeScrollOffset();
            if (this.af != 2 || Math.abs(this.o.getFinalX() - this.o.getCurrX()) <= this.P) {
                a(false);
                this.B = false;
            } else {
                this.o.abortAnimation();
                this.A = false;
                b();
                this.B = true;
                b(true);
                a(1);
            }
        } else if (action == 2) {
            int i2 = this.K;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.G;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.J);
                if (f2 != 0.0f) {
                    float f3 = this.G;
                    if (!((f3 < ((float) this.E) && f2 > 0.0f) || (f3 > ((float) (getWidth() - this.E)) && f2 < 0.0f))) {
                        if (a(this, false, (int) f2, (int) x3, (int) y3)) {
                            this.G = x3;
                            this.H = y3;
                            this.C = true;
                            return false;
                        }
                    }
                }
                if (abs > ((float) this.F) && abs * 0.5f > abs2) {
                    this.B = true;
                    b(true);
                    a(1);
                    this.G = f2 > 0.0f ? this.I + ((float) this.F) : this.I - ((float) this.F);
                    this.H = y3;
                    c(true);
                } else if (abs2 > ((float) this.F)) {
                    this.C = true;
                }
                if (this.B && b(x3)) {
                    ip.d(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent2);
        return this.B;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        sa saVar = this.b;
        if (saVar == null || saVar.b() == 0) {
            return false;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.o.abortAnimation();
            this.A = false;
            b();
            float x2 = motionEvent.getX();
            this.I = x2;
            this.G = x2;
            float y2 = motionEvent.getY();
            this.J = y2;
            this.H = y2;
            this.K = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.B) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.K);
                    if (findPointerIndex == -1) {
                        z2 = e();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.G);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.H);
                        if (abs > ((float) this.F) && abs > abs2) {
                            this.B = true;
                            b(true);
                            float f2 = this.I;
                            this.G = x3 - f2 > 0.0f ? f2 + ((float) this.F) : f2 - ((float) this.F);
                            this.H = y3;
                            a(1);
                            c(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.B) {
                    z2 = false | b(motionEvent.getX(motionEvent.findPointerIndex(this.K)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.G = motionEvent.getX(actionIndex);
                    this.K = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    a(motionEvent);
                    this.G = motionEvent.getX(motionEvent.findPointerIndex(this.K));
                }
            } else if (this.B) {
                a(this.c, true, 0, false);
                z2 = e();
            }
        } else if (this.B) {
            VelocityTracker velocityTracker = this.L;
            velocityTracker.computeCurrentVelocity(1000, (float) this.N);
            int xVelocity = (int) velocityTracker.getXVelocity(this.K);
            this.A = true;
            int d2 = d();
            int scrollX = getScrollX();
            b f3 = f();
            float f4 = (float) d2;
            float f5 = ((float) this.r) / f4;
            int i2 = f3.b;
            float f6 = ((((float) scrollX) / f4) - f3.e) / (f3.d + f5);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.K)) - this.I)) <= this.O || Math.abs(xVelocity) <= this.M) {
                i2 += (int) (f6 + (i2 >= this.c ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            if (this.i.size() > 0) {
                b bVar = (b) this.i.get(0);
                ArrayList<b> arrayList = this.i;
                i2 = Math.max(bVar.b, Math.min(i2, ((b) arrayList.get(arrayList.size() - 1)).b));
            }
            a(i2, true, true, xVelocity);
            z2 = e();
        }
        if (z2) {
            ip.d(this);
        }
        return true;
    }

    private boolean e() {
        this.K = -1;
        g();
        this.Q.onRelease();
        this.R.onRelease();
        return this.Q.isFinished() || this.R.isFinished();
    }

    private void b(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private boolean b(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.G - f2;
        this.G = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float d2 = (float) d();
        float f4 = this.u * d2;
        float f5 = this.v * d2;
        boolean z4 = false;
        b bVar = (b) this.i.get(0);
        ArrayList<b> arrayList = this.i;
        b bVar2 = (b) arrayList.get(arrayList.size() - 1);
        if (bVar.b != 0) {
            f4 = bVar.e * d2;
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVar2.b != this.b.b() - 1) {
            f5 = bVar2.e * d2;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.Q.onPull(Math.abs(f4 - scrollX) / d2);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.R.onPull(Math.abs(scrollX - f5) / d2);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.G += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        f(i2);
        return z4;
    }

    private b f() {
        int d2 = d();
        float scrollX = d2 > 0 ? ((float) getScrollX()) / ((float) d2) : 0.0f;
        float f2 = d2 > 0 ? ((float) this.r) / ((float) d2) : 0.0f;
        b bVar = null;
        int i2 = 0;
        boolean z2 = true;
        int i3 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i2 < this.i.size()) {
            b bVar2 = (b) this.i.get(i2);
            if (!z2) {
                int i4 = i3 + 1;
                if (bVar2.b != i4) {
                    bVar2 = this.j;
                    bVar2.e = f3 + f4 + f2;
                    bVar2.b = i4;
                    bVar2.d = this.b.l_(bVar2.b);
                    i2--;
                }
            }
            f3 = bVar2.e;
            float f5 = bVar2.d + f3 + f2;
            if (!z2 && scrollX < f3) {
                return bVar;
            }
            if (scrollX < f5 || i2 == this.i.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.b;
            f4 = bVar2.d;
            i2++;
            bVar = bVar2;
            z2 = false;
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0.b() > 1) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r0 != r2) goto L_0x0018
            sa r0 = r7.b
            if (r0 == 0) goto L_0x0018
            int r0 = r0.b()
            if (r0 <= r2) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            android.widget.EdgeEffect r8 = r7.Q
            r8.finish()
            android.widget.EdgeEffect r8 = r7.R
            r8.finish()
            goto L_0x00a9
        L_0x0024:
            android.widget.EdgeEffect r0 = r7.Q
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0065
            int r0 = r8.save()
            int r2 = r7.getHeight()
            int r3 = r7.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r7.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r7.getWidth()
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = -r2
            int r5 = r7.getPaddingTop()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r5 = r7.u
            float r6 = (float) r3
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.Q
            r4.setSize(r2, r3)
            android.widget.EdgeEffect r2 = r7.Q
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x0065:
            android.widget.EdgeEffect r0 = r7.R
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00a9
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.v
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.R
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.R
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            defpackage.ip.d(r7)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.G = motionEvent.getX(i2);
            this.K = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void g() {
        this.B = false;
        this.C = false;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
    }

    private void c(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.b == null) {
            return false;
        }
        int d2 = d();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) d2) * this.u))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) d2) * this.v))) {
            return false;
        } else {
            return true;
        }
    }

    private boolean a(View view, boolean z2, int i2, int i3, int i4) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                    int i6 = i4 + scrollY;
                    if (i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                        if (a(childAt, true, i2, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L_0x005f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x005a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x005a
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.h(r4)
            goto L_0x005b
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x005a
            boolean r6 = r5.h(r1)
            goto L_0x005b
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.i()
            goto L_0x005b
        L_0x0041:
            r6 = 66
            boolean r6 = r5.h(r6)
            goto L_0x005b
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0053
            boolean r6 = r5.h()
            goto L_0x005b
        L_0x0053:
            r6 = 17
            boolean r6 = r5.h(r6)
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            return r2
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    private boolean h(int i2) {
        boolean z2;
        View findFocus = findFocus();
        boolean z3 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z2 = false;
                        break;
                    } else if (parent == this) {
                        z2 = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder sb2 = new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                    Log.e("ViewPager", sb2.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus == null || findNextFocus == view) {
            if (i2 == 17 || i2 == 1) {
                z3 = h();
            } else if (i2 == 66 || i2 == 2) {
                z3 = i();
            }
        } else if (i2 == 17) {
            z3 = (view == null || a(this.k, findNextFocus).left < a(this.k, view).left) ? findNextFocus.requestFocus() : h();
        } else if (i2 == 66) {
            z3 = (view == null || a(this.k, findNextFocus).left > a(this.k, view).left) ? findNextFocus.requestFocus() : i();
        }
        if (z3) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z3;
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private boolean h() {
        int i2 = this.c;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    private boolean i() {
        sa saVar = this.b;
        if (saVar == null || this.c >= saVar.b() - 1) {
            return false;
        }
        a(this.c + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    b a2 = a(childAt);
                    if (a2 != null && a2.b == this.c) {
                        childAt.addFocusables(arrayList, i2, i3);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                b a2 = a(childAt);
                if (a2 != null && a2.b == this.c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                b a2 = a(childAt);
                if (a2 != null && a2.b == this.c && childAt.requestFocus(i2, rect)) {
                    return true;
                }
            }
            i4 += i3;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                b a2 = a(childAt);
                if (a2 != null && a2.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
