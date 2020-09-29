package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import com.spotify.music.R;

/* renamed from: fvq reason: default package */
public final class fvq {
    public final Paint a = new Paint(1);
    public final Paint b = new Paint();
    public int c = 255;
    private final int d;
    private LinearGradient e;
    private int f;
    private int g;

    public fvq(Context context) {
        int b2 = vgl.b(context, R.attr.pasteColorBackground);
        this.b.setColor(b2);
        this.d = b2;
    }

    public final void a(int i, int i2) {
        this.g = i;
        if (this.f != i2) {
            this.f = i2;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.f, 0, this.d, TileMode.CLAMP);
            this.e = linearGradient;
            this.a.setShader(this.e);
        }
    }

    public final void a(Canvas canvas) {
        if (this.e != null) {
            int save = canvas.save();
            canvas.drawRect(0.0f, 0.0f, (float) this.g, (float) this.f, this.b);
            canvas.restoreToCount(save);
        }
    }

    public final void b(Canvas canvas) {
        if (this.e != null) {
            int save = canvas.save();
            canvas.translate(0.0f, 0.0f);
            canvas.drawRect(0.0f, 0.0f, (float) this.g, (float) this.f, this.a);
            canvas.restoreToCount(save);
        }
    }
}
