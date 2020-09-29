package com.spotify.music.behindthelyrics.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class FlippedProgressBar extends ProgressBar {
    public FlippedProgressBar(Context context) {
        super(context);
    }

    public FlippedProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FlippedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FlippedProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        canvas.scale(-1.0f, 1.0f, ((float) getWidth()) * 0.5f, ((float) getHeight()) * 0.5f);
        super.onDraw(canvas);
    }
}
