package com.spotify.music.features.queue.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class AddRemoveQueueView extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public AddRemoveQueueView(Context context) {
        this(context, null, 0);
    }

    public AddRemoveQueueView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddRemoveQueueView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.queue_add_remove_view, this, true);
        this.a = (TextView) findViewById(R.id.remove_from_queue);
        this.b = (TextView) findViewById(R.id.add_to_queue);
    }
}
