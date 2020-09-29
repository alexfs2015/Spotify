package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

public class ItemEntityCardView extends CardView {
    public ViewGroup i;
    private View j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private ImageView n;

    public ItemEntityCardView(Context context) {
        super(context);
        c();
    }

    public ItemEntityCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public ItemEntityCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    private void c() {
        this.j = inflate(getContext(), R.layout.item_entity_view, this);
        View c = ip.c(this.j, (int) R.id.entity_root);
        a(getResources().getColor(R.color.gray_25));
        a(getResources().getDimension(R.dimen.feed_item_release_corner_radius));
        new uwe((ViewGroup) ip.c(c, (int) R.id.accessory)).a(joe.a(getContext()));
        this.i = (ViewGroup) ip.c(c, (int) R.id.entity_metadata_view);
        this.k = (ImageView) ip.c(c, (int) R.id.entity_image);
        this.l = (TextView) ip.c(c, (int) R.id.entity_title);
        this.m = (TextView) ip.c(c, (int) R.id.entity_subtitle);
        this.n = (ImageView) ip.c(c, (int) R.id.entity_play_button);
    }

    public final void a(String str, String str2) {
        this.l.setText(str);
        this.m.setText(str2);
    }

    public final void a(String str, Picasso picasso) {
        SpotifyIconDrawable a = msg.a(getContext(), 72, SpotifyIconV2.ALBUM);
        picasso.a(str).a((Drawable) a).b((Drawable) a).a(this.k);
    }

    public final void b() {
        this.n.setImageDrawable(msg.a(getContext()));
    }
}
