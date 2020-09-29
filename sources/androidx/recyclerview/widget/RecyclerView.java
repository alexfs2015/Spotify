package androidx.recyclerview.widget;

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements ie {
    static final Interpolator L = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final int[] M = {16843830};
    private static final int[] N = {16842987};
    private static final boolean O = (VERSION.SDK_INT <= 15);
    private static final boolean P = (VERSION.SDK_INT <= 15);
    private static final Class<?>[] Q = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final boolean a = (VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20);
    static final boolean b = (VERSION.SDK_INT >= 23);
    static final boolean c = (VERSION.SDK_INT >= 16);
    static final boolean d = (VERSION.SDK_INT >= 21);
    public final int A;
    final t B;
    ny C;
    public defpackage.ny.a D;
    public final s E;
    boolean F;
    boolean G;
    boolean H;
    oj I;
    final int[] J;
    final int[] K;
    private final p R;
    private q S;
    private final Rect T;
    private final ArrayList<l> U;
    private l V;
    private boolean W;
    private final int[] aA;
    private ig aB;
    private final int[] aC;
    private final int[] aD;
    private List<u> aE;
    private Runnable aF;
    private final defpackage.oq.b aG;
    private int aa;
    private boolean ab;
    private int ac;
    private final AccessibilityManager ad;
    private boolean ae;
    private int af;
    private int ag;
    private e ah;
    private EdgeEffect ai;
    private EdgeEffect aj;
    private EdgeEffect ak;
    private EdgeEffect al;
    private int am;
    private VelocityTracker an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private final int at;
    private float au;
    private float av;
    private boolean aw;
    private List<m> ax;
    private a ay;
    private d az;
    public final o e;
    public nq f;
    public nt g;
    final oq h;
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
    public boolean t;
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

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
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

        public void a(VH vh) {
        }

        public abstract void a(VH vh, int i);

        public void a(RecyclerView recyclerView) {
        }

        public abstract int b();

        public long b(int i) {
            return -1;
        }

        public void b(VH vh) {
        }

        public void b(RecyclerView recyclerView) {
        }

        public void c(VH vh) {
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

        public void a(c cVar) {
            this.b.registerObserver(cVar);
        }

        public final void b(c cVar) {
            this.b.unregisterObserver(cVar);
        }

        public final void e() {
            this.b.b();
        }

        public final void d_(int i) {
            this.b.a(i, 1);
        }

        public final void a(int i, int i2) {
            this.b.a(i, i2);
        }

        public final void a(int i, int i2, Object obj) {
            this.b.a(i, i2, obj);
        }

        public final void d(int i) {
            this.b.b(i, 1);
        }

        public final void b(int i, int i2) {
            this.b.d(i, i2);
        }

        public final void c(int i, int i2) {
            this.b.b(i, i2);
        }

        public final void e(int i) {
            this.b.c(i, 1);
        }

        public final void d(int i, int i2) {
            this.b.c(i, i2);
        }

        public final void a(boolean z) {
            if (!this.b.a()) {
                this.c = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    public static class b extends Observable<c> {
        b() {
        }

        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a();
            }
        }

        public final void a(int i, int i2) {
            a(i, i2, null);
        }

        public final void a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i, i2, obj);
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

        public void b(int i, int i2) {
        }

        public void c(int i, int i2) {
        }

        public void a(int i, int i2, Object obj) {
            a(i, i2);
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

        public abstract void a();

        public abstract boolean a(u uVar, b bVar, b bVar2);

        public abstract boolean a(u uVar, u uVar2, b bVar, b bVar2);

        public abstract boolean b();

        public abstract boolean b(u uVar, b bVar, b bVar2);

        public abstract void c(u uVar);

        public abstract boolean c(u uVar, b bVar, b bVar2);

        public abstract void d();

        public boolean g(u uVar) {
            return true;
        }

        public long e() {
            return this.b;
        }

        public long f() {
            return this.c;
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

        public final void f(u uVar) {
            a aVar = this.h;
            if (aVar != null) {
                aVar.a(uVar);
            }
        }

        public boolean a(u uVar, List<Object> list) {
            return g(uVar);
        }

        public final void g() {
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.a.get(i2);
            }
            this.a.clear();
        }

        public final b d(u uVar) {
            return new b().a(uVar);
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

        public void b(Canvas canvas, RecyclerView recyclerView) {
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            view.getLayoutParams();
            rect.set(0, 0, 0, 0);
        }
    }

    public static abstract class i {
        private nt a;
        private final defpackage.op.b b = new defpackage.op.b() {
            public final View a(int i) {
                return i.this.g(i);
            }

            public final int a() {
                return i.this.getPaddingLeft();
            }

            public final int b() {
                return i.this.u - i.this.getPaddingRight();
            }

            public final int a(View view) {
                return i.this.k(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            public final int b(View view) {
                return i.this.m(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        };
        private final defpackage.op.b c = new defpackage.op.b() {
            public final View a(int i) {
                return i.this.g(i);
            }

            public final int a() {
                return i.this.getPaddingTop();
            }

            public final int b() {
                return i.this.v - i.this.getPaddingBottom();
            }

            public final int a(View view) {
                return i.this.l(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            public final int b(View view) {
                return i.this.n(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        };
        public RecyclerView h;
        op i = new op(this.b);
        op j = new op(this.c);
        r k;
        public boolean l = false;
        boolean m = false;
        protected boolean n = false;
        public boolean o = true;
        public boolean p = true;
        public int q;
        public boolean r;
        public int s;
        public int t;
        public int u;
        public int v;

        public interface a {
            void a(int i, int i2);
        }

        public static class b {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public int a(int i2, o oVar, s sVar) {
            return 0;
        }

        public View a(View view, int i2, o oVar, s sVar) {
            return null;
        }

        public abstract LayoutParams a();

        public void a(int i2, int i3, s sVar, a aVar) {
        }

        public void a(int i2, a aVar) {
        }

        public void a(Parcelable parcelable) {
        }

        public void a(a aVar, a aVar2) {
        }

        public void a(s sVar) {
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void a(RecyclerView recyclerView, o oVar) {
        }

        public boolean a(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public int b(int i2, o oVar, s sVar) {
            return 0;
        }

        public int b(s sVar) {
            return 0;
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        public int c(s sVar) {
            return 0;
        }

        public void c(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d(s sVar) {
            return 0;
        }

        public Parcelable d() {
            return null;
        }

        public void d(RecyclerView recyclerView) {
        }

        public int e(s sVar) {
            return 0;
        }

        public void e(int i2) {
        }

        public boolean e() {
            return false;
        }

        public int f(s sVar) {
            return 0;
        }

        public boolean f() {
            return false;
        }

        public int g(s sVar) {
            return 0;
        }

        public void j(int i2) {
        }

        public boolean q_() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean r_() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void b(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.h = null;
                this.a = null;
                this.u = 0;
                this.v = 0;
            } else {
                this.h = recyclerView;
                this.a = recyclerView.g;
                this.u = recyclerView.getWidth();
                this.v = recyclerView.getHeight();
            }
            this.s = 1073741824;
            this.t = 1073741824;
        }

        /* access modifiers changed from: 0000 */
        public final void b(int i2, int i3) {
            this.u = MeasureSpec.getSize(i2);
            this.s = MeasureSpec.getMode(i2);
            if (this.s == 0 && !RecyclerView.b) {
                this.u = 0;
            }
            this.v = MeasureSpec.getSize(i3);
            this.t = MeasureSpec.getMode(i3);
            if (this.t == 0 && !RecyclerView.b) {
                this.v = 0;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c(int i2, int i3) {
            int r2 = r();
            if (r2 == 0) {
                this.h.d(i2, i3);
                return;
            }
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < r2; i8++) {
                View g = g(i8);
                Rect rect = this.h.k;
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
            this.h.k.set(i4, i5, i6, i7);
            a(this.h.k, i2, i3);
        }

        public void a(Rect rect, int i2, int i3) {
            d(a(i2, rect.width() + getPaddingLeft() + getPaddingRight(), ip.l(this.h)), a(i3, rect.height() + getPaddingTop() + getPaddingBottom(), ip.m(this.h)));
        }

        public final void o_() {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
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

        public void a(String str) {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                recyclerView.a(str);
            }
        }

        public boolean p_() {
            return this.n;
        }

        /* access modifiers changed from: 0000 */
        public final void c(RecyclerView recyclerView) {
            this.m = true;
            d(recyclerView);
        }

        /* access modifiers changed from: 0000 */
        public final void b(RecyclerView recyclerView, o oVar) {
            this.m = false;
            a(recyclerView, oVar);
        }

        public final boolean a(Runnable runnable) {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public final boolean o() {
            RecyclerView recyclerView = this.h;
            return recyclerView != null && recyclerView.i;
        }

        public void c(o oVar, s sVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public LayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new LayoutParams((MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public LayoutParams a(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void a(RecyclerView recyclerView, s sVar, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void a(r rVar) {
            r rVar2 = this.k;
            if (!(rVar2 == null || rVar == rVar2 || !rVar2.f)) {
                this.k.b();
            }
            this.k = rVar;
            r rVar3 = this.k;
            RecyclerView recyclerView = this.h;
            if (rVar3.h) {
                StringBuilder sb = new StringBuilder("An instance of ");
                sb.append(rVar3.getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(rVar3.getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for ");
                sb.append("each use.");
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

        public final boolean p() {
            r rVar = this.k;
            return rVar != null && rVar.f;
        }

        public final void a(View view, int i2) {
            a(view, i2, true);
        }

        public final void b(View view, int i2) {
            a(view, i2, false);
        }

        private void a(View view, int i2, boolean z) {
            u d = RecyclerView.d(view);
            if (z || d.n()) {
                this.h.h.c(d);
            } else {
                this.h.h.d(d);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (d.h() || d.f()) {
                if (d.f()) {
                    d.g();
                } else {
                    d.i();
                }
                this.a.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.h) {
                int c2 = this.a.c(view);
                if (i2 == -1) {
                    i2 = this.a.a();
                }
                if (c2 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.h.indexOfChild(view));
                    sb.append(this.h.a());
                    throw new IllegalStateException(sb.toString());
                } else if (c2 != i2) {
                    this.h.n.a(c2, i2);
                }
            } else {
                this.a.a(view, i2, false);
                layoutParams.e = true;
                r rVar = this.k;
                if (rVar != null && rVar.f) {
                    this.k.a(view);
                }
            }
            if (layoutParams.f) {
                d.o.invalidate();
                layoutParams.f = false;
            }
        }

        public final void b(View view) {
            nt ntVar = this.a;
            int a2 = ntVar.a.a(view);
            if (a2 >= 0) {
                if (ntVar.b.d(a2)) {
                    ntVar.b(view);
                }
                ntVar.a.a(a2);
            }
        }

        private void a(int i2) {
            if (g(i2) != null) {
                this.a.a(i2);
            }
        }

        public final void q() {
            for (int r2 = r() - 1; r2 >= 0; r2--) {
                this.a.a(r2);
            }
        }

        public static int c(View view) {
            return ((LayoutParams) view.getLayoutParams()).c.d();
        }

        public static int d(View view) {
            return RecyclerView.d(view).t;
        }

        public final View e(View view) {
            RecyclerView recyclerView = this.h;
            if (recyclerView == null) {
                return null;
            }
            View c2 = recyclerView.c(view);
            if (c2 != null && !this.a.d(c2)) {
                return c2;
            }
            return null;
        }

        public View c(int i2) {
            int r2 = r();
            for (int i3 = 0; i3 < r2; i3++) {
                View g = g(i3);
                u d = RecyclerView.d(g);
                if (d != null && d.d() == i2 && !d.c() && (this.h.E.g || !d.n())) {
                    return g;
                }
            }
            return null;
        }

        public final void f(View view) {
            int c2 = this.a.c(view);
            if (c2 >= 0) {
                d(c2);
            }
        }

        private void b(int i2) {
            g(i2);
            d(i2);
        }

        private void d(int i2) {
            this.a.d(i2);
        }

        public final void c(View view, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            u d = RecyclerView.d(view);
            if (d.n()) {
                this.h.h.c(d);
            } else {
                this.h.h.d(d);
            }
            this.a.a(view, i2, layoutParams, d.n());
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
            sb.append(this.h.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        public final void a(View view, o oVar) {
            b(view);
            oVar.a(view);
        }

        public final void a(int i2, o oVar) {
            View g = g(i2);
            a(i2);
            oVar.a(g);
        }

        public final int r() {
            nt ntVar = this.a;
            if (ntVar != null) {
                return ntVar.a();
            }
            return 0;
        }

        public final View g(int i2) {
            nt ntVar = this.a;
            if (ntVar != null) {
                return ntVar.b(i2);
            }
            return null;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                return ip.i(recyclerView);
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                return ip.j(recyclerView);
            }
            return 0;
        }

        public final View s() {
            RecyclerView recyclerView = this.h;
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
            RecyclerView recyclerView = this.h;
            a c2 = recyclerView != null ? recyclerView.c() : null;
            if (c2 != null) {
                return c2.b();
            }
            return 0;
        }

        public void h(int i2) {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                int a2 = recyclerView.g.a();
                for (int i3 = 0; i3 < a2; i3++) {
                    recyclerView.g.b(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public void i(int i2) {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                int a2 = recyclerView.g.a();
                for (int i3 = 0; i3 < a2; i3++) {
                    recyclerView.g.b(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public final void g(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.h;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                StringBuilder sb = new StringBuilder("View should be fully attached to be ignored");
                sb.append(this.h.a());
                throw new IllegalArgumentException(sb.toString());
            }
            u d = RecyclerView.d(view);
            d.b(128);
            this.h.h.e(d);
        }

        public static void h(View view) {
            u d = RecyclerView.d(view);
            d.x &= -129;
            d.r();
            d.b(4);
        }

        public final void a(o oVar) {
            for (int r2 = r() - 1; r2 >= 0; r2--) {
                a(oVar, r2, g(r2));
            }
        }

        private void a(o oVar, int i2, View view) {
            u d = RecyclerView.d(view);
            if (!d.c()) {
                if (!d.k() || d.n() || this.h.m.c) {
                    b(i2);
                    oVar.c(view);
                    this.h.h.d(d);
                    return;
                }
                a(i2);
                oVar.a(d);
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(View view, int i2, int i3, LayoutParams layoutParams) {
            return !this.o || !b(view.getMeasuredWidth(), i2, layoutParams.width) || !b(view.getMeasuredHeight(), i3, layoutParams.height);
        }

        /* access modifiers changed from: protected */
        public final boolean b(View view, int i2, int i3, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.o || !b(view.getWidth(), i2, layoutParams.width) || !b(view.getHeight(), i3, layoutParams.height);
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

        public final void a_(View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect h2 = this.h.h(view);
            int i4 = h2.top + h2.bottom + 0;
            int a2 = a(this.u, this.s, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + h2.left + h2.right + 0, layoutParams.width, e());
            int a3 = a(this.v, this.t, getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, f());
            if (b(view, a2, a3, layoutParams)) {
                view.measure(a2, a3);
            }
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

        public final int i(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int j(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static void a(View view, int i2, int i3, int i4, int i5) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).d;
            view.layout(i2 + rect.left, i3 + rect.top, i4 - rect.right, i5 - rect.bottom);
        }

        public static void b(View view, int i2, int i3, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.d;
            view.layout(i2 + rect.left + layoutParams.leftMargin, i3 + rect.top + layoutParams.topMargin, (i4 - rect.right) - layoutParams.rightMargin, (i5 - rect.bottom) - layoutParams.bottomMargin);
        }

        public final void a(View view, boolean z, Rect rect) {
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).d;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.h != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.h.l;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public static void a(View view, Rect rect) {
            RecyclerView.b(view, rect);
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

        public final void b(View view, Rect rect) {
            RecyclerView recyclerView = this.h;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.h(view));
            }
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

        private int[] c(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.u - getPaddingRight();
            int paddingBottom = this.v - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - paddingLeft;
            int min = Math.min(0, i2);
            int i3 = top - paddingTop;
            int min2 = Math.min(0, i3);
            int i4 = width - paddingRight;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - paddingBottom);
            if (ip.f(this.h) != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public final boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c2 = c(view, rect);
            int i2 = c2[0];
            int i3 = c2[1];
            if ((z2 && !d(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.a(i2, i3, (Interpolator) null);
            }
            return true;
        }

        private boolean d(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.u - getPaddingRight();
            int paddingBottom = this.v - getPaddingBottom();
            Rect rect = this.h.k;
            RecyclerView.b(focusedChild, rect);
            if (rect.left - i2 >= paddingRight || rect.right - i2 <= paddingLeft || rect.top - i3 >= paddingBottom || rect.bottom - i3 <= paddingTop) {
                return false;
            }
            return true;
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c(recyclerView, i2, i3);
        }

        public void a(o oVar, s sVar, int i2, int i3) {
            this.h.d(i2, i3);
        }

        public final void d(int i2, int i3) {
            this.h.setMeasuredDimension(i2, i3);
        }

        /* access modifiers changed from: 0000 */
        public final void u() {
            r rVar = this.k;
            if (rVar != null) {
                rVar.b();
            }
        }

        public final void c(o oVar) {
            for (int r2 = r() - 1; r2 >= 0; r2--) {
                if (!RecyclerView.d(g(r2)).c()) {
                    a(r2, oVar);
                }
            }
        }

        public final void a(View view, ja jaVar) {
            u d = RecyclerView.d(view);
            if (d != null && !d.n() && !this.a.d(d.o)) {
                a(this.h.e, this.h.E, view, jaVar);
            }
        }

        public void a(o oVar, s sVar, View view, ja jaVar) {
            jaVar.a((Object) defpackage.ja.c.a(f() ? c(view) : 0, 1, e() ? c(view) : 0, 1, false, false));
        }

        public int a(o oVar, s sVar) {
            RecyclerView recyclerView = this.h;
            if (recyclerView == null || recyclerView.m == null || !f()) {
                return 1;
            }
            return this.h.m.b();
        }

        public int b(o oVar, s sVar) {
            RecyclerView recyclerView = this.h;
            if (recyclerView == null || recyclerView.m == null || !e()) {
                return 1;
            }
            return this.h.m.b();
        }

        public static b a(Context context, AttributeSet attributeSet, int i2, int i3) {
            b bVar = new b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.np.a.a, i2, i3);
            bVar.a = obtainStyledAttributes.getInt(defpackage.np.a.b, 1);
            bVar.b = obtainStyledAttributes.getInt(defpackage.np.a.k, 1);
            bVar.c = obtainStyledAttributes.getBoolean(defpackage.np.a.j, false);
            bVar.d = obtainStyledAttributes.getBoolean(defpackage.np.a.l, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        public final void e(RecyclerView recyclerView) {
            b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void a(View view) {
            a(view, -1, false);
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
                        this.h.removeDetachedView(view, false);
                    }
                    if (this.h.x != null) {
                        this.h.x.c(d);
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
                this.h.invalidate();
            }
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.h.canScrollVertically(-1) && !this.h.canScrollHorizontally(-1) && !this.h.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.h.m != null) {
                    accessibilityEvent.setItemCount(this.h.m.b());
                }
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

        public final u a(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<u> arrayList = aVar.a;
            return (u) arrayList.remove(arrayList.size() - 1);
        }

        static long a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, long j) {
            a b2 = b(i);
            b2.c = a(b2.c, j);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(int i, long j, long j2) {
            long j3 = b(i).c;
            return j3 == 0 || j + j3 < j2;
        }

        public final void a() {
            this.b++;
        }

        public final void b() {
            this.b--;
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

        public final void a(u uVar) {
            int i = uVar.t;
            ArrayList<u> arrayList = b(i).a;
            if (((a) this.a.get(i)).b > arrayList.size()) {
                uVar.r();
                arrayList.add(uVar);
            }
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

        public final void a() {
            this.a.clear();
            g();
        }

        public final void b() {
            this.h = this.g + (RecyclerView.this.n != null ? RecyclerView.this.n.q : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.h; size--) {
                c(size);
            }
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
            } else if (!RecyclerView.this.E.g && RecyclerView.this.m.a(uVar.q) != uVar.t) {
                return false;
            } else {
                if (!RecyclerView.this.m.c || uVar.s == RecyclerView.this.m.b(uVar.q)) {
                    return true;
                }
                return false;
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
            uVar.q();
            aVar.a(uVar, i);
            uVar.p();
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
                if (!ip.b(view)) {
                    uVar.b(16384);
                    ip.a(view, RecyclerView.this.I.d);
                }
            }
            if (RecyclerView.this.E.g) {
                uVar.u = i2;
            }
            return true;
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

        public final int a(int i) {
            if (i < 0 || i >= RecyclerView.this.E.a()) {
                StringBuilder sb = new StringBuilder("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.E.a());
                sb.append(RecyclerView.this.a());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.E.g) {
                return i;
            } else {
                return RecyclerView.this.f.b(i);
            }
        }

        public final View b(int i) {
            return a(i, false);
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
                nq r5 = r5.f
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
                r1.r()
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
                r10.q()
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
                nq r0 = r0.f
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

        private void d(u uVar) {
            if (uVar.o instanceof ViewGroup) {
                a((ViewGroup) uVar.o, false);
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

        /* access modifiers changed from: 0000 */
        public final void c(int i) {
            a((u) this.c.get(i), true);
            this.c.remove(i);
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
                boolean t = uVar.t();
                if (uVar.s()) {
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
                if (!z && !z2 && t) {
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
            if (uVar.a(16384)) {
                uVar.a(0, 16384);
                ip.a(uVar.o, (ht) null);
            }
            if (z) {
                e(uVar);
            }
            uVar.C = null;
            c().a(uVar);
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
        public final void c(View view) {
            u d2 = RecyclerView.d(view);
            if (!d2.a(12) && d2.u() && !RecyclerView.this.a(d2)) {
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
                nt ntVar = RecyclerView.this.g;
                int size2 = ntVar.c.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        view = null;
                        break;
                    }
                    view = (View) ntVar.c.get(i4);
                    u b2 = ntVar.a.b(view);
                    if (b2.d() == i && !b2.k() && !b2.n()) {
                        break;
                    }
                    i4++;
                }
                if (view != null) {
                    u d2 = RecyclerView.d(view);
                    nt ntVar2 = RecyclerView.this.g;
                    int a2 = ntVar2.a.a(view);
                    if (a2 < 0) {
                        StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
                        sb.append(view);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (ntVar2.b.c(a2)) {
                        ntVar2.b.b(a2);
                        ntVar2.b(view);
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
                if (uVar2.k() || uVar2.d() != i) {
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
                if (uVar2.s == j) {
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

        private void e(u uVar) {
            if (RecyclerView.this.m != null) {
                RecyclerView.this.m.a(uVar);
            }
            RecyclerView.this.h.e(uVar);
        }

        /* access modifiers changed from: 0000 */
        public final void a(a aVar, a aVar2, boolean z) {
            a();
            c().a(aVar, aVar2, z);
        }

        public final n c() {
            if (this.e == null) {
                this.e = new n();
            }
            return this.e;
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

        public final void a() {
            RecyclerView.this.a((String) null);
            RecyclerView.this.E.f = true;
            RecyclerView.this.b(true);
            if (!RecyclerView.this.f.d()) {
                RecyclerView.this.requestLayout();
            }
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
                nq r0 = r0.f
                r1 = 1
                if (r6 > 0) goto L_0x000e
                goto L_0x0026
            L_0x000e:
                java.util.ArrayList<nq$b> r2 = r0.a
                r3 = 4
                nq$b r5 = r0.a(r3, r5, r6, r7)
                r2.add(r5)
                int r5 = r0.b
                r5 = r5 | r3
                r0.b = r5
                java.util.ArrayList<nq$b> r5 = r0.a
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
                nq r0 = r0.f
                r2 = 1
                if (r6 > 0) goto L_0x000e
                goto L_0x0025
            L_0x000e:
                java.util.ArrayList<nq$b> r3 = r0.a
                nq$b r5 = r0.a(r2, r5, r6, r1)
                r3.add(r5)
                int r5 = r0.b
                r5 = r5 | r2
                r0.b = r5
                java.util.ArrayList<nq$b> r5 = r0.a
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
                nq r0 = r0.f
                r2 = 1
                if (r7 > 0) goto L_0x000e
                goto L_0x0026
            L_0x000e:
                java.util.ArrayList<nq$b> r3 = r0.a
                r4 = 2
                nq$b r6 = r0.a(r4, r6, r7, r1)
                r3.add(r6)
                int r6 = r0.b
                r6 = r6 | r4
                r0.b = r6
                java.util.ArrayList<nq$b> r6 = r0.a
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
                nq r7 = r7.f
                r1 = 1
                if (r5 == r6) goto L_0x0026
                java.util.ArrayList<nq$b> r2 = r7.a
                r3 = 8
                nq$b r5 = r7.a(r3, r5, r6, r0)
                r2.add(r5)
                int r5 = r7.b
                r5 = r5 | r3
                r7.b = r5
                java.util.ArrayList<nq$b> r5 = r7.a
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
    }

    public static class q extends jt {
        public static final Creator<q> CREATOR = new ClassLoaderCreator<q>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new q(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new q[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new q(parcel, null);
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

            /* access modifiers changed from: 0000 */
            public final void a(RecyclerView recyclerView) {
                int i = this.a;
                if (i >= 0) {
                    this.a = -1;
                    recyclerView.e(i);
                    this.f = false;
                } else if (this.f) {
                    a();
                    if (this.e != null) {
                        recyclerView.B.a(this.b, this.c, this.d, this.e);
                    } else if (this.d == Integer.MIN_VALUE) {
                        recyclerView.B.a(this.b, this.c);
                    } else {
                        recyclerView.B.a(this.b, this.c, this.d);
                    }
                    this.g++;
                    if (this.g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
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
        }

        public interface b {
            PointF d(int i);
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public abstract void a(int i, int i2, a aVar);

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
                if (iVar.k == this) {
                    iVar.k = null;
                }
                this.d = null;
                this.c = null;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, int i2) {
            RecyclerView recyclerView = this.c;
            if (!this.f || this.b == -1 || recyclerView == null) {
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
                if (z) {
                    if (this.f) {
                        this.e = true;
                        recyclerView.B.a();
                        return;
                    }
                    b();
                }
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

        /* access modifiers changed from: protected */
        public final void a(View view) {
            if (RecyclerView.f(view) == this.b) {
                this.g = view;
            }
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

        public final int a() {
            return this.g ? this.b - this.c : this.e;
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
        private Interpolator e = RecyclerView.L;
        private boolean f = false;
        private boolean g = false;

        t() {
            this.c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.L);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
            if (r8 > 0) goto L_0x00e9;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r23 = this;
                r0 = r23
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r1 = r1.n
                if (r1 != 0) goto L_0x000c
                r23.b()
                return
            L_0x000c:
                r1 = 0
                r0.g = r1
                r2 = 1
                r0.f = r2
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                r3.e()
                android.widget.OverScroller r3 = r0.c
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r4 = r4.n
                androidx.recyclerview.widget.RecyclerView$r r4 = r4.k
                boolean r5 = r3.computeScrollOffset()
                if (r5 == 0) goto L_0x018f
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int[] r5 = r5.J
                int r12 = r3.getCurrX()
                int r13 = r3.getCurrY()
                int r6 = r0.a
                int r14 = r12 - r6
                int r6 = r0.b
                int r15 = r13 - r6
                r0.a = r12
                r0.b = r13
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r10 = 0
                r11 = 1
                r7 = r14
                r8 = r15
                r9 = r5
                boolean r6 = r6.a(r7, r8, r9, r10, r11)
                if (r6 == 0) goto L_0x0050
                r6 = r5[r1]
                int r14 = r14 - r6
                r5 = r5[r2]
                int r15 = r15 - r5
            L_0x0050:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r5 = r5.m
                if (r5 == 0) goto L_0x0094
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int[] r6 = r5.K
                r5.a(r14, r15, r6)
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int[] r5 = r5.K
                r5 = r5[r1]
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                int[] r6 = r6.K
                r6 = r6[r2]
                int r7 = r14 - r5
                int r8 = r15 - r6
                if (r4 == 0) goto L_0x0098
                boolean r9 = r4.e
                if (r9 != 0) goto L_0x0098
                boolean r9 = r4.f
                if (r9 == 0) goto L_0x0098
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r9 = r9.E
                int r9 = r9.a()
                if (r9 != 0) goto L_0x0085
                r4.b()
                goto L_0x0098
            L_0x0085:
                int r10 = r4.b
                if (r10 < r9) goto L_0x008c
                int r9 = r9 - r2
                r4.b = r9
            L_0x008c:
                int r9 = r14 - r7
                int r10 = r15 - r8
                r4.a(r9, r10)
                goto L_0x0098
            L_0x0094:
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
            L_0x0098:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$h> r9 = r9.o
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00a7
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                r9.invalidate()
            L_0x00a7:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00b5
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                r9.b(r14, r15)
            L_0x00b5:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                r21 = 0
                r22 = 1
                r16 = r9
                r17 = r5
                r18 = r6
                r19 = r7
                r20 = r8
                boolean r9 = r16.a(r17, r18, r19, r20, r21, r22)
                if (r9 != 0) goto L_0x010d
                if (r7 != 0) goto L_0x00cf
                if (r8 == 0) goto L_0x010d
            L_0x00cf:
                float r9 = r3.getCurrVelocity()
                int r9 = (int) r9
                if (r7 == r12) goto L_0x00de
                if (r7 >= 0) goto L_0x00da
                int r11 = -r9
                goto L_0x00df
            L_0x00da:
                if (r7 <= 0) goto L_0x00de
                r11 = r9
                goto L_0x00df
            L_0x00de:
                r11 = 0
            L_0x00df:
                if (r8 == r13) goto L_0x00e8
                if (r8 >= 0) goto L_0x00e5
                int r9 = -r9
                goto L_0x00e9
            L_0x00e5:
                if (r8 <= 0) goto L_0x00e8
                goto L_0x00e9
            L_0x00e8:
                r9 = 0
            L_0x00e9:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                int r1 = r1.getOverScrollMode()
                if (r1 == r10) goto L_0x00f6
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.c(r11, r9)
            L_0x00f6:
                if (r11 != 0) goto L_0x0100
                if (r7 == r12) goto L_0x0100
                int r1 = r3.getFinalX()
                if (r1 != 0) goto L_0x010d
            L_0x0100:
                if (r9 != 0) goto L_0x010a
                if (r8 == r13) goto L_0x010a
                int r1 = r3.getFinalY()
                if (r1 != 0) goto L_0x010d
            L_0x010a:
                r3.abortAnimation()
            L_0x010d:
                if (r5 != 0) goto L_0x0111
                if (r6 == 0) goto L_0x0116
            L_0x0111:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.f(r5, r6)
            L_0x0116:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                boolean r1 = r1.awakenScrollBars()
                if (r1 != 0) goto L_0x0123
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.invalidate()
            L_0x0123:
                if (r15 == 0) goto L_0x0133
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r1 = r1.n
                boolean r1 = r1.f()
                if (r1 == 0) goto L_0x0133
                if (r6 != r15) goto L_0x0133
                r1 = 1
                goto L_0x0134
            L_0x0133:
                r1 = 0
            L_0x0134:
                if (r14 == 0) goto L_0x0144
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r6 = r6.n
                boolean r6 = r6.e()
                if (r6 == 0) goto L_0x0144
                if (r5 != r14) goto L_0x0144
                r5 = 1
                goto L_0x0145
            L_0x0144:
                r5 = 0
            L_0x0145:
                if (r14 != 0) goto L_0x0149
                if (r15 == 0) goto L_0x0150
            L_0x0149:
                if (r5 != 0) goto L_0x0150
                if (r1 == 0) goto L_0x014e
                goto L_0x0150
            L_0x014e:
                r1 = 0
                goto L_0x0151
            L_0x0150:
                r1 = 1
            L_0x0151:
                boolean r3 = r3.isFinished()
                if (r3 != 0) goto L_0x0179
                if (r1 != 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                ig r1 = r1.n()
                boolean r1 = r1.a(r2)
                if (r1 != 0) goto L_0x0166
                goto L_0x0179
            L_0x0166:
                r23.a()
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                ny r1 = r1.C
                if (r1 == 0) goto L_0x018f
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                ny r1 = r1.C
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                r1.a(r2, r14, r15)
                goto L_0x018f
            L_0x0179:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r3 = 0
                r1.c(r3)
                boolean r1 = androidx.recyclerview.widget.RecyclerView.d
                if (r1 == 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                ny$a r1 = r1.D
                r1.a()
            L_0x018a:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.a(r2)
            L_0x018f:
                if (r4 == 0) goto L_0x01a3
                boolean r1 = r4.e
                if (r1 == 0) goto L_0x019a
                r1 = 0
                r4.a(r1, r1)
                goto L_0x019b
            L_0x019a:
                r1 = 0
            L_0x019b:
                boolean r2 = r0.g
                if (r2 != 0) goto L_0x01a4
                r4.b()
                goto L_0x01a4
            L_0x01a3:
                r1 = 0
            L_0x01a4:
                r0.f = r1
                boolean r1 = r0.g
                if (r1 == 0) goto L_0x01ad
                r23.a()
            L_0x01ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.run():void");
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.f) {
                this.g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            ip.a((View) RecyclerView.this, (Runnable) this);
        }

        public final void a(int i, int i2) {
            a(i, i2, 0, 0);
        }

        private void a(int i, int i2, int i3, int i4) {
            a(i, i2, b(i, i2, 0, 0));
        }

        private static float a(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private int b(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
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

        public final void a(int i, int i2, int i3) {
            a(i, i2, i3, RecyclerView.L);
        }

        public final void a(int i, int i2, Interpolator interpolator) {
            int b2 = b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.L;
            }
            a(i, i2, b2, interpolator);
        }

        public final void a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.e != interpolator) {
                this.e = interpolator;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.c(2);
            this.b = 0;
            this.a = 0;
            this.c.startScroll(0, 0, i, i2, i3);
            if (VERSION.SDK_INT < 23) {
                this.c.computeScrollOffset();
            }
            a();
        }

        public final void b() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
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
        long s = -1;
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
        public final void a() {
            this.r = -1;
            this.u = -1;
        }

        /* access modifiers changed from: 0000 */
        public final void aD_() {
            if (this.r == -1) {
                this.r = this.q;
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

        /* access modifiers changed from: 0000 */
        public final void a(o oVar, boolean z2) {
            this.y = oVar;
            this.z = z2;
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
        public final boolean a(int i) {
            return (i & this.x) != 0;
        }

        /* access modifiers changed from: 0000 */
        public final boolean o() {
            return (this.x & 256) != 0;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, int i2) {
            this.x = (i & i2) | (this.x & (i2 ^ -1));
        }

        /* access modifiers changed from: 0000 */
        public final void b(int i) {
            this.x = i | this.x;
        }

        /* access modifiers changed from: 0000 */
        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
                return;
            }
            if ((1024 & this.x) == 0) {
                v();
                this.b.add(obj);
            }
        }

        private void v() {
            if (this.b == null) {
                this.b = new ArrayList();
                this.c = Collections.unmodifiableList(this.b);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void p() {
            List<Object> list = this.b;
            if (list != null) {
                list.clear();
            }
            this.x &= -1025;
        }

        /* access modifiers changed from: 0000 */
        public final List<Object> q() {
            if ((this.x & 1024) != 0) {
                return a;
            }
            List<Object> list = this.b;
            if (list == null || list.size() == 0) {
                return a;
            }
            return this.c;
        }

        /* access modifiers changed from: 0000 */
        public final void r() {
            this.x = 0;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.u = -1;
            this.d = 0;
            this.v = null;
            this.w = null;
            p();
            this.A = 0;
            this.B = -1;
            RecyclerView.b(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{");
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
            if (!s()) {
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

        public final boolean s() {
            return (this.x & 16) == 0 && !ip.c(this.o);
        }

        /* access modifiers changed from: 0000 */
        public final boolean t() {
            return (this.x & 16) == 0 && ip.c(this.o);
        }

        /* access modifiers changed from: 0000 */
        public final boolean u() {
            return (this.x & 2) != 0;
        }
    }

    public void e(int i2, int i3) {
    }

    public void h(int i2) {
    }

    public void scrollTo(int i2, int i3) {
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0367  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            java.lang.String r14 = ": Could not instantiate the LayoutManager: "
            r21.<init>(r22, r23, r24)
            androidx.recyclerview.widget.RecyclerView$p r0 = new androidx.recyclerview.widget.RecyclerView$p
            r0.<init>()
            r10.R = r0
            androidx.recyclerview.widget.RecyclerView$o r0 = new androidx.recyclerview.widget.RecyclerView$o
            r0.<init>()
            r10.e = r0
            oq r0 = new oq
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
            r10.T = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.U = r0
            r15 = 0
            r10.aa = r15
            r10.w = r15
            r10.ae = r15
            r10.af = r15
            r10.ag = r15
            androidx.recyclerview.widget.RecyclerView$e r0 = new androidx.recyclerview.widget.RecyclerView$e
            r0.<init>()
            r10.ah = r0
            nu r0 = new nu
            r0.<init>()
            r10.x = r0
            r10.y = r15
            r0 = -1
            r10.am = r0
            r1 = 1
            r10.au = r1
            r10.av = r1
            r9 = 1
            r10.aw = r9
            androidx.recyclerview.widget.RecyclerView$t r1 = new androidx.recyclerview.widget.RecyclerView$t
            r1.<init>()
            r10.B = r1
            boolean r1 = d
            r16 = 0
            if (r1 == 0) goto L_0x0085
            ny$a r1 = new ny$a
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
            r10.ay = r1
            r10.H = r15
            r8 = 2
            int[] r1 = new int[r8]
            r10.aA = r1
            int[] r1 = new int[r8]
            r10.aC = r1
            int[] r1 = new int[r8]
            r10.J = r1
            int[] r1 = new int[r8]
            r10.aD = r1
            int[] r1 = new int[r8]
            r10.K = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.aE = r1
            androidx.recyclerview.widget.RecyclerView$2 r1 = new androidx.recyclerview.widget.RecyclerView$2
            r1.<init>()
            r10.aF = r1
            androidx.recyclerview.widget.RecyclerView$4 r1 = new androidx.recyclerview.widget.RecyclerView$4
            r1.<init>()
            r10.aG = r1
            if (r12 == 0) goto L_0x00d9
            int[] r1 = N
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r13, r15)
            boolean r2 = r1.getBoolean(r15, r9)
            r10.i = r2
            r1.recycle()
            goto L_0x00db
        L_0x00d9:
            r10.i = r9
        L_0x00db:
            r10.setScrollContainer(r9)
            r10.setFocusableInTouchMode(r9)
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r22)
            int r2 = r1.getScaledTouchSlop()
            r10.as = r2
            float r2 = defpackage.iq.a(r1, r11)
            r10.au = r2
            float r2 = defpackage.iq.b(r1, r11)
            r10.av = r2
            int r2 = r1.getScaledMinimumFlingVelocity()
            r10.A = r2
            int r1 = r1.getScaledMaximumFlingVelocity()
            r10.at = r1
            int r1 = r21.getOverScrollMode()
            if (r1 != r8) goto L_0x010b
            r1 = 1
            goto L_0x010c
        L_0x010b:
            r1 = 0
        L_0x010c:
            r10.setWillNotDraw(r1)
            androidx.recyclerview.widget.RecyclerView$f r1 = r10.x
            androidx.recyclerview.widget.RecyclerView$f$a r2 = r10.ay
            r1.h = r2
            nq r1 = new nq
            androidx.recyclerview.widget.RecyclerView$6 r2 = new androidx.recyclerview.widget.RecyclerView$6
            r2.<init>()
            r1.<init>(r2)
            r10.f = r1
            nt r1 = new nt
            androidx.recyclerview.widget.RecyclerView$5 r2 = new androidx.recyclerview.widget.RecyclerView$5
            r2.<init>()
            r1.<init>(r2)
            r10.g = r1
            int r1 = defpackage.ip.a(r21)
            if (r1 != 0) goto L_0x0138
            r1 = 8
            defpackage.ip.a(r10, r1)
        L_0x0138:
            int r1 = defpackage.ip.e(r21)
            if (r1 != 0) goto L_0x0141
            defpackage.ip.b(r10, r9)
        L_0x0141:
            android.content.Context r1 = r21.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.ad = r1
            oj r1 = new oj
            r1.<init>(r10)
            r10.I = r1
            oj r1 = r10.I
            defpackage.ip.a(r10, r1)
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r12 == 0) goto L_0x036a
            int[] r2 = defpackage.np.a.a
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r12, r2, r13, r15)
            int r2 = defpackage.np.a.i
            java.lang.String r17 = r7.getString(r2)
            int r2 = defpackage.np.a.c
            int r2 = r7.getInt(r2, r0)
            if (r2 != r0) goto L_0x0176
            r10.setDescendantFocusability(r1)
        L_0x0176:
            int r0 = defpackage.np.a.d
            boolean r0 = r7.getBoolean(r0, r15)
            r10.W = r0
            boolean r0 = r10.W
            if (r0 == 0) goto L_0x01ee
            int r0 = defpackage.np.a.g
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r3 = r0
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            int r0 = defpackage.np.a.h
            android.graphics.drawable.Drawable r4 = r7.getDrawable(r0)
            int r0 = defpackage.np.a.e
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r5 = r0
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            int r0 = defpackage.np.a.f
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r0)
            if (r3 == 0) goto L_0x01d6
            if (r4 == 0) goto L_0x01d6
            if (r5 == 0) goto L_0x01d6
            if (r6 == 0) goto L_0x01d6
            android.content.Context r0 = r21.getContext()
            android.content.res.Resources r0 = r0.getResources()
            nx r1 = new nx
            r2 = 2131165674(0x7f0701ea, float:1.7945572E38)
            int r18 = r0.getDimensionPixelSize(r2)
            r2 = 2131165676(0x7f0701ec, float:1.7945576E38)
            int r19 = r0.getDimensionPixelSize(r2)
            r2 = 2131165675(0x7f0701eb, float:1.7945574E38)
            int r0 = r0.getDimensionPixelOffset(r2)
            r2 = r21
            r20 = r7
            r7 = r18
            r18 = 2
            r8 = r19
            r9 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x01f2
        L_0x01d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r2 = r21.a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01ee:
            r20 = r7
            r18 = 2
        L_0x01f2:
            r20.recycle()
            if (r17 == 0) goto L_0x0351
            java.lang.String r0 = r17.trim()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0351
            char r1 = r0.charAt(r15)
            r2 = 46
            if (r1 != r2) goto L_0x021e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPackageName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x021c:
            r1 = r0
            goto L_0x0244
        L_0x021e:
            java.lang.String r1 = "."
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0227
            goto L_0x021c
        L_0x0227:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r3 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r3 = r3.getPackage()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x021c
        L_0x0244:
            boolean r0 = r21.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            if (r0 == 0) goto L_0x0253
            java.lang.Class r0 = r21.getClass()     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            goto L_0x0257
        L_0x0253:
            java.lang.ClassLoader r0 = r22.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
        L_0x0257:
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.Class<androidx.recyclerview.widget.RecyclerView$i> r2 = androidx.recyclerview.widget.RecyclerView.i.class
            java.lang.Class r2 = r0.asSubclass(r2)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.Class<?>[] r0 = Q     // Catch:{ NoSuchMethodException -> 0x027f }
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x027f }
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x027f }
            r3[r15] = r11     // Catch:{ NoSuchMethodException -> 0x027f }
            r4 = 1
            r3[r4] = r12     // Catch:{ NoSuchMethodException -> 0x027d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)     // Catch:{ NoSuchMethodException -> 0x027d }
            r3[r18] = r5     // Catch:{ NoSuchMethodException -> 0x027d }
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ NoSuchMethodException -> 0x027d }
            r3[r5] = r6     // Catch:{ NoSuchMethodException -> 0x027d }
            goto L_0x028a
        L_0x027d:
            r0 = move-exception
            goto L_0x0281
        L_0x027f:
            r0 = move-exception
            r4 = 1
        L_0x0281:
            r3 = r0
            java.lang.Class[] r0 = new java.lang.Class[r15]     // Catch:{ NoSuchMethodException -> 0x0298 }
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0298 }
            r3 = r16
        L_0x028a:
            r0.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            androidx.recyclerview.widget.RecyclerView$i r0 = (androidx.recyclerview.widget.RecyclerView.i) r0     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            r10.a(r0)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            goto L_0x0352
        L_0x0298:
            r0 = move-exception
            r0.initCause(r3)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            r3.<init>()     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.String r4 = r23.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.String r4 = ": Error creating LayoutManager "
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            r3.append(r1)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            java.lang.String r3 = r3.toString()     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            r2.<init>(r3, r0)     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0332, InvocationTargetException -> 0x0315, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02d9, ClassCastException -> 0x02ba }
        L_0x02ba:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x02d9:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x02f8:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            r3.append(r14)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x0315:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            r3.append(r14)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x0332:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x0351:
            r4 = 1
        L_0x0352:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0367
            int[] r0 = M
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r13, r15)
            boolean r1 = r0.getBoolean(r15, r4)
            r0.recycle()
            r9 = r1
            goto L_0x0368
        L_0x0367:
            r9 = 1
        L_0x0368:
            r4 = r9
            goto L_0x036e
        L_0x036a:
            r4 = 1
            r10.setDescendantFocusability(r1)
        L_0x036e:
            r10.setNestedScrollingEnabled(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
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

    public void setClipToPadding(boolean z2) {
        if (z2 != this.i) {
            v();
        }
        this.i = z2;
        super.setClipToPadding(z2);
        if (this.r) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.i;
    }

    public final void b(int i2) {
        this.as = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
    }

    public final void a(a aVar, boolean z2) {
        d(false);
        a(aVar, true, false);
        b(true);
        requestLayout();
    }

    public void a(a aVar) {
        d(false);
        a(aVar, false, true);
        b(false);
        requestLayout();
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

    private void a(a aVar, boolean z2, boolean z3) {
        a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.b((c) this.R);
            this.m.b(this);
        }
        if (!z2 || z3) {
            b();
        }
        this.f.a();
        a aVar3 = this.m;
        this.m = aVar;
        if (aVar != null) {
            aVar.a((c) this.R);
            aVar.a(this);
        }
        i iVar = this.n;
        if (iVar != null) {
            iVar.a(aVar3, this.m);
        }
        this.e.a(aVar3, this.m, z2);
        this.E.f = true;
    }

    public a c() {
        return this.m;
    }

    public int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public final void a(j jVar) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(jVar);
    }

    public final void b(j jVar) {
        List<j> list = this.v;
        if (list != null) {
            list.remove(jVar);
        }
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
            nt ntVar = this.g;
            ntVar.b.a();
            for (int size = ntVar.c.size() - 1; size >= 0; size--) {
                ntVar.a.d((View) ntVar.c.get(size));
                ntVar.c.remove(size);
            }
            ntVar.a.b();
            this.n = iVar;
            if (iVar != null) {
                if (iVar.h == null) {
                    this.n.b(this);
                    if (this.p) {
                        this.n.c(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(iVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(iVar.h.a());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.e.b();
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        q qVar = new q(super.onSaveInstanceState());
        q qVar2 = this.S;
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
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.S = (q) parcelable;
        super.onRestoreInstanceState(this.S.d);
        if (!(this.n == null || this.S.a == null)) {
            this.n.a(this.S.a);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
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
            nt ntVar = this.g;
            int a2 = ntVar.a.a(view);
            if (a2 >= 0) {
                ntVar.b.a(a2);
                ntVar.a(view);
                return;
            }
            StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(View view) {
        o();
        nt ntVar = this.g;
        int a2 = ntVar.a.a(view);
        boolean z2 = true;
        if (a2 == -1) {
            ntVar.b(view);
        } else if (ntVar.b.c(a2)) {
            ntVar.b.d(a2);
            ntVar.b(view);
            ntVar.a.a(a2);
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

    public i d() {
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i2) {
        if (i2 != this.y) {
            this.y = i2;
            if (i2 != 2) {
                p();
            }
            i iVar = this.n;
            if (iVar != null) {
                iVar.j(i2);
            }
            h(i2);
            List<m> list = this.ax;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((m) this.ax.get(size)).a(this, i2);
                }
            }
        }
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
        I();
        requestLayout();
    }

    public final void a(h hVar) {
        a(hVar, -1);
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
        I();
        requestLayout();
    }

    public final void a(d dVar) {
        if (dVar != this.az) {
            this.az = dVar;
            setChildrenDrawingOrderEnabled(this.az != null);
        }
    }

    public void a(m mVar) {
        if (this.ax == null) {
            this.ax = new ArrayList();
        }
        this.ax.add(mVar);
    }

    public void b(m mVar) {
        List<m> list = this.ax;
        if (list != null) {
            list.remove(mVar);
        }
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
    public final void e(int i2) {
        i iVar = this.n;
        if (iVar != null) {
            iVar.e(i2);
            awakenScrollBars();
        }
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

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3, int[] iArr) {
        o();
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

    /* access modifiers changed from: 0000 */
    public final void e() {
        String str = "RV FullInvalidate";
        if (!this.r || this.w) {
            ha.a(str);
            B();
            ha.a();
        } else if (this.f.d()) {
            if (!this.f.a(4) || this.f.a(11)) {
                if (this.f.d()) {
                    ha.a(str);
                    B();
                    ha.a();
                }
                return;
            }
            ha.a("RV PartialInvalidate");
            o();
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
                    if (d2 != null && !d2.c() && d2.u()) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    B();
                } else {
                    this.f.c();
                }
            }
            c(true);
            a(true);
            ha.a();
        }
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
            a(i8, i9, this.K);
            int[] iArr = this.K;
            int i10 = iArr[0];
            int i11 = iArr[1];
            i7 = i11;
            i4 = i10;
            i6 = i8 - i10;
            i5 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.o.isEmpty()) {
            invalidate();
        }
        int i12 = i7;
        if (a(i4, i7, i6, i5, this.aC, 0)) {
            int i13 = this.aq;
            int[] iArr2 = this.aC;
            this.aq = i13 - iArr2[0];
            this.ar -= iArr2[1];
            if (motionEvent2 != null) {
                motionEvent2.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            }
            int[] iArr3 = this.aD;
            int i14 = iArr3[0];
            int[] iArr4 = this.aC;
            iArr3[0] = i14 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !ic.a(motionEvent2, 8194)) {
                a(motionEvent.getX(), (float) i6, motionEvent.getY(), (float) i5);
            }
            b(i2, i3);
        }
        int i15 = i12;
        if (!(i4 == 0 && i15 == 0)) {
            f(i4, i15);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i4 == 0 && i15 == 0) ? false : true;
    }

    public int computeHorizontalScrollOffset() {
        i iVar = this.n;
        if (iVar != null && iVar.e()) {
            return this.n.b(this.E);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        i iVar = this.n;
        if (iVar != null && iVar.e()) {
            return this.n.d(this.E);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        i iVar = this.n;
        if (iVar != null && iVar.e()) {
            return this.n.f(this.E);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        i iVar = this.n;
        if (iVar != null && iVar.f()) {
            return this.n.c(this.E);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        i iVar = this.n;
        if (iVar != null && iVar.f()) {
            return this.n.e(this.E);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        i iVar = this.n;
        if (iVar != null && iVar.f()) {
            return this.n.g(this.E);
        }
        return 0;
    }

    private void o() {
        this.aa++;
        if (this.aa == 1 && !this.t) {
            this.s = false;
        }
    }

    private void c(boolean z2) {
        if (this.aa <= 0) {
            this.aa = 1;
        }
        if (!z2 && !this.t) {
            this.s = false;
        }
        if (this.aa == 1) {
            if (z2 && this.s && !this.t && this.n != null && this.m != null) {
                B();
            }
            if (!this.t) {
                this.s = false;
            }
        }
        this.aa--;
    }

    private void d(boolean z2) {
        if (this.t) {
            a("Do not setLayoutFrozen in layout or scroll");
            this.t = false;
            if (!(!this.s || this.n == null || this.m == null)) {
                requestLayout();
            }
            this.s = false;
        }
    }

    public final void a(int i2, int i3, Interpolator interpolator) {
        i iVar = this.n;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.t) {
            if (!iVar.e()) {
                i2 = 0;
            }
            if (!this.n.f()) {
                i3 = 0;
            }
            if (!(i2 == 0 && i3 == 0)) {
                this.B.a(i2, i3, interpolator);
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
                    int i6 = this.at;
                    int max = Math.max(-i6, Math.min(i4, i6));
                    int i7 = this.at;
                    int max2 = Math.max(-i7, Math.min(i5, i7));
                    t tVar = this.B;
                    RecyclerView.this.c(2);
                    tVar.b = 0;
                    tVar.a = 0;
                    tVar.c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    tVar.a();
                    return true;
                }
            }
            return false;
        }
    }

    public final void f() {
        c(0);
        p();
    }

    private void p() {
        this.B.b();
        i iVar = this.n;
        if (iVar != null) {
            iVar.u();
        }
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
            r6.r()
            android.widget.EdgeEffect r3 = r6.ai
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
            r6.s()
            android.widget.EdgeEffect r3 = r6.ak
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
            r6.t()
            android.widget.EdgeEffect r9 = r6.aj
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
            r6.u()
            android.widget.EdgeEffect r9 = r6.al
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

    private void q() {
        boolean z2;
        EdgeEffect edgeEffect = this.ai;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.ai.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.aj;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.aj.isFinished();
        }
        EdgeEffect edgeEffect3 = this.ak;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.ak.isFinished();
        }
        EdgeEffect edgeEffect4 = this.al;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.al.isFinished();
        }
        if (z2) {
            ip.d(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.ai;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.ai.onRelease();
            z2 = this.ai.isFinished();
        }
        EdgeEffect edgeEffect2 = this.ak;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.ak.onRelease();
            z2 |= this.ak.isFinished();
        }
        EdgeEffect edgeEffect3 = this.aj;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.aj.onRelease();
            z2 |= this.aj.isFinished();
        }
        EdgeEffect edgeEffect4 = this.al;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.al.onRelease();
            z2 |= this.al.isFinished();
        }
        if (z2) {
            ip.d(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i2, int i3) {
        if (i2 < 0) {
            r();
            this.ai.onAbsorb(-i2);
        } else if (i2 > 0) {
            s();
            this.ak.onAbsorb(i2);
        }
        if (i3 < 0) {
            t();
            this.aj.onAbsorb(-i3);
        } else if (i3 > 0) {
            u();
            this.al.onAbsorb(i3);
        }
        if (i2 != 0 || i3 != 0) {
            ip.d(this);
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
        if (this.ak == null) {
            this.ak = e.a(this);
            if (this.i) {
                this.ak.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.ak.setSize(getMeasuredHeight(), getMeasuredWidth());
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
        if (this.al == null) {
            this.al = e.a(this);
            if (this.i) {
                this.al.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.al.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void v() {
        this.al = null;
        this.aj = null;
        this.ak = null;
        this.ai = null;
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
            boolean r11 = O
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
            androidx.recyclerview.widget.RecyclerView r0 = r0.h
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
            boolean r11 = O
            if (r11 == 0) goto L_0x007c
            r15 = r0
        L_0x007c:
            if (r10 == 0) goto L_0x0097
            r13.e()
            android.view.View r0 = r13.c(r14)
            if (r0 != 0) goto L_0x0088
            return r8
        L_0x0088:
            r13.o()
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
            r13.o()
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
            android.graphics.Rect r3 = r13.T
            int r8 = r0.getWidth()
            int r10 = r0.getHeight()
            r3.set(r2, r2, r8, r10)
            android.graphics.Rect r3 = r13.k
            r13.offsetDescendantRectToMyCoords(r14, r3)
            android.graphics.Rect r3 = r13.T
            r13.offsetDescendantRectToMyCoords(r0, r3)
            androidx.recyclerview.widget.RecyclerView$i r3 = r13.n
            androidx.recyclerview.widget.RecyclerView r3 = r3.h
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
            android.graphics.Rect r11 = r13.T
            int r11 = r11.left
            if (r10 < r11) goto L_0x0137
            android.graphics.Rect r10 = r13.k
            int r10 = r10.right
            android.graphics.Rect r11 = r13.T
            int r11 = r11.left
            if (r10 > r11) goto L_0x0143
        L_0x0137:
            android.graphics.Rect r10 = r13.k
            int r10 = r10.right
            android.graphics.Rect r11 = r13.T
            int r11 = r11.right
            if (r10 >= r11) goto L_0x0143
            r10 = 1
            goto L_0x0164
        L_0x0143:
            android.graphics.Rect r10 = r13.k
            int r10 = r10.right
            android.graphics.Rect r11 = r13.T
            int r11 = r11.right
            if (r10 > r11) goto L_0x0157
            android.graphics.Rect r10 = r13.k
            int r10 = r10.left
            android.graphics.Rect r11 = r13.T
            int r11 = r11.right
            if (r10 < r11) goto L_0x0163
        L_0x0157:
            android.graphics.Rect r10 = r13.k
            int r10 = r10.left
            android.graphics.Rect r11 = r13.T
            int r11 = r11.left
            if (r10 <= r11) goto L_0x0163
            r10 = -1
            goto L_0x0164
        L_0x0163:
            r10 = 0
        L_0x0164:
            android.graphics.Rect r11 = r13.k
            int r11 = r11.top
            android.graphics.Rect r12 = r13.T
            int r12 = r12.top
            if (r11 < r12) goto L_0x0178
            android.graphics.Rect r11 = r13.k
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.T
            int r12 = r12.top
            if (r11 > r12) goto L_0x0184
        L_0x0178:
            android.graphics.Rect r11 = r13.k
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.T
            int r12 = r12.bottom
            if (r11 >= r12) goto L_0x0184
            r8 = 1
            goto L_0x01a4
        L_0x0184:
            android.graphics.Rect r11 = r13.k
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.T
            int r12 = r12.bottom
            if (r11 > r12) goto L_0x0198
            android.graphics.Rect r11 = r13.k
            int r11 = r11.top
            android.graphics.Rect r12 = r13.T
            int r12 = r12.bottom
            if (r11 < r12) goto L_0x01a3
        L_0x0198:
            android.graphics.Rect r11 = r13.k
            int r11 = r11.top
            android.graphics.Rect r12 = r13.T
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

    public void requestChildFocus(View view, View view2) {
        if (!(this.n.p() || i()) && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
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

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.n.a(this, view, rect, z2, false);
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        super.addFocusables(arrayList, i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
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
            r4.af = r0
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
            java.lang.ThreadLocal<ny> r0 = defpackage.ny.a
            java.lang.Object r0 = r0.get()
            ny r0 = (defpackage.ny) r0
            r4.C = r0
            ny r0 = r4.C
            if (r0 != 0) goto L_0x0064
            ny r0 = new ny
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
            ny r1 = r4.C
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.c = r2
            java.lang.ThreadLocal<ny> r0 = defpackage.ny.a
            ny r1 = r4.C
            r0.set(r1)
        L_0x0064:
            ny r0 = r4.C
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
        this.aE.clear();
        removeCallbacks(this.aF);
        defpackage.oq.a.b();
        if (d) {
            ny nyVar = this.C;
            if (nyVar != null) {
                nyVar.b.remove(this);
                this.C = null;
            }
        }
    }

    public boolean isAttachedToWindow() {
        return this.p;
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
        } else if (this.ag > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a());
            new IllegalStateException(sb2.toString());
        }
    }

    public final void a(l lVar) {
        this.U.add(lVar);
    }

    public final void b(l lVar) {
        this.U.remove(lVar);
        if (this.V == lVar) {
            this.V = null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (this.t) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.V = null;
        }
        int size = this.U.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            l lVar = (l) this.U.get(i2);
            if (lVar.a(motionEvent) && action != 3) {
                this.V = lVar;
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            x();
            return true;
        }
        i iVar = this.n;
        if (iVar == null) {
            return false;
        }
        boolean e2 = iVar.e();
        boolean f2 = this.n.f();
        if (this.an == null) {
            this.an = VelocityTracker.obtain();
        }
        this.an.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.ab) {
                this.ab = false;
            }
            this.am = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.aq = x2;
            this.ao = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.ar = y2;
            this.ap = y2;
            if (this.y == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                c(1);
            }
            int[] iArr = this.aD;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f2) {
                e2 |= true;
            }
            h(e2 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.an.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.am);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder("Error processing scroll; pointer index for id ");
                sb.append(this.am);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.y != 1) {
                int i3 = x3 - this.ao;
                int i4 = y3 - this.ap;
                if (!e2 || Math.abs(i3) <= this.as) {
                    z3 = false;
                } else {
                    this.aq = x3;
                    z3 = true;
                }
                if (f2 && Math.abs(i4) > this.as) {
                    this.ar = y3;
                    z3 = true;
                }
                if (z3) {
                    c(1);
                }
            }
        } else if (actionMasked == 3) {
            x();
        } else if (actionMasked == 5) {
            this.am = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.aq = x4;
            this.ao = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ar = y4;
            this.ap = y4;
        } else if (actionMasked == 6) {
            a(motionEvent);
        }
        if (this.y == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.U.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((l) this.U.get(i2)).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            boolean r0 = r14.t
            r1 = 0
            if (r0 != 0) goto L_0x01f4
            boolean r0 = r14.ab
            if (r0 == 0) goto L_0x000b
            goto L_0x01f4
        L_0x000b:
            int r0 = r15.getAction()
            androidx.recyclerview.widget.RecyclerView$l r2 = r14.V
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L_0x0026
            r5 = 0
            if (r0 != 0) goto L_0x001b
            r14.V = r5
            goto L_0x0026
        L_0x001b:
            r2.b(r15)
            if (r0 == r3) goto L_0x0022
            if (r0 != r4) goto L_0x0024
        L_0x0022:
            r14.V = r5
        L_0x0024:
            r0 = 1
            goto L_0x0046
        L_0x0026:
            if (r0 == 0) goto L_0x0045
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r0 = r14.U
            int r0 = r0.size()
            r2 = 0
        L_0x002f:
            if (r2 >= r0) goto L_0x0045
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r5 = r14.U
            java.lang.Object r5 = r5.get(r2)
            androidx.recyclerview.widget.RecyclerView$l r5 = (androidx.recyclerview.widget.RecyclerView.l) r5
            boolean r6 = r5.a(r15)
            if (r6 == 0) goto L_0x0042
            r14.V = r5
            goto L_0x0024
        L_0x0042:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x004c
            r14.x()
            return r4
        L_0x004c:
            androidx.recyclerview.widget.RecyclerView$i r0 = r14.n
            if (r0 != 0) goto L_0x0051
            return r1
        L_0x0051:
            boolean r0 = r0.e()
            androidx.recyclerview.widget.RecyclerView$i r2 = r14.n
            boolean r2 = r2.f()
            android.view.VelocityTracker r5 = r14.an
            if (r5 != 0) goto L_0x0065
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r14.an = r5
        L_0x0065:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r15)
            int r6 = r15.getActionMasked()
            int r7 = r15.getActionIndex()
            if (r6 != 0) goto L_0x0079
            int[] r8 = r14.aD
            r8[r4] = r1
            r8[r1] = r1
        L_0x0079:
            int[] r8 = r14.aD
            r9 = r8[r1]
            float r9 = (float) r9
            r8 = r8[r4]
            float r8 = (float) r8
            r5.offsetLocation(r9, r8)
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r6 == 0) goto L_0x01c8
            if (r6 == r4) goto L_0x0186
            r9 = 2
            if (r6 == r9) goto L_0x00bd
            if (r6 == r3) goto L_0x00b8
            r0 = 5
            if (r6 == r0) goto L_0x009c
            r0 = 6
            if (r6 == r0) goto L_0x0097
            goto L_0x01e9
        L_0x0097:
            r14.a(r15)
            goto L_0x01e9
        L_0x009c:
            int r0 = r15.getPointerId(r7)
            r14.am = r0
            float r0 = r15.getX(r7)
            float r0 = r0 + r8
            int r0 = (int) r0
            r14.aq = r0
            r14.ao = r0
            float r15 = r15.getY(r7)
            float r15 = r15 + r8
            int r15 = (int) r15
            r14.ar = r15
            r14.ap = r15
            goto L_0x01e9
        L_0x00b8:
            r14.x()
            goto L_0x01e9
        L_0x00bd:
            int r3 = r14.am
            int r3 = r15.findPointerIndex(r3)
            if (r3 >= 0) goto L_0x00e0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r15.<init>(r0)
            int r0 = r14.am
            r15.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r15)
            return r1
        L_0x00e0:
            float r6 = r15.getX(r3)
            float r6 = r6 + r8
            int r6 = (int) r6
            float r15 = r15.getY(r3)
            float r15 = r15 + r8
            int r15 = (int) r15
            int r3 = r14.aq
            int r3 = r3 - r6
            int r7 = r14.ar
            int r13 = r7 - r15
            int[] r10 = r14.J
            int[] r11 = r14.aC
            r12 = 0
            r7 = r14
            r8 = r3
            r9 = r13
            boolean r7 = r7.a(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0126
            int[] r7 = r14.J
            r8 = r7[r1]
            int r3 = r3 - r8
            r7 = r7[r4]
            int r13 = r13 - r7
            int[] r7 = r14.aC
            r8 = r7[r1]
            float r8 = (float) r8
            r7 = r7[r4]
            float r7 = (float) r7
            r5.offsetLocation(r8, r7)
            int[] r7 = r14.aD
            r8 = r7[r1]
            int[] r9 = r14.aC
            r10 = r9[r1]
            int r8 = r8 + r10
            r7[r1] = r8
            r8 = r7[r4]
            r9 = r9[r4]
            int r8 = r8 + r9
            r7[r4] = r8
        L_0x0126:
            int r7 = r14.y
            if (r7 == r4) goto L_0x0151
            if (r0 == 0) goto L_0x013b
            int r7 = java.lang.Math.abs(r3)
            int r8 = r14.as
            if (r7 <= r8) goto L_0x013b
            if (r3 <= 0) goto L_0x0138
            int r3 = r3 - r8
            goto L_0x0139
        L_0x0138:
            int r3 = r3 + r8
        L_0x0139:
            r7 = 1
            goto L_0x013c
        L_0x013b:
            r7 = 0
        L_0x013c:
            if (r2 == 0) goto L_0x014c
            int r8 = java.lang.Math.abs(r13)
            int r9 = r14.as
            if (r8 <= r9) goto L_0x014c
            if (r13 <= 0) goto L_0x014a
            int r13 = r13 - r9
            goto L_0x014b
        L_0x014a:
            int r13 = r13 + r9
        L_0x014b:
            r7 = 1
        L_0x014c:
            if (r7 == 0) goto L_0x0151
            r14.c(r4)
        L_0x0151:
            int r7 = r14.y
            if (r7 != r4) goto L_0x01e9
            int[] r7 = r14.aC
            r8 = r7[r1]
            int r6 = r6 - r8
            r14.aq = r6
            r6 = r7[r4]
            int r15 = r15 - r6
            r14.ar = r15
            if (r0 == 0) goto L_0x0165
            r15 = r3
            goto L_0x0166
        L_0x0165:
            r15 = 0
        L_0x0166:
            if (r2 == 0) goto L_0x016a
            r0 = r13
            goto L_0x016b
        L_0x016a:
            r0 = 0
        L_0x016b:
            boolean r15 = r14.a(r15, r0, r5)
            if (r15 == 0) goto L_0x0178
            android.view.ViewParent r15 = r14.getParent()
            r15.requestDisallowInterceptTouchEvent(r4)
        L_0x0178:
            ny r15 = r14.C
            if (r15 == 0) goto L_0x01e9
            if (r3 != 0) goto L_0x0180
            if (r13 == 0) goto L_0x01e9
        L_0x0180:
            ny r15 = r14.C
            r15.a(r14, r3, r13)
            goto L_0x01e9
        L_0x0186:
            android.view.VelocityTracker r15 = r14.an
            r15.addMovement(r5)
            android.view.VelocityTracker r15 = r14.an
            r3 = 1000(0x3e8, float:1.401E-42)
            int r6 = r14.at
            float r6 = (float) r6
            r15.computeCurrentVelocity(r3, r6)
            r15 = 0
            if (r0 == 0) goto L_0x01a2
            android.view.VelocityTracker r0 = r14.an
            int r3 = r14.am
            float r0 = r0.getXVelocity(r3)
            float r0 = -r0
            goto L_0x01a3
        L_0x01a2:
            r0 = 0
        L_0x01a3:
            if (r2 == 0) goto L_0x01af
            android.view.VelocityTracker r2 = r14.an
            int r3 = r14.am
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01b0
        L_0x01af:
            r2 = 0
        L_0x01b0:
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x01b8
            int r15 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x01c0
        L_0x01b8:
            int r15 = (int) r0
            int r0 = (int) r2
            boolean r15 = r14.a(r15, r0)
            if (r15 != 0) goto L_0x01c3
        L_0x01c0:
            r14.c(r1)
        L_0x01c3:
            r14.w()
            r1 = 1
            goto L_0x01e9
        L_0x01c8:
            int r3 = r15.getPointerId(r1)
            r14.am = r3
            float r3 = r15.getX()
            float r3 = r3 + r8
            int r3 = (int) r3
            r14.aq = r3
            r14.ao = r3
            float r15 = r15.getY()
            float r15 = r15 + r8
            int r15 = (int) r15
            r14.ar = r15
            r14.ap = r15
            if (r2 == 0) goto L_0x01e6
            r0 = r0 | 2
        L_0x01e6:
            r14.h(r0, r1)
        L_0x01e9:
            if (r1 != 0) goto L_0x01f0
            android.view.VelocityTracker r15 = r14.an
            r15.addMovement(r5)
        L_0x01f0:
            r5.recycle()
            return r4
        L_0x01f4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void w() {
        VelocityTracker velocityTracker = this.an;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        q();
    }

    private void x() {
        w();
        c(0);
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.am) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.am = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.aq = x2;
            this.ao = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.ar = y2;
            this.ap = y2;
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
                        a((int) (f2 * this.au), (int) (f3 * this.av), motionEvent);
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
                        a((int) (f2 * this.au), (int) (f3 * this.av), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            a((int) (f2 * this.au), (int) (f3 * this.av), motionEvent);
        }
        return false;
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
                    F();
                }
                this.n.b(i2, i3);
                this.E.i = true;
                G();
                this.n.c(i2, i3);
                if (this.n.r_()) {
                    this.n.b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.E.i = true;
                    G();
                    this.n.c(i2, i3);
                }
            }
        } else if (this.q) {
            this.n.a(this.e, this.E, i2, i3);
        } else {
            if (this.u) {
                o();
                g();
                A();
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
            o();
            this.n.a(this.e, this.E, i2, i3);
            c(false);
            this.E.g = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d(int i2, int i3) {
        setMeasuredDimension(i.a(i2, getPaddingLeft() + getPaddingRight(), ip.l(this)), i.a(i3, getPaddingTop() + getPaddingBottom(), ip.m(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            v();
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
            fVar3.h = this.ay;
        }
    }

    public final void g() {
        this.af++;
    }

    public final void a(boolean z2) {
        this.af--;
        if (this.af <= 0) {
            this.af = 0;
            if (z2) {
                y();
                M();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean h() {
        AccessibilityManager accessibilityManager = this.ad;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void y() {
        int i2 = this.ac;
        this.ac = 0;
        if (i2 != 0 && h()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            iy.a(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public final boolean i() {
        return this.af > 0;
    }

    /* access modifiers changed from: 0000 */
    public final void j() {
        if (!this.H && this.p) {
            ip.a((View) this, this.aF);
            this.H = true;
        }
    }

    private boolean z() {
        return this.x != null && this.n.q_();
    }

    private void A() {
        if (this.w) {
            this.f.a();
            if (this.ae) {
                this.n.a(this);
            }
        }
        if (z()) {
            this.f.b();
        } else {
            this.f.e();
        }
        boolean z2 = false;
        boolean z3 = this.F || this.G;
        this.E.j = this.r && this.x != null && (this.w || z3 || this.n.l) && (!this.w || this.m.c);
        s sVar = this.E;
        if (sVar.j && z3 && !this.w && z()) {
            z2 = true;
        }
        sVar.k = z2;
    }

    private void B() {
        String str = "RecyclerView";
        if (this.m == null) {
            Log.e(str, "No adapter attached; skipping layout");
        } else if (this.n == null) {
            Log.e(str, "No layout manager attached; skipping layout");
        } else {
            s sVar = this.E;
            sVar.i = false;
            if (sVar.d == 1) {
                F();
                this.n.e(this);
                G();
            } else if (!this.f.f() && this.n.u == getWidth() && this.n.v == getHeight()) {
                this.n.e(this);
            } else {
                this.n.e(this);
                G();
            }
            H();
        }
    }

    private void C() {
        View view;
        long j2;
        int i2;
        u uVar = null;
        if (!this.aw || !hasFocus() || this.m == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            View c2 = c(view);
            if (c2 != null) {
                uVar = b(c2);
            }
        }
        if (uVar == null) {
            D();
            return;
        }
        s sVar = this.E;
        if (this.m.c) {
            j2 = uVar.s;
        } else {
            j2 = -1;
        }
        sVar.m = j2;
        s sVar2 = this.E;
        if (this.w) {
            i2 = -1;
        } else if (uVar.n()) {
            i2 = uVar.r;
        } else {
            i2 = uVar.e();
        }
        sVar2.l = i2;
        s sVar3 = this.E;
        View view2 = uVar.o;
        int id = view2.getId();
        while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
            view2 = ((ViewGroup) view2).getFocusedChild();
            if (view2.getId() != -1) {
                id = view2.getId();
            }
        }
        sVar3.n = id;
    }

    private void D() {
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
    private void E() {
        /*
            r13 = this;
            boolean r0 = r13.aw
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
            boolean r1 = P
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            nt r0 = r13.g
            int r0 = r0.a()
            if (r0 != 0) goto L_0x0055
            r13.requestFocus()
            return
        L_0x004c:
            nt r1 = r13.g
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
            nt r6 = r13.g
            int r6 = r6.b()
            r8 = r5
            r7 = 0
        L_0x007c:
            if (r7 >= r6) goto L_0x00a8
            nt r9 = r13.g
            android.view.View r9 = r9.c(r7)
            androidx.recyclerview.widget.RecyclerView$u r9 = d(r9)
            if (r9 == 0) goto L_0x00a4
            boolean r10 = r9.n()
            if (r10 != 0) goto L_0x00a4
            long r10 = r9.s
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x00a4
            nt r8 = r13.g
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
            nt r0 = r13.g
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
            nt r0 = r13.g
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E():void");
    }

    private void F() {
        this.E.a(1);
        a(this.E);
        this.E.i = false;
        o();
        this.h.a();
        g();
        A();
        C();
        s sVar = this.E;
        sVar.h = sVar.j && this.G;
        this.G = false;
        this.F = false;
        s sVar2 = this.E;
        sVar2.g = sVar2.k;
        this.E.e = this.m.b();
        a(this.aA);
        if (this.E.j) {
            int a2 = this.g.a();
            for (int i2 = 0; i2 < a2; i2++) {
                u d2 = d(this.g.b(i2));
                if (!d2.c() && (!d2.k() || this.m.c)) {
                    f fVar = this.x;
                    f.e(d2);
                    d2.q();
                    this.h.a(d2, new b().a(d2));
                    if (this.E.h && d2.u() && !d2.n() && !d2.c() && !d2.k()) {
                        this.h.a(e(d2), d2);
                    }
                }
            }
        }
        if (this.E.k) {
            J();
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
                    d3.q();
                    b a4 = new b().a(d3);
                    if (a3) {
                        a(d3, a4);
                    } else {
                        this.h.b(d3, a4);
                    }
                }
            }
            K();
        } else {
            K();
        }
        a(true);
        c(false);
        this.E.d = 2;
    }

    private void G() {
        o();
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
        this.S = null;
        sVar2.j = sVar2.j && this.x != null;
        this.E.d = 4;
        a(true);
        c(false);
    }

    private void H() {
        this.E.a(4);
        o();
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
            this.h.a(this.aG);
        }
        this.n.b(this.e);
        s sVar2 = this.E;
        sVar2.b = sVar2.e;
        this.w = false;
        this.ae = false;
        s sVar3 = this.E;
        sVar3.j = false;
        sVar3.k = false;
        this.n.l = false;
        if (this.e.b != null) {
            this.e.b.clear();
        }
        if (this.n.r) {
            i iVar = this.n;
            iVar.q = 0;
            iVar.r = false;
            this.e.b();
        }
        this.n.a(this.E);
        a(true);
        c(false);
        this.h.a();
        int[] iArr = this.aA;
        if (g(iArr[0], iArr[1])) {
            f(0, 0);
        }
        E();
        D();
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

    /* access modifiers changed from: 0000 */
    public final void a(u uVar, b bVar) {
        uVar.a(0, 8192);
        if (this.E.h && uVar.u() && !uVar.n() && !uVar.c()) {
            this.h.a(e(uVar), uVar);
        }
        this.h.a(uVar, bVar);
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

    private boolean g(int i2, int i3) {
        a(this.aA);
        int[] iArr = this.aA;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
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

    private long e(u uVar) {
        if (this.m.c) {
            return uVar.s;
        }
        return (long) uVar.q;
    }

    /* access modifiers changed from: 0000 */
    public final void a(u uVar, b bVar, b bVar2) {
        d(uVar);
        uVar.b(false);
        if (this.x.a(uVar, bVar, bVar2)) {
            j();
        }
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

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ha.a("RV OnLayout");
        B();
        ha.a();
        this.r = true;
    }

    public void requestLayout() {
        if (this.aa != 0 || this.t) {
            this.s = true;
        } else {
            super.requestLayout();
        }
    }

    private void I() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((LayoutParams) this.g.c(i2).getLayoutParams()).e = true;
        }
        this.e.f();
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
        EdgeEffect edgeEffect = this.ai;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.ai;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.aj;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.aj;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.ak;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.ak;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.al;
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
            EdgeEffect edgeEffect8 = this.al;
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

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((h) this.o.get(i2)).a(canvas, this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.n.a((LayoutParams) layoutParams);
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

    private void J() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            u d2 = d(this.g.c(i2));
            if (!d2.c()) {
                d2.aD_();
            }
        }
    }

    private void K() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            u d2 = d(this.g.c(i2));
            if (!d2.c()) {
                d2.a();
            }
        }
        this.e.e();
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
    public final boolean a(u uVar) {
        f fVar = this.x;
        return fVar == null || fVar.a(uVar, uVar.q());
    }

    /* access modifiers changed from: 0000 */
    public final void b(boolean z2) {
        this.ae = z2 | this.ae;
        this.w = true;
        L();
    }

    private void L() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            u d2 = d(this.g.c(i2));
            if (d2 != null && !d2.c()) {
                d2.b(6);
            }
        }
        I();
        this.e.d();
    }

    public final void k() {
        if (this.o.size() != 0) {
            i iVar = this.n;
            if (iVar != null) {
                iVar.a("Cannot invalidate item decorations during a scroll or layout");
            }
            I();
            requestLayout();
        }
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

    public static u d(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).c;
    }

    public static int e(View view) {
        u d2 = d(view);
        if (d2 != null) {
            return d2.e();
        }
        return -1;
    }

    public static int f(View view) {
        u d2 = d(view);
        if (d2 != null) {
            return d2.d();
        }
        return -1;
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

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public static void a(View view, Rect rect) {
        b(view, rect);
    }

    static void b(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.d;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    public final Rect h(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.e) {
            return layoutParams.d;
        }
        if (this.E.g && (layoutParams.c.u() || layoutParams.c.k())) {
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

    /* access modifiers changed from: 0000 */
    public final void f(int i2, int i3) {
        this.ag++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        e(i2, i3);
        List<m> list = this.ax;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((m) this.ax.get(size)).a(this, i2, i3);
            }
        }
        this.ag--;
    }

    public final boolean l() {
        return !this.r || this.w || this.f.d();
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

    public static long m() {
        if (d) {
            return System.nanoTime();
        }
        return 0;
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

    /* access modifiers changed from: 0000 */
    public final boolean a(u uVar, int i2) {
        if (i()) {
            uVar.B = i2;
            this.aE.add(uVar);
            return false;
        }
        ip.b(uVar.o, i2);
        return true;
    }

    private void M() {
        for (int size = this.aE.size() - 1; size >= 0; size--) {
            u uVar = (u) this.aE.get(size);
            if (uVar.o.getParent() == this && !uVar.c()) {
                int i2 = uVar.B;
                if (i2 != -1) {
                    ip.b(uVar.o, i2);
                    uVar.B = -1;
                }
            }
        }
        this.aE.clear();
    }

    /* access modifiers changed from: 0000 */
    public final int c(u uVar) {
        if (uVar.a(524) || !uVar.m()) {
            return -1;
        }
        return this.f.c(uVar.q);
    }

    public void setNestedScrollingEnabled(boolean z2) {
        n().a(z2);
    }

    public boolean isNestedScrollingEnabled() {
        return n().a;
    }

    public boolean startNestedScroll(int i2) {
        return n().a(i2, 0);
    }

    private boolean h(int i2, int i3) {
        return n().a(i2, i3);
    }

    public void stopNestedScroll() {
        n().b(0);
    }

    public final void a(int i2) {
        n().b(i2);
    }

    public boolean hasNestedScrollingParent() {
        return n().a(0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return n().a(i2, i3, i4, i5, iArr);
    }

    public final boolean a(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return n().a(i2, i3, i4, i5, iArr, i6);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return n().a(i2, i3, iArr, iArr2);
    }

    public final boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return n().a(i2, i3, iArr, iArr2, i4);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return n().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return n().a(f2, f3);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        d dVar = this.az;
        if (dVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return dVar.a(i2, i3);
    }

    /* access modifiers changed from: 0000 */
    public ig n() {
        if (this.aB == null) {
            this.aB = new ig(this);
        }
        return this.aB;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2;
        boolean z2 = false;
        if (i()) {
            if (accessibilityEvent == null || VERSION.SDK_INT < 19) {
                i2 = 0;
            } else {
                i2 = accessibilityEvent.getContentChangeTypes();
            }
            if (i2 == 0) {
                i2 = 0;
            }
            this.ac = i2 | this.ac;
            z2 = true;
        }
        if (!z2) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
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
}
