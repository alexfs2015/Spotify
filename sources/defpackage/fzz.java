package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: fzz reason: default package */
public final class fzz {
    public static Drawable a(Context context, SpotifyIconV2 spotifyIconV2) {
        return a(context, spotifyIconV2, fr.c(context, R.color.cat_grayscale_55));
    }

    public static Drawable a(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(R.dimen.context_menu_icon_size));
        spotifyIconDrawable.a(i);
        return spotifyIconDrawable;
    }
}
