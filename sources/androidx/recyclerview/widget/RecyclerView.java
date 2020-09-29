package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements ie, C0095if {
    static final Interpolator K = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final int[] L = {16843830};
    private static final boolean M = (VERSION.SDK_INT <= 15);
    private static final boolean N = (VERSION.SDK_INT <= 15);
    private static final Class<?>[] O = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final boolean a = (VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20);
    static final boolean b = (VERSION.SDK_INT >= 23);
    static final boolean c = (VERSION.SDK_INT >= 16);
    static final boolean d = (VERSION.SDK_INT >= 21);
    public final int A;
    final t B;
    od C;
    public defpackage.od.a D;
    public final s E;
    boolean F;
    boolean G;
    boolean H;
    oo I;
    final int[] J;
    private final p P;
    private q Q;
    private final Rect R;
    private final ArrayList<l> S;
    private l T;
    private boolean U;
    private int V;
    private boolean W;
    private final int[] aA;
    private final int[] aB;
    private List<u> aC;
    private Runnable aD;
    private final defpackage.ov.b aE;
    private int aa;
    private final AccessibilityManager ab;
    private boolean ac;
    private int ad;
    private int ae;
    private e af;
    private EdgeEffect ag;
    private EdgeEffect ah;
    private EdgeEffect ai;
    private EdgeEffect aj;
    private int ak;
    private VelocityTracker al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private final int ar;
    private float as;
    private float at;
    private boolean au;
    private List<m> av;
    private a aw;
    private d ax;
    private final int[] ay;
    private ig az;
    public final o e;
    public nv f;
    public ny g;
    final ov h;
    boolean i;
    final Runnable j;
    final Rect k;
    final RectF l;
    public a m;
    public i n;
    public final ArrayList<h> o;
    boolean p;
    public boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    List<j> v;
    public boolean w;
    public f x;
    public int y;
    public k z;

    public static class LayoutParams extends MarginLayoutParams {
        public u c;
        final Rect d = new Rect();
        boolean e = true;
        boolean f = false;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static abstract class a<VH extends u> {
        protected final b b = new b();
        protected boolean c = false;

        public int a(int i) {
            return 0;
        }

        public abstract VH a(ViewGroup viewGroup, int i);

        public final void a(int i, int i2) {
            this.b.a(i, i2);
        }

        public final void a(int i, int i2, Object obj) {
            this.b.a(i, i2, obj);
        }

        public void a(c cVar) {
            this.b.registerObserver(cVar);
        }

        public void a(VH vh) {
        }

        public abstract void a(VH vh, int i);

        public void a(RecyclerView recyclerView) {
        }

        public final void a(boolean z) {
            if (!this.b.a()) {
                this.c = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public abstract int b();

        public long b(int i) {
            return -1;
        }

        public final VH b(ViewGroup viewGroup, int i) {
            try {
                ha.a("RV CreateView");
                VH a = a(viewGroup, i);
                if (a.o.getParent() == null) {
                    a.t = i;
                    return a;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                ha.a();
            }
        }

        public final void b(int i, int i2) {
            this.b.d(i, i2);
        }

        public final void b(c cVar) {
            this.b.unregisterObserver(cVar);
        }

        public void b(VH vh) {
        }

        public void b(RecyclerView recyclerView) {
        }

        public final void c(int i, int i2) {
            this.b.b(i, i2);
        }

        public void c(VH vh) {
        }

        public final void d(int i) {
            this.b.b(i, 1);
        }

        public final void d(int i, int i2) {
            this.b.c(i, i2);
        }

        public final void d_(int i) {
            this.b.a(i, 1);
        }

        public final void e() {
            this.b.b();
        }

        public final void e(int i) {
            this.b.c(i, 1);
        }
    }

    public static class b extends Observable<c> {
        b() {
        }

        public final void a(int i, int i2) {
            a(i, i2, null);
        }

        public final void a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i, i2, obj);
            }
        }

        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a();
            }
        }

        public final void b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).b(i, i2);
            }
        }

        public final void c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).c(i, i2);
            }
        }

        public final void d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i, i2, 1);
            }
        }
    }

    public static abstract class c {
        public void a() {
        }

        public void a(int i, int i2) {
        }

        public void a(int i, int i2, int i3) {
        }

        public void a(int i, int i2, Object obj) {
            a(i, i2);
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2) {
        }
    }

    public interface d {
        int a(int i, int i2);
    }

    public static class e {
        protected static EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class f {
        private ArrayList<Object> a = new ArrayList<>();
        private long b = 120;
        private long c = 120;
        a h = null;
        public long i = 250;
        public long j = 250;

        interface a {
            void a(u uVar);
        }

        public static class b {
            public int a;
            public int b;
            private int c;
            private int d;

            public final b a(u uVar) {
                View view = uVar.o;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        static int e(u uVar) {
            int i2 = uVar.x & 14;
            if (uVar.k()) {
                return 4;
            }
            if ((i2 & 4) == 0) {
                int i3 = uVar.r;
                int e = uVar.e();
                if (!(i3 == -1 || e == -1 || i3 == e)) {
                    i2 |= 2048;
                }
            }
            return i2;
        }

        public abstract void a();

        public abstract boolean a(u uVar, b bVar, b bVar2);

        public abstract boolean a(u uVar, u uVar2, b bVar, b bVar2);

        public boolean a(u uVar, List<Object> list) {
            return g(uVar);
        }

        public abstract boolean b();

        public abstract boolean b(u uVar, b bVar, b bVar2);

        public abstract void c(u uVar);

        public abstract boolean c(u uVar, b bVar, b bVar2);

        public final b d(u uVar) {
            return new b().a(uVar);
        }

        public abstract void d();

        public long e() {
            return this.b;
        }

        public long f() {
            return this.c;
        }

        public final void f(u uVar) {
            a aVar = this.h;
            if (aVar != null) {
                aVar.a(uVar);
            }
        }

        public final void g() {
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.a.get(i2);
            }
            this.a.clear();
        }

        public boolean g(u uVar) {
            return true;
        }
    }

    class g implements a {
        g() {
        }

        public final void a(u uVar) {
            boolean z = true;
            uVar.b(true);
            if (uVar.v != null && uVar.w == null) {
                uVar.v = null;
            }
            uVar.w = null;
            if ((uVar.x & 16) == 0) {
                z = false;
            }
            if (!z && !RecyclerView.this.a(uVar.o) && uVar.o()) {
                RecyclerView.this.removeDetachedView(uVar.o, false);
            }
        }
    }

    public static abstract class h {
        public void a(Canvas canvas, RecyclerView recyclerView) {
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            view.getLayoutParams();
            rect.set(0, 0, 0, 0);
        }

        public void b(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    public static abstract class i {
        private ny a;
        private final defpackage.ou.b b = new defpackage.ou.b() {
            public final int a() {
                return i.this.getPaddingLeft();
            }

            public final int a(View view) {
                return i.this.k(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            public final View a(int i) {
                return i.this.g(i);
            }

            public final int b() {
                return i.this.v - i.this.getPaddingRight();
            }

            public final int b(View view) {
                return i.this.m(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        };
        private final defpackage.ou.b c = new defpackage.ou.b() {
            public final int a() {
                return i.this.getPaddingTop();
            }

            public final int a(View view) {
                return i.this.l(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            public final View a(int i) {
                return i.this.g(i);
            }

            public final int b() {
                return i.this.w - i.this.getPaddingBottom();
            }

            public final int b(View view) {
                return i.this.n(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        };
        public RecyclerView i;
        ou j = new ou(this.b);
        ou k = new ou(this.c);
        r l;
        public boolean m = false;
        boolean n = false;
        protected boolean o = false;
        public boolean p = true;
        public boolean q = true;
        public int r;
        public boolean s;
        public int t;
        public int u;
        public int v;
        public int w;

        public interface a {
            void a(int i, int i2);
        }

        public static class b {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public static int a(int i2, int i3, int i4) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i3, i4));
            }
            if (mode != 1073741824) {
                size = Math.max(i3, i4);
            }
            return size;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002e
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002e
                if (r5 == r3) goto L_0x0021
                goto L_0x002e
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r6 = 1073741824(0x40000000, float:2.0)
                goto L_0x002f
            L_0x001f:
                if (r7 != r1) goto L_0x0024
            L_0x0021:
                r7 = r4
                r6 = r5
                goto L_0x002f
            L_0x0024:
                if (r7 != r0) goto L_0x002e
                if (r5 == r2) goto L_0x002a
                if (r5 != r3) goto L_0x002c
            L_0x002a:
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x002c:
                r7 = r4
                goto L_0x002f
            L_0x002e:
                r7 = 0
            L_0x002f:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i.a(int, int, int, int, boolean):int");
        }

        public static b a(Context context, AttributeSet attributeSet, int i2, int i3) {
            b bVar = new b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.nu.a.a, i2, i3);
            bVar.a = obtainStyledAttributes.getInt(defpackage.nu.a.b, 1);
            bVar.b = obtainStyledAttributes.getInt(defpackage.nu.a.l, 1);
            bVar.c = obtainStyledAttributes.getBoolean(defpackage.nu.a.k, false);
            bVar.d = obtainStyledAttributes.getBoolean(defpackage.nu.a.m, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        private void a(int i2) {
            if (g(i2) != null) {
                this.a.a(i2);
            }
        }

        private void a(int i2, int i3) {
            View g = g(i2);
            if (g != null) {
                b(i2);
                c(g, i3);
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
            sb.append(i2);
            sb.append(this.i.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        public static void a(View view, int i2, int i3, int i4, int i5) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).d;
            view.layout(i2 + rect.left, i3 + rect.top, i4 - rect.right, i5 - rect.bottom);
        }

        private void a(View view, int i2, boolean z) {
            u d = RecyclerView.d(view);
            if (z || d.n()) {
                this.i.h.c(d);
            } else {
                this.i.h.d(d);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (d.h() || d.f()) {
                if (d.f()) {
                    d.g();
                } else {
                    d.i();
                }
                this.a.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.i) {
                int c2 = this.a.c(view);
                if (i2 == -1) {
                    i2 = this.a.a();
                }
                if (c2 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.i.indexOfChild(view));
                    sb.append(this.i.a());
                    throw new IllegalStateException(sb.toString());
                } else if (c2 != i2) {
                    this.i.n.a(c2, i2);
                }
            } else {
                this.a.a(view, i2, false);
                layoutParams.e = true;
                r rVar = this.l;
                if (rVar != null && rVar.f) {
                    this.l.a(view);
                }
            }
            if (layoutParams.f) {
                d.o.invalidate();
                layoutParams.f = false;
            }
        }

        public static void a(View view, Rect rect) {
            RecyclerView.b(view, rect);
        }

        private void a(o oVar, int i2, View view) {
            u d = RecyclerView.d(view);
            if (!d.c()) {
                if (!d.k() || d.n() || this.i.m.c) {
                    b(i2);
                    oVar.c(view);
                    this.i.h.d(d);
                    return;
                }
                a(i2);
                oVar.a(d);
            }
        }

        private void b(int i2) {
            g(i2);
            d(i2);
        }

        public static void b(View view, int i2, int i3, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.d;
            view.layout(i2 + rect.left + layoutParams.leftMargin, i3 + rect.top + layoutParams.topMargin, (i4 - rect.right) - layoutParams.rightMargin, (i5 - rect.bottom) - layoutParams.bottomMargin);
        }

        private static boolean b(int i2, int i3, int i4) {
            int mode = MeasureSpec.getMode(i3);
            int size = MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        public static int c(View view) {
            return ((LayoutParams) view.getLayoutParams()).c.d();
        }

        public static int d(View view) {
            return RecyclerView.d(view).t;
        }

        private void d(int i2) {
            this.a.d(i2);
        }

        public static void h(View view) {
            u d = RecyclerView.d(view);
            d.x &= -129;
            d.s();
            d.b(4);
        }

        public static int j(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static int o(View view) {
            return ((LayoutParams) view.getLayoutParams()).d.top;
        }

        public static int p(View view) {
            return ((LayoutParams) view.getLayoutParams()).d.bottom;
        }

        public static int q(View view) {
            return ((LayoutParams) view.getLayoutParams()).d.left;
        }

        public static int r(View view) {
            return ((LayoutParams) view.getLayoutParams()).d.right;
        }

        public int a(int i2, o oVar, s sVar) {
            return 0;
        }

        public int a(o oVar, s sVar) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null || recyclerView.m == null || !f()) {
                return 1;
            }
            return this.i.m.b();
        }

        public View a(View view, int i2, o oVar, s sVar) {
            return null;
        }

        public abstract LayoutParams a();

        public LayoutParams a(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public LayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public void a(int i2, int i3, s sVar, a aVar) {
        }

        public void a(int i2, a aVar) {
        }

        public final void a(int i2, o oVar) {
            View g = g(i2);
            a(i2);
            oVar.a(g);
        }

        public void a(Rect rect, int i2, int i3) {
            d(a(i2, rect.width() + getPaddingLeft() + getPaddingRight(), ip.l(this.i)), a(i3, rect.height() + getPaddingTop() + getPaddingBottom(), ip.m(this.i)));
        }

        public void a(Parcelable parcelable) {
        }

        public final void a(View view) {
            a(view, -1, false);
        }

        public final void a(View view, int i2) {
            a(view, i2, true);
        }

        public final void a(View view, o oVar) {
            b(view);
            oVar.a(view);
        }

        public final void a(View view, ja jaVar) {
            u d = RecyclerView.d(view);
            if (d != null && !d.n() && !this.a.d(d.o)) {
                a(this.i.e, this.i.E, view, jaVar);
            }
        }

        public final void a(View view, boolean z, Rect rect) {
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).d;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.i != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.i.l;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.i.canScrollVertically(-1) && !this.i.canScrollHorizontally(-1) && !this.i.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.i.m != null) {
                    accessibilityEvent.setItemCount(this.i.m.b());
                }
            }
        }

        public void a(a aVar, a aVar2) {
        }

        public final void a(o oVar) {
            for (int r2 = r() - 1; r2 >= 0; r2--) {
                a(oVar, r2, g(r2));
            }
        }

        public void a(o oVar, s sVar, int i2, int i3) {
            this.i.d(i2, i3);
        }

        public void a(o oVar, s sVar, View view, ja jaVar) {
            jaVar.b((Object) defpackage.ja.c.a(f() ? c(view) : 0, 1, e() ? c(view) : 0, 1, false, false));
        }

        public void a(o oVar, s sVar, ja jaVar) {
            if (this.i.canScrollVertically(-1) || this.i.canScrollHorizontally(-1)) {
                jaVar.a(8192);
                jaVar.j(true);
            }
            if (this.i.canScrollVertically(1) || this.i.canScrollHorizontally(1)) {
                jaVar.a(4096);
                jaVar.j(true);
            }
            jaVar.a((Object) defpackage.ja.b.a(a(oVar, sVar), b(oVar, sVar), false, 0));
        }

        public final void a(r rVar) {
            r rVar2 = this.l;
            if (!(rVar2 == null || rVar == rVar2 || !rVar2.f)) {
                this.l.b();
            }
            this.l = rVar;
            r rVar3 = this.l;
            RecyclerView recyclerView = this.i;
            recyclerView.B.b();
            if (rVar3.h) {
                StringBuilder sb = new StringBuilder("An instance of ");
                sb.append(rVar3.getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(rVar3.getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            rVar3.c = recyclerView;
            rVar3.d = this;
            if (rVar3.b != -1) {
                rVar3.c.E.a = rVar3.b;
                rVar3.f = true;
                rVar3.e = true;
                rVar3.g = rVar3.c.n.c(rVar3.b);
                rVar3.c.B.a();
                rVar3.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public void a(s sVar) {
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c(recyclerView, i2, i3);
        }

        public void a(RecyclerView recyclerView, o oVar) {
        }

        public void a(RecyclerView recyclerView, s sVar, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void a(String str) {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                recyclerView.a(str);
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(View view, int i2, int i3, LayoutParams layoutParams) {
            return !this.p || !b(view.getMeasuredWidth(), i2, layoutParams.width) || !b(view.getMeasuredHeight(), i3, layoutParams.height);
        }

        public boolean a(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.recyclerview.widget.RecyclerView.o r8, androidx.recyclerview.widget.RecyclerView.s r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.i
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x003e
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x006b
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0027
                int r8 = r7.w
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x0028
            L_0x0027:
                r8 = 0
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r11 = r7.i
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.v
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x0066
            L_0x003e:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0051
                int r8 = r7.w
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0052
            L_0x0051:
                r8 = 0
            L_0x0052:
                androidx.recyclerview.widget.RecyclerView r10 = r7.i
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.v
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x0066:
                r3 = r8
                r2 = r10
                goto L_0x006b
            L_0x0069:
                r3 = r8
                r2 = 0
            L_0x006b:
                if (r3 != 0) goto L_0x0070
                if (r2 != 0) goto L_0x0070
                return r9
            L_0x0070:
                androidx.recyclerview.widget.RecyclerView r1 = r7.i
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.a(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i.a(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s, int, android.os.Bundle):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b5, code lost:
            if (r14 == false) goto L_0x00bc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.getPaddingLeft()
                int r2 = r9.getPaddingTop()
                int r3 = r9.v
                int r4 = r9.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r9.w
                int r5 = r9.getPaddingBottom()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                androidx.recyclerview.widget.RecyclerView r4 = r9.i
                int r4 = defpackage.ip.f(r4)
                r8 = 1
                if (r4 != r8) goto L_0x0061
                if (r3 == 0) goto L_0x005c
                goto L_0x0069
            L_0x005c:
                int r3 = java.lang.Math.max(r7, r11)
                goto L_0x0069
            L_0x0061:
                if (r7 == 0) goto L_0x0064
                goto L_0x0068
            L_0x0064:
                int r7 = java.lang.Math.min(r5, r3)
            L_0x0068:
                r3 = r7
            L_0x0069:
                if (r2 == 0) goto L_0x006c
                goto L_0x0070
            L_0x006c:
                int r2 = java.lang.Math.min(r6, r12)
            L_0x0070:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto L_0x00b7
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L_0x0082
            L_0x0080:
                r14 = 0
                goto L_0x00b5
            L_0x0082:
                int r0 = r9.getPaddingLeft()
                int r2 = r9.getPaddingTop()
                int r3 = r9.v
                int r4 = r9.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r9.w
                int r5 = r9.getPaddingBottom()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.i
                android.graphics.Rect r5 = r5.k
                androidx.recyclerview.widget.RecyclerView.b(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto L_0x0080
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto L_0x0080
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto L_0x0080
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto L_0x00b4
                goto L_0x0080
            L_0x00b4:
                r14 = 1
            L_0x00b5:
                if (r14 == 0) goto L_0x00bc
            L_0x00b7:
                if (r11 != 0) goto L_0x00bd
                if (r12 == 0) goto L_0x00bc
                goto L_0x00bd
            L_0x00bc:
                return r1
            L_0x00bd:
                if (r13 == 0) goto L_0x00c3
                r10.scrollBy(r11, r12)
                goto L_0x00c7
            L_0x00c3:
                r13 = 0
                r10.a(r11, r12, r13)
            L_0x00c7:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i.a(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public final boolean a(Runnable runnable) {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public final void a_(View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect h = this.i.h(view);
            int i4 = h.top + h.bottom + 0;
            int a2 = a(this.v, this.t, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + h.left + h.right + 0, layoutParams.width, e());
            int a3 = a(this.w, this.u, getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, f());
            if (b(view, a2, a3, layoutParams)) {
                view.measure(a2, a3);
            }
        }

        public int b(int i2, o oVar, s sVar) {
            return 0;
        }

        public int b(o oVar, s sVar) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null || recyclerView.m == null || !e()) {
                return 1;
            }
            return this.i.m.b();
        }

        public int b(s sVar) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public final void b(int i2, int i3) {
            this.v = MeasureSpec.getSize(i2);
            this.t = MeasureSpec.getMode(i2);
            if (this.t == 0 && !RecyclerView.b) {
                this.v = 0;
            }
            this.w = MeasureSpec.getSize(i3);
            this.u = MeasureSpec.getMode(i3);
            if (this.u == 0 && !RecyclerView.b) {
                this.w = 0;
            }
        }

        public final void b(View view) {
            ny nyVar = this.a;
            int a2 = nyVar.a.a(view);
            if (a2 >= 0) {
                if (nyVar.b.d(a2)) {
                    nyVar.b(view);
                }
                nyVar.a.a(a2);
            }
        }

        public final void b(View view, int i2) {
            a(view, i2, false);
        }

        public final void b(View view, Rect rect) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.h(view));
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(o oVar) {
            int size = oVar.a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = ((u) oVar.a.get(i2)).o;
                u d = RecyclerView.d(view);
                if (!d.c()) {
                    d.b(false);
                    if (d.o()) {
                        this.i.removeDetachedView(view, false);
                    }
                    if (this.i.x != null) {
                        this.i.x.c(d);
                    }
                    d.b(true);
                    oVar.b(view);
                }
            }
            oVar.a.clear();
            if (oVar.b != null) {
                oVar.b.clear();
            }
            if (size > 0) {
                this.i.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.i = null;
                this.a = null;
                this.v = 0;
                this.w = 0;
            } else {
                this.i = recyclerView;
                this.a = recyclerView.g;
                this.v = recyclerView.getWidth();
                this.w = recyclerView.getHeight();
            }
            this.t = 1073741824;
            this.u = 1073741824;
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        /* access modifiers changed from: 0000 */
        public final void b(RecyclerView recyclerView, o oVar) {
            this.n = false;
            a(recyclerView, oVar);
        }

        /* access modifiers changed from: protected */
        public final boolean b(View view, int i2, int i3, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.p || !b(view.getWidth(), i2, layoutParams.width) || !b(view.getHeight(), i3, layoutParams.height);
        }

        public int c(s sVar) {
            return 0;
        }

        public View c(int i2) {
            int r2 = r();
            for (int i3 = 0; i3 < r2; i3++) {
                View g = g(i3);
                u d = RecyclerView.d(g);
                if (d != null && d.d() == i2 && !d.c() && (this.i.E.g || !d.n())) {
                    return g;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final void c(int i2, int i3) {
            int r2 = r();
            if (r2 == 0) {
                this.i.d(i2, i3);
                return;
            }
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < r2; i8++) {
                View g = g(i8);
                Rect rect = this.i.k;
                RecyclerView.b(g, rect);
                if (rect.left < i4) {
                    i4 = rect.left;
                }
                if (rect.right > i6) {
                    i6 = rect.right;
                }
                if (rect.top < i5) {
                    i5 = rect.top;
                }
                if (rect.bottom > i7) {
                    i7 = rect.bottom;
                }
            }
            this.i.k.set(i4, i5, i6, i7);
            a(this.i.k, i2, i3);
        }

        public final void c(View view, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            u d = RecyclerView.d(view);
            if (d.n()) {
                this.i.h.c(d);
            } else {
                this.i.h.d(d);
            }
            this.a.a(view, i2, layoutParams, d.n());
        }

        public final void c(o oVar) {
            for (int r2 = r() - 1; r2 >= 0; r2--) {
                if (!RecyclerView.d(g(r2)).c()) {
                    a(r2, oVar);
                }
            }
        }

        public void c(o oVar, s sVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: 0000 */
        public final void c(RecyclerView recyclerView) {
            this.n = true;
            d(recyclerView);
        }

        public void c(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d(s sVar) {
            return 0;
        }

        public Parcelable d() {
            return null;
        }

        public final void d(int i2, int i3) {
            this.i.setMeasuredDimension(i2, i3);
        }

        public void d(RecyclerView recyclerView) {
        }

        public int e(s sVar) {
            return 0;
        }

        public final View e(View view) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                return null;
            }
            View c2 = recyclerView.c(view);
            if (c2 != null && !this.a.d(c2)) {
                return c2;
            }
            return null;
        }

        public void e(int i2) {
        }

        /* access modifiers changed from: 0000 */
        public final void e(RecyclerView recyclerView) {
            b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public boolean e() {
            return false;
        }

        public int f(s sVar) {
            return 0;
        }

        public final void f(View view) {
            int c2 = this.a.c(view);
            if (c2 >= 0) {
                d(c2);
            }
        }

        public boolean f() {
            return false;
        }

        public int g(s sVar) {
            return 0;
        }

        public final View g(int i2) {
            ny nyVar = this.a;
            if (nyVar != null) {
                return nyVar.b(i2);
            }
            return null;
        }

        public final void g(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.i;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                StringBuilder sb = new StringBuilder("View should be fully attached to be ignored");
                sb.append(this.i.a());
                throw new IllegalArgumentException(sb.toString());
            }
            u d = RecyclerView.d(view);
            d.b(128);
            this.i.h.e(d);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                return ip.j(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                return ip.i(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void h(int i2) {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                int a2 = recyclerView.g.a();
                for (int i3 = 0; i3 < a2; i3++) {
                    recyclerView.g.b(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public final int i(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void i(int i2) {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                int a2 = recyclerView.g.a();
                for (int i3 = 0; i3 < a2; i3++) {
                    recyclerView.g.b(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public void j(int i2) {
        }

        public final int k(View view) {
            return view.getLeft() - q(view);
        }

        public final int l(View view) {
            return view.getTop() - o(view);
        }

        public final int m(View view) {
            return view.getRight() + r(view);
        }

        public final int n(View view) {
            return view.getBottom() + p(view);
        }

        public final boolean o() {
            RecyclerView recyclerView = this.i;
            return recyclerView != null && recyclerView.i;
        }

        public final void o_() {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final boolean p() {
            r rVar = this.l;
            return rVar != null && rVar.f;
        }

        public boolean p_() {
            return this.o;
        }

        public final void q() {
            for (int r2 = r() - 1; r2 >= 0; r2--) {
                this.a.a(r2);
            }
        }

        public boolean q_() {
            return false;
        }

        public final int r() {
            ny nyVar = this.a;
            if (nyVar != null) {
                return nyVar.a();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean r_() {
            return false;
        }

        public final View s() {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                return null;
            }
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.a.d(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public final int t() {
            RecyclerView recyclerView = this.i;
            a c2 = recyclerView != null ? recyclerView.c() : null;
            if (c2 != null) {
                return c2.b();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public final void u() {
            r rVar = this.l;
            if (rVar != null) {
                rVar.b();
            }
        }
    }

    public interface j {
        void a(View view);

        void b(View view);
    }

    public static abstract class k {
        public abstract boolean a(int i, int i2);
    }

    public interface l {
        void a(boolean z);

        boolean a(MotionEvent motionEvent);

        void b(MotionEvent motionEvent);
    }

    public static abstract class m {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class n {
        private SparseArray<a> a = new SparseArray<>();
        private int b = 0;

        static class a {
            final ArrayList<u> a = new ArrayList<>();
            int b = 5;
            long c = 0;
            long d = 0;

            a() {
            }
        }

        static long a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public final u a(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar != null && !aVar.a.isEmpty()) {
                ArrayList<u> arrayList = aVar.a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((u) arrayList.get(size)).p()) {
                        return (u) arrayList.remove(size);
                    }
                }
            }
            return null;
        }

        public final void a() {
            this.b++;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, long j) {
            a b2 = b(i);
            b2.c = a(b2.c, j);
        }

        /* access modifiers changed from: 0000 */
        public final void a(a aVar, a aVar2, boolean z) {
            if (aVar != null) {
                b();
            }
            if (!z && this.b == 0) {
                for (int i = 0; i < this.a.size(); i++) {
                    ((a) this.a.valueAt(i)).a.clear();
                }
            }
            if (aVar2 != null) {
                a();
            }
        }

        public final void a(u uVar) {
            int i = uVar.t;
            ArrayList<u> arrayList = b(i).a;
            if (((a) this.a.get(i)).b > arrayList.size()) {
                uVar.s();
                arrayList.add(uVar);
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(int i, long j, long j2) {
            long j3 = b(i).c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        public a b(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        public final void b() {
            this.b--;
        }
    }

    public final class o {
        final ArrayList<u> a = new ArrayList<>();
        ArrayList<u> b = null;
        final ArrayList<u> c = new ArrayList<>();
        public final List<u> d = Collections.unmodifiableList(this.a);
        public n e;
        private int g = 2;
        private int h = 2;

        public o() {
        }

        private u a(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                u uVar = (u) this.a.get(size);
                if (uVar.s == j && !uVar.h()) {
                    if (i == uVar.t) {
                        uVar.b(32);
                        if (uVar.n() && !RecyclerView.this.E.g) {
                            uVar.a(2, 14);
                        }
                        return uVar;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(uVar.o, false);
                        b(uVar.o);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                u uVar2 = (u) this.c.get(size2);
                if (uVar2.s == j && !uVar2.p()) {
                    if (i == uVar2.t) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return uVar2;
                    } else if (!z) {
                        c(size2);
                        return null;
                    }
                }
            }
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private boolean a(u uVar, int i, int i2, long j) {
            uVar.C = RecyclerView.this;
            int i3 = uVar.t;
            long m = RecyclerView.m();
            if (j != Long.MAX_VALUE) {
                long j2 = this.e.b(i3).d;
                if (!(j2 == 0 || j2 + m < j)) {
                    return false;
                }
            }
            a aVar = RecyclerView.this.m;
            uVar.q = i;
            if (aVar.c) {
                uVar.s = aVar.b(i);
            }
            uVar.a(1, 519);
            ha.a("RV OnBindView");
            uVar.r();
            aVar.a(uVar, i);
            uVar.q();
            android.view.ViewGroup.LayoutParams layoutParams = uVar.o.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).e = true;
            }
            ha.a();
            long m2 = RecyclerView.m() - m;
            a b2 = this.e.b(uVar.t);
            b2.d = n.a(b2.d, m2);
            if (RecyclerView.this.h()) {
                View view = uVar.o;
                if (ip.e(view) == 0) {
                    ip.b(view, 1);
                }
                if (RecyclerView.this.I != null) {
                    defpackage.oo.a aVar2 = RecyclerView.this.I.d;
                    ht b3 = ip.b(view);
                    if (!(b3 == null || b3 == aVar2)) {
                        aVar2.c.put(view, b3);
                    }
                    ip.a(view, (ht) aVar2);
                }
            }
            if (RecyclerView.this.E.g) {
                uVar.u = i2;
            }
            return true;
        }

        private u b(int i, boolean z) {
            View view;
            int size = this.a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                u uVar = (u) this.a.get(i3);
                if (uVar.h() || uVar.d() != i || uVar.k() || (!RecyclerView.this.E.g && uVar.n())) {
                    i3++;
                } else {
                    uVar.b(32);
                    return uVar;
                }
            }
            if (!z) {
                ny nyVar = RecyclerView.this.g;
                int size2 = nyVar.c.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        view = null;
                        break;
                    }
                    view = (View) nyVar.c.get(i4);
                    u b2 = nyVar.a.b(view);
                    if (b2.d() == i && !b2.k() && !b2.n()) {
                        break;
                    }
                    i4++;
                }
                if (view != null) {
                    u d2 = RecyclerView.d(view);
                    ny nyVar2 = RecyclerView.this.g;
                    int a2 = nyVar2.a.a(view);
                    if (a2 < 0) {
                        StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
                        sb.append(view);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (nyVar2.b.c(a2)) {
                        nyVar2.b.b(a2);
                        nyVar2.b(view);
                        int c2 = RecyclerView.this.g.c(view);
                        if (c2 != -1) {
                            RecyclerView.this.g.d(c2);
                            c(view);
                            d2.b(8224);
                            return d2;
                        }
                        StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb2.append(d2);
                        sb2.append(RecyclerView.this.a());
                        throw new IllegalStateException(sb2.toString());
                    } else {
                        StringBuilder sb3 = new StringBuilder("trying to unhide a view that was not hidden");
                        sb3.append(view);
                        throw new RuntimeException(sb3.toString());
                    }
                }
            }
            int size3 = this.c.size();
            while (i2 < size3) {
                u uVar2 = (u) this.c.get(i2);
                if (uVar2.k() || uVar2.d() != i || uVar2.p()) {
                    i2++;
                } else {
                    if (!z) {
                        this.c.remove(i2);
                    }
                    return uVar2;
                }
            }
            return null;
        }

        private boolean c(u uVar) {
            if (uVar.n()) {
                return RecyclerView.this.E.g;
            }
            if (uVar.q < 0 || uVar.q >= RecyclerView.this.m.b()) {
                StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                sb.append(uVar);
                sb.append(RecyclerView.this.a());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (RecyclerView.this.E.g || RecyclerView.this.m.a(uVar.q) == uVar.t) {
                return !RecyclerView.this.m.c || uVar.s == RecyclerView.this.m.b(uVar.q);
            } else {
                return false;
            }
        }

        private u d(int i) {
            ArrayList<u> arrayList = this.b;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        u uVar = (u) this.b.get(i3);
                        if (uVar.h() || uVar.d() != i) {
                            i3++;
                        } else {
                            uVar.b(32);
                            return uVar;
                        }
                    }
                    if (RecyclerView.this.m.c) {
                        int a2 = RecyclerView.this.f.a(i, 0);
                        if (a2 > 0 && a2 < RecyclerView.this.m.b()) {
                            long b2 = RecyclerView.this.m.b(a2);
                            while (i2 < size) {
                                u uVar2 = (u) this.b.get(i2);
                                if (uVar2.h() || uVar2.s != b2) {
                                    i2++;
                                } else {
                                    uVar2.b(32);
                                    return uVar2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        private void d(u uVar) {
            if (uVar.o instanceof ViewGroup) {
                a((ViewGroup) uVar.o, false);
            }
        }

        private void e(u uVar) {
            if (RecyclerView.this.m != null) {
                RecyclerView.this.m.a(uVar);
            }
            RecyclerView.this.h.e(uVar);
        }

        private void g() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                c(size);
            }
            this.c.clear();
            if (RecyclerView.d) {
                RecyclerView.this.D.a();
            }
        }

        public final int a(int i) {
            if (i >= 0 && i < RecyclerView.this.E.a()) {
                return !RecyclerView.this.E.g ? i : RecyclerView.this.f.b(i);
            }
            StringBuilder sb = new StringBuilder("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.E.a());
            sb.append(RecyclerView.this.a());
            throw new IndexOutOfBoundsException(sb.toString());
        }

        public final View a(int i, boolean z) {
            return a(i, false, Long.MAX_VALUE).o;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.u a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01c6
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r1 = r1.E
                int r1 = r1.a()
                if (r3 >= r1) goto L_0x01c6
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r1 = r1.E
                boolean r1 = r1.g
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0025
                androidx.recyclerview.widget.RecyclerView$u r1 = r16.d(r17)
                if (r1 == 0) goto L_0x0026
                r4 = 1
                goto L_0x0027
            L_0x0025:
                r1 = r2
            L_0x0026:
                r4 = 0
            L_0x0027:
                if (r1 != 0) goto L_0x005b
                androidx.recyclerview.widget.RecyclerView$u r1 = r16.b(r17, r18)
                if (r1 == 0) goto L_0x005b
                boolean r5 = r6.c(r1)
                if (r5 != 0) goto L_0x005a
                if (r0 != 0) goto L_0x0058
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.f()
                if (r5 == 0) goto L_0x004c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.o
                r5.removeDetachedView(r9, r8)
                r1.g()
                goto L_0x0055
            L_0x004c:
                boolean r5 = r1.h()
                if (r5 == 0) goto L_0x0055
                r1.i()
            L_0x0055:
                r6.a(r1)
            L_0x0058:
                r1 = r2
                goto L_0x005b
            L_0x005a:
                r4 = 1
            L_0x005b:
                if (r1 != 0) goto L_0x0122
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                nv r5 = r5.f
                int r5 = r5.b(r3)
                if (r5 < 0) goto L_0x00ed
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r9 = r9.m
                int r9 = r9.b()
                if (r5 >= r9) goto L_0x00ed
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r9 = r9.m
                int r9 = r9.a(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r10 = r10.m
                boolean r10 = r10.c
                if (r10 == 0) goto L_0x0092
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r1 = r1.m
                long r10 = r1.b(r5)
                androidx.recyclerview.widget.RecyclerView$u r1 = r6.a(r10, r9, r0)
                if (r1 == 0) goto L_0x0092
                r1.q = r5
                r4 = 1
            L_0x0092:
                if (r1 != 0) goto L_0x00a8
                androidx.recyclerview.widget.RecyclerView$n r0 = r16.c()
                androidx.recyclerview.widget.RecyclerView$u r1 = r0.a(r9)
                if (r1 == 0) goto L_0x00a8
                r1.s()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.a
                if (r0 == 0) goto L_0x00a8
                r6.d(r1)
            L_0x00a8:
                if (r1 != 0) goto L_0x0122
                long r0 = androidx.recyclerview.widget.RecyclerView.m()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00c4
                androidx.recyclerview.widget.RecyclerView$n r10 = r6.e
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.a(r11, r12, r14)
                if (r5 != 0) goto L_0x00c4
                return r2
            L_0x00c4:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r2 = r2.m
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$u r2 = r2.b(r5, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.d
                if (r5 == 0) goto L_0x00e1
                android.view.View r5 = r2.o
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.i(r5)
                if (r5 == 0) goto L_0x00e1
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.p = r10
            L_0x00e1:
                long r10 = androidx.recyclerview.widget.RecyclerView.m()
                androidx.recyclerview.widget.RecyclerView$n r5 = r6.e
                long r10 = r10 - r0
                r5.a(r9, r10)
                r10 = r2
                goto L_0x0123
            L_0x00ed:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r2 = r2.E
                int r2 = r2.a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0122:
                r10 = r1
            L_0x0123:
                r9 = r4
                if (r9 == 0) goto L_0x0154
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r0 = r0.E
                boolean r0 = r0.g
                if (r0 != 0) goto L_0x0154
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.a(r0)
                if (r1 == 0) goto L_0x0154
                r10.a(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r0 = r0.E
                boolean r0 = r0.j
                if (r0 == 0) goto L_0x0154
                androidx.recyclerview.widget.RecyclerView.f.e(r10)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r0 = r0.x
                r10.r()
                androidx.recyclerview.widget.RecyclerView$f$b r0 = r0.d(r10)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.a(r10, r0)
            L_0x0154:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r0 = r0.E
                boolean r0 = r0.g
                if (r0 == 0) goto L_0x0165
                boolean r0 = r10.m()
                if (r0 == 0) goto L_0x0165
                r10.u = r3
                goto L_0x0178
            L_0x0165:
                boolean r0 = r10.m()
                if (r0 == 0) goto L_0x017a
                boolean r0 = r10.l()
                if (r0 != 0) goto L_0x017a
                boolean r0 = r10.k()
                if (r0 == 0) goto L_0x0178
                goto L_0x017a
            L_0x0178:
                r0 = 0
                goto L_0x018d
            L_0x017a:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                nv r0 = r0.f
                int r2 = r0.b(r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.a(r1, r2, r3, r4)
            L_0x018d:
                android.view.View r1 = r10.o
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01a3
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.o
                r2.setLayoutParams(r1)
                goto L_0x01bb
            L_0x01a3:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01b9
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.o
                r2.setLayoutParams(r1)
                goto L_0x01bb
            L_0x01b9:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x01bb:
                r1.c = r10
                if (r9 == 0) goto L_0x01c2
                if (r0 == 0) goto L_0x01c2
                goto L_0x01c3
            L_0x01c2:
                r7 = 0
            L_0x01c3:
                r1.f = r7
                return r10
            L_0x01c6:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid item position "
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r2 = r2.E
                int r2 = r2.a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$u");
        }

        public final void a() {
            this.a.clear();
            g();
        }

        public final void a(View view) {
            u d2 = RecyclerView.d(view);
            if (d2.o()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d2.f()) {
                d2.g();
            } else if (d2.h()) {
                d2.i();
            }
            a(d2);
            if (RecyclerView.this.x != null && !d2.t()) {
                RecyclerView.this.x.c(d2);
            }
        }

        public final void a(View view, int i) {
            LayoutParams layoutParams;
            u d2 = RecyclerView.d(view);
            if (d2 != null) {
                int b2 = RecyclerView.this.f.b(i);
                if (b2 < 0 || b2 >= RecyclerView.this.m.b()) {
                    StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid item position ");
                    sb.append(i);
                    sb.append("(offset:");
                    sb.append(b2);
                    sb.append(").state:");
                    sb.append(RecyclerView.this.E.a());
                    sb.append(RecyclerView.this.a());
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                a(d2, b2, i, Long.MAX_VALUE);
                android.view.ViewGroup.LayoutParams layoutParams2 = d2.o.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                    d2.o.setLayoutParams(layoutParams);
                } else if (!RecyclerView.this.checkLayoutParams(layoutParams2)) {
                    layoutParams = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams2);
                    d2.o.setLayoutParams(layoutParams);
                } else {
                    layoutParams = (LayoutParams) layoutParams2;
                }
                boolean z = true;
                layoutParams.e = true;
                layoutParams.c = d2;
                if (d2.o.getParent() != null) {
                    z = false;
                }
                layoutParams.f = z;
                return;
            }
            StringBuilder sb2 = new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
            sb2.append(RecyclerView.this.a());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* access modifiers changed from: 0000 */
        public final void a(a aVar, a aVar2, boolean z) {
            a();
            c().a(aVar, aVar2, z);
        }

        /* access modifiers changed from: 0000 */
        public final void a(u uVar) {
            boolean z;
            boolean z2 = false;
            if (uVar.f() || uVar.o.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(uVar.f());
                sb.append(" isAttached:");
                if (uVar.o.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.a());
                throw new IllegalArgumentException(sb.toString());
            } else if (uVar.o()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(uVar);
                sb2.append(RecyclerView.this.a());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!uVar.c()) {
                boolean u = uVar.u();
                if (uVar.t()) {
                    if (this.h <= 0 || uVar.a(526)) {
                        z = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.h && size > 0) {
                            c(0);
                            size--;
                        }
                        if (RecyclerView.d && size > 0 && !RecyclerView.this.D.a(uVar.q)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.D.a(((u) this.c.get(i)).q)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.c.add(size, uVar);
                        z = true;
                    }
                    if (!z) {
                        a(uVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.h.e(uVar);
                if (!z && !z2 && u) {
                    uVar.C = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.a());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        public final void a(u uVar, boolean z) {
            RecyclerView.b(uVar);
            View view = uVar.o;
            if (RecyclerView.this.I != null) {
                ip.a(view, RecyclerView.this.I.d.c(view));
            }
            if (z) {
                e(uVar);
            }
            uVar.C = null;
            c().a(uVar);
        }

        public final View b(int i) {
            return a(i, false);
        }

        public final void b() {
            this.h = this.g + (RecyclerView.this.n != null ? RecyclerView.this.n.r : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.h; size--) {
                c(size);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(View view) {
            u d2 = RecyclerView.d(view);
            d2.y = null;
            d2.z = false;
            d2.i();
            a(d2);
        }

        /* access modifiers changed from: 0000 */
        public final void b(u uVar) {
            if (uVar.z) {
                this.b.remove(uVar);
            } else {
                this.a.remove(uVar);
            }
            uVar.y = null;
            uVar.z = false;
            uVar.i();
        }

        public final n c() {
            if (this.e == null) {
                this.e = new n();
            }
            return this.e;
        }

        /* access modifiers changed from: 0000 */
        public final void c(int i) {
            a((u) this.c.get(i), true);
            this.c.remove(i);
        }

        /* access modifiers changed from: 0000 */
        public final void c(View view) {
            u d2 = RecyclerView.d(view);
            if (!d2.a(12) && d2.v() && !RecyclerView.this.a(d2)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                d2.a(this, true);
                this.b.add(d2);
            } else if (!d2.k() || d2.n() || RecyclerView.this.m.c) {
                d2.a(this, false);
                this.a.add(d2);
            } else {
                StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.a());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                u uVar = (u) this.c.get(i);
                if (uVar != null) {
                    uVar.b(6);
                    uVar.a((Object) null);
                }
            }
            if (RecyclerView.this.m == null || !RecyclerView.this.m.c) {
                g();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void e() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((u) this.c.get(i)).a();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((u) this.a.get(i2)).a();
            }
            ArrayList<u> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((u) this.b.get(i3)).a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void f() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) ((u) this.c.get(i)).o.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.e = true;
                }
            }
        }
    }

    class p extends c {
        p() {
        }

        private void b() {
            if (!RecyclerView.c || !RecyclerView.this.q || !RecyclerView.this.p) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.u = true;
                recyclerView.requestLayout();
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            ip.a((View) recyclerView2, recyclerView2.j);
        }

        public final void a() {
            RecyclerView.this.a((String) null);
            RecyclerView.this.E.f = true;
            RecyclerView.this.b(true);
            if (!RecyclerView.this.f.d()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r7.a.size() == 1) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r5, int r6, int r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                r0 = 0
                r7.a(r0)
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                nv r7 = r7.f
                r1 = 1
                if (r5 == r6) goto L_0x0026
                java.util.ArrayList<nv$b> r2 = r7.a
                r3 = 8
                nv$b r5 = r7.a(r3, r5, r6, r0)
                r2.add(r5)
                int r5 = r7.b
                r5 = r5 | r3
                r7.b = r5
                java.util.ArrayList<nv$b> r5 = r7.a
                int r5 = r5.size()
                if (r5 != r1) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r1 = 0
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r4.b()
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.a(int, int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r0.a.size() == 1) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.a(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                nv r0 = r0.f
                r1 = 1
                if (r6 > 0) goto L_0x000e
                goto L_0x0026
            L_0x000e:
                java.util.ArrayList<nv$b> r2 = r0.a
                r3 = 4
                nv$b r5 = r0.a(r3, r5, r6, r7)
                r2.add(r5)
                int r5 = r0.b
                r5 = r5 | r3
                r0.b = r5
                java.util.ArrayList<nv$b> r5 = r0.a
                int r5 = r5.size()
                if (r5 != r1) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r1 = 0
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r4.b()
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.a(int, int, java.lang.Object):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
            if (r0.a.size() == 1) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.a(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                nv r0 = r0.f
                r2 = 1
                if (r6 > 0) goto L_0x000e
                goto L_0x0025
            L_0x000e:
                java.util.ArrayList<nv$b> r3 = r0.a
                nv$b r5 = r0.a(r2, r5, r6, r1)
                r3.add(r5)
                int r5 = r0.b
                r5 = r5 | r2
                r0.b = r5
                java.util.ArrayList<nv$b> r5 = r0.a
                int r5 = r5.size()
                if (r5 != r2) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                if (r2 == 0) goto L_0x002b
                r4.b()
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.b(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r0.a.size() == 1) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.a(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                nv r0 = r0.f
                r2 = 1
                if (r7 > 0) goto L_0x000e
                goto L_0x0026
            L_0x000e:
                java.util.ArrayList<nv$b> r3 = r0.a
                r4 = 2
                nv$b r6 = r0.a(r4, r6, r7, r1)
                r3.add(r6)
                int r6 = r0.b
                r6 = r6 | r4
                r0.b = r6
                java.util.ArrayList<nv$b> r6 = r0.a
                int r6 = r6.size()
                if (r6 != r2) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x002c
                r5.b()
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.c(int, int):void");
        }
    }

    public static class q extends jt {
        public static final Creator<q> CREATOR = new ClassLoaderCreator<q>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new q(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new q(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new q[i];
            }
        };
        Parcelable a;

        q(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = i.class.getClassLoader();
            }
            this.a = parcel.readParcelable(classLoader);
        }

        q(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }
    }

    public static abstract class r {
        private final a a = new a(0, 0);
        public int b = -1;
        protected RecyclerView c;
        protected i d;
        boolean e;
        boolean f;
        View g;
        boolean h;

        public static class a {
            public int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public a(int i, int i2) {
                this(0, 0, Integer.MIN_VALUE, null);
            }

            private a(int i, int i2, int i3, Interpolator interpolator) {
                this.a = -1;
                this.f = false;
                this.g = 0;
                this.b = i;
                this.c = i2;
                this.d = Integer.MIN_VALUE;
                this.e = null;
            }

            private void a() {
                if (this.e != null && this.d <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.d <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public final void a(int i, int i2, int i3, Interpolator interpolator) {
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.e = interpolator;
                this.f = true;
            }

            /* access modifiers changed from: 0000 */
            public final void a(RecyclerView recyclerView) {
                int i = this.a;
                if (i >= 0) {
                    this.a = -1;
                    recyclerView.e(i);
                    this.f = false;
                } else if (this.f) {
                    a();
                    recyclerView.B.a(this.b, this.c, this.d, this.e);
                    this.g++;
                    if (this.g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }
        }

        public interface b {
            PointF d(int i);
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: 0000 */
        public final void a(int i, int i2) {
            RecyclerView recyclerView = this.c;
            if (this.b == -1 || recyclerView == null) {
                b();
            }
            if (this.e && this.g == null && this.d != null) {
                PointF c2 = c(this.b);
                if (!(c2 == null || (c2.x == 0.0f && c2.y == 0.0f))) {
                    recyclerView.a((int) Math.signum(c2.x), (int) Math.signum(c2.y), (int[]) null);
                }
            }
            boolean z = false;
            this.e = false;
            View view = this.g;
            if (view != null) {
                if (RecyclerView.f(view) == this.b) {
                    a(this.g, this.a);
                    this.a.a(recyclerView);
                    b();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.g = null;
                }
            }
            if (this.f) {
                a(i, i2, this.a);
                if (this.a.a >= 0) {
                    z = true;
                }
                this.a.a(recyclerView);
                if (z && this.f) {
                    this.e = true;
                    recyclerView.B.a();
                }
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(int i, int i2, a aVar);

        /* access modifiers changed from: protected */
        public final void a(View view) {
            if (RecyclerView.f(view) == this.b) {
                this.g = view;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(View view, a aVar);

        /* access modifiers changed from: protected */
        public final void b() {
            if (this.f) {
                this.f = false;
                a();
                this.c.E.a = -1;
                this.g = null;
                this.b = -1;
                this.e = false;
                i iVar = this.d;
                if (iVar.l == this) {
                    iVar.l = null;
                }
                this.d = null;
                this.c = null;
            }
        }

        public PointF c(int i) {
            i iVar = this.d;
            if (iVar instanceof b) {
                return ((b) iVar).d(i);
            }
            new StringBuilder("You should override computeScrollVectorForPosition when the LayoutManager does not implement ").append(b.class.getCanonicalName());
            return null;
        }
    }

    public static class s {
        int a = -1;
        int b = 0;
        int c = 0;
        public int d = 1;
        public int e = 0;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        boolean j = false;
        boolean k = false;
        int l;
        long m;
        int n;
        int o;
        public int p;

        public final int a() {
            return this.g ? this.b - this.c : this.e;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2) {
            if ((this.d & i2) == 0) {
                StringBuilder sb = new StringBuilder("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i2));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.d));
                throw new IllegalStateException(sb.toString());
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=");
            sb.append(null);
            sb.append(", mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.k);
            sb.append('}');
            return sb.toString();
        }
    }

    class t implements Runnable {
        int a;
        int b;
        OverScroller c;
        Interpolator d = RecyclerView.K;
        private boolean f = false;
        private boolean g = false;

        t() {
            this.c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.K);
        }

        private static float a(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i6;
            float a2 = f3 + (a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a2 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            ip.a((View) RecyclerView.this, (Runnable) this);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.f) {
                this.g = true;
            } else {
                c();
            }
        }

        public final void a(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.K;
            }
            if (this.d != interpolator) {
                this.d = interpolator;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.b = 0;
            this.a = 0;
            RecyclerView.this.c(2);
            this.c.startScroll(0, 0, i, i2, i4);
            if (VERSION.SDK_INT < 23) {
                this.c.computeScrollOffset();
            }
            a();
        }

        public final void b() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
        }

        public final void run() {
            int i;
            int i2;
            if (RecyclerView.this.n == null) {
                b();
                return;
            }
            this.g = false;
            this.f = true;
            RecyclerView.this.e();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.a;
                int i4 = currY - this.b;
                this.a = currX;
                this.b = currY;
                RecyclerView.this.J[0] = 0;
                RecyclerView.this.J[1] = 0;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.a(i3, i4, recyclerView.J, (int[]) null, 1)) {
                    i3 -= RecyclerView.this.J[0];
                    i4 -= RecyclerView.this.J[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.b(i3, i4);
                }
                if (RecyclerView.this.m != null) {
                    RecyclerView.this.J[0] = 0;
                    RecyclerView.this.J[1] = 0;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.a(i3, i4, recyclerView2.J);
                    i2 = RecyclerView.this.J[0];
                    i = RecyclerView.this.J[1];
                    i3 -= i2;
                    i4 -= i;
                    r rVar = RecyclerView.this.n.l;
                    if (rVar != null && !rVar.e && rVar.f) {
                        int a2 = RecyclerView.this.E.a();
                        if (a2 == 0) {
                            rVar.b();
                        } else {
                            if (rVar.b >= a2) {
                                rVar.b = a2 - 1;
                            }
                            rVar.a(i2, i);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView.this.J[0] = 0;
                RecyclerView.this.J[1] = 0;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.a(i2, i, i3, i4, null, 1, recyclerView3.J);
                int i5 = i3 - RecyclerView.this.J[0];
                int i6 = i4 - RecyclerView.this.J[1];
                if (!(i2 == 0 && i == 0)) {
                    RecyclerView.this.f(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                r rVar2 = RecyclerView.this.n.l;
                if ((rVar2 != null && rVar2.e) || !z) {
                    a();
                    if (RecyclerView.this.C != null) {
                        RecyclerView.this.C.a(RecyclerView.this, i5, i6);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.c(i7, currVelocity);
                    }
                    if (RecyclerView.d) {
                        RecyclerView.this.D.a();
                    }
                }
            }
            r rVar3 = RecyclerView.this.n.l;
            if (rVar3 != null && rVar3.e) {
                rVar3.a(0, 0);
            }
            this.f = false;
            if (this.g) {
                c();
                return;
            }
            RecyclerView.this.c(0);
            RecyclerView.this.a(1);
        }
    }

    public static abstract class u {
        private static final List<Object> a = Collections.emptyList();
        int A = 0;
        int B = -1;
        RecyclerView C;
        private List<Object> b = null;
        private List<Object> c = null;
        private int d = 0;
        public final View o;
        public WeakReference<RecyclerView> p;
        public int q = -1;
        int r = -1;
        public long s = -1;
        public int t = -1;
        int u = -1;
        u v = null;
        u w = null;
        int x;
        o y = null;
        boolean z = false;

        public u(View view) {
            if (view != null) {
                this.o = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void w() {
            if (this.b == null) {
                this.b = new ArrayList();
                this.c = Collections.unmodifiableList(this.b);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.r = -1;
            this.u = -1;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, int i2) {
            this.x = (i & i2) | (this.x & (i2 ^ -1));
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, boolean z2) {
            if (this.r == -1) {
                this.r = this.q;
            }
            if (this.u == -1) {
                this.u = this.q;
            }
            if (z2) {
                this.u += i;
            }
            this.q += i;
            if (this.o.getLayoutParams() != null) {
                ((LayoutParams) this.o.getLayoutParams()).e = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(o oVar, boolean z2) {
            this.y = oVar;
            this.z = z2;
        }

        /* access modifiers changed from: 0000 */
        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
                return;
            }
            if ((1024 & this.x) == 0) {
                w();
                this.b.add(obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(int i) {
            return (i & this.x) != 0;
        }

        /* access modifiers changed from: 0000 */
        public final void aB_() {
            if (this.r == -1) {
                this.r = this.q;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(int i) {
            this.x = i | this.x;
        }

        public final void b(boolean z2) {
            int i = this.d;
            this.d = z2 ? i - 1 : i + 1;
            int i2 = this.d;
            if (i2 < 0) {
                this.d = 0;
                StringBuilder sb = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            } else if (z2 || i2 != 1) {
                if (z2 && this.d == 0) {
                    this.x &= -17;
                }
            } else {
                this.x |= 16;
            }
        }

        public final boolean c() {
            return (this.x & 128) != 0;
        }

        public final int d() {
            int i = this.u;
            return i == -1 ? this.q : i;
        }

        public final int e() {
            RecyclerView recyclerView = this.C;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c(this);
        }

        /* access modifiers changed from: 0000 */
        public final boolean f() {
            return this.y != null;
        }

        /* access modifiers changed from: 0000 */
        public final void g() {
            this.y.b(this);
        }

        /* access modifiers changed from: 0000 */
        public final boolean h() {
            return (this.x & 32) != 0;
        }

        /* access modifiers changed from: 0000 */
        public final void i() {
            this.x &= -33;
        }

        /* access modifiers changed from: 0000 */
        public final void j() {
            this.x &= -257;
        }

        public final boolean k() {
            return (this.x & 4) != 0;
        }

        /* access modifiers changed from: 0000 */
        public final boolean l() {
            return (this.x & 2) != 0;
        }

        public final boolean m() {
            return (this.x & 1) != 0;
        }

        public final boolean n() {
            return (this.x & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        public final boolean o() {
            return (this.x & 256) != 0;
        }

        /* access modifiers changed from: 0000 */
        public final boolean p() {
            return (this.o.getParent() == null || this.o.getParent() == this.C) ? false : true;
        }

        /* access modifiers changed from: 0000 */
        public final void q() {
            List<Object> list = this.b;
            if (list != null) {
                list.clear();
            }
            this.x &= -1025;
        }

        /* access modifiers changed from: 0000 */
        public final List<Object> r() {
            if ((this.x & 1024) != 0) {
                return a;
            }
            List<Object> list = this.b;
            return (list == null || list.size() == 0) ? a : this.c;
        }

        /* access modifiers changed from: 0000 */
        public final void s() {
            this.x = 0;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.u = -1;
            this.d = 0;
            this.v = null;
            this.w = null;
            q();
            this.A = 0;
            this.B = -1;
            RecyclerView.b(this);
        }

        public final boolean t() {
            return (this.x & 16) == 0 && !ip.c(this.o);
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.q);
            sb.append(" id=");
            sb.append(this.s);
            sb.append(", oldPos=");
            sb.append(this.r);
            sb.append(", pLpos:");
            sb.append(this.u);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (f()) {
                sb2.append(" scrap ");
                sb2.append(this.z ? "[changeScrap]" : "[attachedScrap]");
            }
            if (k()) {
                sb2.append(" invalid");
            }
            if (!m()) {
                sb2.append(" unbound");
            }
            if (l()) {
                sb2.append(" update");
            }
            if (n()) {
                sb2.append(" removed");
            }
            if (c()) {
                sb2.append(" ignored");
            }
            if (o()) {
                sb2.append(" tmpDetached");
            }
            if (!t()) {
                StringBuilder sb3 = new StringBuilder(" not recyclable(");
                sb3.append(this.d);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if ((this.x & 512) != 0 || k()) {
                sb2.append(" undefined adapter position");
            }
            if (this.o.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        public final boolean u() {
            return (this.x & 16) == 0 && ip.c(this.o);
        }

        /* access modifiers changed from: 0000 */
        public final boolean v() {
            return (this.x & 2) != 0;
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r13v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r13v1, types: [boolean]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [boolean, ?[int, short, byte, char]]
      mth insns count: 305
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            java.lang.String r14 = ": Could not instantiate the LayoutManager: "
            r20.<init>(r21, r22, r23)
            androidx.recyclerview.widget.RecyclerView$p r0 = new androidx.recyclerview.widget.RecyclerView$p
            r0.<init>()
            r10.P = r0
            androidx.recyclerview.widget.RecyclerView$o r0 = new androidx.recyclerview.widget.RecyclerView$o
            r0.<init>()
            r10.e = r0
            ov r0 = new ov
            r0.<init>()
            r10.h = r0
            androidx.recyclerview.widget.RecyclerView$1 r0 = new androidx.recyclerview.widget.RecyclerView$1
            r0.<init>()
            r10.j = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.k = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.R = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.S = r0
            r15 = 0
            r10.V = r15
            r10.w = r15
            r10.ac = r15
            r10.ad = r15
            r10.ae = r15
            androidx.recyclerview.widget.RecyclerView$e r0 = new androidx.recyclerview.widget.RecyclerView$e
            r0.<init>()
            r10.af = r0
            nz r0 = new nz
            r0.<init>()
            r10.x = r0
            r10.y = r15
            r0 = -1
            r10.ak = r0
            r1 = 1
            r10.as = r1
            r10.at = r1
            r9 = 1
            r10.au = r9
            androidx.recyclerview.widget.RecyclerView$t r1 = new androidx.recyclerview.widget.RecyclerView$t
            r1.<init>()
            r10.B = r1
            boolean r1 = d
            r16 = 0
            if (r1 == 0) goto L_0x0085
            od$a r1 = new od$a
            r1.<init>()
            goto L_0x0087
        L_0x0085:
            r1 = r16
        L_0x0087:
            r10.D = r1
            androidx.recyclerview.widget.RecyclerView$s r1 = new androidx.recyclerview.widget.RecyclerView$s
            r1.<init>()
            r10.E = r1
            r10.F = r15
            r10.G = r15
            androidx.recyclerview.widget.RecyclerView$g r1 = new androidx.recyclerview.widget.RecyclerView$g
            r1.<init>()
            r10.aw = r1
            r10.H = r15
            r8 = 2
            int[] r1 = new int[r8]
            r10.ay = r1
            int[] r1 = new int[r8]
            r10.aA = r1
            int[] r1 = new int[r8]
            r10.aB = r1
            int[] r1 = new int[r8]
            r10.J = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.aC = r1
            androidx.recyclerview.widget.RecyclerView$2 r1 = new androidx.recyclerview.widget.RecyclerView$2
            r1.<init>()
            r10.aD = r1
            androidx.recyclerview.widget.RecyclerView$4 r1 = new androidx.recyclerview.widget.RecyclerView$4
            r1.<init>()
            r10.aE = r1
            r10.setScrollContainer(r9)
            r10.setFocusableInTouchMode(r9)
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r21)
            int r2 = r1.getScaledTouchSlop()
            r10.aq = r2
            float r2 = defpackage.iq.a(r1, r11)
            r10.as = r2
            float r2 = defpackage.iq.b(r1, r11)
            r10.at = r2
            int r2 = r1.getScaledMinimumFlingVelocity()
            r10.A = r2
            int r1 = r1.getScaledMaximumFlingVelocity()
            r10.ar = r1
            int r1 = r20.getOverScrollMode()
            if (r1 != r8) goto L_0x00f3
            r1 = 1
            goto L_0x00f4
        L_0x00f3:
            r1 = 0
        L_0x00f4:
            r10.setWillNotDraw(r1)
            androidx.recyclerview.widget.RecyclerView$f r1 = r10.x
            androidx.recyclerview.widget.RecyclerView$f$a r2 = r10.aw
            r1.h = r2
            nv r1 = new nv
            androidx.recyclerview.widget.RecyclerView$6 r2 = new androidx.recyclerview.widget.RecyclerView$6
            r2.<init>()
            r1.<init>(r2)
            r10.f = r1
            ny r1 = new ny
            androidx.recyclerview.widget.RecyclerView$5 r2 = new androidx.recyclerview.widget.RecyclerView$5
            r2.<init>()
            r1.<init>(r2)
            r10.g = r1
            int r1 = defpackage.ip.a(r20)
            if (r1 != 0) goto L_0x0120
            r1 = 8
            defpackage.ip.a(r10, r1)
        L_0x0120:
            int r1 = defpackage.ip.e(r20)
            if (r1 != 0) goto L_0x0129
            defpackage.ip.b(r10, r9)
        L_0x0129:
            android.content.Context r1 = r20.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.ab = r1
            oo r1 = new oo
            r1.<init>(r10)
            r10.I = r1
            oo r1 = r10.I
            defpackage.ip.a(r10, r1)
            int[] r1 = defpackage.nu.a.a
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r12, r1, r13, r15)
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r1 < r6) goto L_0x0163
            int[] r3 = defpackage.nu.a.a
            r17 = 0
            r1 = r20
            r2 = r21
            r4 = r22
            r5 = r7
            r6 = r23
            r15 = r7
            r7 = r17
            r1.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7)
            goto L_0x0164
        L_0x0163:
            r15 = r7
        L_0x0164:
            int r1 = defpackage.nu.a.j
            java.lang.String r17 = r15.getString(r1)
            int r1 = defpackage.nu.a.d
            int r1 = r15.getInt(r1, r0)
            if (r1 != r0) goto L_0x0177
            r0 = 262144(0x40000, float:3.67342E-40)
            r10.setDescendantFocusability(r0)
        L_0x0177:
            int r0 = defpackage.nu.a.c
            boolean r0 = r15.getBoolean(r0, r9)
            r10.i = r0
            int r0 = defpackage.nu.a.e
            r1 = 0
            boolean r0 = r15.getBoolean(r0, r1)
            r10.U = r0
            boolean r0 = r10.U
            if (r0 == 0) goto L_0x01f5
            int r0 = defpackage.nu.a.h
            android.graphics.drawable.Drawable r0 = r15.getDrawable(r0)
            r3 = r0
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            int r0 = defpackage.nu.a.i
            android.graphics.drawable.Drawable r4 = r15.getDrawable(r0)
            int r0 = defpackage.nu.a.f
            android.graphics.drawable.Drawable r0 = r15.getDrawable(r0)
            r5 = r0
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            int r0 = defpackage.nu.a.g
            android.graphics.drawable.Drawable r6 = r15.getDrawable(r0)
            if (r3 == 0) goto L_0x01dd
            if (r4 == 0) goto L_0x01dd
            if (r5 == 0) goto L_0x01dd
            if (r6 == 0) goto L_0x01dd
            android.content.Context r0 = r20.getContext()
            android.content.res.Resources r0 = r0.getResources()
            oc r1 = new oc
            r2 = 2131165688(0x7f0701f8, float:1.79456E38)
            int r7 = r0.getDimensionPixelSize(r2)
            r2 = 2131165690(0x7f0701fa, float:1.7945604E38)
            int r18 = r0.getDimensionPixelSize(r2)
            r2 = 2131165689(0x7f0701f9, float:1.7945602E38)
            int r0 = r0.getDimensionPixelOffset(r2)
            r2 = r20
            r19 = 2
            r8 = r18
            r13 = 1
            r9 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x01f8
        L_0x01dd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r2 = r20.a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01f5:
            r13 = 1
            r19 = 2
        L_0x01f8:
            r15.recycle()
            if (r17 == 0) goto L_0x0357
            java.lang.String r0 = r17.trim()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0357
            r1 = 0
            char r2 = r0.charAt(r1)
            r1 = 46
            if (r2 != r1) goto L_0x0225
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r21.getPackageName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0223:
            r1 = r0
            goto L_0x024b
        L_0x0225:
            java.lang.String r2 = "."
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x022e
            goto L_0x0223
        L_0x022e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r3 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r3 = r3.getPackage()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0223
        L_0x024b:
            boolean r0 = r20.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            if (r0 == 0) goto L_0x025a
            java.lang.Class r0 = r20.getClass()     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            goto L_0x025e
        L_0x025a:
            java.lang.ClassLoader r0 = r21.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
        L_0x025e:
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.Class<androidx.recyclerview.widget.RecyclerView$i> r2 = androidx.recyclerview.widget.RecyclerView.i.class
            java.lang.Class r2 = r0.asSubclass(r2)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.Class<?>[] r0 = O     // Catch:{ NoSuchMethodException -> 0x0285 }
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0285 }
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0285 }
            r4 = 0
            r3[r4] = r11     // Catch:{ NoSuchMethodException -> 0x0285 }
            r3[r13] = r12     // Catch:{ NoSuchMethodException -> 0x0285 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)     // Catch:{ NoSuchMethodException -> 0x0285 }
            r3[r19] = r5     // Catch:{ NoSuchMethodException -> 0x0285 }
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ NoSuchMethodException -> 0x0285 }
            r3[r5] = r6     // Catch:{ NoSuchMethodException -> 0x0285 }
            goto L_0x0290
        L_0x0285:
            r0 = move-exception
            r3 = r0
            r4 = 0
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x029e }
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x029e }
            r3 = r16
        L_0x0290:
            r0.setAccessible(r13)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            androidx.recyclerview.widget.RecyclerView$i r0 = (androidx.recyclerview.widget.RecyclerView.i) r0     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            r10.a(r0)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            goto L_0x0357
        L_0x029e:
            r0 = move-exception
            r0.initCause(r3)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            r3.<init>()     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.String r4 = r22.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.String r4 = ": Error creating LayoutManager "
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            r3.append(r1)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            r2.<init>(r3, r0)     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0338, InvocationTargetException -> 0x031b, InstantiationException -> 0x02fe, IllegalAccessException -> 0x02df, ClassCastException -> 0x02c0 }
        L_0x02c0:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r22.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x02df:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r22.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x02fe:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r22.getPositionDescription()
            r3.append(r4)
            r3.append(r14)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x031b:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r22.getPositionDescription()
            r3.append(r4)
            r3.append(r14)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x0338:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r22.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x0357:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0384
            int[] r0 = L
            r6 = r23
            r1 = 0
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r6, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L_0x037b
            int[] r3 = L
            r7 = 0
            r1 = r20
            r2 = r21
            r4 = r22
            r5 = r0
            r6 = r23
            r1.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7)
        L_0x037b:
            r1 = 0
            boolean r9 = r0.getBoolean(r1, r13)
            r0.recycle()
            r13 = r9
        L_0x0384:
            r10.setNestedScrollingEnabled(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A() {
        String str = "RecyclerView";
        if (this.m == null) {
            Log.e(str, "No adapter attached; skipping layout");
        } else if (this.n == null) {
            Log.e(str, "No layout manager attached; skipping layout");
        } else {
            s sVar = this.E;
            sVar.i = false;
            if (sVar.d == 1) {
                E();
                this.n.e(this);
                F();
            } else if (!this.f.f() && this.n.v == getWidth() && this.n.w == getHeight()) {
                this.n.e(this);
            } else {
                this.n.e(this);
                F();
            }
            G();
        }
    }

    private void B() {
        u uVar = null;
        View focusedChild = (!this.au || !hasFocus() || this.m == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            View c2 = c(focusedChild);
            if (c2 != null) {
                uVar = b(c2);
            }
        }
        if (uVar == null) {
            C();
            return;
        }
        this.E.m = this.m.c ? uVar.s : -1;
        s sVar = this.E;
        int i2 = this.w ? -1 : uVar.n() ? uVar.r : uVar.e();
        sVar.l = i2;
        s sVar2 = this.E;
        View view = uVar.o;
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        sVar2.n = id;
    }

    private void C() {
        s sVar = this.E;
        sVar.m = -1;
        sVar.l = -1;
        sVar.n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ec, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0126, code lost:
        if (r0.isFocusable() != false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void D() {
        /*
            r13 = this;
            boolean r0 = r13.au
            if (r0 == 0) goto L_0x012d
            androidx.recyclerview.widget.RecyclerView$a r0 = r13.m
            if (r0 == 0) goto L_0x012d
            boolean r0 = r13.hasFocus()
            if (r0 == 0) goto L_0x012d
            int r0 = r13.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x012d
            int r0 = r13.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r13.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x012d
        L_0x0026:
            boolean r0 = r13.isFocused()
            if (r0 != 0) goto L_0x0055
            android.view.View r0 = r13.getFocusedChild()
            boolean r1 = N
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            ny r0 = r13.g
            int r0 = r0.a()
            if (r0 != 0) goto L_0x0055
            r13.requestFocus()
            return
        L_0x004c:
            ny r1 = r13.g
            boolean r0 = r1.d(r0)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView$s r0 = r13.E
            long r0 = r0.m
            r2 = 0
            r3 = -1
            r5 = 0
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00a7
            androidx.recyclerview.widget.RecyclerView$a r0 = r13.m
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x00a7
            androidx.recyclerview.widget.RecyclerView$s r0 = r13.E
            long r0 = r0.m
            androidx.recyclerview.widget.RecyclerView$a r6 = r13.m
            if (r6 == 0) goto L_0x00a7
            boolean r6 = r6.c
            if (r6 != 0) goto L_0x0074
            goto L_0x00a7
        L_0x0074:
            ny r6 = r13.g
            int r6 = r6.b()
            r8 = r5
            r7 = 0
        L_0x007c:
            if (r7 >= r6) goto L_0x00a8
            ny r9 = r13.g
            android.view.View r9 = r9.c(r7)
            androidx.recyclerview.widget.RecyclerView$u r9 = d(r9)
            if (r9 == 0) goto L_0x00a4
            boolean r10 = r9.n()
            if (r10 != 0) goto L_0x00a4
            long r10 = r9.s
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x00a4
            ny r8 = r13.g
            android.view.View r10 = r9.o
            boolean r8 = r8.d(r10)
            if (r8 == 0) goto L_0x00a2
            r8 = r9
            goto L_0x00a4
        L_0x00a2:
            r8 = r9
            goto L_0x00a8
        L_0x00a4:
            int r7 = r7 + 1
            goto L_0x007c
        L_0x00a7:
            r8 = r5
        L_0x00a8:
            if (r8 == 0) goto L_0x00c0
            ny r0 = r13.g
            android.view.View r1 = r8.o
            boolean r0 = r0.d(r1)
            if (r0 != 0) goto L_0x00c0
            android.view.View r0 = r8.o
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x00bd
            goto L_0x00c0
        L_0x00bd:
            android.view.View r5 = r8.o
            goto L_0x010d
        L_0x00c0:
            ny r0 = r13.g
            int r0 = r0.a()
            if (r0 <= 0) goto L_0x010d
            androidx.recyclerview.widget.RecyclerView$s r0 = r13.E
            int r0 = r0.l
            r1 = -1
            if (r0 == r1) goto L_0x00d3
            androidx.recyclerview.widget.RecyclerView$s r0 = r13.E
            int r2 = r0.l
        L_0x00d3:
            androidx.recyclerview.widget.RecyclerView$s r0 = r13.E
            int r0 = r0.a()
            r1 = r2
        L_0x00da:
            if (r1 >= r0) goto L_0x00f1
            androidx.recyclerview.widget.RecyclerView$u r6 = r13.g(r1)
            if (r6 == 0) goto L_0x00f1
            android.view.View r7 = r6.o
            boolean r7 = r7.hasFocusable()
            if (r7 == 0) goto L_0x00ee
            android.view.View r0 = r6.o
        L_0x00ec:
            r5 = r0
            goto L_0x010d
        L_0x00ee:
            int r1 = r1 + 1
            goto L_0x00da
        L_0x00f1:
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = r0 + -1
        L_0x00f7:
            if (r0 < 0) goto L_0x010d
            androidx.recyclerview.widget.RecyclerView$u r1 = r13.g(r0)
            if (r1 == 0) goto L_0x010d
            android.view.View r2 = r1.o
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L_0x010a
            android.view.View r0 = r1.o
            goto L_0x00ec
        L_0x010a:
            int r0 = r0 + -1
            goto L_0x00f7
        L_0x010d:
            if (r5 == 0) goto L_0x012d
            androidx.recyclerview.widget.RecyclerView$s r0 = r13.E
            int r0 = r0.n
            long r0 = (long) r0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0129
            androidx.recyclerview.widget.RecyclerView$s r0 = r13.E
            int r0 = r0.n
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x0129
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r0 = r5
        L_0x012a:
            r0.requestFocus()
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D():void");
    }

    private void E() {
        this.E.a(1);
        a(this.E);
        this.E.i = false;
        n();
        this.h.a();
        g();
        z();
        B();
        s sVar = this.E;
        sVar.h = sVar.j && this.G;
        this.G = false;
        this.F = false;
        s sVar2 = this.E;
        sVar2.g = sVar2.k;
        this.E.e = this.m.b();
        a(this.ay);
        if (this.E.j) {
            int a2 = this.g.a();
            for (int i2 = 0; i2 < a2; i2++) {
                u d2 = d(this.g.b(i2));
                if (!d2.c() && (!d2.k() || this.m.c)) {
                    f fVar = this.x;
                    f.e(d2);
                    d2.r();
                    this.h.a(d2, new b().a(d2));
                    if (this.E.h && d2.v() && !d2.n() && !d2.c() && !d2.k()) {
                        this.h.a(e(d2), d2);
                    }
                }
            }
        }
        if (this.E.k) {
            I();
            boolean z2 = this.E.f;
            s sVar3 = this.E;
            sVar3.f = false;
            this.n.c(this.e, sVar3);
            this.E.f = z2;
            for (int i3 = 0; i3 < this.g.a(); i3++) {
                u d3 = d(this.g.b(i3));
                if (!d3.c() && !this.h.b(d3)) {
                    f.e(d3);
                    boolean a3 = d3.a(8192);
                    f fVar2 = this.x;
                    d3.r();
                    b a4 = new b().a(d3);
                    if (a3) {
                        a(d3, a4);
                    } else {
                        this.h.b(d3, a4);
                    }
                }
            }
            J();
        } else {
            J();
        }
        a(true);
        c(false);
        this.E.d = 2;
    }

    private void F() {
        n();
        g();
        this.E.a(6);
        this.f.e();
        this.E.e = this.m.b();
        s sVar = this.E;
        sVar.c = 0;
        sVar.g = false;
        this.n.c(this.e, sVar);
        s sVar2 = this.E;
        sVar2.f = false;
        this.Q = null;
        sVar2.j = sVar2.j && this.x != null;
        this.E.d = 4;
        a(true);
        c(false);
    }

    private void G() {
        this.E.a(4);
        n();
        g();
        s sVar = this.E;
        sVar.d = 1;
        if (sVar.j) {
            for (int a2 = this.g.a() - 1; a2 >= 0; a2--) {
                u d2 = d(this.g.b(a2));
                if (!d2.c()) {
                    long e2 = e(d2);
                    f fVar = this.x;
                    b a3 = new b().a(d2);
                    u a4 = this.h.a(e2);
                    if (a4 == null || a4.c()) {
                        this.h.c(d2, a3);
                    } else {
                        boolean a5 = this.h.a(a4);
                        boolean a6 = this.h.a(d2);
                        if (!a5 || a4 != d2) {
                            b a7 = this.h.a(a4, 4);
                            this.h.c(d2, a3);
                            b a8 = this.h.a(d2, 8);
                            if (a7 == null) {
                                a(e2, d2, a4);
                            } else {
                                a(a4, d2, a7, a8, a5, a6);
                            }
                        } else {
                            this.h.c(d2, a3);
                        }
                    }
                }
            }
            this.h.a(this.aE);
        }
        this.n.b(this.e);
        s sVar2 = this.E;
        sVar2.b = sVar2.e;
        this.w = false;
        this.ac = false;
        s sVar3 = this.E;
        sVar3.j = false;
        sVar3.k = false;
        this.n.m = false;
        if (this.e.b != null) {
            this.e.b.clear();
        }
        if (this.n.s) {
            i iVar = this.n;
            iVar.r = 0;
            iVar.s = false;
            this.e.b();
        }
        this.n.a(this.E);
        a(true);
        c(false);
        this.h.a();
        int[] iArr = this.ay;
        if (g(iArr[0], iArr[1])) {
            f(0, 0);
        }
        D();
        C();
    }

    private void H() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((LayoutParams) this.g.c(i2).getLayoutParams()).e = true;
        }
        this.e.f();
    }

    private void I() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            u d2 = d(this.g.c(i2));
            if (!d2.c()) {
                d2.aB_();
            }
        }
    }

    private void J() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            u d2 = d(this.g.c(i2));
            if (!d2.c()) {
                d2.a();
            }
        }
        this.e.e();
    }

    private void K() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            u d2 = d(this.g.c(i2));
            if (d2 != null && !d2.c()) {
                d2.b(6);
            }
        }
        H();
        this.e.d();
    }

    private void L() {
        for (int size = this.aC.size() - 1; size >= 0; size--) {
            u uVar = (u) this.aC.get(size);
            if (uVar.o.getParent() == this && !uVar.c()) {
                int i2 = uVar.B;
                if (i2 != -1) {
                    ip.b(uVar.o, i2);
                    uVar.B = -1;
                }
            }
        }
        this.aC.clear();
    }

    private ig M() {
        if (this.az == null) {
            this.az = new ig(this);
        }
        return this.az;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.q()
            android.widget.EdgeEffect r3 = r6.ag
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            defpackage.ji.a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.r()
            android.widget.EdgeEffect r3 = r6.ai
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            defpackage.ji.a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.s()
            android.widget.EdgeEffect r9 = r6.ah
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            defpackage.ji.a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.t()
            android.widget.EdgeEffect r9 = r6.aj
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            defpackage.ji.a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            defpackage.ip.d(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a(float, float, float, float):void");
    }

    private void a(int i2, int i3, Interpolator interpolator, int i4) {
        a(i2, i3, interpolator, Integer.MIN_VALUE, false);
    }

    private void a(long j2, u uVar, u uVar2) {
        int a2 = this.g.a();
        int i2 = 0;
        while (i2 < a2) {
            u d2 = d(this.g.b(i2));
            if (d2 == uVar || e(d2) != j2) {
                i2++;
            } else {
                a aVar = this.m;
                String str = " \n View Holder 2:";
                if (aVar == null || !aVar.c) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(d2);
                    sb.append(str);
                    sb.append(uVar);
                    sb.append(a());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(d2);
                sb2.append(str);
                sb2.append(uVar);
                sb2.append(a());
                throw new IllegalStateException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(uVar2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(uVar);
        sb3.append(a());
        Log.e("RecyclerView", sb3.toString());
    }

    public static void a(View view, Rect rect) {
        b(view, rect);
    }

    private void a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.k.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.e) {
                Rect rect = layoutParams2.d;
                this.k.left -= rect.left;
                this.k.right += rect.right;
                this.k.top -= rect.top;
                this.k.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.k);
            offsetRectIntoDescendantCoords(view, this.k);
        }
        this.n.a(this, view, this.k, !this.r, view2 == null);
    }

    private void a(a aVar, boolean z2, boolean z3) {
        a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.b((c) this.P);
            this.m.b(this);
        }
        if (!z2 || z3) {
            b();
        }
        this.f.a();
        a aVar3 = this.m;
        this.m = aVar;
        if (aVar != null) {
            aVar.a((c) this.P);
            aVar.a(this);
        }
        i iVar = this.n;
        if (iVar != null) {
            iVar.a(aVar3, this.m);
        }
        this.e.a(aVar3, this.m, z2);
        this.E.f = true;
    }

    private void a(s sVar) {
        if (this.y == 2) {
            OverScroller overScroller = this.B.c;
            sVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            sVar.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        sVar.o = 0;
        sVar.p = 0;
    }

    private void a(u uVar, u uVar2, b bVar, b bVar2, boolean z2, boolean z3) {
        uVar.b(false);
        if (z2) {
            d(uVar);
        }
        if (uVar != uVar2) {
            if (z3) {
                d(uVar2);
            }
            uVar.v = uVar2;
            d(uVar);
            this.e.b(uVar);
            uVar2.b(false);
            uVar2.w = uVar;
        }
        if (this.x.a(uVar, uVar2, bVar, bVar2)) {
            j();
        }
    }

    private void a(int[] iArr) {
        int a2 = this.g.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < a2; i4++) {
            u d2 = d(this.g.b(i4));
            if (!d2.c()) {
                int d3 = d2.d();
                if (d3 < i2) {
                    i2 = d3;
                }
                if (d3 > i3) {
                    i3 = d3;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    private boolean a(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i3;
        MotionEvent motionEvent2 = motionEvent;
        e();
        if (this.m != null) {
            int[] iArr = this.J;
            iArr[0] = 0;
            iArr[1] = 0;
            a(i8, i9, iArr);
            int[] iArr2 = this.J;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i6 = i11;
            i7 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.o.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.J;
        iArr3[0] = 0;
        iArr3[1] = 0;
        int i12 = i7;
        a(i7, i6, i5, i4, this.aA, 0, iArr3);
        int[] iArr4 = this.J;
        int i13 = i5 - iArr4[0];
        int i14 = i4 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i15 = this.ao;
        int[] iArr5 = this.aA;
        this.ao = i15 - iArr5[0];
        this.ap -= iArr5[1];
        int[] iArr6 = this.aB;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !ic.a(motionEvent2, 8194)) {
                a(motionEvent.getX(), (float) i13, motionEvent.getY(), (float) i14);
            }
            b(i2, i3);
        }
        int i16 = i12;
        if (!(i16 == 0 && i6 == 0)) {
            f(i16, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i16 == 0 && i6 == 0) ? false : true;
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.S.size();
        int i2 = 0;
        while (i2 < size) {
            l lVar = (l) this.S.get(i2);
            if (!lVar.a(motionEvent) || action == 3) {
                i2++;
            } else {
                this.T = lVar;
                return true;
            }
        }
        return false;
    }

    private void b(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ak) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.ak = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.ao = x2;
            this.am = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.ap = y2;
            this.an = y2;
        }
    }

    static void b(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.d;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    static void b(u uVar) {
        if (uVar.p != null) {
            View view = (View) uVar.p.get();
            while (view != null) {
                if (view != uVar.o) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            uVar.p = null;
        }
    }

    private void c(boolean z2) {
        if (this.V <= 0) {
            this.V = 1;
        }
        if (!z2 && !this.t) {
            this.s = false;
        }
        if (this.V == 1) {
            if (z2 && this.s && !this.t && this.n != null && this.m != null) {
                A();
            }
            if (!this.t) {
                this.s = false;
            }
        }
        this.V--;
    }

    public static u d(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).c;
    }

    private void d(u uVar) {
        View view = uVar.o;
        boolean z2 = view.getParent() == this;
        this.e.b(b(view));
        if (uVar.o()) {
            this.g.a(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.g.a(view, -1, true);
        } else {
            ny nyVar = this.g;
            int a2 = nyVar.a.a(view);
            if (a2 >= 0) {
                nyVar.b.a(a2);
                nyVar.a(view);
                return;
            }
            StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static int e(View view) {
        u d2 = d(view);
        if (d2 != null) {
            return d2.e();
        }
        return -1;
    }

    private long e(u uVar) {
        return this.m.c ? uVar.s : (long) uVar.q;
    }

    public static int f(View view) {
        u d2 = d(view);
        if (d2 != null) {
            return d2.d();
        }
        return -1;
    }

    private boolean g(int i2, int i3) {
        a(this.ay);
        int[] iArr = this.ay;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private boolean h(int i2, int i3) {
        return M().a(i2, i3);
    }

    static RecyclerView i(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView i3 = i(viewGroup.getChildAt(i2));
            if (i3 != null) {
                return i3;
            }
        }
        return null;
    }

    public static long m() {
        if (d) {
            return System.nanoTime();
        }
        return 0;
    }

    private void n() {
        this.V++;
        if (this.V == 1 && !this.t) {
            this.s = false;
        }
    }

    private void o() {
        this.B.b();
        i iVar = this.n;
        if (iVar != null) {
            iVar.u();
        }
    }

    private void p() {
        boolean z2;
        EdgeEffect edgeEffect = this.ag;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.ag.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.ah;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.ah.isFinished();
        }
        EdgeEffect edgeEffect3 = this.ai;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.ai.isFinished();
        }
        EdgeEffect edgeEffect4 = this.aj;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.aj.isFinished();
        }
        if (z2) {
            ip.d(this);
        }
    }

    private void q() {
        if (this.ag == null) {
            this.ag = e.a(this);
            if (this.i) {
                this.ag.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.ag.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    private void r() {
        if (this.ai == null) {
            this.ai = e.a(this);
            if (this.i) {
                this.ai.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.ai.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    private void s() {
        if (this.ah == null) {
            this.ah = e.a(this);
            if (this.i) {
                this.ah.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.ah.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void t() {
        if (this.aj == null) {
            this.aj = e.a(this);
            if (this.i) {
                this.aj.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.aj.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void u() {
        this.aj = null;
        this.ah = null;
        this.ai = null;
        this.ag = null;
    }

    private void v() {
        VelocityTracker velocityTracker = this.al;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        p();
    }

    private void w() {
        v();
        c(0);
    }

    private void x() {
        int i2 = this.aa;
        this.aa = 0;
        if (i2 != 0 && h()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            iy.a(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private boolean y() {
        return this.x != null && this.n.q_();
    }

    private void z() {
        if (this.w) {
            this.f.a();
            if (this.ac) {
                this.n.a(this);
            }
        }
        if (y()) {
            this.f.b();
        } else {
            this.f.e();
        }
        boolean z2 = false;
        boolean z3 = this.F || this.G;
        this.E.j = this.r && this.x != null && (this.w || z3 || this.n.m) && (!this.w || this.m.c);
        s sVar = this.E;
        if (sVar.j && z3 && !this.w && y()) {
            z2 = true;
        }
        sVar.k = z2;
    }

    public final View a(float f2, float f3) {
        for (int a2 = this.g.a() - 1; a2 >= 0; a2--) {
            View b2 = this.g.b(a2);
            float translationX = b2.getTranslationX();
            float translationY = b2.getTranslationY();
            if (f2 >= ((float) b2.getLeft()) + translationX && f2 <= ((float) b2.getRight()) + translationX && f3 >= ((float) b2.getTop()) + translationY && f3 <= ((float) b2.getBottom()) + translationY) {
                return b2;
            }
        }
        return null;
    }

    public final u a(int i2, boolean z2) {
        int b2 = this.g.b();
        u uVar = null;
        for (int i3 = 0; i3 < b2; i3++) {
            u d2 = d(this.g.c(i3));
            if (d2 != null && !d2.n()) {
                if (z2) {
                    if (d2.q != i2) {
                        continue;
                    }
                } else if (d2.d() != i2) {
                    continue;
                }
                if (!this.g.d(d2.o)) {
                    return d2;
                }
                uVar = d2;
            }
        }
        return uVar;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.m);
        sb.append(", layout:");
        sb.append(this.n);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public final void a(int i2) {
        M().b(i2);
    }

    public final void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        M().a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void a(int i2, int i3, Interpolator interpolator) {
        a(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        i iVar = this.n;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.t) {
            int i5 = 0;
            if (!iVar.e()) {
                i2 = 0;
            }
            if (!this.n.f()) {
                i3 = 0;
            }
            if (!(i2 == 0 && i3 == 0)) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        h(i5, 1);
                    }
                    this.B.a(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.g.b();
        for (int i5 = 0; i5 < b2; i5++) {
            u d2 = d(this.g.c(i5));
            if (d2 != null && !d2.c()) {
                if (d2.q >= i4) {
                    d2.a(-i3, z2);
                    this.E.f = true;
                } else if (d2.q >= i2) {
                    int i6 = i2 - 1;
                    int i7 = -i3;
                    d2.b(8);
                    d2.a(i7, z2);
                    d2.q = i6;
                    this.E.f = true;
                }
            }
        }
        o oVar = this.e;
        for (int size = oVar.c.size() - 1; size >= 0; size--) {
            u uVar = (u) oVar.c.get(size);
            if (uVar != null) {
                if (uVar.q >= i4) {
                    uVar.a(-i3, z2);
                } else if (uVar.q >= i2) {
                    uVar.b(8);
                    oVar.c(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3, int[] iArr) {
        n();
        g();
        ha.a("RV Scroll");
        a(this.E);
        int a2 = i2 != 0 ? this.n.a(i2, this.e, this.E) : 0;
        int b2 = i3 != 0 ? this.n.b(i3, this.e, this.E) : 0;
        ha.a();
        int a3 = this.g.a();
        for (int i4 = 0; i4 < a3; i4++) {
            View b3 = this.g.b(i4);
            u b4 = b(b3);
            if (!(b4 == null || b4.w == null)) {
                View view = b4.w.o;
                int left = b3.getLeft();
                int top = b3.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        a(true);
        c(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    public void a(a aVar) {
        suppressLayout(false);
        a(aVar, false, true);
        b(false);
        requestLayout();
    }

    public final void a(a aVar, boolean z2) {
        suppressLayout(false);
        a(aVar, true, false);
        b(true);
        requestLayout();
    }

    public final void a(d dVar) {
        if (dVar != this.ax) {
            this.ax = dVar;
            setChildrenDrawingOrderEnabled(this.ax != null);
        }
    }

    public final void a(f fVar) {
        f fVar2 = this.x;
        if (fVar2 != null) {
            fVar2.d();
            this.x.h = null;
        }
        this.x = fVar;
        f fVar3 = this.x;
        if (fVar3 != null) {
            fVar3.h = this.aw;
        }
    }

    public final void a(h hVar) {
        a(hVar, -1);
    }

    public final void a(h hVar, int i2) {
        i iVar = this.n;
        if (iVar != null) {
            iVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.o.add(hVar);
        H();
        requestLayout();
    }

    public void a(i iVar) {
        if (iVar != this.n) {
            f();
            if (this.n != null) {
                f fVar = this.x;
                if (fVar != null) {
                    fVar.d();
                }
                this.n.c(this.e);
                this.n.b(this.e);
                this.e.a();
                if (this.p) {
                    this.n.b(this, this.e);
                }
                this.n.b((RecyclerView) null);
                this.n = null;
            } else {
                this.e.a();
            }
            ny nyVar = this.g;
            nyVar.b.a();
            for (int size = nyVar.c.size() - 1; size >= 0; size--) {
                nyVar.a.d((View) nyVar.c.get(size));
                nyVar.c.remove(size);
            }
            nyVar.a.b();
            this.n = iVar;
            if (iVar != null) {
                if (iVar.i == null) {
                    this.n.b(this);
                    if (this.p) {
                        this.n.c(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(iVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(iVar.i.a());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.e.b();
            requestLayout();
        }
    }

    public final void a(j jVar) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(jVar);
    }

    public final void a(l lVar) {
        this.S.add(lVar);
    }

    public void a(m mVar) {
        if (this.av == null) {
            this.av = new ArrayList();
        }
        this.av.add(mVar);
    }

    /* access modifiers changed from: 0000 */
    public final void a(u uVar, b bVar) {
        uVar.a(0, 8192);
        if (this.E.h && uVar.v() && !uVar.n() && !uVar.c()) {
            this.h.a(e(uVar), uVar);
        }
        this.h.a(uVar, bVar);
    }

    /* access modifiers changed from: 0000 */
    public final void a(u uVar, b bVar, b bVar2) {
        d(uVar);
        uVar.b(false);
        if (this.x.a(uVar, bVar, bVar2)) {
            j();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        if (i()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(a());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.ae > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a());
            new IllegalStateException(sb2.toString());
        }
    }

    public final void a(boolean z2) {
        this.ad--;
        if (this.ad <= 0) {
            this.ad = 0;
            if (z2) {
                x();
                L();
            }
        }
    }

    public boolean a(int i2, int i3) {
        i iVar = this.n;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.t) {
            return false;
        } else {
            boolean e2 = iVar.e();
            boolean f2 = this.n.f();
            int i4 = (!e2 || Math.abs(i2) < this.A) ? 0 : i2;
            int i5 = (!f2 || Math.abs(i3) < this.A) ? 0 : i3;
            if (i4 == 0 && i5 == 0) {
                return false;
            }
            float f3 = (float) i4;
            float f4 = (float) i5;
            if (!dispatchNestedPreFling(f3, f4)) {
                boolean z2 = e2 || f2;
                dispatchNestedFling(f3, f4, z2);
                k kVar = this.z;
                if (kVar != null && kVar.a(i4, i5)) {
                    return true;
                }
                if (z2) {
                    if (f2) {
                        e2 |= true;
                    }
                    h(e2 ? 1 : 0, 1);
                    int i6 = this.ar;
                    int max = Math.max(-i6, Math.min(i4, i6));
                    int i7 = this.ar;
                    int max2 = Math.max(-i7, Math.min(i5, i7));
                    t tVar = this.B;
                    RecyclerView.this.c(2);
                    tVar.b = 0;
                    tVar.a = 0;
                    Interpolator interpolator = tVar.d;
                    Interpolator interpolator2 = K;
                    if (interpolator != interpolator2) {
                        tVar.d = interpolator2;
                        tVar.c = new OverScroller(RecyclerView.this.getContext(), K);
                    }
                    tVar.c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    tVar.a();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return M().a(i2, i3, iArr, iArr2, i4);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(View view) {
        n();
        ny nyVar = this.g;
        int a2 = nyVar.a.a(view);
        boolean z2 = true;
        if (a2 == -1) {
            nyVar.b(view);
        } else if (nyVar.b.c(a2)) {
            nyVar.b.d(a2);
            nyVar.b(view);
            nyVar.a.a(a2);
        } else {
            z2 = false;
        }
        if (z2) {
            u d2 = d(view);
            this.e.b(d2);
            this.e.a(d2);
        }
        c(!z2);
        return z2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(u uVar) {
        f fVar = this.x;
        return fVar == null || fVar.a(uVar, uVar.r());
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(u uVar, int i2) {
        if (i()) {
            uVar.B = i2;
            this.aC.add(uVar);
            return false;
        }
        ip.b(uVar.o, i2);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        super.addFocusables(arrayList, i2, i3);
    }

    public final u b(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return d(view);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void b() {
        f fVar = this.x;
        if (fVar != null) {
            fVar.d();
        }
        i iVar = this.n;
        if (iVar != null) {
            iVar.c(this.e);
            this.n.b(this.e);
        }
        this.e.a();
    }

    public final void b(int i2) {
        this.aq = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.ag;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.ag.onRelease();
            z2 = this.ag.isFinished();
        }
        EdgeEffect edgeEffect2 = this.ai;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.ai.onRelease();
            z2 |= this.ai.isFinished();
        }
        EdgeEffect edgeEffect3 = this.ah;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.ah.onRelease();
            z2 |= this.ah.isFinished();
        }
        EdgeEffect edgeEffect4 = this.aj;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.aj.onRelease();
            z2 |= this.aj.isFinished();
        }
        if (z2) {
            ip.d(this);
        }
    }

    public final void b(h hVar) {
        i iVar = this.n;
        if (iVar != null) {
            iVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.o.remove(hVar);
        if (this.o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        H();
        requestLayout();
    }

    public final void b(j jVar) {
        List<j> list = this.v;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public final void b(l lVar) {
        this.S.remove(lVar);
        if (this.T == lVar) {
            this.T = null;
        }
    }

    public void b(m mVar) {
        List<m> list = this.av;
        if (list != null) {
            list.remove(mVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(boolean z2) {
        this.ac = z2 | this.ac;
        this.w = true;
        K();
    }

    /* access modifiers changed from: 0000 */
    public final int c(u uVar) {
        if (uVar.a(524) || !uVar.m()) {
            return -1;
        }
        return this.f.c(uVar.q);
    }

    public final View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public a c() {
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i2) {
        if (i2 != this.y) {
            this.y = i2;
            if (i2 != 2) {
                o();
            }
            i iVar = this.n;
            if (iVar != null) {
                iVar.j(i2);
            }
            h(i2);
            List<m> list = this.av;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((m) this.av.get(size)).a(this, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i2, int i3) {
        if (i2 < 0) {
            q();
            if (this.ag.isFinished()) {
                this.ag.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            r();
            if (this.ai.isFinished()) {
                this.ai.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            s();
            if (this.ah.isFinished()) {
                this.ah.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            t();
            if (this.aj.isFinished()) {
                this.aj.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            ip.d(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.n.a((LayoutParams) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        i iVar = this.n;
        if (iVar != null && iVar.e()) {
            return this.n.f(this.E);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        i iVar = this.n;
        if (iVar != null && iVar.e()) {
            return this.n.d(this.E);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        i iVar = this.n;
        if (iVar != null && iVar.e()) {
            return this.n.b(this.E);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        i iVar = this.n;
        if (iVar != null && iVar.f()) {
            return this.n.g(this.E);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        i iVar = this.n;
        if (iVar != null && iVar.f()) {
            return this.n.e(this.E);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        i iVar = this.n;
        if (iVar != null && iVar.f()) {
            return this.n.c(this.E);
        }
        return 0;
    }

    public i d() {
        return this.n;
    }

    public void d(int i2) {
        if (!this.t) {
            f();
            i iVar = this.n;
            if (iVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            iVar.e(i2);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d(int i2, int i3) {
        setMeasuredDimension(i.a(i2, getPaddingLeft() + getPaddingRight(), ip.l(this)), i.a(i3, getPaddingTop() + getPaddingBottom(), ip.m(this)));
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return M().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return M().a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return M().a(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return M().a(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        boolean z3;
        super.draw(canvas);
        int size = this.o.size();
        boolean z4 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((h) this.o.get(i2)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.ag;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.ag;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.ah;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.ah;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.ai;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.ai;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.aj;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z3 = z2;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.aj;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 = z4 | z2;
            canvas.restoreToCount(save4);
        }
        if (!z3 && this.x != null && this.o.size() > 0 && this.x.b()) {
            z3 = true;
        }
        if (z3) {
            ip.d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        String str = "RV FullInvalidate";
        if (!this.r || this.w) {
            ha.a(str);
            A();
            ha.a();
        } else if (this.f.d()) {
            if (!this.f.a(4) || this.f.a(11)) {
                if (this.f.d()) {
                    ha.a(str);
                    A();
                    ha.a();
                }
                return;
            }
            ha.a("RV PartialInvalidate");
            n();
            g();
            this.f.b();
            if (!this.s) {
                int a2 = this.g.a();
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= a2) {
                        break;
                    }
                    u d2 = d(this.g.b(i2));
                    if (d2 != null && !d2.c() && d2.v()) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    A();
                } else {
                    this.f.c();
                }
            }
            c(true);
            a(true);
            ha.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e(int i2) {
        if (this.n != null) {
            c(2);
            this.n.e(i2);
            awakenScrollBars();
        }
    }

    public void e(int i2, int i3) {
    }

    public final void f() {
        c(0);
        o();
    }

    public void f(int i2) {
        if (!this.t) {
            i iVar = this.n;
            if (iVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                iVar.a(this, this.E, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void f(int i2, int i3) {
        this.ae++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        e(i2, i3);
        List<m> list = this.av;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((m) this.av.get(size)).a(this, i2, i3);
            }
        }
        this.ae--;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b0, code lost:
        if (r8 > 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ce, code lost:
        if (r10 > 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01d1, code lost:
        if (r8 < 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d4, code lost:
        if (r10 < 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01dd, code lost:
        if ((r10 * r3) < 0) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01e6, code lost:
        if ((r10 * r3) > 0) goto L_0x01e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$a r0 = r13.m
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            androidx.recyclerview.widget.RecyclerView$i r0 = r13.n
            if (r0 == 0) goto L_0x0016
            boolean r0 = r13.i()
            if (r0 != 0) goto L_0x0016
            boolean r0 = r13.t
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 66
            r5 = 17
            r6 = 130(0x82, float:1.82E-43)
            r7 = 33
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x009c
            if (r15 == r9) goto L_0x002b
            if (r15 != r1) goto L_0x009c
        L_0x002b:
            androidx.recyclerview.widget.RecyclerView$i r0 = r13.n
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0049
            if (r15 != r9) goto L_0x0038
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003a
        L_0x0038:
            r0 = 33
        L_0x003a:
            android.view.View r10 = r3.findNextFocus(r13, r14, r0)
            if (r10 != 0) goto L_0x0042
            r10 = 1
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            boolean r11 = M
            if (r11 == 0) goto L_0x004a
            r15 = r0
            goto L_0x004a
        L_0x0049:
            r10 = 0
        L_0x004a:
            if (r10 != 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$i r0 = r13.n
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$i r0 = r13.n
            androidx.recyclerview.widget.RecyclerView r0 = r0.i
            int r0 = defpackage.ip.f(r0)
            if (r0 != r1) goto L_0x0060
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            if (r15 != r9) goto L_0x0065
            r10 = 1
            goto L_0x0066
        L_0x0065:
            r10 = 0
        L_0x0066:
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x006c
            r0 = 66
            goto L_0x006e
        L_0x006c:
            r0 = 17
        L_0x006e:
            android.view.View r10 = r3.findNextFocus(r13, r14, r0)
            if (r10 != 0) goto L_0x0076
            r10 = 1
            goto L_0x0077
        L_0x0076:
            r10 = 0
        L_0x0077:
            boolean r11 = M
            if (r11 == 0) goto L_0x007c
            r15 = r0
        L_0x007c:
            if (r10 == 0) goto L_0x0097
            r13.e()
            android.view.View r0 = r13.c(r14)
            if (r0 != 0) goto L_0x0088
            return r8
        L_0x0088:
            r13.n()
            androidx.recyclerview.widget.RecyclerView$i r0 = r13.n
            androidx.recyclerview.widget.RecyclerView$o r10 = r13.e
            androidx.recyclerview.widget.RecyclerView$s r11 = r13.E
            r0.a(r14, r15, r10, r11)
            r13.c(r2)
        L_0x0097:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00c0
        L_0x009c:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00bf
            if (r0 == 0) goto L_0x00bf
            r13.e()
            android.view.View r0 = r13.c(r14)
            if (r0 != 0) goto L_0x00ae
            return r8
        L_0x00ae:
            r13.n()
            androidx.recyclerview.widget.RecyclerView$i r0 = r13.n
            androidx.recyclerview.widget.RecyclerView$o r3 = r13.e
            androidx.recyclerview.widget.RecyclerView$s r10 = r13.E
            android.view.View r0 = r0.a(r14, r15, r3, r10)
            r13.c(r2)
            goto L_0x00c0
        L_0x00bf:
            r0 = r3
        L_0x00c0:
            if (r0 == 0) goto L_0x00d7
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00d7
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00d3
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00d3:
            r13.a(r0, r8)
            return r14
        L_0x00d7:
            if (r0 == 0) goto L_0x01e9
            if (r0 != r13) goto L_0x00dd
            goto L_0x01e9
        L_0x00dd:
            android.view.View r3 = r13.c(r0)
            if (r3 != 0) goto L_0x00e5
            goto L_0x01e9
        L_0x00e5:
            if (r14 != 0) goto L_0x00e9
            goto L_0x01ea
        L_0x00e9:
            android.view.View r3 = r13.c(r14)
            if (r3 != 0) goto L_0x00f1
            goto L_0x01ea
        L_0x00f1:
            android.graphics.Rect r3 = r13.k
            int r8 = r14.getWidth()
            int r10 = r14.getHeight()
            r3.set(r2, r2, r8, r10)
            android.graphics.Rect r3 = r13.R
            int r8 = r0.getWidth()
            int r10 = r0.getHeight()
            r3.set(r2, r2, r8, r10)
            android.graphics.Rect r3 = r13.k
            r13.offsetDescendantRectToMyCoords(r14, r3)
            android.graphics.Rect r3 = r13.R
            r13.offsetDescendantRectToMyCoords(r0, r3)
            androidx.recyclerview.widget.RecyclerView$i r3 = r13.n
            androidx.recyclerview.widget.RecyclerView r3 = r3.i
            int r3 = defpackage.ip.f(r3)
            r8 = -1
            if (r3 != r1) goto L_0x0122
            r3 = -1
            goto L_0x0123
        L_0x0122:
            r3 = 1
        L_0x0123:
            android.graphics.Rect r10 = r13.k
            int r10 = r10.left
            android.graphics.Rect r11 = r13.R
            int r11 = r11.left
            if (r10 < r11) goto L_0x0137
            android.graphics.Rect r10 = r13.k
            int r10 = r10.right
            android.graphics.Rect r11 = r13.R
            int r11 = r11.left
            if (r10 > r11) goto L_0x0143
        L_0x0137:
            android.graphics.Rect r10 = r13.k
            int r10 = r10.right
            android.graphics.Rect r11 = r13.R
            int r11 = r11.right
            if (r10 >= r11) goto L_0x0143
            r10 = 1
            goto L_0x0164
        L_0x0143:
            android.graphics.Rect r10 = r13.k
            int r10 = r10.right
            android.graphics.Rect r11 = r13.R
            int r11 = r11.right
            if (r10 > r11) goto L_0x0157
            android.graphics.Rect r10 = r13.k
            int r10 = r10.left
            android.graphics.Rect r11 = r13.R
            int r11 = r11.right
            if (r10 < r11) goto L_0x0163
        L_0x0157:
            android.graphics.Rect r10 = r13.k
            int r10 = r10.left
            android.graphics.Rect r11 = r13.R
            int r11 = r11.left
            if (r10 <= r11) goto L_0x0163
            r10 = -1
            goto L_0x0164
        L_0x0163:
            r10 = 0
        L_0x0164:
            android.graphics.Rect r11 = r13.k
            int r11 = r11.top
            android.graphics.Rect r12 = r13.R
            int r12 = r12.top
            if (r11 < r12) goto L_0x0178
            android.graphics.Rect r11 = r13.k
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.R
            int r12 = r12.top
            if (r11 > r12) goto L_0x0184
        L_0x0178:
            android.graphics.Rect r11 = r13.k
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.R
            int r12 = r12.bottom
            if (r11 >= r12) goto L_0x0184
            r8 = 1
            goto L_0x01a4
        L_0x0184:
            android.graphics.Rect r11 = r13.k
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.R
            int r12 = r12.bottom
            if (r11 > r12) goto L_0x0198
            android.graphics.Rect r11 = r13.k
            int r11 = r11.top
            android.graphics.Rect r12 = r13.R
            int r12 = r12.bottom
            if (r11 < r12) goto L_0x01a3
        L_0x0198:
            android.graphics.Rect r11 = r13.k
            int r11 = r11.top
            android.graphics.Rect r12 = r13.R
            int r12 = r12.top
            if (r11 <= r12) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            r8 = 0
        L_0x01a4:
            if (r15 == r1) goto L_0x01e0
            if (r15 == r9) goto L_0x01d7
            if (r15 == r5) goto L_0x01d4
            if (r15 == r7) goto L_0x01d1
            if (r15 == r4) goto L_0x01ce
            if (r15 != r6) goto L_0x01b3
            if (r8 <= 0) goto L_0x01e9
            goto L_0x01ea
        L_0x01b3:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid direction: "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = r13.a()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r14.<init>(r15)
            throw r14
        L_0x01ce:
            if (r10 <= 0) goto L_0x01e9
            goto L_0x01ea
        L_0x01d1:
            if (r8 >= 0) goto L_0x01e9
            goto L_0x01ea
        L_0x01d4:
            if (r10 >= 0) goto L_0x01e9
            goto L_0x01ea
        L_0x01d7:
            if (r8 > 0) goto L_0x01ea
            if (r8 != 0) goto L_0x01e9
            int r10 = r10 * r3
            if (r10 < 0) goto L_0x01e9
            goto L_0x01ea
        L_0x01e0:
            if (r8 < 0) goto L_0x01ea
            if (r8 != 0) goto L_0x01e9
            int r10 = r10 * r3
            if (r10 > 0) goto L_0x01e9
            goto L_0x01ea
        L_0x01e9:
            r1 = 0
        L_0x01ea:
            if (r1 == 0) goto L_0x01ed
            return r0
        L_0x01ed:
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final long g(View view) {
        a aVar = this.m;
        if (aVar != null && aVar.c) {
            u d2 = d(view);
            if (d2 != null) {
                return d2.s;
            }
        }
        return -1;
    }

    public final u g(int i2) {
        u uVar = null;
        if (this.w) {
            return null;
        }
        int b2 = this.g.b();
        for (int i3 = 0; i3 < b2; i3++) {
            u d2 = d(this.g.c(i3));
            if (d2 != null && !d2.n() && c(d2) == i2) {
                if (!this.g.d(d2.o)) {
                    return d2;
                }
                uVar = d2;
            }
        }
        return uVar;
    }

    public final void g() {
        this.ad++;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        i iVar = this.n;
        if (iVar != null) {
            return iVar.a();
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(a());
        throw new IllegalStateException(sb.toString());
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        i iVar = this.n;
        if (iVar != null) {
            return iVar.a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(a());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        i iVar = this.n;
        if (iVar != null) {
            return iVar.a(layoutParams);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(a());
        throw new IllegalStateException(sb.toString());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        d dVar = this.ax;
        return dVar == null ? super.getChildDrawingOrder(i2, i3) : dVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.i;
    }

    public final Rect h(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.e) {
            return layoutParams.d;
        }
        if (this.E.g && (layoutParams.c.v() || layoutParams.c.k())) {
            return layoutParams.d;
        }
        Rect rect = layoutParams.d;
        rect.set(0, 0, 0, 0);
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k.set(0, 0, 0, 0);
            ((h) this.o.get(i2)).a(this.k, view, this, this.E);
            rect.left += this.k.left;
            rect.top += this.k.top;
            rect.right += this.k.right;
            rect.bottom += this.k.bottom;
        }
        layoutParams.e = false;
        return rect;
    }

    public void h(int i2) {
    }

    /* access modifiers changed from: 0000 */
    public final boolean h() {
        AccessibilityManager accessibilityManager = this.ab;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean hasNestedScrollingParent() {
        return M().a(0);
    }

    public final boolean i() {
        return this.ad > 0;
    }

    public boolean isAttachedToWindow() {
        return this.p;
    }

    public final boolean isLayoutSuppressed() {
        return this.t;
    }

    public boolean isNestedScrollingEnabled() {
        return M().a;
    }

    /* access modifiers changed from: 0000 */
    public final void j() {
        if (!this.H && this.p) {
            ip.a((View) this, this.aD);
            this.H = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void j(View view) {
        u d2 = d(view);
        a aVar = this.m;
        if (!(aVar == null || d2 == null)) {
            aVar.c(d2);
        }
        List<j> list = this.v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((j) this.v.get(size)).b(view);
            }
        }
    }

    public final void k() {
        if (this.o.size() != 0) {
            i iVar = this.n;
            if (iVar != null) {
                iVar.a("Cannot invalidate item decorations during a scroll or layout");
            }
            H();
            requestLayout();
        }
    }

    public final boolean l() {
        return !this.r || this.w || this.f.d();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.ad = r0
            r1 = 1
            r4.p = r1
            boolean r2 = r4.r
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.r = r1
            androidx.recyclerview.widget.RecyclerView$i r1 = r4.n
            if (r1 == 0) goto L_0x001e
            r1.c(r4)
        L_0x001e:
            r4.H = r0
            boolean r0 = d
            if (r0 == 0) goto L_0x006b
            java.lang.ThreadLocal<od> r0 = defpackage.od.a
            java.lang.Object r0 = r0.get()
            od r0 = (defpackage.od) r0
            r4.C = r0
            od r0 = r4.C
            if (r0 != 0) goto L_0x0064
            od r0 = new od
            r0.<init>()
            r4.C = r0
            android.view.Display r0 = defpackage.ip.G(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            od r1 = r4.C
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.c = r2
            java.lang.ThreadLocal<od> r0 = defpackage.od.a
            od r1 = r4.C
            r0.set(r1)
        L_0x0064:
            od r0 = r4.C
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.b
            r0.add(r4)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.x;
        if (fVar != null) {
            fVar.d();
        }
        f();
        this.p = false;
        i iVar = this.n;
        if (iVar != null) {
            iVar.b(this, this.e);
        }
        this.aC.clear();
        removeCallbacks(this.aD);
        defpackage.ov.a.b();
        if (d) {
            od odVar = this.C;
            if (odVar != null) {
                odVar.b.remove(this);
                this.C = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((h) this.o.get(i2)).a(canvas, this);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.n != null && !this.t && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.n.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.n.e()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        a((int) (f2 * this.as), (int) (f3 * this.at), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.n.f()) {
                        f3 = -axisValue;
                    } else if (this.n.e()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        a((int) (f2 * this.as), (int) (f3 * this.at), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            a((int) (f2 * this.as), (int) (f3 * this.at), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.t) {
            return false;
        }
        this.T = null;
        if (a(motionEvent)) {
            w();
            return true;
        }
        i iVar = this.n;
        if (iVar == null) {
            return false;
        }
        boolean e2 = iVar.e();
        boolean f2 = this.n.f();
        if (this.al == null) {
            this.al = VelocityTracker.obtain();
        }
        this.al.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.W) {
                this.W = false;
            }
            this.ak = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.ao = x2;
            this.am = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.ap = y2;
            this.an = y2;
            if (this.y == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                c(1);
                a(1);
            }
            int[] iArr = this.aB;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f2) {
                e2 |= true;
            }
            h(e2 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.al.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.ak);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder("Error processing scroll; pointer index for id ");
                sb.append(this.ak);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.y != 1) {
                int i2 = x3 - this.am;
                int i3 = y3 - this.an;
                if (!e2 || Math.abs(i2) <= this.aq) {
                    z2 = false;
                } else {
                    this.ao = x3;
                    z2 = true;
                }
                if (f2 && Math.abs(i3) > this.aq) {
                    this.ap = y3;
                    z2 = true;
                }
                if (z2) {
                    c(1);
                }
            }
        } else if (actionMasked == 3) {
            w();
        } else if (actionMasked == 5) {
            this.ak = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.ao = x4;
            this.am = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ap = y4;
            this.an = y4;
        } else if (actionMasked == 6) {
            b(motionEvent);
        }
        return this.y == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ha.a("RV OnLayout");
        A();
        ha.a();
        this.r = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        i iVar = this.n;
        if (iVar == null) {
            d(i2, i3);
            return;
        }
        boolean z2 = false;
        if (iVar.p_()) {
            int mode = MeasureSpec.getMode(i2);
            int mode2 = MeasureSpec.getMode(i3);
            this.n.a(this.e, this.E, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.m != null) {
                if (this.E.d == 1) {
                    E();
                }
                this.n.b(i2, i3);
                this.E.i = true;
                F();
                this.n.c(i2, i3);
                if (this.n.r_()) {
                    this.n.b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.E.i = true;
                    F();
                    this.n.c(i2, i3);
                }
            }
        } else if (this.q) {
            this.n.a(this.e, this.E, i2, i3);
        } else {
            if (this.u) {
                n();
                g();
                z();
                a(true);
                if (this.E.k) {
                    this.E.g = true;
                } else {
                    this.f.e();
                    this.E.g = false;
                }
                this.u = false;
                c(false);
            } else if (this.E.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            a aVar = this.m;
            if (aVar != null) {
                this.E.e = aVar.b();
            } else {
                this.E.e = 0;
            }
            n();
            this.n.a(this.e, this.E, i2, i3);
            c(false);
            this.E.g = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.Q = (q) parcelable;
        super.onRestoreInstanceState(this.Q.d);
        if (!(this.n == null || this.Q.a == null)) {
            this.n.a(this.Q.a);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        q qVar = new q(super.onSaveInstanceState());
        q qVar2 = this.Q;
        if (qVar2 != null) {
            qVar.a = qVar2.a;
        } else {
            i iVar = this.n;
            if (iVar != null) {
                qVar.a = iVar.d();
            } else {
                qVar.a = null;
            }
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            u();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.t
            r8 = 0
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r6.W
            if (r0 == 0) goto L_0x000f
            goto L_0x01fc
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.T
            r1 = 3
            r9 = 1
            if (r0 != 0) goto L_0x0022
            int r0 = r18.getAction()
            if (r0 != 0) goto L_0x001d
            r0 = 0
            goto L_0x0031
        L_0x001d:
            boolean r0 = r17.a(r18)
            goto L_0x0031
        L_0x0022:
            r0.b(r7)
            int r0 = r18.getAction()
            if (r0 == r1) goto L_0x002d
            if (r0 != r9) goto L_0x0030
        L_0x002d:
            r0 = 0
            r6.T = r0
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r0 == 0) goto L_0x0037
            r17.w()
            return r9
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.n
            if (r0 != 0) goto L_0x003c
            return r8
        L_0x003c:
            boolean r10 = r0.e()
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.n
            boolean r11 = r0.f()
            android.view.VelocityTracker r0 = r6.al
            if (r0 != 0) goto L_0x0050
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.al = r0
        L_0x0050:
            int r0 = r18.getActionMasked()
            int r2 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0060
            int[] r3 = r6.aB
            r3[r9] = r8
            r3[r8] = r8
        L_0x0060:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r3 = r6.aB
            r4 = r3[r8]
            float r4 = (float) r4
            r3 = r3[r9]
            float r3 = (float) r3
            r12.offsetLocation(r4, r3)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01d0
            if (r0 == r9) goto L_0x018e
            r4 = 2
            if (r0 == r4) goto L_0x00a8
            if (r0 == r1) goto L_0x00a3
            r1 = 5
            if (r0 == r1) goto L_0x0087
            r1 = 6
            if (r0 == r1) goto L_0x0082
            goto L_0x01f1
        L_0x0082:
            r17.b(r18)
            goto L_0x01f1
        L_0x0087:
            int r0 = r7.getPointerId(r2)
            r6.ak = r0
            float r0 = r7.getX(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.ao = r0
            r6.am = r0
            float r0 = r7.getY(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.ap = r0
            r6.an = r0
            goto L_0x01f1
        L_0x00a3:
            r17.w()
            goto L_0x01f1
        L_0x00a8:
            int r0 = r6.ak
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.<init>(r1)
            int r1 = r6.ak
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00cb:
            float r1 = r7.getX(r0)
            float r1 = r1 + r3
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r3
            int r14 = (int) r0
            int r0 = r6.ao
            int r0 = r0 - r13
            int r1 = r6.ap
            int r1 = r1 - r14
            int r2 = r6.y
            if (r2 == r9) goto L_0x0114
            if (r10 == 0) goto L_0x00f8
            if (r0 <= 0) goto L_0x00ed
            int r2 = r6.aq
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00f4
        L_0x00ed:
            int r2 = r6.aq
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00f4:
            if (r0 == 0) goto L_0x00f8
            r2 = 1
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            if (r11 == 0) goto L_0x010f
            if (r1 <= 0) goto L_0x0105
            int r3 = r6.aq
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x010c
        L_0x0105:
            int r3 = r6.aq
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x010c:
            if (r1 == 0) goto L_0x010f
            r2 = 1
        L_0x010f:
            if (r2 == 0) goto L_0x0114
            r6.c(r9)
        L_0x0114:
            r15 = r0
            r16 = r1
            int r0 = r6.y
            if (r0 != r9) goto L_0x01f1
            int[] r0 = r6.J
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x0125
            r1 = r15
            goto L_0x0126
        L_0x0125:
            r1 = 0
        L_0x0126:
            if (r11 == 0) goto L_0x012b
            r2 = r16
            goto L_0x012c
        L_0x012b:
            r2 = 0
        L_0x012c:
            int[] r3 = r6.J
            int[] r4 = r6.aA
            r5 = 0
            r0 = r17
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x015b
            int[] r0 = r6.J
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.aB
            r1 = r0[r8]
            int[] r2 = r6.aA
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x015b:
            r0 = r16
            int[] r1 = r6.aA
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.ao = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.ap = r14
            if (r10 == 0) goto L_0x016d
            r1 = r15
            goto L_0x016e
        L_0x016d:
            r1 = 0
        L_0x016e:
            if (r11 == 0) goto L_0x0172
            r2 = r0
            goto L_0x0173
        L_0x0172:
            r2 = 0
        L_0x0173:
            boolean r1 = r6.a(r1, r2, r7)
            if (r1 == 0) goto L_0x0180
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0180:
            od r1 = r6.C
            if (r1 == 0) goto L_0x01f1
            if (r15 != 0) goto L_0x0188
            if (r0 == 0) goto L_0x01f1
        L_0x0188:
            od r1 = r6.C
            r1.a(r6, r15, r0)
            goto L_0x01f1
        L_0x018e:
            android.view.VelocityTracker r0 = r6.al
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.al
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.ar
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x01aa
            android.view.VelocityTracker r1 = r6.al
            int r2 = r6.ak
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01ab
        L_0x01aa:
            r1 = 0
        L_0x01ab:
            if (r11 == 0) goto L_0x01b7
            android.view.VelocityTracker r2 = r6.al
            int r3 = r6.ak
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01b8
        L_0x01b7:
            r2 = 0
        L_0x01b8:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01c0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c8
        L_0x01c0:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.a(r0, r1)
            if (r0 != 0) goto L_0x01cb
        L_0x01c8:
            r6.c(r8)
        L_0x01cb:
            r17.v()
            r8 = 1
            goto L_0x01f1
        L_0x01d0:
            int r0 = r7.getPointerId(r8)
            r6.ak = r0
            float r0 = r18.getX()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.ao = r0
            r6.am = r0
            float r0 = r18.getY()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.ap = r0
            r6.an = r0
            if (r11 == 0) goto L_0x01ee
            r10 = r10 | 2
        L_0x01ee:
            r6.h(r10, r8)
        L_0x01f1:
            if (r8 != 0) goto L_0x01f8
            android.view.VelocityTracker r0 = r6.al
            r0.addMovement(r12)
        L_0x01f8:
            r12.recycle()
            return r9
        L_0x01fc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        u d2 = d(view);
        if (d2 != null) {
            if (d2.o()) {
                d2.j();
            } else if (!d2.c()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(d2);
                sb.append(a());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!(this.n.p() || i()) && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.n.a(this, view, rect, z2, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.S.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((l) this.S.get(i2)).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.V != 0 || this.t) {
            this.s = true;
        } else {
            super.requestLayout();
        }
    }

    public void scrollBy(int i2, int i3) {
        i iVar = this.n;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.t) {
            boolean e2 = iVar.e();
            boolean f2 = this.n.f();
            if (e2 || f2) {
                if (!e2) {
                    i2 = 0;
                }
                if (!f2) {
                    i3 = 0;
                }
                a(i2, i3, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        boolean z2 = false;
        if (i()) {
            int contentChangeTypes = (accessibilityEvent == null || VERSION.SDK_INT < 19) ? 0 : accessibilityEvent.getContentChangeTypes();
            if (contentChangeTypes == 0) {
                contentChangeTypes = 0;
            }
            this.aa = contentChangeTypes | this.aa;
            z2 = true;
        }
        if (!z2) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.i) {
            u();
        }
        this.i = z2;
        super.setClipToPadding(z2);
        if (this.r) {
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        M().a(z2);
    }

    public boolean startNestedScroll(int i2) {
        return M().a(i2, 0);
    }

    public void stopNestedScroll() {
        M().b(0);
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.t) {
            a("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.t = false;
                if (!(!this.s || this.n == null || this.m == null)) {
                    requestLayout();
                }
                this.s = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.t = true;
            this.W = true;
            f();
        }
    }
}
