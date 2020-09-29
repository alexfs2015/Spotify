package defpackage;

import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: gsc reason: default package */
public final class gsc implements gsk {
    private final ImageView a;
    private final gsl b;
    private boolean c = false;

    public gsc(ImageView imageView, gsl gsl) {
        this.a = imageView;
        this.b = gsl;
    }

    public final void a() {
        this.a.setVisibility(0);
        ImageView imageView = this.a;
        gsl gsl = this.b;
        imageView.setImageDrawable(gsl.a(gsl.a, SpotifyIconV2.CHROMECAST_CONNECTED, gsl.b, gsl.c));
        this.c = false;
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

    public final void a(int i, int i2) {
        this.a.getLayoutParams().width = i;
        this.a.getLayoutParams().height = i2;
        this.a.requestLayout();
    }
}
