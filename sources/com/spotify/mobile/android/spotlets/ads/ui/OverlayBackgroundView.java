package com.spotify.mobile.android.spotlets.ads.ui;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;

public class OverlayBackgroundView extends FrameLayout implements iik {
    private final GradientDrawable a;

    public OverlayBackgroundView(Context context) {
        this(context, null);
    }

    public OverlayBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new GradientDrawable();
        this.a.setColor(fr.c(context, R.color.modal_overlay_background));
        ip.a((View) this, (Drawable) this.a);
    }

    public final void a(float f) {
        this.a.setCornerRadius(f);
    }

    public final void a(int i) {
        this.a.setColorFilter(i, Mode.DST_OVER);
    }
}
