package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.mobile.android.spotlets.player.views.MarqueeTextView;

public class VideoAdsInfoView extends MarqueeTextView implements thw {
    public VideoAdsInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uuu.a(context, this, 2132017494);
    }

    public VideoAdsInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoAdsInfoView(Context context) {
        this(context, null);
    }

    public final void a(String str) {
        setText(str);
    }

    public final void a(boolean z) {
        setVisibility(z ? 0 : 4);
    }
}
