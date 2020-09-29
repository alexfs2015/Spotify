package com.spotify.android.glue.patterns.header.backgrounds;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;

public final class HeaderGenericBackground extends FrameLayout implements fuv {
    private final fuw a;
    private ImageView b;
    private final VisualStyle c;
    private fwv d;
    private TransformationSet e;

    public enum VisualStyle {
        COLOR_ONLY(false, true),
        IMAGE_ONLY(true, false),
        IMAGE_AND_COLOR(true, true);
        
        /* access modifiers changed from: private */
        public final boolean mDrawsColorLayer;
        /* access modifiers changed from: private */
        public final boolean mDrawsImage;

        private VisualStyle(boolean z, boolean z2) {
            this.mDrawsImage = z;
            this.mDrawsColorLayer = z2;
        }
    }

    public final View a() {
        return this;
    }

    public HeaderGenericBackground(Context context, VisualStyle visualStyle) {
        super(context);
        this.c = visualStyle;
        this.a = new fuw(context);
        if (this.c != VisualStyle.COLOR_ONLY) {
            fuw fuw = this.a;
            fuw.c = 255;
            fuw.b.setAlpha(255);
            this.b = new ImageView(context);
            this.b.setScaleType(ScaleType.CENTER_CROP);
            addView(this.b, 0);
            this.d = new fwv(this.b);
            if (this.c == VisualStyle.IMAGE_AND_COLOR) {
                this.e = ((d) fwq.a(0.0f, 0.5f).a().a(1.0f, 0.0f).a(fwo.a((View) this.b, View.ALPHA)).a()).a;
            } else {
                this.e = TransformationSet.c;
            }
        }
        setWillNotDraw(false);
    }

    public final ImageView c() {
        return this.b;
    }

    public final void a(boolean z) {
        this.d.a = z;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.a(getMeasuredWidth(), getMeasuredHeight());
        if (this.c.mDrawsImage) {
            this.d.a(getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.c.mDrawsImage) {
            this.d.a();
        }
    }

    public final void a(int i) {
        fuw fuw = this.a;
        fuw.b.setColor(uuy.a(i, 0.4f));
        fuw.b.setAlpha(fuw.c);
        invalidate();
    }

    public final void b() {
        if (this.c.mDrawsImage) {
            this.b.setImageDrawable(null);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.b || !this.c.mDrawsImage) {
            return super.drawChild(canvas, view, j);
        }
        if (this.c.mDrawsColorLayer) {
            this.a.a(canvas);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        this.a.b(canvas);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.c.mDrawsImage) {
            this.a.a(canvas);
            this.a.b(canvas);
        }
    }

    public final void a(int i, float f) {
        fwv fwv = this.d;
        if (fwv != null) {
            fwv.a(i);
            this.e.a(f);
        }
        this.a.a.setAlpha(255);
        invalidate();
    }
}
