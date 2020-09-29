package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.R;

public class VideoAdsRendererView extends ConstraintLayout {
    public VideoSurfaceView b;

    public VideoAdsRendererView(Context context) {
        this(context, null);
    }

    public VideoAdsRendererView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoAdsRendererView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.video_ads_renderer, this);
        this.b = (VideoSurfaceView) findViewById(R.id.video_surface_view);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
