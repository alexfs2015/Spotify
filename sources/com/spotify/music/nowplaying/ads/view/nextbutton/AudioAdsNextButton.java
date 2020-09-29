package com.spotify.music.nowplaying.ads.view.nextbutton;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;

public class AudioAdsNextButton extends NextButton {
    private int a;

    public AudioAdsNextButton(Context context) {
        super(context);
        e();
    }

    public AudioAdsNextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public AudioAdsNextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        this.a = getResources().getInteger(17694721);
    }

    public final void a(boolean z) {
        if (!z) {
            setVisibility(8);
        } else if (getVisibility() != 0) {
            setAlpha(0.0f);
            setVisibility(8);
            animate().alpha(1.0f).setDuration((long) this.a).setListener(null);
        }
    }
}
