package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: msg reason: default package */
public final class msg {
    public static uva a(Context context) {
        ColorStateList b = fr.b(context, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, (float) uts.b(10.0f, context.getResources()));
        spotifyIconDrawable.a(b);
        uva uva = new uva(spotifyIconDrawable, 0.5f);
        uva.a(0.0f);
        uva.a(fr.b(context, (int) R.color.bg_primary_action_white));
        return uva;
    }

    public static SpotifyIconDrawable a(Context context, int i, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) i);
        spotifyIconDrawable.a(context.getResources().getColor(R.color.gray_30));
        return spotifyIconDrawable;
    }
}
