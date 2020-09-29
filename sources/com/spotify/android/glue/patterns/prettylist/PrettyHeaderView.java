package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.music.R;

public class PrettyHeaderView extends ViewGroup implements fwq, fxn {
    View a;
    public fxt b;
    private fyh c;
    private HeaderInternalImageView d;
    private View e;
    private CharSequence f;
    private View g;
    private int h;
    private int i;
    private float j;
    private int k;
    private int l;
    private int m;

    public static class HeaderInternalImageView extends AppCompatImageView {
        public boolean a;

        public HeaderInternalImageView(Context context) {
            super(context);
        }

        public HeaderInternalImageView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public HeaderInternalImageView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public final void a(Drawable drawable) {
            super.setImageDrawable(drawable);
        }

        public void setImageDrawable(Drawable drawable) {
            if (!this.a) {
                super.setImageDrawable(drawable);
            }
        }
    }

    public PrettyHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = fyh.a;
        a(context, false);
    }

    public PrettyHeaderView(Context context, View view) {
        this(context, view, false);
    }

    private PrettyHeaderView(Context context, View view, boolean z) {
        super(context);
        this.c = fyh.a;
        a(context, false);
        addView(view);
        c(view);
    }

    private void a(Context context, boolean z) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.pastePrettyHeaderStyle, typedValue, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(typedValue.resourceId, a.m);
            this.m = obtainStyledAttributes.getColor(a.o, -16777216);
            this.k = obtainStyledAttributes.getDimensionPixelSize(a.n, vfj.b(24.0f, getResources()));
            obtainStyledAttributes.recycle();
            this.d = new HeaderInternalImageView(context);
            this.d.setScaleType(ScaleType.CENTER_CROP);
            a(z);
            addView(this.d);
            return;
        }
        throw new IllegalStateException("Unable to resolve PrettyHeaderView style.");
    }

    private void c(View view) {
        this.e = view;
        View view2 = this.e;
        if (view2 instanceof fxo) {
            this.b = new fxr(this, this.d, view2, this.k);
            this.d.setVisibility(8);
            return;
        }
        fxs fxs = new fxs(this, this.d, view2, this.k, this.c);
        this.b = fxs;
        this.d.setVisibility(0);
    }

    public final int a() {
        return getMeasuredHeight() - (this.h + this.l);
    }

    public final void a(int i2) {
        this.b.b(i2);
    }

    public final void a(int i2, float f2) {
        this.i = i2;
        this.j = f2;
        this.b.a(i2, f2);
        if (this.b.h()) {
            invalidate(0, 0, getMeasuredWidth(), this.b.g() - i2);
        }
    }

    public final void a(View view) {
        View view2 = this.a;
        if (view2 != null) {
            removeView(view2);
        }
        this.a = view;
        this.b.a(view);
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void a(fyh fyh) {
        this.c = fyh;
        this.b.a(fyh);
    }

    public final void a(CharSequence charSequence) {
        this.f = charSequence;
        this.b.a(this.f);
        this.c.a(charSequence != null ? charSequence.toString() : null);
        this.b.a(this.i, this.j);
        View view = this.e;
        if (view instanceof GlueHeaderView) {
            fsy fsy = ((GlueHeaderView) view).a.c;
            if (fsy != null) {
                fsy.a((CharSequence) String.valueOf(charSequence));
            }
        }
    }

    public final void a(boolean z) {
        Context context = getContext();
        if (z) {
            HeaderInternalImageView headerInternalImageView = this.d;
            headerInternalImageView.a = false;
            headerInternalImageView.setImageDrawable(new ColorDrawable(vgl.b(context, 16842836)));
            this.d.setColorFilter(this.m);
            return;
        }
        HeaderInternalImageView headerInternalImageView2 = this.d;
        headerInternalImageView2.a = true;
        headerInternalImageView2.setBackgroundColor(vgl.b(context, 16842836));
    }

    public final View b() {
        return this;
    }

    public final void b(int i2) {
        this.h = i2;
        this.b.d(i2);
    }

    public final void b(View view) {
        View view2 = this.g;
        if (view2 != null) {
            removeView(view2);
        }
        this.g = view;
        this.b.b(view);
        if (view != null) {
            addView(view);
            View view3 = this.a;
            if (view3 != null) {
                a(view3);
            }
        }
        requestLayout();
    }

    public final void b(boolean z) {
        this.b.a(true);
    }

    public final ImageView c() {
        return this.b.c();
    }

    public final void c(int i2) {
        this.l = i2;
        this.b.e(i2);
    }

    public final void c(boolean z) {
        this.b.c(false);
    }

    public final View d() {
        return this.b.d();
    }

    public final void d(int i2) {
        this.b.f(i2);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        if (!this.b.h() || (view != this.d && view != this.e)) {
            return super.drawChild(canvas, view, j2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), this.b.g());
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restore();
        return drawChild;
    }

    public final int e() {
        return this.b.f();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View view = null;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof fxn) {
                view = childAt;
            }
        }
        fbp.a(view);
        c(view);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.b.b(i2, i4);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (MeasureSpec.getMode(i3) == 1073741824) {
            this.b.a(i2, i3);
        } else {
            this.b.a(i2, MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(this.b.a(), this.b.b());
    }
}
