package com.spotify.android.glue.components.cards.effects;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.spotify.music.R;

public enum GlueRippleCoverArtShape {
    SQUARE(R.drawable.glue_radio_square_ripple_overlay) {
        /* access modifiers changed from: 0000 */
        public final void a(Canvas canvas, float f, Paint paint) {
            float f2 = -f;
            canvas.drawRect(f2, f2, f, f, paint);
        }
    },
    CIRCLE(R.drawable.glue_radio_circle_ripple_overlay) {
        /* access modifiers changed from: 0000 */
        public final void a(Canvas canvas, float f, Paint paint) {
            canvas.drawCircle(0.0f, 0.0f, f, paint);
        }
    };
    
    public final int mDrawableResId;

    public abstract void a(Canvas canvas, float f, Paint paint);

    private GlueRippleCoverArtShape(int i) {
        this.mDrawableResId = i;
    }
}
