package com.spotify.music.nowplaying.drivingmode.view.backgroundgradients;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;

public class DrivingOverlayNpvGradientBackgroundView extends FrameLayout implements vdc {
    public View a;
    public View b;
    private final GradientDrawable c;

    public DrivingOverlayNpvGradientBackgroundView(Context context) {
        this(context, null);
    }

    public DrivingOverlayNpvGradientBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrivingOverlayNpvGradientBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int c2 = fr.c(context, R.color.background_gradient_start_color);
        int c3 = fr.c(context, R.color.background_gradient_end_color);
        this.c = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{c2, c3});
        ip.a((View) this, (Drawable) this.c);
    }

    public final void a(int i) {
        if (i == fr.c(getContext(), R.color.black)) {
            i = fr.c(getContext(), R.color.driving_npv_fallback_color);
        }
        int c2 = gd.c(i, 127);
        this.c.setColorFilter(c2, Mode.DST_OVER);
        View view = this.a;
        if (view != null) {
            view.setBackgroundColor(c2);
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setBackgroundColor(c2);
        }
    }
}
