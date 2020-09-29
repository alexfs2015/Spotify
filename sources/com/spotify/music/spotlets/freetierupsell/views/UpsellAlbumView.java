package com.spotify.music.spotlets.freetierupsell.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.paste.widgets.internal.PasteRelativeLayout;

public class UpsellAlbumView extends PasteRelativeLayout {
    private View a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private LinearLayout e;

    public UpsellAlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public UpsellAlbumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.upsell_album_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        setGravity(14);
        this.a = findViewById(R.id.gradient);
        this.b = (ImageView) findViewById(R.id.album_image);
        this.c = (TextView) findViewById(R.id.album_title);
        this.d = (TextView) findViewById(R.id.button);
        this.e = (LinearLayout) findViewById(R.id.tracks_container);
    }
}
