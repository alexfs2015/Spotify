package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: two reason: default package */
public final class two {
    public static Drawable a(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK, context.getResources().getDimension(R.dimen.quickactions_episode_entity_row_primary_action_height));
        spotifyIconDrawable.a(fr.b(context, (int) R.color.glue_button_text));
        return spotifyIconDrawable;
    }

    public static uva a(Context context, Drawable drawable) {
        uva uva = new uva(drawable, 0.5f);
        uva.a(0.0f);
        uva.a(fr.b(context, (int) R.color.bg_primary_action_white));
        return uva;
    }
}
