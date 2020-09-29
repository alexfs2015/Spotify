package com.spotify.music.lyrics.fullscreen.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

public class LyricsFullscreenHeaderView extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final ImageButton d;
    public final View e;

    public LyricsFullscreenHeaderView(Context context) {
        this(context, null);
    }

    public LyricsFullscreenHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LyricsFullscreenHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = LayoutInflater.from(context).inflate(R.layout.lyrics_full_screen_header_view, this);
        this.a = (ImageView) findViewById(R.id.coverArt);
        this.b = (TextView) findViewById(R.id.artistName);
        this.c = (TextView) findViewById(R.id.title);
        this.d = (ImageButton) findViewById(R.id.close);
        ImageButton imageButton = this.d;
        uvv uvv = new uvv(getContext(), SpotifyIconV2.X, (float) uts.b(16.0f, getContext().getResources()), (float) uts.b(32.0f, getContext().getResources()), fr.c(getContext(), R.color.black_40), fr.c(getContext(), R.color.white));
        ip.a((View) imageButton, (Drawable) uvv);
    }
}
