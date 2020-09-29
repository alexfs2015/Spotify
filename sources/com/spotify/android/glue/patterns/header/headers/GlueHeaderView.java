package com.spotify.android.glue.patterns.header.headers;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout.b;
import com.spotify.android.glue.patterns.header.backgrounds.HeaderGenericBackground;
import com.spotify.android.glue.patterns.header.backgrounds.HeaderGenericBackground.VisualStyle;
import com.spotify.android.glue.patterns.header.behavior.GlueHeaderBehavior;
import com.spotify.music.R;
import java.util.Locale;

@b(a = GlueHeaderBehavior.class)
public class GlueHeaderView extends ViewGroup implements fwq, fxn, fxo, fyf {
    private static final fvu e = new fvu() {
        public final void onScroll(float f) {
        }
    };
    public fws a;
    private fvu b;
    private fwr c;
    private final Rect d;

    public static class GlueHeaderViewLayoutParams extends MarginLayoutParams {
        public boolean a;
        public int b = 2;
        public fwv c;

        public GlueHeaderViewLayoutParams(int i, int i2) {
            super(-1, i2);
        }

        public GlueHeaderViewLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gao.a.d);
            try {
                this.a = obtainStyledAttributes.getBoolean(defpackage.gao.a.f, true);
                this.b = obtainStyledAttributes.getInt(defpackage.gao.a.e, 2);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public static class a {
        public int a;
        public VisualStyle b;

        private a() {
            this.a = R.attr.glueHeaderStyle;
            this.b = VisualStyle.IMAGE_AND_COLOR;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final GlueHeaderView a(Context context) {
            GlueHeaderView glueHeaderView = new GlueHeaderView(context, null, this.a, 0, this.b, null);
            return glueHeaderView;
        }
    }

    public GlueHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.glueHeaderStyle, 0, null, null);
    }

