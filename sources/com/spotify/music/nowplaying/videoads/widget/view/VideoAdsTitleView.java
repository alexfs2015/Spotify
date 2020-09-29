package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.mobile.android.spotlets.player.views.MarqueeTextView;

public class VideoAdsTitleView extends MarqueeTextView implements tst {
    public VideoAdsTitleView(Context context) {
        this(context, null);
    }

    public VideoAdsTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoAdsTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vgl.a(context, this, 2132017495);
    }

    public final void a(int i) {
        setText(i);
    }
}
