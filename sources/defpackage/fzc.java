package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Locale;

/* renamed from: fzc reason: default package */
public final class fzc {
    public static Button a(Context context, String str, SpotifyIconV2 spotifyIconV2, OnClickListener onClickListener) {
        Button d = fzz.d(context);
        a(d, str, spotifyIconV2);
        d.setOnClickListener(onClickListener);
        return d;
    }

    public static void a(Button button, String str, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconDrawable spotifyIconDrawable;
        Context context = button.getContext();
        Resources resources = context.getResources();
        if (spotifyIconV2 != null) {
            spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) resources.getDimensionPixelSize(R.dimen.actionbar_play_button_icon_size));
            spotifyIconDrawable.a(button.getTextColors());
        } else {
            spotifyIconDrawable = null;
        }
        button.setPadding(resources.getDimensionPixelSize(R.dimen.actionbar_play_button_left_padding), 0, resources.getDimensionPixelSize(R.dimen.actionbar_play_button_right_padding), 0);
        button.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, null, null, null);
        button.setCompoundDrawablePadding(resources.getDimensionPixelOffset(R.dimen.actionbar_play_button_icon_padding));
        button.setText(str.toUpperCase(Locale.getDefault()));
    }
}
