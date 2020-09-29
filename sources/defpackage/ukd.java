package defpackage;

import android.widget.ImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: ukd reason: default package */
public final class ukd implements ukc {
    private final Picasso a;

    public ukd(Picasso picasso) {
        this.a = picasso;
    }

    public final void a(hcp hcp, ImageView imageView) {
        fbp.a(hcp);
        fbp.a(imageView);
        this.a.a(hcp.uri()).a((int) R.drawable.cat_placeholder_podcast).a(vhj.a(imageView, vgt.a((float) imageView.getResources().getDimensionPixelSize(R.dimen.podcast_image_corner_radius))));
    }
}
