package com.spotify.music.features.feed.view.custom;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

public class FeedPlayButton extends StateListAnimatorImageButton {
    private final int a;
    private final int b;

    public FeedPlayButton(Context context) {
        this(context, null);
    }

    public FeedPlayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedPlayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(R.dimen.play_pause_icon_size);
        this.b = resources.getDimensionPixelSize(R.dimen.play_pause_circle_size);
        int i2 = this.b;
        setLayoutParams(new LayoutParams(i2, i2));
        setBackground(a(getContext(), R.color.gray_70));
    }

    public Drawable a(Context context, int i) {
        vhl vhl = new vhl(context, SpotifyIconV2.PLAY, (float) this.a, (float) this.b, i, -1);
        return vhl;
    }
}
