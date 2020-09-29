package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.creatorartist.model.Image;
import com.spotify.mobile.android.spotlets.creatorartist.view.ArtistBiographyImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: ity reason: default package */
public final class ity extends ith<Image> {
    private final ArtistBiographyImageView a = ((ArtistBiographyImageView) this.o.findViewById(R.id.artist_bioimage));
    private final Picasso b;

    public ity(ViewGroup viewGroup, Context context, Picasso picasso) {
        super(LayoutInflater.from(context).inflate(R.layout.artist_carousel_image, viewGroup, false));
        this.b = picasso;
    }

    public final void a(Image image) {
        this.a.a(image, this.b);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a((Image) obj);
    }
}
