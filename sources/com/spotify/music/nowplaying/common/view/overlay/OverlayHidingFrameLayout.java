package com.spotify.music.nowplaying.common.view.overlay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.widget.FrameLayout;
import io.reactivex.Flowable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class OverlayHidingFrameLayout extends FrameLayout implements OnHierarchyChangeListener, tks {
    protected int a;
    public int b;
    private final GestureDetector c;
    private final it d;
    private final it e;
    private final Set<defpackage.tks.b> f;
    /* access modifiers changed from: private */
    public final Set<defpackage.tks.a> g;
    private final Runnable h;
    private boolean i;
    /* access modifiers changed from: private */
    public boolean j;
    /* access modifiers changed from: private */
    public boolean k;
    /* access modifiers changed from: private */
    public View l;

    abstract class a implements it {
        boolean a;

        private a() {
        }

        /* synthetic */ a(OverlayHidingFrameLayout overlayHidingFrameLayout, byte b2) {
            this();
        }

        public void a(View view) {
            OverlayHidingFrameLayout.this.k = true;
            this.a = false;
        }

        public void b(View view) {
            OverlayHidingFrameLayout.this.k = false;
        }

        public final void c(View view) {
            OverlayHidingFrameLayout.this.k = false;
            this.a = true;
            OverlayHidingFrameLayout.this.l.setAlpha(1.0f);
            OverlayHidingFrameLayout.this.a(false, false);
        }
    }

    static class b extends BaseSavedState {
        public static final Creator<b> CREATOR = new Creator<b>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }
        };
        boolean a;
        boolean b;

        b(Parcel parcel) {
            super(parcel);
            this.a = juo.a(parcel);
            this.b = juo.a(parcel);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            juo.a(parcel, this.a);
            juo.a(parcel, this.b);
        }
    }

    class c extends SimpleOnGestureListener {
        private c() {
        }

        /* synthetic */ c(OverlayHidingFrameLayout overlayHidingFrameLayout, byte b) {
            this();
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if ((OverlayHidingFrameLayout.this.l.getAlpha() >= 1.0f && OverlayHidingFrameLayout.a((View) OverlayHidingFrameLayout.this, Math.round(motionEvent.getX()) + OverlayHidingFrameLayout.this.getLeft(), Math.round(motionEvent.getY()) + OverlayHidingFrameLayout.this.getTop())) || OverlayHidingFrameLayout.this.g.isEmpty()) {
                return false;
            }
            OverlayHidingFrameLayout.f(OverlayHidingFrameLayout.this);
            return true;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!OverlayHidingFrameLayout.this.j) {
                return true;
            }
            if (OverlayHidingFrameLayout.this.l.getVisibility() == 4) {
                OverlayHidingFrameLayout.this.a(true, true);
                OverlayHidingFrameLayout.b(OverlayHidingFrameLayout.this, false);
                return true;
            } else if (OverlayHidingFrameLayout.a((View) OverlayHidingFrameLayout.this, Math.round(motionEvent.getX()) + OverlayHidingFrameLayout.this.getLeft(), Math.round(motionEvent.getY()) + OverlayHidingFrameLayout.this.getTop())) {
                return false;
            } else {
                if (OverlayHidingFrameLayout.this.l.getVisibility() == 0) {
                    OverlayHidingFrameLayout.this.c(true);
                    OverlayHidingFrameLayout.b(OverlayHidingFrameLayout.this, true);
                } else {
                    OverlayHidingFrameLayout.this.a(true, true);
                    OverlayHidingFrameLayout.b(OverlayHidingFrameLayout.this, false);
                }
                return true;
            }
        }
    }

    public OverlayHidingFrameLayout(Context context) {
        this(context, null);
    }

    public OverlayHidingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayHidingFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new GestureDetector(getContext(), new c(this, 0));
        this.d = new a() {
            public final void a(View view) {
                super.a(view);
                OverlayHidingFrameLayout.this.d();
                OverlayHidingFrameLayout.this.l.setVisibility(0);
            }
        };
        this.e = new a() {
            public final void a(View view) {
                super.a(view);
                OverlayHidingFrameLayout.this.e();
            }

            public final void b(View view) {
                super.b(view);
                if (!this.a) {
                    OverlayHidingFrameLayout.this.l.setVisibility(4);
                }
            }
        };
        this.f = new LinkedHashSet();
        this.g = new LinkedHashSet();
        this.h = new Runnable() {
            public final void run() {
                OverlayHidingFrameLayout.this.g();
            }
        };
        this.a = 200;
        this.b = 3500;
        this.i = true;
        this.j = true;
        setOnHierarchyChangeListener(this);
    }

    /* access modifiers changed from: private */
    public static boolean a(View view, int i2, int i3) {
        if (view.isClickable() && b(view, i2, i3)) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            int left = i2 - viewGroup.getLeft();
            int top = i3 - viewGroup.getTop();
            if (left >= 0 && top >= 0 && a(childAt, left, top)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(boolean z, int i2) {
        View view = this.l;
        if (view == null || view.getVisibility() == i2) {
            return false;
        }
        if (!z) {
            this.l.setAlpha(i2 == 0 ? 1.0f : 0.0f);
            this.l.setVisibility(i2);
        }
        return z;
    }

    static /* synthetic */ void b(OverlayHidingFrameLayout overlayHidingFrameLayout, boolean z) {
        for (defpackage.tks.a d2 : overlayHidingFrameLayout.g) {
            d2.d();
        }
    }

    private static boolean b(View view, int i2, int i3) {
        return i2 >= view.getLeft() && i2 <= view.getRight() && i3 >= view.getTop() && i3 <= view.getBottom();
    }

    /* access modifiers changed from: private */
    public void d() {
        for (defpackage.tks.b a2 : this.f) {
            a2.a();
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        for (defpackage.tks.b b2 : this.f) {
            b2.b();
        }
    }

    private void f() {
        if (this.i) {
            removeCallbacks(this.h);
            postDelayed(this.h, (long) this.b);
        }
    }

    static /* synthetic */ void f(OverlayHidingFrameLayout overlayHidingFrameLayout) {
        Iterator it = overlayHidingFrameLayout.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        c(true);
    }

    public final void a(View view) {
        ViewParent parent = ((View) fbp.a(view)).getParent();
        while (parent != this) {
            parent = parent.getParent();
            if (parent == null) {
                throw new IllegalArgumentException("Overlay has to be a child of the container!");
            }
        }
        this.l = view;
    }

    public void a(defpackage.tks.a aVar) {
        this.g.add(fbp.a(aVar));
    }

    public final void a(defpackage.tks.b bVar) {
        this.f.add(fbp.a(bVar));
    }

    public final void a(boolean z) {
        this.i = z;
        if (this.l != null && !z) {
            removeCallbacks(this.h);
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z, boolean z2) {
        if (z2) {
            this.l.animate().cancel();
        }
        f();
        if (!a(z, 0)) {
            d();
        } else {
            ip.n(this.l).a((long) this.a).a(fuh.c).a(this.d).a(1.0f).c();
        }
    }

    public final boolean a() {
        return this.l.getVisibility() == 0;
    }

    public final Flowable<Boolean> b() {
        return tkm.a(this);
    }

    public final void b(int i2) {
        ip.a(this.l, fr.a(getContext(), i2));
    }

    public final void b(boolean z) {
        this.j = z;
        if (!z) {
            a(false);
        }
    }

    public final void c() {
        ip.a(this.l, (Drawable) null);
    }

    public final void c(boolean z) {
        this.l.animate().cancel();
        if (!a(z, 4)) {
            e();
        } else {
            ip.n(this.l).a((long) this.a).a(fuh.c).a(this.e).a(0.0f).c();
        }
    }

    public final void d(boolean z) {
        a(z, true);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.l == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        removeCallbacks(this.h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            f();
        }
        if (actionMasked == 0 && this.k) {
            this.l.animate().cancel();
        } else if (this.c.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onChildViewAdded(View view, View view2) {
        a(view2);
    }

    public void onChildViewRemoved(View view, View view2) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(null);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.i = bVar.a;
        if (bVar.b) {
            a(false, true);
        } else {
            c(false);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.a = this.i;
        bVar.b = this.l.getVisibility() == 0;
        return bVar;
    }
}
