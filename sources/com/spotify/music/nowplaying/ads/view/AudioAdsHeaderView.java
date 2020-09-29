package com.spotify.music.nowplaying.ads.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class AudioAdsHeaderView extends FrameLayout implements thl {
    private TextView a;
    private TextView b;

    public AudioAdsHeaderView(Context context) {
        this(context, null);
    }

    public AudioAdsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioAdsHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.audio_ads_header, this);
        this.a = (TextView) findViewById(R.id.audio_ads_title);
        this.b = (TextView) findViewById(R.id.audio_ads_advertiser);
    }

    public final void a(int i) {
        this.a.setText(i);
    }

    public final void a(String str) {
        this.b.setText(str);
    }
}
