package com.spotify.music.features.languagepicker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class RoundedRelativeLayout extends RelativeLayout {
    public final float[] a = new float[8];
    private final RectF b = new RectF();
    private final Path c = new Path();

    public RoundedRelativeLayout(Context context) {
        super(context, null);
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.c.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.c);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.reset();
        this.b.set(0.0f, 0.0f, (float) (i3 - i), (float) (i4 - i2));
        this.c.addRoundRect(this.b, this.a, Direction.CW);
    }
}
