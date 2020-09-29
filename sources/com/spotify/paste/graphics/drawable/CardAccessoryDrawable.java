package com.spotify.paste.graphics.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class CardAccessoryDrawable extends Drawable {
    public final int a;
    private final Paint b = new Paint(1);
    private final float c;
    private final float d;
    private final int e;
    private final float f;
    private final SpotifyIconDrawable g;
    private final int h;
    private final SpotifyIconV2 i;
    private final Size j;
    private final float k;
    private final float l;

    public enum Size {
        TINY(7, 10, 7),
        SMALL(10, 10, 7),
        MEDIUM(12, 12, 7);
        
        /* access modifiers changed from: private */
        public final int mCardPaddingDp;
        /* access modifiers changed from: private */
        public final int mIconSizeDp;
        /* access modifiers changed from: private */
        public final int mInnerCircleRadiusDp;

        private Size(int i, int i2, int i3) {
            this.mInnerCircleRadiusDp = i;
            this.mIconSizeDp = i2;
            this.mCardPaddingDp = 7;
        }
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static CardAccessoryDrawable a(Context context, int i2, Size size, SpotifyIconV2 spotifyIconV2) {
        CardAccessoryDrawable cardAccessoryDrawable = new CardAccessoryDrawable(context, i2, spotifyIconV2, size, 1.0f, spotifyIconV2 == SpotifyIconV2.STAR_ALT ? 0.95f : 1.0f);
        return cardAccessoryDrawable;
    }

    private CardAccessoryDrawable(Context context, int i2, SpotifyIconV2 spotifyIconV2, Size size, float f2, float f3) {
        this.d = (float) uts.b((float) (size.mInnerCircleRadiusDp + 1), context.getResources());
        this.c = (float) uts.b((float) size.mInnerCircleRadiusDp, context.getResources());
        this.e = i2;
        float b2 = (float) uts.b((float) size.mIconSizeDp, context.getResources());
        if (Math.round(b2) % 2 != 0) {
            b2 += 1.0f;
        }
        this.f = b2;
        this.h = (int) (this.d * 2.0f);
        this.i = spotifyIconV2;
        this.j = size;
        int i3 = this.h;
        setBounds(0, 0, i3, i3);
        this.g = new SpotifyIconDrawable(context, spotifyIconV2, this.f);
        this.g.a(-1);
        SpotifyIconDrawable spotifyIconDrawable = this.g;
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), this.g.getIntrinsicHeight());
        this.k = 1.0f;
        this.l = f3;
        this.a = uts.b((float) size.mCardPaddingDp, context.getResources());
    }

    public final int getIntrinsicWidth() {
        return this.h;
    }

    public final int getIntrinsicHeight() {
        return this.h;
    }

    public final void draw(Canvas canvas) {
        this.b.setColor(855638016);
        float f2 = this.d;
        canvas.drawCircle(f2, f2, f2, this.b);
        this.b.setColor(this.e);
        float f3 = this.d;
        canvas.drawCircle(f3, f3, this.c, this.b);
        canvas.save();
        float f4 = (((float) this.h) - this.f) / 2.0f;
        canvas.translate(this.k * f4, f4 * this.l);
        this.g.draw(canvas);
        canvas.restore();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardAccessoryDrawable)) {
            return false;
        }
        CardAccessoryDrawable cardAccessoryDrawable = (CardAccessoryDrawable) obj;
        return this.e == cardAccessoryDrawable.e && this.i == cardAccessoryDrawable.i && this.j == cardAccessoryDrawable.j;
    }

    public final int hashCode() {
        return (((this.e * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }
}
