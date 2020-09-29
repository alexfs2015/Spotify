package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

public class ReleaseItemView extends ConstraintLayout {
    public Picasso b;
    public ArtistHeaderView c;
    public ItemEntityCardView d;
    private View e;

    public ReleaseItemView(Context context, Picasso picasso) {
        super(context);
        this.b = picasso;
        b();
    }

    public ReleaseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ReleaseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        this.e = inflate(getContext(), R.layout.static_release_feed_item, this);
        this.e.setLayoutParams(new LayoutParams(-1, -2));
        this.c = (ArtistHeaderView) this.e.findViewById(R.id.feed_artist_header_view);
        this.d = (ItemEntityCardView) ip.c(this.e, (int) R.id.feed_entity_card_view);
    }
}
