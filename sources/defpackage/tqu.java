package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: tqu reason: default package */
public final class tqu {
    public static Drawable a(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOADED, context.getResources().getDimension(R.dimen.action_card_primary_action_height));
        spotifyIconDrawable.a(fr.b(context, (int) R.color.cat_accessory_green));
        return spotifyIconDrawable;
    }

    public static Drawable b(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOAD, context.getResources().getDimension(R.dimen.action_card_primary_action_height));
        spotifyIconDrawable.a(fr.b(context, (int) R.color.glue_button_text));
        return spotifyIconDrawable;
    }

    public static Drawable c(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK, context.getResources().getDimension(R.dimen.action_card_primary_action_height));
        spotifyIconDrawable.a(fr.b(context, (int) R.color.glue_button_text));
        return spotifyIconDrawable;
    }

    private static uva a(Context context, Drawable drawable) {
        uva uva = new uva(drawable, 0.5f);
        uva.a(0.0f);
        uva.a(fr.b(context, (int) R.color.bg_primary_action_white));
        return uva;
    }

    public static uva d(Context context) {
        ColorStateList b = fr.b(context, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, (float) uts.b(10.0f, context.getResources()));
        spotifyIconDrawable.a(b);
        return a(context, spotifyIconDrawable);
    }

    public static uva e(Context context) {
        ColorStateList b = fr.b(context, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, (float) uts.b(10.0f, context.getResources()));
        spotifyIconDrawable.a(b);
        return a(context, spotifyIconDrawable);
    }
}
