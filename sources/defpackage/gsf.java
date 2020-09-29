package defpackage;

import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: gsf reason: default package */
public final class gsf implements gsj {
    private final ImageView a;
    private final gsl b;

    public gsf(ImageView imageView, gsl gsl) {
        this.a = imageView;
        this.b = gsl;
    }

    public final void a() {
        ImageView imageView = this.a;
        gsl gsl = this.b;
        imageView.setImageDrawable(gsl.a(gsl.a, SpotifyIconV2.SPOTIFY_CONNECT, gsl.b, gsl.c));
        this.a.setVisibility(0);
    }

    public final void b() {
        this.a.setVisibility(8);
    }

    public final void a(int i, int i2) {
        this.a.getLayoutParams().width = i;
        this.a.getLayoutParams().height = i2;
        this.a.requestLayout();
    }
}
