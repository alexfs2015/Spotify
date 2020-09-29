package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: fqx reason: default package */
public final class fqx {
    public static Drawable a(Context context) {
        return a(context, (float) uts.b(12.0f, context.getResources()));
    }

    public static Drawable a(Context context, float f) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SHUFFLE, f);
        spotifyIconDrawable.a(-16777216);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fr.a(context, (int) R.drawable.bg_glue_shuffle_badge), spotifyIconDrawable});
        int b = uts.b(2.0f, context.getResources());
        layerDrawable.setLayerInset(1, b, 0, b, 0);
        return layerDrawable;
    }

    public static Drawable b(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOADED, (float) uts.b(12.0f, context.getResources()));
        spotifyIconDrawable.a(fr.c(context, R.color.cat_accessory_green));
        return spotifyIconDrawable;
    }
}
