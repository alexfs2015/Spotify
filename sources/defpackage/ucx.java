package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: ucx reason: default package */
public final class ucx {
    public static Drawable a(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOADED, context.getResources().getDimension(R.dimen.action_card_primary_action_height));
        spotifyIconDrawable.a(fr.b(context, (int) R.color.cat_accessory_green));
        return spotifyIconDrawable;
    }

    private static vgr a(Context context, Drawable drawable) {
        vgr vgr = new vgr(drawable, 0.5f);
        vgr.a(0.0f);
        vgr.a(fr.b(context, (int) R.color.bg_primary_action_white));
        return vgr;
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

    public static vgr d(Context context) {
        ColorStateList b = fr.b(context, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, (float) vfj.b(10.0f, context.getResources()));
        spotifyIconDrawable.a(b);
        return a(context, spotifyIconDrawable);
    }

    public static vgr e(Context context) {
        ColorStateList b = fr.b(context, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, (float) vfj.b(10.0f, context.getResources()));
        spotifyIconDrawable.a(b);
        return a(context, spotifyIconDrawable);
    }
}
