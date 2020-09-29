package defpackage;

import android.os.Build.VERSION;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: qgb reason: default package */
public final class qgb {
    public static void a(TextView textView) {
        if (!c(textView)) {
            if (VERSION.SDK_INT >= 21) {
                rp a = rp.a(textView.getContext(), R.drawable.avd_show_checkmark);
                jm.b(textView, null, null, a, null);
                if (a != null) {
                    a.start();
                }
                return;
            }
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(textView.getContext(), SpotifyIconV2.CHECK, 24.0f);
            spotifyIconDrawable.a(fr.c(textView.getContext(), R.color.black));
            jm.b(textView, null, null, spotifyIconDrawable, null);
        }
    }

    private static boolean c(TextView textView) {
        return jm.b(textView)[2] != null;
    }

    public static void b(TextView textView) {
        textView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }
}
