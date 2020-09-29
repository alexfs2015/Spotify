package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: rgh reason: default package */
public final class rgh implements utu {
    private final Context a;
    private final Drawable b;
    /* access modifiers changed from: private */
    public final int c;

    public rgh(Context context, SpotifyIconV2 spotifyIconV2) {
        this(context, spotifyIconV2, -1);
    }

    private rgh(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        this.a = context;
        this.c = uts.b(48.0f, context.getResources());
        int b2 = uts.b(16.0f, context.getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) (this.c - (b2 << 1)));
        spotifyIconDrawable.a(-1);
        this.b = new InsetDrawable(spotifyIconDrawable, b2);
    }

    public final Drawable a() {
        return new LayerDrawable(new Drawable[]{new ColorDrawable(fr.c(this.a, R.color.cat_grayscale_25)), this.b});
    }

    public final Drawable createDrawable(Bitmap bitmap) {
        Bitmap bitmap2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            bitmap2 = Bitmap.createBitmap(bitmap, (width / 2) - (height / 2), 0, height, height);
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, (height / 2) - (width / 2), width, width);
        }
        AnonymousClass1 r0 = new BitmapDrawable(this.a.getResources(), bitmap2) {
            public final int getIntrinsicHeight() {
                return rgh.this.c;
            }

            public final int getIntrinsicWidth() {
                return rgh.this.c;
            }
        };
        r0.setColorFilter(fr.c(this.a, R.color.cat_black_40), Mode.SRC_ATOP);
        return new LayerDrawable(new Drawable[]{r0, this.b});
    }
}
