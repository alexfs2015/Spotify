package com.spotify.music.newplaying.scroll.widgets.pivots.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class PivotView extends RelativeLayout {
    /* access modifiers changed from: 0000 */
    public TextView a;
    /* access modifiers changed from: 0000 */
    public TextView b;
    ImageView c;
    PivotPlayButton d;

    public PivotView(Context context) {
        this(context, null);
    }

    public PivotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.pivot_view, this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.pivot_title);
        this.b = (TextView) findViewById(R.id.pivot_subtitle);
        this.c = (ImageView) findViewById(R.id.pivot_icon);
        this.d = (PivotPlayButton) findViewById(R.id.play);
    }
}
