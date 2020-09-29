package com.moat.analytics.mobile;

import android.view.View;
import com.google.android.exoplayer.ExoPlayer;
import java.util.Map;

public interface ExoVideoTracker {
    void changeTargetView(View view);

    void dispatchEvent(MoatAdEvent moatAdEvent);

    @Deprecated
    void dispatchEvent(Map<String, Object> map);

    void setDebug(boolean z);

    boolean trackVideoAd(Map<String, String> map, ExoPlayer exoPlayer, View view);
}
