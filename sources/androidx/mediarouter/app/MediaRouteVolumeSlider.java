package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.spotify.music.R;

public class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private final float a;
    private boolean b;
    private Drawable c;
    private int d;
    private int e;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = mw.i(context);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.a * 255.0f);
        this.c.setColorFilter(this.d, Mode.SRC_IN);
        this.c.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.e, Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.d, Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public void setThumb(Drawable drawable) {
        this.c = drawable;
        super.setThumb(this.b ? null : this.c);
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            super.setThumb(this.b ? null : this.c);
        }
    }

    public final void a(int i, int i2) {
        String str = "MediaRouteVolumeSlider";
        if (this.d != i) {
            if (Color.alpha(i) != 255) {
                StringBuilder sb = new StringBuilder("Volume slider progress and thumb color cannot be translucent: #");
                sb.append(Integer.toHexString(i));
                Log.e(str, sb.toString());
            }
            this.d = i;
        }
        if (this.e != i2) {
            if (Color.alpha(i2) != 255) {
                StringBuilder sb2 = new StringBuilder("Volume slider background color cannot be translucent: #");
                sb2.append(Integer.toHexString(i2));
                Log.e(str, sb2.toString());
            }
            this.e = i2;
        }
    }
}
