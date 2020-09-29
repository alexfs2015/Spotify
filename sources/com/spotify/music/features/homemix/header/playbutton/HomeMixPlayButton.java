package com.spotify.music.features.homemix.header.playbutton;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

public class HomeMixPlayButton extends StateListAnimatorImageButton {
    public Drawable a;
    public Drawable b;
    public boolean c;

    public HomeMixPlayButton(Context context) {
        super(context);
        f();
    }

    public HomeMixPlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }

    private void f() {
        setId(R.id.button_play);
        Context context = getContext();
        this.a = a(context, SpotifyIconV2.PLAY, b(R.color.cat_accessory_green_default));
        this.b = a(context, SpotifyIconV2.PAUSE, b(R.color.cat_accessory_green_default));
    }

    public void e() {
        setBackgroundDrawable(this.c ? this.a : this.b);
    }

    public Drawable a(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        uvv uvv = new uvv(context, spotifyIconV2, (float) a(R.dimen.play_icon_size), (float) a(R.dimen.play_button_size), i, b(R.color.white));
        return uvv;
    }

    private int a(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    private int b(int i) {
        return fr.c(getContext(), i);
    }
}
