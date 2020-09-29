package com.spotify.music.features.playlistentity.empty;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.music.R;

public final class EmptyPlaylistView extends RelativeLayout {
    public ImageView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public Button e;

    public EmptyPlaylistView(Context context) {
        super(context);
        a();
    }

    public EmptyPlaylistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private void a() {
        inflate(getContext(), R.layout.playlist_empty_view, this);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.subtitle);
        this.e = (Button) findViewById(R.id.button);
        this.d = (TextView) findViewById(R.id.description);
        this.a = (ImageView) findViewById(R.id.image);
        this.a.setImageDrawable(fzg.e(getContext()));
        setVisibility(8);
    }
}
