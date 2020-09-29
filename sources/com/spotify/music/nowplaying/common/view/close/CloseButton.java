package com.spotify.music.nowplaying.common.view.close;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class CloseButton extends AppCompatImageView implements syn {
    private a a;

    public CloseButton(Context context) {
        this(context, null);
    }

    public CloseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIcon.CHEVRON_DOWN_24);
        spotifyIconDrawable.a(fr.b(getContext(), (int) R.color.btn_now_playing_white));
        setImageDrawable(spotifyIconDrawable);
        setBackgroundColor(0);
        setScaleType(ScaleType.CENTER_CROP);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CloseButton.this.a(view);
            }
        });
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
