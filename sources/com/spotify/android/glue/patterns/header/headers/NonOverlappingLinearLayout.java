package com.spotify.android.glue.patterns.header.headers;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class NonOverlappingLinearLayout extends LinearLayout {
    public boolean hasOverlappingRendering() {
        return false;
    }

    public NonOverlappingLinearLayout(Context context) {
        super(context);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
