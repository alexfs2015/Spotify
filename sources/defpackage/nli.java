package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* renamed from: nli reason: default package */
public final class nli extends Drawable {
    private final String a;
    private final Paint b;
    private final Paint c = new Paint();
    private final Rect d = new Rect();

    public final int getOpacity() {
        return -3;
    }

    public nli(Context context, String str, int i) {
        this.a = (String) fay.a(str);
        this.b = new Paint();
        this.b.setColor(-1);
        this.b.setTypeface(utw.c(context, R.attr.glueFontSemibold));
        this.b.setTextSize(40.0f);
        this.b.setAntiAlias(true);
        this.b.setTextAlign(Align.CENTER);
        this.b.getTextBounds(str, 0, str.length(), this.d);
        this.c.setColor(i);
    }

    public final void draw(Canvas canvas) {
        canvas.drawCircle(((float) getBounds().width()) / 2.0f, ((float) getBounds().height()) / 2.0f, ((float) getBounds().height()) / 2.0f, this.c);
        canvas.drawText(this.a, (float) getBounds().centerX(), ((float) getBounds().bottom) - (((float) (getBounds().height() - this.d.height())) / 2.0f), this.b);
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
