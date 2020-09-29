package com.spotify.mobile.android.util.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.music.R;

public class CollectionEntityListLayout extends FrameLayout {
    public final LinearLayout a;

    public CollectionEntityListLayout(Context context) {
        this(context, null);
    }

    public CollectionEntityListLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollectionEntityListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.collection_entity_common_list_layout, this, true);
        this.a = (LinearLayout) findViewById(R.id.landscape_list_container);
    }

    public final void a(View view) {
        LayoutParams layoutParams = new LayoutParams(0, -1);
        layoutParams.weight = (float) getResources().getInteger(R.integer.list_container_weight);
        this.a.addView(view, layoutParams);
    }
}
