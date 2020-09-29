package com.spotify.music.newplaying.scroll.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class FullScreenLayout extends FrameLayout {
    public FullScreenLayout(Context context) {
        super(context);
    }

    public FullScreenLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FullScreenLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FullScreenLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    private static int a(int i, int i2) {
        return MeasureSpec.getMode(i) == 0 ? MeasureSpec.makeMeasureSpec(i2, 1073741824) : MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 1073741824);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int height = getRootView().getHeight();
        super.onMeasure(a(i, Math.max(getRootView().getWidth(), MeasureSpec.getSize(i))), a(i2, Math.max(height, MeasureSpec.getSize(i2))));
    }
}
