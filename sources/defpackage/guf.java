package defpackage;

import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: guf reason: default package */
public final class guf implements guj {
    private final ImageView a;
    private final gul b;

    public guf(ImageView imageView, gul gul) {
        this.a = imageView;
        this.b = gul;
    }

    public final void a() {
        ImageView imageView = this.a;
        gul gul = this.b;
        imageView.setImageDrawable(gul.a(gul.a, SpotifyIconV2.SPOTIFY_CONNECT, gul.b, gul.c));
        this.a.setVisibility(0);
    }

    public final void a(int i, int i2) {
        this.a.getLayoutParams().width = i;
        this.a.getLayoutParams().height = i2;
        this.a.requestLayout();
    }

    public final void b() {
        this.a.setVisibility(8);
    }
}
