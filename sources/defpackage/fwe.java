package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* renamed from: fwe reason: default package */
public final class fwe extends Drawable {
    private final Paint a = new Paint(1);
    private final Shader b;

    public final int getOpacity() {
        return -3;
    }

    public fwe(Context context) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, uuu.b(context, R.attr.pasteColorBackground), TileMode.CLAMP);
        this.b = linearGradient;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        this.a.setShader(this.b);
        canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, this.a);
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
