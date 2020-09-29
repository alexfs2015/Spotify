package com.spotify.android.glue.components.common;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ImageSpan;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class SpotifyIconSpan extends ImageSpan {
    private final Alignment a;
    private final boolean b;

    public enum Alignment {
        BOTTOM(0) {
            /* access modifiers changed from: protected */
            public final void a(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                SpotifyIconSpan.a(spotifyIconSpan, canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            }
        },
        BASELINE(1) {
            /* access modifiers changed from: protected */
            public final void a(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                SpotifyIconSpan.a(spotifyIconSpan, canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            }
        },
        CAPITAL_LETTER_MIDDLE(0) {
            /* access modifiers changed from: protected */
            public final void a(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                SpotifyIconSpan.a(spotifyIconSpan, 'E', canvas, charSequence, i, i2, f, i3, i4, paint);
            }
        },
        SMALL_LETTER_MIDDLE(0) {
            /* access modifiers changed from: protected */
            public final void a(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                SpotifyIconSpan.a(spotifyIconSpan, 'e', canvas, charSequence, i, i2, f, i3, i4, paint);
            }
        };
        
        /* access modifiers changed from: private */
        public final int mDefaultAlignment;

        /* access modifiers changed from: protected */
        public abstract void a(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint);

        private Alignment(int i) {
            this.mDefaultAlignment = i;
        }
    }

    public SpotifyIconSpan(SpotifyIconDrawable spotifyIconDrawable, Alignment alignment) {
        this(spotifyIconDrawable, alignment, true);
    }

    private SpotifyIconSpan(SpotifyIconDrawable spotifyIconDrawable, Alignment alignment, boolean z) {
        super(spotifyIconDrawable, alignment.mDefaultAlignment);
        this.a = alignment;
        this.b = true;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        this.a.a(this, canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    static /* synthetic */ void a(SpotifyIconSpan spotifyIconSpan, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (spotifyIconSpan.b) {
            ((SpotifyIconDrawable) spotifyIconSpan.getDrawable()).a(paint.getColor());
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    static /* synthetic */ void a(SpotifyIconSpan spotifyIconSpan, char c, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, Paint paint) {
        SpotifyIconDrawable spotifyIconDrawable = (SpotifyIconDrawable) spotifyIconSpan.getDrawable();
        if (spotifyIconSpan.b) {
            spotifyIconDrawable.a(paint.getColor());
        }
        Rect rect = new Rect();
        Paint paint2 = paint;
        paint2.getTextBounds(new char[]{c}, 0, 1, rect);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, (i4 - (rect.height() / 2)) + (spotifyIconDrawable.getIntrinsicHeight() / 2), paint2);
    }
}
