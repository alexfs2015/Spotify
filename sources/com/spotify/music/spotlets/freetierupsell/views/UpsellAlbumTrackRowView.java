package com.spotify.music.spotlets.freetierupsell.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;

public class UpsellAlbumTrackRowView extends RelativeLayout {
    private TextView a;
    private ImageView b;

    public UpsellAlbumTrackRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public UpsellAlbumTrackRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.upsell_album_track_row_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        setGravity(15);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.upsell_album_track_row_min_height));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.std_8dp);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.a = (TextView) findViewById(16908308);
        this.b = (ImageView) findViewById(16908294);
        uva a2 = ury.a(getContext(), 18, 0, 0.6f);
        a2.a(fr.c(getContext(), R.color.artist_upsell_play_button_background));
        this.b.setImageDrawable(a2);
        uui.c(this.a).b(this.b).a();
    }
}
