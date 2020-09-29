package com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class OtherTopArtistView extends ConstraintLayout {
    public ImageView b;
    public TextView c;
    public TextView d;

    public OtherTopArtistView(Context context) {
        super(context);
        b();
    }

    public OtherTopArtistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public OtherTopArtistView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.story_other_top_artist_layout, this);
        this.b = (ImageView) ip.d((View) this, (int) R.id.other_top_artist_image);
        this.c = (TextView) ip.d((View) this, (int) R.id.other_top_artist_rank);
        this.d = (TextView) ip.d((View) this, (int) R.id.other_top_artist_name);
    }
}
