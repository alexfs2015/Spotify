package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: krs reason: default package */
public final class krs {
    public static Drawable a(Context context) {
        float b = (float) vfj.b(24.0f, context.getResources());
        return new LayerDrawable(new Drawable[]{fr.a(context, (int) R.drawable.bg_anchor_icon_rounded), new vgu(new SpotifyIconDrawable(context, SpotifyIconV2.PLUS_2PX, b), b / ((float) vfj.b(64.0f, context.getResources())))});
    }
}
