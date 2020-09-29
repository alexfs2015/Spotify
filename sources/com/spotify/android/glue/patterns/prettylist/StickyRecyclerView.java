package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AbsListView.LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.music.R;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class StickyRecyclerView extends ViewGroup implements fyg {
    public final RecyclerView a;
    public View b;
    public int c;
    /* access modifiers changed from: private */
    public boolean d;
    private final LayoutParams e;
    /* access modifiers changed from: private */
    public final e f;
    /* access modifiers changed from: private */
    public View g;
    private final Rect h;
    /* access modifiers changed from: private */
    public final Paint i;
    private boolean j;
    private boolean k;
    private View l;
    private int m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private final Set<defpackage.fyg.a> q;
    private final b r;
    private boolean s;
    private boolean t;
    private final RecyclerViewFastScroller u;
    private boolean v;

    public static class DynamicBottomPaddingLinearLayoutManager extends LinearLayoutManager implements a {
        private int a;
        private int b;
        private boolean x;
        private final Context y;
        private oi z;

        public DynamicBottomPaddingLinearLayoutManager(Context context, int i, boolean z2) {
            super(1, false);
            this.y = context;
            v();
        }

        public DynamicBottomPaddingLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            this.y = context;
            v();
        }

        private void v() {
            this.z = new oi(this.y) {
                public final float a(DisplayMetrics displayMetrics) {
                    return 50.0f / ((float) displayMetrics.densityDpi);
                }

                public final PointF c(int i2) {
                    return new PointF(0.0f, (float) i2);
                }
            };
        }

        public final void a(int i) {
            this.b = i;
            o_();
        }

        public final void a(RecyclerView recyclerView, s sVar, int i) {
            oi oiVar = this.z;
            oiVar.b = i;
            a((r) oiVar);
        }

        public final int b(int i, o oVar, s sVar) {
            boolean z2 = true;
            View g = g(r() - 1);
            View g2 = g(0);
            if (g == null || g2 == null) {
                return super.b(i, oVar, sVar);
            }
            boolean z3 = ((RecyclerView.LayoutParams) g.getLayoutParams()).c.e() == t() - 1;
            if (((RecyclerView.LayoutParams) g2.getLayoutParams()).c.e() == 0 && g2.getTop() >= 0) {
                z2 = false;
            }
            return (!z3 || i <= 0 || !z2) ? super.b(i, oVar, sVar) : super.b(Math.max(0, Math.min(i, n(g) - this.w)), oVar, sVar);
        }

        public final void c(o oVar, s sVar) {
            super.c(oVar, sVar);
            int i = 0;
            for (int i2 = 0; i2 < r(); i2++) {
                i += ((View) fbp.a(g(i2))).getMeasuredHeight();
            }
            if (this.a != i) {
                this.a = i;
                super.c(oVar, sVar);
            }
        }

        public int getPaddingBottom() {
            if (this.x || this.b == 0) {
                return super.getPaddingBottom();
            }
            int i = (this.w - this.a) - this.b;
            if (i > 0) {
                return i;
            }
            return 0;
        }

        public final int l() {
            this.x = true;
            int l = super.l();
            this.x = false;
            return l;
        }

        public final int m() {
            this.x = true;
            int m = super.m();
            this.x = false;
            return m;
        }
    }

    public interface a {
        void a(int i);
    }

    class b extends h {
        private b() {
        }

        /* synthetic */ b(StickyRecyclerView stickyRecyclerView, byte b) {
            this();
        }

        public final void a(Canvas canvas, RecyclerView recyclerView) {
            if (StickyRecyclerView.this.i.getColor() != 0 && StickyRecyclerView.this.d()) {
                int h = StickyRecyclerView.this.f();
                canvas.drawRect(0.0f, (float) h, (float) StickyRecyclerView.this.g.getWidth(), (float) (h + StickyRecyclerView.this.g.getHeight()), StickyRecyclerView.this.i);
            }
        }

        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            int e = RecyclerView.e(view);
            rect.setEmpty();
            i iVar = (i) fbp.a(recyclerView.d());
            if (!(iVar instanceof LinearLayoutManager)) {
                StringBuilder sb = new StringBuilder("The layout manager ");
                sb.append(iVar.getClass().getSimpleName());
                sb.append(" is not supported!");
                throw new IllegalArgumentException(sb.toString());
            } else if (((LinearLayoutManager) iVar).c == 1) {
                if (iVar instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) iVar;
                    e = gridLayoutManager.b.d(e, gridLayoutManager.a);
                }
                if (e == 0 && StickyRecyclerView.this.g.getVisibility() != 8) {
                    rect.top = StickyRecyclerView.this.e.height;
                }
            } else {
                throw new IllegalStateException("Layout manager must be in vertical position");
            }
        }
    }

    class c extends RecyclerView {
        /* access modifiers changed from: private */
        public androidx.recyclerview.widget.RecyclerView.a<?> L;
        /* access modifiers changed from: private */
        public boolean M;
        private final androidx.recyclerview.widget.RecyclerView.c N = new androidx.recyclerview.widget.RecyclerView.c() {
            public final void a() {
                if (c.this.L.b() > 0) {
                    c cVar = c.this;
                    c.super.a(cVar.L);
                    c.this.L.b((androidx.recyclerview.widget.RecyclerView.c) this);
                    c.this.M = true;
                }
            }
        };

        public c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            super.a((m) StickyRecyclerView.this.f);
        }

        public final void a(androidx.recyclerview.widget.RecyclerView.a aVar) {
            if (this.M || aVar == null) {
                super.a(aVar);
                return;
            }
            androidx.recyclerview.widget.RecyclerView.a<?> aVar2 = this.L;
            if (aVar2 != null) {
                aVar2.b(this.N);
            }
            if (aVar.b() == 0) {
                this.L = aVar;
                this.L.a(this.N);
                super.a((androidx.recyclerview.widget.RecyclerView.a) null);
                return;
            }
            this.M = true;
            super.a(aVar);
        }

        public final void a(m mVar) {
            e c = StickyRecyclerView.this.f;
            if (c.a == null) {
                c.a = new CopyOnWriteArrayList();
            }
            c.a.add(mVar);
        }

        public final void b(m mVar) {
            e c = StickyRecyclerView.this.f;
            if (c.a != null) {
                c.a.remove(mVar);
            }
        }

        public final androidx.recyclerview.widget.RecyclerView.a<?> c() {
            return !this.M ? this.L : super.c();
        }
    }

    public static class d extends BaseSavedState {
        public static final Creator<d> CREATOR = new Creator<d>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }
        };
        /* access modifiers changed from: private */
        public boolean a;

        public d(Parcel parcel) {
            super(parcel);
            this.a = juo.a(parcel);
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            juo.a(parcel, this.a);
        }
    }

    class e extends m implements Runnable {
        List<m> a;

        private e() {
        }

        /* synthetic */ e(StickyRecyclerView stickyRecyclerView, byte b2) {
            this();
        }

        public final void a(RecyclerView recyclerView, int i) {
            if (!StickyRecyclerView.this.d) {
                StickyRecyclerView.this.i();
                List<m> list = this.a;
                if (list != null) {
                    for (m a2 : list) {
                        a2.a(recyclerView, i);
                    }
                }
            }
        }

        public final void a(RecyclerView recyclerView, int i, int i2) {
            if (!StickyRecyclerView.this.d) {
                StickyRecyclerView.this.i();
                List<m> list = this.a;
                if (list != null) {
                    for (m a2 : list) {
                        a2.a(recyclerView, i, i2);
                    }
                }
            }
        }

        public final void run() {
            if (!StickyRecyclerView.this.d) {
                StickyRecyclerView.this.i();
            }
        }
    }

    public StickyRecyclerView(Context context) {
        this(context, null);
    }

    public StickyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public StickyRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = new LayoutParams(0, 0);
        this.f = new e(this, 0);
        this.h = new Rect();
        this.i = new Paint();
        this.n = new int[2];
        this.o = new int[2];
        this.q = new HashSet();
        this.t = true;
        this.d = true;
        this.a = new c(context, attributeSet, i2);
        this.a.setId(R.id.legacy_header_sticky_inner_recycler);
        this.r = new b(this, 0);
        this.a.a((h) this.r);
        this.a.setVerticalScrollBarEnabled(false);
        this.u = new RecyclerViewFastScroller(context);
        this.u.a(this.a);
        this.u.setVerticalScrollBarEnabled(true);
        this.u.setEnabled(false);
        addView(this.a);
        addView(this.u);
        this.d = false;
        a(b());
    }

    private View b() {
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        return view;
    }

    private void c() {
        int i2 = this.c;
        int min = d() ? Math.min(-f(), i2) : i2;
        float f2 = i2 != 0 ? ((float) min) / ((float) i2) : 0.0f;
        for (defpackage.fyg.a a2 : this.q) {
            a2.a(min, f2);
        }
    }

    /* access modifiers changed from: private */
    public boolean d() {
        i iVar = (i) fbp.a(this.a.d());
        return iVar.r() == 0 || RecyclerView.f((View) fbp.a(iVar.g(0))) == 0;
    }

    private int e() {
        i d2 = this.a.d();
        int i2 = 0;
        if (d2 == null || d2.r() == 0) {
            return 0;
        }
        View view = (View) fbp.a(d2.g(0));
        boolean z = RecyclerView.f(view) == 0;
        int l2 = d2.l(view);
        if (z) {
            i2 = this.e.height;
        }
        int i3 = l2 + i2;
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            i3 -= ((MarginLayoutParams) view.getLayoutParams()).topMargin;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public int f() {
        return e() - this.e.height;
    }

    private boolean g() {
        return this.j && (!d() || f() < (-this.c));
    }

    private int h() {
        return g() ? -this.c : f();
    }

    /* access modifiers changed from: private */
    public void i() {
        int h2 = h() - this.g.getTop();
        int top = this.g.getTop();
        this.g.offsetTopAndBottom(h2);
        if (top != this.g.getTop()) {
            invalidate();
        }
        c();
    }

    public final int a() {
        return this.c;
    }

    public final void a(int i2) {
        this.i.setColor(i2);
        this.a.k();
    }

    public final void a(View view) {
        View view2 = this.g;
        if (view2 != null) {
            removeView(view2);
        }
        if (view == null) {
            view = b();
        }
        this.g = view;
        addView(this.g);
        requestLayout();
    }

    public final void a(defpackage.fyg.a aVar) {
        this.q.add(aVar);
    }

    public final void a(boolean z) {
        this.j = z;
        requestLayout();
    }

    public final void b(int i2) {
        this.m = i2;
        requestLayout();
    }

    public final void b(View view) {
        this.l = view;
        requestLayout();
    }

    public final void b(boolean z) {
        this.s = z;
        requestLayout();
    }

    public final void c(boolean z) {
        this.a.setVerticalScrollBarEnabled(!z);
        this.u.setEnabled(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.g == null || this.u.a) {
            return false;
        }
        this.g.getHitRect(this.h);
        if (!this.h.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || !this.a.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        this.p = true;
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r5 = r4.a
            androidx.recyclerview.widget.RecyclerView$i r5 = r5.d()
            boolean r0 = r5 instanceof com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.a
            r1 = 0
            if (r0 == 0) goto L_0x0025
            android.view.View r0 = r4.g
            boolean r2 = r0 instanceof com.spotify.android.glue.patterns.prettylist.PrettyHeaderView
            if (r2 == 0) goto L_0x001c
            com.spotify.android.glue.patterns.prettylist.PrettyHeaderView r0 = (com.spotify.android.glue.patterns.prettylist.PrettyHeaderView) r0
            android.view.View r0 = r0.a
            if (r0 == 0) goto L_0x001c
            int r0 = r0.getMeasuredHeight()
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            com.spotify.android.glue.patterns.prettylist.StickyRecyclerView$a r5 = (com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.a) r5
            int r2 = r4.m
            int r2 = r2 + r0
            r5.a(r2)
        L_0x0025:
            int r8 = r8 - r6
            int r9 = r9 - r7
            androidx.recyclerview.widget.RecyclerView r5 = r4.a
            int r6 = r8 + -1
            r5.layout(r1, r1, r6, r9)
            android.view.View r5 = r4.g
            android.widget.AbsListView$LayoutParams r6 = r4.e
            int r6 = r6.height
            r5.layout(r1, r1, r8, r6)
            android.view.View r5 = r4.g
            r6 = 1
            if (r5 == 0) goto L_0x006a
            boolean r7 = r4.j
            if (r7 != 0) goto L_0x0041
            goto L_0x006a
        L_0x0041:
            android.view.View r7 = r4.l
            if (r7 != 0) goto L_0x004d
            int r5 = r5.getMeasuredHeight()
            int r7 = r4.m
            int r5 = r5 - r7
            goto L_0x006b
        L_0x004d:
            int[] r7 = r4.n
            r5.getLocationInWindow(r7)
            android.view.View r5 = r4.l
            int[] r7 = r4.o
            r5.getLocationInWindow(r7)
            int[] r5 = r4.o
            r5 = r5[r6]
            int[] r7 = r4.n
            r7 = r7[r6]
            int r5 = r5 - r7
            int r7 = r4.m
            int r5 = r5 - r7
            int r5 = java.lang.Math.max(r1, r5)
            goto L_0x006b
        L_0x006a:
            r5 = 0
        L_0x006b:
            r4.c = r5
            boolean r5 = r4.g()
            android.view.View r7 = r4.g
            if (r7 == 0) goto L_0x007f
            boolean r7 = r4.k
            if (r5 != r7) goto L_0x007a
            goto L_0x007f
        L_0x007a:
            r4.k = r5
            r4.c()
        L_0x007f:
            r4.i()
            android.view.View r5 = r4.l
            if (r5 != 0) goto L_0x0088
            r5 = 0
            goto L_0x008c
        L_0x0088:
            int r5 = r5.getMeasuredHeight()
        L_0x008c:
            int r7 = r4.m
            int r0 = r5 / 2
            int r7 = r7 + r0
            boolean r0 = defpackage.vgi.a(r4)
            if (r0 == 0) goto L_0x00a8
            com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller r0 = r4.u
            int r2 = r0.getMeasuredWidth()
            com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller r3 = r4.u
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r7
            r0.layout(r1, r7, r2, r3)
            goto L_0x00ba
        L_0x00a8:
            com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller r0 = r4.u
            int r2 = r0.getMeasuredWidth()
            int r2 = r8 - r2
            com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller r3 = r4.u
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r7
            r0.layout(r2, r7, r8, r3)
        L_0x00ba:
            com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller r7 = r4.u
            android.widget.AbsListView$LayoutParams r0 = r4.e
            int r0 = r0.height
            int r2 = r4.m
            int r0 = r0 - r2
            int r0 = r0 - r5
            r7.b = r0
            boolean r5 = r4.v
            r4.v = r1
            android.view.View r7 = r4.b
            if (r7 == 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            android.view.View r7 = r4.g
        L_0x00d1:
            if (r7 == 0) goto L_0x011e
            boolean r0 = r4.s
            if (r0 == 0) goto L_0x011e
            androidx.recyclerview.widget.RecyclerView r0 = r4.a
            androidx.recyclerview.widget.RecyclerView$i r0 = r0.d()
            java.lang.Object r0 = defpackage.fbp.a(r0)
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            androidx.recyclerview.widget.RecyclerView r2 = r4.a
            androidx.recyclerview.widget.RecyclerView$a r2 = r2.c()
            if (r2 == 0) goto L_0x00f0
            int r2 = r2.b()
            goto L_0x00f1
        L_0x00f0:
            r2 = 0
        L_0x00f1:
            int r3 = r0.j()
            int r0 = r0.l()
            int r0 = r0 - r3
            int r2 = r2 - r6
            if (r2 > r0) goto L_0x00ff
            r0 = 1
            goto L_0x0100
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x0110
            int r2 = r7.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x0110
            r4.v = r6
            r7.setVisibility(r3)
            goto L_0x012d
        L_0x0110:
            if (r0 != 0) goto L_0x012c
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x012c
            r4.v = r6
            r7.setVisibility(r1)
            goto L_0x012d
        L_0x011e:
            if (r7 == 0) goto L_0x012c
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x012c
            r4.v = r6
            r7.setVisibility(r1)
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            if (r6 != 0) goto L_0x013a
            if (r5 == 0) goto L_0x0132
            goto L_0x013a
        L_0x0132:
            androidx.recyclerview.widget.RecyclerView r5 = r4.a
            r5.layout(r1, r1, r8, r9)
            r4.v = r1
            return
        L_0x013a:
            androidx.recyclerview.widget.RecyclerView r5 = r4.a
            r5.k()
            android.view.View r5 = r4.b
            if (r5 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            android.view.View r5 = r4.g
        L_0x0146:
            androidx.recyclerview.widget.RecyclerView r6 = r4.a
            androidx.recyclerview.widget.RecyclerView$a r6 = r6.c()
            if (r5 == 0) goto L_0x017a
            boolean r7 = r4.s
            if (r7 == 0) goto L_0x017a
            boolean r7 = r4.t
            if (r7 == 0) goto L_0x017a
            if (r6 == 0) goto L_0x017a
            int r6 = r6.b()
            if (r6 <= 0) goto L_0x017a
            int r6 = r5.getVisibility()
            if (r6 != 0) goto L_0x017a
            r4.t = r1
            androidx.recyclerview.widget.RecyclerView r6 = r4.a
            androidx.recyclerview.widget.RecyclerView$i r6 = r6.d()
            java.lang.Object r6 = defpackage.fbp.a(r6)
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            int r5 = r5.getHeight()
            int r5 = -r5
            r6.a(r1, r5)
        L_0x017a:
            androidx.recyclerview.widget.RecyclerView r5 = r4.a
            r5.layout(r1, r1, r8, r9)
            r4.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        if (this.v) {
            this.g.forceLayout();
        }
        this.g.measure(i2, makeMeasureSpec);
        this.a.measure(i2, i3);
        setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        this.e.width = this.g.getMeasuredWidth();
        this.e.height = this.g.getMeasuredHeight();
        int measuredHeight = this.a.getMeasuredHeight() - this.m;
        View view = this.l;
        if (view != null) {
            measuredHeight -= view.getMeasuredHeight() / 2;
        }
        this.u.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            super.onRestoreInstanceState(dVar.getSuperState());
            this.t = dVar.a;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.a = this.t;
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.p ? this.a.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.p = false;
        }
        return onTouchEvent;
    }
}
