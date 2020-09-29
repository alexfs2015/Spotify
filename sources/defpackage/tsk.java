package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: tsk reason: default package */
public final class tsk implements vsr {
    public tsi a;
    private final ImageView b;
    private PodcastTrailerOverlayDrawable c;

    public tsk(ImageView imageView, tsi tsi) {
        this.b = imageView;
        this.a = tsi;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fay.a(!bitmap.isRecycled());
        PodcastTrailerOverlayDrawable podcastTrailerOverlayDrawable = this.c;
        if (podcastTrailerOverlayDrawable == null) {
            tsi tsi = this.a;
            PodcastTrailerOverlayDrawable podcastTrailerOverlayDrawable2 = new PodcastTrailerOverlayDrawable(bitmap, tsi.b, tsi.c, tsi.d, tsi.f, tsi.g, tsi.e, tsi, tsi.a);
            this.c = podcastTrailerOverlayDrawable2;
        } else if (podcastTrailerOverlayDrawable.a != bitmap) {
            podcastTrailerOverlayDrawable.a = bitmap;
            podcastTrailerOverlayDrawable.a();
            podcastTrailerOverlayDrawable.invalidateSelf();
        }
        this.b.setImageDrawable(this.c);
        fay.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final void b(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }
}
