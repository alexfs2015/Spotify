package defpackage;

import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: guc reason: default package */
public final class guc implements guk {
    private final ImageView a;
    private final gul b;
    private boolean c = false;

    public guc(ImageView imageView, gul gul) {
        this.a = imageView;
        this.b = gul;
    }

    public final void a() {
        this.a.setVisibility(0);
        ImageView imageView = this.a;
        gul gul = this.b;
        imageView.setImageDrawable(gul.a(gul.a, SpotifyIconV2.CHROMECAST_CONNECTED, gul.b, gul.c));
        this.c = false;
    }

    public final void a(int i, int i2) {
        this.a.getLayoutParams().width = i;
        this.a.getLayoutParams().height = i2;
        this.a.requestLayout();
    }

    public final void b() {
        this.a.setVisibility(8);
    }

    public final void c() {
        this.a.setVisibility(0);
        if (!this.c) {
            ImageView imageView = this.a;
            imageView.setImageDrawable(this.b.a(imageView));
            this.c = true;
        }
    }
}
