package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

public class ArtistHeaderView extends ConstraintLayout {
    private View b;
    private TextView c;
    private ImageView d;
    private TextView e;

    public ArtistHeaderView(Context context) {
        super(context);
        b();
    }

    public ArtistHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ArtistHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        this.b = inflate(getContext(), R.layout.artist_header_view, this);
        this.c = (TextView) ip.c(this.b, (int) R.id.feed_item_artist_name);
        this.d = (ImageView) ip.c(this.b, (int) R.id.feed_item_artist_avatar);
        this.e = (TextView) ip.c(this.b, (int) R.id.feed_item_release_date);
    }

    public final void a(String str) {
        this.c.setText(str);
    }

    public final void a(String str, Picasso picasso) {
        SpotifyIconDrawable a = msg.a(getContext(), 24, SpotifyIconV2.ARTIST);
        picasso.a(str).a((vst) new uvi()).a((Drawable) a).b((Drawable) a).a(this.d);
    }

    public final void b(String str) {
        this.e.setText(str);
    }
}
