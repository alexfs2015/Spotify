package com.spotify.android.glue.patterns.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.behavior.GlueHeaderAccessoryBehavior;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.GlueScrollingViewBehavior;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.music.R;

public class GlueHeaderLayout extends CoordinatorLayout {
    public boolean d;
    public fyh e;
    private boolean f;
    private final Drawable g;

    static class a extends BaseSavedState {
        public static final Creator<a> CREATOR = gy.a(new gz<a>() {
            public final /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] a(int i) {
                return new a[i];
            }
        });
        /* access modifiers changed from: private */
        public f a;

        protected a(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.a = (f) parcel.readParcelable(classLoader);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, i);
        }
    }

    public GlueHeaderLayout(Context context) {
        this(context, null);
    }

    public GlueHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.pasteActionBarBackground, typedValue, true)) {
            this.g = new ColorDrawable(0);
        } else if (typedValue.type == 3) {
            this.g = gb.a(context.getResources(), typedValue.resourceId, null);
        } else {
            this.g = new ColorDrawable(typedValue.data);
        }
    }

    private d b(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams == null || !z) ? new d(-2, -2) : a(layoutParams);
    }

    private RecyclerView b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
        }
        return null;
    }

    private void f(boolean z) {
        RecyclerView b = b();
        if (b != null) {
            if (z) {
                b.f(0);
                return;
            }
            i d2 = b.d();
            if (d2 instanceof LinearLayoutManager) {
                ((LinearLayoutManager) d2).a(0, 0);
            } else {
                b.d(0);
            }
        }
    }

    public final View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((d) childAt.getLayoutParams()).a instanceof GlueHeaderAccessoryBehavior) {
                return childAt;
            }
        }
        return null;
    }

    public final <T extends View & fwq> void a(T t, HeaderBehavior<T> headerBehavior) {
        a(t, headerBehavior, true);
    }

    public final <T extends View & fwq> void a(T t, HeaderBehavior<T> headerBehavior, boolean z) {
        T e2 = e(true);
        if (z || e2 != t) {
            View e3 = e(true);
            if (e3 != null) {
                removeView(e3);
            }
            View b = ((fwq) t).b();
            d dVar = new d(-1, -2);
            dVar.a((Behavior) headerBehavior);
            addView(b, 1, dVar);
        }
    }

    public final void a(View view, boolean z) {
        View a2 = a();
        if (a2 != null) {
            removeView(a2);
        }
        if (view != null) {
            d b = b(view, z);
            b.a((Behavior) new GlueHeaderAccessoryBehavior());
            addView(view, b);
        }
    }

    public final void a(CharSequence charSequence) {
        fyh fyh = this.e;
        if (fyh != null) {
            fyh.a(charSequence != null ? charSequence.toString() : "");
        }
    }

    public final void a(boolean z) {
        this.f = z;
        View e2 = e(true);
        if (e2 instanceof GlueNoHeaderView) {
            ((GlueNoHeaderView) e2).a = this.f;
        }
        setWillNotDraw(true ^ this.f);
    }

    public final void b(boolean z) {
        fwq fwq = (fwq) fbp.a(e(false));
        HeaderBehavior headerBehavior = (HeaderBehavior) ((d) fwq.b().getLayoutParams()).a;
        if (headerBehavior != null) {
            headerBehavior.a((CoordinatorLayout) this, fwq, false);
        }
    }

    public final void c(boolean z) {
        fwq fwq = (fwq) fbp.a(e(false));
        HeaderBehavior headerBehavior = (HeaderBehavior) ((d) fwq.b().getLayoutParams()).a;
        if (headerBehavior != null) {
            headerBehavior.a((CoordinatorLayout) this, fwq, z);
        }
        f(z);
    }

    public final void d(View view) {
        a(view, false);
    }

    public final void d(boolean z) {
        fwq fwq = (fwq) fbp.a(e(false));
        HeaderBehavior headerBehavior = (HeaderBehavior) ((d) fwq.b().getLayoutParams()).a;
        if (headerBehavior != null) {
            headerBehavior.b((CoordinatorLayout) this, fwq, z);
        }
        f(z);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.f) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, gav.b(getContext()), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final View e(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof fwq) {
                return childAt;
            }
        }
        if (z) {
            return null;
        }
        throw new IllegalStateException("Must have a Behaving header");
    }

    public final void e(View view) {
        d dVar = new d(-1, -1);
        dVar.a((Behavior) new GlueScrollingViewBehavior());
        addView(view, dVar);
    }

    public void onDraw(Canvas canvas) {
        if (this.f) {
            this.g.setBounds(0, 0, getMeasuredWidth(), gav.b(getContext()));
            this.g.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (e(true) == null) {
            a(new GlueNoHeaderView(getContext()), new GlueNoHeaderBehavior(), true);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a) {
            super.onRestoreInstanceState(((a) parcelable).a);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = (f) super.onSaveInstanceState();
        a aVar = new a(AbsSavedState.EMPTY_STATE);
        aVar.a = fVar;
        return aVar;
    }
}
