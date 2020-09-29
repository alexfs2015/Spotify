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
public class GlueHeaderView extends ViewGroup implements fvw, fwt, fwu, fxl {
    private static final fva e = new fva() {
        public final void onScroll(float f) {
        }
    };
    public fvy a;
    private fva b;
    private fvx c;
    private final Rect d;

    public static class GlueHeaderViewLayoutParams extends MarginLayoutParams {
        public boolean a;
        public int b = 2;
        public fwb c;

        public GlueHeaderViewLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.fzu.a.d);
            try {
                this.a = obtainStyledAttributes.getBoolean(defpackage.fzu.a.f, true);
                this.b = obtainStyledAttributes.getInt(defpackage.fzu.a.e, 2);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public GlueHeaderViewLayoutParams(int i, int i2) {
            super(-1, i2);
        }
    }

    public static class a {
        public int a;
        public VisualStyle b;

        /* synthetic */ a(byte b2) {
            this();
        }

        private a() {
            this.a = R.attr.glueHeaderStyle;
            this.b = VisualStyle.IMAGE_AND_COLOR;
        }

        public final GlueHeaderView a(Context context) {
            GlueHeaderView glueHeaderView = new GlueHeaderView(context, null, this.a, 0, this.b, null);
            return glueHeaderView;
        }
    }

    public final View b() {
        return this;
    }

    public final ViewGroup e() {
        return this;
    }

    public static a d() {
        return new a(0);
    }

    public GlueHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.glueHeaderStyle, 0, null, null);
    }

    public GlueHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, R.attr.glueHeaderStyle, i, null, null);
    }

    /* JADX INFO: finally extract failed */
    private GlueHeaderView(Context context, AttributeSet attributeSet, int i, int i2, VisualStyle visualStyle, fuv fuv) {
        VisualStyle visualStyle2;
        super(context, attributeSet, i);
        this.b = e;
        this.d = new Rect();
        int a2 = gaa.a(getContext().getResources());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.fzu.a.a, i, i2);
        try {
            float fraction = obtainStyledAttributes.getFraction(defpackage.fzu.a.b, 1, 1, -1.0f);
            int integer = obtainStyledAttributes.getInteger(defpackage.fzu.a.c, 3);
            if (integer == 1) {
                visualStyle2 = VisualStyle.COLOR_ONLY;
            } else if (integer != 2) {
                visualStyle2 = VisualStyle.IMAGE_AND_COLOR;
            } else {
                visualStyle2 = VisualStyle.IMAGE_ONLY;
            }
            obtainStyledAttributes.recycle();
            this.c = new fvx(new defpackage.fvx.a() {
                public final void a(int i) {
                    GlueHeaderView.a(i, (fqe) GlueHeaderView.this.a.b);
                }

                public final void b(int i) {
                    GlueHeaderView.a(i, (fqe) GlueHeaderView.this.a.c);
                }
            }, fraction, a2, getResources().getDisplayMetrics().heightPixels);
            if (fuv == null) {
                fuv = new HeaderGenericBackground(context, (VisualStyle) fav.a(visualStyle, visualStyle2));
            }
            addView(fuv.a(), 0);
            this.a = new fvy(this, fuv);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(int i) {
        this.c.c = i;
    }

    public final void b(int i) {
        this.a.d.a(i);
    }

    public final void a(fwk fwk) {
        fvy fvy = this.a;
        GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = new GlueHeaderViewLayoutParams(-1, -1);
        if (fvy.b != null) {
            fvy.a.removeView(fvy.b.getView());
        }
        fvy.b = fwk;
        if (fvy.b != null) {
            fvy.a.addView(fvy.b.getView(), 1, glueHeaderViewLayoutParams);
        }
    }

    public final void c(int i) {
        a(i);
    }

    public final void a(fse fse) {
        int c2 = uuu.c(getContext(), R.attr.actionBarSize);
        fvy fvy = this.a;
        GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = new GlueHeaderViewLayoutParams(-1, c2);
        if (fse != null) {
            glueHeaderViewLayoutParams.c = new fwa(fse);
        }
        if (fvy.c != null) {
            fvy.a.removeView(fvy.c.getView());
        }
        fvy.c = fse;
        if (fvy.c != null) {
            fvy.a.addView(fvy.c.getView(), fvy.b != null ? 2 : 1, glueHeaderViewLayoutParams);
        }
    }

    public final void a(boolean z) {
        this.a.d.a(z);
    }

    public final void a(int i, float f) {
        fvx fvx = this.c;
        fvx.g.a(fvx.a() + i + fvx.h);
        fvx.g.b(fvx.d + i);
        fvy fvy = this.a;
        fvy.a(f, fvy.c);
        fvy.a(f, fvy.b);
        if (fvy.b instanceof fwn) {
            ((fwn) fvy.b).a(i, f);
        }
        fvy.d.a(i, f);
        this.b.onScroll(f);
    }

    public final ImageView c() {
        return this.a.d.c();
    }

    public final int a() {
        fvx fvx = this.c;
        return fvx.a - ((fvx.b + fvx.c) + fvx.d);
    }

    public final void a(fvz fvz) {
        this.a.d.b();
        fvz.a(this);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int i3 = this.c.c + this.c.d;
        if (this.a.c != null) {
            View view = this.a.c.getView();
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = (GlueHeaderViewLayoutParams) view.getLayoutParams();
            fay.a(glueHeaderViewLayoutParams);
            fay.a((glueHeaderViewLayoutParams.height == -2 || glueHeaderViewLayoutParams.height == -1) ? false : true);
            view.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(glueHeaderViewLayoutParams.height, 1073741824));
            int measuredHeight = view.getMeasuredHeight();
            i3 += measuredHeight;
            this.c.b = measuredHeight;
        } else {
            this.c.b = 0;
        }
        if (this.a.b != null) {
            fvx fvx = this.c;
            int a2 = fvx.e != -1.0f ? ((int) (((float) fvx.f) * fvx.e)) - fvx.a() : 0;
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
        fvy fvy = this.a;
        if (fvy.b instanceof fwm) {
            ((fwm) fvy.b).b();
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new GlueHeaderViewLayoutParams(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new GlueHeaderViewLayoutParams(getContext(), attributeSet);
    }

    static /* synthetic */ void a(int i, fqe fqe) {
        boolean z;
        if (fqe != null) {
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = (GlueHeaderViewLayoutParams) fqe.getView().getLayoutParams();
            if (glueHeaderViewLayoutParams != null) {
                z = glueHeaderViewLayoutParams.a;
            } else {
                z = false;
            }
            if (!z) {
                View view = fqe.getView();
                view.offsetTopAndBottom(i - view.getTop());
            }
        }
    }
}
