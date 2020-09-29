package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedList;

public class StickyListView extends ViewGroup implements fxm {
    public final a a;
    public View b;
    boolean c;
    public int d;
    /* access modifiers changed from: private */
    public boolean e;
    private final FrameLayout f;
    private final LayoutParams g;
    /* access modifiers changed from: private */
    public final b h;
    private final Rect i;
    private boolean j;
    private View k;
    private int l;
    private final int[] m;
    private final int[] n;
    private boolean o;
    private final LinkedList<defpackage.fxm.a> p;

    class a extends HidingHeaderListView {
        public a(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            super.setOnScrollListener(StickyListView.this.h);
        }

        public final void setOnScrollListener(OnScrollListener onScrollListener) {
            StickyListView.this.h.a = onScrollListener;
        }
    }

    class b implements OnScrollListener, Runnable {
        OnScrollListener a;
        private int b;
        private boolean c;

        private b() {
        }

        /* synthetic */ b(StickyListView stickyListView, byte b2) {
            this();
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (!StickyListView.this.e) {
                this.b = i;
                boolean z = this.c;
                this.c = this.b != 0;
                a();
                StickyListView.this.c();
                OnScrollListener onScrollListener = this.a;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(absListView, i);
                }
                if (!z && this.c) {
                    ip.a((View) StickyListView.this, (Runnable) this);
                }
            }
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (!StickyListView.this.e) {
                a();
                StickyListView.this.c();
                OnScrollListener onScrollListener = this.a;
                if (onScrollListener != null) {
                    onScrollListener.onScroll(absListView, i, i2, i3);
                }
            }
        }

        private void a() {
            if (StickyListView.this.c != StickyListView.this.d()) {
                StickyListView.this.requestLayout();
            }
        }

        public final void run() {
            if (!StickyListView.this.e) {
                a();
                StickyListView.this.c();
                if (this.c && StickyListView.this.getWindowToken() != null) {
                    ip.a((View) StickyListView.this, (Runnable) this);
                }
            }
        }
    }

    public StickyListView(Context context) {
        this(context, null);
    }

    public StickyListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public StickyListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = new LayoutParams(0, 0);
        this.h = new b(this, 0);
        this.i = new Rect();
        this.m = new int[2];
        this.n = new int[2];
        this.p = new LinkedList<>();
        this.e = true;
        this.f = new FrameLayout(context);
        this.f.setLayoutParams(this.g);
        this.a = new a(context, attributeSet, i2);
        this.a.setId(16908298);
        a aVar = this.a;
        aVar.a = true;
        addView(aVar);
        this.a.addHeaderView(this.f, null, false);
        this.e = false;
        a(b());
    }

    private View b() {
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        return view;
    }

    public final void a(defpackage.fxm.a aVar) {
        this.p.add(aVar);
    }

    public final void a(View view) {
        View view2 = this.b;
        if (view2 != null) {
            removeView(view2);
            this.f.removeView(this.b);
        }
        if (view == null) {
            view = b();
        }
        this.b = view;
        addView(this.b);
        requestLayout();
    }

    public final void a(int i2) {
        this.f.setBackgroundColor(i2);
    }

    public final void b(View view) {
        this.k = view;
        requestLayout();
    }

    public final void b(int i2) {
        this.l = i2;
        requestLayout();
    }

    public final void a(boolean z) {
        this.j = z;
        requestLayout();
    }

    public final int a() {
        return this.d;
    }

    /* access modifiers changed from: private */
    public boolean d() {
        return this.j && (this.a.getFirstVisiblePosition() > 0 || this.f.getTop() <= (-this.d));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view = this.b;
        if (view == null || !this.c) {
            return false;
        }
        view.getHitRect(this.i);
        if (!this.i.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || !this.a.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        this.o = true;
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.o) {
            z = this.a.onTouchEvent(motionEvent);
        } else {
            z = super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.o = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        this.b.measure(i2, MeasureSpec.makeMeasureSpec(0, 0));
        this.a.measure(i2, i3);
        setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        this.g.width = this.b.getMeasuredWidth();
        this.g.height = this.b.getMeasuredHeight();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        int i7 = 0;
        this.a.layout(0, 0, i6, i5 - i3);
        boolean z2 = this.b.getParent() == this.f;
        boolean z3 = this.f.getParent() == this.a;
        if (z2 && !z3) {
            this.f.removeViewInLayout(this.b);
            addViewInLayout(this.b, -1, this.g);
            z2 = false;
        }
        if (!z2 && this.j) {
            View view = this.b;
            view.layout(0, 0, i6, view.getMeasuredHeight());
        }
        View view2 = this.b;
        if (view2 != null && this.j) {
            if (this.k == null) {
                i7 = view2.getMeasuredHeight() - this.l;
            } else {
                view2.getLocationInWindow(this.m);
                this.k.getLocationInWindow(this.n);
                i7 = Math.max(0, (this.n[1] - this.m[1]) - this.l);
            }
        }
        this.d = i7;
        boolean d2 = d();
        if (z3) {
            if (d2 && z2) {
                boolean hasFocus = this.b.hasFocus();
                this.f.removeViewInLayout(this.b);
                addViewInLayout(this.b, -1, this.g);
                if (hasFocus && !this.b.hasFocus()) {
                    this.b.requestFocus();
                }
            } else if (!d2 && !z2) {
                removeViewInLayout(this.b);
                this.f.addView(this.b);
            }
        }
        if (!(this.b == null || d2 == this.c)) {
            this.c = d2;
            c();
        }
        if (d2) {
            this.b.offsetTopAndBottom(-this.d);
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        int i2 = this.d;
        int min = this.a.getFirstVisiblePosition() == 0 ? Math.min(-this.f.getTop(), i2) : i2;
        float f2 = i2 != 0 ? ((float) min) / ((float) i2) : 0.0f;
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((defpackage.fxm.a) it.next()).a(min, f2);
        }
    }
}
