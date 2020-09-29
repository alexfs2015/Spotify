package com.spotify.mobile.android.spotlets.creatorartist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.creatorartist.model.Image;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

public class ArtistBiographyImageView extends FrameLayout {
    private ImageView a;

    public ArtistBiographyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ArtistBiographyImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.biography_image_view, this).findViewById(R.id.image);
    }

    public final void a(Image image, Picasso picasso) {
        if (image.uri.isEmpty()) {
            this.a.setImageResource(R.drawable.placeholder_artist);
        } else {
            picasso.a(image.uri).a((int) R.drawable.placeholder_artist).b((int) R.drawable.placeholder_artist).a(this.a);
        }
    }
}
