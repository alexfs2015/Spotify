package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout {
    private final Paint a = new Paint();
    private final apw b = new apw();

    public ShimmerFrameLayout(Context context) {
        super(context);
        a(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private ShimmerFrameLayout a(apv apv) {
        this.b.a(apv);
        if (apv == null || !apv.n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.a);
        }
        return this;
    }

    private void a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.b.setCallback(this);
        if (attributeSet == null) {
            a(new a().b());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, 0, 0);
        try {
            a(((!obtainStyledAttributes.hasValue(a.f) || !obtainStyledAttributes.getBoolean(a.f, false)) ? new a() : new c()).a(obtainStyledAttributes).b());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.b.draw(canvas);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        apw apw = this.b;
        if (apw.a != null) {
            if (apw.a != null && apw.a.isStarted()) {
                apw.a.cancel();
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
