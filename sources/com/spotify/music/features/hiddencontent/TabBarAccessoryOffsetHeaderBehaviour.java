package com.spotify.music.features.hiddencontent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.android.glue.patterns.header.behavior.GlueScrollingViewBehavior;

@Deprecated
public class TabBarAccessoryOffsetHeaderBehaviour extends GlueScrollingViewBehavior {
    public TabBarAccessoryOffsetHeaderBehaviour() {
    }

    public TabBarAccessoryOffsetHeaderBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int b() {
        View view = this.a;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }
}
