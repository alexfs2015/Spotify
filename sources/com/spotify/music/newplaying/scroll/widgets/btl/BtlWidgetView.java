package com.spotify.music.newplaying.scroll.widgets.btl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.spotify.music.R;
import com.spotify.music.behindthelyrics.view.BehindTheLyricsCard;

public class BtlWidgetView extends BehindTheLyricsCard implements urx {
    public BtlWidgetView(Context context) {
        this(context, null);
    }

    public BtlWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BtlWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getResources().getDimension(R.dimen.std_8dp);
    }

    public final void a(int i) {
        ((GradientDrawable) getBackground()).setColor(i);
    }
}
