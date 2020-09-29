package com.spotify.music.features.premiumdestination.legacy.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class RoundedConstraintLayout extends ConstraintLayout {
    public final float[] b = new float[8];
    private final RectF c = new RectF();
    private final Path d = new Path();

    public RoundedConstraintLayout(Context context) {
        super(context, null);
    }

    public RoundedConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoundedConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        if (!this.d.isEmpty()) {
            canvas.clipPath(this.d);
        }
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d.reset();
        this.c.set(0.0f, 0.0f, (float) (i3 - i), (float) (i4 - i2));
        this.d.addRoundRect(this.c, this.b, Direction.CW);
    }
}
