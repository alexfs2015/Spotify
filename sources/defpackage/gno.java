package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: gno reason: default package */
public final class gno {
    static SpotifyIconDrawable a(Context context, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, context.getResources().getDimension(R.dimen.text_view_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.cat_white));
        return spotifyIconDrawable;
    }

    public static void a(TextView textView, SpotifyIconV2 spotifyIconV2) {
        jm.b(textView, a(textView.getContext(), spotifyIconV2), null, null, null);
    }
}
