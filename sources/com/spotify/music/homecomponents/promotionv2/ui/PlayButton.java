package com.spotify.music.homecomponents.promotionv2.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.music.R;

public class PlayButton extends StateListAnimatorImageButton {
    private static final int[] a = {R.attr.state_player_playing};
    private static final int[] b = {R.attr.state_player_pausing};
    private boolean c;

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
        return mergeDrawableStates(super.onCreateDrawableState(i + 1), this.c ? b : a);
    }

    public final void a(boolean z) {
        this.c = z;
        e();
        refreshDrawableState();
    }

    private void e() {
        if (this.c) {
            setContentDescription(getContext().getString(R.string.content_description_pause_button));
        } else {
            setContentDescription(getContext().getString(R.string.content_description_play_button));
        }
    }
}
