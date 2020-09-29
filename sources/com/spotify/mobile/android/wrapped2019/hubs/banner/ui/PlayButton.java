package com.spotify.mobile.android.wrapped2019.hubs.banner.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.music.R;

public class PlayButton extends StateListAnimatorImageButton {
    private static final int[] a = {R.attr.state_player_playing};
    private static final int[] b = {R.attr.state_player_pausing};

    public PlayButton(Context context) {
        super(context);
        e();
    }

    public PlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public PlayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    public int[] onCreateDrawableState(int i) {
        return mergeDrawableStates(super.onCreateDrawableState(i + 1), a);
    }

    private void e() {
        setContentDescription(getContext().getString(R.string.content_description_play_button));
    }
}
