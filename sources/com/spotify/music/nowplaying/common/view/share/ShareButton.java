package com.spotify.music.nowplaying.common.view.share;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ShareButton extends AppCompatImageView implements taz {
    private a a;

    public ShareButton(Context context) {
        this(context, null);
    }

    public ShareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIcon.SHARE_ANDROID_24);
        spotifyIconDrawable.a(fr.b(getContext(), (int) R.color.btn_now_playing_white));
        setImageDrawable(spotifyIconDrawable);
        setBackgroundColor(0);
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.player_content_description_share));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ShareButton.this.a(view);
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
