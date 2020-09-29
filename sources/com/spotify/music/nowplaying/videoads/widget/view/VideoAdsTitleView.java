package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.mobile.android.spotlets.player.views.MarqueeTextView;

public class VideoAdsTitleView extends MarqueeTextView implements tib {
    public VideoAdsTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uuu.a(context, this, 2132017493);
    }

    public VideoAdsTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoAdsTitleView(Context context) {
        this(context, null);
    }

    public final void a(int i) {
        setText(i);
    }
}
