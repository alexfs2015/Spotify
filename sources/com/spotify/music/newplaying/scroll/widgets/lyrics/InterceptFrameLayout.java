package com.spotify.music.newplaying.scroll.widgets.lyrics;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class InterceptFrameLayout extends FrameLayout {
    public InterceptFrameLayout(Context context) {
        super(context);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
