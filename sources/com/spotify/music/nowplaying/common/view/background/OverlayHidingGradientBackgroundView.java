package com.spotify.music.nowplaying.common.view.background;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.R;
import com.spotify.music.nowplaying.common.view.overlay.OverlayHidingFrameLayout;

public class OverlayHidingGradientBackgroundView extends OverlayHidingFrameLayout implements vdc {
    private final GradientDrawable c;

    public OverlayHidingGradientBackgroundView(Context context) {
        this(context, null);
    }

    public OverlayHidingGradientBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayHidingGradientBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int c2 = fr.c(context, R.color.background_gradient_start_color);
        int c3 = fr.c(context, R.color.background_gradient_end_color);
        this.c = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{c2, c3});
        ip.a((View) this, (Drawable) this.c);
    }

    public final void a(int i) {
        this.c.setColorFilter(i, Mode.DST_OVER);
    }
}
