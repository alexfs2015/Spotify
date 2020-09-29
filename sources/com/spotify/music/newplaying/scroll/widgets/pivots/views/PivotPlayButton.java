package com.spotify.music.newplaying.scroll.widgets.pivots.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public final class PivotPlayButton extends AppCompatImageButton {
    public PivotPlayButton(Context context) {
        this(context, null);
    }

    public PivotPlayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotPlayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uva a = ury.a(getContext(), 32, 0, 0.45f);
        a.a(fr.c(getContext(), R.color.cat_white_40));
        setBackgroundDrawable(null);
        setImageDrawable(a);
        setScaleType(ScaleType.FIT_CENTER);
        setContentDescription(getResources().getString(R.string.player_content_description_play));
    }
}
