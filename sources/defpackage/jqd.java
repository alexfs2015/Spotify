package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Locale;

/* renamed from: jqd reason: default package */
public final class jqd {
    public static Button a(Context context, ViewGroup viewGroup) {
        return a(context, viewGroup, (SpotifyIconV2) null, (int) R.string.header_shuffle_play);
    }

    public static Button a(Context context, ViewGroup viewGroup, SpotifyIconV2 spotifyIconV2, int i) {
        return a(context, viewGroup, spotifyIconV2, context.getString(i));
    }

    private static Button a(Context context, ViewGroup viewGroup, SpotifyIconV2 spotifyIconV2, String str) {
        Button c = fzz.c(context);
        LayoutParams a = fzy.a(context, viewGroup);
        if (a != null) {
            c.setLayoutParams(a);
        }
        int a2 = uts.a(48.0f, context.getResources());
        c.setPadding(a2, 0, a2, 0);
        c.setCompoundDrawablePadding(uts.a(8.0f, context.getResources()));
        a(context, c, spotifyIconV2, str);
        return c;
    }

    public static void a(Context context, Button button, SpotifyIconV2 spotifyIconV2, int i) {
        a(context, button, spotifyIconV2, context.getString(i));
    }

    public static void a(Context context, Button button, SpotifyIconV2 spotifyIconV2, String str) {
        button.setText(str.toUpperCase(Locale.getDefault()));
        if (spotifyIconV2 != null) {
            float b = (float) uts.b(18.0f, context.getResources());
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, b);
            spotifyIconDrawable.a(button.getTextColors());
            spotifyIconDrawable.a(b);
            button.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, null, null, null);
            return;
        }
        button.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }
}
