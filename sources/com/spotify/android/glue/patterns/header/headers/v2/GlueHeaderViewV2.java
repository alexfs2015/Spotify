package com.spotify.android.glue.patterns.header.headers.v2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout.b;
import com.spotify.music.R;

@b(a = GlueHeaderV2Behavior.class)
public class GlueHeaderViewV2 extends FrameLayout implements fvw {
    private static final fva e = new fva() {
        public final void onScroll(float f) {
        }
    };
    public int a;
    private final FrameLayout b;
    private fwk c;
    private fva d;

    public final View b() {
        return this;
    }

    public GlueHeaderViewV2(Context context) {
        this(context, null);
    }

    public GlueHeaderViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueHeaderViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = e;
        LayoutInflater.from(context).inflate(R.layout.glue_header_v2, this, true);
        if (VERSION.SDK_INT < 23) {
            setLayerType(1, null);
        }
        this.b = (FrameLayout) fay.a(findViewById(R.id.header_content));
    }

    public final void a(int i) {
        d().topMargin = i;
        c();
    }

    public final void b(int i) {
        d().bottomMargin = i;
        c();
    }

    public final void a(fva fva) {
        this.d = (fva) fav.a(fva, e);
    }

    public final void a(fwk fwk) {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        fwk fwk2 = this.c;
        if (fwk2 != null) {
            this.b.removeView(fwk2.getView());
        }
        this.c = fwk;
        fwk fwk3 = this.c;
        if (fwk3 != null) {
            this.b.addView(fwk3.getView(), layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        fwk fwk = this.c;
        if (fwk instanceof fwm) {
            ((fwm) fwk).b();
        }
    }

    private void c() {
        if (ip.B(this) && !ip.A(this)) {
            requestLayout();
        }
    }

    private LayoutParams d() {
        return (LayoutParams) this.b.getLayoutParams();
    }

    private static void a(int i, float f, Drawable drawable) {
        if (drawable instanceof fwc) {
            ((fwc) drawable).a(i, f);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
                a(i, f, layerDrawable.getDrawable(i2));
            }
        }
    }

    public final int a() {
        return getMeasuredHeight() - this.a;
    }

    public final void a(int i, float f) {
        FrameLayout frameLayout = this.b;
        frameLayout.offsetTopAndBottom((i - frameLayout.getTop()) + d().topMargin);
        fwk fwk = this.c;
        if (fwk instanceof fwn) {
            ((fwn) fwk).a(i, f);
        }
        a(i, f, getBackground());
        a(i, f, getForeground());
        this.d.onScroll(f);
    }
}
