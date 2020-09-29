package com.spotify.music.nowplaying.common.view.contextmenu;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ContextMenuButton extends AppCompatImageView implements szd {
    private a a;

    public ContextMenuButton(Context context) {
        this(context, null);
    }

    public ContextMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = (Context) fay.a(getContext());
        float b = (float) uts.b(24.0f, ((Context) fay.a(context2)).getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context2, SpotifyIconV2.MORE_ANDROID, b);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, SpotifyIconV2.MORE_ANDROID, b);
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context2, SpotifyIconV2.MORE_ANDROID, b);
        spotifyIconDrawable.a(fr.c(context2, R.color.cat_white));
        spotifyIconDrawable2.a(fr.c(context2, R.color.cat_white_70));
        spotifyIconDrawable3.a(fr.c(context2, R.color.cat_white_40));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, spotifyIconDrawable3);
        stateListDrawable.addState(new int[]{16842919}, spotifyIconDrawable2);
        stateListDrawable.addState(new int[0], spotifyIconDrawable);
        setImageDrawable(stateListDrawable);
        setBackgroundColor(0);
        setScaleType(ScaleType.CENTER_CROP);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ContextMenuButton.this.a(view);
            }
        });
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void a(boolean z) {
        setVisibility(z ? 0 : 4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
