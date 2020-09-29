package com.spotify.music.nowplaying.common.view.ban;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class BanButton extends AppCompatImageButton implements sxl {
    private a a;

    public BanButton(Context context) {
        this(context, null);
    }

    public BanButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BanButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(ury.r(getContext()));
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.player_content_description_ban));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                BanButton.this.a(view);
            }
        });
    }

    public final void a(boolean z) {
        setActivated(z);
        setContentDescription(getResources().getString(z ? R.string.player_content_description_unban : R.string.player_content_description_ban));
    }

    public final void e() {
        Context context = getContext();
        float dimensionPixelSize = (float) ((Context) fay.a(context)).getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.BLOCK, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIconV2.BLOCK, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context, SpotifyIconV2.BLOCK, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(context, SpotifyIconV2.BLOCK, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable5 = new SpotifyIconDrawable(context, SpotifyIconV2.BLOCK, dimensionPixelSize);
        spotifyIconDrawable.a(fr.c(context, R.color.cat_medium_red));
        spotifyIconDrawable2.a(fr.c(context, R.color.cat_light_red));
        spotifyIconDrawable3.a(fr.c(context, R.color.cat_white_70));
        spotifyIconDrawable4.a(fr.c(context, R.color.cat_white));
        spotifyIconDrawable5.a(fr.c(context, R.color.cat_white_40));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842910}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919, 16842910}, spotifyIconDrawable2);
        stateListDrawable.addState(new int[]{16843518}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919}, spotifyIconDrawable3);
        stateListDrawable.addState(new int[]{-16842910}, spotifyIconDrawable5);
        stateListDrawable.addState(new int[0], spotifyIconDrawable4);
        setImageDrawable(stateListDrawable);
    }

    public final void f() {
        setImageDrawable(ury.r(getContext()));
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
