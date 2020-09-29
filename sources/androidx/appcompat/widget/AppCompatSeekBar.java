package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.spotify.music.R;

public class AppCompatSeekBar extends SeekBar {
    private final bu a;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new bu(this);
        this.a.a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        bu buVar = this.a;
        Drawable drawable = buVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(buVar.b.getDrawableState())) {
            buVar.b.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        bu buVar = this.a;
        if (buVar.c != null) {
            buVar.c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bu buVar = this.a;
        if (buVar.c != null) {
            int max = buVar.b.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = buVar.c.getIntrinsicWidth();
                int intrinsicHeight = buVar.c.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                buVar.c.setBounds(-i2, -i, i2, i);
                float width = ((float) ((buVar.b.getWidth() - buVar.b.getPaddingLeft()) - buVar.b.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) buVar.b.getPaddingLeft(), (float) (buVar.b.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    buVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
