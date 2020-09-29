package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: vhl reason: default package */
public final class vhl extends Drawable {
    private final float a;
    private final SpotifyIconDrawable b;
    private final int c;
    private final Paint d = new Paint(1);

    public vhl(Context context, SpotifyIconV2 spotifyIconV2, float f, float f2, int i, int i2) {
        this.b = new SpotifyIconDrawable(context, spotifyIconV2, f);
        this.b.a(i2);
        this.a = f2;
        this.c = i;
    }

    public final void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        this.d.setColor(this.c);
        canvas.drawCircle(exactCenterX, exactCenterY, this.a / 2.0f, this.d);
        canvas.save();
        canvas.translate(exactCenterX - (((float) this.b.getIntrinsicWidth()) / 2.0f), exactCenterY - (((float) this.b.getIntrinsicHeight()) / 2.0f));
        this.b.draw(canvas);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return (int) this.a;
    }

    public final int getIntrinsicWidth() {
        return (int) this.a;
    }

    public final int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        SpotifyIconDrawable spotifyIconDrawable = this.b;
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), this.b.getIntrinsicHeight());
    }

    public final void setAlpha(int i) {
        this.d.setAlpha(i);
        this.b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
