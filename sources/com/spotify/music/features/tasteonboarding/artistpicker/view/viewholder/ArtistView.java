package com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class ArtistView extends ConstraintLayout {
    public ImageView b;
    public ImageView c;
    public TextView d;

    public ArtistView(Context context) {
        super(context);
        b();
    }

    public ArtistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ArtistView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.view_artist, this);
        setId(R.id.artist_view);
        this.b = (ImageView) findViewById(R.id.artist_image);
        this.c = (ImageView) findViewById(R.id.artist_image_icon);
        this.d = (TextView) findViewById(R.id.artist_name);
        c();
    }

    private void c() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.std_8dp);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
}
