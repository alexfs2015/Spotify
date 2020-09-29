package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: koj reason: default package */
public final class koj {
    public static Drawable a(Context context) {
        float b = (float) uts.b(24.0f, context.getResources());
        return new LayerDrawable(new Drawable[]{fr.a(context, (int) R.drawable.bg_anchor_icon_rounded), new uvd(new SpotifyIconDrawable(context, SpotifyIconV2.PLUS_2PX, b), b / ((float) uts.b(64.0f, context.getResources())))});
    }
}
