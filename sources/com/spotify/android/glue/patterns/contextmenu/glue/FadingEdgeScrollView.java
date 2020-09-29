package com.spotify.android.glue.patterns.contextmenu.glue;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class FadingEdgeScrollView extends ScrollView {
    public FadingEdgeScrollView(Context context) {
        super(context);
    }

    public FadingEdgeScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FadingEdgeScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getSolidColor() {
        return -16777216;
    }
}
