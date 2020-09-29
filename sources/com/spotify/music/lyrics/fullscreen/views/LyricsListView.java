package com.spotify.music.lyrics.fullscreen.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class LyricsListView extends ListView {
    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    public LyricsListView(Context context) {
        super(context);
    }

    public LyricsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LyricsListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