    public GlueHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, R.attr.glueHeaderStyle, i, null, null);
    }

    /* JADX INFO: finally extract failed */
    private GlueHeaderView(Context context, AttributeSet attributeSet, int i, int i2, VisualStyle visualStyle, fvp fvp) {
        super(context, attributeSet, i);
        this.b = e;
        this.d = new Rect();
        int a2 = gau.a(getContext().getResources());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.gao.a.a, i, i2);
        try {
            float fraction = obtainStyledAttributes.getFraction(defpackage.gao.a.b, 1, 1, -1.0f);
            int integer = obtainStyledAttributes.getInteger(defpackage.gao.a.c, 3);
            VisualStyle visualStyle2 = integer != 1 ? integer != 2 ? VisualStyle.IMAGE_AND_COLOR : VisualStyle.IMAGE_ONLY : VisualStyle.COLOR_ONLY;
            obtainStyledAttributes.recycle();
            this.c = new fwr(new defpackage.fwr.a() {
                public final void a(int i) {
                    GlueHeaderView.a(i, (fqy) GlueHeaderView.this.a.b);
                }

                public final void b(int i) {
                    GlueHeaderView.a(i, (fqy) GlueHeaderView.this.a.c);
                }
            }, fraction, a2, getResources().getDisplayMetrics().heightPixels);
            if (fvp == null) {
                fvp = new HeaderGenericBackground(context, (VisualStyle) fbm.a(visualStyle, visualStyle2));
            }
            addView(fvp.a(), 0);
            this.a = new fws(this, fvp);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    static /* synthetic */ void a(int i, fqy fqy) {
        if (fqy != null) {
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = (GlueHeaderViewLayoutParams) fqy.getView().getLayoutParams();
            if (!(glueHeaderViewLayoutParams != null ? glueHeaderViewLayoutParams.a : false)) {
                View view = fqy.getView();
                view.offsetTopAndBottom(i - view.getTop());
            }
        }
    }

    public static a d() {
        return new a(0);
    }

    public final int a() {
        fwr fwr = this.c;
        return fwr.a - ((fwr.b + fwr.c) + fwr.d);
    }

    public final void a(int i) {
        this.c.c = i;
    }

    public final void a(int i, float f) {
        fwr fwr = this.c;
        fwr.g.a(fwr.a() + i + fwr.h);
        fwr.g.b(fwr.d + i);
        fws fws = this.a;
        fws.a(f, fws.c);
        fws.a(f, fws.b);
        if (fws.b instanceof fxh) {
            ((fxh) fws.b).a(i, f);
        }
        fws.d.a(i, f);
        this.b.onScroll(f);
    }

    public final void a(fsy fsy) {
        int c2 = vgl.c(getContext(), R.attr.actionBarSize);
        fws fws = this.a;
        GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = new GlueHeaderViewLayoutParams(-1, c2);
        if (fsy != null) {
            glueHeaderViewLayoutParams.c = new fwu(fsy);
        }
        if (fws.c != null) {
            fws.a.removeView(fws.c.getView());
        }
        fws.c = fsy;
        if (fws.c != null) {
            fws.a.addView(fws.c.getView(), fws.b != null ? 2 : 1, glueHeaderViewLayoutParams);
        }
    }

    public final void a(fwt fwt) {
        this.a.d.b();
        fwt.a(this);
    }

    public final void a(fxe fxe) {
        fws fws = this.a;
        GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = new GlueHeaderViewLayoutParams(-1, -1);
        if (fws.b != null) {
            fws.a.removeView(fws.b.getView());
        }
        fws.b = fxe;
        if (fws.b != null) {
            fws.a.addView(fws.b.getView(), 1, glueHeaderViewLayoutParams);
        }
    }

    public final void a(boolean z) {
        this.a.d.a(z);
    }

    public final View b() {
        return this;
    }

    public final void b(int i) {
        this.a.d.a(i);
    }

    public final ImageView c() {
        return this.a.d.c();
    }

    public final void c(int i) {
        a(i);
    }

    public final ViewGroup e() {
        return this;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new GlueHeaderViewLayoutParams(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new GlueHeaderViewLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        this.a.d.a().layout(this.d.left, this.d.top, getMeasuredWidth() - (this.d.left + this.d.right), getMeasuredHeight() - (this.d.top + this.d.bottom));
        int i6 = this.c.d;
        if (this.a.c != null) {
            View view = this.a.c.getView();
            view.layout(0, i6, view.getMeasuredWidth(), view.getMeasuredHeight() + i6);
            i6 += view.getMeasuredHeight();
        }
        if (this.a.b != null) {
            View view2 = this.a.b.getView();
            int measuredHeight = (getMeasuredHeight() - i6) - this.c.c;
            int i7 = ((GlueHeaderViewLayoutParams) view2.getLayoutParams()).b;
            if (i7 == 0) {
                i5 = i6;
            } else if (i7 == 1) {
                i5 = (measuredHeight + i6) - view2.getMeasuredHeight();
            } else if (i7 == 2) {
                i5 = ((measuredHeight - view2.getMeasuredHeight()) / 2) + i6;
            } else {
                throw new IllegalArgumentException(String.format(Locale.getDefault(), "Invalid gravity value: %d", new Object[]{Integer.valueOf(i7)}));
            }
            this.c.h = i5 - i6;
            view2.layout(0, i5, view2.getMeasuredWidth(), view2.getMeasuredHeight() + i5);
        }
        fws fws = this.a;
        if (fws.b instanceof fxg) {
            ((fxg) fws.b).b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int i3 = this.c.c + this.c.d;
        if (this.a.c != null) {
            View view = this.a.c.getView();
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = (GlueHeaderViewLayoutParams) view.getLayoutParams();
            fbp.a(glueHeaderViewLayoutParams);
            fbp.a((glueHeaderViewLayoutParams.height == -2 || glueHeaderViewLayoutParams.height == -1) ? false : true);
            view.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(glueHeaderViewLayoutParams.height, 1073741824));
            int measuredHeight = view.getMeasuredHeight();
            i3 += measuredHeight;
            this.c.b = measuredHeight;
        } else {
            this.c.b = 0;
        }
        if (this.a.b != null) {
            fwr fwr = this.c;
            int a2 = fwr.e != -1.0f ? ((int) (((float) fwr.f) * fwr.e)) - fwr.a() : 0;
            View view2 = this.a.b.getView();
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams2 = (GlueHeaderViewLayoutParams) view2.getLayoutParams();
            if (glueHeaderViewLayoutParams2 == null) {
                view2.setMinimumHeight(a2);
                view2.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            } else if (glueHeaderViewLayoutParams2.height == -1) {
                view2.setMinimumHeight(a2);
                view2.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            } else if (glueHeaderViewLayoutParams2.height == -2) {
                view2.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                view2.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(glueHeaderViewLayoutParams2.height, 1073741824));
            }
            i3 += Math.max(view2.getMeasuredHeight(), a2);
        }
        this.a.d.a().measure(MeasureSpec.makeMeasureSpec((size - this.d.left) - this.d.right, 1073741824), MeasureSpec.makeMeasureSpec((i3 - this.d.top) - this.d.bottom, 1073741824));
        setMeasuredDimension(size, i3);
        this.c.a = i3;
    }
}
