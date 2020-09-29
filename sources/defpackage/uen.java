package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: uen reason: default package */
public final class uen implements wgx {
    public uel a;
    private final ImageView b;
    private PodcastTrailerOverlayDrawable c;

    public uen(ImageView imageView, uel uel) {
        this.b = imageView;
        this.a = uel;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fbp.a(!bitmap.isRecycled());
        PodcastTrailerOverlayDrawable podcastTrailerOverlayDrawable = this.c;
        if (podcastTrailerOverlayDrawable == null) {
            uel uel = this.a;
            PodcastTrailerOverlayDrawable podcastTrailerOverlayDrawable2 = new PodcastTrailerOverlayDrawable(bitmap, uel.b, uel.c, uel.d, uel.f, uel.g, uel.e, uel, uel.a);
            this.c = podcastTrailerOverlayDrawable2;
        } else if (podcastTrailerOverlayDrawable.a != bitmap) {
            podcastTrailerOverlayDrawable.a = bitmap;
            podcastTrailerOverlayDrawable.a();
            podcastTrailerOverlayDrawable.invalidateSelf();
        }
        this.b.setImageDrawable(this.c);
        fbp.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final void b(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }
}
