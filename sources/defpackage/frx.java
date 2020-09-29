package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: frx reason: default package */
final class frx extends frt implements frw {
    private final ImageButton a;

    public frx(View view) {
        super(view);
        this.a = (ImageButton) view.findViewById(R.id.icon);
    }

    public final void a(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void a(SpotifyIcon spotifyIcon) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getView().getContext(), spotifyIcon);
        float b = (float) uts.b(24.0f, getView().getResources());
        spotifyIconDrawable.a(b);
        spotifyIconDrawable.a(uuu.d(getView().getContext(), R.attr.pasteColorAccessory));
        this.a.setBaseline((int) ((Math.abs(a().getPaint().getFontMetrics().ascent) + b) / 2.0f));
        this.a.setImageDrawable(spotifyIconDrawable);
    }

    public final View c() {
        return this.a;
    }
}
