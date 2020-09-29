package defpackage;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.spotify.music.R;

/* renamed from: rjm reason: default package */
public final class rjm {
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Shader c;
    public RectF d;

    public rjm(Context context) {
        int c2 = fr.c(context, R.color.home_promotion_background_gradient_start);
        int c3 = fr.c(context, R.color.home_promotion_background_gradient_end);
        int c4 = fr.c(context, R.color.home_promotion_background_overlay);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{c2, c3}, new float[]{0.3f, 1.0f}, TileMode.CLAMP);
        this.c = linearGradient;
        this.a.setShader(this.c);
        this.b.setColorFilter(new PorterDuffColorFilter(c4, Mode.SRC_IN));
    }

    public final void a(Rect rect) {
        this.d = new RectF(rect);
    }
}
